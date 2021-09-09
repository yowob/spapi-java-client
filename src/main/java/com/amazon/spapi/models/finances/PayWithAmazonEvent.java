package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * An event related to the seller&#x27;s Pay with Amazon account.
 */
@Schema(description = "An event related to the seller's Pay with Amazon account.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PayWithAmazonEvent {
    @SerializedName("SellerOrderId")
    private String sellerOrderId = null;
    @SerializedName("TransactionPostedDate")
    private OffsetDateTime transactionPostedDate = null;
    @SerializedName("BusinessObjectType")
    private String businessObjectType = null;
    @SerializedName("SalesChannel")
    private String salesChannel = null;
    @SerializedName("Charge")
    private ChargeComponent charge = null;
    @SerializedName("FeeList")
    private FeeComponentList feeList = null;
    @SerializedName("PaymentAmountType")
    private String paymentAmountType = null;
    @SerializedName("AmountDescription")
    private String amountDescription = null;
    @SerializedName("FulfillmentChannel")
    private String fulfillmentChannel = null;
    @SerializedName("StoreName")
    private String storeName = null;

    public PayWithAmazonEvent sellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
        return this;
    }

    /**
     * An order identifier that is specified by the seller.
     *
     * @return sellerOrderId
     **/
    @Schema(description = "An order identifier that is specified by the seller.")
    public String getSellerOrderId() {
        return sellerOrderId;
    }

    public void setSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
    }

    public PayWithAmazonEvent transactionPostedDate(OffsetDateTime transactionPostedDate) {
        this.transactionPostedDate = transactionPostedDate;
        return this;
    }

    /**
     * Get transactionPostedDate
     *
     * @return transactionPostedDate
     **/
    @Schema(description = "")
    public OffsetDateTime getTransactionPostedDate() {
        return transactionPostedDate;
    }

    public void setTransactionPostedDate(OffsetDateTime transactionPostedDate) {
        this.transactionPostedDate = transactionPostedDate;
    }

    public PayWithAmazonEvent businessObjectType(String businessObjectType) {
        this.businessObjectType = businessObjectType;
        return this;
    }

    /**
     * The type of business object.
     *
     * @return businessObjectType
     **/
    @Schema(description = "The type of business object.")
    public String getBusinessObjectType() {
        return businessObjectType;
    }

    public void setBusinessObjectType(String businessObjectType) {
        this.businessObjectType = businessObjectType;
    }

    public PayWithAmazonEvent salesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
        return this;
    }

    /**
     * The sales channel for the transaction.
     *
     * @return salesChannel
     **/
    @Schema(description = "The sales channel for the transaction.")
    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    public PayWithAmazonEvent charge(ChargeComponent charge) {
        this.charge = charge;
        return this;
    }

    /**
     * Get charge
     *
     * @return charge
     **/
    @Schema(description = "")
    public ChargeComponent getCharge() {
        return charge;
    }

    public void setCharge(ChargeComponent charge) {
        this.charge = charge;
    }

    public PayWithAmazonEvent feeList(FeeComponentList feeList) {
        this.feeList = feeList;
        return this;
    }

    /**
     * Get feeList
     *
     * @return feeList
     **/
    @Schema(description = "")
    public FeeComponentList getFeeList() {
        return feeList;
    }

    public void setFeeList(FeeComponentList feeList) {
        this.feeList = feeList;
    }

    public PayWithAmazonEvent paymentAmountType(String paymentAmountType) {
        this.paymentAmountType = paymentAmountType;
        return this;
    }

    /**
     * The type of payment.  Possible values:  * Sales
     *
     * @return paymentAmountType
     **/
    @Schema(description = "The type of payment.  Possible values:  * Sales")
    public String getPaymentAmountType() {
        return paymentAmountType;
    }

    public void setPaymentAmountType(String paymentAmountType) {
        this.paymentAmountType = paymentAmountType;
    }

    public PayWithAmazonEvent amountDescription(String amountDescription) {
        this.amountDescription = amountDescription;
        return this;
    }

    /**
     * A short description of this payment event.
     *
     * @return amountDescription
     **/
    @Schema(description = "A short description of this payment event.")
    public String getAmountDescription() {
        return amountDescription;
    }

    public void setAmountDescription(String amountDescription) {
        this.amountDescription = amountDescription;
    }

    public PayWithAmazonEvent fulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
        return this;
    }

    /**
     * The fulfillment channel.  Possible values:  * AFN - Amazon Fulfillment Network (Fulfillment by Amazon)  * MFN - Merchant Fulfillment Network (self-fulfilled)
     *
     * @return fulfillmentChannel
     **/
    @Schema(description = "The fulfillment channel.  Possible values:  * AFN - Amazon Fulfillment Network (Fulfillment by Amazon)  * MFN - Merchant Fulfillment Network (self-fulfilled)")
    public String getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    public void setFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
    }

    public PayWithAmazonEvent storeName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * The store name where the event occurred.
     *
     * @return storeName
     **/
    @Schema(description = "The store name where the event occurred.")
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PayWithAmazonEvent payWithAmazonEvent = (PayWithAmazonEvent) o;
        return Objects.equals(this.sellerOrderId, payWithAmazonEvent.sellerOrderId) &&
                Objects.equals(this.transactionPostedDate, payWithAmazonEvent.transactionPostedDate) &&
                Objects.equals(this.businessObjectType, payWithAmazonEvent.businessObjectType) &&
                Objects.equals(this.salesChannel, payWithAmazonEvent.salesChannel) &&
                Objects.equals(this.charge, payWithAmazonEvent.charge) &&
                Objects.equals(this.feeList, payWithAmazonEvent.feeList) &&
                Objects.equals(this.paymentAmountType, payWithAmazonEvent.paymentAmountType) &&
                Objects.equals(this.amountDescription, payWithAmazonEvent.amountDescription) &&
                Objects.equals(this.fulfillmentChannel, payWithAmazonEvent.fulfillmentChannel) &&
                Objects.equals(this.storeName, payWithAmazonEvent.storeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerOrderId, transactionPostedDate, businessObjectType, salesChannel, charge, feeList, paymentAmountType, amountDescription, fulfillmentChannel, storeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PayWithAmazonEvent {\n");
        sb.append("    sellerOrderId: ").append(toIndentedString(sellerOrderId)).append("\n");
        sb.append("    transactionPostedDate: ").append(toIndentedString(transactionPostedDate)).append("\n");
        sb.append("    businessObjectType: ").append(toIndentedString(businessObjectType)).append("\n");
        sb.append("    salesChannel: ").append(toIndentedString(salesChannel)).append("\n");
        sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
        sb.append("    feeList: ").append(toIndentedString(feeList)).append("\n");
        sb.append("    paymentAmountType: ").append(toIndentedString(paymentAmountType)).append("\n");
        sb.append("    amountDescription: ").append(toIndentedString(amountDescription)).append("\n");
        sb.append("    fulfillmentChannel: ").append(toIndentedString(fulfillmentChannel)).append("\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
