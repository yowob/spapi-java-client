package com.amazon.spapi.models.shipmentinvoicing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Tax information about the buyer.
 */
@Schema(description = "Tax information about the buyer.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class BuyerTaxInfo {
    @SerializedName("CompanyLegalName")
    private String companyLegalName = null;
    @SerializedName("TaxingRegion")
    private String taxingRegion = null;
    @SerializedName("TaxClassifications")
    private TaxClassificationList taxClassifications = null;

    public BuyerTaxInfo companyLegalName(String companyLegalName) {
        this.companyLegalName = companyLegalName;
        return this;
    }

    /**
     * The legal name of the company.
     *
     * @return companyLegalName
     **/
    @Schema(description = "The legal name of the company.")
    public String getCompanyLegalName() {
        return companyLegalName;
    }

    public void setCompanyLegalName(String companyLegalName) {
        this.companyLegalName = companyLegalName;
    }

    public BuyerTaxInfo taxingRegion(String taxingRegion) {
        this.taxingRegion = taxingRegion;
        return this;
    }

    /**
     * The country or region imposing the tax.
     *
     * @return taxingRegion
     **/
    @Schema(description = "The country or region imposing the tax.")
    public String getTaxingRegion() {
        return taxingRegion;
    }

    public void setTaxingRegion(String taxingRegion) {
        this.taxingRegion = taxingRegion;
    }

    public BuyerTaxInfo taxClassifications(TaxClassificationList taxClassifications) {
        this.taxClassifications = taxClassifications;
        return this;
    }

    /**
     * Get taxClassifications
     *
     * @return taxClassifications
     **/
    @Schema(description = "")
    public TaxClassificationList getTaxClassifications() {
        return taxClassifications;
    }

    public void setTaxClassifications(TaxClassificationList taxClassifications) {
        this.taxClassifications = taxClassifications;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BuyerTaxInfo buyerTaxInfo = (BuyerTaxInfo) o;
        return Objects.equals(this.companyLegalName, buyerTaxInfo.companyLegalName) &&
                Objects.equals(this.taxingRegion, buyerTaxInfo.taxingRegion) &&
                Objects.equals(this.taxClassifications, buyerTaxInfo.taxClassifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyLegalName, taxingRegion, taxClassifications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuyerTaxInfo {\n");
        sb.append("    companyLegalName: ").append(toIndentedString(companyLegalName)).append("\n");
        sb.append("    taxingRegion: ").append(toIndentedString(taxingRegion)).append("\n");
        sb.append("    taxClassifications: ").append(toIndentedString(taxClassifications)).append("\n");
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
