package com.amazon.spapi.models.productfees;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The type of fee, fee amount, and other details.
 */
@Schema(description = "The type of fee, fee amount, and other details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FeeDetail {
    @SerializedName("FeeType")
    private String feeType = null;
    @SerializedName("FeeAmount")
    private MoneyType feeAmount = null;
    @SerializedName("FeePromotion")
    private MoneyType feePromotion = null;
    @SerializedName("TaxAmount")
    private MoneyType taxAmount = null;
    @SerializedName("FinalFee")
    private MoneyType finalFee = null;
    @SerializedName("IncludedFeeDetailList")
    private IncludedFeeDetailList includedFeeDetailList = null;

    public FeeDetail feeType(String feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * The type of fee charged to a seller.
     *
     * @return feeType
     **/
    @Schema(required = true, description = "The type of fee charged to a seller.")
    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public FeeDetail feeAmount(MoneyType feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Get feeAmount
     *
     * @return feeAmount
     **/
    @Schema(required = true, description = "")
    public MoneyType getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(MoneyType feeAmount) {
        this.feeAmount = feeAmount;
    }

    public FeeDetail feePromotion(MoneyType feePromotion) {
        this.feePromotion = feePromotion;
        return this;
    }

    /**
     * Get feePromotion
     *
     * @return feePromotion
     **/
    @Schema(description = "")
    public MoneyType getFeePromotion() {
        return feePromotion;
    }

    public void setFeePromotion(MoneyType feePromotion) {
        this.feePromotion = feePromotion;
    }

    public FeeDetail taxAmount(MoneyType taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Get taxAmount
     *
     * @return taxAmount
     **/
    @Schema(description = "")
    public MoneyType getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(MoneyType taxAmount) {
        this.taxAmount = taxAmount;
    }

    public FeeDetail finalFee(MoneyType finalFee) {
        this.finalFee = finalFee;
        return this;
    }

    /**
     * Get finalFee
     *
     * @return finalFee
     **/
    @Schema(required = true, description = "")
    public MoneyType getFinalFee() {
        return finalFee;
    }

    public void setFinalFee(MoneyType finalFee) {
        this.finalFee = finalFee;
    }

    public FeeDetail includedFeeDetailList(IncludedFeeDetailList includedFeeDetailList) {
        this.includedFeeDetailList = includedFeeDetailList;
        return this;
    }

    /**
     * Get includedFeeDetailList
     *
     * @return includedFeeDetailList
     **/
    @Schema(description = "")
    public IncludedFeeDetailList getIncludedFeeDetailList() {
        return includedFeeDetailList;
    }

    public void setIncludedFeeDetailList(IncludedFeeDetailList includedFeeDetailList) {
        this.includedFeeDetailList = includedFeeDetailList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeeDetail feeDetail = (FeeDetail) o;
        return Objects.equals(this.feeType, feeDetail.feeType) &&
                Objects.equals(this.feeAmount, feeDetail.feeAmount) &&
                Objects.equals(this.feePromotion, feeDetail.feePromotion) &&
                Objects.equals(this.taxAmount, feeDetail.taxAmount) &&
                Objects.equals(this.finalFee, feeDetail.finalFee) &&
                Objects.equals(this.includedFeeDetailList, feeDetail.includedFeeDetailList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, feeAmount, feePromotion, taxAmount, finalFee, includedFeeDetailList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeeDetail {\n");
        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
        sb.append("    feePromotion: ").append(toIndentedString(feePromotion)).append("\n");
        sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
        sb.append("    finalFee: ").append(toIndentedString(finalFee)).append("\n");
        sb.append("    includedFeeDetailList: ").append(toIndentedString(includedFeeDetailList)).append("\n");
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
