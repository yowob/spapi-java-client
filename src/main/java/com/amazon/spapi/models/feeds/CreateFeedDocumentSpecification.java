package com.amazon.spapi.models.feeds;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * CreateFeedDocumentSpecification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateFeedDocumentSpecification {
    @SerializedName("contentType")
    private String contentType = null;

    public CreateFeedDocumentSpecification contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * The content type of the feed.
     *
     * @return contentType
     **/
    @Schema(required = true, description = "The content type of the feed.")
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFeedDocumentSpecification createFeedDocumentSpecification = (CreateFeedDocumentSpecification) o;
        return Objects.equals(this.contentType, createFeedDocumentSpecification.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFeedDocumentSpecification {\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
