package com.amazon.spapi.api;

import com.amazon.SellingPartnerAPIAA.*;
import com.amazon.spapi.client.*;
import com.amazon.spapi.models.solicitations.CreateProductReviewAndSellerFeedbackSolicitationResponse;
import com.amazon.spapi.models.solicitations.GetSolicitationActionsForOrderResponse;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolicitationsApi {
    private ApiClient apiClient;

    SolicitationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SolicitationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createProductReviewAndSellerFeedbackSolicitation
     *
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which a solicitation is sent. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createProductReviewAndSellerFeedbackSolicitationCall(String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/solicitations/v1/orders/{amazonOrderId}/solicitations/productReviewAndSellerFeedback"
                .replaceAll("\\{" + "amazonOrderId" + "\\}", apiClient.escapeString(amazonOrderId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }
        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createProductReviewAndSellerFeedbackSolicitationValidateBeforeCall(String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling createProductReviewAndSellerFeedbackSolicitation(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling createProductReviewAndSellerFeedbackSolicitation(Async)");
        }
        com.squareup.okhttp.Call call = createProductReviewAndSellerFeedbackSolicitationCall(amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Sends a solicitation to a buyer asking for seller feedback and a product review for the specified order. Send only one productReviewAndSellerFeedback or free form proactive message per order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a solicitation is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return CreateProductReviewAndSellerFeedbackSolicitationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateProductReviewAndSellerFeedbackSolicitationResponse createProductReviewAndSellerFeedbackSolicitation(String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<CreateProductReviewAndSellerFeedbackSolicitationResponse> resp = createProductReviewAndSellerFeedbackSolicitationWithHttpInfo(amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Sends a solicitation to a buyer asking for seller feedback and a product review for the specified order. Send only one productReviewAndSellerFeedback or free form proactive message per order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a solicitation is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;CreateProductReviewAndSellerFeedbackSolicitationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateProductReviewAndSellerFeedbackSolicitationResponse> createProductReviewAndSellerFeedbackSolicitationWithHttpInfo(String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = createProductReviewAndSellerFeedbackSolicitationValidateBeforeCall(amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<CreateProductReviewAndSellerFeedbackSolicitationResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Sends a solicitation to a buyer asking for seller feedback and a product review for the specified order. Send only one productReviewAndSellerFeedback or free form proactive message per order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a solicitation is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createProductReviewAndSellerFeedbackSolicitationAsync(String amazonOrderId, List<String> marketplaceIds, final ApiCallback<CreateProductReviewAndSellerFeedbackSolicitationResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        com.squareup.okhttp.Call call = createProductReviewAndSellerFeedbackSolicitationValidateBeforeCall(amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateProductReviewAndSellerFeedbackSolicitationResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getSolicitationActionsForOrder
     *
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which you want a list of available solicitation types. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSolicitationActionsForOrderCall(String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/solicitations/v1/orders/{amazonOrderId}"
                .replaceAll("\\{" + "amazonOrderId" + "\\}", apiClient.escapeString(amazonOrderId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }
        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSolicitationActionsForOrderValidateBeforeCall(String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling getSolicitationActionsForOrder(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling getSolicitationActionsForOrder(Async)");
        }
        com.squareup.okhttp.Call call = getSolicitationActionsForOrderCall(amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a list of solicitation types that are available for an order that you specify. A solicitation type is represented by an actions object, which contains a path and query parameter(s). You can use the path and parameter(s) to call an operation that sends a solicitation. Currently only the productReviewAndSellerFeedbackSolicitation solicitation type is available.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which you want a list of available solicitation types. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return GetSolicitationActionsForOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetSolicitationActionsForOrderResponse getSolicitationActionsForOrder(String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<GetSolicitationActionsForOrderResponse> resp = getSolicitationActionsForOrderWithHttpInfo(amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Returns a list of solicitation types that are available for an order that you specify. A solicitation type is represented by an actions object, which contains a path and query parameter(s). You can use the path and parameter(s) to call an operation that sends a solicitation. Currently only the productReviewAndSellerFeedbackSolicitation solicitation type is available.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which you want a list of available solicitation types. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;GetSolicitationActionsForOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetSolicitationActionsForOrderResponse> getSolicitationActionsForOrderWithHttpInfo(String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = getSolicitationActionsForOrderValidateBeforeCall(amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<GetSolicitationActionsForOrderResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a list of solicitation types that are available for an order that you specify. A solicitation type is represented by an actions object, which contains a path and query parameter(s). You can use the path and parameter(s) to call an operation that sends a solicitation. Currently only the productReviewAndSellerFeedbackSolicitation solicitation type is available.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which you want a list of available solicitation types. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSolicitationActionsForOrderAsync(String amazonOrderId, List<String> marketplaceIds, final ApiCallback<GetSolicitationActionsForOrderResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        com.squareup.okhttp.Call call = getSolicitationActionsForOrderValidateBeforeCall(amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetSolicitationActionsForOrderResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    public static class Builder {
        private AWSAuthenticationCredentials awsAuthenticationCredentials;
        private LWAAuthorizationCredentials lwaAuthorizationCredentials;
        private String endpoint;
        private LWAAccessTokenCache lwaAccessTokenCache;
        private Boolean disableAccessTokenCache = false;
        private AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider;
        private RateLimitConfiguration rateLimitConfiguration;

        public Builder awsAuthenticationCredentials(AWSAuthenticationCredentials awsAuthenticationCredentials) {
            this.awsAuthenticationCredentials = awsAuthenticationCredentials;
            return this;
        }

        public Builder lwaAuthorizationCredentials(LWAAuthorizationCredentials lwaAuthorizationCredentials) {
            this.lwaAuthorizationCredentials = lwaAuthorizationCredentials;
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder lwaAccessTokenCache(LWAAccessTokenCache lwaAccessTokenCache) {
            this.lwaAccessTokenCache = lwaAccessTokenCache;
            return this;
        }

        public Builder disableAccessTokenCache() {
            this.disableAccessTokenCache = true;
            return this;
        }

        public Builder awsAuthenticationCredentialsProvider(AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider) {
            this.awsAuthenticationCredentialsProvider = awsAuthenticationCredentialsProvider;
            return this;
        }

        public Builder rateLimitConfigurationOnRequests(RateLimitConfiguration rateLimitConfiguration) {
            this.rateLimitConfiguration = rateLimitConfiguration;
            return this;
        }

        public Builder disableRateLimitOnRequests() {
            this.rateLimitConfiguration = null;
            return this;
        }

        public SolicitationsApi build() {
            if (awsAuthenticationCredentials == null) {
                throw new RuntimeException("AWSAuthenticationCredentials not set");
            }
            if (lwaAuthorizationCredentials == null) {
                throw new RuntimeException("LWAAuthorizationCredentials not set");
            }
            if (StringUtil.isEmpty(endpoint)) {
                throw new RuntimeException("Endpoint not set");
            }
            AWSSigV4Signer awsSigV4Signer;
            if (awsAuthenticationCredentialsProvider == null) {
                awsSigV4Signer = new AWSSigV4Signer(awsAuthenticationCredentials);
            } else {
                awsSigV4Signer = new AWSSigV4Signer(awsAuthenticationCredentials, awsAuthenticationCredentialsProvider);
            }
            LWAAuthorizationSigner lwaAuthorizationSigner = null;
            if (disableAccessTokenCache) {
                lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials);
            } else {
                if (lwaAccessTokenCache == null) {
                    lwaAccessTokenCache = new LWAAccessTokenCacheImpl();
                }
                lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials, lwaAccessTokenCache);
            }
            return new SolicitationsApi(new ApiClient()
                    .setAWSSigV4Signer(awsSigV4Signer)
                    .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                    .setBasePath(endpoint)
                    .setRateLimiter(rateLimitConfiguration));
        }
    }
}
