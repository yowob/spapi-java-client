package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;

import java.util.Objects;

/**
 * GetPreorderInfoResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetPreorderInfoResult {
    @SerializedName("ShipmentContainsPreorderableItems")
    private Boolean shipmentContainsPreorderableItems = null;
    @SerializedName("ShipmentConfirmedForPreorder")
    private Boolean shipmentConfirmedForPreorder = null;
    @SerializedName("NeedByDate")
    private LocalDate needByDate = null;
    @SerializedName("ConfirmedFulfillableDate")
    private LocalDate confirmedFulfillableDate = null;

    public GetPreorderInfoResult shipmentContainsPreorderableItems(Boolean shipmentContainsPreorderableItems) {
        this.shipmentContainsPreorderableItems = shipmentContainsPreorderableItems;
        return this;
    }

    /**
     * Indicates whether the shipment contains items that have been enabled for pre-order. For more information about enabling items for pre-order, see the Seller Central Help.
     *
     * @return shipmentContainsPreorderableItems
     **/
    @Schema(description = "Indicates whether the shipment contains items that have been enabled for pre-order. For more information about enabling items for pre-order, see the Seller Central Help.")
    public Boolean isShipmentContainsPreorderableItems() {
        return shipmentContainsPreorderableItems;
    }

    public void setShipmentContainsPreorderableItems(Boolean shipmentContainsPreorderableItems) {
        this.shipmentContainsPreorderableItems = shipmentContainsPreorderableItems;
    }

    public GetPreorderInfoResult shipmentConfirmedForPreorder(Boolean shipmentConfirmedForPreorder) {
        this.shipmentConfirmedForPreorder = shipmentConfirmedForPreorder;
        return this;
    }

    /**
     * Indicates whether this shipment has been confirmed for pre-order.
     *
     * @return shipmentConfirmedForPreorder
     **/
    @Schema(description = "Indicates whether this shipment has been confirmed for pre-order.")
    public Boolean isShipmentConfirmedForPreorder() {
        return shipmentConfirmedForPreorder;
    }

    public void setShipmentConfirmedForPreorder(Boolean shipmentConfirmedForPreorder) {
        this.shipmentConfirmedForPreorder = shipmentConfirmedForPreorder;
    }

    public GetPreorderInfoResult needByDate(LocalDate needByDate) {
        this.needByDate = needByDate;
        return this;
    }

    /**
     * Get needByDate
     *
     * @return needByDate
     **/
    @Schema(description = "")
    public LocalDate getNeedByDate() {
        return needByDate;
    }

    public void setNeedByDate(LocalDate needByDate) {
        this.needByDate = needByDate;
    }

    public GetPreorderInfoResult confirmedFulfillableDate(LocalDate confirmedFulfillableDate) {
        this.confirmedFulfillableDate = confirmedFulfillableDate;
        return this;
    }

    /**
     * Get confirmedFulfillableDate
     *
     * @return confirmedFulfillableDate
     **/
    @Schema(description = "")
    public LocalDate getConfirmedFulfillableDate() {
        return confirmedFulfillableDate;
    }

    public void setConfirmedFulfillableDate(LocalDate confirmedFulfillableDate) {
        this.confirmedFulfillableDate = confirmedFulfillableDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetPreorderInfoResult getPreorderInfoResult = (GetPreorderInfoResult) o;
        return Objects.equals(this.shipmentContainsPreorderableItems, getPreorderInfoResult.shipmentContainsPreorderableItems) &&
                Objects.equals(this.shipmentConfirmedForPreorder, getPreorderInfoResult.shipmentConfirmedForPreorder) &&
                Objects.equals(this.needByDate, getPreorderInfoResult.needByDate) &&
                Objects.equals(this.confirmedFulfillableDate, getPreorderInfoResult.confirmedFulfillableDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentContainsPreorderableItems, shipmentConfirmedForPreorder, needByDate, confirmedFulfillableDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPreorderInfoResult {\n");
        sb.append("    shipmentContainsPreorderableItems: ").append(toIndentedString(shipmentContainsPreorderableItems)).append("\n");
        sb.append("    shipmentConfirmedForPreorder: ").append(toIndentedString(shipmentConfirmedForPreorder)).append("\n");
        sb.append("    needByDate: ").append(toIndentedString(needByDate)).append("\n");
        sb.append("    confirmedFulfillableDate: ").append(toIndentedString(confirmedFulfillableDate)).append("\n");
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
