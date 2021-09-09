# Issue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | An issue code that identifies the type of issue. | 
**message** | **String** | A message that describes the issue. | 
**severity** | [**SeverityEnum**](#SeverityEnum) | The severity of the issue. | 
**attributeName** | **String** | Name of the attribute associated with the issue, if applicable. |  [optional]

<a name="SeverityEnum"></a>
## Enum: SeverityEnum
Name | Value
---- | -----
ERROR | &quot;ERROR&quot;
WARNING | &quot;WARNING&quot;
INFO | &quot;INFO&quot;
