package com.amazon.spapi.api;

import com.amazon.SellingPartnerAPIAA.*;
import com.amazon.spapi.client.*;
import com.amazon.spapi.models.fulfillmentoutbound.*;
import com.google.gson.reflect.TypeToken;
import org.threeten.bp.OffsetDateTime;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FbaOutboundApi {
    private ApiClient apiClient;

    FbaOutboundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FbaOutboundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cancelFulfillmentOrder
     *
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. (required)
     * @param progressListener         Progress listener
     * @param progressRequestListener  Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelFulfillmentOrderCall(String sellerFulfillmentOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/outbound/2020-07-01/fulfillmentOrders/{sellerFulfillmentOrderId}/cancel"
                .replaceAll("\\{" + "sellerFulfillmentOrderId" + "\\}", apiClient.escapeString(sellerFulfillmentOrderId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cancelFulfillmentOrderValidateBeforeCall(String sellerFulfillmentOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'sellerFulfillmentOrderId' is set
        if (sellerFulfillmentOrderId == null) {
            throw new ApiException("Missing the required parameter 'sellerFulfillmentOrderId' when calling cancelFulfillmentOrder(Async)");
        }
        com.squareup.okhttp.Call call = cancelFulfillmentOrderCall(sellerFulfillmentOrderId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Requests that Amazon stop attempting to fulfill the fulfillment order indicated by the specified order identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. (required)
     * @return CancelFulfillmentOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CancelFulfillmentOrderResponse cancelFulfillmentOrder(String sellerFulfillmentOrderId) throws ApiException {
        ApiResponse<CancelFulfillmentOrderResponse> resp = cancelFulfillmentOrderWithHttpInfo(sellerFulfillmentOrderId);
        return resp.getData();
    }

    /**
     * Requests that Amazon stop attempting to fulfill the fulfillment order indicated by the specified order identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. (required)
     * @return ApiResponse&lt;CancelFulfillmentOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CancelFulfillmentOrderResponse> cancelFulfillmentOrderWithHttpInfo(String sellerFulfillmentOrderId) throws ApiException {
        com.squareup.okhttp.Call call = cancelFulfillmentOrderValidateBeforeCall(sellerFulfillmentOrderId, null, null);
        Type localVarReturnType = new TypeToken<CancelFulfillmentOrderResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Requests that Amazon stop attempting to fulfill the fulfillment order indicated by the specified order identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. (required)
     * @param callback                 The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelFulfillmentOrderAsync(String sellerFulfillmentOrderId, final ApiCallback<CancelFulfillmentOrderResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = cancelFulfillmentOrderValidateBeforeCall(sellerFulfillmentOrderId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CancelFulfillmentOrderResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createFulfillmentOrder
     *
     * @param body                    (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createFulfillmentOrderCall(CreateFulfillmentOrderRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/fba/outbound/2020-07-01/fulfillmentOrders";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json"
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
    private com.squareup.okhttp.Call createFulfillmentOrderValidateBeforeCall(CreateFulfillmentOrderRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createFulfillmentOrder(Async)");
        }
        com.squareup.okhttp.Call call = createFulfillmentOrderCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Requests that Amazon ship items from the seller&#x27;s inventory in Amazon&#x27;s fulfillment network to a destination address.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body (required)
     * @return CreateFulfillmentOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateFulfillmentOrderResponse createFulfillmentOrder(CreateFulfillmentOrderRequest body) throws ApiException {
        ApiResponse<CreateFulfillmentOrderResponse> resp = createFulfillmentOrderWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Requests that Amazon ship items from the seller&#x27;s inventory in Amazon&#x27;s fulfillment network to a destination address.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body (required)
     * @return ApiResponse&lt;CreateFulfillmentOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateFulfillmentOrderResponse> createFulfillmentOrderWithHttpInfo(CreateFulfillmentOrderRequest body) throws ApiException {
        com.squareup.okhttp.Call call = createFulfillmentOrderValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CreateFulfillmentOrderResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Requests that Amazon ship items from the seller&#x27;s inventory in Amazon&#x27;s fulfillment network to a destination address.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body     (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createFulfillmentOrderAsync(CreateFulfillmentOrderRequest body, final ApiCallback<CreateFulfillmentOrderResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createFulfillmentOrderValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateFulfillmentOrderResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createFulfillmentReturn
     *
     * @param body                     (required)
     * @param sellerFulfillmentOrderId An identifier assigned by the seller to the fulfillment order at the time it was created. The seller uses their own records to find the correct SellerFulfillmentOrderId value based on the buyer&#x27;s request to return items. (required)
     * @param progressListener         Progress listener
     * @param progressRequestListener  Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createFulfillmentReturnCall(CreateFulfillmentReturnRequest body, String sellerFulfillmentOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/fba/outbound/2020-07-01/fulfillmentOrders/{sellerFulfillmentOrderId}/return"
                .replaceAll("\\{" + "sellerFulfillmentOrderId" + "\\}", apiClient.escapeString(sellerFulfillmentOrderId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json", "payload"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createFulfillmentReturnValidateBeforeCall(CreateFulfillmentReturnRequest body, String sellerFulfillmentOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createFulfillmentReturn(Async)");
        }
        // verify the required parameter 'sellerFulfillmentOrderId' is set
        if (sellerFulfillmentOrderId == null) {
            throw new ApiException("Missing the required parameter 'sellerFulfillmentOrderId' when calling createFulfillmentReturn(Async)");
        }
        com.squareup.okhttp.Call call = createFulfillmentReturnCall(body, sellerFulfillmentOrderId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Creates a fulfillment return.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body                     (required)
     * @param sellerFulfillmentOrderId An identifier assigned by the seller to the fulfillment order at the time it was created. The seller uses their own records to find the correct SellerFulfillmentOrderId value based on the buyer&#x27;s request to return items. (required)
     * @return CreateFulfillmentReturnResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateFulfillmentReturnResponse createFulfillmentReturn(CreateFulfillmentReturnRequest body, String sellerFulfillmentOrderId) throws ApiException {
        ApiResponse<CreateFulfillmentReturnResponse> resp = createFulfillmentReturnWithHttpInfo(body, sellerFulfillmentOrderId);
        return resp.getData();
    }

    /**
     * Creates a fulfillment return.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body                     (required)
     * @param sellerFulfillmentOrderId An identifier assigned by the seller to the fulfillment order at the time it was created. The seller uses their own records to find the correct SellerFulfillmentOrderId value based on the buyer&#x27;s request to return items. (required)
     * @return ApiResponse&lt;CreateFulfillmentReturnResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateFulfillmentReturnResponse> createFulfillmentReturnWithHttpInfo(CreateFulfillmentReturnRequest body, String sellerFulfillmentOrderId) throws ApiException {
        com.squareup.okhttp.Call call = createFulfillmentReturnValidateBeforeCall(body, sellerFulfillmentOrderId, null, null);
        Type localVarReturnType = new TypeToken<CreateFulfillmentReturnResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Creates a fulfillment return.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body                     (required)
     * @param sellerFulfillmentOrderId An identifier assigned by the seller to the fulfillment order at the time it was created. The seller uses their own records to find the correct SellerFulfillmentOrderId value based on the buyer&#x27;s request to return items. (required)
     * @param callback                 The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createFulfillmentReturnAsync(CreateFulfillmentReturnRequest body, String sellerFulfillmentOrderId, final ApiCallback<CreateFulfillmentReturnResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createFulfillmentReturnValidateBeforeCall(body, sellerFulfillmentOrderId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateFulfillmentReturnResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getFeatureInventory
     *
     * @param marketplaceId           The marketplace for which to return a list of the inventory that is eligible for the specified feature. (required)
     * @param featureName             The name of the feature for which to return a list of eligible inventory. (required)
     * @param nextToken               A string token returned in the response to your previous request that is used to return the next response page. A value of null will return the first page. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFeatureInventoryCall(String marketplaceId, String featureName, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/outbound/2020-07-01/features/inventory/{featureName}"
                .replaceAll("\\{" + "featureName" + "\\}", apiClient.escapeString(featureName.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
        if (nextToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("nextToken", nextToken));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json", "payload"
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
    private com.squareup.okhttp.Call getFeatureInventoryValidateBeforeCall(String marketplaceId, String featureName, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getFeatureInventory(Async)");
        }
        // verify the required parameter 'featureName' is set
        if (featureName == null) {
            throw new ApiException("Missing the required parameter 'featureName' when calling getFeatureInventory(Async)");
        }
        com.squareup.okhttp.Call call = getFeatureInventoryCall(marketplaceId, featureName, nextToken, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a list of inventory items that are eligible for the fulfillment feature you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The marketplace for which to return a list of the inventory that is eligible for the specified feature. (required)
     * @param featureName   The name of the feature for which to return a list of eligible inventory. (required)
     * @param nextToken     A string token returned in the response to your previous request that is used to return the next response page. A value of null will return the first page. (optional)
     * @return GetFeatureInventoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetFeatureInventoryResponse getFeatureInventory(String marketplaceId, String featureName, String nextToken) throws ApiException {
        ApiResponse<GetFeatureInventoryResponse> resp = getFeatureInventoryWithHttpInfo(marketplaceId, featureName, nextToken);
        return resp.getData();
    }

    /**
     * Returns a list of inventory items that are eligible for the fulfillment feature you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The marketplace for which to return a list of the inventory that is eligible for the specified feature. (required)
     * @param featureName   The name of the feature for which to return a list of eligible inventory. (required)
     * @param nextToken     A string token returned in the response to your previous request that is used to return the next response page. A value of null will return the first page. (optional)
     * @return ApiResponse&lt;GetFeatureInventoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetFeatureInventoryResponse> getFeatureInventoryWithHttpInfo(String marketplaceId, String featureName, String nextToken) throws ApiException {
        com.squareup.okhttp.Call call = getFeatureInventoryValidateBeforeCall(marketplaceId, featureName, nextToken, null, null);
        Type localVarReturnType = new TypeToken<GetFeatureInventoryResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a list of inventory items that are eligible for the fulfillment feature you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The marketplace for which to return a list of the inventory that is eligible for the specified feature. (required)
     * @param featureName   The name of the feature for which to return a list of eligible inventory. (required)
     * @param nextToken     A string token returned in the response to your previous request that is used to return the next response page. A value of null will return the first page. (optional)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFeatureInventoryAsync(String marketplaceId, String featureName, String nextToken, final ApiCallback<GetFeatureInventoryResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getFeatureInventoryValidateBeforeCall(marketplaceId, featureName, nextToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetFeatureInventoryResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getFeatureSKU
     *
     * @param marketplaceId           The marketplace for which to return the count. (required)
     * @param featureName             The name of the feature. (required)
     * @param sellerSku               Used to identify an item in the given marketplace. SellerSKU is qualified by the seller&#x27;s SellerId, which is included with every operation that you submit. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFeatureSKUCall(String marketplaceId, String featureName, String sellerSku, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/outbound/2020-07-01/features/inventory/{featureName}/{sellerSku}"
                .replaceAll("\\{" + "featureName" + "\\}", apiClient.escapeString(featureName.toString()))
                .replaceAll("\\{" + "sellerSku" + "\\}", apiClient.escapeString(sellerSku.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json", "payload"
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
    private com.squareup.okhttp.Call getFeatureSKUValidateBeforeCall(String marketplaceId, String featureName, String sellerSku, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getFeatureSKU(Async)");
        }
        // verify the required parameter 'featureName' is set
        if (featureName == null) {
            throw new ApiException("Missing the required parameter 'featureName' when calling getFeatureSKU(Async)");
        }
        // verify the required parameter 'sellerSku' is set
        if (sellerSku == null) {
            throw new ApiException("Missing the required parameter 'sellerSku' when calling getFeatureSKU(Async)");
        }
        com.squareup.okhttp.Call call = getFeatureSKUCall(marketplaceId, featureName, sellerSku, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns the number of items with the sellerSKU you specify that can have orders fulfilled using the specified feature. Note that if the sellerSKU isn&#x27;t eligible, the response will contain an empty skuInfo object.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The marketplace for which to return the count. (required)
     * @param featureName   The name of the feature. (required)
     * @param sellerSku     Used to identify an item in the given marketplace. SellerSKU is qualified by the seller&#x27;s SellerId, which is included with every operation that you submit. (required)
     * @return GetFeatureSkuResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetFeatureSkuResponse getFeatureSKU(String marketplaceId, String featureName, String sellerSku) throws ApiException {
        ApiResponse<GetFeatureSkuResponse> resp = getFeatureSKUWithHttpInfo(marketplaceId, featureName, sellerSku);
        return resp.getData();
    }

    /**
     * Returns the number of items with the sellerSKU you specify that can have orders fulfilled using the specified feature. Note that if the sellerSKU isn&#x27;t eligible, the response will contain an empty skuInfo object.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The marketplace for which to return the count. (required)
     * @param featureName   The name of the feature. (required)
     * @param sellerSku     Used to identify an item in the given marketplace. SellerSKU is qualified by the seller&#x27;s SellerId, which is included with every operation that you submit. (required)
     * @return ApiResponse&lt;GetFeatureSkuResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetFeatureSkuResponse> getFeatureSKUWithHttpInfo(String marketplaceId, String featureName, String sellerSku) throws ApiException {
        com.squareup.okhttp.Call call = getFeatureSKUValidateBeforeCall(marketplaceId, featureName, sellerSku, null, null);
        Type localVarReturnType = new TypeToken<GetFeatureSkuResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns the number of items with the sellerSKU you specify that can have orders fulfilled using the specified feature. Note that if the sellerSKU isn&#x27;t eligible, the response will contain an empty skuInfo object.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The marketplace for which to return the count. (required)
     * @param featureName   The name of the feature. (required)
     * @param sellerSku     Used to identify an item in the given marketplace. SellerSKU is qualified by the seller&#x27;s SellerId, which is included with every operation that you submit. (required)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFeatureSKUAsync(String marketplaceId, String featureName, String sellerSku, final ApiCallback<GetFeatureSkuResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getFeatureSKUValidateBeforeCall(marketplaceId, featureName, sellerSku, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetFeatureSkuResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getFeatures
     *
     * @param marketplaceId           The marketplace for which to return the list of features. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFeaturesCall(String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/outbound/2020-07-01/features";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json", "payload"
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
    private com.squareup.okhttp.Call getFeaturesValidateBeforeCall(String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getFeatures(Async)");
        }
        com.squareup.okhttp.Call call = getFeaturesCall(marketplaceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a list of features available for Multi-Channel Fulfillment orders in the marketplace you specify, and whether the seller for which you made the call is enrolled for each feature.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The marketplace for which to return the list of features. (required)
     * @return GetFeaturesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetFeaturesResponse getFeatures(String marketplaceId) throws ApiException {
        ApiResponse<GetFeaturesResponse> resp = getFeaturesWithHttpInfo(marketplaceId);
        return resp.getData();
    }

    /**
     * Returns a list of features available for Multi-Channel Fulfillment orders in the marketplace you specify, and whether the seller for which you made the call is enrolled for each feature.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The marketplace for which to return the list of features. (required)
     * @return ApiResponse&lt;GetFeaturesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetFeaturesResponse> getFeaturesWithHttpInfo(String marketplaceId) throws ApiException {
        com.squareup.okhttp.Call call = getFeaturesValidateBeforeCall(marketplaceId, null, null);
        Type localVarReturnType = new TypeToken<GetFeaturesResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a list of features available for Multi-Channel Fulfillment orders in the marketplace you specify, and whether the seller for which you made the call is enrolled for each feature.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The marketplace for which to return the list of features. (required)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFeaturesAsync(String marketplaceId, final ApiCallback<GetFeaturesResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getFeaturesValidateBeforeCall(marketplaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetFeaturesResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getFulfillmentOrder
     *
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. (required)
     * @param progressListener         Progress listener
     * @param progressRequestListener  Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFulfillmentOrderCall(String sellerFulfillmentOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/outbound/2020-07-01/fulfillmentOrders/{sellerFulfillmentOrderId}"
                .replaceAll("\\{" + "sellerFulfillmentOrderId" + "\\}", apiClient.escapeString(sellerFulfillmentOrderId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json", "payload"
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
    private com.squareup.okhttp.Call getFulfillmentOrderValidateBeforeCall(String sellerFulfillmentOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'sellerFulfillmentOrderId' is set
        if (sellerFulfillmentOrderId == null) {
            throw new ApiException("Missing the required parameter 'sellerFulfillmentOrderId' when calling getFulfillmentOrder(Async)");
        }
        com.squareup.okhttp.Call call = getFulfillmentOrderCall(sellerFulfillmentOrderId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns the fulfillment order indicated by the specified order identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. (required)
     * @return GetFulfillmentOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetFulfillmentOrderResponse getFulfillmentOrder(String sellerFulfillmentOrderId) throws ApiException {
        ApiResponse<GetFulfillmentOrderResponse> resp = getFulfillmentOrderWithHttpInfo(sellerFulfillmentOrderId);
        return resp.getData();
    }

    /**
     * Returns the fulfillment order indicated by the specified order identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. (required)
     * @return ApiResponse&lt;GetFulfillmentOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetFulfillmentOrderResponse> getFulfillmentOrderWithHttpInfo(String sellerFulfillmentOrderId) throws ApiException {
        com.squareup.okhttp.Call call = getFulfillmentOrderValidateBeforeCall(sellerFulfillmentOrderId, null, null);
        Type localVarReturnType = new TypeToken<GetFulfillmentOrderResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns the fulfillment order indicated by the specified order identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. (required)
     * @param callback                 The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFulfillmentOrderAsync(String sellerFulfillmentOrderId, final ApiCallback<GetFulfillmentOrderResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getFulfillmentOrderValidateBeforeCall(sellerFulfillmentOrderId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetFulfillmentOrderResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getFulfillmentPreview
     *
     * @param body                    (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFulfillmentPreviewCall(GetFulfillmentPreviewRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/fba/outbound/2020-07-01/fulfillmentOrders/preview";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json", "payload"
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
    private com.squareup.okhttp.Call getFulfillmentPreviewValidateBeforeCall(GetFulfillmentPreviewRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getFulfillmentPreview(Async)");
        }
        com.squareup.okhttp.Call call = getFulfillmentPreviewCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a list of fulfillment order previews based on shipping criteria that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body (required)
     * @return GetFulfillmentPreviewResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetFulfillmentPreviewResponse getFulfillmentPreview(GetFulfillmentPreviewRequest body) throws ApiException {
        ApiResponse<GetFulfillmentPreviewResponse> resp = getFulfillmentPreviewWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Returns a list of fulfillment order previews based on shipping criteria that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body (required)
     * @return ApiResponse&lt;GetFulfillmentPreviewResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetFulfillmentPreviewResponse> getFulfillmentPreviewWithHttpInfo(GetFulfillmentPreviewRequest body) throws ApiException {
        com.squareup.okhttp.Call call = getFulfillmentPreviewValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<GetFulfillmentPreviewResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a list of fulfillment order previews based on shipping criteria that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body     (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFulfillmentPreviewAsync(GetFulfillmentPreviewRequest body, final ApiCallback<GetFulfillmentPreviewResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getFulfillmentPreviewValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetFulfillmentPreviewResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getPackageTrackingDetails
     *
     * @param packageNumber           The unencrypted package identifier returned by the getFulfillmentOrder operation. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPackageTrackingDetailsCall(Integer packageNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/outbound/2020-07-01/tracking";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (packageNumber != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("packageNumber", packageNumber));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json", "payload"
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
    private com.squareup.okhttp.Call getPackageTrackingDetailsValidateBeforeCall(Integer packageNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'packageNumber' is set
        if (packageNumber == null) {
            throw new ApiException("Missing the required parameter 'packageNumber' when calling getPackageTrackingDetails(Async)");
        }
        com.squareup.okhttp.Call call = getPackageTrackingDetailsCall(packageNumber, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns delivery tracking information for a package in an outbound shipment for a Multi-Channel Fulfillment order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param packageNumber The unencrypted package identifier returned by the getFulfillmentOrder operation. (required)
     * @return GetPackageTrackingDetailsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetPackageTrackingDetailsResponse getPackageTrackingDetails(Integer packageNumber) throws ApiException {
        ApiResponse<GetPackageTrackingDetailsResponse> resp = getPackageTrackingDetailsWithHttpInfo(packageNumber);
        return resp.getData();
    }

    /**
     * Returns delivery tracking information for a package in an outbound shipment for a Multi-Channel Fulfillment order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param packageNumber The unencrypted package identifier returned by the getFulfillmentOrder operation. (required)
     * @return ApiResponse&lt;GetPackageTrackingDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetPackageTrackingDetailsResponse> getPackageTrackingDetailsWithHttpInfo(Integer packageNumber) throws ApiException {
        com.squareup.okhttp.Call call = getPackageTrackingDetailsValidateBeforeCall(packageNumber, null, null);
        Type localVarReturnType = new TypeToken<GetPackageTrackingDetailsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns delivery tracking information for a package in an outbound shipment for a Multi-Channel Fulfillment order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param packageNumber The unencrypted package identifier returned by the getFulfillmentOrder operation. (required)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPackageTrackingDetailsAsync(Integer packageNumber, final ApiCallback<GetPackageTrackingDetailsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getPackageTrackingDetailsValidateBeforeCall(packageNumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetPackageTrackingDetailsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for listAllFulfillmentOrders
     *
     * @param queryStartDate          A date used to select fulfillment orders that were last updated after (or at) a specified time. An update is defined as any change in fulfillment order status, including the creation of a new fulfillment order. (optional)
     * @param nextToken               A string token returned in the response to your previous request. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listAllFulfillmentOrdersCall(OffsetDateTime queryStartDate, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/outbound/2020-07-01/fulfillmentOrders";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (queryStartDate != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("queryStartDate", queryStartDate));
        if (nextToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("nextToken", nextToken));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json", "payload"
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
    private com.squareup.okhttp.Call listAllFulfillmentOrdersValidateBeforeCall(OffsetDateTime queryStartDate, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        com.squareup.okhttp.Call call = listAllFulfillmentOrdersCall(queryStartDate, nextToken, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a list of fulfillment orders fulfilled after (or at) a specified date-time, or indicated by the next token parameter.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param queryStartDate A date used to select fulfillment orders that were last updated after (or at) a specified time. An update is defined as any change in fulfillment order status, including the creation of a new fulfillment order. (optional)
     * @param nextToken      A string token returned in the response to your previous request. (optional)
     * @return ListAllFulfillmentOrdersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListAllFulfillmentOrdersResponse listAllFulfillmentOrders(OffsetDateTime queryStartDate, String nextToken) throws ApiException {
        ApiResponse<ListAllFulfillmentOrdersResponse> resp = listAllFulfillmentOrdersWithHttpInfo(queryStartDate, nextToken);
        return resp.getData();
    }

    /**
     * Returns a list of fulfillment orders fulfilled after (or at) a specified date-time, or indicated by the next token parameter.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param queryStartDate A date used to select fulfillment orders that were last updated after (or at) a specified time. An update is defined as any change in fulfillment order status, including the creation of a new fulfillment order. (optional)
     * @param nextToken      A string token returned in the response to your previous request. (optional)
     * @return ApiResponse&lt;ListAllFulfillmentOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListAllFulfillmentOrdersResponse> listAllFulfillmentOrdersWithHttpInfo(OffsetDateTime queryStartDate, String nextToken) throws ApiException {
        com.squareup.okhttp.Call call = listAllFulfillmentOrdersValidateBeforeCall(queryStartDate, nextToken, null, null);
        Type localVarReturnType = new TypeToken<ListAllFulfillmentOrdersResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a list of fulfillment orders fulfilled after (or at) a specified date-time, or indicated by the next token parameter.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param queryStartDate A date used to select fulfillment orders that were last updated after (or at) a specified time. An update is defined as any change in fulfillment order status, including the creation of a new fulfillment order. (optional)
     * @param nextToken      A string token returned in the response to your previous request. (optional)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAllFulfillmentOrdersAsync(OffsetDateTime queryStartDate, String nextToken, final ApiCallback<ListAllFulfillmentOrdersResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = listAllFulfillmentOrdersValidateBeforeCall(queryStartDate, nextToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListAllFulfillmentOrdersResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for listReturnReasonCodes
     *
     * @param sellerSku                The seller SKU for which return reason codes are required. (required)
     * @param language                 The language that the TranslatedDescription property of the ReasonCodeDetails response object should be translated into. (required)
     * @param marketplaceId            The marketplace for which the seller wants return reason codes. (optional)
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. The service uses this value to determine the marketplace for which the seller wants return reason codes. (optional)
     * @param progressListener         Progress listener
     * @param progressRequestListener  Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listReturnReasonCodesCall(String sellerSku, String language, String marketplaceId, String sellerFulfillmentOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/outbound/2020-07-01/returnReasonCodes";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (sellerSku != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("sellerSku", sellerSku));
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
        if (sellerFulfillmentOrderId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("sellerFulfillmentOrderId", sellerFulfillmentOrderId));
        if (language != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("language", language));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json", "payload"
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
    private com.squareup.okhttp.Call listReturnReasonCodesValidateBeforeCall(String sellerSku, String language, String marketplaceId, String sellerFulfillmentOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'sellerSku' is set
        if (sellerSku == null) {
            throw new ApiException("Missing the required parameter 'sellerSku' when calling listReturnReasonCodes(Async)");
        }
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling listReturnReasonCodes(Async)");
        }
        com.squareup.okhttp.Call call = listReturnReasonCodesCall(sellerSku, language, marketplaceId, sellerFulfillmentOrderId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a list of return reason codes for a seller SKU in a given marketplace.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSku                The seller SKU for which return reason codes are required. (required)
     * @param language                 The language that the TranslatedDescription property of the ReasonCodeDetails response object should be translated into. (required)
     * @param marketplaceId            The marketplace for which the seller wants return reason codes. (optional)
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. The service uses this value to determine the marketplace for which the seller wants return reason codes. (optional)
     * @return ListReturnReasonCodesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListReturnReasonCodesResponse listReturnReasonCodes(String sellerSku, String language, String marketplaceId, String sellerFulfillmentOrderId) throws ApiException {
        ApiResponse<ListReturnReasonCodesResponse> resp = listReturnReasonCodesWithHttpInfo(sellerSku, language, marketplaceId, sellerFulfillmentOrderId);
        return resp.getData();
    }

    /**
     * Returns a list of return reason codes for a seller SKU in a given marketplace.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSku                The seller SKU for which return reason codes are required. (required)
     * @param language                 The language that the TranslatedDescription property of the ReasonCodeDetails response object should be translated into. (required)
     * @param marketplaceId            The marketplace for which the seller wants return reason codes. (optional)
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. The service uses this value to determine the marketplace for which the seller wants return reason codes. (optional)
     * @return ApiResponse&lt;ListReturnReasonCodesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListReturnReasonCodesResponse> listReturnReasonCodesWithHttpInfo(String sellerSku, String language, String marketplaceId, String sellerFulfillmentOrderId) throws ApiException {
        com.squareup.okhttp.Call call = listReturnReasonCodesValidateBeforeCall(sellerSku, language, marketplaceId, sellerFulfillmentOrderId, null, null);
        Type localVarReturnType = new TypeToken<ListReturnReasonCodesResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a list of return reason codes for a seller SKU in a given marketplace.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSku                The seller SKU for which return reason codes are required. (required)
     * @param language                 The language that the TranslatedDescription property of the ReasonCodeDetails response object should be translated into. (required)
     * @param marketplaceId            The marketplace for which the seller wants return reason codes. (optional)
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. The service uses this value to determine the marketplace for which the seller wants return reason codes. (optional)
     * @param callback                 The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listReturnReasonCodesAsync(String sellerSku, String language, String marketplaceId, String sellerFulfillmentOrderId, final ApiCallback<ListReturnReasonCodesResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = listReturnReasonCodesValidateBeforeCall(sellerSku, language, marketplaceId, sellerFulfillmentOrderId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListReturnReasonCodesResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateFulfillmentOrder
     *
     * @param body                     (required)
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. (required)
     * @param progressListener         Progress listener
     * @param progressRequestListener  Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateFulfillmentOrderCall(UpdateFulfillmentOrderRequest body, String sellerFulfillmentOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/fba/outbound/2020-07-01/fulfillmentOrders/{sellerFulfillmentOrderId}"
                .replaceAll("\\{" + "sellerFulfillmentOrderId" + "\\}", apiClient.escapeString(sellerFulfillmentOrderId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateFulfillmentOrderValidateBeforeCall(UpdateFulfillmentOrderRequest body, String sellerFulfillmentOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateFulfillmentOrder(Async)");
        }
        // verify the required parameter 'sellerFulfillmentOrderId' is set
        if (sellerFulfillmentOrderId == null) {
            throw new ApiException("Missing the required parameter 'sellerFulfillmentOrderId' when calling updateFulfillmentOrder(Async)");
        }
        com.squareup.okhttp.Call call = updateFulfillmentOrderCall(body, sellerFulfillmentOrderId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Updates and/or requests shipment for a fulfillment order with an order hold on it.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body                     (required)
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. (required)
     * @return UpdateFulfillmentOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateFulfillmentOrderResponse updateFulfillmentOrder(UpdateFulfillmentOrderRequest body, String sellerFulfillmentOrderId) throws ApiException {
        ApiResponse<UpdateFulfillmentOrderResponse> resp = updateFulfillmentOrderWithHttpInfo(body, sellerFulfillmentOrderId);
        return resp.getData();
    }

    /**
     * Updates and/or requests shipment for a fulfillment order with an order hold on it.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body                     (required)
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. (required)
     * @return ApiResponse&lt;UpdateFulfillmentOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdateFulfillmentOrderResponse> updateFulfillmentOrderWithHttpInfo(UpdateFulfillmentOrderRequest body, String sellerFulfillmentOrderId) throws ApiException {
        com.squareup.okhttp.Call call = updateFulfillmentOrderValidateBeforeCall(body, sellerFulfillmentOrderId, null, null);
        Type localVarReturnType = new TypeToken<UpdateFulfillmentOrderResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Updates and/or requests shipment for a fulfillment order with an order hold on it.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body                     (required)
     * @param sellerFulfillmentOrderId The identifier assigned to the item by the seller when the fulfillment order was created. (required)
     * @param callback                 The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateFulfillmentOrderAsync(UpdateFulfillmentOrderRequest body, String sellerFulfillmentOrderId, final ApiCallback<UpdateFulfillmentOrderResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = updateFulfillmentOrderValidateBeforeCall(body, sellerFulfillmentOrderId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpdateFulfillmentOrderResponse>() {
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

        public FbaOutboundApi build() {
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
            return new FbaOutboundApi(new ApiClient()
                    .setAWSSigV4Signer(awsSigV4Signer)
                    .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                    .setBasePath(endpoint)
                    .setRateLimiter(rateLimitConfiguration));
        }
    }
}
