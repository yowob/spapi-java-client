package com.amazon.spapi.api;

import com.amazon.SellingPartnerAPIAA.*;
import com.amazon.spapi.client.*;
import com.amazon.spapi.models.finances.ListFinancialEventGroupsResponse;
import com.amazon.spapi.models.finances.ListFinancialEventsResponse;
import com.google.gson.reflect.TypeToken;
import org.threeten.bp.OffsetDateTime;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listFinancialEventGroups
     *
     * @param maxResultsPerPage                The maximum number of results to return per page. (optional, default to 100)
     * @param financialEventGroupStartedBefore A date used for selecting financial event groups that opened before (but not at) a specified date and time, in ISO 8601 format. The date-time  must be later than FinancialEventGroupStartedAfter and no later than two minutes before the request was submitted. If FinancialEventGroupStartedAfter and FinancialEventGroupStartedBefore are more than 180 days apart, no financial event groups are returned. (optional)
     * @param financialEventGroupStartedAfter  A date used for selecting financial event groups that opened after (or at) a specified date and time, in ISO 8601 format. The date-time must be no later than two minutes before the request was submitted. (optional)
     * @param nextToken                        A string token returned in the response of your previous request. (optional)
     * @param progressListener                 Progress listener
     * @param progressRequestListener          Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listFinancialEventGroupsCall(Integer maxResultsPerPage, OffsetDateTime financialEventGroupStartedBefore, OffsetDateTime financialEventGroupStartedAfter, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/finances/v0/financialEventGroups";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxResultsPerPage != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MaxResultsPerPage", maxResultsPerPage));
        if (financialEventGroupStartedBefore != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("FinancialEventGroupStartedBefore", financialEventGroupStartedBefore));
        if (financialEventGroupStartedAfter != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("FinancialEventGroupStartedAfter", financialEventGroupStartedAfter));
        if (nextToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("NextToken", nextToken));
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
    private com.squareup.okhttp.Call listFinancialEventGroupsValidateBeforeCall(Integer maxResultsPerPage, OffsetDateTime financialEventGroupStartedBefore, OffsetDateTime financialEventGroupStartedAfter, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        com.squareup.okhttp.Call call = listFinancialEventGroupsCall(maxResultsPerPage, financialEventGroupStartedBefore, financialEventGroupStartedAfter, nextToken, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns financial event groups for a given date range.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param maxResultsPerPage                The maximum number of results to return per page. (optional, default to 100)
     * @param financialEventGroupStartedBefore A date used for selecting financial event groups that opened before (but not at) a specified date and time, in ISO 8601 format. The date-time  must be later than FinancialEventGroupStartedAfter and no later than two minutes before the request was submitted. If FinancialEventGroupStartedAfter and FinancialEventGroupStartedBefore are more than 180 days apart, no financial event groups are returned. (optional)
     * @param financialEventGroupStartedAfter  A date used for selecting financial event groups that opened after (or at) a specified date and time, in ISO 8601 format. The date-time must be no later than two minutes before the request was submitted. (optional)
     * @param nextToken                        A string token returned in the response of your previous request. (optional)
     * @return ListFinancialEventGroupsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListFinancialEventGroupsResponse listFinancialEventGroups(Integer maxResultsPerPage, OffsetDateTime financialEventGroupStartedBefore, OffsetDateTime financialEventGroupStartedAfter, String nextToken) throws ApiException {
        ApiResponse<ListFinancialEventGroupsResponse> resp = listFinancialEventGroupsWithHttpInfo(maxResultsPerPage, financialEventGroupStartedBefore, financialEventGroupStartedAfter, nextToken);
        return resp.getData();
    }

    /**
     * Returns financial event groups for a given date range.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param maxResultsPerPage                The maximum number of results to return per page. (optional, default to 100)
     * @param financialEventGroupStartedBefore A date used for selecting financial event groups that opened before (but not at) a specified date and time, in ISO 8601 format. The date-time  must be later than FinancialEventGroupStartedAfter and no later than two minutes before the request was submitted. If FinancialEventGroupStartedAfter and FinancialEventGroupStartedBefore are more than 180 days apart, no financial event groups are returned. (optional)
     * @param financialEventGroupStartedAfter  A date used for selecting financial event groups that opened after (or at) a specified date and time, in ISO 8601 format. The date-time must be no later than two minutes before the request was submitted. (optional)
     * @param nextToken                        A string token returned in the response of your previous request. (optional)
     * @return ApiResponse&lt;ListFinancialEventGroupsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListFinancialEventGroupsResponse> listFinancialEventGroupsWithHttpInfo(Integer maxResultsPerPage, OffsetDateTime financialEventGroupStartedBefore, OffsetDateTime financialEventGroupStartedAfter, String nextToken) throws ApiException {
        com.squareup.okhttp.Call call = listFinancialEventGroupsValidateBeforeCall(maxResultsPerPage, financialEventGroupStartedBefore, financialEventGroupStartedAfter, nextToken, null, null);
        Type localVarReturnType = new TypeToken<ListFinancialEventGroupsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns financial event groups for a given date range.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param maxResultsPerPage                The maximum number of results to return per page. (optional, default to 100)
     * @param financialEventGroupStartedBefore A date used for selecting financial event groups that opened before (but not at) a specified date and time, in ISO 8601 format. The date-time  must be later than FinancialEventGroupStartedAfter and no later than two minutes before the request was submitted. If FinancialEventGroupStartedAfter and FinancialEventGroupStartedBefore are more than 180 days apart, no financial event groups are returned. (optional)
     * @param financialEventGroupStartedAfter  A date used for selecting financial event groups that opened after (or at) a specified date and time, in ISO 8601 format. The date-time must be no later than two minutes before the request was submitted. (optional)
     * @param nextToken                        A string token returned in the response of your previous request. (optional)
     * @param callback                         The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFinancialEventGroupsAsync(Integer maxResultsPerPage, OffsetDateTime financialEventGroupStartedBefore, OffsetDateTime financialEventGroupStartedAfter, String nextToken, final ApiCallback<ListFinancialEventGroupsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = listFinancialEventGroupsValidateBeforeCall(maxResultsPerPage, financialEventGroupStartedBefore, financialEventGroupStartedAfter, nextToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListFinancialEventGroupsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for listFinancialEvents
     *
     * @param maxResultsPerPage       The maximum number of results to return per page. (optional, default to 100)
     * @param postedAfter             A date used for selecting financial events posted after (or at) a specified time. The date-time must be no later than two minutes before the request was submitted, in ISO 8601 date time format. (optional)
     * @param postedBefore            A date used for selecting financial events posted before (but not at) a specified time. The date-time must be later than PostedAfter and no later than two minutes before the request was submitted, in ISO 8601 date time format. If PostedAfter and PostedBefore are more than 180 days apart, no financial events are returned. You must specify the PostedAfter parameter if you specify the PostedBefore parameter. Default: Now minus two minutes. (optional)
     * @param nextToken               A string token returned in the response of your previous request. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listFinancialEventsCall(Integer maxResultsPerPage, OffsetDateTime postedAfter, OffsetDateTime postedBefore, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/finances/v0/financialEvents";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxResultsPerPage != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MaxResultsPerPage", maxResultsPerPage));
        if (postedAfter != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("PostedAfter", postedAfter));
        if (postedBefore != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("PostedBefore", postedBefore));
        if (nextToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("NextToken", nextToken));
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
    private com.squareup.okhttp.Call listFinancialEventsValidateBeforeCall(Integer maxResultsPerPage, OffsetDateTime postedAfter, OffsetDateTime postedBefore, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        com.squareup.okhttp.Call call = listFinancialEventsCall(maxResultsPerPage, postedAfter, postedBefore, nextToken, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns financial events for the specified data range.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param maxResultsPerPage The maximum number of results to return per page. (optional, default to 100)
     * @param postedAfter       A date used for selecting financial events posted after (or at) a specified time. The date-time must be no later than two minutes before the request was submitted, in ISO 8601 date time format. (optional)
     * @param postedBefore      A date used for selecting financial events posted before (but not at) a specified time. The date-time must be later than PostedAfter and no later than two minutes before the request was submitted, in ISO 8601 date time format. If PostedAfter and PostedBefore are more than 180 days apart, no financial events are returned. You must specify the PostedAfter parameter if you specify the PostedBefore parameter. Default: Now minus two minutes. (optional)
     * @param nextToken         A string token returned in the response of your previous request. (optional)
     * @return ListFinancialEventsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListFinancialEventsResponse listFinancialEvents(Integer maxResultsPerPage, OffsetDateTime postedAfter, OffsetDateTime postedBefore, String nextToken) throws ApiException {
        ApiResponse<ListFinancialEventsResponse> resp = listFinancialEventsWithHttpInfo(maxResultsPerPage, postedAfter, postedBefore, nextToken);
        return resp.getData();
    }

    /**
     * Returns financial events for the specified data range.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param maxResultsPerPage The maximum number of results to return per page. (optional, default to 100)
     * @param postedAfter       A date used for selecting financial events posted after (or at) a specified time. The date-time must be no later than two minutes before the request was submitted, in ISO 8601 date time format. (optional)
     * @param postedBefore      A date used for selecting financial events posted before (but not at) a specified time. The date-time must be later than PostedAfter and no later than two minutes before the request was submitted, in ISO 8601 date time format. If PostedAfter and PostedBefore are more than 180 days apart, no financial events are returned. You must specify the PostedAfter parameter if you specify the PostedBefore parameter. Default: Now minus two minutes. (optional)
     * @param nextToken         A string token returned in the response of your previous request. (optional)
     * @return ApiResponse&lt;ListFinancialEventsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListFinancialEventsResponse> listFinancialEventsWithHttpInfo(Integer maxResultsPerPage, OffsetDateTime postedAfter, OffsetDateTime postedBefore, String nextToken) throws ApiException {
        com.squareup.okhttp.Call call = listFinancialEventsValidateBeforeCall(maxResultsPerPage, postedAfter, postedBefore, nextToken, null, null);
        Type localVarReturnType = new TypeToken<ListFinancialEventsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns financial events for the specified data range.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param maxResultsPerPage The maximum number of results to return per page. (optional, default to 100)
     * @param postedAfter       A date used for selecting financial events posted after (or at) a specified time. The date-time must be no later than two minutes before the request was submitted, in ISO 8601 date time format. (optional)
     * @param postedBefore      A date used for selecting financial events posted before (but not at) a specified time. The date-time must be later than PostedAfter and no later than two minutes before the request was submitted, in ISO 8601 date time format. If PostedAfter and PostedBefore are more than 180 days apart, no financial events are returned. You must specify the PostedAfter parameter if you specify the PostedBefore parameter. Default: Now minus two minutes. (optional)
     * @param nextToken         A string token returned in the response of your previous request. (optional)
     * @param callback          The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFinancialEventsAsync(Integer maxResultsPerPage, OffsetDateTime postedAfter, OffsetDateTime postedBefore, String nextToken, final ApiCallback<ListFinancialEventsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = listFinancialEventsValidateBeforeCall(maxResultsPerPage, postedAfter, postedBefore, nextToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListFinancialEventsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for listFinancialEventsByGroupId
     *
     * @param eventGroupId            The identifier of the financial event group to which the events belong. (required)
     * @param maxResultsPerPage       The maximum number of results to return per page. (optional, default to 100)
     * @param nextToken               A string token returned in the response of your previous request. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listFinancialEventsByGroupIdCall(String eventGroupId, Integer maxResultsPerPage, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/finances/v0/financialEventGroups/{eventGroupId}/financialEvents"
                .replaceAll("\\{" + "eventGroupId" + "\\}", apiClient.escapeString(eventGroupId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxResultsPerPage != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MaxResultsPerPage", maxResultsPerPage));
        if (nextToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("NextToken", nextToken));
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
    private com.squareup.okhttp.Call listFinancialEventsByGroupIdValidateBeforeCall(String eventGroupId, Integer maxResultsPerPage, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'eventGroupId' is set
        if (eventGroupId == null) {
            throw new ApiException("Missing the required parameter 'eventGroupId' when calling listFinancialEventsByGroupId(Async)");
        }
        com.squareup.okhttp.Call call = listFinancialEventsByGroupIdCall(eventGroupId, maxResultsPerPage, nextToken, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns all financial events for the specified financial event group.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param eventGroupId      The identifier of the financial event group to which the events belong. (required)
     * @param maxResultsPerPage The maximum number of results to return per page. (optional, default to 100)
     * @param nextToken         A string token returned in the response of your previous request. (optional)
     * @return ListFinancialEventsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListFinancialEventsResponse listFinancialEventsByGroupId(String eventGroupId, Integer maxResultsPerPage, String nextToken) throws ApiException {
        ApiResponse<ListFinancialEventsResponse> resp = listFinancialEventsByGroupIdWithHttpInfo(eventGroupId, maxResultsPerPage, nextToken);
        return resp.getData();
    }

    /**
     * Returns all financial events for the specified financial event group.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param eventGroupId      The identifier of the financial event group to which the events belong. (required)
     * @param maxResultsPerPage The maximum number of results to return per page. (optional, default to 100)
     * @param nextToken         A string token returned in the response of your previous request. (optional)
     * @return ApiResponse&lt;ListFinancialEventsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListFinancialEventsResponse> listFinancialEventsByGroupIdWithHttpInfo(String eventGroupId, Integer maxResultsPerPage, String nextToken) throws ApiException {
        com.squareup.okhttp.Call call = listFinancialEventsByGroupIdValidateBeforeCall(eventGroupId, maxResultsPerPage, nextToken, null, null);
        Type localVarReturnType = new TypeToken<ListFinancialEventsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns all financial events for the specified financial event group.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param eventGroupId      The identifier of the financial event group to which the events belong. (required)
     * @param maxResultsPerPage The maximum number of results to return per page. (optional, default to 100)
     * @param nextToken         A string token returned in the response of your previous request. (optional)
     * @param callback          The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFinancialEventsByGroupIdAsync(String eventGroupId, Integer maxResultsPerPage, String nextToken, final ApiCallback<ListFinancialEventsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = listFinancialEventsByGroupIdValidateBeforeCall(eventGroupId, maxResultsPerPage, nextToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListFinancialEventsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for listFinancialEventsByOrderId
     *
     * @param orderId                 An Amazon-defined order identifier, in 3-7-7 format. (required)
     * @param maxResultsPerPage       The maximum number of results to return per page. (optional, default to 100)
     * @param nextToken               A string token returned in the response of your previous request. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listFinancialEventsByOrderIdCall(String orderId, Integer maxResultsPerPage, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/finances/v0/orders/{orderId}/financialEvents"
                .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxResultsPerPage != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MaxResultsPerPage", maxResultsPerPage));
        if (nextToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("NextToken", nextToken));
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
    private com.squareup.okhttp.Call listFinancialEventsByOrderIdValidateBeforeCall(String orderId, Integer maxResultsPerPage, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling listFinancialEventsByOrderId(Async)");
        }
        com.squareup.okhttp.Call call = listFinancialEventsByOrderIdCall(orderId, maxResultsPerPage, nextToken, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns all financial events for the specified order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param orderId           An Amazon-defined order identifier, in 3-7-7 format. (required)
     * @param maxResultsPerPage The maximum number of results to return per page. (optional, default to 100)
     * @param nextToken         A string token returned in the response of your previous request. (optional)
     * @return ListFinancialEventsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListFinancialEventsResponse listFinancialEventsByOrderId(String orderId, Integer maxResultsPerPage, String nextToken) throws ApiException {
        ApiResponse<ListFinancialEventsResponse> resp = listFinancialEventsByOrderIdWithHttpInfo(orderId, maxResultsPerPage, nextToken);
        return resp.getData();
    }

    /**
     * Returns all financial events for the specified order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param orderId           An Amazon-defined order identifier, in 3-7-7 format. (required)
     * @param maxResultsPerPage The maximum number of results to return per page. (optional, default to 100)
     * @param nextToken         A string token returned in the response of your previous request. (optional)
     * @return ApiResponse&lt;ListFinancialEventsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListFinancialEventsResponse> listFinancialEventsByOrderIdWithHttpInfo(String orderId, Integer maxResultsPerPage, String nextToken) throws ApiException {
        com.squareup.okhttp.Call call = listFinancialEventsByOrderIdValidateBeforeCall(orderId, maxResultsPerPage, nextToken, null, null);
        Type localVarReturnType = new TypeToken<ListFinancialEventsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns all financial events for the specified order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param orderId           An Amazon-defined order identifier, in 3-7-7 format. (required)
     * @param maxResultsPerPage The maximum number of results to return per page. (optional, default to 100)
     * @param nextToken         A string token returned in the response of your previous request. (optional)
     * @param callback          The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFinancialEventsByOrderIdAsync(String orderId, Integer maxResultsPerPage, String nextToken, final ApiCallback<ListFinancialEventsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = listFinancialEventsByOrderIdValidateBeforeCall(orderId, maxResultsPerPage, nextToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListFinancialEventsResponse>() {
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

        public DefaultApi build() {
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
            return new DefaultApi(new ApiClient()
                    .setAWSSigV4Signer(awsSigV4Signer)
                    .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                    .setBasePath(endpoint)
                    .setRateLimiter(rateLimitConfiguration));
        }
    }
}
