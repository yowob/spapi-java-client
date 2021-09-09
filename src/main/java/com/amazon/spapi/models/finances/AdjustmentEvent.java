package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * An adjustment to the seller&#x27;s account.
 */
@Schema(description = "An adjustment to the seller's account.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AdjustmentEvent {
    @SerializedName("AdjustmentType")
    private String adjustmentType = null;
    @SerializedName("PostedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("AdjustmentAmount")
    private Currency adjustmentAmount = null;
    @SerializedName("AdjustmentItemList")
    private AdjustmentItemList adjustmentItemList = null;

    public AdjustmentEvent adjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * The type of adjustment.  Possible values:  * FBAInventoryReimbursement - An FBA inventory reimbursement to a seller&#x27;s account. This occurs if a seller&#x27;s inventory is damaged.  * ReserveEvent - A reserve event that is generated at the time of a settlement period closing. This occurs when some money from a seller&#x27;s account is held back.  * PostageBilling - The amount paid by a seller for shipping labels.  * PostageRefund - The reimbursement of shipping labels purchased for orders that were canceled or refunded.  * LostOrDamagedReimbursement - An Amazon Easy Ship reimbursement to a seller&#x27;s account for a package that we lost or damaged.  * CanceledButPickedUpReimbursement - An Amazon Easy Ship reimbursement to a seller&#x27;s account. This occurs when a package is picked up and the order is subsequently canceled. This value is used only in the India marketplace.  * ReimbursementClawback - An Amazon Easy Ship reimbursement clawback from a seller&#x27;s account. This occurs when a prior reimbursement is reversed. This value is used only in the India marketplace.  * SellerRewards - An award credited to a seller&#x27;s account for their participation in an offer in the Seller Rewards program. Applies only to the India marketplace.
     *
     * @return adjustmentType
     **/
    @Schema(description = "The type of adjustment.  Possible values:  * FBAInventoryReimbursement - An FBA inventory reimbursement to a seller's account. This occurs if a seller's inventory is damaged.  * ReserveEvent - A reserve event that is generated at the time of a settlement period closing. This occurs when some money from a seller's account is held back.  * PostageBilling - The amount paid by a seller for shipping labels.  * PostageRefund - The reimbursement of shipping labels purchased for orders that were canceled or refunded.  * LostOrDamagedReimbursement - An Amazon Easy Ship reimbursement to a seller's account for a package that we lost or damaged.  * CanceledButPickedUpReimbursement - An Amazon Easy Ship reimbursement to a seller's account. This occurs when a package is picked up and the order is subsequently canceled. This value is used only in the India marketplace.  * ReimbursementClawback - An Amazon Easy Ship reimbursement clawback from a seller's account. This occurs when a prior reimbursement is reversed. This value is used only in the India marketplace.  * SellerRewards - An award credited to a seller's account for their participation in an offer in the Seller Rewards program. Applies only to the India marketplace.")
    public String getAdjustmentType() {
        return adjustmentType;
    }

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public AdjustmentEvent postedDate(OffsetDateTime postedDate) {
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

    public AdjustmentEvent adjustmentAmount(Currency adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
        return this;
    }

    /**
     * Get adjustmentAmount
     *
     * @return adjustmentAmount
     **/
    @Schema(description = "")
    public Currency getAdjustmentAmount() {
        return adjustmentAmount;
    }

    public void setAdjustmentAmount(Currency adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    public AdjustmentEvent adjustmentItemList(AdjustmentItemList adjustmentItemList) {
        this.adjustmentItemList = adjustmentItemList;
        return this;
    }

    /**
     * Get adjustmentItemList
     *
     * @return adjustmentItemList
     **/
    @Schema(description = "")
    public AdjustmentItemList getAdjustmentItemList() {
        return adjustmentItemList;
    }

    public void setAdjustmentItemList(AdjustmentItemList adjustmentItemList) {
        this.adjustmentItemList = adjustmentItemList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdjustmentEvent adjustmentEvent = (AdjustmentEvent) o;
        return Objects.equals(this.adjustmentType, adjustmentEvent.adjustmentType) &&
                Objects.equals(this.postedDate, adjustmentEvent.postedDate) &&
                Objects.equals(this.adjustmentAmount, adjustmentEvent.adjustmentAmount) &&
                Objects.equals(this.adjustmentItemList, adjustmentEvent.adjustmentItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adjustmentType, postedDate, adjustmentAmount, adjustmentItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdjustmentEvent {\n");
        sb.append("    adjustmentType: ").append(toIndentedString(adjustmentType)).append("\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    adjustmentAmount: ").append(toIndentedString(adjustmentAmount)).append("\n");
        sb.append("    adjustmentItemList: ").append(toIndentedString(adjustmentItemList)).append("\n");
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
