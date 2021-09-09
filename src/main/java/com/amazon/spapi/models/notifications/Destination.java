package com.amazon.spapi.models.notifications;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Represents a destination created when you call the createDestination operation.
 */
@Schema(description = "Represents a destination created when you call the createDestination operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Destination {
    @SerializedName("name")
    private String name = null;
    @SerializedName("destinationId")
    private String destinationId = null;
    @SerializedName("resource")
    private DestinationResource resource = null;

    public Destination name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The developer-defined name for this destination.
     *
     * @return name
     **/
    @Schema(required = true, description = "The developer-defined name for this destination.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Destination destinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    /**
     * The destination identifier generated when you created the destination.
     *
     * @return destinationId
     **/
    @Schema(required = true, description = "The destination identifier generated when you created the destination.")
    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public Destination resource(DestinationResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get resource
     *
     * @return resource
     **/
    @Schema(required = true, description = "")
    public DestinationResource getResource() {
        return resource;
    }

    public void setResource(DestinationResource resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Destination destination = (Destination) o;
        return Objects.equals(this.name, destination.name) &&
                Objects.equals(this.destinationId, destination.destinationId) &&
                Objects.equals(this.resource, destination.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, destinationId, resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Destination {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
