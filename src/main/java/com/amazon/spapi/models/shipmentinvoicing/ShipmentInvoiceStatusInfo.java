package com.amazon.spapi.models.shipmentinvoicing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The shipment invoice status information.
 */
@Schema(description = "The shipment invoice status information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ShipmentInvoiceStatusInfo {
    @SerializedName("AmazonShipmentId")
    private String amazonShipmentId = null;
    @SerializedName("InvoiceStatus")
    private ShipmentInvoiceStatus invoiceStatus = null;

    public ShipmentInvoiceStatusInfo amazonShipmentId(String amazonShipmentId) {
        this.amazonShipmentId = amazonShipmentId;
        return this;
    }

    /**
     * The Amazon-defined shipment identifier.
     *
     * @return amazonShipmentId
     **/
    @Schema(description = "The Amazon-defined shipment identifier.")
    public String getAmazonShipmentId() {
        return amazonShipmentId;
    }

    public void setAmazonShipmentId(String amazonShipmentId) {
        this.amazonShipmentId = amazonShipmentId;
    }

    public ShipmentInvoiceStatusInfo invoiceStatus(ShipmentInvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
        return this;
    }

    /**
     * Get invoiceStatus
     *
     * @return invoiceStatus
     **/
    @Schema(description = "")
    public ShipmentInvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(ShipmentInvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentInvoiceStatusInfo shipmentInvoiceStatusInfo = (ShipmentInvoiceStatusInfo) o;
        return Objects.equals(this.amazonShipmentId, shipmentInvoiceStatusInfo.amazonShipmentId) &&
                Objects.equals(this.invoiceStatus, shipmentInvoiceStatusInfo.invoiceStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amazonShipmentId, invoiceStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipmentInvoiceStatusInfo {\n");
        sb.append("    amazonShipmentId: ").append(toIndentedString(amazonShipmentId)).append("\n");
        sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
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
