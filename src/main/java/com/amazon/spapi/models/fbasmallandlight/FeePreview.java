package com.amazon.spapi.models.fbasmallandlight;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The fee estimate for a specific item.
 */
@Schema(description = "The fee estimate for a specific item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FeePreview {
    @SerializedName("asin")
    private String asin = null;
    @SerializedName("price")
    private MoneyType price = null;
    @SerializedName("feeBreakdown")
    private List<FeeLineItem> feeBreakdown = null;
    @SerializedName("totalFees")
    private MoneyType totalFees = null;
    @SerializedName("errors")
    private List<Error> errors = null;

    public FeePreview asin(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) value used to identify the item.
     *
     * @return asin
     **/
    @Schema(description = "The Amazon Standard Identification Number (ASIN) value used to identify the item.")
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public FeePreview price(MoneyType price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/
    @Schema(description = "")
    public MoneyType getPrice() {
        return price;
    }

    public void setPrice(MoneyType price) {
        this.price = price;
    }

    public FeePreview feeBreakdown(List<FeeLineItem> feeBreakdown) {
        this.feeBreakdown = feeBreakdown;
        return this;
    }

    public FeePreview addFeeBreakdownItem(FeeLineItem feeBreakdownItem) {
        if (this.feeBreakdown == null) {
            this.feeBreakdown = new ArrayList<FeeLineItem>();
        }
        this.feeBreakdown.add(feeBreakdownItem);
        return this;
    }

    /**
     * A list of the Small and Light fees for the item.
     *
     * @return feeBreakdown
     **/
    @Schema(description = "A list of the Small and Light fees for the item.")
    public List<FeeLineItem> getFeeBreakdown() {
        return feeBreakdown;
    }

    public void setFeeBreakdown(List<FeeLineItem> feeBreakdown) {
        this.feeBreakdown = feeBreakdown;
    }

    public FeePreview totalFees(MoneyType totalFees) {
        this.totalFees = totalFees;
        return this;
    }

    /**
     * Get totalFees
     *
     * @return totalFees
     **/
    @Schema(description = "")
    public MoneyType getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(MoneyType totalFees) {
        this.totalFees = totalFees;
    }

    public FeePreview errors(List<Error> errors) {
        this.errors = errors;
        return this;
    }

    public FeePreview addErrorsItem(Error errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<Error>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * One or more unexpected errors occurred during the getSmallAndLightFeePreview operation.
     *
     * @return errors
     **/
    @Schema(description = "One or more unexpected errors occurred during the getSmallAndLightFeePreview operation.")
    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
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
        FeePreview feePreview = (FeePreview) o;
        return Objects.equals(this.asin, feePreview.asin) &&
                Objects.equals(this.price, feePreview.price) &&
                Objects.equals(this.feeBreakdown, feePreview.feeBreakdown) &&
                Objects.equals(this.totalFees, feePreview.totalFees) &&
                Objects.equals(this.errors, feePreview.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asin, price, feeBreakdown, totalFees, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeePreview {\n");
        sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    feeBreakdown: ").append(toIndentedString(feeBreakdown)).append("\n");
        sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
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
