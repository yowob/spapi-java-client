package com.amazon.spapi.models.shipmentinvoicing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The request schema for the submitInvoice operation.
 */
@Schema(description = "The request schema for the submitInvoice operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SubmitInvoiceRequest {
    @SerializedName("InvoiceContent")
    private byte[] invoiceContent = null;
    @SerializedName("MarketplaceId")
    private String marketplaceId = null;
    @SerializedName("ContentMD5Value")
    private String contentMD5Value = null;

    public SubmitInvoiceRequest invoiceContent(byte[] invoiceContent) {
        this.invoiceContent = invoiceContent;
        return this;
    }

    /**
     * Get invoiceContent
     *
     * @return invoiceContent
     **/
    @Schema(required = true, description = "")
    public byte[] getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(byte[] invoiceContent) {
        this.invoiceContent = invoiceContent;
    }

    public SubmitInvoiceRequest marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * An Amazon marketplace identifier.
     *
     * @return marketplaceId
     **/
    @Schema(description = "An Amazon marketplace identifier.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public SubmitInvoiceRequest contentMD5Value(String contentMD5Value) {
        this.contentMD5Value = contentMD5Value;
        return this;
    }

    /**
     * MD5 sum for validating the invoice data. For more information about calculating this value, see [Working with Content-MD5 Checksums](https://docs.developer.amazonservices.com/en_US/dev_guide/DG_MD5.html).
     *
     * @return contentMD5Value
     **/
    @Schema(required = true, description = "MD5 sum for validating the invoice data. For more information about calculating this value, see [Working with Content-MD5 Checksums](https://docs.developer.amazonservices.com/en_US/dev_guide/DG_MD5.html).")
    public String getContentMD5Value() {
        return contentMD5Value;
    }

    public void setContentMD5Value(String contentMD5Value) {
        this.contentMD5Value = contentMD5Value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubmitInvoiceRequest submitInvoiceRequest = (SubmitInvoiceRequest) o;
        return Objects.equals(this.invoiceContent, submitInvoiceRequest.invoiceContent) &&
                Objects.equals(this.marketplaceId, submitInvoiceRequest.marketplaceId) &&
                Objects.equals(this.contentMD5Value, submitInvoiceRequest.contentMD5Value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceContent, marketplaceId, contentMD5Value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubmitInvoiceRequest {\n");
        sb.append("    invoiceContent: ").append(toIndentedString(invoiceContent)).append("\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    contentMD5Value: ").append(toIndentedString(contentMD5Value)).append("\n");
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
