package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The label details of the container.
 */
@Schema(description = "The label details of the container.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Label {
    @SerializedName("labelStream")
    private String labelStream = null;
    @SerializedName("labelSpecification")
    private LabelSpecification labelSpecification = null;

    public Label labelStream(String labelStream) {
        this.labelStream = labelStream;
        return this;
    }

    /**
     * Get labelStream
     *
     * @return labelStream
     **/
    @Schema(description = "")
    public String getLabelStream() {
        return labelStream;
    }

    public void setLabelStream(String labelStream) {
        this.labelStream = labelStream;
    }

    public Label labelSpecification(LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
        return this;
    }

    /**
     * Get labelSpecification
     *
     * @return labelSpecification
     **/
    @Schema(description = "")
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
        Label label = (Label) o;
        return Objects.equals(this.labelStream, label.labelStream) &&
                Objects.equals(this.labelSpecification, label.labelSpecification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelStream, labelSpecification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Label {\n");
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
