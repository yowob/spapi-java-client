package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * An event related to a trial shipment.
 */
@Schema(description = "An event related to a trial shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TrialShipmentEvent {
    @SerializedName("AmazonOrderId")
    private String amazonOrderId = null;
    @SerializedName("FinancialEventGroupId")
    private String financialEventGroupId = null;
    @SerializedName("PostedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("SKU")
    private String SKU = null;
    @SerializedName("FeeList")
    private FeeComponentList feeList = null;

    public TrialShipmentEvent amazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * An Amazon-defined identifier for an order.
     *
     * @return amazonOrderId
     **/
    @Schema(description = "An Amazon-defined identifier for an order.")
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    public TrialShipmentEvent financialEventGroupId(String financialEventGroupId) {
        this.financialEventGroupId = financialEventGroupId;
        return this;
    }

    /**
     * The identifier of the financial event group.
     *
     * @return financialEventGroupId
     **/
    @Schema(description = "The identifier of the financial event group.")
    public String getFinancialEventGroupId() {
        return financialEventGroupId;
    }

    public void setFinancialEventGroupId(String financialEventGroupId) {
        this.financialEventGroupId = financialEventGroupId;
    }

    public TrialShipmentEvent postedDate(OffsetDateTime postedDate) {
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

    public TrialShipmentEvent SKU(String SKU) {
        this.SKU = SKU;
        return this;
    }

    /**
     * The seller SKU of the item. The seller SKU is qualified by the seller&#x27;s seller ID, which is included with every call to the Selling Partner API.
     *
     * @return SKU
     **/
    @Schema(description = "The seller SKU of the item. The seller SKU is qualified by the seller's seller ID, which is included with every call to the Selling Partner API.")
    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public TrialShipmentEvent feeList(FeeComponentList feeList) {
        this.feeList = feeList;
        return this;
    }

    /**
     * Get feeList
     *
     * @return feeList
     **/
    @Schema(description = "")
    public FeeComponentList getFeeList() {
        return feeList;
    }

    public void setFeeList(FeeComponentList feeList) {
        this.feeList = feeList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrialShipmentEvent trialShipmentEvent = (TrialShipmentEvent) o;
        return Objects.equals(this.amazonOrderId, trialShipmentEvent.amazonOrderId) &&
                Objects.equals(this.financialEventGroupId, trialShipmentEvent.financialEventGroupId) &&
                Objects.equals(this.postedDate, trialShipmentEvent.postedDate) &&
                Objects.equals(this.SKU, trialShipmentEvent.SKU) &&
                Objects.equals(this.feeList, trialShipmentEvent.feeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amazonOrderId, financialEventGroupId, postedDate, SKU, feeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrialShipmentEvent {\n");
        sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
        sb.append("    financialEventGroupId: ").append(toIndentedString(financialEventGroupId)).append("\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    SKU: ").append(toIndentedString(SKU)).append("\n");
        sb.append("    feeList: ").append(toIndentedString(feeList)).append("\n");
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
