package com.amazon.spapi.models.catalogitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Sales ranks of an Amazon catalog item for the indicated Amazon marketplace.
 */
@Schema(description = "Sales ranks of an Amazon catalog item for the indicated Amazon marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemSalesRanksByMarketplace {
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("ranks")
    private List<ItemSalesRank> ranks = new ArrayList<ItemSalesRank>();

    public ItemSalesRanksByMarketplace marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Amazon marketplace identifier.
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "Amazon marketplace identifier.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public ItemSalesRanksByMarketplace ranks(List<ItemSalesRank> ranks) {
        this.ranks = ranks;
        return this;
    }

    public ItemSalesRanksByMarketplace addRanksItem(ItemSalesRank ranksItem) {
        this.ranks.add(ranksItem);
        return this;
    }

    /**
     * Sales ranks of an Amazon catalog item for an Amazon marketplace.
     *
     * @return ranks
     **/
    @Schema(required = true, description = "Sales ranks of an Amazon catalog item for an Amazon marketplace.")
    public List<ItemSalesRank> getRanks() {
        return ranks;
    }

    public void setRanks(List<ItemSalesRank> ranks) {
        this.ranks = ranks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemSalesRanksByMarketplace itemSalesRanksByMarketplace = (ItemSalesRanksByMarketplace) o;
        return Objects.equals(this.marketplaceId, itemSalesRanksByMarketplace.marketplaceId) &&
                Objects.equals(this.ranks, itemSalesRanksByMarketplace.ranks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, ranks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemSalesRanksByMarketplace {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    ranks: ").append(toIndentedString(ranks)).append("\n");
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
