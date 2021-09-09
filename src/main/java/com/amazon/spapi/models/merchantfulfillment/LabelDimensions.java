package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Dimensions for printing a shipping label.
 */
@Schema(description = "Dimensions for printing a shipping label.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class LabelDimensions {
    @SerializedName("Length")
    private BigDecimal length = null;
    @SerializedName("Width")
    private BigDecimal width = null;
    @SerializedName("Unit")
    private UnitOfLength unit = null;

    public LabelDimensions length(BigDecimal length) {
        this.length = length;
        return this;
    }

    /**
     * Get length
     *
     * @return length
     **/
    @Schema(required = true, description = "")
    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public LabelDimensions width(BigDecimal width) {
        this.width = width;
        return this;
    }

    /**
     * Get width
     *
     * @return width
     **/
    @Schema(required = true, description = "")
    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public LabelDimensions unit(UnitOfLength unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get unit
     *
     * @return unit
     **/
    @Schema(required = true, description = "")
    public UnitOfLength getUnit() {
        return unit;
    }

    public void setUnit(UnitOfLength unit) {
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
        LabelDimensions labelDimensions = (LabelDimensions) o;
        return Objects.equals(this.length, labelDimensions.length) &&
                Objects.equals(this.width, labelDimensions.width) &&
                Objects.equals(this.unit, labelDimensions.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelDimensions {\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
