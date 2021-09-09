package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Pallet information.
 */
@Schema(description = "Pallet information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Pallet {
    @SerializedName("Dimensions")
    private Dimensions dimensions = null;
    @SerializedName("Weight")
    private Weight weight = null;
    @SerializedName("IsStacked")
    private Boolean isStacked = null;

    public Pallet dimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get dimensions
     *
     * @return dimensions
     **/
    @Schema(required = true, description = "")
    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Pallet weight(Weight weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get weight
     *
     * @return weight
     **/
    @Schema(description = "")
    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Pallet isStacked(Boolean isStacked) {
        this.isStacked = isStacked;
        return this;
    }

    /**
     * Indicates whether pallets will be stacked when carrier arrives for pick-up.
     *
     * @return isStacked
     **/
    @Schema(required = true, description = "Indicates whether pallets will be stacked when carrier arrives for pick-up.")
    public Boolean isIsStacked() {
        return isStacked;
    }

    public void setIsStacked(Boolean isStacked) {
        this.isStacked = isStacked;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pallet pallet = (Pallet) o;
        return Objects.equals(this.dimensions, pallet.dimensions) &&
                Objects.equals(this.weight, pallet.weight) &&
                Objects.equals(this.isStacked, pallet.isStacked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, weight, isStacked);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pallet {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    isStacked: ").append(toIndentedString(isStacked)).append("\n");
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
