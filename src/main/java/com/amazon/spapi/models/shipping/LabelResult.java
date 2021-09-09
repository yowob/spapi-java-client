package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Label details including label stream, format, size.
 */
@Schema(description = "Label details including label stream, format, size.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class LabelResult {
    @SerializedName("containerReferenceId")
    private String containerReferenceId = null;
    @SerializedName("trackingId")
    private String trackingId = null;
    @SerializedName("label")
    private Label label = null;

    public LabelResult containerReferenceId(String containerReferenceId) {
        this.containerReferenceId = containerReferenceId;
        return this;
    }

    /**
     * Get containerReferenceId
     *
     * @return containerReferenceId
     **/
    @Schema(description = "")
    public String getContainerReferenceId() {
        return containerReferenceId;
    }

    public void setContainerReferenceId(String containerReferenceId) {
        this.containerReferenceId = containerReferenceId;
    }

    public LabelResult trackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * The tracking identifier assigned to the container.
     *
     * @return trackingId
     **/
    @Schema(description = "The tracking identifier assigned to the container.")
    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public LabelResult label(Label label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     *
     * @return label
     **/
    @Schema(description = "")
    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelResult labelResult = (LabelResult) o;
        return Objects.equals(this.containerReferenceId, labelResult.containerReferenceId) &&
                Objects.equals(this.trackingId, labelResult.trackingId) &&
                Objects.equals(this.label, labelResult.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerReferenceId, trackingId, label);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelResult {\n");
        sb.append("    containerReferenceId: ").append(toIndentedString(containerReferenceId)).append("\n");
        sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
