package com.amazon.spapi.models.catalogitems;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * Vendor details associated with an Amazon catalog item for the indicated Amazon marketplace.
 */
@Schema(description = "Vendor details associated with an Amazon catalog item for the indicated Amazon marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemVendorDetailsByMarketplace {
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("brandCode")
    private String brandCode = null;
    @SerializedName("categoryCode")
    private String categoryCode = null;
    @SerializedName("manufacturerCode")
    private String manufacturerCode = null;
    @SerializedName("manufacturerCodeParent")
    private String manufacturerCodeParent = null;
    @SerializedName("productGroup")
    private String productGroup = null;
    @SerializedName("replenishmentCategory")
    private ReplenishmentCategoryEnum replenishmentCategory = null;
    @SerializedName("subcategoryCode")
    private String subcategoryCode = null;

    public ItemVendorDetailsByMarketplace marketplaceId(String marketplaceId) {
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

    public ItemVendorDetailsByMarketplace brandCode(String brandCode) {
        this.brandCode = brandCode;
        return this;
    }

    /**
     * Brand code associated with an Amazon catalog item.
     *
     * @return brandCode
     **/
    @Schema(description = "Brand code associated with an Amazon catalog item.")
    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public ItemVendorDetailsByMarketplace categoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * Product category associated with an Amazon catalog item.
     *
     * @return categoryCode
     **/
    @Schema(description = "Product category associated with an Amazon catalog item.")
    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public ItemVendorDetailsByMarketplace manufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
        return this;
    }

    /**
     * Manufacturer code associated with an Amazon catalog item.
     *
     * @return manufacturerCode
     **/
    @Schema(description = "Manufacturer code associated with an Amazon catalog item.")
    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public ItemVendorDetailsByMarketplace manufacturerCodeParent(String manufacturerCodeParent) {
        this.manufacturerCodeParent = manufacturerCodeParent;
        return this;
    }

    /**
     * Parent vendor code of the manufacturer code.
     *
     * @return manufacturerCodeParent
     **/
    @Schema(description = "Parent vendor code of the manufacturer code.")
    public String getManufacturerCodeParent() {
        return manufacturerCodeParent;
    }

    public void setManufacturerCodeParent(String manufacturerCodeParent) {
        this.manufacturerCodeParent = manufacturerCodeParent;
    }

    public ItemVendorDetailsByMarketplace productGroup(String productGroup) {
        this.productGroup = productGroup;
        return this;
    }

    /**
     * Product group associated with an Amazon catalog item.
     *
     * @return productGroup
     **/
    @Schema(description = "Product group associated with an Amazon catalog item.")
    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public ItemVendorDetailsByMarketplace replenishmentCategory(ReplenishmentCategoryEnum replenishmentCategory) {
        this.replenishmentCategory = replenishmentCategory;
        return this;
    }

    /**
     * Replenishment category associated with an Amazon catalog item.
     *
     * @return replenishmentCategory
     **/
    @Schema(description = "Replenishment category associated with an Amazon catalog item.")
    public ReplenishmentCategoryEnum getReplenishmentCategory() {
        return replenishmentCategory;
    }

    public void setReplenishmentCategory(ReplenishmentCategoryEnum replenishmentCategory) {
        this.replenishmentCategory = replenishmentCategory;
    }

    public ItemVendorDetailsByMarketplace subcategoryCode(String subcategoryCode) {
        this.subcategoryCode = subcategoryCode;
        return this;
    }

    /**
     * Product subcategory associated with an Amazon catalog item.
     *
     * @return subcategoryCode
     **/
    @Schema(description = "Product subcategory associated with an Amazon catalog item.")
    public String getSubcategoryCode() {
        return subcategoryCode;
    }

    public void setSubcategoryCode(String subcategoryCode) {
        this.subcategoryCode = subcategoryCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemVendorDetailsByMarketplace itemVendorDetailsByMarketplace = (ItemVendorDetailsByMarketplace) o;
        return Objects.equals(this.marketplaceId, itemVendorDetailsByMarketplace.marketplaceId) &&
                Objects.equals(this.brandCode, itemVendorDetailsByMarketplace.brandCode) &&
                Objects.equals(this.categoryCode, itemVendorDetailsByMarketplace.categoryCode) &&
                Objects.equals(this.manufacturerCode, itemVendorDetailsByMarketplace.manufacturerCode) &&
                Objects.equals(this.manufacturerCodeParent, itemVendorDetailsByMarketplace.manufacturerCodeParent) &&
                Objects.equals(this.productGroup, itemVendorDetailsByMarketplace.productGroup) &&
                Objects.equals(this.replenishmentCategory, itemVendorDetailsByMarketplace.replenishmentCategory) &&
                Objects.equals(this.subcategoryCode, itemVendorDetailsByMarketplace.subcategoryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, brandCode, categoryCode, manufacturerCode, manufacturerCodeParent, productGroup, replenishmentCategory, subcategoryCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemVendorDetailsByMarketplace {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    brandCode: ").append(toIndentedString(brandCode)).append("\n");
        sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
        sb.append("    manufacturerCode: ").append(toIndentedString(manufacturerCode)).append("\n");
        sb.append("    manufacturerCodeParent: ").append(toIndentedString(manufacturerCodeParent)).append("\n");
        sb.append("    productGroup: ").append(toIndentedString(productGroup)).append("\n");
        sb.append("    replenishmentCategory: ").append(toIndentedString(replenishmentCategory)).append("\n");
        sb.append("    subcategoryCode: ").append(toIndentedString(subcategoryCode)).append("\n");
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

    /**
     * Replenishment category associated with an Amazon catalog item.
     */
    @JsonAdapter(ReplenishmentCategoryEnum.Adapter.class)
    public enum ReplenishmentCategoryEnum {
        ALLOCATED("ALLOCATED"),
        BASIC_REPLENISHMENT("BASIC_REPLENISHMENT"),
        IN_SEASON("IN_SEASON"),
        LIMITED_REPLENISHMENT("LIMITED_REPLENISHMENT"),
        MANUFACTURER_OUT_OF_STOCK("MANUFACTURER_OUT_OF_STOCK"),
        NEW_PRODUCT("NEW_PRODUCT"),
        NON_REPLENISHABLE("NON_REPLENISHABLE"),
        NON_STOCKUPABLE("NON_STOCKUPABLE"),
        OBSOLETE("OBSOLETE"),
        PLANNED_REPLENISHMENT("PLANNED_REPLENISHMENT");
        private String value;

        ReplenishmentCategoryEnum(String value) {
            this.value = value;
        }

        public static ReplenishmentCategoryEnum fromValue(String text) {
            for (ReplenishmentCategoryEnum b : ReplenishmentCategoryEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<ReplenishmentCategoryEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ReplenishmentCategoryEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ReplenishmentCategoryEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ReplenishmentCategoryEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
