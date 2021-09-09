package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The payload schema for the retrieveShippingLabel operation.
 */
@Schema(description = "The payload schema for the retrieveShippingLabel operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class RetrieveShippingLabelResult {
    @SerializedName("labelStream")
    private String labelStream = null;
    @SerializedName("labelSpecification")
    private LabelSpecification labelSpecification = null;

    public RetrieveShippingLabelResult labelStream(String labelStream) {
        this.labelStream = labelStream;
        return this;
    }

    /**
     * Get labelStream
     *
     * @return labelStream
     **/
    @Schema(required = true, description = "")
    public String getLabelStream() {
        return labelStream;
    }

    public void setLabelStream(String labelStream) {
        this.labelStream = labelStream;
    }

    public RetrieveShippingLabelResult labelSpecification(LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
        return this;
    }

    /**
     * Get labelSpecification
     *
     * @return labelSpecification
     **/
    @Schema(required = true, description = "")
    public LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }

    public void setLabelSpecification(LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetrieveShippingLabelResult retrieveShippingLabelResult = (RetrieveShippingLabelResult) o;
        return Objects.equals(this.labelStream, retrieveShippingLabelResult.labelStream) &&
                Objects.equals(this.labelSpecification, retrieveShippingLabelResult.labelSpecification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelStream, labelSpecification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetrieveShippingLabelResult {\n");
        sb.append("    labelStream: ").append(toIndentedString(labelStream)).append("\n");
        sb.append("    labelSpecification: ").append(toIndentedString(labelSpecification)).append("\n");
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
