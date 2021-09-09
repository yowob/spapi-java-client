package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PostContentDocumentResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PostContentDocumentResponse extends AplusResponse {
    @SerializedName("contentReferenceKey")
    private String contentReferenceKey = null;

    public PostContentDocumentResponse contentReferenceKey(String contentReferenceKey) {
        this.contentReferenceKey = contentReferenceKey;
        return this;
    }

    /**
     * Get contentReferenceKey
     *
     * @return contentReferenceKey
     **/
    @Schema(required = true, description = "")
    public String getContentReferenceKey() {
        return contentReferenceKey;
    }

    public void setContentReferenceKey(String contentReferenceKey) {
        this.contentReferenceKey = contentReferenceKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostContentDocumentResponse postContentDocumentResponse = (PostContentDocumentResponse) o;
        return Objects.equals(this.contentReferenceKey, postContentDocumentResponse.contentReferenceKey) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentReferenceKey, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostContentDocumentResponse {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    contentReferenceKey: ").append(toIndentedString(contentReferenceKey)).append("\n");
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
