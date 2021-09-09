package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Information related to a financial event group.
 */
@Schema(description = "Information related to a financial event group.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FinancialEventGroup {
    @SerializedName("FinancialEventGroupId")
    private String financialEventGroupId = null;
    @SerializedName("ProcessingStatus")
    private String processingStatus = null;
    @SerializedName("FundTransferStatus")
    private String fundTransferStatus = null;
    @SerializedName("OriginalTotal")
    private Currency originalTotal = null;
    @SerializedName("ConvertedTotal")
    private Currency convertedTotal = null;
    @SerializedName("FundTransferDate")
    private OffsetDateTime fundTransferDate = null;
    @SerializedName("TraceId")
    private String traceId = null;
    @SerializedName("AccountTail")
    private String accountTail = null;
    @SerializedName("BeginningBalance")
    private Currency beginningBalance = null;
    @SerializedName("FinancialEventGroupStart")
    private OffsetDateTime financialEventGroupStart = null;
    @SerializedName("FinancialEventGroupEnd")
    private OffsetDateTime financialEventGroupEnd = null;

    public FinancialEventGroup financialEventGroupId(String financialEventGroupId) {
        this.financialEventGroupId = financialEventGroupId;
        return this;
    }

    /**
     * A unique identifier for the financial event group.
     *
     * @return financialEventGroupId
     **/
    @Schema(description = "A unique identifier for the financial event group.")
    public String getFinancialEventGroupId() {
        return financialEventGroupId;
    }

    public void setFinancialEventGroupId(String financialEventGroupId) {
        this.financialEventGroupId = financialEventGroupId;
    }

    public FinancialEventGroup processingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
        return this;
    }

    /**
     * The processing status of the financial event group indicates whether the balance of the financial event group is settled.  Possible values:  * Open  * Closed
     *
     * @return processingStatus
     **/
    @Schema(description = "The processing status of the financial event group indicates whether the balance of the financial event group is settled.  Possible values:  * Open  * Closed")
    public String getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    public FinancialEventGroup fundTransferStatus(String fundTransferStatus) {
        this.fundTransferStatus = fundTransferStatus;
        return this;
    }

    /**
     * The status of the fund transfer.
     *
     * @return fundTransferStatus
     **/
    @Schema(description = "The status of the fund transfer.")
    public String getFundTransferStatus() {
        return fundTransferStatus;
    }

    public void setFundTransferStatus(String fundTransferStatus) {
        this.fundTransferStatus = fundTransferStatus;
    }

    public FinancialEventGroup originalTotal(Currency originalTotal) {
        this.originalTotal = originalTotal;
        return this;
    }

    /**
     * Get originalTotal
     *
     * @return originalTotal
     **/
    @Schema(description = "")
    public Currency getOriginalTotal() {
        return originalTotal;
    }

    public void setOriginalTotal(Currency originalTotal) {
        this.originalTotal = originalTotal;
    }

    public FinancialEventGroup convertedTotal(Currency convertedTotal) {
        this.convertedTotal = convertedTotal;
        return this;
    }

    /**
     * Get convertedTotal
     *
     * @return convertedTotal
     **/
    @Schema(description = "")
    public Currency getConvertedTotal() {
        return convertedTotal;
    }

    public void setConvertedTotal(Currency convertedTotal) {
        this.convertedTotal = convertedTotal;
    }

    public FinancialEventGroup fundTransferDate(OffsetDateTime fundTransferDate) {
        this.fundTransferDate = fundTransferDate;
        return this;
    }

    /**
     * Get fundTransferDate
     *
     * @return fundTransferDate
     **/
    @Schema(description = "")
    public OffsetDateTime getFundTransferDate() {
        return fundTransferDate;
    }

    public void setFundTransferDate(OffsetDateTime fundTransferDate) {
        this.fundTransferDate = fundTransferDate;
    }

    public FinancialEventGroup traceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * The trace identifier used by sellers to look up transactions externally.
     *
     * @return traceId
     **/
    @Schema(description = "The trace identifier used by sellers to look up transactions externally.")
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public FinancialEventGroup accountTail(String accountTail) {
        this.accountTail = accountTail;
        return this;
    }

    /**
     * The account tail of the payment instrument.
     *
     * @return accountTail
     **/
    @Schema(description = "The account tail of the payment instrument.")
    public String getAccountTail() {
        return accountTail;
    }

    public void setAccountTail(String accountTail) {
        this.accountTail = accountTail;
    }

    public FinancialEventGroup beginningBalance(Currency beginningBalance) {
        this.beginningBalance = beginningBalance;
        return this;
    }

    /**
     * Get beginningBalance
     *
     * @return beginningBalance
     **/
    @Schema(description = "")
    public Currency getBeginningBalance() {
        return beginningBalance;
    }

    public void setBeginningBalance(Currency beginningBalance) {
        this.beginningBalance = beginningBalance;
    }

    public FinancialEventGroup financialEventGroupStart(OffsetDateTime financialEventGroupStart) {
        this.financialEventGroupStart = financialEventGroupStart;
        return this;
    }

    /**
     * Get financialEventGroupStart
     *
     * @return financialEventGroupStart
     **/
    @Schema(description = "")
    public OffsetDateTime getFinancialEventGroupStart() {
        return financialEventGroupStart;
    }

    public void setFinancialEventGroupStart(OffsetDateTime financialEventGroupStart) {
        this.financialEventGroupStart = financialEventGroupStart;
    }

    public FinancialEventGroup financialEventGroupEnd(OffsetDateTime financialEventGroupEnd) {
        this.financialEventGroupEnd = financialEventGroupEnd;
        return this;
    }

    /**
     * Get financialEventGroupEnd
     *
     * @return financialEventGroupEnd
     **/
    @Schema(description = "")
    public OffsetDateTime getFinancialEventGroupEnd() {
        return financialEventGroupEnd;
    }

    public void setFinancialEventGroupEnd(OffsetDateTime financialEventGroupEnd) {
        this.financialEventGroupEnd = financialEventGroupEnd;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FinancialEventGroup financialEventGroup = (FinancialEventGroup) o;
        return Objects.equals(this.financialEventGroupId, financialEventGroup.financialEventGroupId) &&
                Objects.equals(this.processingStatus, financialEventGroup.processingStatus) &&
                Objects.equals(this.fundTransferStatus, financialEventGroup.fundTransferStatus) &&
                Objects.equals(this.originalTotal, financialEventGroup.originalTotal) &&
                Objects.equals(this.convertedTotal, financialEventGroup.convertedTotal) &&
                Objects.equals(this.fundTransferDate, financialEventGroup.fundTransferDate) &&
                Objects.equals(this.traceId, financialEventGroup.traceId) &&
                Objects.equals(this.accountTail, financialEventGroup.accountTail) &&
                Objects.equals(this.beginningBalance, financialEventGroup.beginningBalance) &&
                Objects.equals(this.financialEventGroupStart, financialEventGroup.financialEventGroupStart) &&
                Objects.equals(this.financialEventGroupEnd, financialEventGroup.financialEventGroupEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(financialEventGroupId, processingStatus, fundTransferStatus, originalTotal, convertedTotal, fundTransferDate, traceId, accountTail, beginningBalance, financialEventGroupStart, financialEventGroupEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FinancialEventGroup {\n");
        sb.append("    financialEventGroupId: ").append(toIndentedString(financialEventGroupId)).append("\n");
        sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
        sb.append("    fundTransferStatus: ").append(toIndentedString(fundTransferStatus)).append("\n");
        sb.append("    originalTotal: ").append(toIndentedString(originalTotal)).append("\n");
        sb.append("    convertedTotal: ").append(toIndentedString(convertedTotal)).append("\n");
        sb.append("    fundTransferDate: ").append(toIndentedString(fundTransferDate)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    accountTail: ").append(toIndentedString(accountTail)).append("\n");
        sb.append("    beginningBalance: ").append(toIndentedString(beginningBalance)).append("\n");
        sb.append("    financialEventGroupStart: ").append(toIndentedString(financialEventGroupStart)).append("\n");
        sb.append("    financialEventGroupEnd: ").append(toIndentedString(financialEventGroupEnd)).append("\n");
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
