package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information about unfulfillable items in a fulfillment order preview.
 */
@Schema(description = "Information about unfulfillable items in a fulfillment order preview.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class UnfulfillablePreviewItem {
    @SerializedName("sellerSku")
    private String sellerSku = null;
    @SerializedName("quantity")
    private Integer quantity = null;
    @SerializedName("sellerFulfillmentOrderItemId")
    private String sellerFulfillmentOrderItemId = null;
    @SerializedName("itemUnfulfillableReasons")
    private StringList itemUnfulfillableReasons = null;

    public UnfulfillablePreviewItem sellerSku(String sellerSku) {
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

    public UnfulfillablePreviewItem quantity(Integer quantity) {
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

    public UnfulfillablePreviewItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        return this;
    }

    /**
     * A fulfillment order item identifier created with a call to the getFulfillmentPreview operation.
     *
     * @return sellerFulfillmentOrderItemId
     **/
    @Schema(required = true, description = "A fulfillment order item identifier created with a call to the getFulfillmentPreview operation.")
    public String getSellerFulfillmentOrderItemId() {
        return sellerFulfillmentOrderItemId;
    }

    public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    }

    public UnfulfillablePreviewItem itemUnfulfillableReasons(StringList itemUnfulfillableReasons) {
        this.itemUnfulfillableReasons = itemUnfulfillableReasons;
        return this;
    }

    /**
     * Get itemUnfulfillableReasons
     *
     * @return itemUnfulfillableReasons
     **/
    @Schema(description = "")
    public StringList getItemUnfulfillableReasons() {
        return itemUnfulfillableReasons;
    }

    public void setItemUnfulfillableReasons(StringList itemUnfulfillableReasons) {
        this.itemUnfulfillableReasons = itemUnfulfillableReasons;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnfulfillablePreviewItem unfulfillablePreviewItem = (UnfulfillablePreviewItem) o;
        return Objects.equals(this.sellerSku, unfulfillablePreviewItem.sellerSku) &&
                Objects.equals(this.quantity, unfulfillablePreviewItem.quantity) &&
                Objects.equals(this.sellerFulfillmentOrderItemId, unfulfillablePreviewItem.sellerFulfillmentOrderItemId) &&
                Objects.equals(this.itemUnfulfillableReasons, unfulfillablePreviewItem.itemUnfulfillableReasons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerSku, quantity, sellerFulfillmentOrderItemId, itemUnfulfillableReasons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnfulfillablePreviewItem {\n");
        sb.append("    sellerSku: ").append(toIndentedString(sellerSku)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
        sb.append("    itemUnfulfillableReasons: ").append(toIndentedString(itemUnfulfillableReasons)).append("\n");
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
