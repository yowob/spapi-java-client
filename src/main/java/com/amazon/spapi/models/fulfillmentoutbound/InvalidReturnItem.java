package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * An item that is invalid for return.
 */
@Schema(description = "An item that is invalid for return.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class InvalidReturnItem {
    @SerializedName("sellerReturnItemId")
    private String sellerReturnItemId = null;
    @SerializedName("sellerFulfillmentOrderItemId")
    private String sellerFulfillmentOrderItemId = null;
    @SerializedName("invalidItemReason")
    private InvalidItemReason invalidItemReason = null;

    public InvalidReturnItem sellerReturnItemId(String sellerReturnItemId) {
        this.sellerReturnItemId = sellerReturnItemId;
        return this;
    }

    /**
     * An identifier assigned by the seller to the return item.
     *
     * @return sellerReturnItemId
     **/
    @Schema(required = true, description = "An identifier assigned by the seller to the return item.")
    public String getSellerReturnItemId() {
        return sellerReturnItemId;
    }

    public void setSellerReturnItemId(String sellerReturnItemId) {
        this.sellerReturnItemId = sellerReturnItemId;
    }

    public InvalidReturnItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
        return this;
    }

    /**
     * The identifier assigned to the item by the seller when the fulfillment order was created.
     *
     * @return sellerFulfillmentOrderItemId
     **/
    @Schema(required = true, description = "The identifier assigned to the item by the seller when the fulfillment order was created.")
    public String getSellerFulfillmentOrderItemId() {
        return sellerFulfillmentOrderItemId;
    }

    public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
        this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    }

    public InvalidReturnItem invalidItemReason(InvalidItemReason invalidItemReason) {
        this.invalidItemReason = invalidItemReason;
        return this;
    }

    /**
     * Get invalidItemReason
     *
     * @return invalidItemReason
     **/
    @Schema(required = true, description = "")
    public InvalidItemReason getInvalidItemReason() {
        return invalidItemReason;
    }

    public void setInvalidItemReason(InvalidItemReason invalidItemReason) {
        this.invalidItemReason = invalidItemReason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvalidReturnItem invalidReturnItem = (InvalidReturnItem) o;
        return Objects.equals(this.sellerReturnItemId, invalidReturnItem.sellerReturnItemId) &&
                Objects.equals(this.sellerFulfillmentOrderItemId, invalidReturnItem.sellerFulfillmentOrderItemId) &&
                Objects.equals(this.invalidItemReason, invalidReturnItem.invalidItemReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerReturnItemId, sellerFulfillmentOrderItemId, invalidItemReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvalidReturnItem {\n");
        sb.append("    sellerReturnItemId: ").append(toIndentedString(sellerReturnItemId)).append("\n");
        sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
        sb.append("    invalidItemReason: ").append(toIndentedString(invalidItemReason)).append("\n");
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
