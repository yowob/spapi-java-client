package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Container specification for checking the service rate.
 */
@Schema(description = "Container specification for checking the service rate.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ContainerSpecification {
    @SerializedName("dimensions")
    private Dimensions dimensions = null;
    @SerializedName("weight")
    private Weight weight = null;

    public ContainerSpecification dimensions(Dimensions dimensions) {
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

    public ContainerSpecification weight(Weight weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get weight
     *
     * @return weight
     **/
    @Schema(required = true, description = "")
    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerSpecification containerSpecification = (ContainerSpecification) o;
        return Objects.equals(this.dimensions, containerSpecification.dimensions) &&
                Objects.equals(this.weight, containerSpecification.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerSpecification {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
