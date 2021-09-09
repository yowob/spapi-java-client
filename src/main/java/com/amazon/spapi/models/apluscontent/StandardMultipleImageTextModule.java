package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Standard images with text, presented one at a time. The user clicks on thumbnails to view each block.
 */
@Schema(description = "Standard images with text, presented one at a time. The user clicks on thumbnails to view each block.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardMultipleImageTextModule {
    @SerializedName("blocks")
    private List<StandardImageTextCaptionBlock> blocks = null;

    public StandardMultipleImageTextModule blocks(List<StandardImageTextCaptionBlock> blocks) {
        this.blocks = blocks;
        return this;
    }

    public StandardMultipleImageTextModule addBlocksItem(StandardImageTextCaptionBlock blocksItem) {
        if (this.blocks == null) {
            this.blocks = new ArrayList<StandardImageTextCaptionBlock>();
        }
        this.blocks.add(blocksItem);
        return this;
    }

    /**
     * Get blocks
     *
     * @return blocks
     **/
    @Schema(description = "")
    public List<StandardImageTextCaptionBlock> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<StandardImageTextCaptionBlock> blocks) {
        this.blocks = blocks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardMultipleImageTextModule standardMultipleImageTextModule = (StandardMultipleImageTextModule) o;
        return Objects.equals(this.blocks, standardMultipleImageTextModule.blocks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blocks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardMultipleImageTextModule {\n");
        sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
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
