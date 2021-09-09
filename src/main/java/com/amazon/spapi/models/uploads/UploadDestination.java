package com.amazon.spapi.models.uploads;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information about an upload destination.
 */
@Schema(description = "Information about an upload destination.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class UploadDestination {
    @SerializedName("uploadDestinationId")
    private String uploadDestinationId = null;
    @SerializedName("url")
    private String url = null;
    @SerializedName("headers")
    private Object headers = null;

    public UploadDestination uploadDestinationId(String uploadDestinationId) {
        this.uploadDestinationId = uploadDestinationId;
        return this;
    }

    /**
     * The unique identifier for the upload destination.
     *
     * @return uploadDestinationId
     **/
    @Schema(description = "The unique identifier for the upload destination.")
    public String getUploadDestinationId() {
        return uploadDestinationId;
    }

    public void setUploadDestinationId(String uploadDestinationId) {
        this.uploadDestinationId = uploadDestinationId;
    }

    public UploadDestination url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The URL for the upload destination.
     *
     * @return url
     **/
    @Schema(description = "The URL for the upload destination.")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UploadDestination headers(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * The headers to include in the upload request.
     *
     * @return headers
     **/
    @Schema(description = "The headers to include in the upload request.")
    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadDestination uploadDestination = (UploadDestination) o;
        return Objects.equals(this.uploadDestinationId, uploadDestination.uploadDestinationId) &&
                Objects.equals(this.url, uploadDestination.url) &&
                Objects.equals(this.headers, uploadDestination.headers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadDestinationId, url, headers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadDestination {\n");
        sb.append("    uploadDestinationId: ").append(toIndentedString(uploadDestinationId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
