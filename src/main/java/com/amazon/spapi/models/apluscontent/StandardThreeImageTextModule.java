package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Three standard images with text, presented across a single row.
 */
@Schema(description = "Three standard images with text, presented across a single row.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardThreeImageTextModule {
    @SerializedName("headline")
    private TextComponent headline = null;
    @SerializedName("block1")
    private StandardImageTextBlock block1 = null;
    @SerializedName("block2")
    private StandardImageTextBlock block2 = null;
    @SerializedName("block3")
    private StandardImageTextBlock block3 = null;

    public StandardThreeImageTextModule headline(TextComponent headline) {
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

    public StandardThreeImageTextModule block1(StandardImageTextBlock block1) {
        this.block1 = block1;
        return this;
    }

    /**
     * Get block1
     *
     * @return block1
     **/
    @Schema(description = "")
    public StandardImageTextBlock getBlock1() {
        return block1;
    }

    public void setBlock1(StandardImageTextBlock block1) {
        this.block1 = block1;
    }

    public StandardThreeImageTextModule block2(StandardImageTextBlock block2) {
        this.block2 = block2;
        return this;
    }

    /**
     * Get block2
     *
     * @return block2
     **/
    @Schema(description = "")
    public StandardImageTextBlock getBlock2() {
        return block2;
    }

    public void setBlock2(StandardImageTextBlock block2) {
        this.block2 = block2;
    }

    public StandardThreeImageTextModule block3(StandardImageTextBlock block3) {
        this.block3 = block3;
        return this;
    }

    /**
     * Get block3
     *
     * @return block3
     **/
    @Schema(description = "")
    public StandardImageTextBlock getBlock3() {
        return block3;
    }

    public void setBlock3(StandardImageTextBlock block3) {
        this.block3 = block3;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardThreeImageTextModule standardThreeImageTextModule = (StandardThreeImageTextModule) o;
        return Objects.equals(this.headline, standardThreeImageTextModule.headline) &&
                Objects.equals(this.block1, standardThreeImageTextModule.block1) &&
                Objects.equals(this.block2, standardThreeImageTextModule.block2) &&
                Objects.equals(this.block3, standardThreeImageTextModule.block3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headline, block1, block2, block3);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardThreeImageTextModule {\n");
        sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
        sb.append("    block1: ").append(toIndentedString(block1)).append("\n");
        sb.append("    block2: ").append(toIndentedString(block2)).append("\n");
        sb.append("    block3: ").append(toIndentedString(block3)).append("\n");
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
