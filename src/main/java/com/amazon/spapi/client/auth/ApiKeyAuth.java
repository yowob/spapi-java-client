package com.amazon.spapi.client.auth;

import com.amazon.spapi.client.Pair;

import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ApiKeyAuth implements Authentication {
    private final String location;
    private final String paramName;
    private String apiKey;
    private String apiKeyPrefix;

    public ApiKeyAuth(String location, String paramName) {
        this.location = location;
        this.paramName = paramName;
    }

    public String getLocation() {
        return location;
    }

    public String getParamName() {
        return paramName;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKeyPrefix() {
        return apiKeyPrefix;
    }

    public void setApiKeyPrefix(String apiKeyPrefix) {
        this.apiKeyPrefix = apiKeyPrefix;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
        if (apiKey == null) {
            return;
        }
        String value;
        if (apiKeyPrefix != null) {
            value = apiKeyPrefix + " " + apiKey;
        } else {
            value = apiKey;
        }
        if ("query".equals(location)) {
            queryParams.add(new Pair(paramName, value));
        } else if ("header".equals(location)) {
            headerParams.put(paramName, value);
        }
    }
}
