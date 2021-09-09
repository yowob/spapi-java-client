package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A list of rich text content, usually presented in a text box.
 */
@Schema(description = "A list of rich text content, usually presented in a text box.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ParagraphComponent {
    @SerializedName("textList")
    private List<TextComponent> textList = new ArrayList<TextComponent>();

    public ParagraphComponent textList(List<TextComponent> textList) {
        this.textList = textList;
        return this;
    }

    public ParagraphComponent addTextListItem(TextComponent textListItem) {
        this.textList.add(textListItem);
        return this;
    }

    /**
     * Get textList
     *
     * @return textList
     **/
    @Schema(required = true, description = "")
    public List<TextComponent> getTextList() {
        return textList;
    }

    public void setTextList(List<TextComponent> textList) {
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
        ParagraphComponent paragraphComponent = (ParagraphComponent) o;
        return Objects.equals(this.textList, paragraphComponent.textList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParagraphComponent {\n");
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
