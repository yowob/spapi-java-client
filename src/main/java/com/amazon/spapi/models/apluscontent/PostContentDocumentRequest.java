package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PostContentDocumentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PostContentDocumentRequest {
    @SerializedName("contentDocument")
    private ContentDocument contentDocument = null;

    public PostContentDocumentRequest contentDocument(ContentDocument contentDocument) {
        this.contentDocument = contentDocument;
        return this;
    }

    /**
     * Get contentDocument
     *
     * @return contentDocument
     **/
    @Schema(required = true, description = "")
    public ContentDocument getContentDocument() {
        return contentDocument;
    }

    public void setContentDocument(ContentDocument contentDocument) {
        this.contentDocument = contentDocument;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostContentDocumentRequest postContentDocumentRequest = (PostContentDocumentRequest) o;
        return Objects.equals(this.contentDocument, postContentDocumentRequest.contentDocument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentDocument);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostContentDocumentRequest {\n");
        sb.append("    contentDocument: ").append(toIndentedString(contentDocument)).append("\n");
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
