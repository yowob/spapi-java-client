package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The A+ Content standard image and text box block.
 */
@Schema(description = "The A+ Content standard image and text box block.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardImageTextBlock {
    @SerializedName("image")
    private ImageComponent image = null;
    @SerializedName("headline")
    private TextComponent headline = null;
    @SerializedName("body")
    private ParagraphComponent body = null;

    public StandardImageTextBlock image(ImageComponent image) {
        this.image = image;
        return this;
    }

    /**
     * Get image
     *
     * @return image
     **/
    @Schema(description = "")
    public ImageComponent getImage() {
        return image;
    }

    public void setImage(ImageComponent image) {
        this.image = image;
    }

    public StandardImageTextBlock headline(TextComponent headline) {
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

    public StandardImageTextBlock body(ParagraphComponent body) {
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
        StandardImageTextBlock standardImageTextBlock = (StandardImageTextBlock) o;
        return Objects.equals(this.image, standardImageTextBlock.image) &&
                Objects.equals(this.headline, standardImageTextBlock.headline) &&
                Objects.equals(this.body, standardImageTextBlock.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, headline, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardImageTextBlock {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
