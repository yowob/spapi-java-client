package com.amazon.spapi.models.fbainventory;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The Response schema.
 */
@Schema(description = "The Response schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetInventorySummariesResponse {
    @SerializedName("payload")
    private GetInventorySummariesResult payload = null;
    @SerializedName("pagination")
    private Pagination pagination = null;
    @SerializedName("errors")
    private ErrorList errors = null;

    public GetInventorySummariesResponse payload(GetInventorySummariesResult payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     *
     * @return payload
     **/
    @Schema(description = "")
    public GetInventorySummariesResult getPayload() {
        return payload;
    }

    public void setPayload(GetInventorySummariesResult payload) {
        this.payload = payload;
    }

    public GetInventorySummariesResponse pagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Get pagination
     *
     * @return pagination
     **/
    @Schema(description = "")
    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public GetInventorySummariesResponse errors(ErrorList errors) {
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
        GetInventorySummariesResponse getInventorySummariesResponse = (GetInventorySummariesResponse) o;
        return Objects.equals(this.payload, getInventorySummariesResponse.payload) &&
                Objects.equals(this.pagination, getInventorySummariesResponse.pagination) &&
                Objects.equals(this.errors, getInventorySummariesResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, pagination, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetInventorySummariesResponse {\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
