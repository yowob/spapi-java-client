package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * LowestPriceType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class LowestPriceType {
    @SerializedName("condition")
    private String condition = null;
    @SerializedName("fulfillmentChannel")
    private String fulfillmentChannel = null;
    @SerializedName("offerType")
    private OfferCustomerType offerType = null;
    @SerializedName("quantityTier")
    private Integer quantityTier = null;
    @SerializedName("quantityDiscountType")
    private QuantityDiscountType quantityDiscountType = null;
    @SerializedName("LandedPrice")
    private MoneyType landedPrice = null;
    @SerializedName("ListingPrice")
    private MoneyType listingPrice = null;
    @SerializedName("Shipping")
    private MoneyType shipping = null;
    @SerializedName("Points")
    private Points points = null;

    public LowestPriceType condition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Indicates the condition of the item. For example: New, Used, Collectible, Refurbished, or Club.
     *
     * @return condition
     **/
    @Schema(required = true, description = "Indicates the condition of the item. For example: New, Used, Collectible, Refurbished, or Club.")
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public LowestPriceType fulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
        return this;
    }

    /**
     * Indicates whether the item is fulfilled by Amazon or by the seller.
     *
     * @return fulfillmentChannel
     **/
    @Schema(required = true, description = "Indicates whether the item is fulfilled by Amazon or by the seller.")
    public String getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    public void setFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
    }

    public LowestPriceType offerType(OfferCustomerType offerType) {
        this.offerType = offerType;
        return this;
    }

    /**
     * Get offerType
     *
     * @return offerType
     **/
    @Schema(description = "")
    public OfferCustomerType getOfferType() {
        return offerType;
    }

    public void setOfferType(OfferCustomerType offerType) {
        this.offerType = offerType;
    }

    public LowestPriceType quantityTier(Integer quantityTier) {
        this.quantityTier = quantityTier;
        return this;
    }

    /**
     * Indicates at what quantity this price becomes active.
     *
     * @return quantityTier
     **/
    @Schema(description = "Indicates at what quantity this price becomes active.")
    public Integer getQuantityTier() {
        return quantityTier;
    }

    public void setQuantityTier(Integer quantityTier) {
        this.quantityTier = quantityTier;
    }

    public LowestPriceType quantityDiscountType(QuantityDiscountType quantityDiscountType) {
        this.quantityDiscountType = quantityDiscountType;
        return this;
    }

    /**
     * Get quantityDiscountType
     *
     * @return quantityDiscountType
     **/
    @Schema(description = "")
    public QuantityDiscountType getQuantityDiscountType() {
        return quantityDiscountType;
    }

    public void setQuantityDiscountType(QuantityDiscountType quantityDiscountType) {
        this.quantityDiscountType = quantityDiscountType;
    }

    public LowestPriceType landedPrice(MoneyType landedPrice) {
        this.landedPrice = landedPrice;
        return this;
    }

    /**
     * Get landedPrice
     *
     * @return landedPrice
     **/
    @Schema(required = true, description = "")
    public MoneyType getLandedPrice() {
        return landedPrice;
    }

    public void setLandedPrice(MoneyType landedPrice) {
        this.landedPrice = landedPrice;
    }

    public LowestPriceType listingPrice(MoneyType listingPrice) {
        this.listingPrice = listingPrice;
        return this;
    }

    /**
     * Get listingPrice
     *
     * @return listingPrice
     **/
    @Schema(required = true, description = "")
    public MoneyType getListingPrice() {
        return listingPrice;
    }

    public void setListingPrice(MoneyType listingPrice) {
        this.listingPrice = listingPrice;
    }

    public LowestPriceType shipping(MoneyType shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     * Get shipping
     *
     * @return shipping
     **/
    @Schema(required = true, description = "")
    public MoneyType getShipping() {
        return shipping;
    }

    public void setShipping(MoneyType shipping) {
        this.shipping = shipping;
    }

    public LowestPriceType points(Points points) {
        this.points = points;
        return this;
    }

    /**
     * Get points
     *
     * @return points
     **/
    @Schema(description = "")
    public Points getPoints() {
        return points;
    }

    public void setPoints(Points points) {
        this.points = points;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LowestPriceType lowestPriceType = (LowestPriceType) o;
        return Objects.equals(this.condition, lowestPriceType.condition) &&
                Objects.equals(this.fulfillmentChannel, lowestPriceType.fulfillmentChannel) &&
                Objects.equals(this.offerType, lowestPriceType.offerType) &&
                Objects.equals(this.quantityTier, lowestPriceType.quantityTier) &&
                Objects.equals(this.quantityDiscountType, lowestPriceType.quantityDiscountType) &&
                Objects.equals(this.landedPrice, lowestPriceType.landedPrice) &&
                Objects.equals(this.listingPrice, lowestPriceType.listingPrice) &&
                Objects.equals(this.shipping, lowestPriceType.shipping) &&
                Objects.equals(this.points, lowestPriceType.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, fulfillmentChannel, offerType, quantityTier, quantityDiscountType, landedPrice, listingPrice, shipping, points);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LowestPriceType {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    fulfillmentChannel: ").append(toIndentedString(fulfillmentChannel)).append("\n");
        sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
        sb.append("    quantityTier: ").append(toIndentedString(quantityTier)).append("\n");
        sb.append("    quantityDiscountType: ").append(toIndentedString(quantityDiscountType)).append("\n");
        sb.append("    landedPrice: ").append(toIndentedString(landedPrice)).append("\n");
        sb.append("    listingPrice: ").append(toIndentedString(listingPrice)).append("\n");
        sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
