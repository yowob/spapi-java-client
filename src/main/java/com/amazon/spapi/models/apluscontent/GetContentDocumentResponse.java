package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetContentDocumentResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetContentDocumentResponse extends AplusResponse {
    @SerializedName("contentRecord")
    private ContentRecord contentRecord = null;

    public GetContentDocumentResponse contentRecord(ContentRecord contentRecord) {
        this.contentRecord = contentRecord;
        return this;
    }

    /**
     * Get contentRecord
     *
     * @return contentRecord
     **/
    @Schema(required = true, description = "")
    public ContentRecord getContentRecord() {
        return contentRecord;
    }

    public void setContentRecord(ContentRecord contentRecord) {
        this.contentRecord = contentRecord;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetContentDocumentResponse getContentDocumentResponse = (GetContentDocumentResponse) o;
        return Objects.equals(this.contentRecord, getContentDocumentResponse.contentRecord) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentRecord, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetContentDocumentResponse {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    contentRecord: ").append(toIndentedString(contentRecord)).append("\n");
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
