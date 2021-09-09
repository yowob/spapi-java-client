package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A fee associated with the event.
 */
@Schema(description = "A fee associated with the event.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FeeComponent {
    @SerializedName("FeeType")
    private String feeType = null;
    @SerializedName("FeeAmount")
    private Currency feeAmount = null;

    public FeeComponent feeType(String feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * The type of fee. For more information about Selling on Amazon fees, see [Selling on Amazon Fee Schedule](https://sellercentral.amazon.com/gp/help/200336920) on Seller Central. For more information about Fulfillment by Amazon fees, see [FBA features, services and fees](https://sellercentral.amazon.com/gp/help/201074400) on Seller Central.
     *
     * @return feeType
     **/
    @Schema(description = "The type of fee. For more information about Selling on Amazon fees, see [Selling on Amazon Fee Schedule](https://sellercentral.amazon.com/gp/help/200336920) on Seller Central. For more information about Fulfillment by Amazon fees, see [FBA features, services and fees](https://sellercentral.amazon.com/gp/help/201074400) on Seller Central.")
    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public FeeComponent feeAmount(Currency feeAmount) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeeComponent feeComponent = (FeeComponent) o;
        return Objects.equals(this.feeType, feeComponent.feeType) &&
                Objects.equals(this.feeAmount, feeComponent.feeAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, feeAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeeComponent {\n");
        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
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
