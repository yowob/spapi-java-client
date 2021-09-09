package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * The payload schema for the purchaseShipment operation.
 */
@Schema(description = "The payload schema for the purchaseShipment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PurchaseShipmentRequest {
    @SerializedName("clientReferenceId")
    private String clientReferenceId = null;
    @SerializedName("shipTo")
    private Address shipTo = null;
    @SerializedName("shipFrom")
    private Address shipFrom = null;
    @SerializedName("shipDate")
    private OffsetDateTime shipDate = null;
    @SerializedName("serviceType")
    private ServiceType serviceType = null;
    @SerializedName("containers")
    private ContainerList containers = null;
    @SerializedName("labelSpecification")
    private LabelSpecification labelSpecification = null;

    public PurchaseShipmentRequest clientReferenceId(String clientReferenceId) {
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

    public PurchaseShipmentRequest shipTo(Address shipTo) {
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

    public PurchaseShipmentRequest shipFrom(Address shipFrom) {
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

    public PurchaseShipmentRequest shipDate(OffsetDateTime shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    /**
     * The start date and time. This defaults to the current date and time.
     *
     * @return shipDate
     **/
    @Schema(description = "The start date and time. This defaults to the current date and time.")
    public OffsetDateTime getShipDate() {
        return shipDate;
    }

    public void setShipDate(OffsetDateTime shipDate) {
        this.shipDate = shipDate;
    }

    public PurchaseShipmentRequest serviceType(ServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Get serviceType
     *
     * @return serviceType
     **/
    @Schema(required = true, description = "")
    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public PurchaseShipmentRequest containers(ContainerList containers) {
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

    public PurchaseShipmentRequest labelSpecification(LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
        return this;
    }

    /**
     * Get labelSpecification
     *
     * @return labelSpecification
     **/
    @Schema(required = true, description = "")
    public LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }

    public void setLabelSpecification(LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PurchaseShipmentRequest purchaseShipmentRequest = (PurchaseShipmentRequest) o;
        return Objects.equals(this.clientReferenceId, purchaseShipmentRequest.clientReferenceId) &&
                Objects.equals(this.shipTo, purchaseShipmentRequest.shipTo) &&
                Objects.equals(this.shipFrom, purchaseShipmentRequest.shipFrom) &&
                Objects.equals(this.shipDate, purchaseShipmentRequest.shipDate) &&
                Objects.equals(this.serviceType, purchaseShipmentRequest.serviceType) &&
                Objects.equals(this.containers, purchaseShipmentRequest.containers) &&
                Objects.equals(this.labelSpecification, purchaseShipmentRequest.labelSpecification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientReferenceId, shipTo, shipFrom, shipDate, serviceType, containers, labelSpecification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PurchaseShipmentRequest {\n");
        sb.append("    clientReferenceId: ").append(toIndentedString(clientReferenceId)).append("\n");
        sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
        sb.append("    shipFrom: ").append(toIndentedString(shipFrom)).append("\n");
        sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
        sb.append("    labelSpecification: ").append(toIndentedString(labelSpecification)).append("\n");
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
