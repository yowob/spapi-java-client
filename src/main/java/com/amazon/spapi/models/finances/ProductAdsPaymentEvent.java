package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * A Sponsored Products payment event.
 */
@Schema(description = "A Sponsored Products payment event.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ProductAdsPaymentEvent {
    @SerializedName("postedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("transactionType")
    private String transactionType = null;
    @SerializedName("invoiceId")
    private String invoiceId = null;
    @SerializedName("baseValue")
    private Currency baseValue = null;
    @SerializedName("taxValue")
    private Currency taxValue = null;
    @SerializedName("transactionValue")
    private Currency transactionValue = null;

    public ProductAdsPaymentEvent postedDate(OffsetDateTime postedDate) {
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

    public ProductAdsPaymentEvent transactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Indicates if the transaction is for a charge or a refund.  Possible values:  * charge - Charge  * refund - Refund
     *
     * @return transactionType
     **/
    @Schema(description = "Indicates if the transaction is for a charge or a refund.  Possible values:  * charge - Charge  * refund - Refund")
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public ProductAdsPaymentEvent invoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    /**
     * Identifier for the invoice that the transaction appears in.
     *
     * @return invoiceId
     **/
    @Schema(description = "Identifier for the invoice that the transaction appears in.")
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public ProductAdsPaymentEvent baseValue(Currency baseValue) {
        this.baseValue = baseValue;
        return this;
    }

    /**
     * Get baseValue
     *
     * @return baseValue
     **/
    @Schema(description = "")
    public Currency getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(Currency baseValue) {
        this.baseValue = baseValue;
    }

    public ProductAdsPaymentEvent taxValue(Currency taxValue) {
        this.taxValue = taxValue;
        return this;
    }

    /**
     * Get taxValue
     *
     * @return taxValue
     **/
    @Schema(description = "")
    public Currency getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(Currency taxValue) {
        this.taxValue = taxValue;
    }

    public ProductAdsPaymentEvent transactionValue(Currency transactionValue) {
        this.transactionValue = transactionValue;
        return this;
    }

    /**
     * Get transactionValue
     *
     * @return transactionValue
     **/
    @Schema(description = "")
    public Currency getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(Currency transactionValue) {
        this.transactionValue = transactionValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductAdsPaymentEvent productAdsPaymentEvent = (ProductAdsPaymentEvent) o;
        return Objects.equals(this.postedDate, productAdsPaymentEvent.postedDate) &&
                Objects.equals(this.transactionType, productAdsPaymentEvent.transactionType) &&
                Objects.equals(this.invoiceId, productAdsPaymentEvent.invoiceId) &&
                Objects.equals(this.baseValue, productAdsPaymentEvent.baseValue) &&
                Objects.equals(this.taxValue, productAdsPaymentEvent.taxValue) &&
                Objects.equals(this.transactionValue, productAdsPaymentEvent.transactionValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postedDate, transactionType, invoiceId, baseValue, taxValue, transactionValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductAdsPaymentEvent {\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
        sb.append("    baseValue: ").append(toIndentedString(baseValue)).append("\n");
        sb.append("    taxValue: ").append(toIndentedString(taxValue)).append("\n");
        sb.append("    transactionValue: ").append(toIndentedString(transactionValue)).append("\n");
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
