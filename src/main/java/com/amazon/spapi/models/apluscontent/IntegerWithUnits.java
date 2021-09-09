package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A whole number dimension and its unit of measurement. For example, this can represent 100 pixels.
 */
@Schema(description = "A whole number dimension and its unit of measurement. For example, this can represent 100 pixels.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class IntegerWithUnits {
    @SerializedName("value")
    private Integer value = null;
    @SerializedName("units")
    private String units = null;

    public IntegerWithUnits value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * The dimension value.
     *
     * @return value
     **/
    @Schema(required = true, description = "The dimension value.")
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public IntegerWithUnits units(String units) {
        this.units = units;
        return this;
    }

    /**
     * The unit of measurement.
     *
     * @return units
     **/
    @Schema(required = true, description = "The unit of measurement.")
    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntegerWithUnits integerWithUnits = (IntegerWithUnits) o;
        return Objects.equals(this.value, integerWithUnits.value) &&
                Objects.equals(this.units, integerWithUnits.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, units);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegerWithUnits {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    units: ").append(toIndentedString(units)).append("\n");
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
