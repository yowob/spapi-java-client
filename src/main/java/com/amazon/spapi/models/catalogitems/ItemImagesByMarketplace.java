package com.amazon.spapi.models.catalogitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Images for an item in the Amazon catalog for the indicated Amazon marketplace.
 */
@Schema(description = "Images for an item in the Amazon catalog for the indicated Amazon marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemImagesByMarketplace {
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("images")
    private List<ItemImage> images = new ArrayList<ItemImage>();

    public ItemImagesByMarketplace marketplaceId(String marketplaceId) {
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

    public ItemImagesByMarketplace images(List<ItemImage> images) {
        this.images = images;
        return this;
    }

    public ItemImagesByMarketplace addImagesItem(ItemImage imagesItem) {
        this.images.add(imagesItem);
        return this;
    }

    /**
     * Images for an item in the Amazon catalog for the indicated Amazon marketplace.
     *
     * @return images
     **/
    @Schema(required = true, description = "Images for an item in the Amazon catalog for the indicated Amazon marketplace.")
    public List<ItemImage> getImages() {
        return images;
    }

    public void setImages(List<ItemImage> images) {
        this.images = images;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemImagesByMarketplace itemImagesByMarketplace = (ItemImagesByMarketplace) o;
        return Objects.equals(this.marketplaceId, itemImagesByMarketplace.marketplaceId) &&
                Objects.equals(this.images, itemImagesByMarketplace.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, images);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemImagesByMarketplace {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
