package com.amazon.SellingPartnerAPIAA;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.okhttp.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

public class LWAClient {
    private static final String ACCESS_TOKEN_KEY = "access_token";
    private static final String ACCESS_TOKEN_EXPIRES_IN = "expires_in";
    private static final MediaType JSON_MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");
    @Getter
    private String endpoint;
    @Setter(AccessLevel.PACKAGE)
    private OkHttpClient okHttpClient;
    private LWAAccessTokenCache lwaAccessTokenCache;

    LWAClient(String endpoint) {
        okHttpClient = new OkHttpClient();
        this.endpoint = endpoint;
    }

    /**
     * Sets cache to store access token until token is expired
     */
    public void setLWAAccessTokenCache(LWAAccessTokenCache tokenCache) {
        this.lwaAccessTokenCache = tokenCache;
    }

    String getAccessToken(LWAAccessTokenRequestMeta lwaAccessTokenRequestMeta) {
        return getAccessToken(false, lwaAccessTokenRequestMeta);
    }

    public static boolean RDT_ENBALE = true; // enable=false, then close RDT support

    //add at 2021/9/8. support restrictedDataToken
    String getAccessToken(boolean isRDT, LWAAccessTokenRequestMeta lwaAccessTokenRequestMeta) {
        if (RDT_ENBALE && isRDT) {
            if (lwaAccessTokenCache == null) {
                throw new RuntimeException("This api method support RDT. so must use token cache");
            }
            /**
             * Use a prefix to save RDT, do not overwrite normal token.
             * Because RDT only use by support RDT API method. Normal API method use normal token, and can not use RDT.
             */
            String accessToken = lwaAccessTokenCache.get("RDT_" + lwaAccessTokenRequestMeta.getRefreshToken());
            if (accessToken == null) {
                throw new RuntimeException("NOT FOUND RDT. please put RDT to cache before invoke API.");
            }
            return accessToken;
        } else {
            String accessToken = null;
            if (lwaAccessTokenCache != null) {
                accessToken = lwaAccessTokenCache.get(lwaAccessTokenRequestMeta);
            }
            if (accessToken == null) {
                accessToken = getAccessTokenFromEndpoint(lwaAccessTokenRequestMeta);
            }
            return accessToken;
        }
    }

    String getAccessTokenFromEndpoint(LWAAccessTokenRequestMeta lwaAccessTokenRequestMeta) {
        RequestBody requestBody = RequestBody.create(JSON_MEDIA_TYPE, new Gson().toJson(lwaAccessTokenRequestMeta));
        Request accessTokenRequest = new Request.Builder().url(endpoint).post(requestBody).build();
        String accessToken;
        try {
            Response response = okHttpClient.newCall(accessTokenRequest).execute();
            if (!response.isSuccessful()) {
                throw new IOException("Unsuccessful LWA token exchange");
            }
            JsonObject responseJson = new JsonParser().parse(response.body().string()).getAsJsonObject();
            accessToken = responseJson.get(ACCESS_TOKEN_KEY).getAsString();
            if (lwaAccessTokenCache != null) {
                long timeToTokenexpiry = responseJson.get(ACCESS_TOKEN_EXPIRES_IN).getAsLong();
                lwaAccessTokenCache.put(lwaAccessTokenRequestMeta, accessToken, timeToTokenexpiry);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error getting LWA Access Token", e);
        }
        return accessToken;
    }
}
