package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * SellerSKUIdentifier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SellerSKUIdentifier {
    @SerializedName("MarketplaceId")
    private String marketplaceId = null;
    @SerializedName("SellerId")
    private String sellerId = null;
    @SerializedName("SellerSKU")
    private String sellerSKU = null;

    public SellerSKUIdentifier marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * A marketplace identifier.
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "A marketplace identifier.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public SellerSKUIdentifier sellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * The seller identifier submitted for the operation.
     *
     * @return sellerId
     **/
    @Schema(required = true, description = "The seller identifier submitted for the operation.")
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public SellerSKUIdentifier sellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * The seller stock keeping unit (SKU) of the item.
     *
     * @return sellerSKU
     **/
    @Schema(required = true, description = "The seller stock keeping unit (SKU) of the item.")
    public String getSellerSKU() {
        return sellerSKU;
    }

    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SellerSKUIdentifier sellerSKUIdentifier = (SellerSKUIdentifier) o;
        return Objects.equals(this.marketplaceId, sellerSKUIdentifier.marketplaceId) &&
                Objects.equals(this.sellerId, sellerSKUIdentifier.sellerId) &&
                Objects.equals(this.sellerSKU, sellerSKUIdentifier.sellerSKU);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, sellerId, sellerSKU);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SellerSKUIdentifier {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
        sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
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
