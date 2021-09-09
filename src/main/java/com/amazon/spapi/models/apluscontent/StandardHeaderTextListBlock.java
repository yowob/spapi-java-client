package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The A+ standard fixed-length list of text, with a related headline.
 */
@Schema(description = "The A+ standard fixed-length list of text, with a related headline.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardHeaderTextListBlock {
    @SerializedName("headline")
    private TextComponent headline = null;
    @SerializedName("block")
    private StandardTextListBlock block = null;

    public StandardHeaderTextListBlock headline(TextComponent headline) {
        this.headline = headline;
        return this;
    }

    /**
     * Get headline
     *
     * @return headline
     **/
    @Schema(description = "")
    public TextComponent getHeadline() {
        return headline;
    }

    public void setHeadline(TextComponent headline) {
        this.headline = headline;
    }

    public StandardHeaderTextListBlock block(StandardTextListBlock block) {
        this.block = block;
        return this;
    }

    /**
     * Get block
     *
     * @return block
     **/
    @Schema(description = "")
    public StandardTextListBlock getBlock() {
        return block;
    }

    public void setBlock(StandardTextListBlock block) {
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
        StandardHeaderTextListBlock standardHeaderTextListBlock = (StandardHeaderTextListBlock) o;
        return Objects.equals(this.headline, standardHeaderTextListBlock.headline) &&
                Objects.equals(this.block, standardHeaderTextListBlock.block);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headline, block);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardHeaderTextListBlock {\n");
        sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
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
