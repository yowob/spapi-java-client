package com.amazon.spapi.models.productfees;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Request schema.
 */
@Schema(description = "Request schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetMyFeesEstimateRequest {
    @SerializedName("FeesEstimateRequest")
    private FeesEstimateRequest feesEstimateRequest = null;

    public GetMyFeesEstimateRequest feesEstimateRequest(FeesEstimateRequest feesEstimateRequest) {
        this.feesEstimateRequest = feesEstimateRequest;
        return this;
    }

    /**
     * Get feesEstimateRequest
     *
     * @return feesEstimateRequest
     **/
    @Schema(description = "")
    public FeesEstimateRequest getFeesEstimateRequest() {
        return feesEstimateRequest;
    }

    public void setFeesEstimateRequest(FeesEstimateRequest feesEstimateRequest) {
        this.feesEstimateRequest = feesEstimateRequest;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetMyFeesEstimateRequest getMyFeesEstimateRequest = (GetMyFeesEstimateRequest) o;
        return Objects.equals(this.feesEstimateRequest, getMyFeesEstimateRequest.feesEstimateRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feesEstimateRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMyFeesEstimateRequest {\n");
        sb.append("    feesEstimateRequest: ").append(toIndentedString(feesEstimateRequest)).append("\n");
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
