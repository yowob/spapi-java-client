package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A content document with additional information for content management.
 */
@Schema(description = "A content document with additional information for content management.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ContentRecord {
    @SerializedName("contentReferenceKey")
    private String contentReferenceKey = null;
    @SerializedName("contentMetadata")
    private ContentMetadata contentMetadata = null;
    @SerializedName("contentDocument")
    private ContentDocument contentDocument = null;

    public ContentRecord contentReferenceKey(String contentReferenceKey) {
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

    public ContentRecord contentMetadata(ContentMetadata contentMetadata) {
        this.contentMetadata = contentMetadata;
        return this;
    }

    /**
     * Get contentMetadata
     *
     * @return contentMetadata
     **/
    @Schema(description = "")
    public ContentMetadata getContentMetadata() {
        return contentMetadata;
    }

    public void setContentMetadata(ContentMetadata contentMetadata) {
        this.contentMetadata = contentMetadata;
    }

    public ContentRecord contentDocument(ContentDocument contentDocument) {
        this.contentDocument = contentDocument;
        return this;
    }

    /**
     * Get contentDocument
     *
     * @return contentDocument
     **/
    @Schema(description = "")
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
        ContentRecord contentRecord = (ContentRecord) o;
        return Objects.equals(this.contentReferenceKey, contentRecord.contentReferenceKey) &&
                Objects.equals(this.contentMetadata, contentRecord.contentMetadata) &&
                Objects.equals(this.contentDocument, contentRecord.contentDocument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentReferenceKey, contentMetadata, contentDocument);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentRecord {\n");
        sb.append("    contentReferenceKey: ").append(toIndentedString(contentReferenceKey)).append("\n");
        sb.append("    contentMetadata: ").append(toIndentedString(contentMetadata)).append("\n");
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
