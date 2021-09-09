# ListingsApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteListingsItem**](ListingsApi.md#deleteListingsItem) | **DELETE** /listings/2020-09-01/items/{sellerId}/{sku} | 
[**patchListingsItem**](ListingsApi.md#patchListingsItem) | **PATCH** /listings/2020-09-01/items/{sellerId}/{sku} | 
[**putListingsItem**](ListingsApi.md#putListingsItem) | **PUT** /listings/2020-09-01/items/{sellerId}/{sku} | 

<a name="deleteListingsItem"></a>
# **deleteListingsItem**
> ListingsItemSubmissionResponse deleteListingsItem(sellerId, sku, marketplaceIds, issueLocale)



Delete a listings item for a selling partner.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).

### Example
```java
// Import classes:
//import com.amazon.spapi.client.ApiException;
//import com.amazon.spapi.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account or vendor code.
String sku = "sku_example"; // String | A selling partner provided identifier for an Amazon listing.
List<String> marketplaceIds = Arrays.asList("marketplaceIds_example"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
String issueLocale = "issueLocale_example"; // String | A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \"en_US\", \"fr_CA\", \"fr_FR\". Localized messages default to \"en_US\" when a localization is not available in the specified locale.
try {
    ListingsItemSubmissionResponse result = apiInstance.deleteListingsItem(sellerId, sku, marketplaceIds, issueLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#deleteListingsItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **String**| A selling partner identifier, such as a merchant account or vendor code. |
 **sku** | **String**| A selling partner provided identifier for an Amazon listing. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **issueLocale** | **String**| A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. | [optional]

### Return type

[**ListingsItemSubmissionResponse**](ListingsItemSubmissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchListingsItem"></a>
# **patchListingsItem**
> ListingsItemSubmissionResponse patchListingsItem(body, marketplaceIds, sellerId, sku, issueLocale)



Partially update (patch) a listings item for a selling partner. Only top-level listings item attributes can be patched. Patching nested attributes is not supported.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).

### Example
```java
// Import classes:
//import com.amazon.spapi.client.ApiException;
//import com.amazon.spapi.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
ListingsItemPatchRequest body = new ListingsItemPatchRequest(); // ListingsItemPatchRequest | The request body schema for the patchListingsItem operation.
List<String> marketplaceIds = Arrays.asList("marketplaceIds_example"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account or vendor code.
String sku = "sku_example"; // String | A selling partner provided identifier for an Amazon listing.
String issueLocale = "issueLocale_example"; // String | A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \"en_US\", \"fr_CA\", \"fr_FR\". Localized messages default to \"en_US\" when a localization is not available in the specified locale.
try {
    ListingsItemSubmissionResponse result = apiInstance.patchListingsItem(body, marketplaceIds, sellerId, sku, issueLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#patchListingsItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListingsItemPatchRequest**](ListingsItemPatchRequest.md)| The request body schema for the patchListingsItem operation. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **sellerId** | **String**| A selling partner identifier, such as a merchant account or vendor code. |
 **sku** | **String**| A selling partner provided identifier for an Amazon listing. |
 **issueLocale** | **String**| A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. | [optional]

### Return type

[**ListingsItemSubmissionResponse**](ListingsItemSubmissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putListingsItem"></a>
# **putListingsItem**
> ListingsItemSubmissionResponse putListingsItem(body, marketplaceIds, sellerId, sku, issueLocale)



Creates a new or fully-updates an existing listings item for a selling partner.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).

### Example
```java
// Import classes:
//import com.amazon.spapi.client.ApiException;
//import com.amazon.spapi.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
ListingsItemPutRequest body = new ListingsItemPutRequest(); // ListingsItemPutRequest | The request body schema for the putListingsItem operation.
List<String> marketplaceIds = Arrays.asList("marketplaceIds_example"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account or vendor code.
String sku = "sku_example"; // String | A selling partner provided identifier for an Amazon listing.
String issueLocale = "issueLocale_example"; // String | A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \"en_US\", \"fr_CA\", \"fr_FR\". Localized messages default to \"en_US\" when a localization is not available in the specified locale.
try {
    ListingsItemSubmissionResponse result = apiInstance.putListingsItem(body, marketplaceIds, sellerId, sku, issueLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#putListingsItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListingsItemPutRequest**](ListingsItemPutRequest.md)| The request body schema for the putListingsItem operation. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **sellerId** | **String**| A selling partner identifier, such as a merchant account or vendor code. |
 **sku** | **String**| A selling partner provided identifier for an Amazon listing. |
 **issueLocale** | **String**| A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. | [optional]

### Return type

[**ListingsItemSubmissionResponse**](ListingsItemSubmissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

