package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * An item from a SAFE-T claim reimbursement.
 */
@Schema(description = "An item from a SAFE-T claim reimbursement.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SAFETReimbursementItem {
    @SerializedName("itemChargeList")
    private ChargeComponentList itemChargeList = null;
    @SerializedName("productDescription")
    private String productDescription = null;
    @SerializedName("quantity")
    private String quantity = null;

    public SAFETReimbursementItem itemChargeList(ChargeComponentList itemChargeList) {
        this.itemChargeList = itemChargeList;
        return this;
    }

    /**
     * Get itemChargeList
     *
     * @return itemChargeList
     **/
    @Schema(description = "")
    public ChargeComponentList getItemChargeList() {
        return itemChargeList;
    }

    public void setItemChargeList(ChargeComponentList itemChargeList) {
        this.itemChargeList = itemChargeList;
    }

    public SAFETReimbursementItem productDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * The description of the item as shown on the product detail page on the retail website.
     *
     * @return productDescription
     **/
    @Schema(description = "The description of the item as shown on the product detail page on the retail website.")
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public SAFETReimbursementItem quantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The number of units of the item being reimbursed.
     *
     * @return quantity
     **/
    @Schema(description = "The number of units of the item being reimbursed.")
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SAFETReimbursementItem saFETReimbursementItem = (SAFETReimbursementItem) o;
        return Objects.equals(this.itemChargeList, saFETReimbursementItem.itemChargeList) &&
                Objects.equals(this.productDescription, saFETReimbursementItem.productDescription) &&
                Objects.equals(this.quantity, saFETReimbursementItem.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemChargeList, productDescription, quantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SAFETReimbursementItem {\n");
        sb.append("    itemChargeList: ").append(toIndentedString(itemChargeList)).append("\n");
        sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
