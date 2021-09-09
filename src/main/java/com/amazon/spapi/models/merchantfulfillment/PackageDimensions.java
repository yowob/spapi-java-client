package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The dimensions of a package contained in a shipment.
 */
@Schema(description = "The dimensions of a package contained in a shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PackageDimensions {
    @SerializedName("Length")
    private Double length = null;
    @SerializedName("Width")
    private Double width = null;
    @SerializedName("Height")
    private Double height = null;
    @SerializedName("Unit")
    private UnitOfLength unit = null;
    @SerializedName("PredefinedPackageDimensions")
    private PredefinedPackageDimensions predefinedPackageDimensions = null;

    public PackageDimensions length(Double length) {
        this.length = length;
        return this;
    }

    /**
     * Get length
     *
     * @return length
     **/
    @Schema(description = "")
    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public PackageDimensions width(Double width) {
        this.width = width;
        return this;
    }

    /**
     * Get width
     *
     * @return width
     **/
    @Schema(description = "")
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public PackageDimensions height(Double height) {
        this.height = height;
        return this;
    }

    /**
     * Get height
     *
     * @return height
     **/
    @Schema(description = "")
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public PackageDimensions unit(UnitOfLength unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get unit
     *
     * @return unit
     **/
    @Schema(description = "")
    public UnitOfLength getUnit() {
        return unit;
    }

    public void setUnit(UnitOfLength unit) {
        this.unit = unit;
    }

    public PackageDimensions predefinedPackageDimensions(PredefinedPackageDimensions predefinedPackageDimensions) {
        this.predefinedPackageDimensions = predefinedPackageDimensions;
        return this;
    }

    /**
     * Get predefinedPackageDimensions
     *
     * @return predefinedPackageDimensions
     **/
    @Schema(description = "")
    public PredefinedPackageDimensions getPredefinedPackageDimensions() {
        return predefinedPackageDimensions;
    }

    public void setPredefinedPackageDimensions(PredefinedPackageDimensions predefinedPackageDimensions) {
        this.predefinedPackageDimensions = predefinedPackageDimensions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackageDimensions packageDimensions = (PackageDimensions) o;
        return Objects.equals(this.length, packageDimensions.length) &&
                Objects.equals(this.width, packageDimensions.width) &&
                Objects.equals(this.height, packageDimensions.height) &&
                Objects.equals(this.unit, packageDimensions.unit) &&
                Objects.equals(this.predefinedPackageDimensions, packageDimensions.predefinedPackageDimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, height, unit, predefinedPackageDimensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageDimensions {\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    predefinedPackageDimensions: ").append(toIndentedString(predefinedPackageDimensions)).append("\n");
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
