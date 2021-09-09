package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Custom text for shipping labels.
 */
@Schema(description = "Custom text for shipping labels.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class LabelCustomization {
    @SerializedName("CustomTextForLabel")
    private String customTextForLabel = null;
    @SerializedName("StandardIdForLabel")
    private StandardIdForLabel standardIdForLabel = null;

    public LabelCustomization customTextForLabel(String customTextForLabel) {
        this.customTextForLabel = customTextForLabel;
        return this;
    }

    /**
     * Get customTextForLabel
     *
     * @return customTextForLabel
     **/
    @Schema(description = "")
    public String getCustomTextForLabel() {
        return customTextForLabel;
    }

    public void setCustomTextForLabel(String customTextForLabel) {
        this.customTextForLabel = customTextForLabel;
    }

    public LabelCustomization standardIdForLabel(StandardIdForLabel standardIdForLabel) {
        this.standardIdForLabel = standardIdForLabel;
        return this;
    }

    /**
     * Get standardIdForLabel
     *
     * @return standardIdForLabel
     **/
    @Schema(description = "")
    public StandardIdForLabel getStandardIdForLabel() {
        return standardIdForLabel;
    }

    public void setStandardIdForLabel(StandardIdForLabel standardIdForLabel) {
        this.standardIdForLabel = standardIdForLabel;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelCustomization labelCustomization = (LabelCustomization) o;
        return Objects.equals(this.customTextForLabel, labelCustomization.customTextForLabel) &&
                Objects.equals(this.standardIdForLabel, labelCustomization.standardIdForLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customTextForLabel, standardIdForLabel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelCustomization {\n");
        sb.append("    customTextForLabel: ").append(toIndentedString(customTextForLabel)).append("\n");
        sb.append("    standardIdForLabel: ").append(toIndentedString(standardIdForLabel)).append("\n");
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
