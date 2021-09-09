package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ListReturnReasonCodesResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ListReturnReasonCodesResult {
    @SerializedName("reasonCodeDetails")
    private ReasonCodeDetailsList reasonCodeDetails = null;

    public ListReturnReasonCodesResult reasonCodeDetails(ReasonCodeDetailsList reasonCodeDetails) {
        this.reasonCodeDetails = reasonCodeDetails;
        return this;
    }

    /**
     * Get reasonCodeDetails
     *
     * @return reasonCodeDetails
     **/
    @Schema(description = "")
    public ReasonCodeDetailsList getReasonCodeDetails() {
        return reasonCodeDetails;
    }

    public void setReasonCodeDetails(ReasonCodeDetailsList reasonCodeDetails) {
        this.reasonCodeDetails = reasonCodeDetails;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListReturnReasonCodesResult listReturnReasonCodesResult = (ListReturnReasonCodesResult) o;
        return Objects.equals(this.reasonCodeDetails, listReturnReasonCodesResult.reasonCodeDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reasonCodeDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReturnReasonCodesResult {\n");
        sb.append("    reasonCodeDetails: ").append(toIndentedString(reasonCodeDetails)).append("\n");
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
