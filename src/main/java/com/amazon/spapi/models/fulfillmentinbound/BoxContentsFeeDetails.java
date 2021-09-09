package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The manual processing fee per unit and total fee for a shipment.
 */
@Schema(description = "The manual processing fee per unit and total fee for a shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class BoxContentsFeeDetails {
    @SerializedName("TotalUnits")
    private Integer totalUnits = null;
    @SerializedName("FeePerUnit")
    private Amount feePerUnit = null;
    @SerializedName("TotalFee")
    private Amount totalFee = null;

    public BoxContentsFeeDetails totalUnits(Integer totalUnits) {
        this.totalUnits = totalUnits;
        return this;
    }

    /**
     * Get totalUnits
     *
     * @return totalUnits
     **/
    @Schema(description = "")
    public Integer getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(Integer totalUnits) {
        this.totalUnits = totalUnits;
    }

    public BoxContentsFeeDetails feePerUnit(Amount feePerUnit) {
        this.feePerUnit = feePerUnit;
        return this;
    }

    /**
     * Get feePerUnit
     *
     * @return feePerUnit
     **/
    @Schema(description = "")
    public Amount getFeePerUnit() {
        return feePerUnit;
    }

    public void setFeePerUnit(Amount feePerUnit) {
        this.feePerUnit = feePerUnit;
    }

    public BoxContentsFeeDetails totalFee(Amount totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    /**
     * Get totalFee
     *
     * @return totalFee
     **/
    @Schema(description = "")
    public Amount getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Amount totalFee) {
        this.totalFee = totalFee;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BoxContentsFeeDetails boxContentsFeeDetails = (BoxContentsFeeDetails) o;
        return Objects.equals(this.totalUnits, boxContentsFeeDetails.totalUnits) &&
                Objects.equals(this.feePerUnit, boxContentsFeeDetails.feePerUnit) &&
                Objects.equals(this.totalFee, boxContentsFeeDetails.totalFee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalUnits, feePerUnit, totalFee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BoxContentsFeeDetails {\n");
        sb.append("    totalUnits: ").append(toIndentedString(totalUnits)).append("\n");
        sb.append("    feePerUnit: ").append(toIndentedString(feePerUnit)).append("\n");
        sb.append("    totalFee: ").append(toIndentedString(totalFee)).append("\n");
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
