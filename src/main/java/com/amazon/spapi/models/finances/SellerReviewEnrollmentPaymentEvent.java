package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * A fee payment event for the Early Reviewer Program.
 */
@Schema(description = "A fee payment event for the Early Reviewer Program.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SellerReviewEnrollmentPaymentEvent {
    @SerializedName("PostedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("EnrollmentId")
    private String enrollmentId = null;
    @SerializedName("ParentASIN")
    private String parentASIN = null;
    @SerializedName("FeeComponent")
    private FeeComponent feeComponent = null;
    @SerializedName("ChargeComponent")
    private ChargeComponent chargeComponent = null;
    @SerializedName("TotalAmount")
    private Currency totalAmount = null;

    public SellerReviewEnrollmentPaymentEvent postedDate(OffsetDateTime postedDate) {
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

    public SellerReviewEnrollmentPaymentEvent enrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
        return this;
    }

    /**
     * An enrollment identifier.
     *
     * @return enrollmentId
     **/
    @Schema(description = "An enrollment identifier.")
    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public SellerReviewEnrollmentPaymentEvent parentASIN(String parentASIN) {
        this.parentASIN = parentASIN;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item that was enrolled in the Early Reviewer Program.
     *
     * @return parentASIN
     **/
    @Schema(description = "The Amazon Standard Identification Number (ASIN) of the item that was enrolled in the Early Reviewer Program.")
    public String getParentASIN() {
        return parentASIN;
    }

    public void setParentASIN(String parentASIN) {
        this.parentASIN = parentASIN;
    }

    public SellerReviewEnrollmentPaymentEvent feeComponent(FeeComponent feeComponent) {
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

    public SellerReviewEnrollmentPaymentEvent chargeComponent(ChargeComponent chargeComponent) {
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

    public SellerReviewEnrollmentPaymentEvent totalAmount(Currency totalAmount) {
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
        SellerReviewEnrollmentPaymentEvent sellerReviewEnrollmentPaymentEvent = (SellerReviewEnrollmentPaymentEvent) o;
        return Objects.equals(this.postedDate, sellerReviewEnrollmentPaymentEvent.postedDate) &&
                Objects.equals(this.enrollmentId, sellerReviewEnrollmentPaymentEvent.enrollmentId) &&
                Objects.equals(this.parentASIN, sellerReviewEnrollmentPaymentEvent.parentASIN) &&
                Objects.equals(this.feeComponent, sellerReviewEnrollmentPaymentEvent.feeComponent) &&
                Objects.equals(this.chargeComponent, sellerReviewEnrollmentPaymentEvent.chargeComponent) &&
                Objects.equals(this.totalAmount, sellerReviewEnrollmentPaymentEvent.totalAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postedDate, enrollmentId, parentASIN, feeComponent, chargeComponent, totalAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SellerReviewEnrollmentPaymentEvent {\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
        sb.append("    parentASIN: ").append(toIndentedString(parentASIN)).append("\n");
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
