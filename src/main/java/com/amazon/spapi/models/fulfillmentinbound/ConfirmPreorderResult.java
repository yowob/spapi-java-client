package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;

import java.util.Objects;

/**
 * ConfirmPreorderResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ConfirmPreorderResult {
    @SerializedName("ConfirmedNeedByDate")
    private LocalDate confirmedNeedByDate = null;
    @SerializedName("ConfirmedFulfillableDate")
    private LocalDate confirmedFulfillableDate = null;

    public ConfirmPreorderResult confirmedNeedByDate(LocalDate confirmedNeedByDate) {
        this.confirmedNeedByDate = confirmedNeedByDate;
        return this;
    }

    /**
     * Get confirmedNeedByDate
     *
     * @return confirmedNeedByDate
     **/
    @Schema(description = "")
    public LocalDate getConfirmedNeedByDate() {
        return confirmedNeedByDate;
    }

    public void setConfirmedNeedByDate(LocalDate confirmedNeedByDate) {
        this.confirmedNeedByDate = confirmedNeedByDate;
    }

    public ConfirmPreorderResult confirmedFulfillableDate(LocalDate confirmedFulfillableDate) {
        this.confirmedFulfillableDate = confirmedFulfillableDate;
        return this;
    }

    /**
     * Get confirmedFulfillableDate
     *
     * @return confirmedFulfillableDate
     **/
    @Schema(description = "")
    public LocalDate getConfirmedFulfillableDate() {
        return confirmedFulfillableDate;
    }

    public void setConfirmedFulfillableDate(LocalDate confirmedFulfillableDate) {
        this.confirmedFulfillableDate = confirmedFulfillableDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfirmPreorderResult confirmPreorderResult = (ConfirmPreorderResult) o;
        return Objects.equals(this.confirmedNeedByDate, confirmPreorderResult.confirmedNeedByDate) &&
                Objects.equals(this.confirmedFulfillableDate, confirmPreorderResult.confirmedFulfillableDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confirmedNeedByDate, confirmedFulfillableDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmPreorderResult {\n");
        sb.append("    confirmedNeedByDate: ").append(toIndentedString(confirmedNeedByDate)).append("\n");
        sb.append("    confirmedFulfillableDate: ").append(toIndentedString(confirmedFulfillableDate)).append("\n");
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
