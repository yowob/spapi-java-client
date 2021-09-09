# ServiceJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time of the creation of the job, in ISO 8601 format. |  [optional]
**serviceJobId** | **String** |  |  [optional]
**serviceJobStatus** | [**ServiceJobStatusEnum**](#ServiceJobStatusEnum) | The status of the service job. |  [optional]
**scopeOfWork** | [**ScopeOfWork**](ScopeOfWork.md) |  |  [optional]
**seller** | [**Seller**](Seller.md) |  |  [optional]
**serviceJobProvider** | [**ServiceJobProvider**](ServiceJobProvider.md) |  |  [optional]
**preferredAppointmentTimes** | [**List&lt;AppointmentTime&gt;**](AppointmentTime.md) | A list of appointment windows preferred by the buyer. Included only if the buyer selected appointment windows when creating the order. |  [optional]
**appointments** | [**List&lt;Appointment&gt;**](Appointment.md) | A list of appointments. |  [optional]
**serviceOrderId** | **String** |  |  [optional]
**marketplaceId** | **String** | The marketplace identifier. |  [optional]
**buyer** | [**Buyer**](Buyer.md) |  |  [optional]
**associatedItems** | [**List&lt;AssociatedItem&gt;**](AssociatedItem.md) | A list of items associated with the service job. |  [optional]
**serviceLocation** | [**ServiceLocation**](ServiceLocation.md) |  |  [optional]

<a name="ServiceJobStatusEnum"></a>
## Enum: ServiceJobStatusEnum
Name | Value
---- | -----
NOT_SERVICED | &quot;NOT_SERVICED&quot;
CANCELLED | &quot;CANCELLED&quot;
COMPLETED | &quot;COMPLETED&quot;
PENDING_SCHEDULE | &quot;PENDING_SCHEDULE&quot;
NOT_FULFILLABLE | &quot;NOT_FULFILLABLE&quot;
HOLD | &quot;HOLD&quot;
PAYMENT_DECLINED | &quot;PAYMENT_DECLINED&quot;
