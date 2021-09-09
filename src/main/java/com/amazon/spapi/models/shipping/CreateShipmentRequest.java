package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The request schema for the createShipment operation.
 */
@Schema(description = "The request schema for the createShipment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateShipmentRequest {
    @SerializedName("clientReferenceId")
    private String clientReferenceId = null;
    @SerializedName("shipTo")
    private Address shipTo = null;
    @SerializedName("shipFrom")
    private Address shipFrom = null;
    @SerializedName("containers")
    private ContainerList containers = null;

    public CreateShipmentRequest clientReferenceId(String clientReferenceId) {
        this.clientReferenceId = clientReferenceId;
        return this;
    }

    /**
     * Get clientReferenceId
     *
     * @return clientReferenceId
     **/
    @Schema(required = true, description = "")
    public String getClientReferenceId() {
        return clientReferenceId;
    }

    public void setClientReferenceId(String clientReferenceId) {
        this.clientReferenceId = clientReferenceId;
    }

    public CreateShipmentRequest shipTo(Address shipTo) {
        this.shipTo = shipTo;
        return this;
    }

    /**
     * Get shipTo
     *
     * @return shipTo
     **/
    @Schema(required = true, description = "")
    public Address getShipTo() {
        return shipTo;
    }

    public void setShipTo(Address shipTo) {
        this.shipTo = shipTo;
    }

    public CreateShipmentRequest shipFrom(Address shipFrom) {
        this.shipFrom = shipFrom;
        return this;
    }

    /**
     * Get shipFrom
     *
     * @return shipFrom
     **/
    @Schema(required = true, description = "")
    public Address getShipFrom() {
        return shipFrom;
    }

    public void setShipFrom(Address shipFrom) {
        this.shipFrom = shipFrom;
    }

    public CreateShipmentRequest containers(ContainerList containers) {
        this.containers = containers;
        return this;
    }

    /**
     * Get containers
     *
     * @return containers
     **/
    @Schema(required = true, description = "")
    public ContainerList getContainers() {
        return containers;
    }

    public void setContainers(ContainerList containers) {
        this.containers = containers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateShipmentRequest createShipmentRequest = (CreateShipmentRequest) o;
        return Objects.equals(this.clientReferenceId, createShipmentRequest.clientReferenceId) &&
                Objects.equals(this.shipTo, createShipmentRequest.shipTo) &&
                Objects.equals(this.shipFrom, createShipmentRequest.shipFrom) &&
                Objects.equals(this.containers, createShipmentRequest.containers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientReferenceId, shipTo, shipFrom, containers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateShipmentRequest {\n");
        sb.append("    clientReferenceId: ").append(toIndentedString(clientReferenceId)).append("\n");
        sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
        sb.append("    shipFrom: ").append(toIndentedString(shipFrom)).append("\n");
        sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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
