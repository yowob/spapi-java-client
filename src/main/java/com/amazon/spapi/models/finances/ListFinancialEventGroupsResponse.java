package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The response schema for the listFinancialEventGroups operation.
 */
@Schema(description = "The response schema for the listFinancialEventGroups operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ListFinancialEventGroupsResponse {
    @SerializedName("payload")
    private ListFinancialEventGroupsPayload payload = null;
    @SerializedName("errors")
    private ErrorList errors = null;

    public ListFinancialEventGroupsResponse payload(ListFinancialEventGroupsPayload payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     *
     * @return payload
     **/
    @Schema(description = "")
    public ListFinancialEventGroupsPayload getPayload() {
        return payload;
    }

    public void setPayload(ListFinancialEventGroupsPayload payload) {
        this.payload = payload;
    }

    public ListFinancialEventGroupsResponse errors(ErrorList errors) {
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
        ListFinancialEventGroupsResponse listFinancialEventGroupsResponse = (ListFinancialEventGroupsResponse) o;
        return Objects.equals(this.payload, listFinancialEventGroupsResponse.payload) &&
                Objects.equals(this.errors, listFinancialEventGroupsResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFinancialEventGroupsResponse {\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
