package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A payment made directly to a seller.
 */
@Schema(description = "A payment made directly to a seller.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class DirectPayment {
    @SerializedName("DirectPaymentType")
    private String directPaymentType = null;
    @SerializedName("DirectPaymentAmount")
    private Currency directPaymentAmount = null;

    public DirectPayment directPaymentType(String directPaymentType) {
        this.directPaymentType = directPaymentType;
        return this;
    }

    /**
     * The type of payment.  Possible values:  * StoredValueCardRevenue - The amount that is deducted from the seller&#x27;s account because the seller received money through a stored value card.  * StoredValueCardRefund - The amount that Amazon returns to the seller if the order that is bought using a stored value card is refunded.  * PrivateLabelCreditCardRevenue - The amount that is deducted from the seller&#x27;s account because the seller received money through a private label credit card offered by Amazon.  * PrivateLabelCreditCardRefund - The amount that Amazon returns to the seller if the order that is bought using a private label credit card offered by Amazon is refunded.  * CollectOnDeliveryRevenue - The COD amount that the seller collected directly from the buyer.  * CollectOnDeliveryRefund - The amount that Amazon refunds to the buyer if an order paid for by COD is refunded.
     *
     * @return directPaymentType
     **/
    @Schema(description = "The type of payment.  Possible values:  * StoredValueCardRevenue - The amount that is deducted from the seller's account because the seller received money through a stored value card.  * StoredValueCardRefund - The amount that Amazon returns to the seller if the order that is bought using a stored value card is refunded.  * PrivateLabelCreditCardRevenue - The amount that is deducted from the seller's account because the seller received money through a private label credit card offered by Amazon.  * PrivateLabelCreditCardRefund - The amount that Amazon returns to the seller if the order that is bought using a private label credit card offered by Amazon is refunded.  * CollectOnDeliveryRevenue - The COD amount that the seller collected directly from the buyer.  * CollectOnDeliveryRefund - The amount that Amazon refunds to the buyer if an order paid for by COD is refunded.")
    public String getDirectPaymentType() {
        return directPaymentType;
    }

    public void setDirectPaymentType(String directPaymentType) {
        this.directPaymentType = directPaymentType;
    }

    public DirectPayment directPaymentAmount(Currency directPaymentAmount) {
        this.directPaymentAmount = directPaymentAmount;
        return this;
    }

    /**
     * Get directPaymentAmount
     *
     * @return directPaymentAmount
     **/
    @Schema(description = "")
    public Currency getDirectPaymentAmount() {
        return directPaymentAmount;
    }

    public void setDirectPaymentAmount(Currency directPaymentAmount) {
        this.directPaymentAmount = directPaymentAmount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DirectPayment directPayment = (DirectPayment) o;
        return Objects.equals(this.directPaymentType, directPayment.directPaymentType) &&
                Objects.equals(this.directPaymentAmount, directPayment.directPaymentAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directPaymentType, directPaymentAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectPayment {\n");
        sb.append("    directPaymentType: ").append(toIndentedString(directPaymentType)).append("\n");
        sb.append("    directPaymentAmount: ").append(toIndentedString(directPaymentAmount)).append("\n");
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
