package com.amazon.spapi.models.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Buyer information
 */
@Schema(description = "Buyer information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class BuyerInfo {
    @SerializedName("BuyerEmail")
    private String buyerEmail = null;
    @SerializedName("BuyerName")
    private String buyerName = null;
    @SerializedName("BuyerCounty")
    private String buyerCounty = null;
    @SerializedName("BuyerTaxInfo")
    private BuyerTaxInfo buyerTaxInfo = null;
    @SerializedName("PurchaseOrderNumber")
    private String purchaseOrderNumber = null;

    public BuyerInfo buyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
        return this;
    }

    /**
     * The anonymized email address of the buyer.
     *
     * @return buyerEmail
     **/
    @Schema(description = "The anonymized email address of the buyer.")
    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public BuyerInfo buyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }

    /**
     * The name of the buyer.
     *
     * @return buyerName
     **/
    @Schema(description = "The name of the buyer.")
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public BuyerInfo buyerCounty(String buyerCounty) {
        this.buyerCounty = buyerCounty;
        return this;
    }

    /**
     * The county of the buyer.
     *
     * @return buyerCounty
     **/
    @Schema(description = "The county of the buyer.")
    public String getBuyerCounty() {
        return buyerCounty;
    }

    public void setBuyerCounty(String buyerCounty) {
        this.buyerCounty = buyerCounty;
    }

    public BuyerInfo buyerTaxInfo(BuyerTaxInfo buyerTaxInfo) {
        this.buyerTaxInfo = buyerTaxInfo;
        return this;
    }

    /**
     * Get buyerTaxInfo
     *
     * @return buyerTaxInfo
     **/
    @Schema(description = "")
    public BuyerTaxInfo getBuyerTaxInfo() {
        return buyerTaxInfo;
    }

    public void setBuyerTaxInfo(BuyerTaxInfo buyerTaxInfo) {
        this.buyerTaxInfo = buyerTaxInfo;
    }

    public BuyerInfo purchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    /**
     * The purchase order (PO) number entered by the buyer at checkout. Returned only for orders where the buyer entered a PO number at checkout.
     *
     * @return purchaseOrderNumber
     **/
    @Schema(description = "The purchase order (PO) number entered by the buyer at checkout. Returned only for orders where the buyer entered a PO number at checkout.")
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BuyerInfo buyerInfo = (BuyerInfo) o;
        return Objects.equals(this.buyerEmail, buyerInfo.buyerEmail) &&
                Objects.equals(this.buyerName, buyerInfo.buyerName) &&
                Objects.equals(this.buyerCounty, buyerInfo.buyerCounty) &&
                Objects.equals(this.buyerTaxInfo, buyerInfo.buyerTaxInfo) &&
                Objects.equals(this.purchaseOrderNumber, buyerInfo.purchaseOrderNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buyerEmail, buyerName, buyerCounty, buyerTaxInfo, purchaseOrderNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuyerInfo {\n");
        sb.append("    buyerEmail: ").append(toIndentedString(buyerEmail)).append("\n");
        sb.append("    buyerName: ").append(toIndentedString(buyerName)).append("\n");
        sb.append("    buyerCounty: ").append(toIndentedString(buyerCounty)).append("\n");
        sb.append("    buyerTaxInfo: ").append(toIndentedString(buyerTaxInfo)).append("\n");
        sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
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
