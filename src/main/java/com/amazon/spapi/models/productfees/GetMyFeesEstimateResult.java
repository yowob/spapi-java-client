package com.amazon.spapi.models.productfees;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Response schema.
 */
@Schema(description = "Response schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetMyFeesEstimateResult {
    @SerializedName("FeesEstimateResult")
    private FeesEstimateResult feesEstimateResult = null;

    public GetMyFeesEstimateResult feesEstimateResult(FeesEstimateResult feesEstimateResult) {
        this.feesEstimateResult = feesEstimateResult;
        return this;
    }

    /**
     * Get feesEstimateResult
     *
     * @return feesEstimateResult
     **/
    @Schema(description = "")
    public FeesEstimateResult getFeesEstimateResult() {
        return feesEstimateResult;
    }

    public void setFeesEstimateResult(FeesEstimateResult feesEstimateResult) {
        this.feesEstimateResult = feesEstimateResult;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetMyFeesEstimateResult getMyFeesEstimateResult = (GetMyFeesEstimateResult) o;
        return Objects.equals(this.feesEstimateResult, getMyFeesEstimateResult.feesEstimateResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feesEstimateResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMyFeesEstimateResult {\n");
        sb.append("    feesEstimateResult: ").append(toIndentedString(feesEstimateResult)).append("\n");
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
