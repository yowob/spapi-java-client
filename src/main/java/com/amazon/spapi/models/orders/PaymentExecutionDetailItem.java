package com.amazon.spapi.models.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information about a sub-payment method used to pay for a COD order.
 */
@Schema(description = "Information about a sub-payment method used to pay for a COD order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PaymentExecutionDetailItem {
    @SerializedName("Payment")
    private Money payment = null;
    @SerializedName("PaymentMethod")
    private String paymentMethod = null;

    public PaymentExecutionDetailItem payment(Money payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Get payment
     *
     * @return payment
     **/
    @Schema(required = true, description = "")
    public Money getPayment() {
        return payment;
    }

    public void setPayment(Money payment) {
        this.payment = payment;
    }

    public PaymentExecutionDetailItem paymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * A sub-payment method for a COD order.  Possible values:  * COD - Cash On Delivery.  * GC - Gift Card.  * PointsAccount - Amazon Points.
     *
     * @return paymentMethod
     **/
    @Schema(required = true, description = "A sub-payment method for a COD order.  Possible values:  * COD - Cash On Delivery.  * GC - Gift Card.  * PointsAccount - Amazon Points.")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentExecutionDetailItem paymentExecutionDetailItem = (PaymentExecutionDetailItem) o;
        return Objects.equals(this.payment, paymentExecutionDetailItem.payment) &&
                Objects.equals(this.paymentMethod, paymentExecutionDetailItem.paymentMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payment, paymentMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentExecutionDetailItem {\n");
        sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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
