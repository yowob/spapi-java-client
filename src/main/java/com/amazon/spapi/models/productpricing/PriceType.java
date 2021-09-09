package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PriceType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PriceType {
    @SerializedName("LandedPrice")
    private MoneyType landedPrice = null;
    @SerializedName("ListingPrice")
    private MoneyType listingPrice = null;
    @SerializedName("Shipping")
    private MoneyType shipping = null;
    @SerializedName("Points")
    private Points points = null;

    public PriceType landedPrice(MoneyType landedPrice) {
        this.landedPrice = landedPrice;
        return this;
    }

    /**
     * Get landedPrice
     *
     * @return landedPrice
     **/
    @Schema(description = "")
    public MoneyType getLandedPrice() {
        return landedPrice;
    }

    public void setLandedPrice(MoneyType landedPrice) {
        this.landedPrice = landedPrice;
    }

    public PriceType listingPrice(MoneyType listingPrice) {
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

    public PriceType shipping(MoneyType shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     * Get shipping
     *
     * @return shipping
     **/
    @Schema(description = "")
    public MoneyType getShipping() {
        return shipping;
    }

    public void setShipping(MoneyType shipping) {
        this.shipping = shipping;
    }

    public PriceType points(Points points) {
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
        PriceType priceType = (PriceType) o;
        return Objects.equals(this.landedPrice, priceType.landedPrice) &&
                Objects.equals(this.listingPrice, priceType.listingPrice) &&
                Objects.equals(this.shipping, priceType.shipping) &&
                Objects.equals(this.points, priceType.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(landedPrice, listingPrice, shipping, points);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceType {\n");
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
