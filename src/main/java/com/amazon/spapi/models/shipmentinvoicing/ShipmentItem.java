package com.amazon.spapi.models.shipmentinvoicing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * The shipment item information required by a seller to issue a shipment invoice.
 */
@Schema(description = "The shipment item information required by a seller to issue a shipment invoice.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ShipmentItem {
    @SerializedName("ASIN")
    private String ASIN = null;
    @SerializedName("SellerSKU")
    private String sellerSKU = null;
    @SerializedName("OrderItemId")
    private String orderItemId = null;
    @SerializedName("Title")
    private String title = null;
    @SerializedName("QuantityOrdered")
    private BigDecimal quantityOrdered = null;
    @SerializedName("ItemPrice")
    private Money itemPrice = null;
    @SerializedName("ShippingPrice")
    private Money shippingPrice = null;
    @SerializedName("GiftWrapPrice")
    private Money giftWrapPrice = null;
    @SerializedName("ShippingDiscount")
    private Money shippingDiscount = null;
    @SerializedName("PromotionDiscount")
    private Money promotionDiscount = null;
    @SerializedName("SerialNumbers")
    private SerialNumbersList serialNumbers = null;

    public ShipmentItem ASIN(String ASIN) {
        this.ASIN = ASIN;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item.
     *
     * @return ASIN
     **/
    @Schema(description = "The Amazon Standard Identification Number (ASIN) of the item.")
    public String getASIN() {
        return ASIN;
    }

    public void setASIN(String ASIN) {
        this.ASIN = ASIN;
    }

    public ShipmentItem sellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * The seller SKU of the item.
     *
     * @return sellerSKU
     **/
    @Schema(description = "The seller SKU of the item.")
    public String getSellerSKU() {
        return sellerSKU;
    }

    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    public ShipmentItem orderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
        return this;
    }

    /**
     * The Amazon-defined identifier for the order item.
     *
     * @return orderItemId
     **/
    @Schema(description = "The Amazon-defined identifier for the order item.")
    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public ShipmentItem title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The name of the item.
     *
     * @return title
     **/
    @Schema(description = "The name of the item.")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShipmentItem quantityOrdered(BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
        return this;
    }

    /**
     * The number of items ordered.
     *
     * @return quantityOrdered
     **/
    @Schema(description = "The number of items ordered.")
    public BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public ShipmentItem itemPrice(Money itemPrice) {
        this.itemPrice = itemPrice;
        return this;
    }

    /**
     * Get itemPrice
     *
     * @return itemPrice
     **/
    @Schema(description = "")
    public Money getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Money itemPrice) {
        this.itemPrice = itemPrice;
    }

    public ShipmentItem shippingPrice(Money shippingPrice) {
        this.shippingPrice = shippingPrice;
        return this;
    }

    /**
     * Get shippingPrice
     *
     * @return shippingPrice
     **/
    @Schema(description = "")
    public Money getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(Money shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public ShipmentItem giftWrapPrice(Money giftWrapPrice) {
        this.giftWrapPrice = giftWrapPrice;
        return this;
    }

    /**
     * Get giftWrapPrice
     *
     * @return giftWrapPrice
     **/
    @Schema(description = "")
    public Money getGiftWrapPrice() {
        return giftWrapPrice;
    }

    public void setGiftWrapPrice(Money giftWrapPrice) {
        this.giftWrapPrice = giftWrapPrice;
    }

    public ShipmentItem shippingDiscount(Money shippingDiscount) {
        this.shippingDiscount = shippingDiscount;
        return this;
    }

    /**
     * Get shippingDiscount
     *
     * @return shippingDiscount
     **/
    @Schema(description = "")
    public Money getShippingDiscount() {
        return shippingDiscount;
    }

    public void setShippingDiscount(Money shippingDiscount) {
        this.shippingDiscount = shippingDiscount;
    }

    public ShipmentItem promotionDiscount(Money promotionDiscount) {
        this.promotionDiscount = promotionDiscount;
        return this;
    }

    /**
     * Get promotionDiscount
     *
     * @return promotionDiscount
     **/
    @Schema(description = "")
    public Money getPromotionDiscount() {
        return promotionDiscount;
    }

    public void setPromotionDiscount(Money promotionDiscount) {
        this.promotionDiscount = promotionDiscount;
    }

    public ShipmentItem serialNumbers(SerialNumbersList serialNumbers) {
        this.serialNumbers = serialNumbers;
        return this;
    }

    /**
     * Get serialNumbers
     *
     * @return serialNumbers
     **/
    @Schema(description = "")
    public SerialNumbersList getSerialNumbers() {
        return serialNumbers;
    }

    public void setSerialNumbers(SerialNumbersList serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentItem shipmentItem = (ShipmentItem) o;
        return Objects.equals(this.ASIN, shipmentItem.ASIN) &&
                Objects.equals(this.sellerSKU, shipmentItem.sellerSKU) &&
                Objects.equals(this.orderItemId, shipmentItem.orderItemId) &&
                Objects.equals(this.title, shipmentItem.title) &&
                Objects.equals(this.quantityOrdered, shipmentItem.quantityOrdered) &&
                Objects.equals(this.itemPrice, shipmentItem.itemPrice) &&
                Objects.equals(this.shippingPrice, shipmentItem.shippingPrice) &&
                Objects.equals(this.giftWrapPrice, shipmentItem.giftWrapPrice) &&
                Objects.equals(this.shippingDiscount, shipmentItem.shippingDiscount) &&
                Objects.equals(this.promotionDiscount, shipmentItem.promotionDiscount) &&
                Objects.equals(this.serialNumbers, shipmentItem.serialNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ASIN, sellerSKU, orderItemId, title, quantityOrdered, itemPrice, shippingPrice, giftWrapPrice, shippingDiscount, promotionDiscount, serialNumbers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipmentItem {\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
        sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
        sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
        sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
        sb.append("    shippingPrice: ").append(toIndentedString(shippingPrice)).append("\n");
        sb.append("    giftWrapPrice: ").append(toIndentedString(giftWrapPrice)).append("\n");
        sb.append("    shippingDiscount: ").append(toIndentedString(shippingDiscount)).append("\n");
        sb.append("    promotionDiscount: ").append(toIndentedString(promotionDiscount)).append("\n");
        sb.append("    serialNumbers: ").append(toIndentedString(serialNumbers)).append("\n");
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
