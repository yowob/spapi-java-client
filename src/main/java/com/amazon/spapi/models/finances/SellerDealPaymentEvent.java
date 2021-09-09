package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * An event linked to the payment of a fee related to the specified deal.
 */
@Schema(description = "An event linked to the payment of a fee related to the specified deal.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SellerDealPaymentEvent {
    @SerializedName("postedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("dealId")
    private String dealId = null;
    @SerializedName("dealDescription")
    private String dealDescription = null;
    @SerializedName("eventType")
    private String eventType = null;
    @SerializedName("feeType")
    private String feeType = null;
    @SerializedName("feeAmount")
    private Currency feeAmount = null;
    @SerializedName("taxAmount")
    private Currency taxAmount = null;
    @SerializedName("totalAmount")
    private Currency totalAmount = null;

    public SellerDealPaymentEvent postedDate(OffsetDateTime postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get postedDate
     *
     * @return postedDate
     **/
    @Schema(description = "")
    public OffsetDateTime getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(OffsetDateTime postedDate) {
        this.postedDate = postedDate;
    }

    public SellerDealPaymentEvent dealId(String dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
     * The unique identifier of the deal.
     *
     * @return dealId
     **/
    @Schema(description = "The unique identifier of the deal.")
    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public SellerDealPaymentEvent dealDescription(String dealDescription) {
        this.dealDescription = dealDescription;
        return this;
    }

    /**
     * The internal description of the deal.
     *
     * @return dealDescription
     **/
    @Schema(description = "The internal description of the deal.")
    public String getDealDescription() {
        return dealDescription;
    }

    public void setDealDescription(String dealDescription) {
        this.dealDescription = dealDescription;
    }

    public SellerDealPaymentEvent eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * The type of event: SellerDealComplete.
     *
     * @return eventType
     **/
    @Schema(description = "The type of event: SellerDealComplete.")
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public SellerDealPaymentEvent feeType(String feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * The type of fee: RunLightningDealFee.
     *
     * @return feeType
     **/
    @Schema(description = "The type of fee: RunLightningDealFee.")
    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public SellerDealPaymentEvent feeAmount(Currency feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Get feeAmount
     *
     * @return feeAmount
     **/
    @Schema(description = "")
    public Currency getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Currency feeAmount) {
        this.feeAmount = feeAmount;
    }

    public SellerDealPaymentEvent taxAmount(Currency taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Get taxAmount
     *
     * @return taxAmount
     **/
    @Schema(description = "")
    public Currency getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Currency taxAmount) {
        this.taxAmount = taxAmount;
    }

    public SellerDealPaymentEvent totalAmount(Currency totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Get totalAmount
     *
     * @return totalAmount
     **/
    @Schema(description = "")
    public Currency getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Currency totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SellerDealPaymentEvent sellerDealPaymentEvent = (SellerDealPaymentEvent) o;
        return Objects.equals(this.postedDate, sellerDealPaymentEvent.postedDate) &&
                Objects.equals(this.dealId, sellerDealPaymentEvent.dealId) &&
                Objects.equals(this.dealDescription, sellerDealPaymentEvent.dealDescription) &&
                Objects.equals(this.eventType, sellerDealPaymentEvent.eventType) &&
                Objects.equals(this.feeType, sellerDealPaymentEvent.feeType) &&
                Objects.equals(this.feeAmount, sellerDealPaymentEvent.feeAmount) &&
                Objects.equals(this.taxAmount, sellerDealPaymentEvent.taxAmount) &&
                Objects.equals(this.totalAmount, sellerDealPaymentEvent.totalAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postedDate, dealId, dealDescription, eventType, feeType, feeAmount, taxAmount, totalAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SellerDealPaymentEvent {\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    dealDescription: ").append(toIndentedString(dealDescription)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
        sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
        sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
