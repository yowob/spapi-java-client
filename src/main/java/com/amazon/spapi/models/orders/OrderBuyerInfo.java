package com.amazon.spapi.models.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Buyer information for an order.
 */
@Schema(description = "Buyer information for an order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class OrderBuyerInfo {
    @SerializedName("AmazonOrderId")
    private String amazonOrderId = null;
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

    public OrderBuyerInfo amazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * An Amazon-defined order identifier, in 3-7-7 format.
     *
     * @return amazonOrderId
     **/
    @Schema(required = true, description = "An Amazon-defined order identifier, in 3-7-7 format.")
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    public OrderBuyerInfo buyerEmail(String buyerEmail) {
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

    public OrderBuyerInfo buyerName(String buyerName) {
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

    public OrderBuyerInfo buyerCounty(String buyerCounty) {
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

    public OrderBuyerInfo buyerTaxInfo(BuyerTaxInfo buyerTaxInfo) {
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

    public OrderBuyerInfo purchaseOrderNumber(String purchaseOrderNumber) {
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
        OrderBuyerInfo orderBuyerInfo = (OrderBuyerInfo) o;
        return Objects.equals(this.amazonOrderId, orderBuyerInfo.amazonOrderId) &&
                Objects.equals(this.buyerEmail, orderBuyerInfo.buyerEmail) &&
                Objects.equals(this.buyerName, orderBuyerInfo.buyerName) &&
                Objects.equals(this.buyerCounty, orderBuyerInfo.buyerCounty) &&
                Objects.equals(this.buyerTaxInfo, orderBuyerInfo.buyerTaxInfo) &&
                Objects.equals(this.purchaseOrderNumber, orderBuyerInfo.purchaseOrderNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amazonOrderId, buyerEmail, buyerName, buyerCounty, buyerTaxInfo, purchaseOrderNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderBuyerInfo {\n");
        sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
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
