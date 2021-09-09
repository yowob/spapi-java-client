package com.amazon.spapi.api;

import com.amazon.SellingPartnerAPIAA.*;
import com.amazon.spapi.client.*;
import com.amazon.spapi.models.messaging.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagingApi {
    private ApiClient apiClient;

    MessagingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for confirmCustomizationDetails
     *
     * @param body                    (required)
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call confirmCustomizationDetailsCall(CreateConfirmCustomizationDetailsRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/messaging/v1/orders/{amazonOrderId}/messages/confirmCustomizationDetails"
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
                "application/json"
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
    private com.squareup.okhttp.Call confirmCustomizationDetailsValidateBeforeCall(CreateConfirmCustomizationDetailsRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling confirmCustomizationDetails(Async)");
        }
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling confirmCustomizationDetails(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling confirmCustomizationDetails(Async)");
        }
        com.squareup.okhttp.Call call = confirmCustomizationDetailsCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Sends a message asking a buyer to provide or verify customization details such as name spelling, images, initials, etc.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return CreateConfirmCustomizationDetailsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateConfirmCustomizationDetailsResponse confirmCustomizationDetails(CreateConfirmCustomizationDetailsRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<CreateConfirmCustomizationDetailsResponse> resp = confirmCustomizationDetailsWithHttpInfo(body, amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Sends a message asking a buyer to provide or verify customization details such as name spelling, images, initials, etc.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;CreateConfirmCustomizationDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateConfirmCustomizationDetailsResponse> confirmCustomizationDetailsWithHttpInfo(CreateConfirmCustomizationDetailsRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = confirmCustomizationDetailsValidateBeforeCall(body, amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<CreateConfirmCustomizationDetailsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Sends a message asking a buyer to provide or verify customization details such as name spelling, images, initials, etc.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call confirmCustomizationDetailsAsync(CreateConfirmCustomizationDetailsRequest body, String amazonOrderId, List<String> marketplaceIds, final ApiCallback<CreateConfirmCustomizationDetailsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = confirmCustomizationDetailsValidateBeforeCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateConfirmCustomizationDetailsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createAmazonMotors
     *
     * @param body                    (required)
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAmazonMotorsCall(CreateAmazonMotorsRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/messaging/v1/orders/{amazonOrderId}/messages/amazonMotors"
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
                "application/json"
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
    private com.squareup.okhttp.Call createAmazonMotorsValidateBeforeCall(CreateAmazonMotorsRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createAmazonMotors(Async)");
        }
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling createAmazonMotors(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling createAmazonMotors(Async)");
        }
        com.squareup.okhttp.Call call = createAmazonMotorsCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Sends a message to a buyer to provide details about an Amazon Motors order. This message can only be sent by Amazon Motors sellers.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return CreateAmazonMotorsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateAmazonMotorsResponse createAmazonMotors(CreateAmazonMotorsRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<CreateAmazonMotorsResponse> resp = createAmazonMotorsWithHttpInfo(body, amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Sends a message to a buyer to provide details about an Amazon Motors order. This message can only be sent by Amazon Motors sellers.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;CreateAmazonMotorsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateAmazonMotorsResponse> createAmazonMotorsWithHttpInfo(CreateAmazonMotorsRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = createAmazonMotorsValidateBeforeCall(body, amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<CreateAmazonMotorsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Sends a message to a buyer to provide details about an Amazon Motors order. This message can only be sent by Amazon Motors sellers.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAmazonMotorsAsync(CreateAmazonMotorsRequest body, String amazonOrderId, List<String> marketplaceIds, final ApiCallback<CreateAmazonMotorsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createAmazonMotorsValidateBeforeCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateAmazonMotorsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createConfirmDeliveryDetails
     *
     * @param body                    (required)
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createConfirmDeliveryDetailsCall(CreateConfirmDeliveryDetailsRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/messaging/v1/orders/{amazonOrderId}/messages/confirmDeliveryDetails"
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
                "application/json"
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
    private com.squareup.okhttp.Call createConfirmDeliveryDetailsValidateBeforeCall(CreateConfirmDeliveryDetailsRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createConfirmDeliveryDetails(Async)");
        }
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling createConfirmDeliveryDetails(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling createConfirmDeliveryDetails(Async)");
        }
        com.squareup.okhttp.Call call = createConfirmDeliveryDetailsCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Sends a message to a buyer to arrange a delivery or to confirm contact information for making a delivery.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return CreateConfirmDeliveryDetailsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateConfirmDeliveryDetailsResponse createConfirmDeliveryDetails(CreateConfirmDeliveryDetailsRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<CreateConfirmDeliveryDetailsResponse> resp = createConfirmDeliveryDetailsWithHttpInfo(body, amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Sends a message to a buyer to arrange a delivery or to confirm contact information for making a delivery.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;CreateConfirmDeliveryDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateConfirmDeliveryDetailsResponse> createConfirmDeliveryDetailsWithHttpInfo(CreateConfirmDeliveryDetailsRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = createConfirmDeliveryDetailsValidateBeforeCall(body, amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<CreateConfirmDeliveryDetailsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Sends a message to a buyer to arrange a delivery or to confirm contact information for making a delivery.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createConfirmDeliveryDetailsAsync(CreateConfirmDeliveryDetailsRequest body, String amazonOrderId, List<String> marketplaceIds, final ApiCallback<CreateConfirmDeliveryDetailsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createConfirmDeliveryDetailsValidateBeforeCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateConfirmDeliveryDetailsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createConfirmOrderDetails
     *
     * @param body                    (required)
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createConfirmOrderDetailsCall(CreateConfirmOrderDetailsRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/messaging/v1/orders/{amazonOrderId}/messages/confirmOrderDetails"
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
                "application/json"
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
    private com.squareup.okhttp.Call createConfirmOrderDetailsValidateBeforeCall(CreateConfirmOrderDetailsRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createConfirmOrderDetails(Async)");
        }
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling createConfirmOrderDetails(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling createConfirmOrderDetails(Async)");
        }
        com.squareup.okhttp.Call call = createConfirmOrderDetailsCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Sends a message to ask a buyer an order-related question prior to shipping their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return CreateConfirmOrderDetailsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateConfirmOrderDetailsResponse createConfirmOrderDetails(CreateConfirmOrderDetailsRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<CreateConfirmOrderDetailsResponse> resp = createConfirmOrderDetailsWithHttpInfo(body, amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Sends a message to ask a buyer an order-related question prior to shipping their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;CreateConfirmOrderDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateConfirmOrderDetailsResponse> createConfirmOrderDetailsWithHttpInfo(CreateConfirmOrderDetailsRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = createConfirmOrderDetailsValidateBeforeCall(body, amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<CreateConfirmOrderDetailsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Sends a message to ask a buyer an order-related question prior to shipping their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createConfirmOrderDetailsAsync(CreateConfirmOrderDetailsRequest body, String amazonOrderId, List<String> marketplaceIds, final ApiCallback<CreateConfirmOrderDetailsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createConfirmOrderDetailsValidateBeforeCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateConfirmOrderDetailsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createConfirmServiceDetails
     *
     * @param body                    (required)
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createConfirmServiceDetailsCall(CreateConfirmServiceDetailsRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/messaging/v1/orders/{amazonOrderId}/messages/confirmServiceDetails"
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
                "application/json"
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
    private com.squareup.okhttp.Call createConfirmServiceDetailsValidateBeforeCall(CreateConfirmServiceDetailsRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createConfirmServiceDetails(Async)");
        }
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling createConfirmServiceDetails(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling createConfirmServiceDetails(Async)");
        }
        com.squareup.okhttp.Call call = createConfirmServiceDetailsCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Sends a message to contact a Home Service customer to arrange a service call or to gather information prior to a service call.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return CreateConfirmServiceDetailsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateConfirmServiceDetailsResponse createConfirmServiceDetails(CreateConfirmServiceDetailsRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<CreateConfirmServiceDetailsResponse> resp = createConfirmServiceDetailsWithHttpInfo(body, amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Sends a message to contact a Home Service customer to arrange a service call or to gather information prior to a service call.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;CreateConfirmServiceDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateConfirmServiceDetailsResponse> createConfirmServiceDetailsWithHttpInfo(CreateConfirmServiceDetailsRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = createConfirmServiceDetailsValidateBeforeCall(body, amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<CreateConfirmServiceDetailsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Sends a message to contact a Home Service customer to arrange a service call or to gather information prior to a service call.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createConfirmServiceDetailsAsync(CreateConfirmServiceDetailsRequest body, String amazonOrderId, List<String> marketplaceIds, final ApiCallback<CreateConfirmServiceDetailsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createConfirmServiceDetailsValidateBeforeCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateConfirmServiceDetailsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createDigitalAccessKey
     *
     * @param body                    (required)
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDigitalAccessKeyCall(CreateDigitalAccessKeyRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/messaging/v1/orders/{amazonOrderId}/messages/digitalAccessKey"
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
                "application/json"
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
    private com.squareup.okhttp.Call createDigitalAccessKeyValidateBeforeCall(CreateDigitalAccessKeyRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createDigitalAccessKey(Async)");
        }
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling createDigitalAccessKey(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling createDigitalAccessKey(Async)");
        }
        com.squareup.okhttp.Call call = createDigitalAccessKeyCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Sends a message to a buyer to share a digital access key needed to utilize digital content in their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return CreateDigitalAccessKeyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateDigitalAccessKeyResponse createDigitalAccessKey(CreateDigitalAccessKeyRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<CreateDigitalAccessKeyResponse> resp = createDigitalAccessKeyWithHttpInfo(body, amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Sends a message to a buyer to share a digital access key needed to utilize digital content in their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;CreateDigitalAccessKeyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateDigitalAccessKeyResponse> createDigitalAccessKeyWithHttpInfo(CreateDigitalAccessKeyRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = createDigitalAccessKeyValidateBeforeCall(body, amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<CreateDigitalAccessKeyResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Sends a message to a buyer to share a digital access key needed to utilize digital content in their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDigitalAccessKeyAsync(CreateDigitalAccessKeyRequest body, String amazonOrderId, List<String> marketplaceIds, final ApiCallback<CreateDigitalAccessKeyResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createDigitalAccessKeyValidateBeforeCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateDigitalAccessKeyResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createLegalDisclosure
     *
     * @param body                    (required)
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createLegalDisclosureCall(CreateLegalDisclosureRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure"
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
                "application/json"
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
    private com.squareup.okhttp.Call createLegalDisclosureValidateBeforeCall(CreateLegalDisclosureRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createLegalDisclosure(Async)");
        }
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling createLegalDisclosure(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling createLegalDisclosure(Async)");
        }
        com.squareup.okhttp.Call call = createLegalDisclosureCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Sends a critical message that contains documents that a seller is legally obligated to provide to the buyer. This message should only be used to deliver documents that are required by law.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return CreateLegalDisclosureResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateLegalDisclosureResponse createLegalDisclosure(CreateLegalDisclosureRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<CreateLegalDisclosureResponse> resp = createLegalDisclosureWithHttpInfo(body, amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Sends a critical message that contains documents that a seller is legally obligated to provide to the buyer. This message should only be used to deliver documents that are required by law.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;CreateLegalDisclosureResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateLegalDisclosureResponse> createLegalDisclosureWithHttpInfo(CreateLegalDisclosureRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = createLegalDisclosureValidateBeforeCall(body, amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<CreateLegalDisclosureResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Sends a critical message that contains documents that a seller is legally obligated to provide to the buyer. This message should only be used to deliver documents that are required by law.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createLegalDisclosureAsync(CreateLegalDisclosureRequest body, String amazonOrderId, List<String> marketplaceIds, final ApiCallback<CreateLegalDisclosureResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createLegalDisclosureValidateBeforeCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateLegalDisclosureResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createNegativeFeedbackRemoval
     *
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createNegativeFeedbackRemovalCall(String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/messaging/v1/orders/{amazonOrderId}/messages/negativeFeedbackRemoval"
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
    private com.squareup.okhttp.Call createNegativeFeedbackRemovalValidateBeforeCall(String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling createNegativeFeedbackRemoval(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling createNegativeFeedbackRemoval(Async)");
        }
        com.squareup.okhttp.Call call = createNegativeFeedbackRemovalCall(amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Sends a non-critical message that asks a buyer to remove their negative feedback. This message should only be sent after the seller has resolved the buyer&#x27;s problem.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return CreateNegativeFeedbackRemovalResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateNegativeFeedbackRemovalResponse createNegativeFeedbackRemoval(String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<CreateNegativeFeedbackRemovalResponse> resp = createNegativeFeedbackRemovalWithHttpInfo(amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Sends a non-critical message that asks a buyer to remove their negative feedback. This message should only be sent after the seller has resolved the buyer&#x27;s problem.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;CreateNegativeFeedbackRemovalResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateNegativeFeedbackRemovalResponse> createNegativeFeedbackRemovalWithHttpInfo(String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = createNegativeFeedbackRemovalValidateBeforeCall(amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<CreateNegativeFeedbackRemovalResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Sends a non-critical message that asks a buyer to remove their negative feedback. This message should only be sent after the seller has resolved the buyer&#x27;s problem.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createNegativeFeedbackRemovalAsync(String amazonOrderId, List<String> marketplaceIds, final ApiCallback<CreateNegativeFeedbackRemovalResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createNegativeFeedbackRemovalValidateBeforeCall(amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateNegativeFeedbackRemovalResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createUnexpectedProblem
     *
     * @param body                    (required)
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createUnexpectedProblemCall(CreateUnexpectedProblemRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/messaging/v1/orders/{amazonOrderId}/messages/unexpectedProblem"
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
                "application/json"
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
    private com.squareup.okhttp.Call createUnexpectedProblemValidateBeforeCall(CreateUnexpectedProblemRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createUnexpectedProblem(Async)");
        }
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling createUnexpectedProblem(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling createUnexpectedProblem(Async)");
        }
        com.squareup.okhttp.Call call = createUnexpectedProblemCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Sends a critical message to a buyer that an unexpected problem was encountered affecting the completion of the order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return CreateUnexpectedProblemResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateUnexpectedProblemResponse createUnexpectedProblem(CreateUnexpectedProblemRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<CreateUnexpectedProblemResponse> resp = createUnexpectedProblemWithHttpInfo(body, amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Sends a critical message to a buyer that an unexpected problem was encountered affecting the completion of the order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;CreateUnexpectedProblemResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateUnexpectedProblemResponse> createUnexpectedProblemWithHttpInfo(CreateUnexpectedProblemRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = createUnexpectedProblemValidateBeforeCall(body, amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<CreateUnexpectedProblemResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Sends a critical message to a buyer that an unexpected problem was encountered affecting the completion of the order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createUnexpectedProblemAsync(CreateUnexpectedProblemRequest body, String amazonOrderId, List<String> marketplaceIds, final ApiCallback<CreateUnexpectedProblemResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createUnexpectedProblemValidateBeforeCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateUnexpectedProblemResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createWarranty
     *
     * @param body                    (required)
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createWarrantyCall(CreateWarrantyRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/messaging/v1/orders/{amazonOrderId}/messages/warranty"
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
                "application/json"
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
    private com.squareup.okhttp.Call createWarrantyValidateBeforeCall(CreateWarrantyRequest body, String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createWarranty(Async)");
        }
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling createWarranty(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling createWarranty(Async)");
        }
        com.squareup.okhttp.Call call = createWarrantyCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Sends a message to a buyer to provide details about warranty information on a purchase in their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return CreateWarrantyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateWarrantyResponse createWarranty(CreateWarrantyRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<CreateWarrantyResponse> resp = createWarrantyWithHttpInfo(body, amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Sends a message to a buyer to provide details about warranty information on a purchase in their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;CreateWarrantyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateWarrantyResponse> createWarrantyWithHttpInfo(CreateWarrantyRequest body, String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = createWarrantyValidateBeforeCall(body, amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<CreateWarrantyResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Sends a message to a buyer to provide details about warranty information on a purchase in their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body           (required)
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createWarrantyAsync(CreateWarrantyRequest body, String amazonOrderId, List<String> marketplaceIds, final ApiCallback<CreateWarrantyResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createWarrantyValidateBeforeCall(body, amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateWarrantyResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getAttributes
     *
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAttributesCall(String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/messaging/v1/orders/{amazonOrderId}/attributes"
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
    private com.squareup.okhttp.Call getAttributesValidateBeforeCall(String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling getAttributes(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling getAttributes(Async)");
        }
        com.squareup.okhttp.Call call = getAttributesCall(amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a response containing attributes related to an order. This includes buyer preferences.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return GetAttributesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetAttributesResponse getAttributes(String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<GetAttributesResponse> resp = getAttributesWithHttpInfo(amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Returns a response containing attributes related to an order. This includes buyer preferences.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;GetAttributesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetAttributesResponse> getAttributesWithHttpInfo(String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = getAttributesValidateBeforeCall(amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<GetAttributesResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a response containing attributes related to an order. This includes buyer preferences.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which a message is sent. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAttributesAsync(String amazonOrderId, List<String> marketplaceIds, final ApiCallback<GetAttributesResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getAttributesValidateBeforeCall(amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetAttributesResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getMessagingActionsForOrder
     *
     * @param amazonOrderId           An Amazon order identifier. This specifies the order for which you want a list of available message types. (required)
     * @param marketplaceIds          A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMessagingActionsForOrderCall(String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/messaging/v1/orders/{amazonOrderId}"
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
    private com.squareup.okhttp.Call getMessagingActionsForOrderValidateBeforeCall(String amazonOrderId, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'amazonOrderId' is set
        if (amazonOrderId == null) {
            throw new ApiException("Missing the required parameter 'amazonOrderId' when calling getMessagingActionsForOrder(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling getMessagingActionsForOrder(Async)");
        }
        com.squareup.okhttp.Call call = getMessagingActionsForOrderCall(amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a list of message types that are available for an order that you specify. A message type is represented by an actions object, which contains a path and query parameter(s). You can use the path and parameter(s) to call an operation that sends a message.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which you want a list of available message types. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return GetMessagingActionsForOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetMessagingActionsForOrderResponse getMessagingActionsForOrder(String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        ApiResponse<GetMessagingActionsForOrderResponse> resp = getMessagingActionsForOrderWithHttpInfo(amazonOrderId, marketplaceIds);
        return resp.getData();
    }

    /**
     * Returns a list of message types that are available for an order that you specify. A message type is represented by an actions object, which contains a path and query parameter(s). You can use the path and parameter(s) to call an operation that sends a message.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which you want a list of available message types. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @return ApiResponse&lt;GetMessagingActionsForOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetMessagingActionsForOrderResponse> getMessagingActionsForOrderWithHttpInfo(String amazonOrderId, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = getMessagingActionsForOrderValidateBeforeCall(amazonOrderId, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<GetMessagingActionsForOrderResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a list of message types that are available for an order that you specify. A message type is represented by an actions object, which contains a path and query parameter(s). You can use the path and parameter(s) to call an operation that sends a message.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param amazonOrderId  An Amazon order identifier. This specifies the order for which you want a list of available message types. (required)
     * @param marketplaceIds A marketplace identifier. This specifies the marketplace in which the order was placed. Only one marketplace can be specified. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMessagingActionsForOrderAsync(String amazonOrderId, List<String> marketplaceIds, final ApiCallback<GetMessagingActionsForOrderResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getMessagingActionsForOrderValidateBeforeCall(amazonOrderId, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetMessagingActionsForOrderResponse>() {
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

        public MessagingApi build() {
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
            return new MessagingApi(new ApiClient()
                    .setAWSSigV4Signer(awsSigV4Signer)
                    .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                    .setBasePath(endpoint)
                    .setRateLimiter(rateLimitConfiguration));
        }
    }
}
