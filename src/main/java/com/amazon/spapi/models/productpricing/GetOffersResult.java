package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetOffersResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetOffersResult {
    @SerializedName("MarketplaceID")
    private String marketplaceID = null;
    @SerializedName("ASIN")
    private String ASIN = null;
    @SerializedName("SKU")
    private String SKU = null;
    @SerializedName("ItemCondition")
    private ConditionType itemCondition = null;
    @SerializedName("status")
    private String status = null;
    @SerializedName("Identifier")
    private ItemIdentifier identifier = null;
    @SerializedName("Summary")
    private Summary summary = null;
    @SerializedName("Offers")
    private OfferDetailList offers = null;

    public GetOffersResult marketplaceID(String marketplaceID) {
        this.marketplaceID = marketplaceID;
        return this;
    }

    /**
     * A marketplace identifier.
     *
     * @return marketplaceID
     **/
    @Schema(required = true, description = "A marketplace identifier.")
    public String getMarketplaceID() {
        return marketplaceID;
    }

    public void setMarketplaceID(String marketplaceID) {
        this.marketplaceID = marketplaceID;
    }

    public GetOffersResult ASIN(String ASIN) {
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

    public GetOffersResult SKU(String SKU) {
        this.SKU = SKU;
        return this;
    }

    /**
     * The stock keeping unit (SKU) of the item.
     *
     * @return SKU
     **/
    @Schema(description = "The stock keeping unit (SKU) of the item.")
    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public GetOffersResult itemCondition(ConditionType itemCondition) {
        this.itemCondition = itemCondition;
        return this;
    }

    /**
     * Get itemCondition
     *
     * @return itemCondition
     **/
    @Schema(required = true, description = "")
    public ConditionType getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(ConditionType itemCondition) {
        this.itemCondition = itemCondition;
    }

    public GetOffersResult status(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the operation.
     *
     * @return status
     **/
    @Schema(required = true, description = "The status of the operation.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetOffersResult identifier(ItemIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get identifier
     *
     * @return identifier
     **/
    @Schema(required = true, description = "")
    public ItemIdentifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(ItemIdentifier identifier) {
        this.identifier = identifier;
    }

    public GetOffersResult summary(Summary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get summary
     *
     * @return summary
     **/
    @Schema(required = true, description = "")
    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public GetOffersResult offers(OfferDetailList offers) {
        this.offers = offers;
        return this;
    }

    /**
     * Get offers
     *
     * @return offers
     **/
    @Schema(required = true, description = "")
    public OfferDetailList getOffers() {
        return offers;
    }

    public void setOffers(OfferDetailList offers) {
        this.offers = offers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetOffersResult getOffersResult = (GetOffersResult) o;
        return Objects.equals(this.marketplaceID, getOffersResult.marketplaceID) &&
                Objects.equals(this.ASIN, getOffersResult.ASIN) &&
                Objects.equals(this.SKU, getOffersResult.SKU) &&
                Objects.equals(this.itemCondition, getOffersResult.itemCondition) &&
                Objects.equals(this.status, getOffersResult.status) &&
                Objects.equals(this.identifier, getOffersResult.identifier) &&
                Objects.equals(this.summary, getOffersResult.summary) &&
                Objects.equals(this.offers, getOffersResult.offers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceID, ASIN, SKU, itemCondition, status, identifier, summary, offers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOffersResult {\n");
        sb.append("    marketplaceID: ").append(toIndentedString(marketplaceID)).append("\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
        sb.append("    SKU: ").append(toIndentedString(SKU)).append("\n");
        sb.append("    itemCondition: ").append(toIndentedString(itemCondition)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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
