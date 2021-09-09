package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The shipping identifier, information about whether the shipment is by an Amazon-partnered carrier, and information about whether the shipment is Small Parcel or Less Than Truckload/Full Truckload (LTL/FTL).
 */
@Schema(description = "The shipping identifier, information about whether the shipment is by an Amazon-partnered carrier, and information about whether the shipment is Small Parcel or Less Than Truckload/Full Truckload (LTL/FTL).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TransportHeader {
    @SerializedName("SellerId")
    private String sellerId = null;
    @SerializedName("ShipmentId")
    private String shipmentId = null;
    @SerializedName("IsPartnered")
    private Boolean isPartnered = null;
    @SerializedName("ShipmentType")
    private ShipmentType shipmentType = null;

    public TransportHeader sellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * The Amazon seller identifier.
     *
     * @return sellerId
     **/
    @Schema(required = true, description = "The Amazon seller identifier.")
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public TransportHeader shipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * A shipment identifier originally returned by the createInboundShipmentPlan operation.
     *
     * @return shipmentId
     **/
    @Schema(required = true, description = "A shipment identifier originally returned by the createInboundShipmentPlan operation.")
    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public TransportHeader isPartnered(Boolean isPartnered) {
        this.isPartnered = isPartnered;
        return this;
    }

    /**
     * Indicates whether a putTransportDetails request is for a partnered carrier.  Possible values:  * true – Request is for an Amazon-partnered carrier.  * false – Request is for a non-Amazon-partnered carrier.
     *
     * @return isPartnered
     **/
    @Schema(required = true, description = "Indicates whether a putTransportDetails request is for a partnered carrier.  Possible values:  * true – Request is for an Amazon-partnered carrier.  * false – Request is for a non-Amazon-partnered carrier.")
    public Boolean isIsPartnered() {
        return isPartnered;
    }

    public void setIsPartnered(Boolean isPartnered) {
        this.isPartnered = isPartnered;
    }

    public TransportHeader shipmentType(ShipmentType shipmentType) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransportHeader transportHeader = (TransportHeader) o;
        return Objects.equals(this.sellerId, transportHeader.sellerId) &&
                Objects.equals(this.shipmentId, transportHeader.shipmentId) &&
                Objects.equals(this.isPartnered, transportHeader.isPartnered) &&
                Objects.equals(this.shipmentType, transportHeader.shipmentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerId, shipmentId, isPartnered, shipmentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransportHeader {\n");
        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
        sb.append("    isPartnered: ").append(toIndentedString(isPartnered)).append("\n");
        sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
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
