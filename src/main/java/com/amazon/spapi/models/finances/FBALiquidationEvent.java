package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * A payment event for Fulfillment by Amazon (FBA) inventory liquidation. This event is used only in the US marketplace.
 */
@Schema(description = "A payment event for Fulfillment by Amazon (FBA) inventory liquidation. This event is used only in the US marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FBALiquidationEvent {
    @SerializedName("PostedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("OriginalRemovalOrderId")
    private String originalRemovalOrderId = null;
    @SerializedName("LiquidationProceedsAmount")
    private Currency liquidationProceedsAmount = null;
    @SerializedName("LiquidationFeeAmount")
    private Currency liquidationFeeAmount = null;

    public FBALiquidationEvent postedDate(OffsetDateTime postedDate) {
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

    public FBALiquidationEvent originalRemovalOrderId(String originalRemovalOrderId) {
        this.originalRemovalOrderId = originalRemovalOrderId;
        return this;
    }

    /**
     * The identifier for the original removal order.
     *
     * @return originalRemovalOrderId
     **/
    @Schema(description = "The identifier for the original removal order.")
    public String getOriginalRemovalOrderId() {
        return originalRemovalOrderId;
    }

    public void setOriginalRemovalOrderId(String originalRemovalOrderId) {
        this.originalRemovalOrderId = originalRemovalOrderId;
    }

    public FBALiquidationEvent liquidationProceedsAmount(Currency liquidationProceedsAmount) {
        this.liquidationProceedsAmount = liquidationProceedsAmount;
        return this;
    }

    /**
     * Get liquidationProceedsAmount
     *
     * @return liquidationProceedsAmount
     **/
    @Schema(description = "")
    public Currency getLiquidationProceedsAmount() {
        return liquidationProceedsAmount;
    }

    public void setLiquidationProceedsAmount(Currency liquidationProceedsAmount) {
        this.liquidationProceedsAmount = liquidationProceedsAmount;
    }

    public FBALiquidationEvent liquidationFeeAmount(Currency liquidationFeeAmount) {
        this.liquidationFeeAmount = liquidationFeeAmount;
        return this;
    }

    /**
     * Get liquidationFeeAmount
     *
     * @return liquidationFeeAmount
     **/
    @Schema(description = "")
    public Currency getLiquidationFeeAmount() {
        return liquidationFeeAmount;
    }

    public void setLiquidationFeeAmount(Currency liquidationFeeAmount) {
        this.liquidationFeeAmount = liquidationFeeAmount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FBALiquidationEvent fbALiquidationEvent = (FBALiquidationEvent) o;
        return Objects.equals(this.postedDate, fbALiquidationEvent.postedDate) &&
                Objects.equals(this.originalRemovalOrderId, fbALiquidationEvent.originalRemovalOrderId) &&
                Objects.equals(this.liquidationProceedsAmount, fbALiquidationEvent.liquidationProceedsAmount) &&
                Objects.equals(this.liquidationFeeAmount, fbALiquidationEvent.liquidationFeeAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postedDate, originalRemovalOrderId, liquidationProceedsAmount, liquidationFeeAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FBALiquidationEvent {\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    originalRemovalOrderId: ").append(toIndentedString(originalRemovalOrderId)).append("\n");
        sb.append("    liquidationProceedsAmount: ").append(toIndentedString(liquidationProceedsAmount)).append("\n");
        sb.append("    liquidationFeeAmount: ").append(toIndentedString(liquidationFeeAmount)).append("\n");
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
