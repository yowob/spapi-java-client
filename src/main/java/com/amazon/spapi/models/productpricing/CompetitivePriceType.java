package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * CompetitivePriceType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CompetitivePriceType {
    @SerializedName("CompetitivePriceId")
    private String competitivePriceId = null;
    @SerializedName("Price")
    private PriceType price = null;
    @SerializedName("condition")
    private String condition = null;
    @SerializedName("subcondition")
    private String subcondition = null;
    @SerializedName("offerType")
    private OfferCustomerType offerType = null;
    @SerializedName("quantityTier")
    private Integer quantityTier = null;
    @SerializedName("quantityDiscountType")
    private QuantityDiscountType quantityDiscountType = null;
    @SerializedName("sellerId")
    private String sellerId = null;
    @SerializedName("belongsToRequester")
    private Boolean belongsToRequester = null;

    public CompetitivePriceType competitivePriceId(String competitivePriceId) {
        this.competitivePriceId = competitivePriceId;
        return this;
    }

    /**
     * The pricing model for each price that is returned.  Possible values:  * 1 - New Buy Box Price. * 2 - Used Buy Box Price.
     *
     * @return competitivePriceId
     **/
    @Schema(required = true, description = "The pricing model for each price that is returned.  Possible values:  * 1 - New Buy Box Price. * 2 - Used Buy Box Price.")
    public String getCompetitivePriceId() {
        return competitivePriceId;
    }

    public void setCompetitivePriceId(String competitivePriceId) {
        this.competitivePriceId = competitivePriceId;
    }

    public CompetitivePriceType price(PriceType price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/
    @Schema(required = true, description = "")
    public PriceType getPrice() {
        return price;
    }

    public void setPrice(PriceType price) {
        this.price = price;
    }

    public CompetitivePriceType condition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Indicates the condition of the item whose pricing information is returned. Possible values are: New, Used, Collectible, Refurbished, or Club.
     *
     * @return condition
     **/
    @Schema(description = "Indicates the condition of the item whose pricing information is returned. Possible values are: New, Used, Collectible, Refurbished, or Club.")
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public CompetitivePriceType subcondition(String subcondition) {
        this.subcondition = subcondition;
        return this;
    }

    /**
     * Indicates the subcondition of the item whose pricing information is returned. Possible values are: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other.
     *
     * @return subcondition
     **/
    @Schema(description = "Indicates the subcondition of the item whose pricing information is returned. Possible values are: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other.")
    public String getSubcondition() {
        return subcondition;
    }

    public void setSubcondition(String subcondition) {
        this.subcondition = subcondition;
    }

    public CompetitivePriceType offerType(OfferCustomerType offerType) {
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

    public CompetitivePriceType quantityTier(Integer quantityTier) {
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

    public CompetitivePriceType quantityDiscountType(QuantityDiscountType quantityDiscountType) {
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

    public CompetitivePriceType sellerId(String sellerId) {
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

    public CompetitivePriceType belongsToRequester(Boolean belongsToRequester) {
        this.belongsToRequester = belongsToRequester;
        return this;
    }

    /**
     * Indicates whether or not the pricing information is for an offer listing that belongs to the requester. The requester is the seller associated with the SellerId that was submitted with the request. Possible values are: true and false.
     *
     * @return belongsToRequester
     **/
    @Schema(description = " Indicates whether or not the pricing information is for an offer listing that belongs to the requester. The requester is the seller associated with the SellerId that was submitted with the request. Possible values are: true and false.")
    public Boolean isBelongsToRequester() {
        return belongsToRequester;
    }

    public void setBelongsToRequester(Boolean belongsToRequester) {
        this.belongsToRequester = belongsToRequester;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompetitivePriceType competitivePriceType = (CompetitivePriceType) o;
        return Objects.equals(this.competitivePriceId, competitivePriceType.competitivePriceId) &&
                Objects.equals(this.price, competitivePriceType.price) &&
                Objects.equals(this.condition, competitivePriceType.condition) &&
                Objects.equals(this.subcondition, competitivePriceType.subcondition) &&
                Objects.equals(this.offerType, competitivePriceType.offerType) &&
                Objects.equals(this.quantityTier, competitivePriceType.quantityTier) &&
                Objects.equals(this.quantityDiscountType, competitivePriceType.quantityDiscountType) &&
                Objects.equals(this.sellerId, competitivePriceType.sellerId) &&
                Objects.equals(this.belongsToRequester, competitivePriceType.belongsToRequester);
    }

    @Override
    public int hashCode() {
        return Objects.hash(competitivePriceId, price, condition, subcondition, offerType, quantityTier, quantityDiscountType, sellerId, belongsToRequester);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompetitivePriceType {\n");
        sb.append("    competitivePriceId: ").append(toIndentedString(competitivePriceId)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    subcondition: ").append(toIndentedString(subcondition)).append("\n");
        sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
        sb.append("    quantityTier: ").append(toIndentedString(quantityTier)).append("\n");
        sb.append("    quantityDiscountType: ").append(toIndentedString(quantityDiscountType)).append("\n");
        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
        sb.append("    belongsToRequester: ").append(toIndentedString(belongsToRequester)).append("\n");
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
