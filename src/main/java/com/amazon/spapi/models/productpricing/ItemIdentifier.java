package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information that identifies an item.
 */
@Schema(description = "Information that identifies an item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemIdentifier {
    @SerializedName("MarketplaceId")
    private String marketplaceId = null;
    @SerializedName("ASIN")
    private String ASIN = null;
    @SerializedName("SellerSKU")
    private String sellerSKU = null;
    @SerializedName("ItemCondition")
    private ConditionType itemCondition = null;

    public ItemIdentifier marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * A marketplace identifier. Specifies the marketplace from which prices are returned.
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "A marketplace identifier. Specifies the marketplace from which prices are returned.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public ItemIdentifier ASIN(String ASIN) {
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

    public ItemIdentifier sellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * The seller stock keeping unit (SKU) of the item.
     *
     * @return sellerSKU
     **/
    @Schema(description = "The seller stock keeping unit (SKU) of the item.")
    public String getSellerSKU() {
        return sellerSKU;
    }

    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    public ItemIdentifier itemCondition(ConditionType itemCondition) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemIdentifier itemIdentifier = (ItemIdentifier) o;
        return Objects.equals(this.marketplaceId, itemIdentifier.marketplaceId) &&
                Objects.equals(this.ASIN, itemIdentifier.ASIN) &&
                Objects.equals(this.sellerSKU, itemIdentifier.sellerSKU) &&
                Objects.equals(this.itemCondition, itemIdentifier.itemCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, ASIN, sellerSKU, itemCondition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemIdentifier {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
        sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
        sb.append("    itemCondition: ").append(toIndentedString(itemCondition)).append("\n");
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