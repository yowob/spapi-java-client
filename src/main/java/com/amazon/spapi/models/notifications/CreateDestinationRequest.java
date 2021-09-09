package com.amazon.spapi.models.notifications;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The request schema for the createDestination operation.
 */
@Schema(description = "The request schema for the createDestination operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateDestinationRequest {
    @SerializedName("resourceSpecification")
    private DestinationResourceSpecification resourceSpecification = null;
    @SerializedName("name")
    private String name = null;

    public CreateDestinationRequest resourceSpecification(DestinationResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
        return this;
    }

    /**
     * Get resourceSpecification
     *
     * @return resourceSpecification
     **/
    @Schema(required = true, description = "")
    public DestinationResourceSpecification getResourceSpecification() {
        return resourceSpecification;
    }

    public void setResourceSpecification(DestinationResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }

    public CreateDestinationRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A developer-defined name to help identify this destination.
     *
     * @return name
     **/
    @Schema(required = true, description = "A developer-defined name to help identify this destination.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDestinationRequest createDestinationRequest = (CreateDestinationRequest) o;
        return Objects.equals(this.resourceSpecification, createDestinationRequest.resourceSpecification) &&
                Objects.equals(this.name, createDestinationRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSpecification, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDestinationRequest {\n");
        sb.append("    resourceSpecification: ").append(toIndentedString(resourceSpecification)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
