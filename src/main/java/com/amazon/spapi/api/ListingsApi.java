package com.amazon.spapi.api;

import com.amazon.SellingPartnerAPIAA.*;
import com.amazon.spapi.client.*;
import com.amazon.spapi.models.listingsitems.ListingsItemPatchRequest;
import com.amazon.spapi.models.listingsitems.ListingsItemPutRequest;
import com.amazon.spapi.models.listingsitems.ListingsItemSubmissionResponse;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListingsApi {
    private ApiClient apiClient;

    ListingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ListingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteListingsItem
     *
     * @param sellerId                A selling partner identifier, such as a merchant account or vendor code. (required)
     * @param sku                     A selling partner provided identifier for an Amazon listing. (required)
     * @param marketplaceIds          A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param issueLocale             A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteListingsItemCall(String sellerId, String sku, List<String> marketplaceIds, String issueLocale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/listings/2020-09-01/items/{sellerId}/{sku}"
                .replaceAll("\\{" + "sellerId" + "\\}", apiClient.escapeString(sellerId.toString()))
                .replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        if (issueLocale != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("issueLocale", issueLocale));
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
    private com.squareup.okhttp.Call deleteListingsItemValidateBeforeCall(String sellerId, String sku, List<String> marketplaceIds, String issueLocale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'sellerId' is set
        if (sellerId == null) {
            throw new ApiException("Missing the required parameter 'sellerId' when calling deleteListingsItem(Async)");
        }
        // verify the required parameter 'sku' is set
        if (sku == null) {
            throw new ApiException("Missing the required parameter 'sku' when calling deleteListingsItem(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling deleteListingsItem(Async)");
        }
        com.squareup.okhttp.Call call = deleteListingsItemCall(sellerId, sku, marketplaceIds, issueLocale, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Delete a listings item for a selling partner.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @param sellerId       A selling partner identifier, such as a merchant account or vendor code. (required)
     * @param sku            A selling partner provided identifier for an Amazon listing. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param issueLocale    A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @return ListingsItemSubmissionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListingsItemSubmissionResponse deleteListingsItem(String sellerId, String sku, List<String> marketplaceIds, String issueLocale) throws ApiException {
        ApiResponse<ListingsItemSubmissionResponse> resp = deleteListingsItemWithHttpInfo(sellerId, sku, marketplaceIds, issueLocale);
        return resp.getData();
    }

    /**
     * Delete a listings item for a selling partner.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @param sellerId       A selling partner identifier, such as a merchant account or vendor code. (required)
     * @param sku            A selling partner provided identifier for an Amazon listing. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param issueLocale    A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @return ApiResponse&lt;ListingsItemSubmissionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListingsItemSubmissionResponse> deleteListingsItemWithHttpInfo(String sellerId, String sku, List<String> marketplaceIds, String issueLocale) throws ApiException {
        com.squareup.okhttp.Call call = deleteListingsItemValidateBeforeCall(sellerId, sku, marketplaceIds, issueLocale, null, null);
        Type localVarReturnType = new TypeToken<ListingsItemSubmissionResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Delete a listings item for a selling partner.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @param sellerId       A selling partner identifier, such as a merchant account or vendor code. (required)
     * @param sku            A selling partner provided identifier for an Amazon listing. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param issueLocale    A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteListingsItemAsync(String sellerId, String sku, List<String> marketplaceIds, String issueLocale, final ApiCallback<ListingsItemSubmissionResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = deleteListingsItemValidateBeforeCall(sellerId, sku, marketplaceIds, issueLocale, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListingsItemSubmissionResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for patchListingsItem
     *
     * @param body                    The request body schema for the patchListingsItem operation. (required)
     * @param sellerId                A selling partner identifier, such as a merchant account or vendor code. (required)
     * @param sku                     A selling partner provided identifier for an Amazon listing. (required)
     * @param marketplaceIds          A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param issueLocale             A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call patchListingsItemCall(ListingsItemPatchRequest body, String sellerId, String sku, List<String> marketplaceIds, String issueLocale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/listings/2020-09-01/items/{sellerId}/{sku}"
                .replaceAll("\\{" + "sellerId" + "\\}", apiClient.escapeString(sellerId.toString()))
                .replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        if (issueLocale != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("issueLocale", issueLocale));
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call patchListingsItemValidateBeforeCall(ListingsItemPatchRequest body, String sellerId, String sku, List<String> marketplaceIds, String issueLocale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchListingsItem(Async)");
        }
        // verify the required parameter 'sellerId' is set
        if (sellerId == null) {
            throw new ApiException("Missing the required parameter 'sellerId' when calling patchListingsItem(Async)");
        }
        // verify the required parameter 'sku' is set
        if (sku == null) {
            throw new ApiException("Missing the required parameter 'sku' when calling patchListingsItem(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling patchListingsItem(Async)");
        }
        com.squareup.okhttp.Call call = patchListingsItemCall(body, sellerId, sku, marketplaceIds, issueLocale, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Partially update (patch) a listings item for a selling partner. Only top-level listings item attributes can be patched. Patching nested attributes is not supported.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @param body           The request body schema for the patchListingsItem operation. (required)
     * @param sellerId       A selling partner identifier, such as a merchant account or vendor code. (required)
     * @param sku            A selling partner provided identifier for an Amazon listing. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param issueLocale    A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @return ListingsItemSubmissionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListingsItemSubmissionResponse patchListingsItem(ListingsItemPatchRequest body, String sellerId, String sku, List<String> marketplaceIds, String issueLocale) throws ApiException {
        ApiResponse<ListingsItemSubmissionResponse> resp = patchListingsItemWithHttpInfo(body, sellerId, sku, marketplaceIds, issueLocale);
        return resp.getData();
    }

    /**
     * Partially update (patch) a listings item for a selling partner. Only top-level listings item attributes can be patched. Patching nested attributes is not supported.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @param body           The request body schema for the patchListingsItem operation. (required)
     * @param sellerId       A selling partner identifier, such as a merchant account or vendor code. (required)
     * @param sku            A selling partner provided identifier for an Amazon listing. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param issueLocale    A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @return ApiResponse&lt;ListingsItemSubmissionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListingsItemSubmissionResponse> patchListingsItemWithHttpInfo(ListingsItemPatchRequest body, String sellerId, String sku, List<String> marketplaceIds, String issueLocale) throws ApiException {
        com.squareup.okhttp.Call call = patchListingsItemValidateBeforeCall(body, sellerId, sku, marketplaceIds, issueLocale, null, null);
        Type localVarReturnType = new TypeToken<ListingsItemSubmissionResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Partially update (patch) a listings item for a selling partner. Only top-level listings item attributes can be patched. Patching nested attributes is not supported.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @param body           The request body schema for the patchListingsItem operation. (required)
     * @param sellerId       A selling partner identifier, such as a merchant account or vendor code. (required)
     * @param sku            A selling partner provided identifier for an Amazon listing. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param issueLocale    A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call patchListingsItemAsync(ListingsItemPatchRequest body, String sellerId, String sku, List<String> marketplaceIds, String issueLocale, final ApiCallback<ListingsItemSubmissionResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = patchListingsItemValidateBeforeCall(body, sellerId, sku, marketplaceIds, issueLocale, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListingsItemSubmissionResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for putListingsItem
     *
     * @param body                    The request body schema for the putListingsItem operation. (required)
     * @param sellerId                A selling partner identifier, such as a merchant account or vendor code. (required)
     * @param sku                     A selling partner provided identifier for an Amazon listing. (required)
     * @param marketplaceIds          A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param issueLocale             A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putListingsItemCall(ListingsItemPutRequest body, String sellerId, String sku, List<String> marketplaceIds, String issueLocale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/listings/2020-09-01/items/{sellerId}/{sku}"
                .replaceAll("\\{" + "sellerId" + "\\}", apiClient.escapeString(sellerId.toString()))
                .replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        if (issueLocale != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("issueLocale", issueLocale));
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
    private com.squareup.okhttp.Call putListingsItemValidateBeforeCall(ListingsItemPutRequest body, String sellerId, String sku, List<String> marketplaceIds, String issueLocale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling putListingsItem(Async)");
        }
        // verify the required parameter 'sellerId' is set
        if (sellerId == null) {
            throw new ApiException("Missing the required parameter 'sellerId' when calling putListingsItem(Async)");
        }
        // verify the required parameter 'sku' is set
        if (sku == null) {
            throw new ApiException("Missing the required parameter 'sku' when calling putListingsItem(Async)");
        }
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling putListingsItem(Async)");
        }
        com.squareup.okhttp.Call call = putListingsItemCall(body, sellerId, sku, marketplaceIds, issueLocale, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Creates a new or fully-updates an existing listings item for a selling partner.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @param body           The request body schema for the putListingsItem operation. (required)
     * @param sellerId       A selling partner identifier, such as a merchant account or vendor code. (required)
     * @param sku            A selling partner provided identifier for an Amazon listing. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param issueLocale    A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @return ListingsItemSubmissionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListingsItemSubmissionResponse putListingsItem(ListingsItemPutRequest body, String sellerId, String sku, List<String> marketplaceIds, String issueLocale) throws ApiException {
        ApiResponse<ListingsItemSubmissionResponse> resp = putListingsItemWithHttpInfo(body, sellerId, sku, marketplaceIds, issueLocale);
        return resp.getData();
    }

    /**
     * Creates a new or fully-updates an existing listings item for a selling partner.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @param body           The request body schema for the putListingsItem operation. (required)
     * @param sellerId       A selling partner identifier, such as a merchant account or vendor code. (required)
     * @param sku            A selling partner provided identifier for an Amazon listing. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param issueLocale    A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @return ApiResponse&lt;ListingsItemSubmissionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListingsItemSubmissionResponse> putListingsItemWithHttpInfo(ListingsItemPutRequest body, String sellerId, String sku, List<String> marketplaceIds, String issueLocale) throws ApiException {
        com.squareup.okhttp.Call call = putListingsItemValidateBeforeCall(body, sellerId, sku, marketplaceIds, issueLocale, null, null);
        Type localVarReturnType = new TypeToken<ListingsItemSubmissionResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Creates a new or fully-updates an existing listings item for a selling partner.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @param body           The request body schema for the putListingsItem operation. (required)
     * @param sellerId       A selling partner identifier, such as a merchant account or vendor code. (required)
     * @param sku            A selling partner provided identifier for an Amazon listing. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param issueLocale    A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putListingsItemAsync(ListingsItemPutRequest body, String sellerId, String sku, List<String> marketplaceIds, String issueLocale, final ApiCallback<ListingsItemSubmissionResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = putListingsItemValidateBeforeCall(body, sellerId, sku, marketplaceIds, issueLocale, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListingsItemSubmissionResponse>() {
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

        public ListingsApi build() {
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
            return new ListingsApi(new ApiClient()
                    .setAWSSigV4Signer(awsSigV4Signer)
                    .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                    .setBasePath(endpoint)
                    .setRateLimiter(rateLimitConfiguration));
        }
    }
}
