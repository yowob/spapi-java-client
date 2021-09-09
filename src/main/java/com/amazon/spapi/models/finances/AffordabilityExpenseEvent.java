package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * An expense related to an affordability promotion.
 */
@Schema(description = "An expense related to an affordability promotion.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AffordabilityExpenseEvent {
    @SerializedName("AmazonOrderId")
    private String amazonOrderId = null;
    @SerializedName("PostedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("MarketplaceId")
    private String marketplaceId = null;
    @SerializedName("TransactionType")
    private String transactionType = null;
    @SerializedName("BaseExpense")
    private Currency baseExpense = null;
    @SerializedName("TaxTypeCGST")
    private Currency taxTypeCGST = null;
    @SerializedName("TaxTypeSGST")
    private Currency taxTypeSGST = null;
    @SerializedName("TaxTypeIGST")
    private Currency taxTypeIGST = null;
    @SerializedName("TotalExpense")
    private Currency totalExpense = null;

    public AffordabilityExpenseEvent amazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * An Amazon-defined identifier for an order.
     *
     * @return amazonOrderId
     **/
    @Schema(description = "An Amazon-defined identifier for an order.")
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    public AffordabilityExpenseEvent postedDate(OffsetDateTime postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get postedDate
     *
     * @return postedDate
     **/
    @Schema(description = "")
    public OffsetDateTime getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(OffsetDateTime postedDate) {
        this.postedDate = postedDate;
    }

    public AffordabilityExpenseEvent marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * An encrypted, Amazon-defined marketplace identifier.
     *
     * @return marketplaceId
     **/
    @Schema(description = "An encrypted, Amazon-defined marketplace identifier.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public AffordabilityExpenseEvent transactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Indicates the type of transaction.   Possible values:  * Charge - For an affordability promotion expense.  * Refund - For an affordability promotion expense reversal.
     *
     * @return transactionType
     **/
    @Schema(description = "Indicates the type of transaction.   Possible values:  * Charge - For an affordability promotion expense.  * Refund - For an affordability promotion expense reversal.")
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public AffordabilityExpenseEvent baseExpense(Currency baseExpense) {
        this.baseExpense = baseExpense;
        return this;
    }

    /**
     * Get baseExpense
     *
     * @return baseExpense
     **/
    @Schema(description = "")
    public Currency getBaseExpense() {
        return baseExpense;
    }

    public void setBaseExpense(Currency baseExpense) {
        this.baseExpense = baseExpense;
    }

    public AffordabilityExpenseEvent taxTypeCGST(Currency taxTypeCGST) {
        this.taxTypeCGST = taxTypeCGST;
        return this;
    }

    /**
     * Get taxTypeCGST
     *
     * @return taxTypeCGST
     **/
    @Schema(required = true, description = "")
    public Currency getTaxTypeCGST() {
        return taxTypeCGST;
    }

    public void setTaxTypeCGST(Currency taxTypeCGST) {
        this.taxTypeCGST = taxTypeCGST;
    }

    public AffordabilityExpenseEvent taxTypeSGST(Currency taxTypeSGST) {
        this.taxTypeSGST = taxTypeSGST;
        return this;
    }

    /**
     * Get taxTypeSGST
     *
     * @return taxTypeSGST
     **/
    @Schema(required = true, description = "")
    public Currency getTaxTypeSGST() {
        return taxTypeSGST;
    }

    public void setTaxTypeSGST(Currency taxTypeSGST) {
        this.taxTypeSGST = taxTypeSGST;
    }

    public AffordabilityExpenseEvent taxTypeIGST(Currency taxTypeIGST) {
        this.taxTypeIGST = taxTypeIGST;
        return this;
    }

    /**
     * Get taxTypeIGST
     *
     * @return taxTypeIGST
     **/
    @Schema(required = true, description = "")
    public Currency getTaxTypeIGST() {
        return taxTypeIGST;
    }

    public void setTaxTypeIGST(Currency taxTypeIGST) {
        this.taxTypeIGST = taxTypeIGST;
    }

    public AffordabilityExpenseEvent totalExpense(Currency totalExpense) {
        this.totalExpense = totalExpense;
        return this;
    }

    /**
     * Get totalExpense
     *
     * @return totalExpense
     **/
    @Schema(description = "")
    public Currency getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(Currency totalExpense) {
        this.totalExpense = totalExpense;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AffordabilityExpenseEvent affordabilityExpenseEvent = (AffordabilityExpenseEvent) o;
        return Objects.equals(this.amazonOrderId, affordabilityExpenseEvent.amazonOrderId) &&
                Objects.equals(this.postedDate, affordabilityExpenseEvent.postedDate) &&
                Objects.equals(this.marketplaceId, affordabilityExpenseEvent.marketplaceId) &&
                Objects.equals(this.transactionType, affordabilityExpenseEvent.transactionType) &&
                Objects.equals(this.baseExpense, affordabilityExpenseEvent.baseExpense) &&
                Objects.equals(this.taxTypeCGST, affordabilityExpenseEvent.taxTypeCGST) &&
                Objects.equals(this.taxTypeSGST, affordabilityExpenseEvent.taxTypeSGST) &&
                Objects.equals(this.taxTypeIGST, affordabilityExpenseEvent.taxTypeIGST) &&
                Objects.equals(this.totalExpense, affordabilityExpenseEvent.totalExpense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amazonOrderId, postedDate, marketplaceId, transactionType, baseExpense, taxTypeCGST, taxTypeSGST, taxTypeIGST, totalExpense);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AffordabilityExpenseEvent {\n");
        sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    baseExpense: ").append(toIndentedString(baseExpense)).append("\n");
        sb.append("    taxTypeCGST: ").append(toIndentedString(taxTypeCGST)).append("\n");
        sb.append("    taxTypeSGST: ").append(toIndentedString(taxTypeSGST)).append("\n");
        sb.append("    taxTypeIGST: ").append(toIndentedString(taxTypeIGST)).append("\n");
        sb.append("    totalExpense: ").append(toIndentedString(totalExpense)).append("\n");
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
