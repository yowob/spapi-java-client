package com.amazon.spapi.api;

import com.amazon.SellingPartnerAPIAA.*;
import com.amazon.spapi.client.*;
import com.amazon.spapi.models.services.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceApi {
    private ApiClient apiClient;

    ServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addAppointmentForServiceJobByServiceJobId
     *
     * @param body                    Add appointment operation input details. (required)
     * @param serviceJobId            An Amazon defined service job identifier. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addAppointmentForServiceJobByServiceJobIdCall(AddAppointmentRequest body, String serviceJobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/service/v1/serviceJobs/{serviceJobId}/appointments"
                .replaceAll("\\{" + "serviceJobId" + "\\}", apiClient.escapeString(serviceJobId.toString()));
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
    private com.squareup.okhttp.Call addAppointmentForServiceJobByServiceJobIdValidateBeforeCall(AddAppointmentRequest body, String serviceJobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addAppointmentForServiceJobByServiceJobId(Async)");
        }
        // verify the required parameter 'serviceJobId' is set
        if (serviceJobId == null) {
            throw new ApiException("Missing the required parameter 'serviceJobId' when calling addAppointmentForServiceJobByServiceJobId(Async)");
        }
        com.squareup.okhttp.Call call = addAppointmentForServiceJobByServiceJobIdCall(body, serviceJobId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Adds an appointment to the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body         Add appointment operation input details. (required)
     * @param serviceJobId An Amazon defined service job identifier. (required)
     * @return SetAppointmentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SetAppointmentResponse addAppointmentForServiceJobByServiceJobId(AddAppointmentRequest body, String serviceJobId) throws ApiException {
        ApiResponse<SetAppointmentResponse> resp = addAppointmentForServiceJobByServiceJobIdWithHttpInfo(body, serviceJobId);
        return resp.getData();
    }

    /**
     * Adds an appointment to the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body         Add appointment operation input details. (required)
     * @param serviceJobId An Amazon defined service job identifier. (required)
     * @return ApiResponse&lt;SetAppointmentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SetAppointmentResponse> addAppointmentForServiceJobByServiceJobIdWithHttpInfo(AddAppointmentRequest body, String serviceJobId) throws ApiException {
        com.squareup.okhttp.Call call = addAppointmentForServiceJobByServiceJobIdValidateBeforeCall(body, serviceJobId, null, null);
        Type localVarReturnType = new TypeToken<SetAppointmentResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Adds an appointment to the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body         Add appointment operation input details. (required)
     * @param serviceJobId An Amazon defined service job identifier. (required)
     * @param callback     The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addAppointmentForServiceJobByServiceJobIdAsync(AddAppointmentRequest body, String serviceJobId, final ApiCallback<SetAppointmentResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = addAppointmentForServiceJobByServiceJobIdValidateBeforeCall(body, serviceJobId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SetAppointmentResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for cancelServiceJobByServiceJobId
     *
     * @param serviceJobId            An Amazon defined service job identifier. (required)
     * @param cancellationReasonCode  A cancel reason code that specifies the reason for cancelling a service job. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelServiceJobByServiceJobIdCall(String serviceJobId, String cancellationReasonCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/service/v1/serviceJobs/{serviceJobId}/cancellations"
                .replaceAll("\\{" + "serviceJobId" + "\\}", apiClient.escapeString(serviceJobId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (cancellationReasonCode != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("cancellationReasonCode", cancellationReasonCode));
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
    private com.squareup.okhttp.Call cancelServiceJobByServiceJobIdValidateBeforeCall(String serviceJobId, String cancellationReasonCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'serviceJobId' is set
        if (serviceJobId == null) {
            throw new ApiException("Missing the required parameter 'serviceJobId' when calling cancelServiceJobByServiceJobId(Async)");
        }
        // verify the required parameter 'cancellationReasonCode' is set
        if (cancellationReasonCode == null) {
            throw new ApiException("Missing the required parameter 'cancellationReasonCode' when calling cancelServiceJobByServiceJobId(Async)");
        }
        com.squareup.okhttp.Call call = cancelServiceJobByServiceJobIdCall(serviceJobId, cancellationReasonCode, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Cancels the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param serviceJobId           An Amazon defined service job identifier. (required)
     * @param cancellationReasonCode A cancel reason code that specifies the reason for cancelling a service job. (required)
     * @return CancelServiceJobByServiceJobIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CancelServiceJobByServiceJobIdResponse cancelServiceJobByServiceJobId(String serviceJobId, String cancellationReasonCode) throws ApiException {
        ApiResponse<CancelServiceJobByServiceJobIdResponse> resp = cancelServiceJobByServiceJobIdWithHttpInfo(serviceJobId, cancellationReasonCode);
        return resp.getData();
    }

    /**
     * Cancels the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param serviceJobId           An Amazon defined service job identifier. (required)
     * @param cancellationReasonCode A cancel reason code that specifies the reason for cancelling a service job. (required)
     * @return ApiResponse&lt;CancelServiceJobByServiceJobIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CancelServiceJobByServiceJobIdResponse> cancelServiceJobByServiceJobIdWithHttpInfo(String serviceJobId, String cancellationReasonCode) throws ApiException {
        com.squareup.okhttp.Call call = cancelServiceJobByServiceJobIdValidateBeforeCall(serviceJobId, cancellationReasonCode, null, null);
        Type localVarReturnType = new TypeToken<CancelServiceJobByServiceJobIdResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Cancels the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param serviceJobId           An Amazon defined service job identifier. (required)
     * @param cancellationReasonCode A cancel reason code that specifies the reason for cancelling a service job. (required)
     * @param callback               The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelServiceJobByServiceJobIdAsync(String serviceJobId, String cancellationReasonCode, final ApiCallback<CancelServiceJobByServiceJobIdResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = cancelServiceJobByServiceJobIdValidateBeforeCall(serviceJobId, cancellationReasonCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CancelServiceJobByServiceJobIdResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for completeServiceJobByServiceJobId
     *
     * @param serviceJobId            An Amazon defined service job identifier. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call completeServiceJobByServiceJobIdCall(String serviceJobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/service/v1/serviceJobs/{serviceJobId}/completions"
                .replaceAll("\\{" + "serviceJobId" + "\\}", apiClient.escapeString(serviceJobId.toString()));
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
    private com.squareup.okhttp.Call completeServiceJobByServiceJobIdValidateBeforeCall(String serviceJobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'serviceJobId' is set
        if (serviceJobId == null) {
            throw new ApiException("Missing the required parameter 'serviceJobId' when calling completeServiceJobByServiceJobId(Async)");
        }
        com.squareup.okhttp.Call call = completeServiceJobByServiceJobIdCall(serviceJobId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Completes the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param serviceJobId An Amazon defined service job identifier. (required)
     * @return CompleteServiceJobByServiceJobIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CompleteServiceJobByServiceJobIdResponse completeServiceJobByServiceJobId(String serviceJobId) throws ApiException {
        ApiResponse<CompleteServiceJobByServiceJobIdResponse> resp = completeServiceJobByServiceJobIdWithHttpInfo(serviceJobId);
        return resp.getData();
    }

    /**
     * Completes the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param serviceJobId An Amazon defined service job identifier. (required)
     * @return ApiResponse&lt;CompleteServiceJobByServiceJobIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CompleteServiceJobByServiceJobIdResponse> completeServiceJobByServiceJobIdWithHttpInfo(String serviceJobId) throws ApiException {
        com.squareup.okhttp.Call call = completeServiceJobByServiceJobIdValidateBeforeCall(serviceJobId, null, null);
        Type localVarReturnType = new TypeToken<CompleteServiceJobByServiceJobIdResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Completes the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param serviceJobId An Amazon defined service job identifier. (required)
     * @param callback     The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call completeServiceJobByServiceJobIdAsync(String serviceJobId, final ApiCallback<CompleteServiceJobByServiceJobIdResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = completeServiceJobByServiceJobIdValidateBeforeCall(serviceJobId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CompleteServiceJobByServiceJobIdResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getServiceJobByServiceJobId
     *
     * @param serviceJobId            A service job identifier. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getServiceJobByServiceJobIdCall(String serviceJobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/service/v1/serviceJobs/{serviceJobId}"
                .replaceAll("\\{" + "serviceJobId" + "\\}", apiClient.escapeString(serviceJobId.toString()));
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
    private com.squareup.okhttp.Call getServiceJobByServiceJobIdValidateBeforeCall(String serviceJobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'serviceJobId' is set
        if (serviceJobId == null) {
            throw new ApiException("Missing the required parameter 'serviceJobId' when calling getServiceJobByServiceJobId(Async)");
        }
        com.squareup.okhttp.Call call = getServiceJobByServiceJobIdCall(serviceJobId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Gets service job details for the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 20 | 40 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param serviceJobId A service job identifier. (required)
     * @return GetServiceJobByServiceJobIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetServiceJobByServiceJobIdResponse getServiceJobByServiceJobId(String serviceJobId) throws ApiException {
        ApiResponse<GetServiceJobByServiceJobIdResponse> resp = getServiceJobByServiceJobIdWithHttpInfo(serviceJobId);
        return resp.getData();
    }

    /**
     * Gets service job details for the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 20 | 40 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param serviceJobId A service job identifier. (required)
     * @return ApiResponse&lt;GetServiceJobByServiceJobIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetServiceJobByServiceJobIdResponse> getServiceJobByServiceJobIdWithHttpInfo(String serviceJobId) throws ApiException {
        com.squareup.okhttp.Call call = getServiceJobByServiceJobIdValidateBeforeCall(serviceJobId, null, null);
        Type localVarReturnType = new TypeToken<GetServiceJobByServiceJobIdResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Gets service job details for the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 20 | 40 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param serviceJobId A service job identifier. (required)
     * @param callback     The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getServiceJobByServiceJobIdAsync(String serviceJobId, final ApiCallback<GetServiceJobByServiceJobIdResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getServiceJobByServiceJobIdValidateBeforeCall(serviceJobId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetServiceJobByServiceJobIdResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getServiceJobs
     *
     * @param marketplaceIds          Used to select jobs that were placed in the specified marketplaces.  (required)
     * @param serviceOrderIds         List of service order ids for the query you want to perform.Max values supported 20.  (optional)
     * @param serviceJobStatus        A list of one or more job status by which to filter the list of jobs. (optional)
     * @param pageToken               String returned in the response of your previous request. (optional)
     * @param pageSize                A non-negative integer that indicates the maximum number of jobs to return in the list, Value must be 1 - 20. Default 20.  (optional, default to 20)
     * @param sortField               Sort fields on which you want to sort the output. (optional)
     * @param sortOrder               Sort order for the query you want to perform. (optional)
     * @param createdAfter            A date used for selecting jobs created after (or at) a specified time must be in ISO 8601 format. Required if LastUpdatedAfter is not specified.Specifying both CreatedAfter and LastUpdatedAfter returns an error.  (optional)
     * @param createdBefore           A date used for selecting jobs created before (or at) a specified time must be in ISO 8601 format.  (optional)
     * @param lastUpdatedAfter        A date used for selecting jobs updated after (or at) a specified time must be in ISO 8601 format. Required if createdAfter is not specified.Specifying both CreatedAfter and LastUpdatedAfter returns an error.  (optional)
     * @param lastUpdatedBefore       A date used for selecting jobs updated before (or at) a specified time must be in ISO 8601 format.  (optional)
     * @param scheduleStartDate       A date used for filtering jobs schedule after (or at) a specified time must be in ISO 8601 format. schedule end date should not be earlier than schedule start date.  (optional)
     * @param scheduleEndDate         A date used for filtering jobs schedule before (or at) a specified time must be in ISO 8601 format. schedule end date should not be earlier than schedule start date.  (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getServiceJobsCall(List<String> marketplaceIds, List<String> serviceOrderIds, List<String> serviceJobStatus, String pageToken, Integer pageSize, String sortField, String sortOrder, String createdAfter, String createdBefore, String lastUpdatedAfter, String lastUpdatedBefore, String scheduleStartDate, String scheduleEndDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/service/v1/serviceJobs";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (serviceOrderIds != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "serviceOrderIds", serviceOrderIds));
        if (serviceJobStatus != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "serviceJobStatus", serviceJobStatus));
        if (pageToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("pageToken", pageToken));
        if (pageSize != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));
        if (sortField != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("sortField", sortField));
        if (sortOrder != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));
        if (createdAfter != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("createdAfter", createdAfter));
        if (createdBefore != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("createdBefore", createdBefore));
        if (lastUpdatedAfter != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("lastUpdatedAfter", lastUpdatedAfter));
        if (lastUpdatedBefore != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("lastUpdatedBefore", lastUpdatedBefore));
        if (scheduleStartDate != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("scheduleStartDate", scheduleStartDate));
        if (scheduleEndDate != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("scheduleEndDate", scheduleEndDate));
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
    private com.squareup.okhttp.Call getServiceJobsValidateBeforeCall(List<String> marketplaceIds, List<String> serviceOrderIds, List<String> serviceJobStatus, String pageToken, Integer pageSize, String sortField, String sortOrder, String createdAfter, String createdBefore, String lastUpdatedAfter, String lastUpdatedBefore, String scheduleStartDate, String scheduleEndDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling getServiceJobs(Async)");
        }
        com.squareup.okhttp.Call call = getServiceJobsCall(marketplaceIds, serviceOrderIds, serviceJobStatus, pageToken, pageSize, sortField, sortOrder, createdAfter, createdBefore, lastUpdatedAfter, lastUpdatedBefore, scheduleStartDate, scheduleEndDate, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Gets service job details for the specified filter query.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 40 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceIds    Used to select jobs that were placed in the specified marketplaces.  (required)
     * @param serviceOrderIds   List of service order ids for the query you want to perform.Max values supported 20.  (optional)
     * @param serviceJobStatus  A list of one or more job status by which to filter the list of jobs. (optional)
     * @param pageToken         String returned in the response of your previous request. (optional)
     * @param pageSize          A non-negative integer that indicates the maximum number of jobs to return in the list, Value must be 1 - 20. Default 20.  (optional, default to 20)
     * @param sortField         Sort fields on which you want to sort the output. (optional)
     * @param sortOrder         Sort order for the query you want to perform. (optional)
     * @param createdAfter      A date used for selecting jobs created after (or at) a specified time must be in ISO 8601 format. Required if LastUpdatedAfter is not specified.Specifying both CreatedAfter and LastUpdatedAfter returns an error.  (optional)
     * @param createdBefore     A date used for selecting jobs created before (or at) a specified time must be in ISO 8601 format.  (optional)
     * @param lastUpdatedAfter  A date used for selecting jobs updated after (or at) a specified time must be in ISO 8601 format. Required if createdAfter is not specified.Specifying both CreatedAfter and LastUpdatedAfter returns an error.  (optional)
     * @param lastUpdatedBefore A date used for selecting jobs updated before (or at) a specified time must be in ISO 8601 format.  (optional)
     * @param scheduleStartDate A date used for filtering jobs schedule after (or at) a specified time must be in ISO 8601 format. schedule end date should not be earlier than schedule start date.  (optional)
     * @param scheduleEndDate   A date used for filtering jobs schedule before (or at) a specified time must be in ISO 8601 format. schedule end date should not be earlier than schedule start date.  (optional)
     * @return GetServiceJobsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetServiceJobsResponse getServiceJobs(List<String> marketplaceIds, List<String> serviceOrderIds, List<String> serviceJobStatus, String pageToken, Integer pageSize, String sortField, String sortOrder, String createdAfter, String createdBefore, String lastUpdatedAfter, String lastUpdatedBefore, String scheduleStartDate, String scheduleEndDate) throws ApiException {
        ApiResponse<GetServiceJobsResponse> resp = getServiceJobsWithHttpInfo(marketplaceIds, serviceOrderIds, serviceJobStatus, pageToken, pageSize, sortField, sortOrder, createdAfter, createdBefore, lastUpdatedAfter, lastUpdatedBefore, scheduleStartDate, scheduleEndDate);
        return resp.getData();
    }

    /**
     * Gets service job details for the specified filter query.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 40 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceIds    Used to select jobs that were placed in the specified marketplaces.  (required)
     * @param serviceOrderIds   List of service order ids for the query you want to perform.Max values supported 20.  (optional)
     * @param serviceJobStatus  A list of one or more job status by which to filter the list of jobs. (optional)
     * @param pageToken         String returned in the response of your previous request. (optional)
     * @param pageSize          A non-negative integer that indicates the maximum number of jobs to return in the list, Value must be 1 - 20. Default 20.  (optional, default to 20)
     * @param sortField         Sort fields on which you want to sort the output. (optional)
     * @param sortOrder         Sort order for the query you want to perform. (optional)
     * @param createdAfter      A date used for selecting jobs created after (or at) a specified time must be in ISO 8601 format. Required if LastUpdatedAfter is not specified.Specifying both CreatedAfter and LastUpdatedAfter returns an error.  (optional)
     * @param createdBefore     A date used for selecting jobs created before (or at) a specified time must be in ISO 8601 format.  (optional)
     * @param lastUpdatedAfter  A date used for selecting jobs updated after (or at) a specified time must be in ISO 8601 format. Required if createdAfter is not specified.Specifying both CreatedAfter and LastUpdatedAfter returns an error.  (optional)
     * @param lastUpdatedBefore A date used for selecting jobs updated before (or at) a specified time must be in ISO 8601 format.  (optional)
     * @param scheduleStartDate A date used for filtering jobs schedule after (or at) a specified time must be in ISO 8601 format. schedule end date should not be earlier than schedule start date.  (optional)
     * @param scheduleEndDate   A date used for filtering jobs schedule before (or at) a specified time must be in ISO 8601 format. schedule end date should not be earlier than schedule start date.  (optional)
     * @return ApiResponse&lt;GetServiceJobsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetServiceJobsResponse> getServiceJobsWithHttpInfo(List<String> marketplaceIds, List<String> serviceOrderIds, List<String> serviceJobStatus, String pageToken, Integer pageSize, String sortField, String sortOrder, String createdAfter, String createdBefore, String lastUpdatedAfter, String lastUpdatedBefore, String scheduleStartDate, String scheduleEndDate) throws ApiException {
        com.squareup.okhttp.Call call = getServiceJobsValidateBeforeCall(marketplaceIds, serviceOrderIds, serviceJobStatus, pageToken, pageSize, sortField, sortOrder, createdAfter, createdBefore, lastUpdatedAfter, lastUpdatedBefore, scheduleStartDate, scheduleEndDate, null, null);
        Type localVarReturnType = new TypeToken<GetServiceJobsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Gets service job details for the specified filter query.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 40 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceIds    Used to select jobs that were placed in the specified marketplaces.  (required)
     * @param serviceOrderIds   List of service order ids for the query you want to perform.Max values supported 20.  (optional)
     * @param serviceJobStatus  A list of one or more job status by which to filter the list of jobs. (optional)
     * @param pageToken         String returned in the response of your previous request. (optional)
     * @param pageSize          A non-negative integer that indicates the maximum number of jobs to return in the list, Value must be 1 - 20. Default 20.  (optional, default to 20)
     * @param sortField         Sort fields on which you want to sort the output. (optional)
     * @param sortOrder         Sort order for the query you want to perform. (optional)
     * @param createdAfter      A date used for selecting jobs created after (or at) a specified time must be in ISO 8601 format. Required if LastUpdatedAfter is not specified.Specifying both CreatedAfter and LastUpdatedAfter returns an error.  (optional)
     * @param createdBefore     A date used for selecting jobs created before (or at) a specified time must be in ISO 8601 format.  (optional)
     * @param lastUpdatedAfter  A date used for selecting jobs updated after (or at) a specified time must be in ISO 8601 format. Required if createdAfter is not specified.Specifying both CreatedAfter and LastUpdatedAfter returns an error.  (optional)
     * @param lastUpdatedBefore A date used for selecting jobs updated before (or at) a specified time must be in ISO 8601 format.  (optional)
     * @param scheduleStartDate A date used for filtering jobs schedule after (or at) a specified time must be in ISO 8601 format. schedule end date should not be earlier than schedule start date.  (optional)
     * @param scheduleEndDate   A date used for filtering jobs schedule before (or at) a specified time must be in ISO 8601 format. schedule end date should not be earlier than schedule start date.  (optional)
     * @param callback          The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getServiceJobsAsync(List<String> marketplaceIds, List<String> serviceOrderIds, List<String> serviceJobStatus, String pageToken, Integer pageSize, String sortField, String sortOrder, String createdAfter, String createdBefore, String lastUpdatedAfter, String lastUpdatedBefore, String scheduleStartDate, String scheduleEndDate, final ApiCallback<GetServiceJobsResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getServiceJobsValidateBeforeCall(marketplaceIds, serviceOrderIds, serviceJobStatus, pageToken, pageSize, sortField, sortOrder, createdAfter, createdBefore, lastUpdatedAfter, lastUpdatedBefore, scheduleStartDate, scheduleEndDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetServiceJobsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for rescheduleAppointmentForServiceJobByServiceJobId
     *
     * @param body                    Reschedule appointment operation input details. (required)
     * @param serviceJobId            An Amazon defined service job identifier. (required)
     * @param appointmentId           An existing appointment identifier for the Service Job. (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rescheduleAppointmentForServiceJobByServiceJobIdCall(RescheduleAppointmentRequest body, String serviceJobId, String appointmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        // create path and map variables
        String localVarPath = "/service/v1/serviceJobs/{serviceJobId}/appointments/{appointmentId}"
                .replaceAll("\\{" + "serviceJobId" + "\\}", apiClient.escapeString(serviceJobId.toString()))
                .replaceAll("\\{" + "appointmentId" + "\\}", apiClient.escapeString(appointmentId.toString()));
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
    private com.squareup.okhttp.Call rescheduleAppointmentForServiceJobByServiceJobIdValidateBeforeCall(RescheduleAppointmentRequest body, String serviceJobId, String appointmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling rescheduleAppointmentForServiceJobByServiceJobId(Async)");
        }
        // verify the required parameter 'serviceJobId' is set
        if (serviceJobId == null) {
            throw new ApiException("Missing the required parameter 'serviceJobId' when calling rescheduleAppointmentForServiceJobByServiceJobId(Async)");
        }
        // verify the required parameter 'appointmentId' is set
        if (appointmentId == null) {
            throw new ApiException("Missing the required parameter 'appointmentId' when calling rescheduleAppointmentForServiceJobByServiceJobId(Async)");
        }
        com.squareup.okhttp.Call call = rescheduleAppointmentForServiceJobByServiceJobIdCall(body, serviceJobId, appointmentId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Reschedules an appointment for the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body          Reschedule appointment operation input details. (required)
     * @param serviceJobId  An Amazon defined service job identifier. (required)
     * @param appointmentId An existing appointment identifier for the Service Job. (required)
     * @return SetAppointmentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SetAppointmentResponse rescheduleAppointmentForServiceJobByServiceJobId(RescheduleAppointmentRequest body, String serviceJobId, String appointmentId) throws ApiException {
        ApiResponse<SetAppointmentResponse> resp = rescheduleAppointmentForServiceJobByServiceJobIdWithHttpInfo(body, serviceJobId, appointmentId);
        return resp.getData();
    }

    /**
     * Reschedules an appointment for the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body          Reschedule appointment operation input details. (required)
     * @param serviceJobId  An Amazon defined service job identifier. (required)
     * @param appointmentId An existing appointment identifier for the Service Job. (required)
     * @return ApiResponse&lt;SetAppointmentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SetAppointmentResponse> rescheduleAppointmentForServiceJobByServiceJobIdWithHttpInfo(RescheduleAppointmentRequest body, String serviceJobId, String appointmentId) throws ApiException {
        com.squareup.okhttp.Call call = rescheduleAppointmentForServiceJobByServiceJobIdValidateBeforeCall(body, serviceJobId, appointmentId, null, null);
        Type localVarReturnType = new TypeToken<SetAppointmentResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Reschedules an appointment for the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param body          Reschedule appointment operation input details. (required)
     * @param serviceJobId  An Amazon defined service job identifier. (required)
     * @param appointmentId An existing appointment identifier for the Service Job. (required)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rescheduleAppointmentForServiceJobByServiceJobIdAsync(RescheduleAppointmentRequest body, String serviceJobId, String appointmentId, final ApiCallback<SetAppointmentResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = rescheduleAppointmentForServiceJobByServiceJobIdValidateBeforeCall(body, serviceJobId, appointmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SetAppointmentResponse>() {
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

        public ServiceApi build() {
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
            return new ServiceApi(new ApiClient()
                    .setAWSSigV4Signer(awsSigV4Signer)
                    .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                    .setBasePath(endpoint)
                    .setRateLimiter(rateLimitConfiguration));
        }
    }
}
