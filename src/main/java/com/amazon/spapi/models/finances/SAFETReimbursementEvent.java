package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * A SAFE-T claim reimbursement on the seller&#x27;s account.
 */
@Schema(description = "A SAFE-T claim reimbursement on the seller's account.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SAFETReimbursementEvent {
    @SerializedName("PostedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("SAFETClaimId")
    private String saFETClaimId = null;
    @SerializedName("ReimbursedAmount")
    private Currency reimbursedAmount = null;
    @SerializedName("ReasonCode")
    private String reasonCode = null;
    @SerializedName("SAFETReimbursementItemList")
    private SAFETReimbursementItemList saFETReimbursementItemList = null;

    public SAFETReimbursementEvent postedDate(OffsetDateTime postedDate) {
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

    public SAFETReimbursementEvent saFETClaimId(String saFETClaimId) {
        this.saFETClaimId = saFETClaimId;
        return this;
    }

    /**
     * A SAFE-T claim identifier.
     *
     * @return saFETClaimId
     **/
    @Schema(description = "A SAFE-T claim identifier.")
    public String getSaFETClaimId() {
        return saFETClaimId;
    }

    public void setSaFETClaimId(String saFETClaimId) {
        this.saFETClaimId = saFETClaimId;
    }

    public SAFETReimbursementEvent reimbursedAmount(Currency reimbursedAmount) {
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

    public SAFETReimbursementEvent reasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    /**
     * Indicates why the seller was reimbursed.
     *
     * @return reasonCode
     **/
    @Schema(description = "Indicates why the seller was reimbursed.")
    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public SAFETReimbursementEvent saFETReimbursementItemList(SAFETReimbursementItemList saFETReimbursementItemList) {
        this.saFETReimbursementItemList = saFETReimbursementItemList;
        return this;
    }

    /**
     * Get saFETReimbursementItemList
     *
     * @return saFETReimbursementItemList
     **/
    @Schema(description = "")
    public SAFETReimbursementItemList getSaFETReimbursementItemList() {
        return saFETReimbursementItemList;
    }

    public void setSaFETReimbursementItemList(SAFETReimbursementItemList saFETReimbursementItemList) {
        this.saFETReimbursementItemList = saFETReimbursementItemList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SAFETReimbursementEvent saFETReimbursementEvent = (SAFETReimbursementEvent) o;
        return Objects.equals(this.postedDate, saFETReimbursementEvent.postedDate) &&
                Objects.equals(this.saFETClaimId, saFETReimbursementEvent.saFETClaimId) &&
                Objects.equals(this.reimbursedAmount, saFETReimbursementEvent.reimbursedAmount) &&
                Objects.equals(this.reasonCode, saFETReimbursementEvent.reasonCode) &&
                Objects.equals(this.saFETReimbursementItemList, saFETReimbursementEvent.saFETReimbursementItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postedDate, saFETClaimId, reimbursedAmount, reasonCode, saFETReimbursementItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SAFETReimbursementEvent {\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    saFETClaimId: ").append(toIndentedString(saFETClaimId)).append("\n");
        sb.append("    reimbursedAmount: ").append(toIndentedString(reimbursedAmount)).append("\n");
        sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
        sb.append("    saFETReimbursementItemList: ").append(toIndentedString(saFETReimbursementItemList)).append("\n");
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
