# FeePreview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asin** | **String** | The Amazon Standard Identification Number (ASIN) value used to identify the item. |  [optional]
**price** | [**MoneyType**](MoneyType.md) |  |  [optional]
**feeBreakdown** | [**List&lt;FeeLineItem&gt;**](FeeLineItem.md) | A list of the Small and Light fees for the item. |  [optional]
**totalFees** | [**MoneyType**](MoneyType.md) |  |  [optional]
**errors** | [**List&lt;Error&gt;**](Error.md) | One or more unexpected errors occurred during the getSmallAndLightFeePreview operation. |  [optional]
