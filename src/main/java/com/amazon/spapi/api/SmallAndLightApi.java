package com.amazon.spapi.api;

import com.amazon.SellingPartnerAPIAA.*;
import com.amazon.spapi.client.*;
import com.amazon.spapi.models.fbasmallandlight.SmallAndLightEligibility;
import com.amazon.spapi.models.fbasmallandlight.SmallAndLightEnrollment;
import com.amazon.spapi.models.fbasmallandlight.SmallAndLightFeePreviewRequest;
import com.amazon.spapi.models.fbasmallandlight.SmallAndLightFeePreviews;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmallAndLightApi {
    private ApiClient apiClient;

    SmallAndLightApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SmallAndLightApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteSmallAndLightEnrollmentBySellerSKU
     *
     * @param sellerSKU               The seller SKU that identifies the item. (required)
     * @param marketplaceIds          The marketplace in which to remove the item from the Small and Light program. Note: Accepts a single marketplace only. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSmallAndLightEnrollmentBySellerSKUCall(String sellerSKU, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/smallAndLight/v1/enrollments/{sellerSKU}"
                .replaceAll("\\{" + "sellerSKU" + "\\}", apiClient.escapeString(sellerSKU.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteSmallAndLightEnrollmentBySellerSKUValidateBeforeCall(String sellerSKU, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'sellerSKU' is set
        if (sellerSKU == null) {
            throw new ApiException("Missing the required parameter 'sellerSKU' when calling deleteSmallAndLightEnrollmentBySellerSKU(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling deleteSmallAndLightEnrollmentBySellerSKU(Async)");
        }
        com.squareup.okhttp.Call call = deleteSmallAndLightEnrollmentBySellerSKUCall(sellerSKU, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Removes the item indicated by the specified seller SKU from the Small and Light program in the specified marketplace. If the item is not eligible for disenrollment, the ineligibility reasons are returned.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSKU      The seller SKU that identifies the item. (required)
     * @param marketplaceIds The marketplace in which to remove the item from the Small and Light program. Note: Accepts a single marketplace only. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteSmallAndLightEnrollmentBySellerSKU(String sellerSKU, List<String> marketplaceIds) throws ApiException {
        deleteSmallAndLightEnrollmentBySellerSKUWithHttpInfo(sellerSKU, marketplaceIds);
    }

    /**
     * Removes the item indicated by the specified seller SKU from the Small and Light program in the specified marketplace. If the item is not eligible for disenrollment, the ineligibility reasons are returned.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSKU      The seller SKU that identifies the item. (required)
     * @param marketplaceIds The marketplace in which to remove the item from the Small and Light program. Note: Accepts a single marketplace only. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteSmallAndLightEnrollmentBySellerSKUWithHttpInfo(String sellerSKU, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = deleteSmallAndLightEnrollmentBySellerSKUValidateBeforeCall(sellerSKU, marketplaceIds, null, null);
        return apiClient.execute(call);
    }

    /**
     * (asynchronously)
     * Removes the item indicated by the specified seller SKU from the Small and Light program in the specified marketplace. If the item is not eligible for disenrollment, the ineligibility reasons are returned.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSKU      The seller SKU that identifies the item. (required)
     * @param marketplaceIds The marketplace in which to remove the item from the Small and Light program. Note: Accepts a single marketplace only. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSmallAndLightEnrollmentBySellerSKUAsync(String sellerSKU, List<String> marketplaceIds, final ApiCallback<Void> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = deleteSmallAndLightEnrollmentBySellerSKUValidateBeforeCall(sellerSKU, marketplaceIds, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    /**
     * Build call for getSmallAndLightEligibilityBySellerSKU
     *
     * @param sellerSKU               The seller SKU that identifies the item. (required)
     * @param marketplaceIds          The marketplace for which the eligibility status is retrieved. NOTE: Accepts a single marketplace only. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSmallAndLightEligibilityBySellerSKUCall(String sellerSKU, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/smallAndLight/v1/eligibilities/{sellerSKU}"
                .replaceAll("\\{" + "sellerSKU" + "\\}", apiClient.escapeString(sellerSKU.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
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
    private com.squareup.okhttp.Call getSmallAndLightEligibilityBySellerSKUValidateBeforeCall(String sellerSKU, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'sellerSKU' is set
        if (sellerSKU == null) {
            throw new ApiException("Missing the required parameter 'sellerSKU' when calling getSmallAndLightEligibilityBySellerSKU(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling getSmallAndLightEligibilityBySellerSKU(Async)");
        }
        com.squareup.okhttp.Call call = getSmallAndLightEligibilityBySellerSKUCall(sellerSKU, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns the Small and Light program eligibility status of the item indicated by the specified seller SKU in the specified marketplace. If the item is not eligible, the ineligibility reasons are returned.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSKU      The seller SKU that identifies the item. (required)
     * @param marketplaceIds The marketplace for which the eligibility status is retrieved. NOTE: Accepts a single marketplace only. (required)
     * @return SmallAndLightEligibility
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmallAndLightEligibility getSmallAndLightEligibilityBySellerSKU(String sellerSKU, List<String> marketplaceIds) throws ApiException {
        ApiResponse<SmallAndLightEligibility> resp = getSmallAndLightEligibilityBySellerSKUWithHttpInfo(sellerSKU, marketplaceIds);
        return resp.getData();
    }

    /**
     * Returns the Small and Light program eligibility status of the item indicated by the specified seller SKU in the specified marketplace. If the item is not eligible, the ineligibility reasons are returned.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSKU      The seller SKU that identifies the item. (required)
     * @param marketplaceIds The marketplace for which the eligibility status is retrieved. NOTE: Accepts a single marketplace only. (required)
     * @return ApiResponse&lt;SmallAndLightEligibility&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmallAndLightEligibility> getSmallAndLightEligibilityBySellerSKUWithHttpInfo(String sellerSKU, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = getSmallAndLightEligibilityBySellerSKUValidateBeforeCall(sellerSKU, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<SmallAndLightEligibility>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns the Small and Light program eligibility status of the item indicated by the specified seller SKU in the specified marketplace. If the item is not eligible, the ineligibility reasons are returned.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSKU      The seller SKU that identifies the item. (required)
     * @param marketplaceIds The marketplace for which the eligibility status is retrieved. NOTE: Accepts a single marketplace only. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSmallAndLightEligibilityBySellerSKUAsync(String sellerSKU, List<String> marketplaceIds, final ApiCallback<SmallAndLightEligibility> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getSmallAndLightEligibilityBySellerSKUValidateBeforeCall(sellerSKU, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmallAndLightEligibility>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getSmallAndLightEnrollmentBySellerSKU
     *
     * @param sellerSKU               The seller SKU that identifies the item. (required)
     * @param marketplaceIds          The marketplace for which the enrollment status is retrieved. Note: Accepts a single marketplace only. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSmallAndLightEnrollmentBySellerSKUCall(String sellerSKU, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/smallAndLight/v1/enrollments/{sellerSKU}"
                .replaceAll("\\{" + "sellerSKU" + "\\}", apiClient.escapeString(sellerSKU.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
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
    private com.squareup.okhttp.Call getSmallAndLightEnrollmentBySellerSKUValidateBeforeCall(String sellerSKU, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'sellerSKU' is set
        if (sellerSKU == null) {
            throw new ApiException("Missing the required parameter 'sellerSKU' when calling getSmallAndLightEnrollmentBySellerSKU(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling getSmallAndLightEnrollmentBySellerSKU(Async)");
        }
        com.squareup.okhttp.Call call = getSmallAndLightEnrollmentBySellerSKUCall(sellerSKU, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns the Small and Light enrollment status for the item indicated by the specified seller SKU in the specified marketplace.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSKU      The seller SKU that identifies the item. (required)
     * @param marketplaceIds The marketplace for which the enrollment status is retrieved. Note: Accepts a single marketplace only. (required)
     * @return SmallAndLightEnrollment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmallAndLightEnrollment getSmallAndLightEnrollmentBySellerSKU(String sellerSKU, List<String> marketplaceIds) throws ApiException {
        ApiResponse<SmallAndLightEnrollment> resp = getSmallAndLightEnrollmentBySellerSKUWithHttpInfo(sellerSKU, marketplaceIds);
        return resp.getData();
    }

    /**
     * Returns the Small and Light enrollment status for the item indicated by the specified seller SKU in the specified marketplace.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSKU      The seller SKU that identifies the item. (required)
     * @param marketplaceIds The marketplace for which the enrollment status is retrieved. Note: Accepts a single marketplace only. (required)
     * @return ApiResponse&lt;SmallAndLightEnrollment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmallAndLightEnrollment> getSmallAndLightEnrollmentBySellerSKUWithHttpInfo(String sellerSKU, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = getSmallAndLightEnrollmentBySellerSKUValidateBeforeCall(sellerSKU, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<SmallAndLightEnrollment>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns the Small and Light enrollment status for the item indicated by the specified seller SKU in the specified marketplace.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSKU      The seller SKU that identifies the item. (required)
     * @param marketplaceIds The marketplace for which the enrollment status is retrieved. Note: Accepts a single marketplace only. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSmallAndLightEnrollmentBySellerSKUAsync(String sellerSKU, List<String> marketplaceIds, final ApiCallback<SmallAndLightEnrollment> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getSmallAndLightEnrollmentBySellerSKUValidateBeforeCall(sellerSKU, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmallAndLightEnrollment>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getSmallAndLightFeePreview
     *
     * @param body                    (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSmallAndLightFeePreviewCall(SmallAndLightFeePreviewRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/fba/smallAndLight/v1/feePreviews";
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
    private com.squareup.okhttp.Call getSmallAndLightFeePreviewValidateBeforeCall(SmallAndLightFeePreviewRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getSmallAndLightFeePreview(Async)");
        }
        com.squareup.okhttp.Call call = getSmallAndLightFeePreviewCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns the Small and Light fee estimates for the specified items. You must include a marketplaceId parameter to retrieve the proper fee estimates for items to be sold in that marketplace. The ordering of items in the response will mirror the order of the items in the request. Duplicate ASIN/price combinations are removed.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 3 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body (required)
     * @return SmallAndLightFeePreviews
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmallAndLightFeePreviews getSmallAndLightFeePreview(SmallAndLightFeePreviewRequest body) throws ApiException {
        ApiResponse<SmallAndLightFeePreviews> resp = getSmallAndLightFeePreviewWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Returns the Small and Light fee estimates for the specified items. You must include a marketplaceId parameter to retrieve the proper fee estimates for items to be sold in that marketplace. The ordering of items in the response will mirror the order of the items in the request. Duplicate ASIN/price combinations are removed.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 3 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body (required)
     * @return ApiResponse&lt;SmallAndLightFeePreviews&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmallAndLightFeePreviews> getSmallAndLightFeePreviewWithHttpInfo(SmallAndLightFeePreviewRequest body) throws ApiException {
        com.squareup.okhttp.Call call = getSmallAndLightFeePreviewValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<SmallAndLightFeePreviews>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns the Small and Light fee estimates for the specified items. You must include a marketplaceId parameter to retrieve the proper fee estimates for items to be sold in that marketplace. The ordering of items in the response will mirror the order of the items in the request. Duplicate ASIN/price combinations are removed.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 3 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body     (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSmallAndLightFeePreviewAsync(SmallAndLightFeePreviewRequest body, final ApiCallback<SmallAndLightFeePreviews> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getSmallAndLightFeePreviewValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmallAndLightFeePreviews>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for putSmallAndLightEnrollmentBySellerSKU
     *
     * @param sellerSKU               The seller SKU that identifies the item. (required)
     * @param marketplaceIds          The marketplace in which to enroll the item. Note: Accepts a single marketplace only. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSmallAndLightEnrollmentBySellerSKUCall(String sellerSKU, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/fba/smallAndLight/v1/enrollments/{sellerSKU}"
                .replaceAll("\\{" + "sellerSKU" + "\\}", apiClient.escapeString(sellerSKU.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
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
    private com.squareup.okhttp.Call putSmallAndLightEnrollmentBySellerSKUValidateBeforeCall(String sellerSKU, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'sellerSKU' is set
        if (sellerSKU == null) {
            throw new ApiException("Missing the required parameter 'sellerSKU' when calling putSmallAndLightEnrollmentBySellerSKU(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling putSmallAndLightEnrollmentBySellerSKU(Async)");
        }
        com.squareup.okhttp.Call call = putSmallAndLightEnrollmentBySellerSKUCall(sellerSKU, marketplaceIds, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Enrolls the item indicated by the specified seller SKU in the Small and Light program in the specified marketplace. If the item is not eligible, the ineligibility reasons are returned.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSKU      The seller SKU that identifies the item. (required)
     * @param marketplaceIds The marketplace in which to enroll the item. Note: Accepts a single marketplace only. (required)
     * @return SmallAndLightEnrollment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmallAndLightEnrollment putSmallAndLightEnrollmentBySellerSKU(String sellerSKU, List<String> marketplaceIds) throws ApiException {
        ApiResponse<SmallAndLightEnrollment> resp = putSmallAndLightEnrollmentBySellerSKUWithHttpInfo(sellerSKU, marketplaceIds);
        return resp.getData();
    }

    /**
     * Enrolls the item indicated by the specified seller SKU in the Small and Light program in the specified marketplace. If the item is not eligible, the ineligibility reasons are returned.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSKU      The seller SKU that identifies the item. (required)
     * @param marketplaceIds The marketplace in which to enroll the item. Note: Accepts a single marketplace only. (required)
     * @return ApiResponse&lt;SmallAndLightEnrollment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmallAndLightEnrollment> putSmallAndLightEnrollmentBySellerSKUWithHttpInfo(String sellerSKU, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = putSmallAndLightEnrollmentBySellerSKUValidateBeforeCall(sellerSKU, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<SmallAndLightEnrollment>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Enrolls the item indicated by the specified seller SKU in the Small and Light program in the specified marketplace. If the item is not eligible, the ineligibility reasons are returned.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param sellerSKU      The seller SKU that identifies the item. (required)
     * @param marketplaceIds The marketplace in which to enroll the item. Note: Accepts a single marketplace only. (required)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSmallAndLightEnrollmentBySellerSKUAsync(String sellerSKU, List<String> marketplaceIds, final ApiCallback<SmallAndLightEnrollment> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = putSmallAndLightEnrollmentBySellerSKUValidateBeforeCall(sellerSKU, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmallAndLightEnrollment>() {
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

        public SmallAndLightApi build() {
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
            return new SmallAndLightApi(new ApiClient()
                    .setAWSSigV4Signer(awsSigV4Signer)
                    .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                    .setBasePath(endpoint)
                    .setRateLimiter(rateLimitConfiguration));
        }
    }
}
