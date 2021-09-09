package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The dimension values and unit of measurement.
 */
@Schema(description = "The dimension values and unit of measurement.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Dimensions {
    @SerializedName("Length")
    private Double length = null;
    @SerializedName("Width")
    private Double width = null;
    @SerializedName("Height")
    private Double height = null;
    @SerializedName("Unit")
    private UnitOfMeasurement unit = null;

    public Dimensions length(Double length) {
        this.length = length;
        return this;
    }

    /**
     * Get length
     *
     * @return length
     **/
    @Schema(required = true, description = "")
    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Dimensions width(Double width) {
        this.width = width;
        return this;
    }

    /**
     * Get width
     *
     * @return width
     **/
    @Schema(required = true, description = "")
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Dimensions height(Double height) {
        this.height = height;
        return this;
    }

    /**
     * Get height
     *
     * @return height
     **/
    @Schema(required = true, description = "")
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Dimensions unit(UnitOfMeasurement unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get unit
     *
     * @return unit
     **/
    @Schema(required = true, description = "")
    public UnitOfMeasurement getUnit() {
        return unit;
    }

    public void setUnit(UnitOfMeasurement unit) {
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
        Dimensions dimensions = (Dimensions) o;
        return Objects.equals(this.length, dimensions.length) &&
                Objects.equals(this.width, dimensions.width) &&
                Objects.equals(this.height, dimensions.height) &&
                Objects.equals(this.unit, dimensions.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, height, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dimensions {\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
