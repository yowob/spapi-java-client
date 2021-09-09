package com.amazon.spapi.models.productfees;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Price information for an item, used to estimate fees.
 */
@Schema(description = "Price information for an item, used to estimate fees.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PriceToEstimateFees {
    @SerializedName("ListingPrice")
    private MoneyType listingPrice = null;
    @SerializedName("Shipping")
    private MoneyType shipping = null;
    @SerializedName("Points")
    private Points points = null;

    public PriceToEstimateFees listingPrice(MoneyType listingPrice) {
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

    public PriceToEstimateFees shipping(MoneyType shipping) {
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

    public PriceToEstimateFees points(Points points) {
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
        PriceToEstimateFees priceToEstimateFees = (PriceToEstimateFees) o;
        return Objects.equals(this.listingPrice, priceToEstimateFees.listingPrice) &&
                Objects.equals(this.shipping, priceToEstimateFees.shipping) &&
                Objects.equals(this.points, priceToEstimateFees.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listingPrice, shipping, points);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceToEstimateFees {\n");
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
