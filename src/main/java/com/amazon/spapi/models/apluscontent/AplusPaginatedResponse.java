package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The base response data for paginated A+ Content operations. Individual operations may extend this with additional data. If nextPageToken is not returned, there are no more pages to return.
 */
@Schema(description = "The base response data for paginated A+ Content operations. Individual operations may extend this with additional data. If nextPageToken is not returned, there are no more pages to return.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AplusPaginatedResponse extends AplusResponse {
    @SerializedName("nextPageToken")
    private String nextPageToken = null;

    public AplusPaginatedResponse nextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * Get nextPageToken
     *
     * @return nextPageToken
     **/
    @Schema(description = "")
    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AplusPaginatedResponse aplusPaginatedResponse = (AplusPaginatedResponse) o;
        return Objects.equals(this.nextPageToken, aplusPaginatedResponse.nextPageToken) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextPageToken, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AplusPaginatedResponse {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
