package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Delivery and item information for a shipment in a fulfillment order preview.
 */
@Schema(description = "Delivery and item information for a shipment in a fulfillment order preview.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FulfillmentPreviewShipment {
    @SerializedName("earliestShipDate")
    private OffsetDateTime earliestShipDate = null;
    @SerializedName("latestShipDate")
    private OffsetDateTime latestShipDate = null;
    @SerializedName("earliestArrivalDate")
    private OffsetDateTime earliestArrivalDate = null;
    @SerializedName("latestArrivalDate")
    private OffsetDateTime latestArrivalDate = null;
    @SerializedName("shippingNotes")
    private List<String> shippingNotes = null;
    @SerializedName("fulfillmentPreviewItems")
    private FulfillmentPreviewItemList fulfillmentPreviewItems = null;

    public FulfillmentPreviewShipment earliestShipDate(OffsetDateTime earliestShipDate) {
        this.earliestShipDate = earliestShipDate;
        return this;
    }

    /**
     * Get earliestShipDate
     *
     * @return earliestShipDate
     **/
    @Schema(description = "")
    public OffsetDateTime getEarliestShipDate() {
        return earliestShipDate;
    }

    public void setEarliestShipDate(OffsetDateTime earliestShipDate) {
        this.earliestShipDate = earliestShipDate;
    }

    public FulfillmentPreviewShipment latestShipDate(OffsetDateTime latestShipDate) {
        this.latestShipDate = latestShipDate;
        return this;
    }

    /**
     * Get latestShipDate
     *
     * @return latestShipDate
     **/
    @Schema(description = "")
    public OffsetDateTime getLatestShipDate() {
        return latestShipDate;
    }

    public void setLatestShipDate(OffsetDateTime latestShipDate) {
        this.latestShipDate = latestShipDate;
    }

    public FulfillmentPreviewShipment earliestArrivalDate(OffsetDateTime earliestArrivalDate) {
        this.earliestArrivalDate = earliestArrivalDate;
        return this;
    }

    /**
     * Get earliestArrivalDate
     *
     * @return earliestArrivalDate
     **/
    @Schema(description = "")
    public OffsetDateTime getEarliestArrivalDate() {
        return earliestArrivalDate;
    }

    public void setEarliestArrivalDate(OffsetDateTime earliestArrivalDate) {
        this.earliestArrivalDate = earliestArrivalDate;
    }

    public FulfillmentPreviewShipment latestArrivalDate(OffsetDateTime latestArrivalDate) {
        this.latestArrivalDate = latestArrivalDate;
        return this;
    }

    /**
     * Get latestArrivalDate
     *
     * @return latestArrivalDate
     **/
    @Schema(description = "")
    public OffsetDateTime getLatestArrivalDate() {
        return latestArrivalDate;
    }

    public void setLatestArrivalDate(OffsetDateTime latestArrivalDate) {
        this.latestArrivalDate = latestArrivalDate;
    }

    public FulfillmentPreviewShipment shippingNotes(List<String> shippingNotes) {
        this.shippingNotes = shippingNotes;
        return this;
    }

    public FulfillmentPreviewShipment addShippingNotesItem(String shippingNotesItem) {
        if (this.shippingNotes == null) {
            this.shippingNotes = new ArrayList<String>();
        }
        this.shippingNotes.add(shippingNotesItem);
        return this;
    }

    /**
     * Provides additional insight into the shipment timeline when exact delivery dates are not able to be precomputed.
     *
     * @return shippingNotes
     **/
    @Schema(description = "Provides additional insight into the shipment timeline when exact delivery dates are not able to be precomputed.")
    public List<String> getShippingNotes() {
        return shippingNotes;
    }

    public void setShippingNotes(List<String> shippingNotes) {
        this.shippingNotes = shippingNotes;
    }

    public FulfillmentPreviewShipment fulfillmentPreviewItems(FulfillmentPreviewItemList fulfillmentPreviewItems) {
        this.fulfillmentPreviewItems = fulfillmentPreviewItems;
        return this;
    }

    /**
     * Get fulfillmentPreviewItems
     *
     * @return fulfillmentPreviewItems
     **/
    @Schema(required = true, description = "")
    public FulfillmentPreviewItemList getFulfillmentPreviewItems() {
        return fulfillmentPreviewItems;
    }

    public void setFulfillmentPreviewItems(FulfillmentPreviewItemList fulfillmentPreviewItems) {
        this.fulfillmentPreviewItems = fulfillmentPreviewItems;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FulfillmentPreviewShipment fulfillmentPreviewShipment = (FulfillmentPreviewShipment) o;
        return Objects.equals(this.earliestShipDate, fulfillmentPreviewShipment.earliestShipDate) &&
                Objects.equals(this.latestShipDate, fulfillmentPreviewShipment.latestShipDate) &&
                Objects.equals(this.earliestArrivalDate, fulfillmentPreviewShipment.earliestArrivalDate) &&
                Objects.equals(this.latestArrivalDate, fulfillmentPreviewShipment.latestArrivalDate) &&
                Objects.equals(this.shippingNotes, fulfillmentPreviewShipment.shippingNotes) &&
                Objects.equals(this.fulfillmentPreviewItems, fulfillmentPreviewShipment.fulfillmentPreviewItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(earliestShipDate, latestShipDate, earliestArrivalDate, latestArrivalDate, shippingNotes, fulfillmentPreviewItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FulfillmentPreviewShipment {\n");
        sb.append("    earliestShipDate: ").append(toIndentedString(earliestShipDate)).append("\n");
        sb.append("    latestShipDate: ").append(toIndentedString(latestShipDate)).append("\n");
        sb.append("    earliestArrivalDate: ").append(toIndentedString(earliestArrivalDate)).append("\n");
        sb.append("    latestArrivalDate: ").append(toIndentedString(latestArrivalDate)).append("\n");
        sb.append("    shippingNotes: ").append(toIndentedString(shippingNotes)).append("\n");
        sb.append("    fulfillmentPreviewItems: ").append(toIndentedString(fulfillmentPreviewItems)).append("\n");
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
