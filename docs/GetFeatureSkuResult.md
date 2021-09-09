# GetFeatureSkuResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketplaceId** | **String** | The requested marketplace. | 
**featureName** | **String** | The name of the feature. | 
**isEligible** | **Boolean** | When true, the seller SKU is eligible for the requested feature. | 
**ineligibleReasons** | **List&lt;String&gt;** | A list of one or more reasons that the seller SKU is ineligibile for the feature.  Possible values: * MERCHANT_NOT_ENROLLED - The merchant isn&#x27;t enrolled for the feature. * SKU_NOT_ELIGIBLE - The SKU doesn&#x27;t reside in a warehouse that supports the feature. * INVALID_SKU - There is an issue with the SKU provided. |  [optional]
**skuInfo** | [**FeatureSku**](FeatureSku.md) |  |  [optional]
