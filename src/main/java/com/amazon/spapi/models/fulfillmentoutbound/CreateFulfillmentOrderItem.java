package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Item information for creating a fulfillment order.
 */
@Schema(description = "Item information for creating a fulfillment order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateFulfillmentOrderItem {
    @SerializedName("sellerSku")
    private String sellerSku = null;
    @SerializedName("sellerFulfillmentOrderItemId")
    private String sellerFulfillmentOrderItemId = null;
    @SerializedName("quantity")
    private Integer quantity = null;
    @SerializedName("giftMessage")
    private String giftMessage = null;
    @SerializedName("displayableComment")
    private String displayableComment = null;
    @SerializedName("fulfillmentNetworkSku")
    private String fulfillmentNetworkSku = null;
    @SerializedName("perUnitDeclaredValue")
    private Money perUnitDeclaredValue = null;
    @SerializedName("perUnitPrice")
    private Money perUnitPrice = null;
    @SerializedName("perUnitTax")
    private Money perUnitTax = null;

    public CreateFulfillmentOrderItem sellerSku(String sellerSku) {
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

    public CreateFulfillmentOrderItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        return this;
    }

    /**
     * A fulfillment order item identifier that the seller creates to track fulfillment order items. Used to disambiguate multiple fulfillment items that have the same SellerSKU. For example, the seller might assign different SellerFulfillmentOrderItemId values to two items in a fulfillment order that share the same SellerSKU but have different GiftMessage values.
     *
     * @return sellerFulfillmentOrderItemId
     **/
    @Schema(required = true, description = "A fulfillment order item identifier that the seller creates to track fulfillment order items. Used to disambiguate multiple fulfillment items that have the same SellerSKU. For example, the seller might assign different SellerFulfillmentOrderItemId values to two items in a fulfillment order that share the same SellerSKU but have different GiftMessage values.")
    public String getSellerFulfillmentOrderItemId() {
        return sellerFulfillmentOrderItemId;
    }

    public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    }

    public CreateFulfillmentOrderItem quantity(Integer quantity) {
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

    public CreateFulfillmentOrderItem giftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
        return this;
    }

    /**
     * A message to the gift recipient, if applicable.
     *
     * @return giftMessage
     **/
    @Schema(description = "A message to the gift recipient, if applicable.")
    public String getGiftMessage() {
        return giftMessage;
    }

    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    public CreateFulfillmentOrderItem displayableComment(String displayableComment) {
        this.displayableComment = displayableComment;
        return this;
    }

    /**
     * Item-specific text that displays in recipient-facing materials such as the outbound shipment packing slip.
     *
     * @return displayableComment
     **/
    @Schema(description = "Item-specific text that displays in recipient-facing materials such as the outbound shipment packing slip.")
    public String getDisplayableComment() {
        return displayableComment;
    }

    public void setDisplayableComment(String displayableComment) {
        this.displayableComment = displayableComment;
    }

    public CreateFulfillmentOrderItem fulfillmentNetworkSku(String fulfillmentNetworkSku) {
        this.fulfillmentNetworkSku = fulfillmentNetworkSku;
        return this;
    }

    /**
     * Amazon&#x27;s fulfillment network SKU of the item.
     *
     * @return fulfillmentNetworkSku
     **/
    @Schema(description = "Amazon's fulfillment network SKU of the item.")
    public String getFulfillmentNetworkSku() {
        return fulfillmentNetworkSku;
    }

    public void setFulfillmentNetworkSku(String fulfillmentNetworkSku) {
        this.fulfillmentNetworkSku = fulfillmentNetworkSku;
    }

    public CreateFulfillmentOrderItem perUnitDeclaredValue(Money perUnitDeclaredValue) {
        this.perUnitDeclaredValue = perUnitDeclaredValue;
        return this;
    }

    /**
     * Get perUnitDeclaredValue
     *
     * @return perUnitDeclaredValue
     **/
    @Schema(description = "")
    public Money getPerUnitDeclaredValue() {
        return perUnitDeclaredValue;
    }

    public void setPerUnitDeclaredValue(Money perUnitDeclaredValue) {
        this.perUnitDeclaredValue = perUnitDeclaredValue;
    }

    public CreateFulfillmentOrderItem perUnitPrice(Money perUnitPrice) {
        this.perUnitPrice = perUnitPrice;
        return this;
    }

    /**
     * Get perUnitPrice
     *
     * @return perUnitPrice
     **/
    @Schema(description = "")
    public Money getPerUnitPrice() {
        return perUnitPrice;
    }

    public void setPerUnitPrice(Money perUnitPrice) {
        this.perUnitPrice = perUnitPrice;
    }

    public CreateFulfillmentOrderItem perUnitTax(Money perUnitTax) {
        this.perUnitTax = perUnitTax;
        return this;
    }

    /**
     * Get perUnitTax
     *
     * @return perUnitTax
     **/
    @Schema(description = "")
    public Money getPerUnitTax() {
        return perUnitTax;
    }

    public void setPerUnitTax(Money perUnitTax) {
        this.perUnitTax = perUnitTax;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFulfillmentOrderItem createFulfillmentOrderItem = (CreateFulfillmentOrderItem) o;
        return Objects.equals(this.sellerSku, createFulfillmentOrderItem.sellerSku) &&
                Objects.equals(this.sellerFulfillmentOrderItemId, createFulfillmentOrderItem.sellerFulfillmentOrderItemId) &&
                Objects.equals(this.quantity, createFulfillmentOrderItem.quantity) &&
                Objects.equals(this.giftMessage, createFulfillmentOrderItem.giftMessage) &&
                Objects.equals(this.displayableComment, createFulfillmentOrderItem.displayableComment) &&
                Objects.equals(this.fulfillmentNetworkSku, createFulfillmentOrderItem.fulfillmentNetworkSku) &&
                Objects.equals(this.perUnitDeclaredValue, createFulfillmentOrderItem.perUnitDeclaredValue) &&
                Objects.equals(this.perUnitPrice, createFulfillmentOrderItem.perUnitPrice) &&
                Objects.equals(this.perUnitTax, createFulfillmentOrderItem.perUnitTax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerSku, sellerFulfillmentOrderItemId, quantity, giftMessage, displayableComment, fulfillmentNetworkSku, perUnitDeclaredValue, perUnitPrice, perUnitTax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFulfillmentOrderItem {\n");
        sb.append("    sellerSku: ").append(toIndentedString(sellerSku)).append("\n");
        sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    giftMessage: ").append(toIndentedString(giftMessage)).append("\n");
        sb.append("    displayableComment: ").append(toIndentedString(displayableComment)).append("\n");
        sb.append("    fulfillmentNetworkSku: ").append(toIndentedString(fulfillmentNetworkSku)).append("\n");
        sb.append("    perUnitDeclaredValue: ").append(toIndentedString(perUnitDeclaredValue)).append("\n");
        sb.append("    perUnitPrice: ").append(toIndentedString(perUnitPrice)).append("\n");
        sb.append("    perUnitTax: ").append(toIndentedString(perUnitTax)).append("\n");
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
