package com.amazon.spapi.models.reports;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The response for the getReports operation.
 */
@Schema(description = "The response for the getReports operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetReportsResponse {
    @SerializedName("payload")
    private ReportList payload = null;
    @SerializedName("nextToken")
    private String nextToken = null;
    @SerializedName("errors")
    private ErrorList errors = null;

    public GetReportsResponse payload(ReportList payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     *
     * @return payload
     **/
    @Schema(description = "")
    public ReportList getPayload() {
        return payload;
    }

    public void setPayload(ReportList payload) {
        this.payload = payload;
    }

    public GetReportsResponse nextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returned when the number of results exceeds pageSize. To get the next page of results, call getReports with this token as the only parameter.
     *
     * @return nextToken
     **/
    @Schema(description = "Returned when the number of results exceeds pageSize. To get the next page of results, call getReports with this token as the only parameter.")
    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    public GetReportsResponse errors(ErrorList errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get errors
     *
     * @return errors
     **/
    @Schema(description = "")
    public ErrorList getErrors() {
        return errors;
    }

    public void setErrors(ErrorList errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetReportsResponse getReportsResponse = (GetReportsResponse) o;
        return Objects.equals(this.payload, getReportsResponse.payload) &&
                Objects.equals(this.nextToken, getReportsResponse.nextToken) &&
                Objects.equals(this.errors, getReportsResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, nextToken, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetReportsResponse {\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
