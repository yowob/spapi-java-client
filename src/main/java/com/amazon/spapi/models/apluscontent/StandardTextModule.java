package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A standard headline and body text.
 */
@Schema(description = "A standard headline and body text.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardTextModule {
    @SerializedName("headline")
    private TextComponent headline = null;
    @SerializedName("body")
    private ParagraphComponent body = null;

    public StandardTextModule headline(TextComponent headline) {
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

    public StandardTextModule body(ParagraphComponent body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     *
     * @return body
     **/
    @Schema(required = true, description = "")
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
        StandardTextModule standardTextModule = (StandardTextModule) o;
        return Objects.equals(this.headline, standardTextModule.headline) &&
                Objects.equals(this.body, standardTextModule.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headline, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardTextModule {\n");
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
