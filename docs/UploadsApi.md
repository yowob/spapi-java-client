# UploadsApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUploadDestinationForResource**](UploadsApi.md#createUploadDestinationForResource) | **POST** /uploads/2020-11-01/uploadDestinations/{resource} | 

<a name="createUploadDestinationForResource"></a>
# **createUploadDestinationForResource**
> CreateUploadDestinationResponse createUploadDestinationForResource(marketplaceIds, contentMD5, resource, contentType)



Creates an upload destination, returning the information required to upload a file to the destination and to programmatically access the file.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | .1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.spapi.client.ApiException;
//import com.amazon.spapi.api.UploadsApi;


UploadsApi apiInstance = new UploadsApi();
List<String> marketplaceIds = Arrays.asList("marketplaceIds_example"); // List<String> | A list of marketplace identifiers. This specifies the marketplaces where the upload will be available. Only one marketplace can be specified.
String contentMD5 = "contentMD5_example"; // String | An MD5 hash of the content to be submitted to the upload destination. This value is used to determine if the data has been corrupted or tampered with during transit.
String resource = "resource_example"; // String | The resource for the upload destination that you are creating. For example, if you are creating an upload destination for the createLegalDisclosure operation of the Messaging API, the {resource} would be /messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure, and the entire path would be /uploads/2020-11-01/uploadDestinations/messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure.
String contentType = "contentType_example"; // String | The content type of the file to be uploaded.
try {
    CreateUploadDestinationResponse result = apiInstance.createUploadDestinationForResource(marketplaceIds, contentMD5, resource, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#createUploadDestinationForResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A list of marketplace identifiers. This specifies the marketplaces where the upload will be available. Only one marketplace can be specified. |
 **contentMD5** | **String**| An MD5 hash of the content to be submitted to the upload destination. This value is used to determine if the data has been corrupted or tampered with during transit. |
 **resource** | **String**| The resource for the upload destination that you are creating. For example, if you are creating an upload destination for the createLegalDisclosure operation of the Messaging API, the {resource} would be /messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure, and the entire path would be /uploads/2020-11-01/uploadDestinations/messaging/v1/orders/{amazonOrderId}/messages/legalDisclosure. |
 **contentType** | **String**| The content type of the file to be uploaded. | [optional]

### Return type

[**CreateUploadDestinationResponse**](CreateUploadDestinationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

