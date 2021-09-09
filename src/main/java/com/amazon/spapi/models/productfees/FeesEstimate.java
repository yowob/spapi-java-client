package com.amazon.spapi.models.productfees;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * The total estimated fees for an item and a list of details.
 */
@Schema(description = "The total estimated fees for an item and a list of details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FeesEstimate {
    @SerializedName("TimeOfFeesEstimation")
    private OffsetDateTime timeOfFeesEstimation = null;
    @SerializedName("TotalFeesEstimate")
    private MoneyType totalFeesEstimate = null;
    @SerializedName("FeeDetailList")
    private FeeDetailList feeDetailList = null;

    public FeesEstimate timeOfFeesEstimation(OffsetDateTime timeOfFeesEstimation) {
        this.timeOfFeesEstimation = timeOfFeesEstimation;
        return this;
    }

    /**
     * The time at which the fees were estimated. This defaults to the time the request is made.
     *
     * @return timeOfFeesEstimation
     **/
    @Schema(required = true, description = "The time at which the fees were estimated. This defaults to the time the request is made.")
    public OffsetDateTime getTimeOfFeesEstimation() {
        return timeOfFeesEstimation;
    }

    public void setTimeOfFeesEstimation(OffsetDateTime timeOfFeesEstimation) {
        this.timeOfFeesEstimation = timeOfFeesEstimation;
    }

    public FeesEstimate totalFeesEstimate(MoneyType totalFeesEstimate) {
        this.totalFeesEstimate = totalFeesEstimate;
        return this;
    }

    /**
     * Get totalFeesEstimate
     *
     * @return totalFeesEstimate
     **/
    @Schema(description = "")
    public MoneyType getTotalFeesEstimate() {
        return totalFeesEstimate;
    }

    public void setTotalFeesEstimate(MoneyType totalFeesEstimate) {
        this.totalFeesEstimate = totalFeesEstimate;
    }

    public FeesEstimate feeDetailList(FeeDetailList feeDetailList) {
        this.feeDetailList = feeDetailList;
        return this;
    }

    /**
     * Get feeDetailList
     *
     * @return feeDetailList
     **/
    @Schema(description = "")
    public FeeDetailList getFeeDetailList() {
        return feeDetailList;
    }

    public void setFeeDetailList(FeeDetailList feeDetailList) {
        this.feeDetailList = feeDetailList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeesEstimate feesEstimate = (FeesEstimate) o;
        return Objects.equals(this.timeOfFeesEstimation, feesEstimate.timeOfFeesEstimation) &&
                Objects.equals(this.totalFeesEstimate, feesEstimate.totalFeesEstimate) &&
                Objects.equals(this.feeDetailList, feesEstimate.feeDetailList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeOfFeesEstimation, totalFeesEstimate, feeDetailList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeesEstimate {\n");
        sb.append("    timeOfFeesEstimation: ").append(toIndentedString(timeOfFeesEstimation)).append("\n");
        sb.append("    totalFeesEstimate: ").append(toIndentedString(totalFeesEstimate)).append("\n");
        sb.append("    feeDetailList: ").append(toIndentedString(feeDetailList)).append("\n");
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
