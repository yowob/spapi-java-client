package com.amazon.spapi.models.catalogitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Product type associated with the Amazon catalog item for the indicated Amazon marketplace.
 */
@Schema(description = "Product type associated with the Amazon catalog item for the indicated Amazon marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemProductTypeByMarketplace {
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("productType")
    private String productType = null;

    public ItemProductTypeByMarketplace marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Amazon marketplace identifier.
     *
     * @return marketplaceId
     **/
    @Schema(description = "Amazon marketplace identifier.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public ItemProductTypeByMarketplace productType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * Name of the product type associated with the Amazon catalog item.
     *
     * @return productType
     **/
    @Schema(example = "LUGGAGE", description = "Name of the product type associated with the Amazon catalog item.")
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemProductTypeByMarketplace itemProductTypeByMarketplace = (ItemProductTypeByMarketplace) o;
        return Objects.equals(this.marketplaceId, itemProductTypeByMarketplace.marketplaceId) &&
                Objects.equals(this.productType, itemProductTypeByMarketplace.productType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, productType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemProductTypeByMarketplace {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
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
