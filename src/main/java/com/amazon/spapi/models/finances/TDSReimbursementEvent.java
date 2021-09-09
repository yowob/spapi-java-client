package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * A tax deduction at source (TDS) claim reimbursement event on the seller&#x27;s account.
 */
@Schema(description = "A tax deduction at source (TDS) claim reimbursement event on the seller's account.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TDSReimbursementEvent {
    @SerializedName("PostedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("TdsOrderId")
    private String tdsOrderId = null;
    @SerializedName("ReimbursedAmount")
    private Currency reimbursedAmount = null;

    public TDSReimbursementEvent postedDate(OffsetDateTime postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get postedDate
     *
     * @return postedDate
     **/
    @Schema(description = "")
    public OffsetDateTime getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(OffsetDateTime postedDate) {
        this.postedDate = postedDate;
    }

    public TDSReimbursementEvent tdsOrderId(String tdsOrderId) {
        this.tdsOrderId = tdsOrderId;
        return this;
    }

    /**
     * A tax deduction at source (TDS) claim identifier.
     *
     * @return tdsOrderId
     **/
    @Schema(description = "A tax deduction at source (TDS) claim identifier.")
    public String getTdsOrderId() {
        return tdsOrderId;
    }

    public void setTdsOrderId(String tdsOrderId) {
        this.tdsOrderId = tdsOrderId;
    }

    public TDSReimbursementEvent reimbursedAmount(Currency reimbursedAmount) {
        this.reimbursedAmount = reimbursedAmount;
        return this;
    }

    /**
     * Get reimbursedAmount
     *
     * @return reimbursedAmount
     **/
    @Schema(description = "")
    public Currency getReimbursedAmount() {
        return reimbursedAmount;
    }

    public void setReimbursedAmount(Currency reimbursedAmount) {
        this.reimbursedAmount = reimbursedAmount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TDSReimbursementEvent tdSReimbursementEvent = (TDSReimbursementEvent) o;
        return Objects.equals(this.postedDate, tdSReimbursementEvent.postedDate) &&
                Objects.equals(this.tdsOrderId, tdSReimbursementEvent.tdsOrderId) &&
                Objects.equals(this.reimbursedAmount, tdSReimbursementEvent.reimbursedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postedDate, tdsOrderId, reimbursedAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TDSReimbursementEvent {\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    tdsOrderId: ").append(toIndentedString(tdsOrderId)).append("\n");
        sb.append("    reimbursedAmount: ").append(toIndentedString(reimbursedAmount)).append("\n");
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
