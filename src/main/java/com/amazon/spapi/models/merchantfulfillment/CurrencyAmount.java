package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Currency type and amount.
 */
@Schema(description = "Currency type and amount.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CurrencyAmount {
    @SerializedName("CurrencyCode")
    private String currencyCode = null;
    @SerializedName("Amount")
    private Double amount = null;

    public CurrencyAmount currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Three-digit currency code in ISO 4217 format.
     *
     * @return currencyCode
     **/
    @Schema(required = true, description = "Three-digit currency code in ISO 4217 format.")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public CurrencyAmount amount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * The currency amount.
     *
     * @return amount
     **/
    @Schema(required = true, description = "The currency amount.")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrencyAmount currencyAmount = (CurrencyAmount) o;
        return Objects.equals(this.currencyCode, currencyAmount.currencyCode) &&
                Objects.equals(this.amount, currencyAmount.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrencyAmount {\n");
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
