package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Maps the additional seller input to the definition. The key to the map is the field name.
 */
@Schema(description = "Maps the additional seller input to the definition. The key to the map is the field name.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AdditionalInputs {
    @SerializedName("AdditionalInputFieldName")
    private String additionalInputFieldName = null;
    @SerializedName("SellerInputDefinition")
    private SellerInputDefinition sellerInputDefinition = null;

    public AdditionalInputs additionalInputFieldName(String additionalInputFieldName) {
        this.additionalInputFieldName = additionalInputFieldName;
        return this;
    }

    /**
     * The field name.
     *
     * @return additionalInputFieldName
     **/
    @Schema(description = "The field name.")
    public String getAdditionalInputFieldName() {
        return additionalInputFieldName;
    }

    public void setAdditionalInputFieldName(String additionalInputFieldName) {
        this.additionalInputFieldName = additionalInputFieldName;
    }

    public AdditionalInputs sellerInputDefinition(SellerInputDefinition sellerInputDefinition) {
        this.sellerInputDefinition = sellerInputDefinition;
        return this;
    }

    /**
     * Get sellerInputDefinition
     *
     * @return sellerInputDefinition
     **/
    @Schema(description = "")
    public SellerInputDefinition getSellerInputDefinition() {
        return sellerInputDefinition;
    }

    public void setSellerInputDefinition(SellerInputDefinition sellerInputDefinition) {
        this.sellerInputDefinition = sellerInputDefinition;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdditionalInputs additionalInputs = (AdditionalInputs) o;
        return Objects.equals(this.additionalInputFieldName, additionalInputs.additionalInputFieldName) &&
                Objects.equals(this.sellerInputDefinition, additionalInputs.sellerInputDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInputFieldName, sellerInputDefinition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalInputs {\n");
        sb.append("    additionalInputFieldName: ").append(toIndentedString(additionalInputFieldName)).append("\n");
        sb.append("    sellerInputDefinition: ").append(toIndentedString(sellerInputDefinition)).append("\n");
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
