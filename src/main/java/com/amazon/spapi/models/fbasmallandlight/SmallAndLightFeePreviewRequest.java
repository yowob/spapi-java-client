package com.amazon.spapi.models.fbasmallandlight;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Request schema for submitting items for which to retrieve fee estimates.
 */
@Schema(description = "Request schema for submitting items for which to retrieve fee estimates.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SmallAndLightFeePreviewRequest {
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("items")
    private List<Item> items = new ArrayList<Item>();

    public SmallAndLightFeePreviewRequest marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get marketplaceId
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public SmallAndLightFeePreviewRequest items(List<Item> items) {
        this.items = items;
        return this;
    }

    public SmallAndLightFeePreviewRequest addItemsItem(Item itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * A list of items for which to retrieve fee estimates (limit: 25).
     *
     * @return items
     **/
    @Schema(required = true, description = "A list of items for which to retrieve fee estimates (limit: 25).")
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmallAndLightFeePreviewRequest smallAndLightFeePreviewRequest = (SmallAndLightFeePreviewRequest) o;
        return Objects.equals(this.marketplaceId, smallAndLightFeePreviewRequest.marketplaceId) &&
                Objects.equals(this.items, smallAndLightFeePreviewRequest.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmallAndLightFeePreviewRequest {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
