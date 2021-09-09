package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A standard headline and body text with an image on the side.
 */
@Schema(description = "A standard headline and body text with an image on the side.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardSingleSideImageModule {
    @SerializedName("imagePositionType")
    private PositionType imagePositionType = null;
    @SerializedName("block")
    private StandardImageTextBlock block = null;

    public StandardSingleSideImageModule imagePositionType(PositionType imagePositionType) {
        this.imagePositionType = imagePositionType;
        return this;
    }

    /**
     * Get imagePositionType
     *
     * @return imagePositionType
     **/
    @Schema(required = true, description = "")
    public PositionType getImagePositionType() {
        return imagePositionType;
    }

    public void setImagePositionType(PositionType imagePositionType) {
        this.imagePositionType = imagePositionType;
    }

    public StandardSingleSideImageModule block(StandardImageTextBlock block) {
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
        StandardSingleSideImageModule standardSingleSideImageModule = (StandardSingleSideImageModule) o;
        return Objects.equals(this.imagePositionType, standardSingleSideImageModule.imagePositionType) &&
                Objects.equals(this.block, standardSingleSideImageModule.block);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imagePositionType, block);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardSingleSideImageModule {\n");
        sb.append("    imagePositionType: ").append(toIndentedString(imagePositionType)).append("\n");
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
