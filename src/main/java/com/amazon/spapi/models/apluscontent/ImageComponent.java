package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A reference to an image, hosted in the A+ Content media library.
 */
@Schema(description = "A reference to an image, hosted in the A+ Content media library.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ImageComponent {
    @SerializedName("uploadDestinationId")
    private String uploadDestinationId = null;
    @SerializedName("imageCropSpecification")
    private ImageCropSpecification imageCropSpecification = null;
    @SerializedName("altText")
    private String altText = null;

    public ImageComponent uploadDestinationId(String uploadDestinationId) {
        this.uploadDestinationId = uploadDestinationId;
        return this;
    }

    /**
     * This identifier is provided by the Selling Partner API for Uploads.
     *
     * @return uploadDestinationId
     **/
    @Schema(required = true, description = "This identifier is provided by the Selling Partner API for Uploads.")
    public String getUploadDestinationId() {
        return uploadDestinationId;
    }

    public void setUploadDestinationId(String uploadDestinationId) {
        this.uploadDestinationId = uploadDestinationId;
    }

    public ImageComponent imageCropSpecification(ImageCropSpecification imageCropSpecification) {
        this.imageCropSpecification = imageCropSpecification;
        return this;
    }

    /**
     * Get imageCropSpecification
     *
     * @return imageCropSpecification
     **/
    @Schema(required = true, description = "")
    public ImageCropSpecification getImageCropSpecification() {
        return imageCropSpecification;
    }

    public void setImageCropSpecification(ImageCropSpecification imageCropSpecification) {
        this.imageCropSpecification = imageCropSpecification;
    }

    public ImageComponent altText(String altText) {
        this.altText = altText;
        return this;
    }

    /**
     * The alternative text for the image.
     *
     * @return altText
     **/
    @Schema(required = true, description = "The alternative text for the image.")
    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageComponent imageComponent = (ImageComponent) o;
        return Objects.equals(this.uploadDestinationId, imageComponent.uploadDestinationId) &&
                Objects.equals(this.imageCropSpecification, imageComponent.imageCropSpecification) &&
                Objects.equals(this.altText, imageComponent.altText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadDestinationId, imageCropSpecification, altText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageComponent {\n");
        sb.append("    uploadDestinationId: ").append(toIndentedString(uploadDestinationId)).append("\n");
        sb.append("    imageCropSpecification: ").append(toIndentedString(imageCropSpecification)).append("\n");
        sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
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
