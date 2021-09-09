package com.amazon.spapi.models.fbainventory;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Inventory summary for a specific item.
 */
@Schema(description = "Inventory summary for a specific item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class InventorySummary {
    @SerializedName("asin")
    private String asin = null;
    @SerializedName("fnSku")
    private String fnSku = null;
    @SerializedName("sellerSku")
    private String sellerSku = null;
    @SerializedName("condition")
    private String condition = null;
    @SerializedName("inventoryDetails")
    private InventoryDetails inventoryDetails = null;
    @SerializedName("lastUpdatedTime")
    private OffsetDateTime lastUpdatedTime = null;
    @SerializedName("productName")
    private String productName = null;
    @SerializedName("totalQuantity")
    private Integer totalQuantity = null;

    public InventorySummary asin(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of an item.
     *
     * @return asin
     **/
    @Schema(description = "The Amazon Standard Identification Number (ASIN) of an item.")
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public InventorySummary fnSku(String fnSku) {
        this.fnSku = fnSku;
        return this;
    }

    /**
     * Amazon&#x27;s fulfillment network SKU identifier.
     *
     * @return fnSku
     **/
    @Schema(description = "Amazon's fulfillment network SKU identifier.")
    public String getFnSku() {
        return fnSku;
    }

    public void setFnSku(String fnSku) {
        this.fnSku = fnSku;
    }

    public InventorySummary sellerSku(String sellerSku) {
        this.sellerSku = sellerSku;
        return this;
    }

    /**
     * The seller SKU of the item.
     *
     * @return sellerSku
     **/
    @Schema(description = "The seller SKU of the item.")
    public String getSellerSku() {
        return sellerSku;
    }

    public void setSellerSku(String sellerSku) {
        this.sellerSku = sellerSku;
    }

    public InventorySummary condition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * The condition of the item as described by the seller (for example, New Item).
     *
     * @return condition
     **/
    @Schema(description = "The condition of the item as described by the seller (for example, New Item).")
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public InventorySummary inventoryDetails(InventoryDetails inventoryDetails) {
        this.inventoryDetails = inventoryDetails;
        return this;
    }

    /**
     * Get inventoryDetails
     *
     * @return inventoryDetails
     **/
    @Schema(description = "")
    public InventoryDetails getInventoryDetails() {
        return inventoryDetails;
    }

    public void setInventoryDetails(InventoryDetails inventoryDetails) {
        this.inventoryDetails = inventoryDetails;
    }

    public InventorySummary lastUpdatedTime(OffsetDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * The date and time that any quantity was last updated.
     *
     * @return lastUpdatedTime
     **/
    @Schema(description = "The date and time that any quantity was last updated.")
    public OffsetDateTime getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public InventorySummary productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * The localized language product title of the item within the specific marketplace.
     *
     * @return productName
     **/
    @Schema(description = "The localized language product title of the item within the specific marketplace.")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public InventorySummary totalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
        return this;
    }

    /**
     * The total number of units in an inbound shipment or in Amazon fulfillment centers.
     *
     * @return totalQuantity
     **/
    @Schema(description = "The total number of units in an inbound shipment or in Amazon fulfillment centers.")
    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InventorySummary inventorySummary = (InventorySummary) o;
        return Objects.equals(this.asin, inventorySummary.asin) &&
                Objects.equals(this.fnSku, inventorySummary.fnSku) &&
                Objects.equals(this.sellerSku, inventorySummary.sellerSku) &&
                Objects.equals(this.condition, inventorySummary.condition) &&
                Objects.equals(this.inventoryDetails, inventorySummary.inventoryDetails) &&
                Objects.equals(this.lastUpdatedTime, inventorySummary.lastUpdatedTime) &&
                Objects.equals(this.productName, inventorySummary.productName) &&
                Objects.equals(this.totalQuantity, inventorySummary.totalQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asin, fnSku, sellerSku, condition, inventoryDetails, lastUpdatedTime, productName, totalQuantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InventorySummary {\n");
        sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
        sb.append("    fnSku: ").append(toIndentedString(fnSku)).append("\n");
        sb.append("    sellerSku: ").append(toIndentedString(sellerSku)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    inventoryDetails: ").append(toIndentedString(inventoryDetails)).append("\n");
        sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    totalQuantity: ").append(toIndentedString(totalQuantity)).append("\n");
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
