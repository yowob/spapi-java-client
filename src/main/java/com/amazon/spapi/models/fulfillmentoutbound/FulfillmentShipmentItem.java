package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Item information for a shipment in a fulfillment order.
 */
@Schema(description = "Item information for a shipment in a fulfillment order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FulfillmentShipmentItem {
    @SerializedName("sellerSku")
    private String sellerSku = null;
    @SerializedName("sellerFulfillmentOrderItemId")
    private String sellerFulfillmentOrderItemId = null;
    @SerializedName("quantity")
    private Integer quantity = null;
    @SerializedName("packageNumber")
    private Integer packageNumber = null;
    @SerializedName("serialNumber")
    private String serialNumber = null;

    public FulfillmentShipmentItem sellerSku(String sellerSku) {
        this.sellerSku = sellerSku;
        return this;
    }

    /**
     * The seller SKU of the item.
     *
     * @return sellerSku
     **/
    @Schema(required = true, description = "The seller SKU of the item.")
    public String getSellerSku() {
        return sellerSku;
    }

    public void setSellerSku(String sellerSku) {
        this.sellerSku = sellerSku;
    }

    public FulfillmentShipmentItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        return this;
    }

    /**
     * The fulfillment order item identifier that the seller created and submitted with a call to the createFulfillmentOrder operation.
     *
     * @return sellerFulfillmentOrderItemId
     **/
    @Schema(required = true, description = "The fulfillment order item identifier that the seller created and submitted with a call to the createFulfillmentOrder operation.")
    public String getSellerFulfillmentOrderItemId() {
        return sellerFulfillmentOrderItemId;
    }

    public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    }

    public FulfillmentShipmentItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get quantity
     *
     * @return quantity
     **/
    @Schema(required = true, description = "")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public FulfillmentShipmentItem packageNumber(Integer packageNumber) {
        this.packageNumber = packageNumber;
        return this;
    }

    /**
     * An identifier for the package that contains the item quantity.
     *
     * @return packageNumber
     **/
    @Schema(description = "An identifier for the package that contains the item quantity.")
    public Integer getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(Integer packageNumber) {
        this.packageNumber = packageNumber;
    }

    public FulfillmentShipmentItem serialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * The serial number of the shipped item.
     *
     * @return serialNumber
     **/
    @Schema(description = "The serial number of the shipped item.")
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FulfillmentShipmentItem fulfillmentShipmentItem = (FulfillmentShipmentItem) o;
        return Objects.equals(this.sellerSku, fulfillmentShipmentItem.sellerSku) &&
                Objects.equals(this.sellerFulfillmentOrderItemId, fulfillmentShipmentItem.sellerFulfillmentOrderItemId) &&
                Objects.equals(this.quantity, fulfillmentShipmentItem.quantity) &&
                Objects.equals(this.packageNumber, fulfillmentShipmentItem.packageNumber) &&
                Objects.equals(this.serialNumber, fulfillmentShipmentItem.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerSku, sellerFulfillmentOrderItemId, quantity, packageNumber, serialNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FulfillmentShipmentItem {\n");
        sb.append("    sellerSku: ").append(toIndentedString(sellerSku)).append("\n");
        sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    packageNumber: ").append(toIndentedString(packageNumber)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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
