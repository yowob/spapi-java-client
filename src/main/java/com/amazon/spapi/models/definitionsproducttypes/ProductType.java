package com.amazon.spapi.models.definitionsproducttypes;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An Amazon product type with a definition available.
 */
@Schema(description = "An Amazon product type with a definition available.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ProductType {
    @SerializedName("name")
    private String name = null;
    @SerializedName("marketplaceIds")
    private List<String> marketplaceIds = new ArrayList<String>();

    public ProductType name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the Amazon product type.
     *
     * @return name
     **/
    @Schema(required = true, description = "The name of the Amazon product type.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType marketplaceIds(List<String> marketplaceIds) {
        this.marketplaceIds = marketplaceIds;
        return this;
    }

    public ProductType addMarketplaceIdsItem(String marketplaceIdsItem) {
        this.marketplaceIds.add(marketplaceIdsItem);
        return this;
    }

    /**
     * The Amazon marketplace identifiers for which the product type definition is available.
     *
     * @return marketplaceIds
     **/
    @Schema(required = true, description = "The Amazon marketplace identifiers for which the product type definition is available.")
    public List<String> getMarketplaceIds() {
        return marketplaceIds;
    }

    public void setMarketplaceIds(List<String> marketplaceIds) {
        this.marketplaceIds = marketplaceIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductType productType = (ProductType) o;
        return Objects.equals(this.name, productType.name) &&
                Objects.equals(this.marketplaceIds, productType.marketplaceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marketplaceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductType {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
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
