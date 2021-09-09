# CatalogApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCatalogItem**](CatalogApi.md#getCatalogItem) | **GET** /catalog/2020-12-01/items/{asin} | 
[**searchCatalogItems**](CatalogApi.md#searchCatalogItems) | **GET** /catalog/2020-12-01/items | 

<a name="getCatalogItem"></a>
# **getCatalogItem**
> Item getCatalogItem(asin, marketplaceIds, includedData, locale)



Retrieves details for an item in the Amazon catalog.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 5 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).

### Example
```java
// Import classes:
//import com.amazon.spapi.client.ApiException;
//import com.amazon.spapi.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String asin = "asin_example"; // String | The Amazon Standard Identification Number (ASIN) of the item.
List<String> marketplaceIds = Arrays.asList("marketplaceIds_example"); // List<String> | A comma-delimited list of Amazon marketplace identifiers. Data sets in the response contain data only for the specified marketplaces.
List<String> includedData = Arrays.asList("includedData_example"); // List<String> | A comma-delimited list of data sets to include in the response. Default: summaries.
String locale = "locale_example"; // String | Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace.
try {
    Item result = apiInstance.getCatalogItem(asin, marketplaceIds, includedData, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#getCatalogItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **String**| The Amazon Standard Identification Number (ASIN) of the item. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers. Data sets in the response contain data only for the specified marketplaces. |
 **includedData** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of data sets to include in the response. Default: summaries. | [optional] [enum: attributes, identifiers, images, productTypes, salesRanks, summaries, variations, vendorDetails]
 **locale** | **String**| Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. | [optional]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchCatalogItems"></a>
# **searchCatalogItems**
> ItemSearchResults searchCatalogItems(keywords, marketplaceIds, includedData, brandNames, classificationIds, pageSize, pageToken, keywordsLocale, locale)



Search for and return a list of Amazon catalog items and associated information.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1 | 5 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).

### Example
```java
// Import classes:
//import com.amazon.spapi.client.ApiException;
//import com.amazon.spapi.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
List<String> keywords = Arrays.asList("keywords_example"); // List<String> | A comma-delimited list of words or item identifiers to search the Amazon catalog for.
List<String> marketplaceIds = Arrays.asList("marketplaceIds_example"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
List<String> includedData = Arrays.asList("includedData_example"); // List<String> | A comma-delimited list of data sets to include in the response. Default: summaries.
List<String> brandNames = Arrays.asList("brandNames_example"); // List<String> | A comma-delimited list of brand names to limit the search to.
List<String> classificationIds = Arrays.asList("classificationIds_example"); // List<String> | A comma-delimited list of classification identifiers to limit the search to.
Integer pageSize = 10; // Integer | Number of results to be returned per page.
String pageToken = "pageToken_example"; // String | A token to fetch a certain page when there are multiple pages worth of results.
String keywordsLocale = "keywordsLocale_example"; // String | The language the keywords are provided in. Defaults to the primary locale of the marketplace.
String locale = "locale_example"; // String | Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace.
try {
    ItemSearchResults result = apiInstance.searchCatalogItems(keywords, marketplaceIds, includedData, brandNames, classificationIds, pageSize, pageToken, keywordsLocale, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#searchCatalogItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywords** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of words or item identifiers to search the Amazon catalog for. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **includedData** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of data sets to include in the response. Default: summaries. | [optional] [enum: identifiers, images, productTypes, salesRanks, summaries, variations, vendorDetails]
 **brandNames** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of brand names to limit the search to. | [optional]
 **classificationIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of classification identifiers to limit the search to. | [optional]
 **pageSize** | **Integer**| Number of results to be returned per page. | [optional] [default to 10] [enum: ]
 **pageToken** | **String**| A token to fetch a certain page when there are multiple pages worth of results. | [optional]
 **keywordsLocale** | **String**| The language the keywords are provided in. Defaults to the primary locale of the marketplace. | [optional]
 **locale** | **String**| Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. | [optional]

### Return type

[**ItemSearchResults**](ItemSearchResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

