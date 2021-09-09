package com.amazon.spapi.models.productfees;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * An item identifier and the estimated fees for the item.
 */
@Schema(description = "An item identifier and the estimated fees for the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FeesEstimateResult {
    @SerializedName("Status")
    private String status = null;
    @SerializedName("FeesEstimateIdentifier")
    private FeesEstimateIdentifier feesEstimateIdentifier = null;
    @SerializedName("FeesEstimate")
    private FeesEstimate feesEstimate = null;
    @SerializedName("Error")
    private FeesEstimateError error = null;

    public FeesEstimateResult status(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the fee request. Possible values: Success, ClientError, ServiceError.
     *
     * @return status
     **/
    @Schema(description = "The status of the fee request. Possible values: Success, ClientError, ServiceError.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FeesEstimateResult feesEstimateIdentifier(FeesEstimateIdentifier feesEstimateIdentifier) {
        this.feesEstimateIdentifier = feesEstimateIdentifier;
        return this;
    }

    /**
     * Get feesEstimateIdentifier
     *
     * @return feesEstimateIdentifier
     **/
    @Schema(description = "")
    public FeesEstimateIdentifier getFeesEstimateIdentifier() {
        return feesEstimateIdentifier;
    }

    public void setFeesEstimateIdentifier(FeesEstimateIdentifier feesEstimateIdentifier) {
        this.feesEstimateIdentifier = feesEstimateIdentifier;
    }

    public FeesEstimateResult feesEstimate(FeesEstimate feesEstimate) {
        this.feesEstimate = feesEstimate;
        return this;
    }

    /**
     * Get feesEstimate
     *
     * @return feesEstimate
     **/
    @Schema(description = "")
    public FeesEstimate getFeesEstimate() {
        return feesEstimate;
    }

    public void setFeesEstimate(FeesEstimate feesEstimate) {
        this.feesEstimate = feesEstimate;
    }

    public FeesEstimateResult error(FeesEstimateError error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     *
     * @return error
     **/
    @Schema(description = "")
    public FeesEstimateError getError() {
        return error;
    }

    public void setError(FeesEstimateError error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeesEstimateResult feesEstimateResult = (FeesEstimateResult) o;
        return Objects.equals(this.status, feesEstimateResult.status) &&
                Objects.equals(this.feesEstimateIdentifier, feesEstimateResult.feesEstimateIdentifier) &&
                Objects.equals(this.feesEstimate, feesEstimateResult.feesEstimate) &&
                Objects.equals(this.error, feesEstimateResult.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, feesEstimateIdentifier, feesEstimate, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeesEstimateResult {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    feesEstimateIdentifier: ").append(toIndentedString(feesEstimateIdentifier)).append("\n");
        sb.append("    feesEstimate: ").append(toIndentedString(feesEstimate)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
