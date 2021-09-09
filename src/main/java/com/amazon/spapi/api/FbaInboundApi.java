package com.amazon.spapi.api;

import com.amazon.SellingPartnerAPIAA.*;
import com.amazon.spapi.client.*;
import com.amazon.spapi.models.fulfillmentinbound.*;
import com.google.gson.reflect.TypeToken;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FbaInboundApi {
    private ApiClient apiClient;

    FbaInboundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FbaInboundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for confirmPreorder
     *
     * @param shipmentId              A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param needByDate              Date that the shipment must arrive at the Amazon fulfillment center to avoid delivery promise breaks for pre-ordered items. Must be in YYYY-MM-DD format. The response to the getPreorderInfo operation returns this value. (required)
     * @param marketplaceId           A marketplace identifier. Specifies the marketplace the shipment is tied to. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call confirmPreorderCall(String shipmentId, LocalDate needByDate, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments/{shipmentId}/preorder/confirm"
                .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (needByDate != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("NeedByDate", needByDate));
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MarketplaceId", marketplaceId));
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
    private com.squareup.okhttp.Call confirmPreorderValidateBeforeCall(String shipmentId, LocalDate needByDate, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling confirmPreorder(Async)");
        }
        // verify the required parameter 'needByDate' is set
        if (needByDate == null) {
            throw new ApiException("Missing the required parameter 'needByDate' when calling confirmPreorder(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling confirmPreorder(Async)");
        }
        com.squareup.okhttp.Call call = confirmPreorderCall(shipmentId, needByDate, marketplaceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns information needed to confirm a shipment for pre-order. Call this operation after calling the getPreorderInfo operation to get the NeedByDate value and other pre-order information about the shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId    A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param needByDate    Date that the shipment must arrive at the Amazon fulfillment center to avoid delivery promise breaks for pre-ordered items. Must be in YYYY-MM-DD format. The response to the getPreorderInfo operation returns this value. (required)
     * @param marketplaceId A marketplace identifier. Specifies the marketplace the shipment is tied to. (required)
     * @return ConfirmPreorderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConfirmPreorderResponse confirmPreorder(String shipmentId, LocalDate needByDate, String marketplaceId) throws ApiException {
        ApiResponse<ConfirmPreorderResponse> resp = confirmPreorderWithHttpInfo(shipmentId, needByDate, marketplaceId);
        return resp.getData();
    }

    /**
     * Returns information needed to confirm a shipment for pre-order. Call this operation after calling the getPreorderInfo operation to get the NeedByDate value and other pre-order information about the shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId    A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param needByDate    Date that the shipment must arrive at the Amazon fulfillment center to avoid delivery promise breaks for pre-ordered items. Must be in YYYY-MM-DD format. The response to the getPreorderInfo operation returns this value. (required)
     * @param marketplaceId A marketplace identifier. Specifies the marketplace the shipment is tied to. (required)
     * @return ApiResponse&lt;ConfirmPreorderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConfirmPreorderResponse> confirmPreorderWithHttpInfo(String shipmentId, LocalDate needByDate, String marketplaceId) throws ApiException {
        com.squareup.okhttp.Call call = confirmPreorderValidateBeforeCall(shipmentId, needByDate, marketplaceId, null, null);
        Type localVarReturnType = new TypeToken<ConfirmPreorderResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns information needed to confirm a shipment for pre-order. Call this operation after calling the getPreorderInfo operation to get the NeedByDate value and other pre-order information about the shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId    A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param needByDate    Date that the shipment must arrive at the Amazon fulfillment center to avoid delivery promise breaks for pre-ordered items. Must be in YYYY-MM-DD format. The response to the getPreorderInfo operation returns this value. (required)
     * @param marketplaceId A marketplace identifier. Specifies the marketplace the shipment is tied to. (required)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call confirmPreorderAsync(String shipmentId, LocalDate needByDate, String marketplaceId, final ApiCallback<ConfirmPreorderResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = confirmPreorderValidateBeforeCall(shipmentId, needByDate, marketplaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ConfirmPreorderResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for confirmTransport
     *
     * @param shipmentId              A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call confirmTransportCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments/{shipmentId}/transport/confirm"
                .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call confirmTransportValidateBeforeCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling confirmTransport(Async)");
        }
        com.squareup.okhttp.Call call = confirmTransportCall(shipmentId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Confirms that the seller accepts the Amazon-partnered shipping estimate, agrees to allow Amazon to charge their account for the shipping cost, and requests that the Amazon-partnered carrier ship the inbound shipment.  Prior to calling the confirmTransport operation, you should call the getTransportDetails operation to get the Amazon-partnered shipping estimate.  Important: After confirming the transportation request, if the seller decides that they do not want the Amazon-partnered carrier to ship the inbound shipment, you can call the voidTransport operation to cancel the transportation request. Note that for a Small Parcel shipment, the seller has 24 hours after confirming a transportation request to void the transportation request. For a Less Than Truckload/Full Truckload (LTL/FTL) shipment, the seller has one hour after confirming a transportation request to void it. After the grace period has expired the seller&#x27;s account will be charged for the shipping cost.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return ConfirmTransportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConfirmTransportResponse confirmTransport(String shipmentId) throws ApiException {
        ApiResponse<ConfirmTransportResponse> resp = confirmTransportWithHttpInfo(shipmentId);
        return resp.getData();
    }

    /**
     * Confirms that the seller accepts the Amazon-partnered shipping estimate, agrees to allow Amazon to charge their account for the shipping cost, and requests that the Amazon-partnered carrier ship the inbound shipment.  Prior to calling the confirmTransport operation, you should call the getTransportDetails operation to get the Amazon-partnered shipping estimate.  Important: After confirming the transportation request, if the seller decides that they do not want the Amazon-partnered carrier to ship the inbound shipment, you can call the voidTransport operation to cancel the transportation request. Note that for a Small Parcel shipment, the seller has 24 hours after confirming a transportation request to void the transportation request. For a Less Than Truckload/Full Truckload (LTL/FTL) shipment, the seller has one hour after confirming a transportation request to void it. After the grace period has expired the seller&#x27;s account will be charged for the shipping cost.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return ApiResponse&lt;ConfirmTransportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConfirmTransportResponse> confirmTransportWithHttpInfo(String shipmentId) throws ApiException {
        com.squareup.okhttp.Call call = confirmTransportValidateBeforeCall(shipmentId, null, null);
        Type localVarReturnType = new TypeToken<ConfirmTransportResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Confirms that the seller accepts the Amazon-partnered shipping estimate, agrees to allow Amazon to charge their account for the shipping cost, and requests that the Amazon-partnered carrier ship the inbound shipment.  Prior to calling the confirmTransport operation, you should call the getTransportDetails operation to get the Amazon-partnered shipping estimate.  Important: After confirming the transportation request, if the seller decides that they do not want the Amazon-partnered carrier to ship the inbound shipment, you can call the voidTransport operation to cancel the transportation request. Note that for a Small Parcel shipment, the seller has 24 hours after confirming a transportation request to void the transportation request. For a Less Than Truckload/Full Truckload (LTL/FTL) shipment, the seller has one hour after confirming a transportation request to void it. After the grace period has expired the seller&#x27;s account will be charged for the shipping cost.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param callback   The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call confirmTransportAsync(String shipmentId, final ApiCallback<ConfirmTransportResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = confirmTransportValidateBeforeCall(shipmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ConfirmTransportResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createInboundShipment
     *
     * @param body                    (required)
     * @param shipmentId              A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createInboundShipmentCall(InboundShipmentRequest body, String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments/{shipmentId}"
                .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));
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
    private com.squareup.okhttp.Call createInboundShipmentValidateBeforeCall(InboundShipmentRequest body, String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createInboundShipment(Async)");
        }
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling createInboundShipment(Async)");
        }
        com.squareup.okhttp.Call call = createInboundShipmentCall(body, shipmentId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a new inbound shipment based on the specified shipmentId that was returned by the createInboundShipmentPlan operation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body       (required)
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return InboundShipmentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InboundShipmentResponse createInboundShipment(InboundShipmentRequest body, String shipmentId) throws ApiException {
        ApiResponse<InboundShipmentResponse> resp = createInboundShipmentWithHttpInfo(body, shipmentId);
        return resp.getData();
    }

    /**
     * Returns a new inbound shipment based on the specified shipmentId that was returned by the createInboundShipmentPlan operation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body       (required)
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return ApiResponse&lt;InboundShipmentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InboundShipmentResponse> createInboundShipmentWithHttpInfo(InboundShipmentRequest body, String shipmentId) throws ApiException {
        com.squareup.okhttp.Call call = createInboundShipmentValidateBeforeCall(body, shipmentId, null, null);
        Type localVarReturnType = new TypeToken<InboundShipmentResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a new inbound shipment based on the specified shipmentId that was returned by the createInboundShipmentPlan operation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body       (required)
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param callback   The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createInboundShipmentAsync(InboundShipmentRequest body, String shipmentId, final ApiCallback<InboundShipmentResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createInboundShipmentValidateBeforeCall(body, shipmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InboundShipmentResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createInboundShipmentPlan
     *
     * @param body                    (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createInboundShipmentPlanCall(CreateInboundShipmentPlanRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/plans";
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
    private com.squareup.okhttp.Call createInboundShipmentPlanValidateBeforeCall(CreateInboundShipmentPlanRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createInboundShipmentPlan(Async)");
        }
        com.squareup.okhttp.Call call = createInboundShipmentPlanCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns one or more inbound shipment plans, which provide the information you need to create one or more inbound shipments for a set of items that you specify. Multiple inbound shipment plans might be required so that items can be optimally placed in Amazon&#x27;s fulfillment network—for example, positioning inventory closer to the customer. Alternatively, two inbound shipment plans might be created with the same Amazon fulfillment center destination if the two shipment plans require different processing—for example, items that require labels must be shipped separately from stickerless, commingled inventory.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body (required)
     * @return CreateInboundShipmentPlanResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateInboundShipmentPlanResponse createInboundShipmentPlan(CreateInboundShipmentPlanRequest body) throws ApiException {
        ApiResponse<CreateInboundShipmentPlanResponse> resp = createInboundShipmentPlanWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Returns one or more inbound shipment plans, which provide the information you need to create one or more inbound shipments for a set of items that you specify. Multiple inbound shipment plans might be required so that items can be optimally placed in Amazon&#x27;s fulfillment network—for example, positioning inventory closer to the customer. Alternatively, two inbound shipment plans might be created with the same Amazon fulfillment center destination if the two shipment plans require different processing—for example, items that require labels must be shipped separately from stickerless, commingled inventory.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body (required)
     * @return ApiResponse&lt;CreateInboundShipmentPlanResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateInboundShipmentPlanResponse> createInboundShipmentPlanWithHttpInfo(CreateInboundShipmentPlanRequest body) throws ApiException {
        com.squareup.okhttp.Call call = createInboundShipmentPlanValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CreateInboundShipmentPlanResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns one or more inbound shipment plans, which provide the information you need to create one or more inbound shipments for a set of items that you specify. Multiple inbound shipment plans might be required so that items can be optimally placed in Amazon&#x27;s fulfillment network—for example, positioning inventory closer to the customer. Alternatively, two inbound shipment plans might be created with the same Amazon fulfillment center destination if the two shipment plans require different processing—for example, items that require labels must be shipped separately from stickerless, commingled inventory.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body     (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createInboundShipmentPlanAsync(CreateInboundShipmentPlanRequest body, final ApiCallback<CreateInboundShipmentPlanResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createInboundShipmentPlanValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateInboundShipmentPlanResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for estimateTransport
     *
     * @param shipmentId              A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call estimateTransportCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments/{shipmentId}/transport/estimate"
                .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call estimateTransportValidateBeforeCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling estimateTransport(Async)");
        }
        com.squareup.okhttp.Call call = estimateTransportCall(shipmentId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Initiates the process of estimating the shipping cost for an inbound shipment by an Amazon-partnered carrier.  Prior to calling the estimateTransport operation, you must call the putTransportDetails operation to provide Amazon with the transportation information for the inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return EstimateTransportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EstimateTransportResponse estimateTransport(String shipmentId) throws ApiException {
        ApiResponse<EstimateTransportResponse> resp = estimateTransportWithHttpInfo(shipmentId);
        return resp.getData();
    }

    /**
     * Initiates the process of estimating the shipping cost for an inbound shipment by an Amazon-partnered carrier.  Prior to calling the estimateTransport operation, you must call the putTransportDetails operation to provide Amazon with the transportation information for the inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return ApiResponse&lt;EstimateTransportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EstimateTransportResponse> estimateTransportWithHttpInfo(String shipmentId) throws ApiException {
        com.squareup.okhttp.Call call = estimateTransportValidateBeforeCall(shipmentId, null, null);
        Type localVarReturnType = new TypeToken<EstimateTransportResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Initiates the process of estimating the shipping cost for an inbound shipment by an Amazon-partnered carrier.  Prior to calling the estimateTransport operation, you must call the putTransportDetails operation to provide Amazon with the transportation information for the inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param callback   The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call estimateTransportAsync(String shipmentId, final ApiCallback<EstimateTransportResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = estimateTransportValidateBeforeCall(shipmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EstimateTransportResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getBillOfLading
     *
     * @param shipmentId              A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBillOfLadingCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments/{shipmentId}/billOfLading"
                .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBillOfLadingValidateBeforeCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling getBillOfLading(Async)");
        }
        com.squareup.okhttp.Call call = getBillOfLadingCall(shipmentId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a bill of lading for a Less Than Truckload/Full Truckload (LTL/FTL) shipment. The getBillOfLading operation returns PDF document data for printing a bill of lading for an Amazon-partnered Less Than Truckload/Full Truckload (LTL/FTL) inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return GetBillOfLadingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetBillOfLadingResponse getBillOfLading(String shipmentId) throws ApiException {
        ApiResponse<GetBillOfLadingResponse> resp = getBillOfLadingWithHttpInfo(shipmentId);
        return resp.getData();
    }

    /**
     * Returns a bill of lading for a Less Than Truckload/Full Truckload (LTL/FTL) shipment. The getBillOfLading operation returns PDF document data for printing a bill of lading for an Amazon-partnered Less Than Truckload/Full Truckload (LTL/FTL) inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return ApiResponse&lt;GetBillOfLadingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetBillOfLadingResponse> getBillOfLadingWithHttpInfo(String shipmentId) throws ApiException {
        com.squareup.okhttp.Call call = getBillOfLadingValidateBeforeCall(shipmentId, null, null);
        Type localVarReturnType = new TypeToken<GetBillOfLadingResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a bill of lading for a Less Than Truckload/Full Truckload (LTL/FTL) shipment. The getBillOfLading operation returns PDF document data for printing a bill of lading for an Amazon-partnered Less Than Truckload/Full Truckload (LTL/FTL) inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param callback   The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBillOfLadingAsync(String shipmentId, final ApiCallback<GetBillOfLadingResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getBillOfLadingValidateBeforeCall(shipmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetBillOfLadingResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getInboundGuidance
     *
     * @param marketplaceId           A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param sellerSKUList           A list of SellerSKU values. Used to identify items for which you want inbound guidance for shipment to Amazon&#x27;s fulfillment network. Note: SellerSKU is qualified by the SellerId, which is included with every Selling Partner API operation that you submit. If you specify a SellerSKU that identifies a variation parent ASIN, this operation returns an error. A variation parent ASIN represents a generic product that cannot be sold. Variation child ASINs represent products that have specific characteristics (such as size and color) and can be sold.  (optional)
     * @param asINList                A list of ASIN values. Used to identify items for which you want inbound guidance for shipment to Amazon&#x27;s fulfillment network. Note: If you specify a ASIN that identifies a variation parent ASIN, this operation returns an error. A variation parent ASIN represents a generic product that cannot be sold. Variation child ASINs represent products that have specific characteristics (such as size and color) and can be sold. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInboundGuidanceCall(String marketplaceId, List<String> sellerSKUList, List<String> asINList, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/itemsGuidance";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MarketplaceId", marketplaceId));
        if (sellerSKUList != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "SellerSKUList", sellerSKUList));
        if (asINList != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "ASINList", asINList));
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getInboundGuidanceValidateBeforeCall(String marketplaceId, List<String> sellerSKUList, List<String> asINList, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getInboundGuidance(Async)");
        }
        com.squareup.okhttp.Call call = getInboundGuidanceCall(marketplaceId, sellerSKUList, asINList, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns information that lets a seller know if Amazon recommends sending an item to a given marketplace. In some cases, Amazon provides guidance for why a given SellerSKU or ASIN is not recommended for shipment to Amazon&#x27;s fulfillment network. Sellers may still ship items that are not recommended, at their discretion.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param sellerSKUList A list of SellerSKU values. Used to identify items for which you want inbound guidance for shipment to Amazon&#x27;s fulfillment network. Note: SellerSKU is qualified by the SellerId, which is included with every Selling Partner API operation that you submit. If you specify a SellerSKU that identifies a variation parent ASIN, this operation returns an error. A variation parent ASIN represents a generic product that cannot be sold. Variation child ASINs represent products that have specific characteristics (such as size and color) and can be sold.  (optional)
     * @param asINList      A list of ASIN values. Used to identify items for which you want inbound guidance for shipment to Amazon&#x27;s fulfillment network. Note: If you specify a ASIN that identifies a variation parent ASIN, this operation returns an error. A variation parent ASIN represents a generic product that cannot be sold. Variation child ASINs represent products that have specific characteristics (such as size and color) and can be sold. (optional)
     * @return GetInboundGuidanceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetInboundGuidanceResponse getInboundGuidance(String marketplaceId, List<String> sellerSKUList, List<String> asINList) throws ApiException {
        ApiResponse<GetInboundGuidanceResponse> resp = getInboundGuidanceWithHttpInfo(marketplaceId, sellerSKUList, asINList);
        return resp.getData();
    }

    /**
     * Returns information that lets a seller know if Amazon recommends sending an item to a given marketplace. In some cases, Amazon provides guidance for why a given SellerSKU or ASIN is not recommended for shipment to Amazon&#x27;s fulfillment network. Sellers may still ship items that are not recommended, at their discretion.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param sellerSKUList A list of SellerSKU values. Used to identify items for which you want inbound guidance for shipment to Amazon&#x27;s fulfillment network. Note: SellerSKU is qualified by the SellerId, which is included with every Selling Partner API operation that you submit. If you specify a SellerSKU that identifies a variation parent ASIN, this operation returns an error. A variation parent ASIN represents a generic product that cannot be sold. Variation child ASINs represent products that have specific characteristics (such as size and color) and can be sold.  (optional)
     * @param asINList      A list of ASIN values. Used to identify items for which you want inbound guidance for shipment to Amazon&#x27;s fulfillment network. Note: If you specify a ASIN that identifies a variation parent ASIN, this operation returns an error. A variation parent ASIN represents a generic product that cannot be sold. Variation child ASINs represent products that have specific characteristics (such as size and color) and can be sold. (optional)
     * @return ApiResponse&lt;GetInboundGuidanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetInboundGuidanceResponse> getInboundGuidanceWithHttpInfo(String marketplaceId, List<String> sellerSKUList, List<String> asINList) throws ApiException {
        com.squareup.okhttp.Call call = getInboundGuidanceValidateBeforeCall(marketplaceId, sellerSKUList, asINList, null, null);
        Type localVarReturnType = new TypeToken<GetInboundGuidanceResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns information that lets a seller know if Amazon recommends sending an item to a given marketplace. In some cases, Amazon provides guidance for why a given SellerSKU or ASIN is not recommended for shipment to Amazon&#x27;s fulfillment network. Sellers may still ship items that are not recommended, at their discretion.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param sellerSKUList A list of SellerSKU values. Used to identify items for which you want inbound guidance for shipment to Amazon&#x27;s fulfillment network. Note: SellerSKU is qualified by the SellerId, which is included with every Selling Partner API operation that you submit. If you specify a SellerSKU that identifies a variation parent ASIN, this operation returns an error. A variation parent ASIN represents a generic product that cannot be sold. Variation child ASINs represent products that have specific characteristics (such as size and color) and can be sold.  (optional)
     * @param asINList      A list of ASIN values. Used to identify items for which you want inbound guidance for shipment to Amazon&#x27;s fulfillment network. Note: If you specify a ASIN that identifies a variation parent ASIN, this operation returns an error. A variation parent ASIN represents a generic product that cannot be sold. Variation child ASINs represent products that have specific characteristics (such as size and color) and can be sold. (optional)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInboundGuidanceAsync(String marketplaceId, List<String> sellerSKUList, List<String> asINList, final ApiCallback<GetInboundGuidanceResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getInboundGuidanceValidateBeforeCall(marketplaceId, sellerSKUList, asINList, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetInboundGuidanceResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getLabels
     *
     * @param shipmentId              A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param pageType                The page type to use to print the labels. Submitting a PageType value that is not supported in your marketplace returns an error. (required)
     * @param labelType               The type of labels requested.  (required)
     * @param numberOfPackages        The number of packages in the shipment. (optional)
     * @param packageLabelsToPrint    A list of identifiers that specify packages for which you want package labels printed.  Must match CartonId values previously passed using the FBA Inbound Shipment Carton Information Feed. If not, the operation returns the IncorrectPackageIdentifier error code. (optional)
     * @param numberOfPallets         The number of pallets in the shipment. This returns four identical labels for each pallet. (optional)
     * @param pageSize                The page size for paginating through the total packages&#x27; labels. This is a required parameter for Non-Partnered LTL Shipments. Max value:1000. (optional)
     * @param pageStartIndex          The page start index for paginating through the total packages&#x27; labels. This is a required parameter for Non-Partnered LTL Shipments. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLabelsCall(String shipmentId, String pageType, String labelType, Integer numberOfPackages, List<String> packageLabelsToPrint, Integer numberOfPallets, Integer pageSize, Integer pageStartIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments/{shipmentId}/labels"
                .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pageType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("PageType", pageType));
        if (labelType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("LabelType", labelType));
        if (numberOfPackages != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("NumberOfPackages", numberOfPackages));
        if (packageLabelsToPrint != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "PackageLabelsToPrint", packageLabelsToPrint));
        if (numberOfPallets != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("NumberOfPallets", numberOfPallets));
        if (pageSize != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("PageSize", pageSize));
        if (pageStartIndex != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("PageStartIndex", pageStartIndex));
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getLabelsValidateBeforeCall(String shipmentId, String pageType, String labelType, Integer numberOfPackages, List<String> packageLabelsToPrint, Integer numberOfPallets, Integer pageSize, Integer pageStartIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling getLabels(Async)");
        }
        // verify the required parameter 'pageType' is set
        if (pageType == null) {
            throw new ApiException("Missing the required parameter 'pageType' when calling getLabels(Async)");
        }
        // verify the required parameter 'labelType' is set
        if (labelType == null) {
            throw new ApiException("Missing the required parameter 'labelType' when calling getLabels(Async)");
        }
        com.squareup.okhttp.Call call = getLabelsCall(shipmentId, pageType, labelType, numberOfPackages, packageLabelsToPrint, numberOfPallets, pageSize, pageStartIndex, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns package/pallet labels for faster and more accurate shipment processing at the Amazon fulfillment center.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId           A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param pageType             The page type to use to print the labels. Submitting a PageType value that is not supported in your marketplace returns an error. (required)
     * @param labelType            The type of labels requested.  (required)
     * @param numberOfPackages     The number of packages in the shipment. (optional)
     * @param packageLabelsToPrint A list of identifiers that specify packages for which you want package labels printed.  Must match CartonId values previously passed using the FBA Inbound Shipment Carton Information Feed. If not, the operation returns the IncorrectPackageIdentifier error code. (optional)
     * @param numberOfPallets      The number of pallets in the shipment. This returns four identical labels for each pallet. (optional)
     * @param pageSize             The page size for paginating through the total packages&#x27; labels. This is a required parameter for Non-Partnered LTL Shipments. Max value:1000. (optional)
     * @param pageStartIndex       The page start index for paginating through the total packages&#x27; labels. This is a required parameter for Non-Partnered LTL Shipments. (optional)
     * @return GetLabelsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetLabelsResponse getLabels(String shipmentId, String pageType, String labelType, Integer numberOfPackages, List<String> packageLabelsToPrint, Integer numberOfPallets, Integer pageSize, Integer pageStartIndex) throws ApiException {
        ApiResponse<GetLabelsResponse> resp = getLabelsWithHttpInfo(shipmentId, pageType, labelType, numberOfPackages, packageLabelsToPrint, numberOfPallets, pageSize, pageStartIndex);
        return resp.getData();
    }

    /**
     * Returns package/pallet labels for faster and more accurate shipment processing at the Amazon fulfillment center.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId           A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param pageType             The page type to use to print the labels. Submitting a PageType value that is not supported in your marketplace returns an error. (required)
     * @param labelType            The type of labels requested.  (required)
     * @param numberOfPackages     The number of packages in the shipment. (optional)
     * @param packageLabelsToPrint A list of identifiers that specify packages for which you want package labels printed.  Must match CartonId values previously passed using the FBA Inbound Shipment Carton Information Feed. If not, the operation returns the IncorrectPackageIdentifier error code. (optional)
     * @param numberOfPallets      The number of pallets in the shipment. This returns four identical labels for each pallet. (optional)
     * @param pageSize             The page size for paginating through the total packages&#x27; labels. This is a required parameter for Non-Partnered LTL Shipments. Max value:1000. (optional)
     * @param pageStartIndex       The page start index for paginating through the total packages&#x27; labels. This is a required parameter for Non-Partnered LTL Shipments. (optional)
     * @return ApiResponse&lt;GetLabelsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetLabelsResponse> getLabelsWithHttpInfo(String shipmentId, String pageType, String labelType, Integer numberOfPackages, List<String> packageLabelsToPrint, Integer numberOfPallets, Integer pageSize, Integer pageStartIndex) throws ApiException {
        com.squareup.okhttp.Call call = getLabelsValidateBeforeCall(shipmentId, pageType, labelType, numberOfPackages, packageLabelsToPrint, numberOfPallets, pageSize, pageStartIndex, null, null);
        Type localVarReturnType = new TypeToken<GetLabelsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns package/pallet labels for faster and more accurate shipment processing at the Amazon fulfillment center.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId           A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param pageType             The page type to use to print the labels. Submitting a PageType value that is not supported in your marketplace returns an error. (required)
     * @param labelType            The type of labels requested.  (required)
     * @param numberOfPackages     The number of packages in the shipment. (optional)
     * @param packageLabelsToPrint A list of identifiers that specify packages for which you want package labels printed.  Must match CartonId values previously passed using the FBA Inbound Shipment Carton Information Feed. If not, the operation returns the IncorrectPackageIdentifier error code. (optional)
     * @param numberOfPallets      The number of pallets in the shipment. This returns four identical labels for each pallet. (optional)
     * @param pageSize             The page size for paginating through the total packages&#x27; labels. This is a required parameter for Non-Partnered LTL Shipments. Max value:1000. (optional)
     * @param pageStartIndex       The page start index for paginating through the total packages&#x27; labels. This is a required parameter for Non-Partnered LTL Shipments. (optional)
     * @param callback             The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLabelsAsync(String shipmentId, String pageType, String labelType, Integer numberOfPackages, List<String> packageLabelsToPrint, Integer numberOfPallets, Integer pageSize, Integer pageStartIndex, final ApiCallback<GetLabelsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getLabelsValidateBeforeCall(shipmentId, pageType, labelType, numberOfPackages, packageLabelsToPrint, numberOfPallets, pageSize, pageStartIndex, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetLabelsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getPreorderInfo
     *
     * @param shipmentId              A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param marketplaceId           A marketplace identifier. Specifies the marketplace the shipment is tied to. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPreorderInfoCall(String shipmentId, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments/{shipmentId}/preorder"
                .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MarketplaceId", marketplaceId));
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPreorderInfoValidateBeforeCall(String shipmentId, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling getPreorderInfo(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getPreorderInfo(Async)");
        }
        com.squareup.okhttp.Call call = getPreorderInfoCall(shipmentId, marketplaceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns pre-order information, including dates, that a seller needs before confirming a shipment for pre-order.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId    A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param marketplaceId A marketplace identifier. Specifies the marketplace the shipment is tied to. (required)
     * @return GetPreorderInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetPreorderInfoResponse getPreorderInfo(String shipmentId, String marketplaceId) throws ApiException {
        ApiResponse<GetPreorderInfoResponse> resp = getPreorderInfoWithHttpInfo(shipmentId, marketplaceId);
        return resp.getData();
    }

    /**
     * Returns pre-order information, including dates, that a seller needs before confirming a shipment for pre-order.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId    A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param marketplaceId A marketplace identifier. Specifies the marketplace the shipment is tied to. (required)
     * @return ApiResponse&lt;GetPreorderInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetPreorderInfoResponse> getPreorderInfoWithHttpInfo(String shipmentId, String marketplaceId) throws ApiException {
        com.squareup.okhttp.Call call = getPreorderInfoValidateBeforeCall(shipmentId, marketplaceId, null, null);
        Type localVarReturnType = new TypeToken<GetPreorderInfoResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns pre-order information, including dates, that a seller needs before confirming a shipment for pre-order.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId    A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param marketplaceId A marketplace identifier. Specifies the marketplace the shipment is tied to. (required)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPreorderInfoAsync(String shipmentId, String marketplaceId, final ApiCallback<GetPreorderInfoResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getPreorderInfoValidateBeforeCall(shipmentId, marketplaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetPreorderInfoResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getPrepInstructions
     *
     * @param shipToCountryCode       The country code of the country to which the items will be shipped. Note that labeling requirements and item preparation instructions can vary by country. (required)
     * @param sellerSKUList           A list of SellerSKU values. Used to identify items for which you want labeling requirements and item preparation instructions for shipment to Amazon&#x27;s fulfillment network. The SellerSKU is qualified by the Seller ID, which is included with every call to the Seller Partner API.  Note: Include seller SKUs that you have used to list items on Amazon&#x27;s retail website. If you include a seller SKU that you have never used to list an item on Amazon&#x27;s retail website, the seller SKU is returned in the InvalidSKUList property in the response. (optional)
     * @param asINList                A list of ASIN values. Used to identify items for which you want item preparation instructions to help with item sourcing decisions.  Note: ASINs must be included in the product catalog for at least one of the marketplaces that the seller  participates in. Any ASIN that is not included in the product catalog for at least one of the marketplaces that the seller participates in is returned in the InvalidASINList property in the response. You can find out which marketplaces a seller participates in by calling the getMarketplaceParticipations operation in the Selling Partner API for Sellers. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPrepInstructionsCall(String shipToCountryCode, List<String> sellerSKUList, List<String> asINList, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/prepInstructions";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (shipToCountryCode != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ShipToCountryCode", shipToCountryCode));
        if (sellerSKUList != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "SellerSKUList", sellerSKUList));
        if (asINList != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "ASINList", asINList));
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPrepInstructionsValidateBeforeCall(String shipToCountryCode, List<String> sellerSKUList, List<String> asINList, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'shipToCountryCode' is set
        if (shipToCountryCode == null) {
            throw new ApiException("Missing the required parameter 'shipToCountryCode' when calling getPrepInstructions(Async)");
        }
        com.squareup.okhttp.Call call = getPrepInstructionsCall(shipToCountryCode, sellerSKUList, asINList, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns labeling requirements and item preparation instructions to help prepare items for shipment to Amazon&#x27;s fulfillment network.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipToCountryCode The country code of the country to which the items will be shipped. Note that labeling requirements and item preparation instructions can vary by country. (required)
     * @param sellerSKUList     A list of SellerSKU values. Used to identify items for which you want labeling requirements and item preparation instructions for shipment to Amazon&#x27;s fulfillment network. The SellerSKU is qualified by the Seller ID, which is included with every call to the Seller Partner API.  Note: Include seller SKUs that you have used to list items on Amazon&#x27;s retail website. If you include a seller SKU that you have never used to list an item on Amazon&#x27;s retail website, the seller SKU is returned in the InvalidSKUList property in the response. (optional)
     * @param asINList          A list of ASIN values. Used to identify items for which you want item preparation instructions to help with item sourcing decisions.  Note: ASINs must be included in the product catalog for at least one of the marketplaces that the seller  participates in. Any ASIN that is not included in the product catalog for at least one of the marketplaces that the seller participates in is returned in the InvalidASINList property in the response. You can find out which marketplaces a seller participates in by calling the getMarketplaceParticipations operation in the Selling Partner API for Sellers. (optional)
     * @return GetPrepInstructionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetPrepInstructionsResponse getPrepInstructions(String shipToCountryCode, List<String> sellerSKUList, List<String> asINList) throws ApiException {
        ApiResponse<GetPrepInstructionsResponse> resp = getPrepInstructionsWithHttpInfo(shipToCountryCode, sellerSKUList, asINList);
        return resp.getData();
    }

    /**
     * Returns labeling requirements and item preparation instructions to help prepare items for shipment to Amazon&#x27;s fulfillment network.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipToCountryCode The country code of the country to which the items will be shipped. Note that labeling requirements and item preparation instructions can vary by country. (required)
     * @param sellerSKUList     A list of SellerSKU values. Used to identify items for which you want labeling requirements and item preparation instructions for shipment to Amazon&#x27;s fulfillment network. The SellerSKU is qualified by the Seller ID, which is included with every call to the Seller Partner API.  Note: Include seller SKUs that you have used to list items on Amazon&#x27;s retail website. If you include a seller SKU that you have never used to list an item on Amazon&#x27;s retail website, the seller SKU is returned in the InvalidSKUList property in the response. (optional)
     * @param asINList          A list of ASIN values. Used to identify items for which you want item preparation instructions to help with item sourcing decisions.  Note: ASINs must be included in the product catalog for at least one of the marketplaces that the seller  participates in. Any ASIN that is not included in the product catalog for at least one of the marketplaces that the seller participates in is returned in the InvalidASINList property in the response. You can find out which marketplaces a seller participates in by calling the getMarketplaceParticipations operation in the Selling Partner API for Sellers. (optional)
     * @return ApiResponse&lt;GetPrepInstructionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetPrepInstructionsResponse> getPrepInstructionsWithHttpInfo(String shipToCountryCode, List<String> sellerSKUList, List<String> asINList) throws ApiException {
        com.squareup.okhttp.Call call = getPrepInstructionsValidateBeforeCall(shipToCountryCode, sellerSKUList, asINList, null, null);
        Type localVarReturnType = new TypeToken<GetPrepInstructionsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns labeling requirements and item preparation instructions to help prepare items for shipment to Amazon&#x27;s fulfillment network.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipToCountryCode The country code of the country to which the items will be shipped. Note that labeling requirements and item preparation instructions can vary by country. (required)
     * @param sellerSKUList     A list of SellerSKU values. Used to identify items for which you want labeling requirements and item preparation instructions for shipment to Amazon&#x27;s fulfillment network. The SellerSKU is qualified by the Seller ID, which is included with every call to the Seller Partner API.  Note: Include seller SKUs that you have used to list items on Amazon&#x27;s retail website. If you include a seller SKU that you have never used to list an item on Amazon&#x27;s retail website, the seller SKU is returned in the InvalidSKUList property in the response. (optional)
     * @param asINList          A list of ASIN values. Used to identify items for which you want item preparation instructions to help with item sourcing decisions.  Note: ASINs must be included in the product catalog for at least one of the marketplaces that the seller  participates in. Any ASIN that is not included in the product catalog for at least one of the marketplaces that the seller participates in is returned in the InvalidASINList property in the response. You can find out which marketplaces a seller participates in by calling the getMarketplaceParticipations operation in the Selling Partner API for Sellers. (optional)
     * @param callback          The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPrepInstructionsAsync(String shipToCountryCode, List<String> sellerSKUList, List<String> asINList, final ApiCallback<GetPrepInstructionsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getPrepInstructionsValidateBeforeCall(shipToCountryCode, sellerSKUList, asINList, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetPrepInstructionsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getShipmentItems
     *
     * @param queryType               Indicates whether items are returned using a date range (by providing the LastUpdatedAfter and LastUpdatedBefore parameters), or using NextToken, which continues returning items specified in a previous request. (required)
     * @param marketplaceId           A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param lastUpdatedAfter        A date used for selecting inbound shipment items that were last updated after (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param lastUpdatedBefore       A date used for selecting inbound shipment items that were last updated before (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param nextToken               A string token returned in the response to your previous request. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShipmentItemsCall(String queryType, String marketplaceId, OffsetDateTime lastUpdatedAfter, OffsetDateTime lastUpdatedBefore, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipmentItems";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (lastUpdatedAfter != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("LastUpdatedAfter", lastUpdatedAfter));
        if (lastUpdatedBefore != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("LastUpdatedBefore", lastUpdatedBefore));
        if (queryType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("QueryType", queryType));
        if (nextToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("NextToken", nextToken));
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MarketplaceId", marketplaceId));
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getShipmentItemsValidateBeforeCall(String queryType, String marketplaceId, OffsetDateTime lastUpdatedAfter, OffsetDateTime lastUpdatedBefore, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'queryType' is set
        if (queryType == null) {
            throw new ApiException("Missing the required parameter 'queryType' when calling getShipmentItems(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getShipmentItems(Async)");
        }
        com.squareup.okhttp.Call call = getShipmentItemsCall(queryType, marketplaceId, lastUpdatedAfter, lastUpdatedBefore, nextToken, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a list of items in a specified inbound shipment, or a list of items that were updated within a specified time frame.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param queryType         Indicates whether items are returned using a date range (by providing the LastUpdatedAfter and LastUpdatedBefore parameters), or using NextToken, which continues returning items specified in a previous request. (required)
     * @param marketplaceId     A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param lastUpdatedAfter  A date used for selecting inbound shipment items that were last updated after (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param lastUpdatedBefore A date used for selecting inbound shipment items that were last updated before (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param nextToken         A string token returned in the response to your previous request. (optional)
     * @return GetShipmentItemsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetShipmentItemsResponse getShipmentItems(String queryType, String marketplaceId, OffsetDateTime lastUpdatedAfter, OffsetDateTime lastUpdatedBefore, String nextToken) throws ApiException {
        ApiResponse<GetShipmentItemsResponse> resp = getShipmentItemsWithHttpInfo(queryType, marketplaceId, lastUpdatedAfter, lastUpdatedBefore, nextToken);
        return resp.getData();
    }

    /**
     * Returns a list of items in a specified inbound shipment, or a list of items that were updated within a specified time frame.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param queryType         Indicates whether items are returned using a date range (by providing the LastUpdatedAfter and LastUpdatedBefore parameters), or using NextToken, which continues returning items specified in a previous request. (required)
     * @param marketplaceId     A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param lastUpdatedAfter  A date used for selecting inbound shipment items that were last updated after (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param lastUpdatedBefore A date used for selecting inbound shipment items that were last updated before (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param nextToken         A string token returned in the response to your previous request. (optional)
     * @return ApiResponse&lt;GetShipmentItemsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetShipmentItemsResponse> getShipmentItemsWithHttpInfo(String queryType, String marketplaceId, OffsetDateTime lastUpdatedAfter, OffsetDateTime lastUpdatedBefore, String nextToken) throws ApiException {
        com.squareup.okhttp.Call call = getShipmentItemsValidateBeforeCall(queryType, marketplaceId, lastUpdatedAfter, lastUpdatedBefore, nextToken, null, null);
        Type localVarReturnType = new TypeToken<GetShipmentItemsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a list of items in a specified inbound shipment, or a list of items that were updated within a specified time frame.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param queryType         Indicates whether items are returned using a date range (by providing the LastUpdatedAfter and LastUpdatedBefore parameters), or using NextToken, which continues returning items specified in a previous request. (required)
     * @param marketplaceId     A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param lastUpdatedAfter  A date used for selecting inbound shipment items that were last updated after (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param lastUpdatedBefore A date used for selecting inbound shipment items that were last updated before (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param nextToken         A string token returned in the response to your previous request. (optional)
     * @param callback          The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShipmentItemsAsync(String queryType, String marketplaceId, OffsetDateTime lastUpdatedAfter, OffsetDateTime lastUpdatedBefore, String nextToken, final ApiCallback<GetShipmentItemsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getShipmentItemsValidateBeforeCall(queryType, marketplaceId, lastUpdatedAfter, lastUpdatedBefore, nextToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetShipmentItemsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getShipmentItemsByShipmentId
     *
     * @param shipmentId              A shipment identifier used for selecting items in a specific inbound shipment. (required)
     * @param marketplaceId           A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShipmentItemsByShipmentIdCall(String shipmentId, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments/{shipmentId}/items"
                .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MarketplaceId", marketplaceId));
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getShipmentItemsByShipmentIdValidateBeforeCall(String shipmentId, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling getShipmentItemsByShipmentId(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getShipmentItemsByShipmentId(Async)");
        }
        com.squareup.okhttp.Call call = getShipmentItemsByShipmentIdCall(shipmentId, marketplaceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a list of items in a specified inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId    A shipment identifier used for selecting items in a specific inbound shipment. (required)
     * @param marketplaceId A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @return GetShipmentItemsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetShipmentItemsResponse getShipmentItemsByShipmentId(String shipmentId, String marketplaceId) throws ApiException {
        ApiResponse<GetShipmentItemsResponse> resp = getShipmentItemsByShipmentIdWithHttpInfo(shipmentId, marketplaceId);
        return resp.getData();
    }

    /**
     * Returns a list of items in a specified inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId    A shipment identifier used for selecting items in a specific inbound shipment. (required)
     * @param marketplaceId A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @return ApiResponse&lt;GetShipmentItemsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetShipmentItemsResponse> getShipmentItemsByShipmentIdWithHttpInfo(String shipmentId, String marketplaceId) throws ApiException {
        com.squareup.okhttp.Call call = getShipmentItemsByShipmentIdValidateBeforeCall(shipmentId, marketplaceId, null, null);
        Type localVarReturnType = new TypeToken<GetShipmentItemsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a list of items in a specified inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId    A shipment identifier used for selecting items in a specific inbound shipment. (required)
     * @param marketplaceId A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShipmentItemsByShipmentIdAsync(String shipmentId, String marketplaceId, final ApiCallback<GetShipmentItemsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getShipmentItemsByShipmentIdValidateBeforeCall(shipmentId, marketplaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetShipmentItemsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getShipments
     *
     * @param queryType               Indicates whether shipments are returned using shipment information (by providing the ShipmentStatusList or ShipmentIdList parameters), using a date range (by providing the LastUpdatedAfter and LastUpdatedBefore parameters), or by using NextToken to continue returning items specified in a previous request. (required)
     * @param marketplaceId           A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param shipmentStatusList      A list of ShipmentStatus values. Used to select shipments with a current status that matches the status values that you specify. (optional)
     * @param shipmentIdList          A list of shipment IDs used to select the shipments that you want. If both ShipmentStatusList and ShipmentIdList are specified, only shipments that match both parameters are returned. (optional)
     * @param lastUpdatedAfter        A date used for selecting inbound shipments that were last updated after (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param lastUpdatedBefore       A date used for selecting inbound shipments that were last updated before (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param nextToken               A string token returned in the response to your previous request. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShipmentsCall(String queryType, String marketplaceId, List<String> shipmentStatusList, List<String> shipmentIdList, OffsetDateTime lastUpdatedAfter, OffsetDateTime lastUpdatedBefore, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (shipmentStatusList != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "ShipmentStatusList", shipmentStatusList));
        if (shipmentIdList != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "ShipmentIdList", shipmentIdList));
        if (lastUpdatedAfter != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("LastUpdatedAfter", lastUpdatedAfter));
        if (lastUpdatedBefore != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("LastUpdatedBefore", lastUpdatedBefore));
        if (queryType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("QueryType", queryType));
        if (nextToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("NextToken", nextToken));
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MarketplaceId", marketplaceId));
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getShipmentsValidateBeforeCall(String queryType, String marketplaceId, List<String> shipmentStatusList, List<String> shipmentIdList, OffsetDateTime lastUpdatedAfter, OffsetDateTime lastUpdatedBefore, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'queryType' is set
        if (queryType == null) {
            throw new ApiException("Missing the required parameter 'queryType' when calling getShipments(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getShipments(Async)");
        }
        com.squareup.okhttp.Call call = getShipmentsCall(queryType, marketplaceId, shipmentStatusList, shipmentIdList, lastUpdatedAfter, lastUpdatedBefore, nextToken, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a list of inbound shipments based on criteria that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param queryType          Indicates whether shipments are returned using shipment information (by providing the ShipmentStatusList or ShipmentIdList parameters), using a date range (by providing the LastUpdatedAfter and LastUpdatedBefore parameters), or by using NextToken to continue returning items specified in a previous request. (required)
     * @param marketplaceId      A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param shipmentStatusList A list of ShipmentStatus values. Used to select shipments with a current status that matches the status values that you specify. (optional)
     * @param shipmentIdList     A list of shipment IDs used to select the shipments that you want. If both ShipmentStatusList and ShipmentIdList are specified, only shipments that match both parameters are returned. (optional)
     * @param lastUpdatedAfter   A date used for selecting inbound shipments that were last updated after (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param lastUpdatedBefore  A date used for selecting inbound shipments that were last updated before (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param nextToken          A string token returned in the response to your previous request. (optional)
     * @return GetShipmentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetShipmentsResponse getShipments(String queryType, String marketplaceId, List<String> shipmentStatusList, List<String> shipmentIdList, OffsetDateTime lastUpdatedAfter, OffsetDateTime lastUpdatedBefore, String nextToken) throws ApiException {
        ApiResponse<GetShipmentsResponse> resp = getShipmentsWithHttpInfo(queryType, marketplaceId, shipmentStatusList, shipmentIdList, lastUpdatedAfter, lastUpdatedBefore, nextToken);
        return resp.getData();
    }

    /**
     * Returns a list of inbound shipments based on criteria that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param queryType          Indicates whether shipments are returned using shipment information (by providing the ShipmentStatusList or ShipmentIdList parameters), using a date range (by providing the LastUpdatedAfter and LastUpdatedBefore parameters), or by using NextToken to continue returning items specified in a previous request. (required)
     * @param marketplaceId      A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param shipmentStatusList A list of ShipmentStatus values. Used to select shipments with a current status that matches the status values that you specify. (optional)
     * @param shipmentIdList     A list of shipment IDs used to select the shipments that you want. If both ShipmentStatusList and ShipmentIdList are specified, only shipments that match both parameters are returned. (optional)
     * @param lastUpdatedAfter   A date used for selecting inbound shipments that were last updated after (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param lastUpdatedBefore  A date used for selecting inbound shipments that were last updated before (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param nextToken          A string token returned in the response to your previous request. (optional)
     * @return ApiResponse&lt;GetShipmentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetShipmentsResponse> getShipmentsWithHttpInfo(String queryType, String marketplaceId, List<String> shipmentStatusList, List<String> shipmentIdList, OffsetDateTime lastUpdatedAfter, OffsetDateTime lastUpdatedBefore, String nextToken) throws ApiException {
        com.squareup.okhttp.Call call = getShipmentsValidateBeforeCall(queryType, marketplaceId, shipmentStatusList, shipmentIdList, lastUpdatedAfter, lastUpdatedBefore, nextToken, null, null);
        Type localVarReturnType = new TypeToken<GetShipmentsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a list of inbound shipments based on criteria that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param queryType          Indicates whether shipments are returned using shipment information (by providing the ShipmentStatusList or ShipmentIdList parameters), using a date range (by providing the LastUpdatedAfter and LastUpdatedBefore parameters), or by using NextToken to continue returning items specified in a previous request. (required)
     * @param marketplaceId      A marketplace identifier. Specifies the marketplace where the product would be stored. (required)
     * @param shipmentStatusList A list of ShipmentStatus values. Used to select shipments with a current status that matches the status values that you specify. (optional)
     * @param shipmentIdList     A list of shipment IDs used to select the shipments that you want. If both ShipmentStatusList and ShipmentIdList are specified, only shipments that match both parameters are returned. (optional)
     * @param lastUpdatedAfter   A date used for selecting inbound shipments that were last updated after (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param lastUpdatedBefore  A date used for selecting inbound shipments that were last updated before (or at) a specified time. The selection includes updates made by Amazon and by the seller. (optional)
     * @param nextToken          A string token returned in the response to your previous request. (optional)
     * @param callback           The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShipmentsAsync(String queryType, String marketplaceId, List<String> shipmentStatusList, List<String> shipmentIdList, OffsetDateTime lastUpdatedAfter, OffsetDateTime lastUpdatedBefore, String nextToken, final ApiCallback<GetShipmentsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getShipmentsValidateBeforeCall(queryType, marketplaceId, shipmentStatusList, shipmentIdList, lastUpdatedAfter, lastUpdatedBefore, nextToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetShipmentsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getTransportDetails
     *
     * @param shipmentId              A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTransportDetailsCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments/{shipmentId}/transport"
                .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTransportDetailsValidateBeforeCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling getTransportDetails(Async)");
        }
        com.squareup.okhttp.Call call = getTransportDetailsCall(shipmentId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns current transportation information about an inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return GetTransportDetailsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetTransportDetailsResponse getTransportDetails(String shipmentId) throws ApiException {
        ApiResponse<GetTransportDetailsResponse> resp = getTransportDetailsWithHttpInfo(shipmentId);
        return resp.getData();
    }

    /**
     * Returns current transportation information about an inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return ApiResponse&lt;GetTransportDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetTransportDetailsResponse> getTransportDetailsWithHttpInfo(String shipmentId) throws ApiException {
        com.squareup.okhttp.Call call = getTransportDetailsValidateBeforeCall(shipmentId, null, null);
        Type localVarReturnType = new TypeToken<GetTransportDetailsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns current transportation information about an inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param callback   The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTransportDetailsAsync(String shipmentId, final ApiCallback<GetTransportDetailsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getTransportDetailsValidateBeforeCall(shipmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetTransportDetailsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for putTransportDetails
     *
     * @param body                    (required)
     * @param shipmentId              A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putTransportDetailsCall(PutTransportDetailsRequest body, String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments/{shipmentId}/transport"
                .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));
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
    private com.squareup.okhttp.Call putTransportDetailsValidateBeforeCall(PutTransportDetailsRequest body, String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling putTransportDetails(Async)");
        }
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling putTransportDetails(Async)");
        }
        com.squareup.okhttp.Call call = putTransportDetailsCall(body, shipmentId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Sends transportation information to Amazon about an inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body       (required)
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return PutTransportDetailsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PutTransportDetailsResponse putTransportDetails(PutTransportDetailsRequest body, String shipmentId) throws ApiException {
        ApiResponse<PutTransportDetailsResponse> resp = putTransportDetailsWithHttpInfo(body, shipmentId);
        return resp.getData();
    }

    /**
     * Sends transportation information to Amazon about an inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body       (required)
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return ApiResponse&lt;PutTransportDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PutTransportDetailsResponse> putTransportDetailsWithHttpInfo(PutTransportDetailsRequest body, String shipmentId) throws ApiException {
        com.squareup.okhttp.Call call = putTransportDetailsValidateBeforeCall(body, shipmentId, null, null);
        Type localVarReturnType = new TypeToken<PutTransportDetailsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Sends transportation information to Amazon about an inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body       (required)
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param callback   The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putTransportDetailsAsync(PutTransportDetailsRequest body, String shipmentId, final ApiCallback<PutTransportDetailsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = putTransportDetailsValidateBeforeCall(body, shipmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PutTransportDetailsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateInboundShipment
     *
     * @param body                    (required)
     * @param shipmentId              A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateInboundShipmentCall(InboundShipmentRequest body, String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments/{shipmentId}"
                .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));
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
    private com.squareup.okhttp.Call updateInboundShipmentValidateBeforeCall(InboundShipmentRequest body, String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateInboundShipment(Async)");
        }
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling updateInboundShipment(Async)");
        }
        com.squareup.okhttp.Call call = updateInboundShipmentCall(body, shipmentId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Updates or removes items from the inbound shipment identified by the specified shipment identifier. Adding new items is not supported.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body       (required)
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return InboundShipmentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InboundShipmentResponse updateInboundShipment(InboundShipmentRequest body, String shipmentId) throws ApiException {
        ApiResponse<InboundShipmentResponse> resp = updateInboundShipmentWithHttpInfo(body, shipmentId);
        return resp.getData();
    }

    /**
     * Updates or removes items from the inbound shipment identified by the specified shipment identifier. Adding new items is not supported.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body       (required)
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return ApiResponse&lt;InboundShipmentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InboundShipmentResponse> updateInboundShipmentWithHttpInfo(InboundShipmentRequest body, String shipmentId) throws ApiException {
        com.squareup.okhttp.Call call = updateInboundShipmentValidateBeforeCall(body, shipmentId, null, null);
        Type localVarReturnType = new TypeToken<InboundShipmentResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Updates or removes items from the inbound shipment identified by the specified shipment identifier. Adding new items is not supported.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body       (required)
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param callback   The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateInboundShipmentAsync(InboundShipmentRequest body, String shipmentId, final ApiCallback<InboundShipmentResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = updateInboundShipmentValidateBeforeCall(body, shipmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InboundShipmentResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for voidTransport
     *
     * @param shipmentId              A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call voidTransportCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/inbound/v0/shipments/{shipmentId}/transport/void"
                .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call voidTransportValidateBeforeCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling voidTransport(Async)");
        }
        com.squareup.okhttp.Call call = voidTransportCall(shipmentId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Cancels a previously-confirmed request to ship an inbound shipment using an Amazon-partnered carrier.  To be successful, you must call this operation before the VoidDeadline date that is returned by the getTransportDetails operation.  Important: The VoidDeadline date is 24 hours after you confirm a Small Parcel shipment transportation request or one hour after you confirm a Less Than Truckload/Full Truckload (LTL/FTL) shipment transportation request. After the void deadline passes, your account will be charged for the shipping cost.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return VoidTransportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VoidTransportResponse voidTransport(String shipmentId) throws ApiException {
        ApiResponse<VoidTransportResponse> resp = voidTransportWithHttpInfo(shipmentId);
        return resp.getData();
    }

    /**
     * Cancels a previously-confirmed request to ship an inbound shipment using an Amazon-partnered carrier.  To be successful, you must call this operation before the VoidDeadline date that is returned by the getTransportDetails operation.  Important: The VoidDeadline date is 24 hours after you confirm a Small Parcel shipment transportation request or one hour after you confirm a Less Than Truckload/Full Truckload (LTL/FTL) shipment transportation request. After the void deadline passes, your account will be charged for the shipping cost.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @return ApiResponse&lt;VoidTransportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VoidTransportResponse> voidTransportWithHttpInfo(String shipmentId) throws ApiException {
        com.squareup.okhttp.Call call = voidTransportValidateBeforeCall(shipmentId, null, null);
        Type localVarReturnType = new TypeToken<VoidTransportResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Cancels a previously-confirmed request to ship an inbound shipment using an Amazon-partnered carrier.  To be successful, you must call this operation before the VoidDeadline date that is returned by the getTransportDetails operation.  Important: The VoidDeadline date is 24 hours after you confirm a Small Parcel shipment transportation request or one hour after you confirm a Less Than Truckload/Full Truckload (LTL/FTL) shipment transportation request. After the void deadline passes, your account will be charged for the shipping cost.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param shipmentId A shipment identifier originally returned by the createInboundShipmentPlan operation. (required)
     * @param callback   The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call voidTransportAsync(String shipmentId, final ApiCallback<VoidTransportResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = voidTransportValidateBeforeCall(shipmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VoidTransportResponse>() {
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

        public FbaInboundApi build() {
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
            return new FbaInboundApi(new ApiClient()
                    .setAWSSigV4Signer(awsSigV4Signer)
                    .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                    .setBasePath(endpoint)
                    .setRateLimiter(rateLimitConfiguration));
        }
    }
}
