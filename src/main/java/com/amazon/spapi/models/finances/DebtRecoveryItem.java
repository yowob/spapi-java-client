package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * An item of a debt payment or debt adjustment.
 */
@Schema(description = "An item of a debt payment or debt adjustment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class DebtRecoveryItem {
    @SerializedName("RecoveryAmount")
    private Currency recoveryAmount = null;
    @SerializedName("OriginalAmount")
    private Currency originalAmount = null;
    @SerializedName("GroupBeginDate")
    private OffsetDateTime groupBeginDate = null;
    @SerializedName("GroupEndDate")
    private OffsetDateTime groupEndDate = null;

    public DebtRecoveryItem recoveryAmount(Currency recoveryAmount) {
        this.recoveryAmount = recoveryAmount;
        return this;
    }

    /**
     * Get recoveryAmount
     *
     * @return recoveryAmount
     **/
    @Schema(description = "")
    public Currency getRecoveryAmount() {
        return recoveryAmount;
    }

    public void setRecoveryAmount(Currency recoveryAmount) {
        this.recoveryAmount = recoveryAmount;
    }

    public DebtRecoveryItem originalAmount(Currency originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }

    /**
     * Get originalAmount
     *
     * @return originalAmount
     **/
    @Schema(description = "")
    public Currency getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Currency originalAmount) {
        this.originalAmount = originalAmount;
    }

    public DebtRecoveryItem groupBeginDate(OffsetDateTime groupBeginDate) {
        this.groupBeginDate = groupBeginDate;
        return this;
    }

    /**
     * Get groupBeginDate
     *
     * @return groupBeginDate
     **/
    @Schema(description = "")
    public OffsetDateTime getGroupBeginDate() {
        return groupBeginDate;
    }

    public void setGroupBeginDate(OffsetDateTime groupBeginDate) {
        this.groupBeginDate = groupBeginDate;
    }

    public DebtRecoveryItem groupEndDate(OffsetDateTime groupEndDate) {
        this.groupEndDate = groupEndDate;
        return this;
    }

    /**
     * Get groupEndDate
     *
     * @return groupEndDate
     **/
    @Schema(description = "")
    public OffsetDateTime getGroupEndDate() {
        return groupEndDate;
    }

    public void setGroupEndDate(OffsetDateTime groupEndDate) {
        this.groupEndDate = groupEndDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DebtRecoveryItem debtRecoveryItem = (DebtRecoveryItem) o;
        return Objects.equals(this.recoveryAmount, debtRecoveryItem.recoveryAmount) &&
                Objects.equals(this.originalAmount, debtRecoveryItem.originalAmount) &&
                Objects.equals(this.groupBeginDate, debtRecoveryItem.groupBeginDate) &&
                Objects.equals(this.groupEndDate, debtRecoveryItem.groupEndDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recoveryAmount, originalAmount, groupBeginDate, groupEndDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebtRecoveryItem {\n");
        sb.append("    recoveryAmount: ").append(toIndentedString(recoveryAmount)).append("\n");
        sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
        sb.append("    groupBeginDate: ").append(toIndentedString(groupBeginDate)).append("\n");
        sb.append("    groupEndDate: ").append(toIndentedString(groupEndDate)).append("\n");
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
