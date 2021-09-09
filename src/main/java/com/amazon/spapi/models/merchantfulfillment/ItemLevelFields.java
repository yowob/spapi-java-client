package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ItemLevelFields
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemLevelFields {
    @SerializedName("Asin")
    private String asin = null;
    @SerializedName("AdditionalInputs")
    private AdditionalInputsList additionalInputs = null;

    public ItemLevelFields asin(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item.
     *
     * @return asin
     **/
    @Schema(required = true, description = "The Amazon Standard Identification Number (ASIN) of the item.")
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public ItemLevelFields additionalInputs(AdditionalInputsList additionalInputs) {
        this.additionalInputs = additionalInputs;
        return this;
    }

    /**
     * Get additionalInputs
     *
     * @return additionalInputs
     **/
    @Schema(required = true, description = "")
    public AdditionalInputsList getAdditionalInputs() {
        return additionalInputs;
    }

    public void setAdditionalInputs(AdditionalInputsList additionalInputs) {
        this.additionalInputs = additionalInputs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemLevelFields itemLevelFields = (ItemLevelFields) o;
        return Objects.equals(this.asin, itemLevelFields.asin) &&
                Objects.equals(this.additionalInputs, itemLevelFields.additionalInputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asin, additionalInputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemLevelFields {\n");
        sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
        sb.append("    additionalInputs: ").append(toIndentedString(additionalInputs)).append("\n");
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
