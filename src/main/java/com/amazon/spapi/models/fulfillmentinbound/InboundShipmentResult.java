package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * InboundShipmentResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class InboundShipmentResult {
    @SerializedName("ShipmentId")
    private String shipmentId = null;

    public InboundShipmentResult shipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * The shipment identifier submitted in the request.
     *
     * @return shipmentId
     **/
    @Schema(required = true, description = "The shipment identifier submitted in the request.")
    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InboundShipmentResult inboundShipmentResult = (InboundShipmentResult) o;
        return Objects.equals(this.shipmentId, inboundShipmentResult.shipmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InboundShipmentResult {\n");
        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
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
