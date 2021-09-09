package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The dimensions extending from the top left corner of the cropped image, or the top left corner of the original image if there is no cropping. Only &#x60;pixels&#x60; is allowed as the units value for ImageDimensions.
 */
@Schema(description = "The dimensions extending from the top left corner of the cropped image, or the top left corner of the original image if there is no cropping. Only `pixels` is allowed as the units value for ImageDimensions.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ImageDimensions {
    @SerializedName("width")
    private IntegerWithUnits width = null;
    @SerializedName("height")
    private IntegerWithUnits height = null;

    public ImageDimensions width(IntegerWithUnits width) {
        this.width = width;
        return this;
    }

    /**
     * Get width
     *
     * @return width
     **/
    @Schema(required = true, description = "")
    public IntegerWithUnits getWidth() {
        return width;
    }

    public void setWidth(IntegerWithUnits width) {
        this.width = width;
    }

    public ImageDimensions height(IntegerWithUnits height) {
        this.height = height;
        return this;
    }

    /**
     * Get height
     *
     * @return height
     **/
    @Schema(required = true, description = "")
    public IntegerWithUnits getHeight() {
        return height;
    }

    public void setHeight(IntegerWithUnits height) {
        this.height = height;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageDimensions imageDimensions = (ImageDimensions) o;
        return Objects.equals(this.width, imageDimensions.width) &&
                Objects.equals(this.height, imageDimensions.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDimensions {\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
