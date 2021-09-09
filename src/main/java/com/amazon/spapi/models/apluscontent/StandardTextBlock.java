package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The A+ Content standard text box block, comprised of a paragraph with a headline.
 */
@Schema(description = "The A+ Content standard text box block, comprised of a paragraph with a headline.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardTextBlock {
    @SerializedName("headline")
    private TextComponent headline = null;
    @SerializedName("body")
    private ParagraphComponent body = null;

    public StandardTextBlock headline(TextComponent headline) {
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

    public StandardTextBlock body(ParagraphComponent body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     *
     * @return body
     **/
    @Schema(description = "")
    public ParagraphComponent getBody() {
        return body;
    }

    public void setBody(ParagraphComponent body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardTextBlock standardTextBlock = (StandardTextBlock) o;
        return Objects.equals(this.headline, standardTextBlock.headline) &&
                Objects.equals(this.body, standardTextBlock.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headline, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardTextBlock {\n");
        sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
