package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Contains pricing information that includes special pricing when buying in bulk.
 */
@Schema(description = "Contains pricing information that includes special pricing when buying in bulk.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class QuantityDiscountPriceType {
    @SerializedName("quantityTier")
    private Integer quantityTier = null;
    @SerializedName("quantityDiscountType")
    private QuantityDiscountType quantityDiscountType = null;
    @SerializedName("listingPrice")
    private MoneyType listingPrice = null;

    public QuantityDiscountPriceType quantityTier(Integer quantityTier) {
        this.quantityTier = quantityTier;
        return this;
    }

    /**
     * Indicates at what quantity this price becomes active.
     *
     * @return quantityTier
     **/
    @Schema(required = true, description = "Indicates at what quantity this price becomes active.")
    public Integer getQuantityTier() {
        return quantityTier;
    }

    public void setQuantityTier(Integer quantityTier) {
        this.quantityTier = quantityTier;
    }

    public QuantityDiscountPriceType quantityDiscountType(QuantityDiscountType quantityDiscountType) {
        this.quantityDiscountType = quantityDiscountType;
        return this;
    }

    /**
     * Get quantityDiscountType
     *
     * @return quantityDiscountType
     **/
    @Schema(required = true, description = "")
    public QuantityDiscountType getQuantityDiscountType() {
        return quantityDiscountType;
    }

    public void setQuantityDiscountType(QuantityDiscountType quantityDiscountType) {
        this.quantityDiscountType = quantityDiscountType;
    }

    public QuantityDiscountPriceType listingPrice(MoneyType listingPrice) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuantityDiscountPriceType quantityDiscountPriceType = (QuantityDiscountPriceType) o;
        return Objects.equals(this.quantityTier, quantityDiscountPriceType.quantityTier) &&
                Objects.equals(this.quantityDiscountType, quantityDiscountPriceType.quantityDiscountType) &&
                Objects.equals(this.listingPrice, quantityDiscountPriceType.listingPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantityTier, quantityDiscountType, listingPrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuantityDiscountPriceType {\n");
        sb.append("    quantityTier: ").append(toIndentedString(quantityTier)).append("\n");
        sb.append("    quantityDiscountType: ").append(toIndentedString(quantityDiscountType)).append("\n");
        sb.append("    listingPrice: ").append(toIndentedString(listingPrice)).append("\n");
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
