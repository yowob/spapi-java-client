package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * An item in an adjustment to the seller&#x27;s account.
 */
@Schema(description = "An item in an adjustment to the seller's account.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AdjustmentItem {
    @SerializedName("Quantity")
    private String quantity = null;
    @SerializedName("PerUnitAmount")
    private Currency perUnitAmount = null;
    @SerializedName("TotalAmount")
    private Currency totalAmount = null;
    @SerializedName("SellerSKU")
    private String sellerSKU = null;
    @SerializedName("FnSKU")
    private String fnSKU = null;
    @SerializedName("ProductDescription")
    private String productDescription = null;
    @SerializedName("ASIN")
    private String ASIN = null;

    public AdjustmentItem quantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Represents the number of units in the seller&#x27;s inventory when the AdustmentType is FBAInventoryReimbursement.
     *
     * @return quantity
     **/
    @Schema(description = "Represents the number of units in the seller's inventory when the AdustmentType is FBAInventoryReimbursement.")
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public AdjustmentItem perUnitAmount(Currency perUnitAmount) {
        this.perUnitAmount = perUnitAmount;
        return this;
    }

    /**
     * Get perUnitAmount
     *
     * @return perUnitAmount
     **/
    @Schema(description = "")
    public Currency getPerUnitAmount() {
        return perUnitAmount;
    }

    public void setPerUnitAmount(Currency perUnitAmount) {
        this.perUnitAmount = perUnitAmount;
    }

    public AdjustmentItem totalAmount(Currency totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Get totalAmount
     *
     * @return totalAmount
     **/
    @Schema(description = "")
    public Currency getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Currency totalAmount) {
        this.totalAmount = totalAmount;
    }

    public AdjustmentItem sellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * The seller SKU of the item. The seller SKU is qualified by the seller&#x27;s seller ID, which is included with every call to the Selling Partner API.
     *
     * @return sellerSKU
     **/
    @Schema(description = "The seller SKU of the item. The seller SKU is qualified by the seller's seller ID, which is included with every call to the Selling Partner API.")
    public String getSellerSKU() {
        return sellerSKU;
    }

    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    public AdjustmentItem fnSKU(String fnSKU) {
        this.fnSKU = fnSKU;
        return this;
    }

    /**
     * A unique identifier assigned to products stored in and fulfilled from a fulfillment center.
     *
     * @return fnSKU
     **/
    @Schema(description = "A unique identifier assigned to products stored in and fulfilled from a fulfillment center.")
    public String getFnSKU() {
        return fnSKU;
    }

    public void setFnSKU(String fnSKU) {
        this.fnSKU = fnSKU;
    }

    public AdjustmentItem productDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * A short description of the item.
     *
     * @return productDescription
     **/
    @Schema(description = "A short description of the item.")
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public AdjustmentItem ASIN(String ASIN) {
        this.ASIN = ASIN;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item.
     *
     * @return ASIN
     **/
    @Schema(description = "The Amazon Standard Identification Number (ASIN) of the item.")
    public String getASIN() {
        return ASIN;
    }

    public void setASIN(String ASIN) {
        this.ASIN = ASIN;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdjustmentItem adjustmentItem = (AdjustmentItem) o;
        return Objects.equals(this.quantity, adjustmentItem.quantity) &&
                Objects.equals(this.perUnitAmount, adjustmentItem.perUnitAmount) &&
                Objects.equals(this.totalAmount, adjustmentItem.totalAmount) &&
                Objects.equals(this.sellerSKU, adjustmentItem.sellerSKU) &&
                Objects.equals(this.fnSKU, adjustmentItem.fnSKU) &&
                Objects.equals(this.productDescription, adjustmentItem.productDescription) &&
                Objects.equals(this.ASIN, adjustmentItem.ASIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, perUnitAmount, totalAmount, sellerSKU, fnSKU, productDescription, ASIN);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdjustmentItem {\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    perUnitAmount: ").append(toIndentedString(perUnitAmount)).append("\n");
        sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
        sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
        sb.append("    fnSKU: ").append(toIndentedString(fnSKU)).append("\n");
        sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
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
