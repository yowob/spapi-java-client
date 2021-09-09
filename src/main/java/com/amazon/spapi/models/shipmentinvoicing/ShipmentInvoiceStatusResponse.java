package com.amazon.spapi.models.shipmentinvoicing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The shipment invoice status response.
 */
@Schema(description = "The shipment invoice status response.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ShipmentInvoiceStatusResponse {
    @SerializedName("Shipments")
    private ShipmentInvoiceStatusInfo shipments = null;

    public ShipmentInvoiceStatusResponse shipments(ShipmentInvoiceStatusInfo shipments) {
        this.shipments = shipments;
        return this;
    }

    /**
     * Get shipments
     *
     * @return shipments
     **/
    @Schema(description = "")
    public ShipmentInvoiceStatusInfo getShipments() {
        return shipments;
    }

    public void setShipments(ShipmentInvoiceStatusInfo shipments) {
        this.shipments = shipments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentInvoiceStatusResponse shipmentInvoiceStatusResponse = (ShipmentInvoiceStatusResponse) o;
        return Objects.equals(this.shipments, shipmentInvoiceStatusResponse.shipments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipmentInvoiceStatusResponse {\n");
        sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
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
