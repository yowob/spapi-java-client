package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A loan advance, loan payment, or loan refund.
 */
@Schema(description = "A loan advance, loan payment, or loan refund.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class LoanServicingEvent {
    @SerializedName("LoanAmount")
    private Currency loanAmount = null;
    @SerializedName("SourceBusinessEventType")
    private String sourceBusinessEventType = null;

    public LoanServicingEvent loanAmount(Currency loanAmount) {
        this.loanAmount = loanAmount;
        return this;
    }

    /**
     * Get loanAmount
     *
     * @return loanAmount
     **/
    @Schema(description = "")
    public Currency getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Currency loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LoanServicingEvent sourceBusinessEventType(String sourceBusinessEventType) {
        this.sourceBusinessEventType = sourceBusinessEventType;
        return this;
    }

    /**
     * The type of event.  Possible values:  * LoanAdvance  * LoanPayment  * LoanRefund
     *
     * @return sourceBusinessEventType
     **/
    @Schema(description = "The type of event.  Possible values:  * LoanAdvance  * LoanPayment  * LoanRefund")
    public String getSourceBusinessEventType() {
        return sourceBusinessEventType;
    }

    public void setSourceBusinessEventType(String sourceBusinessEventType) {
        this.sourceBusinessEventType = sourceBusinessEventType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoanServicingEvent loanServicingEvent = (LoanServicingEvent) o;
        return Objects.equals(this.loanAmount, loanServicingEvent.loanAmount) &&
                Objects.equals(this.sourceBusinessEventType, loanServicingEvent.sourceBusinessEventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanAmount, sourceBusinessEventType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoanServicingEvent {\n");
        sb.append("    loanAmount: ").append(toIndentedString(loanAmount)).append("\n");
        sb.append("    sourceBusinessEventType: ").append(toIndentedString(sourceBusinessEventType)).append("\n");
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
