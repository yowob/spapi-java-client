package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * An amount of money, including units in the form of currency.
 */
@Schema(description = "An amount of money, including units in the form of currency.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Money {
    @SerializedName("currencyCode")
    private String currencyCode = null;
    @SerializedName("value")
    private String value = null;

    public Money currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Three digit currency code in ISO 4217 format.
     *
     * @return currencyCode
     **/
    @Schema(required = true, description = "Three digit currency code in ISO 4217 format.")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Money value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    @Schema(required = true, description = "")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
                Objects.equals(this.value, money.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Money {\n");
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
