package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * The payload schema for the getRates operation.
 */
@Schema(description = "The payload schema for the getRates operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetRatesRequest {
    @SerializedName("shipTo")
    private Address shipTo = null;
    @SerializedName("shipFrom")
    private Address shipFrom = null;
    @SerializedName("serviceTypes")
    private ServiceTypeList serviceTypes = null;
    @SerializedName("shipDate")
    private OffsetDateTime shipDate = null;
    @SerializedName("containerSpecifications")
    private ContainerSpecificationList containerSpecifications = null;

    public GetRatesRequest shipTo(Address shipTo) {
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

    public GetRatesRequest shipFrom(Address shipFrom) {
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

    public GetRatesRequest serviceTypes(ServiceTypeList serviceTypes) {
        this.serviceTypes = serviceTypes;
        return this;
    }

    /**
     * Get serviceTypes
     *
     * @return serviceTypes
     **/
    @Schema(required = true, description = "")
    public ServiceTypeList getServiceTypes() {
        return serviceTypes;
    }

    public void setServiceTypes(ServiceTypeList serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    public GetRatesRequest shipDate(OffsetDateTime shipDate) {
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

    public GetRatesRequest containerSpecifications(ContainerSpecificationList containerSpecifications) {
        this.containerSpecifications = containerSpecifications;
        return this;
    }

    /**
     * Get containerSpecifications
     *
     * @return containerSpecifications
     **/
    @Schema(required = true, description = "")
    public ContainerSpecificationList getContainerSpecifications() {
        return containerSpecifications;
    }

    public void setContainerSpecifications(ContainerSpecificationList containerSpecifications) {
        this.containerSpecifications = containerSpecifications;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetRatesRequest getRatesRequest = (GetRatesRequest) o;
        return Objects.equals(this.shipTo, getRatesRequest.shipTo) &&
                Objects.equals(this.shipFrom, getRatesRequest.shipFrom) &&
                Objects.equals(this.serviceTypes, getRatesRequest.serviceTypes) &&
                Objects.equals(this.shipDate, getRatesRequest.shipDate) &&
                Objects.equals(this.containerSpecifications, getRatesRequest.containerSpecifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipTo, shipFrom, serviceTypes, shipDate, containerSpecifications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetRatesRequest {\n");
        sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
        sb.append("    shipFrom: ").append(toIndentedString(shipFrom)).append("\n");
        sb.append("    serviceTypes: ").append(toIndentedString(serviceTypes)).append("\n");
        sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
        sb.append("    containerSpecifications: ").append(toIndentedString(containerSpecifications)).append("\n");
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
