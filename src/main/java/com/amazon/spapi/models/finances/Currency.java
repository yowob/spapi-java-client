package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * A currency type and amount.
 */
@Schema(description = "A currency type and amount.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Currency {
    @SerializedName("CurrencyCode")
    private String currencyCode = null;
    @SerializedName("CurrencyAmount")
    private BigDecimal currencyAmount = null;

    public Currency currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * The three-digit currency code in ISO 4217 format.
     *
     * @return currencyCode
     **/
    @Schema(description = "The three-digit currency code in ISO 4217 format.")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Currency currencyAmount(BigDecimal currencyAmount) {
        this.currencyAmount = currencyAmount;
        return this;
    }

    /**
     * Get currencyAmount
     *
     * @return currencyAmount
     **/
    @Schema(description = "")
    public BigDecimal getCurrencyAmount() {
        return currencyAmount;
    }

    public void setCurrencyAmount(BigDecimal currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Currency currency = (Currency) o;
        return Objects.equals(this.currencyCode, currency.currencyCode) &&
                Objects.equals(this.currencyAmount, currency.currencyAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, currencyAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Currency {\n");
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    currencyAmount: ").append(toIndentedString(currencyAmount)).append("\n");
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
