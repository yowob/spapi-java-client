package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The label format details and whether to include a packing slip.
 */
@Schema(description = "The label format details and whether to include a packing slip.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class LabelFormatOption {
    @SerializedName("IncludePackingSlipWithLabel")
    private Boolean includePackingSlipWithLabel = null;
    @SerializedName("LabelFormat")
    private LabelFormat labelFormat = null;

    public LabelFormatOption includePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
        this.includePackingSlipWithLabel = includePackingSlipWithLabel;
        return this;
    }

    /**
     * When true, include a packing slip with the label.
     *
     * @return includePackingSlipWithLabel
     **/
    @Schema(description = "When true, include a packing slip with the label.")
    public Boolean isIncludePackingSlipWithLabel() {
        return includePackingSlipWithLabel;
    }

    public void setIncludePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
        this.includePackingSlipWithLabel = includePackingSlipWithLabel;
    }

    public LabelFormatOption labelFormat(LabelFormat labelFormat) {
        this.labelFormat = labelFormat;
        return this;
    }

    /**
     * Get labelFormat
     *
     * @return labelFormat
     **/
    @Schema(description = "")
    public LabelFormat getLabelFormat() {
        return labelFormat;
    }

    public void setLabelFormat(LabelFormat labelFormat) {
        this.labelFormat = labelFormat;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelFormatOption labelFormatOption = (LabelFormatOption) o;
        return Objects.equals(this.includePackingSlipWithLabel, labelFormatOption.includePackingSlipWithLabel) &&
                Objects.equals(this.labelFormat, labelFormatOption.labelFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includePackingSlipWithLabel, labelFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelFormatOption {\n");
        sb.append("    includePackingSlipWithLabel: ").append(toIndentedString(includePackingSlipWithLabel)).append("\n");
        sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
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
