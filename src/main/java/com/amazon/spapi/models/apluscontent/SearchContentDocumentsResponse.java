package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * SearchContentDocumentsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SearchContentDocumentsResponse extends AplusPaginatedResponse {
    @SerializedName("contentMetadataRecords")
    private ContentMetadataRecordList contentMetadataRecords = null;

    public SearchContentDocumentsResponse contentMetadataRecords(ContentMetadataRecordList contentMetadataRecords) {
        this.contentMetadataRecords = contentMetadataRecords;
        return this;
    }

    /**
     * Get contentMetadataRecords
     *
     * @return contentMetadataRecords
     **/
    @Schema(required = true, description = "")
    public ContentMetadataRecordList getContentMetadataRecords() {
        return contentMetadataRecords;
    }

    public void setContentMetadataRecords(ContentMetadataRecordList contentMetadataRecords) {
        this.contentMetadataRecords = contentMetadataRecords;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchContentDocumentsResponse searchContentDocumentsResponse = (SearchContentDocumentsResponse) o;
        return Objects.equals(this.contentMetadataRecords, searchContentDocumentsResponse.contentMetadataRecords) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentMetadataRecords, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchContentDocumentsResponse {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    contentMetadataRecords: ").append(toIndentedString(contentMetadataRecords)).append("\n");
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
