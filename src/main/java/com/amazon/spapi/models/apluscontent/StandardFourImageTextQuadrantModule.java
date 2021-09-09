package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Four standard images with text, presented on a grid of four quadrants.
 */
@Schema(description = "Four standard images with text, presented on a grid of four quadrants.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardFourImageTextQuadrantModule {
    @SerializedName("block1")
    private StandardImageTextBlock block1 = null;
    @SerializedName("block2")
    private StandardImageTextBlock block2 = null;
    @SerializedName("block3")
    private StandardImageTextBlock block3 = null;
    @SerializedName("block4")
    private StandardImageTextBlock block4 = null;

    public StandardFourImageTextQuadrantModule block1(StandardImageTextBlock block1) {
        this.block1 = block1;
        return this;
    }

    /**
     * Get block1
     *
     * @return block1
     **/
    @Schema(required = true, description = "")
    public StandardImageTextBlock getBlock1() {
        return block1;
    }

    public void setBlock1(StandardImageTextBlock block1) {
        this.block1 = block1;
    }

    public StandardFourImageTextQuadrantModule block2(StandardImageTextBlock block2) {
        this.block2 = block2;
        return this;
    }

    /**
     * Get block2
     *
     * @return block2
     **/
    @Schema(required = true, description = "")
    public StandardImageTextBlock getBlock2() {
        return block2;
    }

    public void setBlock2(StandardImageTextBlock block2) {
        this.block2 = block2;
    }

    public StandardFourImageTextQuadrantModule block3(StandardImageTextBlock block3) {
        this.block3 = block3;
        return this;
    }

    /**
     * Get block3
     *
     * @return block3
     **/
    @Schema(required = true, description = "")
    public StandardImageTextBlock getBlock3() {
        return block3;
    }

    public void setBlock3(StandardImageTextBlock block3) {
        this.block3 = block3;
    }

    public StandardFourImageTextQuadrantModule block4(StandardImageTextBlock block4) {
        this.block4 = block4;
        return this;
    }

    /**
     * Get block4
     *
     * @return block4
     **/
    @Schema(required = true, description = "")
    public StandardImageTextBlock getBlock4() {
        return block4;
    }

    public void setBlock4(StandardImageTextBlock block4) {
        this.block4 = block4;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardFourImageTextQuadrantModule standardFourImageTextQuadrantModule = (StandardFourImageTextQuadrantModule) o;
        return Objects.equals(this.block1, standardFourImageTextQuadrantModule.block1) &&
                Objects.equals(this.block2, standardFourImageTextQuadrantModule.block2) &&
                Objects.equals(this.block3, standardFourImageTextQuadrantModule.block3) &&
                Objects.equals(this.block4, standardFourImageTextQuadrantModule.block4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(block1, block2, block3, block4);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardFourImageTextQuadrantModule {\n");
        sb.append("    block1: ").append(toIndentedString(block1)).append("\n");
        sb.append("    block2: ").append(toIndentedString(block2)).append("\n");
        sb.append("    block3: ").append(toIndentedString(block3)).append("\n");
        sb.append("    block4: ").append(toIndentedString(block4)).append("\n");
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
