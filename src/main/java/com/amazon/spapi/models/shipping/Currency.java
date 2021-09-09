package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * The total value of all items in the container.
 */
@Schema(description = "The total value of all items in the container.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Currency {
    @SerializedName("value")
    private BigDecimal value = null;
    @SerializedName("unit")
    private String unit = null;

    public Currency value(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
     * The amount of currency.
     *
     * @return value
     **/
    @Schema(required = true, description = "The amount of currency.")
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Currency unit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * A 3-character currency code.
     *
     * @return unit
     **/
    @Schema(required = true, description = "A 3-character currency code.")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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
        return Objects.equals(this.value, currency.value) &&
                Objects.equals(this.unit, currency.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Currency {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
