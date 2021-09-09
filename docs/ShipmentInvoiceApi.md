# ShipmentInvoiceApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInvoiceStatus**](ShipmentInvoiceApi.md#getInvoiceStatus) | **GET** /fba/outbound/brazil/v0/shipments/{shipmentId}/invoice/status | 
[**getShipmentDetails**](ShipmentInvoiceApi.md#getShipmentDetails) | **GET** /fba/outbound/brazil/v0/shipments/{shipmentId} | 
[**submitInvoice**](ShipmentInvoiceApi.md#submitInvoice) | **POST** /fba/outbound/brazil/v0/shipments/{shipmentId}/invoice | 

<a name="getInvoiceStatus"></a>
# **getInvoiceStatus**
> GetInvoiceStatusResponse getInvoiceStatus(shipmentId)



Returns the invoice status for the shipment you specify.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1.133 | 25 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.spapi.client.ApiException;
//import com.amazon.spapi.api.ShipmentInvoiceApi;


ShipmentInvoiceApi apiInstance = new ShipmentInvoiceApi();
String shipmentId = "shipmentId_example"; // String | The shipment identifier for the shipment.
try {
    GetInvoiceStatusResponse result = apiInstance.getInvoiceStatus(shipmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentInvoiceApi#getInvoiceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **String**| The shipment identifier for the shipment. |

### Return type

[**GetInvoiceStatusResponse**](GetInvoiceStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShipmentDetails"></a>
# **getShipmentDetails**
> GetShipmentDetailsResponse getShipmentDetails(shipmentId)



Returns the shipment details required to issue an invoice for the specified shipment.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1.133 | 25 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.spapi.client.ApiException;
//import com.amazon.spapi.api.ShipmentInvoiceApi;


ShipmentInvoiceApi apiInstance = new ShipmentInvoiceApi();
String shipmentId = "shipmentId_example"; // String | The identifier for the shipment. Get this value from the FBAOutboundShipmentStatus notification. For information about subscribing to notifications, see the [Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md).
try {
    GetShipmentDetailsResponse result = apiInstance.getShipmentDetails(shipmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentInvoiceApi#getShipmentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **String**| The identifier for the shipment. Get this value from the FBAOutboundShipmentStatus notification. For information about subscribing to notifications, see the [Notifications API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md). |

### Return type

[**GetShipmentDetailsResponse**](GetShipmentDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitInvoice"></a>
# **submitInvoice**
> SubmitInvoiceResponse submitInvoice(body, shipmentId)



Submits a shipment invoice document for a given shipment.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1.133 | 25 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.spapi.client.ApiException;
//import com.amazon.spapi.api.ShipmentInvoiceApi;


ShipmentInvoiceApi apiInstance = new ShipmentInvoiceApi();
SubmitInvoiceRequest body = new SubmitInvoiceRequest(); // SubmitInvoiceRequest | 
String shipmentId = "shipmentId_example"; // String | The identifier for the shipment.
try {
    SubmitInvoiceResponse result = apiInstance.submitInvoice(body, shipmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentInvoiceApi#submitInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitInvoiceRequest**](SubmitInvoiceRequest.md)|  |
 **shipmentId** | **String**| The identifier for the shipment. |

### Return type

[**SubmitInvoiceResponse**](SubmitInvoiceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

