package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A standard background image with a floating text box.
 */
@Schema(description = "A standard background image with a floating text box.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardImageTextOverlayModule {
    @SerializedName("overlayColorType")
    private ColorType overlayColorType = null;
    @SerializedName("block")
    private StandardImageTextBlock block = null;

    public StandardImageTextOverlayModule overlayColorType(ColorType overlayColorType) {
        this.overlayColorType = overlayColorType;
        return this;
    }

    /**
     * Get overlayColorType
     *
     * @return overlayColorType
     **/
    @Schema(required = true, description = "")
    public ColorType getOverlayColorType() {
        return overlayColorType;
    }

    public void setOverlayColorType(ColorType overlayColorType) {
        this.overlayColorType = overlayColorType;
    }

    public StandardImageTextOverlayModule block(StandardImageTextBlock block) {
        this.block = block;
        return this;
    }

    /**
     * Get block
     *
     * @return block
     **/
    @Schema(description = "")
    public StandardImageTextBlock getBlock() {
        return block;
    }

    public void setBlock(StandardImageTextBlock block) {
        this.block = block;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardImageTextOverlayModule standardImageTextOverlayModule = (StandardImageTextOverlayModule) o;
        return Objects.equals(this.overlayColorType, standardImageTextOverlayModule.overlayColorType) &&
                Objects.equals(this.block, standardImageTextOverlayModule.block);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overlayColorType, block);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardImageTextOverlayModule {\n");
        sb.append("    overlayColorType: ").append(toIndentedString(overlayColorType)).append("\n");
        sb.append("    block: ").append(toIndentedString(block)).append("\n");
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
