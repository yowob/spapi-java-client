# Container

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containerType** | [**ContainerTypeEnum**](#ContainerTypeEnum) | The type of physical container being used. (always &#x27;PACKAGE&#x27;) |  [optional]
**containerReferenceId** | **String** |  | 
**value** | [**Currency**](Currency.md) |  | 
**dimensions** | [**Dimensions**](Dimensions.md) |  | 
**items** | [**List&lt;ContainerItem&gt;**](ContainerItem.md) | A list of the items in the container. | 
**weight** | [**Weight**](Weight.md) |  | 

<a name="ContainerTypeEnum"></a>
## Enum: ContainerTypeEnum
Name | Value
---- | -----
PACKAGE | &quot;PACKAGE&quot;
