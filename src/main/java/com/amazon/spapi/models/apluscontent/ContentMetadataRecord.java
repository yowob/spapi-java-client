package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The metadata for an A+ Content document, with additional information for content management.
 */
@Schema(description = "The metadata for an A+ Content document, with additional information for content management.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ContentMetadataRecord {
    @SerializedName("contentReferenceKey")
    private String contentReferenceKey = null;
    @SerializedName("contentMetadata")
    private ContentMetadata contentMetadata = null;

    public ContentMetadataRecord contentReferenceKey(String contentReferenceKey) {
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

    public ContentMetadataRecord contentMetadata(ContentMetadata contentMetadata) {
        this.contentMetadata = contentMetadata;
        return this;
    }

    /**
     * Get contentMetadata
     *
     * @return contentMetadata
     **/
    @Schema(required = true, description = "")
    public ContentMetadata getContentMetadata() {
        return contentMetadata;
    }

    public void setContentMetadata(ContentMetadata contentMetadata) {
        this.contentMetadata = contentMetadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentMetadataRecord contentMetadataRecord = (ContentMetadataRecord) o;
        return Objects.equals(this.contentReferenceKey, contentMetadataRecord.contentReferenceKey) &&
                Objects.equals(this.contentMetadata, contentMetadataRecord.contentMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentReferenceKey, contentMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentMetadataRecord {\n");
        sb.append("    contentReferenceKey: ").append(toIndentedString(contentReferenceKey)).append("\n");
        sb.append("    contentMetadata: ").append(toIndentedString(contentMetadata)).append("\n");
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
