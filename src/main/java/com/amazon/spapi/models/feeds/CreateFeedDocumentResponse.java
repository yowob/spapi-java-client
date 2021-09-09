package com.amazon.spapi.models.feeds;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information required to upload a feed document&#x27;s contents.
 */
@Schema(description = "Information required to upload a feed document's contents.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateFeedDocumentResponse {
    @SerializedName("feedDocumentId")
    private String feedDocumentId = null;
    @SerializedName("url")
    private String url = null;

    public CreateFeedDocumentResponse feedDocumentId(String feedDocumentId) {
        this.feedDocumentId = feedDocumentId;
        return this;
    }

    /**
     * The identifier of the feed document.
     *
     * @return feedDocumentId
     **/
    @Schema(required = true, description = "The identifier of the feed document.")
    public String getFeedDocumentId() {
        return feedDocumentId;
    }

    public void setFeedDocumentId(String feedDocumentId) {
        this.feedDocumentId = feedDocumentId;
    }

    public CreateFeedDocumentResponse url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The presigned URL for uploading the feed contents. This URL expires after 5 minutes.
     *
     * @return url
     **/
    @Schema(required = true, description = "The presigned URL for uploading the feed contents. This URL expires after 5 minutes.")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFeedDocumentResponse createFeedDocumentResponse = (CreateFeedDocumentResponse) o;
        return Objects.equals(this.feedDocumentId, createFeedDocumentResponse.feedDocumentId) &&
                Objects.equals(this.url, createFeedDocumentResponse.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedDocumentId, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFeedDocumentResponse {\n");
        sb.append("    feedDocumentId: ").append(toIndentedString(feedDocumentId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
