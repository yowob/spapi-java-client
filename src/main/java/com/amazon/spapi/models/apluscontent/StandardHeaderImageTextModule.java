package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Standard headline text, an image, and body text.
 */
@Schema(description = "Standard headline text, an image, and body text.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardHeaderImageTextModule {
    @SerializedName("headline")
    private TextComponent headline = null;
    @SerializedName("block")
    private StandardImageTextBlock block = null;

    public StandardHeaderImageTextModule headline(TextComponent headline) {
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

    public StandardHeaderImageTextModule block(StandardImageTextBlock block) {
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
        StandardHeaderImageTextModule standardHeaderImageTextModule = (StandardHeaderImageTextModule) o;
        return Objects.equals(this.headline, standardHeaderImageTextModule.headline) &&
                Objects.equals(this.block, standardHeaderImageTextModule.block);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headline, block);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardHeaderImageTextModule {\n");
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
