package com.amazon.spapi.models.catalogitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * When a request produces a response that exceeds the pageSize, pagination occurs. This means the response is divided into individual pages. To retrieve the next page or the previous page, you must pass the nextToken value or the previousToken value as the pageToken parameter in the next request. When you receive the last page, there will be no nextToken key in the pagination object.
 */
@Schema(description = "When a request produces a response that exceeds the pageSize, pagination occurs. This means the response is divided into individual pages. To retrieve the next page or the previous page, you must pass the nextToken value or the previousToken value as the pageToken parameter in the next request. When you receive the last page, there will be no nextToken key in the pagination object.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Pagination {
    @SerializedName("nextToken")
    private String nextToken = null;
    @SerializedName("previousToken")
    private String previousToken = null;

    public Pagination nextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * A token that can be used to fetch the next page.
     *
     * @return nextToken
     **/
    @Schema(description = "A token that can be used to fetch the next page.")
    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    public Pagination previousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }

    /**
     * A token that can be used to fetch the previous page.
     *
     * @return previousToken
     **/
    @Schema(description = "A token that can be used to fetch the previous page.")
    public String getPreviousToken() {
        return previousToken;
    }

    public void setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pagination pagination = (Pagination) o;
        return Objects.equals(this.nextToken, pagination.nextToken) &&
                Objects.equals(this.previousToken, pagination.previousToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextToken, previousToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pagination {\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    previousToken: ").append(toIndentedString(previousToken)).append("\n");
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
