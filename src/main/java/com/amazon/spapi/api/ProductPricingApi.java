package com.amazon.spapi.api;

import com.amazon.SellingPartnerAPIAA.*;
import com.amazon.spapi.client.*;
import com.amazon.spapi.models.productpricing.GetOffersResponse;
import com.amazon.spapi.models.productpricing.GetPricingResponse;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductPricingApi {
    private ApiClient apiClient;

    ProductPricingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductPricingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCompetitivePricing
     *
     * @param marketplaceId           A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemType                Indicates whether ASIN values or seller SKU values are used to identify items. If you specify Asin, the information in the response will be dependent on the list of Asins you provide in the Asins parameter. If you specify Sku, the information in the response will be dependent on the list of Skus you provide in the Skus parameter. Possible values: Asin, Sku. (required)
     * @param asins                   A list of up to twenty Amazon Standard Identification Number (ASIN) values used to identify items in the given marketplace. (optional)
     * @param skus                    A list of up to twenty seller SKU values used to identify items in the given marketplace. (optional)
     * @param customerType            Indicates whether to request pricing information from the point of view of Consumer or Business buyers. Default is Consumer. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompetitivePricingCall(String marketplaceId, String itemType, List<String> asins, List<String> skus, String customerType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/products/pricing/v0/competitivePrice";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MarketplaceId", marketplaceId));
        if (asins != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "Asins", asins));
        if (skus != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "Skus", skus));
        if (itemType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ItemType", itemType));
        if (customerType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("CustomerType", customerType));
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
    private com.squareup.okhttp.Call getCompetitivePricingValidateBeforeCall(String marketplaceId, String itemType, List<String> asins, List<String> skus, String customerType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getCompetitivePricing(Async)");
        }
        // verify the required parameter 'itemType' is set
        if (itemType == null) {
            throw new ApiException("Missing the required parameter 'itemType' when calling getCompetitivePricing(Async)");
        }
        com.squareup.okhttp.Call call = getCompetitivePricingCall(marketplaceId, itemType, asins, skus, customerType, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns competitive pricing information for a seller&#x27;s offer listings based on seller SKU or ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemType      Indicates whether ASIN values or seller SKU values are used to identify items. If you specify Asin, the information in the response will be dependent on the list of Asins you provide in the Asins parameter. If you specify Sku, the information in the response will be dependent on the list of Skus you provide in the Skus parameter. Possible values: Asin, Sku. (required)
     * @param asins         A list of up to twenty Amazon Standard Identification Number (ASIN) values used to identify items in the given marketplace. (optional)
     * @param skus          A list of up to twenty seller SKU values used to identify items in the given marketplace. (optional)
     * @param customerType  Indicates whether to request pricing information from the point of view of Consumer or Business buyers. Default is Consumer. (optional)
     * @return GetPricingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetPricingResponse getCompetitivePricing(String marketplaceId, String itemType, List<String> asins, List<String> skus, String customerType) throws ApiException {
        ApiResponse<GetPricingResponse> resp = getCompetitivePricingWithHttpInfo(marketplaceId, itemType, asins, skus, customerType);
        return resp.getData();
    }

    /**
     * Returns competitive pricing information for a seller&#x27;s offer listings based on seller SKU or ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemType      Indicates whether ASIN values or seller SKU values are used to identify items. If you specify Asin, the information in the response will be dependent on the list of Asins you provide in the Asins parameter. If you specify Sku, the information in the response will be dependent on the list of Skus you provide in the Skus parameter. Possible values: Asin, Sku. (required)
     * @param asins         A list of up to twenty Amazon Standard Identification Number (ASIN) values used to identify items in the given marketplace. (optional)
     * @param skus          A list of up to twenty seller SKU values used to identify items in the given marketplace. (optional)
     * @param customerType  Indicates whether to request pricing information from the point of view of Consumer or Business buyers. Default is Consumer. (optional)
     * @return ApiResponse&lt;GetPricingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetPricingResponse> getCompetitivePricingWithHttpInfo(String marketplaceId, String itemType, List<String> asins, List<String> skus, String customerType) throws ApiException {
        com.squareup.okhttp.Call call = getCompetitivePricingValidateBeforeCall(marketplaceId, itemType, asins, skus, customerType, null, null);
        Type localVarReturnType = new TypeToken<GetPricingResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns competitive pricing information for a seller&#x27;s offer listings based on seller SKU or ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemType      Indicates whether ASIN values or seller SKU values are used to identify items. If you specify Asin, the information in the response will be dependent on the list of Asins you provide in the Asins parameter. If you specify Sku, the information in the response will be dependent on the list of Skus you provide in the Skus parameter. Possible values: Asin, Sku. (required)
     * @param asins         A list of up to twenty Amazon Standard Identification Number (ASIN) values used to identify items in the given marketplace. (optional)
     * @param skus          A list of up to twenty seller SKU values used to identify items in the given marketplace. (optional)
     * @param customerType  Indicates whether to request pricing information from the point of view of Consumer or Business buyers. Default is Consumer. (optional)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompetitivePricingAsync(String marketplaceId, String itemType, List<String> asins, List<String> skus, String customerType, final ApiCallback<GetPricingResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getCompetitivePricingValidateBeforeCall(marketplaceId, itemType, asins, skus, customerType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetPricingResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getItemOffers
     *
     * @param marketplaceId           A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemCondition           Filters the offer listings to be considered based on item condition. Possible values: New, Used, Collectible, Refurbished, Club. (required)
     * @param asin                    The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param customerType            Indicates whether to request Consumer or Business offers. Default is Consumer. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemOffersCall(String marketplaceId, String itemCondition, String asin, String customerType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/products/pricing/v0/items/{Asin}/offers"
                .replaceAll("\\{" + "Asin" + "\\}", apiClient.escapeString(asin.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MarketplaceId", marketplaceId));
        if (itemCondition != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ItemCondition", itemCondition));
        if (customerType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("CustomerType", customerType));
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
    private com.squareup.okhttp.Call getItemOffersValidateBeforeCall(String marketplaceId, String itemCondition, String asin, String customerType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getItemOffers(Async)");
        }
        // verify the required parameter 'itemCondition' is set
        if (itemCondition == null) {
            throw new ApiException("Missing the required parameter 'itemCondition' when calling getItemOffers(Async)");
        }
        // verify the required parameter 'asin' is set
        if (asin == null) {
            throw new ApiException("Missing the required parameter 'asin' when calling getItemOffers(Async)");
        }
        com.squareup.okhttp.Call call = getItemOffersCall(marketplaceId, itemCondition, asin, customerType, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns the lowest priced offers for a single item based on ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemCondition Filters the offer listings to be considered based on item condition. Possible values: New, Used, Collectible, Refurbished, Club. (required)
     * @param asin          The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param customerType  Indicates whether to request Consumer or Business offers. Default is Consumer. (optional)
     * @return GetOffersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetOffersResponse getItemOffers(String marketplaceId, String itemCondition, String asin, String customerType) throws ApiException {
        ApiResponse<GetOffersResponse> resp = getItemOffersWithHttpInfo(marketplaceId, itemCondition, asin, customerType);
        return resp.getData();
    }

    /**
     * Returns the lowest priced offers for a single item based on ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemCondition Filters the offer listings to be considered based on item condition. Possible values: New, Used, Collectible, Refurbished, Club. (required)
     * @param asin          The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param customerType  Indicates whether to request Consumer or Business offers. Default is Consumer. (optional)
     * @return ApiResponse&lt;GetOffersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetOffersResponse> getItemOffersWithHttpInfo(String marketplaceId, String itemCondition, String asin, String customerType) throws ApiException {
        com.squareup.okhttp.Call call = getItemOffersValidateBeforeCall(marketplaceId, itemCondition, asin, customerType, null, null);
        Type localVarReturnType = new TypeToken<GetOffersResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns the lowest priced offers for a single item based on ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemCondition Filters the offer listings to be considered based on item condition. Possible values: New, Used, Collectible, Refurbished, Club. (required)
     * @param asin          The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param customerType  Indicates whether to request Consumer or Business offers. Default is Consumer. (optional)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemOffersAsync(String marketplaceId, String itemCondition, String asin, String customerType, final ApiCallback<GetOffersResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getItemOffersValidateBeforeCall(marketplaceId, itemCondition, asin, customerType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetOffersResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getListingOffers
     *
     * @param marketplaceId           A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemCondition           Filters the offer listings based on item condition. Possible values: New, Used, Collectible, Refurbished, Club. (required)
     * @param sellerSKU               Identifies an item in the given marketplace. SellerSKU is qualified by the seller&#x27;s SellerId, which is included with every operation that you submit. (required)
     * @param customerType            Indicates whether to request Consumer or Business offers. Default is Consumer. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getListingOffersCall(String marketplaceId, String itemCondition, String sellerSKU, String customerType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/products/pricing/v0/listings/{SellerSKU}/offers"
                .replaceAll("\\{" + "SellerSKU" + "\\}", apiClient.escapeString(sellerSKU.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MarketplaceId", marketplaceId));
        if (itemCondition != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ItemCondition", itemCondition));
        if (customerType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("CustomerType", customerType));
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
    private com.squareup.okhttp.Call getListingOffersValidateBeforeCall(String marketplaceId, String itemCondition, String sellerSKU, String customerType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getListingOffers(Async)");
        }
        // verify the required parameter 'itemCondition' is set
        if (itemCondition == null) {
            throw new ApiException("Missing the required parameter 'itemCondition' when calling getListingOffers(Async)");
        }
        // verify the required parameter 'sellerSKU' is set
        if (sellerSKU == null) {
            throw new ApiException("Missing the required parameter 'sellerSKU' when calling getListingOffers(Async)");
        }
        com.squareup.okhttp.Call call = getListingOffersCall(marketplaceId, itemCondition, sellerSKU, customerType, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns the lowest priced offers for a single SKU listing.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemCondition Filters the offer listings based on item condition. Possible values: New, Used, Collectible, Refurbished, Club. (required)
     * @param sellerSKU     Identifies an item in the given marketplace. SellerSKU is qualified by the seller&#x27;s SellerId, which is included with every operation that you submit. (required)
     * @param customerType  Indicates whether to request Consumer or Business offers. Default is Consumer. (optional)
     * @return GetOffersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetOffersResponse getListingOffers(String marketplaceId, String itemCondition, String sellerSKU, String customerType) throws ApiException {
        ApiResponse<GetOffersResponse> resp = getListingOffersWithHttpInfo(marketplaceId, itemCondition, sellerSKU, customerType);
        return resp.getData();
    }

    /**
     * Returns the lowest priced offers for a single SKU listing.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemCondition Filters the offer listings based on item condition. Possible values: New, Used, Collectible, Refurbished, Club. (required)
     * @param sellerSKU     Identifies an item in the given marketplace. SellerSKU is qualified by the seller&#x27;s SellerId, which is included with every operation that you submit. (required)
     * @param customerType  Indicates whether to request Consumer or Business offers. Default is Consumer. (optional)
     * @return ApiResponse&lt;GetOffersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetOffersResponse> getListingOffersWithHttpInfo(String marketplaceId, String itemCondition, String sellerSKU, String customerType) throws ApiException {
        com.squareup.okhttp.Call call = getListingOffersValidateBeforeCall(marketplaceId, itemCondition, sellerSKU, customerType, null, null);
        Type localVarReturnType = new TypeToken<GetOffersResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns the lowest priced offers for a single SKU listing.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemCondition Filters the offer listings based on item condition. Possible values: New, Used, Collectible, Refurbished, Club. (required)
     * @param sellerSKU     Identifies an item in the given marketplace. SellerSKU is qualified by the seller&#x27;s SellerId, which is included with every operation that you submit. (required)
     * @param customerType  Indicates whether to request Consumer or Business offers. Default is Consumer. (optional)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getListingOffersAsync(String marketplaceId, String itemCondition, String sellerSKU, String customerType, final ApiCallback<GetOffersResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getListingOffersValidateBeforeCall(marketplaceId, itemCondition, sellerSKU, customerType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetOffersResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getPricing
     *
     * @param marketplaceId           A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemType                Indicates whether ASIN values or seller SKU values are used to identify items. If you specify Asin, the information in the response will be dependent on the list of Asins you provide in the Asins parameter. If you specify Sku, the information in the response will be dependent on the list of Skus you provide in the Skus parameter. (required)
     * @param asins                   A list of up to twenty Amazon Standard Identification Number (ASIN) values used to identify items in the given marketplace. (optional)
     * @param skus                    A list of up to twenty seller SKU values used to identify items in the given marketplace. (optional)
     * @param itemCondition           Filters the offer listings based on item condition. Possible values: New, Used, Collectible, Refurbished, Club. (optional)
     * @param offerType               Indicates whether to request pricing information for the seller&#x27;s B2C or B2B offers. Default is B2C. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPricingCall(String marketplaceId, String itemType, List<String> asins, List<String> skus, String itemCondition, String offerType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/products/pricing/v0/price";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("MarketplaceId", marketplaceId));
        if (asins != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "Asins", asins));
        if (skus != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "Skus", skus));
        if (itemType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ItemType", itemType));
        if (itemCondition != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ItemCondition", itemCondition));
        if (offerType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("OfferType", offerType));
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
    private com.squareup.okhttp.Call getPricingValidateBeforeCall(String marketplaceId, String itemType, List<String> asins, List<String> skus, String itemCondition, String offerType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getPricing(Async)");
        }
        // verify the required parameter 'itemType' is set
        if (itemType == null) {
            throw new ApiException("Missing the required parameter 'itemType' when calling getPricing(Async)");
        }
        com.squareup.okhttp.Call call = getPricingCall(marketplaceId, itemType, asins, skus, itemCondition, offerType, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Returns pricing information for a seller&#x27;s offer listings based on seller SKU or ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemType      Indicates whether ASIN values or seller SKU values are used to identify items. If you specify Asin, the information in the response will be dependent on the list of Asins you provide in the Asins parameter. If you specify Sku, the information in the response will be dependent on the list of Skus you provide in the Skus parameter. (required)
     * @param asins         A list of up to twenty Amazon Standard Identification Number (ASIN) values used to identify items in the given marketplace. (optional)
     * @param skus          A list of up to twenty seller SKU values used to identify items in the given marketplace. (optional)
     * @param itemCondition Filters the offer listings based on item condition. Possible values: New, Used, Collectible, Refurbished, Club. (optional)
     * @param offerType     Indicates whether to request pricing information for the seller&#x27;s B2C or B2B offers. Default is B2C. (optional)
     * @return GetPricingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetPricingResponse getPricing(String marketplaceId, String itemType, List<String> asins, List<String> skus, String itemCondition, String offerType) throws ApiException {
        ApiResponse<GetPricingResponse> resp = getPricingWithHttpInfo(marketplaceId, itemType, asins, skus, itemCondition, offerType);
        return resp.getData();
    }

    /**
     * Returns pricing information for a seller&#x27;s offer listings based on seller SKU or ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemType      Indicates whether ASIN values or seller SKU values are used to identify items. If you specify Asin, the information in the response will be dependent on the list of Asins you provide in the Asins parameter. If you specify Sku, the information in the response will be dependent on the list of Skus you provide in the Skus parameter. (required)
     * @param asins         A list of up to twenty Amazon Standard Identification Number (ASIN) values used to identify items in the given marketplace. (optional)
     * @param skus          A list of up to twenty seller SKU values used to identify items in the given marketplace. (optional)
     * @param itemCondition Filters the offer listings based on item condition. Possible values: New, Used, Collectible, Refurbished, Club. (optional)
     * @param offerType     Indicates whether to request pricing information for the seller&#x27;s B2C or B2B offers. Default is B2C. (optional)
     * @return ApiResponse&lt;GetPricingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetPricingResponse> getPricingWithHttpInfo(String marketplaceId, String itemType, List<String> asins, List<String> skus, String itemCondition, String offerType) throws ApiException {
        com.squareup.okhttp.Call call = getPricingValidateBeforeCall(marketplaceId, itemType, asins, skus, itemCondition, offerType, null, null);
        Type localVarReturnType = new TypeToken<GetPricingResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Returns pricing information for a seller&#x27;s offer listings based on seller SKU or ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @param marketplaceId A marketplace identifier. Specifies the marketplace for which prices are returned. (required)
     * @param itemType      Indicates whether ASIN values or seller SKU values are used to identify items. If you specify Asin, the information in the response will be dependent on the list of Asins you provide in the Asins parameter. If you specify Sku, the information in the response will be dependent on the list of Skus you provide in the Skus parameter. (required)
     * @param asins         A list of up to twenty Amazon Standard Identification Number (ASIN) values used to identify items in the given marketplace. (optional)
     * @param skus          A list of up to twenty seller SKU values used to identify items in the given marketplace. (optional)
     * @param itemCondition Filters the offer listings based on item condition. Possible values: New, Used, Collectible, Refurbished, Club. (optional)
     * @param offerType     Indicates whether to request pricing information for the seller&#x27;s B2C or B2B offers. Default is B2C. (optional)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPricingAsync(String marketplaceId, String itemType, List<String> asins, List<String> skus, String itemCondition, String offerType, final ApiCallback<GetPricingResponse> callback) throws ApiException {
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
        com.squareup.okhttp.Call call = getPricingValidateBeforeCall(marketplaceId, itemType, asins, skus, itemCondition, offerType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetPricingResponse>() {
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

        public ProductPricingApi build() {
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
            return new ProductPricingApi(new ApiClient()
                    .setAWSSigV4Signer(awsSigV4Signer)
                    .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                    .setBasePath(endpoint)
                    .setRateLimiter(rateLimitConfiguration));
        }
    }
}
