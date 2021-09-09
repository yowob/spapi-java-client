package com.amazon.spapi.models.catalogitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Summary details of an Amazon catalog item for the indicated Amazon marketplace.
 */
@Schema(description = "Summary details of an Amazon catalog item for the indicated Amazon marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemSummaryByMarketplace {
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("brandName")
    private String brandName = null;
    @SerializedName("browseNode")
    private String browseNode = null;
    @SerializedName("colorName")
    private String colorName = null;
    @SerializedName("itemName")
    private String itemName = null;
    @SerializedName("manufacturer")
    private String manufacturer = null;
    @SerializedName("modelNumber")
    private String modelNumber = null;
    @SerializedName("sizeName")
    private String sizeName = null;
    @SerializedName("styleName")
    private String styleName = null;

    public ItemSummaryByMarketplace marketplaceId(String marketplaceId) {
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

    public ItemSummaryByMarketplace brandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    /**
     * Name of the brand associated with an Amazon catalog item.
     *
     * @return brandName
     **/
    @Schema(description = "Name of the brand associated with an Amazon catalog item.")
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public ItemSummaryByMarketplace browseNode(String browseNode) {
        this.browseNode = browseNode;
        return this;
    }

    /**
     * Identifier of the browse node associated with an Amazon catalog item.
     *
     * @return browseNode
     **/
    @Schema(description = "Identifier of the browse node associated with an Amazon catalog item.")
    public String getBrowseNode() {
        return browseNode;
    }

    public void setBrowseNode(String browseNode) {
        this.browseNode = browseNode;
    }

    public ItemSummaryByMarketplace colorName(String colorName) {
        this.colorName = colorName;
        return this;
    }

    /**
     * Name of the color associated with an Amazon catalog item.
     *
     * @return colorName
     **/
    @Schema(description = "Name of the color associated with an Amazon catalog item.")
    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public ItemSummaryByMarketplace itemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    /**
     * Name, or title, associated with an Amazon catalog item.
     *
     * @return itemName
     **/
    @Schema(description = "Name, or title, associated with an Amazon catalog item.")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ItemSummaryByMarketplace manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * Name of the manufacturer associated with an Amazon catalog item.
     *
     * @return manufacturer
     **/
    @Schema(description = "Name of the manufacturer associated with an Amazon catalog item.")
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ItemSummaryByMarketplace modelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
        return this;
    }

    /**
     * Model number associated with an Amazon catalog item.
     *
     * @return modelNumber
     **/
    @Schema(description = "Model number associated with an Amazon catalog item.")
    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public ItemSummaryByMarketplace sizeName(String sizeName) {
        this.sizeName = sizeName;
        return this;
    }

    /**
     * Name of the size associated with an Amazon catalog item.
     *
     * @return sizeName
     **/
    @Schema(description = "Name of the size associated with an Amazon catalog item.")
    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public ItemSummaryByMarketplace styleName(String styleName) {
        this.styleName = styleName;
        return this;
    }

    /**
     * Name of the style associated with an Amazon catalog item.
     *
     * @return styleName
     **/
    @Schema(description = "Name of the style associated with an Amazon catalog item.")
    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemSummaryByMarketplace itemSummaryByMarketplace = (ItemSummaryByMarketplace) o;
        return Objects.equals(this.marketplaceId, itemSummaryByMarketplace.marketplaceId) &&
                Objects.equals(this.brandName, itemSummaryByMarketplace.brandName) &&
                Objects.equals(this.browseNode, itemSummaryByMarketplace.browseNode) &&
                Objects.equals(this.colorName, itemSummaryByMarketplace.colorName) &&
                Objects.equals(this.itemName, itemSummaryByMarketplace.itemName) &&
                Objects.equals(this.manufacturer, itemSummaryByMarketplace.manufacturer) &&
                Objects.equals(this.modelNumber, itemSummaryByMarketplace.modelNumber) &&
                Objects.equals(this.sizeName, itemSummaryByMarketplace.sizeName) &&
                Objects.equals(this.styleName, itemSummaryByMarketplace.styleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, brandName, browseNode, colorName, itemName, manufacturer, modelNumber, sizeName, styleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemSummaryByMarketplace {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
        sb.append("    browseNode: ").append(toIndentedString(browseNode)).append("\n");
        sb.append("    colorName: ").append(toIndentedString(colorName)).append("\n");
        sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
        sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
        sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
        sb.append("    sizeName: ").append(toIndentedString(sizeName)).append("\n");
        sb.append("    styleName: ").append(toIndentedString(styleName)).append("\n");
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
