package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information about the taxes withheld.
 */
@Schema(description = "Information about the taxes withheld.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TaxWithheldComponent {
    @SerializedName("TaxCollectionModel")
    private String taxCollectionModel = null;
    @SerializedName("TaxesWithheld")
    private ChargeComponentList taxesWithheld = null;

    public TaxWithheldComponent taxCollectionModel(String taxCollectionModel) {
        this.taxCollectionModel = taxCollectionModel;
        return this;
    }

    /**
     * The tax collection model applied to the item.  Possible values:  * MarketplaceFacilitator - Tax is withheld and remitted to the taxing authority by Amazon on behalf of the seller.  * Standard - Tax is paid to the seller and not remitted to the taxing authority by Amazon.
     *
     * @return taxCollectionModel
     **/
    @Schema(description = "The tax collection model applied to the item.  Possible values:  * MarketplaceFacilitator - Tax is withheld and remitted to the taxing authority by Amazon on behalf of the seller.  * Standard - Tax is paid to the seller and not remitted to the taxing authority by Amazon.")
    public String getTaxCollectionModel() {
        return taxCollectionModel;
    }

    public void setTaxCollectionModel(String taxCollectionModel) {
        this.taxCollectionModel = taxCollectionModel;
    }

    public TaxWithheldComponent taxesWithheld(ChargeComponentList taxesWithheld) {
        this.taxesWithheld = taxesWithheld;
        return this;
    }

    /**
     * Get taxesWithheld
     *
     * @return taxesWithheld
     **/
    @Schema(description = "")
    public ChargeComponentList getTaxesWithheld() {
        return taxesWithheld;
    }

    public void setTaxesWithheld(ChargeComponentList taxesWithheld) {
        this.taxesWithheld = taxesWithheld;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaxWithheldComponent taxWithheldComponent = (TaxWithheldComponent) o;
        return Objects.equals(this.taxCollectionModel, taxWithheldComponent.taxCollectionModel) &&
                Objects.equals(this.taxesWithheld, taxWithheldComponent.taxesWithheld);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxCollectionModel, taxesWithheld);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaxWithheldComponent {\n");
        sb.append("    taxCollectionModel: ").append(toIndentedString(taxCollectionModel)).append("\n");
        sb.append("    taxesWithheld: ").append(toIndentedString(taxesWithheld)).append("\n");
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
