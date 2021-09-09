package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The A+ Content standard fixed length list of text, usually presented as bullet points.
 */
@Schema(description = "The A+ Content standard fixed length list of text, usually presented as bullet points.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardTextListBlock {
    @SerializedName("textList")
    private List<TextItem> textList = new ArrayList<TextItem>();

    public StandardTextListBlock textList(List<TextItem> textList) {
        this.textList = textList;
        return this;
    }

    public StandardTextListBlock addTextListItem(TextItem textListItem) {
        this.textList.add(textListItem);
        return this;
    }

    /**
     * Get textList
     *
     * @return textList
     **/
    @Schema(required = true, description = "")
    public List<TextItem> getTextList() {
        return textList;
    }

    public void setTextList(List<TextItem> textList) {
        this.textList = textList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardTextListBlock standardTextListBlock = (StandardTextListBlock) o;
        return Objects.equals(this.textList, standardTextListBlock.textList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardTextListBlock {\n");
        sb.append("    textList: ").append(toIndentedString(textList)).append("\n");
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
