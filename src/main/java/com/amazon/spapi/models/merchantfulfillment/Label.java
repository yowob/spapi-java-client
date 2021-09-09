package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Data for creating a shipping label and dimensions for printing the label.
 */
@Schema(description = "Data for creating a shipping label and dimensions for printing the label.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Label {
    @SerializedName("CustomTextForLabel")
    private String customTextForLabel = null;
    @SerializedName("Dimensions")
    private LabelDimensions dimensions = null;
    @SerializedName("FileContents")
    private FileContents fileContents = null;
    @SerializedName("LabelFormat")
    private LabelFormat labelFormat = null;
    @SerializedName("StandardIdForLabel")
    private StandardIdForLabel standardIdForLabel = null;

    public Label customTextForLabel(String customTextForLabel) {
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

    public Label dimensions(LabelDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get dimensions
     *
     * @return dimensions
     **/
    @Schema(required = true, description = "")
    public LabelDimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(LabelDimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Label fileContents(FileContents fileContents) {
        this.fileContents = fileContents;
        return this;
    }

    /**
     * Get fileContents
     *
     * @return fileContents
     **/
    @Schema(required = true, description = "")
    public FileContents getFileContents() {
        return fileContents;
    }

    public void setFileContents(FileContents fileContents) {
        this.fileContents = fileContents;
    }

    public Label labelFormat(LabelFormat labelFormat) {
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

    public Label standardIdForLabel(StandardIdForLabel standardIdForLabel) {
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
        Label label = (Label) o;
        return Objects.equals(this.customTextForLabel, label.customTextForLabel) &&
                Objects.equals(this.dimensions, label.dimensions) &&
                Objects.equals(this.fileContents, label.fileContents) &&
                Objects.equals(this.labelFormat, label.labelFormat) &&
                Objects.equals(this.standardIdForLabel, label.standardIdForLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customTextForLabel, dimensions, fileContents, labelFormat, standardIdForLabel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Label {\n");
        sb.append("    customTextForLabel: ").append(toIndentedString(customTextForLabel)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    fileContents: ").append(toIndentedString(fileContents)).append("\n");
        sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
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
