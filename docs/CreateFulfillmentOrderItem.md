# CreateFulfillmentOrderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sellerSku** | **String** | The seller SKU of the item. | 
**sellerFulfillmentOrderItemId** | **String** | A fulfillment order item identifier that the seller creates to track fulfillment order items. Used to disambiguate multiple fulfillment items that have the same SellerSKU. For example, the seller might assign different SellerFulfillmentOrderItemId values to two items in a fulfillment order that share the same SellerSKU but have different GiftMessage values. | 
**quantity** | **Integer** |  | 
**giftMessage** | **String** | A message to the gift recipient, if applicable. |  [optional]
**displayableComment** | **String** | Item-specific text that displays in recipient-facing materials such as the outbound shipment packing slip. |  [optional]
**fulfillmentNetworkSku** | **String** | Amazon&#x27;s fulfillment network SKU of the item. |  [optional]
**perUnitDeclaredValue** | [**Money**](Money.md) |  |  [optional]
**perUnitPrice** | [**Money**](Money.md) |  |  [optional]
**perUnitTax** | [**Money**](Money.md) |  |  [optional]
