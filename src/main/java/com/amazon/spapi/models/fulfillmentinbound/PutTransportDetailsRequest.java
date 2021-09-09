package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The request schema for a putTransportDetails operation.
 */
@Schema(description = "The request schema for a putTransportDetails operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PutTransportDetailsRequest {
    @SerializedName("IsPartnered")
    private Boolean isPartnered = null;
    @SerializedName("ShipmentType")
    private ShipmentType shipmentType = null;
    @SerializedName("TransportDetails")
    private TransportDetailInput transportDetails = null;

    public PutTransportDetailsRequest isPartnered(Boolean isPartnered) {
        this.isPartnered = isPartnered;
        return this;
    }

    /**
     * Indicates whether a putTransportDetails request is for an Amazon-partnered carrier.
     *
     * @return isPartnered
     **/
    @Schema(required = true, description = "Indicates whether a putTransportDetails request is for an Amazon-partnered carrier.")
    public Boolean isIsPartnered() {
        return isPartnered;
    }

    public void setIsPartnered(Boolean isPartnered) {
        this.isPartnered = isPartnered;
    }

    public PutTransportDetailsRequest shipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
        return this;
    }

    /**
     * Get shipmentType
     *
     * @return shipmentType
     **/
    @Schema(required = true, description = "")
    public ShipmentType getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
    }

    public PutTransportDetailsRequest transportDetails(TransportDetailInput transportDetails) {
        this.transportDetails = transportDetails;
        return this;
    }

    /**
     * Get transportDetails
     *
     * @return transportDetails
     **/
    @Schema(required = true, description = "")
    public TransportDetailInput getTransportDetails() {
        return transportDetails;
    }

    public void setTransportDetails(TransportDetailInput transportDetails) {
        this.transportDetails = transportDetails;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutTransportDetailsRequest putTransportDetailsRequest = (PutTransportDetailsRequest) o;
        return Objects.equals(this.isPartnered, putTransportDetailsRequest.isPartnered) &&
                Objects.equals(this.shipmentType, putTransportDetailsRequest.shipmentType) &&
                Objects.equals(this.transportDetails, putTransportDetailsRequest.transportDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPartnered, shipmentType, transportDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutTransportDetailsRequest {\n");
        sb.append("    isPartnered: ").append(toIndentedString(isPartnered)).append("\n");
        sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
        sb.append("    transportDetails: ").append(toIndentedString(transportDetails)).append("\n");
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
