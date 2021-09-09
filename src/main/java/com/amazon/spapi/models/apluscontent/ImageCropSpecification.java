package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The instructions for optionally cropping an image. If no cropping is desired, set the dimensions to the original image size. If the image is cropped and no offset values are provided, then the coordinates of the top left corner of the cropped image, relative to the original image, are defaulted to (0,0).
 */
@Schema(description = "The instructions for optionally cropping an image. If no cropping is desired, set the dimensions to the original image size. If the image is cropped and no offset values are provided, then the coordinates of the top left corner of the cropped image, relative to the original image, are defaulted to (0,0).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ImageCropSpecification {
    @SerializedName("size")
    private ImageDimensions size = null;
    @SerializedName("offset")
    private ImageOffsets offset = null;

    public ImageCropSpecification size(ImageDimensions size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     **/
    @Schema(required = true, description = "")
    public ImageDimensions getSize() {
        return size;
    }

    public void setSize(ImageDimensions size) {
        this.size = size;
    }

    public ImageCropSpecification offset(ImageOffsets offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get offset
     *
     * @return offset
     **/
    @Schema(description = "")
    public ImageOffsets getOffset() {
        return offset;
    }

    public void setOffset(ImageOffsets offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageCropSpecification imageCropSpecification = (ImageCropSpecification) o;
        return Objects.equals(this.size, imageCropSpecification.size) &&
                Objects.equals(this.offset, imageCropSpecification.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageCropSpecification {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
