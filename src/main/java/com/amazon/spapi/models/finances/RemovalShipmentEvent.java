package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * A removal shipment event for a removal order.
 */
@Schema(description = "A removal shipment event for a removal order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class RemovalShipmentEvent {
    @SerializedName("PostedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("OrderId")
    private String orderId = null;
    @SerializedName("TransactionType")
    private String transactionType = null;
    @SerializedName("RemovalShipmentItemList")
    private RemovalShipmentItemList removalShipmentItemList = null;

    public RemovalShipmentEvent postedDate(OffsetDateTime postedDate) {
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

    public RemovalShipmentEvent orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * The identifier for the removal shipment order.
     *
     * @return orderId
     **/
    @Schema(description = "The identifier for the removal shipment order.")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public RemovalShipmentEvent transactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * The type of removal order.  Possible values:  * WHOLESALE_LIQUIDATION
     *
     * @return transactionType
     **/
    @Schema(description = "The type of removal order.  Possible values:  * WHOLESALE_LIQUIDATION")
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public RemovalShipmentEvent removalShipmentItemList(RemovalShipmentItemList removalShipmentItemList) {
        this.removalShipmentItemList = removalShipmentItemList;
        return this;
    }

    /**
     * Get removalShipmentItemList
     *
     * @return removalShipmentItemList
     **/
    @Schema(description = "")
    public RemovalShipmentItemList getRemovalShipmentItemList() {
        return removalShipmentItemList;
    }

    public void setRemovalShipmentItemList(RemovalShipmentItemList removalShipmentItemList) {
        this.removalShipmentItemList = removalShipmentItemList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemovalShipmentEvent removalShipmentEvent = (RemovalShipmentEvent) o;
        return Objects.equals(this.postedDate, removalShipmentEvent.postedDate) &&
                Objects.equals(this.orderId, removalShipmentEvent.orderId) &&
                Objects.equals(this.transactionType, removalShipmentEvent.transactionType) &&
                Objects.equals(this.removalShipmentItemList, removalShipmentEvent.removalShipmentItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postedDate, orderId, transactionType, removalShipmentItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemovalShipmentEvent {\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    removalShipmentItemList: ").append(toIndentedString(removalShipmentItemList)).append("\n");
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
