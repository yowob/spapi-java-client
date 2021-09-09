package com.amazon.spapi.models.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The monetary value of the order.
 */
@Schema(description = "The monetary value of the order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Money {
    @SerializedName("CurrencyCode")
    private String currencyCode = null;
    @SerializedName("Amount")
    private String amount = null;

    public Money currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * The three-digit currency code. In ISO 4217 format.
     *
     * @return currencyCode
     **/
    @Schema(description = "The three-digit currency code. In ISO 4217 format.")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Money amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * The currency amount.
     *
     * @return amount
     **/
    @Schema(description = "The currency amount.")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
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
        Money money = (Money) o;
        return Objects.equals(this.currencyCode, money.currencyCode) &&
                Objects.equals(this.amount, money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Money {\n");
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
