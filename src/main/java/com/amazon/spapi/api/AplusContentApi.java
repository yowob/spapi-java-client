package com.amazon.spapi.api;

import com.amazon.SellingPartnerAPIAA.*;
import com.amazon.spapi.client.*;
import com.amazon.spapi.models.apluscontent.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AplusContentApi {
    private ApiClient apiClient;

    AplusContentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AplusContentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createContentDocument
     *
     * @param body                    The content document request details. (required)
     * @param marketplaceId           The identifier for the marketplace where the A+ Content is published. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createContentDocumentCall(PostContentDocumentRequest body, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/aplus/2020-11-01/contentDocuments";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
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
    private com.squareup.okhttp.Call createContentDocumentValidateBeforeCall(PostContentDocumentRequest body, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createContentDocument(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling createContentDocument(Async)");
        }
        com.squareup.okhttp.Call call = createContentDocumentCall(body, marketplaceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Creates a new A+ Content document.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body          The content document request details. (required)
     * @param marketplaceId The identifier for the marketplace where the A+ Content is published. (required)
     * @return PostContentDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostContentDocumentResponse createContentDocument(PostContentDocumentRequest body, String marketplaceId) throws ApiException {
        ApiResponse<PostContentDocumentResponse> resp = createContentDocumentWithHttpInfo(body, marketplaceId);
        return resp.getData();
    }

    /**
     * Creates a new A+ Content document.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body          The content document request details. (required)
     * @param marketplaceId The identifier for the marketplace where the A+ Content is published. (required)
     * @return ApiResponse&lt;PostContentDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostContentDocumentResponse> createContentDocumentWithHttpInfo(PostContentDocumentRequest body, String marketplaceId) throws ApiException {
        com.squareup.okhttp.Call call = createContentDocumentValidateBeforeCall(body, marketplaceId, null, null);
        Type localVarReturnType = new TypeToken<PostContentDocumentResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Creates a new A+ Content document.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body          The content document request details. (required)
     * @param marketplaceId The identifier for the marketplace where the A+ Content is published. (required)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createContentDocumentAsync(PostContentDocumentRequest body, String marketplaceId, final ApiCallback<PostContentDocumentResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = createContentDocumentValidateBeforeCall(body, marketplaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostContentDocumentResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getContentDocument
     *
     * @param contentReferenceKey     The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier. (required)
     * @param marketplaceId           The identifier for the marketplace where the A+ Content is published. (required)
     * @param includedDataSet         The set of A+ Content data types to include in the response. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getContentDocumentCall(String contentReferenceKey, String marketplaceId, List<String> includedDataSet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/aplus/2020-11-01/contentDocuments/{contentReferenceKey}"
                .replaceAll("\\{" + "contentReferenceKey" + "\\}", apiClient.escapeString(contentReferenceKey.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
        if (includedDataSet != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "includedDataSet", includedDataSet));
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
    private com.squareup.okhttp.Call getContentDocumentValidateBeforeCall(String contentReferenceKey, String marketplaceId, List<String> includedDataSet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'contentReferenceKey' is set
        if (contentReferenceKey == null) {
            throw new ApiException("Missing the required parameter 'contentReferenceKey' when calling getContentDocument(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getContentDocument(Async)");
        }
        // verify the required parameter 'includedDataSet' is set
        if (includedDataSet == null) {
            throw new ApiException("Missing the required parameter 'includedDataSet' when calling getContentDocument(Async)");
        }
        com.squareup.okhttp.Call call = getContentDocumentCall(contentReferenceKey, marketplaceId, includedDataSet, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns an A+ Content document, if available.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @param includedDataSet     The set of A+ Content data types to include in the response. (required)
     * @return GetContentDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetContentDocumentResponse getContentDocument(String contentReferenceKey, String marketplaceId, List<String> includedDataSet) throws ApiException {
        ApiResponse<GetContentDocumentResponse> resp = getContentDocumentWithHttpInfo(contentReferenceKey, marketplaceId, includedDataSet);
        return resp.getData();
    }

    /**
     * Returns an A+ Content document, if available.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @param includedDataSet     The set of A+ Content data types to include in the response. (required)
     * @return ApiResponse&lt;GetContentDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetContentDocumentResponse> getContentDocumentWithHttpInfo(String contentReferenceKey, String marketplaceId, List<String> includedDataSet) throws ApiException {
        com.squareup.okhttp.Call call = getContentDocumentValidateBeforeCall(contentReferenceKey, marketplaceId, includedDataSet, null, null);
        Type localVarReturnType = new TypeToken<GetContentDocumentResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns an A+ Content document, if available.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @param includedDataSet     The set of A+ Content data types to include in the response. (required)
     * @param callback            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContentDocumentAsync(String contentReferenceKey, String marketplaceId, List<String> includedDataSet, final ApiCallback<GetContentDocumentResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getContentDocumentValidateBeforeCall(contentReferenceKey, marketplaceId, includedDataSet, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetContentDocumentResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for listContentDocumentAsinRelations
     *
     * @param contentReferenceKey     The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier. (required)
     * @param marketplaceId           The identifier for the marketplace where the A+ Content is published. (required)
     * @param includedDataSet         The set of A+ Content data types to include in the response. If you do not include this parameter, the operation returns the related ASINs without metadata. (optional)
     * @param asinSet                 The set of ASINs. (optional)
     * @param pageToken               A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listContentDocumentAsinRelationsCall(String contentReferenceKey, String marketplaceId, List<String> includedDataSet, List<String> asinSet, String pageToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/aplus/2020-11-01/contentDocuments/{contentReferenceKey}/asins"
                .replaceAll("\\{" + "contentReferenceKey" + "\\}", apiClient.escapeString(contentReferenceKey.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
        if (includedDataSet != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "includedDataSet", includedDataSet));
        if (asinSet != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "asinSet", asinSet));
        if (pageToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("pageToken", pageToken));
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
    private com.squareup.okhttp.Call listContentDocumentAsinRelationsValidateBeforeCall(String contentReferenceKey, String marketplaceId, List<String> includedDataSet, List<String> asinSet, String pageToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'contentReferenceKey' is set
        if (contentReferenceKey == null) {
            throw new ApiException("Missing the required parameter 'contentReferenceKey' when calling listContentDocumentAsinRelations(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling listContentDocumentAsinRelations(Async)");
        }
        com.squareup.okhttp.Call call = listContentDocumentAsinRelationsCall(contentReferenceKey, marketplaceId, includedDataSet, asinSet, pageToken, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a list of ASINs related to the specified A+ Content document, if available. If you do not include the asinSet parameter, the operation returns all ASINs related to the content document.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @param includedDataSet     The set of A+ Content data types to include in the response. If you do not include this parameter, the operation returns the related ASINs without metadata. (optional)
     * @param asinSet             The set of ASINs. (optional)
     * @param pageToken           A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations. (optional)
     * @return ListContentDocumentAsinRelationsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListContentDocumentAsinRelationsResponse listContentDocumentAsinRelations(String contentReferenceKey, String marketplaceId, List<String> includedDataSet, List<String> asinSet, String pageToken) throws ApiException {
        ApiResponse<ListContentDocumentAsinRelationsResponse> resp = listContentDocumentAsinRelationsWithHttpInfo(contentReferenceKey, marketplaceId, includedDataSet, asinSet, pageToken);
        return resp.getData();
    }

    /**
     * Returns a list of ASINs related to the specified A+ Content document, if available. If you do not include the asinSet parameter, the operation returns all ASINs related to the content document.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @param includedDataSet     The set of A+ Content data types to include in the response. If you do not include this parameter, the operation returns the related ASINs without metadata. (optional)
     * @param asinSet             The set of ASINs. (optional)
     * @param pageToken           A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations. (optional)
     * @return ApiResponse&lt;ListContentDocumentAsinRelationsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListContentDocumentAsinRelationsResponse> listContentDocumentAsinRelationsWithHttpInfo(String contentReferenceKey, String marketplaceId, List<String> includedDataSet, List<String> asinSet, String pageToken) throws ApiException {
        com.squareup.okhttp.Call call = listContentDocumentAsinRelationsValidateBeforeCall(contentReferenceKey, marketplaceId, includedDataSet, asinSet, pageToken, null, null);
        Type localVarReturnType = new TypeToken<ListContentDocumentAsinRelationsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a list of ASINs related to the specified A+ Content document, if available. If you do not include the asinSet parameter, the operation returns all ASINs related to the content document.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @param includedDataSet     The set of A+ Content data types to include in the response. If you do not include this parameter, the operation returns the related ASINs without metadata. (optional)
     * @param asinSet             The set of ASINs. (optional)
     * @param pageToken           A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations. (optional)
     * @param callback            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listContentDocumentAsinRelationsAsync(String contentReferenceKey, String marketplaceId, List<String> includedDataSet, List<String> asinSet, String pageToken, final ApiCallback<ListContentDocumentAsinRelationsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = listContentDocumentAsinRelationsValidateBeforeCall(contentReferenceKey, marketplaceId, includedDataSet, asinSet, pageToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListContentDocumentAsinRelationsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for postContentDocumentApprovalSubmission
     *
     * @param contentReferenceKey     The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier. (required)
     * @param marketplaceId           The identifier for the marketplace where the A+ Content is published. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postContentDocumentApprovalSubmissionCall(String contentReferenceKey, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/aplus/2020-11-01/contentDocuments/{contentReferenceKey}/approvalSubmissions"
                .replaceAll("\\{" + "contentReferenceKey" + "\\}", apiClient.escapeString(contentReferenceKey.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
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
    private com.squareup.okhttp.Call postContentDocumentApprovalSubmissionValidateBeforeCall(String contentReferenceKey, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'contentReferenceKey' is set
        if (contentReferenceKey == null) {
            throw new ApiException("Missing the required parameter 'contentReferenceKey' when calling postContentDocumentApprovalSubmission(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling postContentDocumentApprovalSubmission(Async)");
        }
        com.squareup.okhttp.Call call = postContentDocumentApprovalSubmissionCall(contentReferenceKey, marketplaceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Submits an A+ Content document for review, approval, and publishing.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @return PostContentDocumentApprovalSubmissionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostContentDocumentApprovalSubmissionResponse postContentDocumentApprovalSubmission(String contentReferenceKey, String marketplaceId) throws ApiException {
        ApiResponse<PostContentDocumentApprovalSubmissionResponse> resp = postContentDocumentApprovalSubmissionWithHttpInfo(contentReferenceKey, marketplaceId);
        return resp.getData();
    }

    /**
     * Submits an A+ Content document for review, approval, and publishing.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @return ApiResponse&lt;PostContentDocumentApprovalSubmissionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostContentDocumentApprovalSubmissionResponse> postContentDocumentApprovalSubmissionWithHttpInfo(String contentReferenceKey, String marketplaceId) throws ApiException {
        com.squareup.okhttp.Call call = postContentDocumentApprovalSubmissionValidateBeforeCall(contentReferenceKey, marketplaceId, null, null);
        Type localVarReturnType = new TypeToken<PostContentDocumentApprovalSubmissionResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Submits an A+ Content document for review, approval, and publishing.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @param callback            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postContentDocumentApprovalSubmissionAsync(String contentReferenceKey, String marketplaceId, final ApiCallback<PostContentDocumentApprovalSubmissionResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = postContentDocumentApprovalSubmissionValidateBeforeCall(contentReferenceKey, marketplaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostContentDocumentApprovalSubmissionResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for postContentDocumentAsinRelations
     *
     * @param body                    The content document ASIN relations request details. (required)
     * @param contentReferenceKey     The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier. (required)
     * @param marketplaceId           The identifier for the marketplace where the A+ Content is published. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postContentDocumentAsinRelationsCall(PostContentDocumentAsinRelationsRequest body, String contentReferenceKey, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/aplus/2020-11-01/contentDocuments/{contentReferenceKey}/asins"
                .replaceAll("\\{" + "contentReferenceKey" + "\\}", apiClient.escapeString(contentReferenceKey.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
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
    private com.squareup.okhttp.Call postContentDocumentAsinRelationsValidateBeforeCall(PostContentDocumentAsinRelationsRequest body, String contentReferenceKey, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postContentDocumentAsinRelations(Async)");
        }
        // verify the required parameter 'contentReferenceKey' is set
        if (contentReferenceKey == null) {
            throw new ApiException("Missing the required parameter 'contentReferenceKey' when calling postContentDocumentAsinRelations(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling postContentDocumentAsinRelations(Async)");
        }
        com.squareup.okhttp.Call call = postContentDocumentAsinRelationsCall(body, contentReferenceKey, marketplaceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Replaces all ASINs related to the specified A+ Content document, if available. This may add or remove ASINs, depending on the current set of related ASINs. Removing an ASIN has the side effect of suspending the content document from that ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body                The content document ASIN relations request details. (required)
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @return PostContentDocumentAsinRelationsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostContentDocumentAsinRelationsResponse postContentDocumentAsinRelations(PostContentDocumentAsinRelationsRequest body, String contentReferenceKey, String marketplaceId) throws ApiException {
        ApiResponse<PostContentDocumentAsinRelationsResponse> resp = postContentDocumentAsinRelationsWithHttpInfo(body, contentReferenceKey, marketplaceId);
        return resp.getData();
    }

    /**
     * Replaces all ASINs related to the specified A+ Content document, if available. This may add or remove ASINs, depending on the current set of related ASINs. Removing an ASIN has the side effect of suspending the content document from that ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body                The content document ASIN relations request details. (required)
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @return ApiResponse&lt;PostContentDocumentAsinRelationsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostContentDocumentAsinRelationsResponse> postContentDocumentAsinRelationsWithHttpInfo(PostContentDocumentAsinRelationsRequest body, String contentReferenceKey, String marketplaceId) throws ApiException {
        com.squareup.okhttp.Call call = postContentDocumentAsinRelationsValidateBeforeCall(body, contentReferenceKey, marketplaceId, null, null);
        Type localVarReturnType = new TypeToken<PostContentDocumentAsinRelationsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Replaces all ASINs related to the specified A+ Content document, if available. This may add or remove ASINs, depending on the current set of related ASINs. Removing an ASIN has the side effect of suspending the content document from that ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body                The content document ASIN relations request details. (required)
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @param callback            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postContentDocumentAsinRelationsAsync(PostContentDocumentAsinRelationsRequest body, String contentReferenceKey, String marketplaceId, final ApiCallback<PostContentDocumentAsinRelationsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = postContentDocumentAsinRelationsValidateBeforeCall(body, contentReferenceKey, marketplaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostContentDocumentAsinRelationsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for postContentDocumentSuspendSubmission
     *
     * @param contentReferenceKey     The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier. (required)
     * @param marketplaceId           The identifier for the marketplace where the A+ Content is published. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postContentDocumentSuspendSubmissionCall(String contentReferenceKey, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/aplus/2020-11-01/contentDocuments/{contentReferenceKey}/suspendSubmissions"
                .replaceAll("\\{" + "contentReferenceKey" + "\\}", apiClient.escapeString(contentReferenceKey.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
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
    private com.squareup.okhttp.Call postContentDocumentSuspendSubmissionValidateBeforeCall(String contentReferenceKey, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'contentReferenceKey' is set
        if (contentReferenceKey == null) {
            throw new ApiException("Missing the required parameter 'contentReferenceKey' when calling postContentDocumentSuspendSubmission(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling postContentDocumentSuspendSubmission(Async)");
        }
        com.squareup.okhttp.Call call = postContentDocumentSuspendSubmissionCall(contentReferenceKey, marketplaceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Submits a request to suspend visible A+ Content. This neither deletes the content document nor the ASIN relations.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @return PostContentDocumentSuspendSubmissionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostContentDocumentSuspendSubmissionResponse postContentDocumentSuspendSubmission(String contentReferenceKey, String marketplaceId) throws ApiException {
        ApiResponse<PostContentDocumentSuspendSubmissionResponse> resp = postContentDocumentSuspendSubmissionWithHttpInfo(contentReferenceKey, marketplaceId);
        return resp.getData();
    }

    /**
     * Submits a request to suspend visible A+ Content. This neither deletes the content document nor the ASIN relations.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @return ApiResponse&lt;PostContentDocumentSuspendSubmissionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostContentDocumentSuspendSubmissionResponse> postContentDocumentSuspendSubmissionWithHttpInfo(String contentReferenceKey, String marketplaceId) throws ApiException {
        com.squareup.okhttp.Call call = postContentDocumentSuspendSubmissionValidateBeforeCall(contentReferenceKey, marketplaceId, null, null);
        Type localVarReturnType = new TypeToken<PostContentDocumentSuspendSubmissionResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Submits a request to suspend visible A+ Content. This neither deletes the content document nor the ASIN relations.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @param callback            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postContentDocumentSuspendSubmissionAsync(String contentReferenceKey, String marketplaceId, final ApiCallback<PostContentDocumentSuspendSubmissionResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = postContentDocumentSuspendSubmissionValidateBeforeCall(contentReferenceKey, marketplaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostContentDocumentSuspendSubmissionResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for searchContentDocuments
     *
     * @param marketplaceId           The identifier for the marketplace where the A+ Content is published. (required)
     * @param pageToken               A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchContentDocumentsCall(String marketplaceId, String pageToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/aplus/2020-11-01/contentDocuments";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
        if (pageToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("pageToken", pageToken));
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
    private com.squareup.okhttp.Call searchContentDocumentsValidateBeforeCall(String marketplaceId, String pageToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling searchContentDocuments(Async)");
        }
        com.squareup.okhttp.Call call = searchContentDocumentsCall(marketplaceId, pageToken, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns a list of all A+ Content documents assigned to a selling partner. This operation returns only the metadata of the A+ Content documents. Call the getContentDocument operation to get the actual contents of the A+ Content documents.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The identifier for the marketplace where the A+ Content is published. (required)
     * @param pageToken     A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations. (optional)
     * @return SearchContentDocumentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchContentDocumentsResponse searchContentDocuments(String marketplaceId, String pageToken) throws ApiException {
        ApiResponse<SearchContentDocumentsResponse> resp = searchContentDocumentsWithHttpInfo(marketplaceId, pageToken);
        return resp.getData();
    }

    /**
     * Returns a list of all A+ Content documents assigned to a selling partner. This operation returns only the metadata of the A+ Content documents. Call the getContentDocument operation to get the actual contents of the A+ Content documents.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The identifier for the marketplace where the A+ Content is published. (required)
     * @param pageToken     A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations. (optional)
     * @return ApiResponse&lt;SearchContentDocumentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchContentDocumentsResponse> searchContentDocumentsWithHttpInfo(String marketplaceId, String pageToken) throws ApiException {
        com.squareup.okhttp.Call call = searchContentDocumentsValidateBeforeCall(marketplaceId, pageToken, null, null);
        Type localVarReturnType = new TypeToken<SearchContentDocumentsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns a list of all A+ Content documents assigned to a selling partner. This operation returns only the metadata of the A+ Content documents. Call the getContentDocument operation to get the actual contents of the A+ Content documents.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The identifier for the marketplace where the A+ Content is published. (required)
     * @param pageToken     A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations. (optional)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchContentDocumentsAsync(String marketplaceId, String pageToken, final ApiCallback<SearchContentDocumentsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = searchContentDocumentsValidateBeforeCall(marketplaceId, pageToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchContentDocumentsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for searchContentPublishRecords
     *
     * @param marketplaceId           The identifier for the marketplace where the A+ Content is published. (required)
     * @param asin                    The Amazon Standard Identification Number (ASIN). (required)
     * @param pageToken               A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchContentPublishRecordsCall(String marketplaceId, String asin, String pageToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/aplus/2020-11-01/contentPublishRecords";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
        if (asin != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("asin", asin));
        if (pageToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("pageToken", pageToken));
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
    private com.squareup.okhttp.Call searchContentPublishRecordsValidateBeforeCall(String marketplaceId, String asin, String pageToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling searchContentPublishRecords(Async)");
        }
        // verify the required parameter 'asin' is set
        if (asin == null) {
            throw new ApiException("Missing the required parameter 'asin' when calling searchContentPublishRecords(Async)");
        }
        com.squareup.okhttp.Call call = searchContentPublishRecordsCall(marketplaceId, asin, pageToken, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Searches for A+ Content publishing records, if available.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The identifier for the marketplace where the A+ Content is published. (required)
     * @param asin          The Amazon Standard Identification Number (ASIN). (required)
     * @param pageToken     A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations. (optional)
     * @return SearchContentPublishRecordsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchContentPublishRecordsResponse searchContentPublishRecords(String marketplaceId, String asin, String pageToken) throws ApiException {
        ApiResponse<SearchContentPublishRecordsResponse> resp = searchContentPublishRecordsWithHttpInfo(marketplaceId, asin, pageToken);
        return resp.getData();
    }

    /**
     * Searches for A+ Content publishing records, if available.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The identifier for the marketplace where the A+ Content is published. (required)
     * @param asin          The Amazon Standard Identification Number (ASIN). (required)
     * @param pageToken     A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations. (optional)
     * @return ApiResponse&lt;SearchContentPublishRecordsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchContentPublishRecordsResponse> searchContentPublishRecordsWithHttpInfo(String marketplaceId, String asin, String pageToken) throws ApiException {
        com.squareup.okhttp.Call call = searchContentPublishRecordsValidateBeforeCall(marketplaceId, asin, pageToken, null, null);
        Type localVarReturnType = new TypeToken<SearchContentPublishRecordsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Searches for A+ Content publishing records, if available.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId The identifier for the marketplace where the A+ Content is published. (required)
     * @param asin          The Amazon Standard Identification Number (ASIN). (required)
     * @param pageToken     A page token from the nextPageToken response element returned by your previous call to this operation. nextPageToken is returned when the results of a call exceed the page size. To get the next page of results, call the operation and include pageToken as the only parameter. Specifying pageToken with any other parameter will cause the request to fail. When no nextPageToken value is returned there are no more pages to return. A pageToken value is not usable across different operations. (optional)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchContentPublishRecordsAsync(String marketplaceId, String asin, String pageToken, final ApiCallback<SearchContentPublishRecordsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = searchContentPublishRecordsValidateBeforeCall(marketplaceId, asin, pageToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchContentPublishRecordsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateContentDocument
     *
     * @param body                    The content document request details. (required)
     * @param contentReferenceKey     The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier. (required)
     * @param marketplaceId           The identifier for the marketplace where the A+ Content is published. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateContentDocumentCall(PostContentDocumentRequest body, String contentReferenceKey, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/aplus/2020-11-01/contentDocuments/{contentReferenceKey}"
                .replaceAll("\\{" + "contentReferenceKey" + "\\}", apiClient.escapeString(contentReferenceKey.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
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
    private com.squareup.okhttp.Call updateContentDocumentValidateBeforeCall(PostContentDocumentRequest body, String contentReferenceKey, String marketplaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateContentDocument(Async)");
        }
        // verify the required parameter 'contentReferenceKey' is set
        if (contentReferenceKey == null) {
            throw new ApiException("Missing the required parameter 'contentReferenceKey' when calling updateContentDocument(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling updateContentDocument(Async)");
        }
        com.squareup.okhttp.Call call = updateContentDocumentCall(body, contentReferenceKey, marketplaceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Updates an existing A+ Content document.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body                The content document request details. (required)
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @return PostContentDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostContentDocumentResponse updateContentDocument(PostContentDocumentRequest body, String contentReferenceKey, String marketplaceId) throws ApiException {
        ApiResponse<PostContentDocumentResponse> resp = updateContentDocumentWithHttpInfo(body, contentReferenceKey, marketplaceId);
        return resp.getData();
    }

    /**
     * Updates an existing A+ Content document.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body                The content document request details. (required)
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @return ApiResponse&lt;PostContentDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostContentDocumentResponse> updateContentDocumentWithHttpInfo(PostContentDocumentRequest body, String contentReferenceKey, String marketplaceId) throws ApiException {
        com.squareup.okhttp.Call call = updateContentDocumentValidateBeforeCall(body, contentReferenceKey, marketplaceId, null, null);
        Type localVarReturnType = new TypeToken<PostContentDocumentResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Updates an existing A+ Content document.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body                The content document request details. (required)
     * @param contentReferenceKey The unique reference key for the A+ Content document. A content reference key cannot form a permalink and may change in the future. A content reference key is not guaranteed to match any A+ Content identifier. (required)
     * @param marketplaceId       The identifier for the marketplace where the A+ Content is published. (required)
     * @param callback            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateContentDocumentAsync(PostContentDocumentRequest body, String contentReferenceKey, String marketplaceId, final ApiCallback<PostContentDocumentResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = updateContentDocumentValidateBeforeCall(body, contentReferenceKey, marketplaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostContentDocumentResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for validateContentDocumentAsinRelations
     *
     * @param body                    The content document request details. (required)
     * @param marketplaceId           The identifier for the marketplace where the A+ Content is published. (required)
     * @param asinSet                 The set of ASINs. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call validateContentDocumentAsinRelationsCall(PostContentDocumentRequest body, String marketplaceId, List<String> asinSet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/aplus/2020-11-01/contentAsinValidations";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("marketplaceId", marketplaceId));
        if (asinSet != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "asinSet", asinSet));
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
    private com.squareup.okhttp.Call validateContentDocumentAsinRelationsValidateBeforeCall(PostContentDocumentRequest body, String marketplaceId, List<String> asinSet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling validateContentDocumentAsinRelations(Async)");
        }
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling validateContentDocumentAsinRelations(Async)");
        }
        com.squareup.okhttp.Call call = validateContentDocumentAsinRelationsCall(body, marketplaceId, asinSet, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Checks if the A+ Content document is valid for use on a set of ASINs.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body          The content document request details. (required)
     * @param marketplaceId The identifier for the marketplace where the A+ Content is published. (required)
     * @param asinSet       The set of ASINs. (optional)
     * @return ValidateContentDocumentAsinRelationsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ValidateContentDocumentAsinRelationsResponse validateContentDocumentAsinRelations(PostContentDocumentRequest body, String marketplaceId, List<String> asinSet) throws ApiException {
        ApiResponse<ValidateContentDocumentAsinRelationsResponse> resp = validateContentDocumentAsinRelationsWithHttpInfo(body, marketplaceId, asinSet);
        return resp.getData();
    }

    /**
     * Checks if the A+ Content document is valid for use on a set of ASINs.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body          The content document request details. (required)
     * @param marketplaceId The identifier for the marketplace where the A+ Content is published. (required)
     * @param asinSet       The set of ASINs. (optional)
     * @return ApiResponse&lt;ValidateContentDocumentAsinRelationsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ValidateContentDocumentAsinRelationsResponse> validateContentDocumentAsinRelationsWithHttpInfo(PostContentDocumentRequest body, String marketplaceId, List<String> asinSet) throws ApiException {
        com.squareup.okhttp.Call call = validateContentDocumentAsinRelationsValidateBeforeCall(body, marketplaceId, asinSet, null, null);
        Type localVarReturnType = new TypeToken<ValidateContentDocumentAsinRelationsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Checks if the A+ Content document is valid for use on a set of ASINs.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body          The content document request details. (required)
     * @param marketplaceId The identifier for the marketplace where the A+ Content is published. (required)
     * @param asinSet       The set of ASINs. (optional)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call validateContentDocumentAsinRelationsAsync(PostContentDocumentRequest body, String marketplaceId, List<String> asinSet, final ApiCallback<ValidateContentDocumentAsinRelationsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = validateContentDocumentAsinRelationsValidateBeforeCall(body, marketplaceId, asinSet, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ValidateContentDocumentAsinRelationsResponse>() {
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

        public AplusContentApi build() {
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
            return new AplusContentApi(new ApiClient()
                    .setAWSSigV4Signer(awsSigV4Signer)
                    .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                    .setBasePath(endpoint)
                    .setRateLimiter(rateLimitConfiguration));
        }
    }
}
