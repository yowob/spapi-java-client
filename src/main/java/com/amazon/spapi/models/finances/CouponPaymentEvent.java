package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * An event related to coupon payments.
 */
@Schema(description = "An event related to coupon payments.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CouponPaymentEvent {
    @SerializedName("PostedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("CouponId")
    private String couponId = null;
    @SerializedName("SellerCouponDescription")
    private String sellerCouponDescription = null;
    @SerializedName("ClipOrRedemptionCount")
    private Long clipOrRedemptionCount = null;
    @SerializedName("PaymentEventId")
    private String paymentEventId = null;
    @SerializedName("FeeComponent")
    private FeeComponent feeComponent = null;
    @SerializedName("ChargeComponent")
    private ChargeComponent chargeComponent = null;
    @SerializedName("TotalAmount")
    private Currency totalAmount = null;

    public CouponPaymentEvent postedDate(OffsetDateTime postedDate) {
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

    public CouponPaymentEvent couponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    /**
     * A coupon identifier.
     *
     * @return couponId
     **/
    @Schema(description = "A coupon identifier.")
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public CouponPaymentEvent sellerCouponDescription(String sellerCouponDescription) {
        this.sellerCouponDescription = sellerCouponDescription;
        return this;
    }

    /**
     * The description provided by the seller when they created the coupon.
     *
     * @return sellerCouponDescription
     **/
    @Schema(description = "The description provided by the seller when they created the coupon.")
    public String getSellerCouponDescription() {
        return sellerCouponDescription;
    }

    public void setSellerCouponDescription(String sellerCouponDescription) {
        this.sellerCouponDescription = sellerCouponDescription;
    }

    public CouponPaymentEvent clipOrRedemptionCount(Long clipOrRedemptionCount) {
        this.clipOrRedemptionCount = clipOrRedemptionCount;
        return this;
    }

    /**
     * The number of coupon clips or redemptions.
     *
     * @return clipOrRedemptionCount
     **/
    @Schema(description = "The number of coupon clips or redemptions.")
    public Long getClipOrRedemptionCount() {
        return clipOrRedemptionCount;
    }

    public void setClipOrRedemptionCount(Long clipOrRedemptionCount) {
        this.clipOrRedemptionCount = clipOrRedemptionCount;
    }

    public CouponPaymentEvent paymentEventId(String paymentEventId) {
        this.paymentEventId = paymentEventId;
        return this;
    }

    /**
     * A payment event identifier.
     *
     * @return paymentEventId
     **/
    @Schema(description = "A payment event identifier.")
    public String getPaymentEventId() {
        return paymentEventId;
    }

    public void setPaymentEventId(String paymentEventId) {
        this.paymentEventId = paymentEventId;
    }

    public CouponPaymentEvent feeComponent(FeeComponent feeComponent) {
        this.feeComponent = feeComponent;
        return this;
    }

    /**
     * Get feeComponent
     *
     * @return feeComponent
     **/
    @Schema(description = "")
    public FeeComponent getFeeComponent() {
        return feeComponent;
    }

    public void setFeeComponent(FeeComponent feeComponent) {
        this.feeComponent = feeComponent;
    }

    public CouponPaymentEvent chargeComponent(ChargeComponent chargeComponent) {
        this.chargeComponent = chargeComponent;
        return this;
    }

    /**
     * Get chargeComponent
     *
     * @return chargeComponent
     **/
    @Schema(description = "")
    public ChargeComponent getChargeComponent() {
        return chargeComponent;
    }

    public void setChargeComponent(ChargeComponent chargeComponent) {
        this.chargeComponent = chargeComponent;
    }

    public CouponPaymentEvent totalAmount(Currency totalAmount) {
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
        CouponPaymentEvent couponPaymentEvent = (CouponPaymentEvent) o;
        return Objects.equals(this.postedDate, couponPaymentEvent.postedDate) &&
                Objects.equals(this.couponId, couponPaymentEvent.couponId) &&
                Objects.equals(this.sellerCouponDescription, couponPaymentEvent.sellerCouponDescription) &&
                Objects.equals(this.clipOrRedemptionCount, couponPaymentEvent.clipOrRedemptionCount) &&
                Objects.equals(this.paymentEventId, couponPaymentEvent.paymentEventId) &&
                Objects.equals(this.feeComponent, couponPaymentEvent.feeComponent) &&
                Objects.equals(this.chargeComponent, couponPaymentEvent.chargeComponent) &&
                Objects.equals(this.totalAmount, couponPaymentEvent.totalAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postedDate, couponId, sellerCouponDescription, clipOrRedemptionCount, paymentEventId, feeComponent, chargeComponent, totalAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CouponPaymentEvent {\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    sellerCouponDescription: ").append(toIndentedString(sellerCouponDescription)).append("\n");
        sb.append("    clipOrRedemptionCount: ").append(toIndentedString(clipOrRedemptionCount)).append("\n");
        sb.append("    paymentEventId: ").append(toIndentedString(paymentEventId)).append("\n");
        sb.append("    feeComponent: ").append(toIndentedString(feeComponent)).append("\n");
        sb.append("    chargeComponent: ").append(toIndentedString(chargeComponent)).append("\n");
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
