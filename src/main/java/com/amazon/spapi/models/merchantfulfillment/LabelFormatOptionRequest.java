package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Whether to include a packing slip.
 */
@Schema(description = "Whether to include a packing slip.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class LabelFormatOptionRequest {
    @SerializedName("IncludePackingSlipWithLabel")
    private Boolean includePackingSlipWithLabel = null;

    public LabelFormatOptionRequest includePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelFormatOptionRequest labelFormatOptionRequest = (LabelFormatOptionRequest) o;
        return Objects.equals(this.includePackingSlipWithLabel, labelFormatOptionRequest.includePackingSlipWithLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includePackingSlipWithLabel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelFormatOptionRequest {\n");
        sb.append("    includePackingSlipWithLabel: ").append(toIndentedString(includePackingSlipWithLabel)).append("\n");
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
