package com.amazon.spapi.models.catalogitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * An item in the Amazon catalog.
 */
@Schema(description = "An item in the Amazon catalog.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Item {
    @SerializedName("asin")
    private String asin = null;
    @SerializedName("attributes")
    private ItemAttributes attributes = null;
    @SerializedName("identifiers")
    private ItemIdentifiers identifiers = null;
    @SerializedName("images")
    private ItemImages images = null;
    @SerializedName("productTypes")
    private ItemProductTypes productTypes = null;
    @SerializedName("salesRanks")
    private ItemSalesRanks salesRanks = null;
    @SerializedName("summaries")
    private ItemSummaries summaries = null;
    @SerializedName("variations")
    private ItemVariations variations = null;
    @SerializedName("vendorDetails")
    private ItemVendorDetails vendorDetails = null;

    public Item asin(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * Get asin
     *
     * @return asin
     **/
    @Schema(required = true, description = "")
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public Item attributes(ItemAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get attributes
     *
     * @return attributes
     **/
    @Schema(description = "")
    public ItemAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(ItemAttributes attributes) {
        this.attributes = attributes;
    }

    public Item identifiers(ItemIdentifiers identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    /**
     * Get identifiers
     *
     * @return identifiers
     **/
    @Schema(description = "")
    public ItemIdentifiers getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(ItemIdentifiers identifiers) {
        this.identifiers = identifiers;
    }

    public Item images(ItemImages images) {
        this.images = images;
        return this;
    }

    /**
     * Get images
     *
     * @return images
     **/
    @Schema(description = "")
    public ItemImages getImages() {
        return images;
    }

    public void setImages(ItemImages images) {
        this.images = images;
    }

    public Item productTypes(ItemProductTypes productTypes) {
        this.productTypes = productTypes;
        return this;
    }

    /**
     * Get productTypes
     *
     * @return productTypes
     **/
    @Schema(description = "")
    public ItemProductTypes getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(ItemProductTypes productTypes) {
        this.productTypes = productTypes;
    }

    public Item salesRanks(ItemSalesRanks salesRanks) {
        this.salesRanks = salesRanks;
        return this;
    }

    /**
     * Get salesRanks
     *
     * @return salesRanks
     **/
    @Schema(description = "")
    public ItemSalesRanks getSalesRanks() {
        return salesRanks;
    }

    public void setSalesRanks(ItemSalesRanks salesRanks) {
        this.salesRanks = salesRanks;
    }

    public Item summaries(ItemSummaries summaries) {
        this.summaries = summaries;
        return this;
    }

    /**
     * Get summaries
     *
     * @return summaries
     **/
    @Schema(description = "")
    public ItemSummaries getSummaries() {
        return summaries;
    }

    public void setSummaries(ItemSummaries summaries) {
        this.summaries = summaries;
    }

    public Item variations(ItemVariations variations) {
        this.variations = variations;
        return this;
    }

    /**
     * Get variations
     *
     * @return variations
     **/
    @Schema(description = "")
    public ItemVariations getVariations() {
        return variations;
    }

    public void setVariations(ItemVariations variations) {
        this.variations = variations;
    }

    public Item vendorDetails(ItemVendorDetails vendorDetails) {
        this.vendorDetails = vendorDetails;
        return this;
    }

    /**
     * Get vendorDetails
     *
     * @return vendorDetails
     **/
    @Schema(description = "")
    public ItemVendorDetails getVendorDetails() {
        return vendorDetails;
    }

    public void setVendorDetails(ItemVendorDetails vendorDetails) {
        this.vendorDetails = vendorDetails;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(this.asin, item.asin) &&
                Objects.equals(this.attributes, item.attributes) &&
                Objects.equals(this.identifiers, item.identifiers) &&
                Objects.equals(this.images, item.images) &&
                Objects.equals(this.productTypes, item.productTypes) &&
                Objects.equals(this.salesRanks, item.salesRanks) &&
                Objects.equals(this.summaries, item.summaries) &&
                Objects.equals(this.variations, item.variations) &&
                Objects.equals(this.vendorDetails, item.vendorDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asin, attributes, identifiers, images, productTypes, salesRanks, summaries, variations, vendorDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Item {\n");
        sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    productTypes: ").append(toIndentedString(productTypes)).append("\n");
        sb.append("    salesRanks: ").append(toIndentedString(salesRanks)).append("\n");
        sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
        sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
        sb.append("    vendorDetails: ").append(toIndentedString(vendorDetails)).append("\n");
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
