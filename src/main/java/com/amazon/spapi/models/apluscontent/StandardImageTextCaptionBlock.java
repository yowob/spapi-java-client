package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The A+ Content standard image and text block, with a related caption. The caption may not display on all devices.
 */
@Schema(description = "The A+ Content standard image and text block, with a related caption. The caption may not display on all devices.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardImageTextCaptionBlock {
    @SerializedName("block")
    private StandardImageTextBlock block = null;
    @SerializedName("caption")
    private TextComponent caption = null;

    public StandardImageTextCaptionBlock block(StandardImageTextBlock block) {
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

    public StandardImageTextCaptionBlock caption(TextComponent caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Get caption
     *
     * @return caption
     **/
    @Schema(description = "")
    public TextComponent getCaption() {
        return caption;
    }

    public void setCaption(TextComponent caption) {
        this.caption = caption;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardImageTextCaptionBlock standardImageTextCaptionBlock = (StandardImageTextCaptionBlock) o;
        return Objects.equals(this.block, standardImageTextCaptionBlock.block) &&
                Objects.equals(this.caption, standardImageTextCaptionBlock.caption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(block, caption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardImageTextCaptionBlock {\n");
        sb.append("    block: ").append(toIndentedString(block)).append("\n");
        sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
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
