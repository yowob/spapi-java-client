package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * BuyBoxPriceType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class BuyBoxPriceType {
    @SerializedName("condition")
    private String condition = null;
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
    @SerializedName("sellerId")
    private String sellerId = null;

    public BuyBoxPriceType condition(String condition) {
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

    public BuyBoxPriceType offerType(OfferCustomerType offerType) {
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

    public BuyBoxPriceType quantityTier(Integer quantityTier) {
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

    public BuyBoxPriceType quantityDiscountType(QuantityDiscountType quantityDiscountType) {
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

    public BuyBoxPriceType landedPrice(MoneyType landedPrice) {
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

    public BuyBoxPriceType listingPrice(MoneyType listingPrice) {
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

    public BuyBoxPriceType shipping(MoneyType shipping) {
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

    public BuyBoxPriceType points(Points points) {
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

    public BuyBoxPriceType sellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * The seller identifier for the offer.
     *
     * @return sellerId
     **/
    @Schema(description = "The seller identifier for the offer.")
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BuyBoxPriceType buyBoxPriceType = (BuyBoxPriceType) o;
        return Objects.equals(this.condition, buyBoxPriceType.condition) &&
                Objects.equals(this.offerType, buyBoxPriceType.offerType) &&
                Objects.equals(this.quantityTier, buyBoxPriceType.quantityTier) &&
                Objects.equals(this.quantityDiscountType, buyBoxPriceType.quantityDiscountType) &&
                Objects.equals(this.landedPrice, buyBoxPriceType.landedPrice) &&
                Objects.equals(this.listingPrice, buyBoxPriceType.listingPrice) &&
                Objects.equals(this.shipping, buyBoxPriceType.shipping) &&
                Objects.equals(this.points, buyBoxPriceType.points) &&
                Objects.equals(this.sellerId, buyBoxPriceType.sellerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, offerType, quantityTier, quantityDiscountType, landedPrice, listingPrice, shipping, points, sellerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuyBoxPriceType {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
        sb.append("    quantityTier: ").append(toIndentedString(quantityTier)).append("\n");
        sb.append("    quantityDiscountType: ").append(toIndentedString(quantityDiscountType)).append("\n");
        sb.append("    landedPrice: ").append(toIndentedString(landedPrice)).append("\n");
        sb.append("    listingPrice: ").append(toIndentedString(listingPrice)).append("\n");
        sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
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
