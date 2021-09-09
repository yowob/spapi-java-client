package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetFulfillmentOrderResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetFulfillmentOrderResult {
    @SerializedName("fulfillmentOrder")
    private FulfillmentOrder fulfillmentOrder = null;
    @SerializedName("fulfillmentOrderItems")
    private FulfillmentOrderItemList fulfillmentOrderItems = null;
    @SerializedName("fulfillmentShipments")
    private FulfillmentShipmentList fulfillmentShipments = null;
    @SerializedName("returnItems")
    private ReturnItemList returnItems = null;
    @SerializedName("returnAuthorizations")
    private ReturnAuthorizationList returnAuthorizations = null;

    public GetFulfillmentOrderResult fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
        this.fulfillmentOrder = fulfillmentOrder;
        return this;
    }

    /**
     * Get fulfillmentOrder
     *
     * @return fulfillmentOrder
     **/
    @Schema(required = true, description = "")
    public FulfillmentOrder getFulfillmentOrder() {
        return fulfillmentOrder;
    }

    public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
        this.fulfillmentOrder = fulfillmentOrder;
    }

    public GetFulfillmentOrderResult fulfillmentOrderItems(FulfillmentOrderItemList fulfillmentOrderItems) {
        this.fulfillmentOrderItems = fulfillmentOrderItems;
        return this;
    }

    /**
     * Get fulfillmentOrderItems
     *
     * @return fulfillmentOrderItems
     **/
    @Schema(required = true, description = "")
    public FulfillmentOrderItemList getFulfillmentOrderItems() {
        return fulfillmentOrderItems;
    }

    public void setFulfillmentOrderItems(FulfillmentOrderItemList fulfillmentOrderItems) {
        this.fulfillmentOrderItems = fulfillmentOrderItems;
    }

    public GetFulfillmentOrderResult fulfillmentShipments(FulfillmentShipmentList fulfillmentShipments) {
        this.fulfillmentShipments = fulfillmentShipments;
        return this;
    }

    /**
     * Get fulfillmentShipments
     *
     * @return fulfillmentShipments
     **/
    @Schema(description = "")
    public FulfillmentShipmentList getFulfillmentShipments() {
        return fulfillmentShipments;
    }

    public void setFulfillmentShipments(FulfillmentShipmentList fulfillmentShipments) {
        this.fulfillmentShipments = fulfillmentShipments;
    }

    public GetFulfillmentOrderResult returnItems(ReturnItemList returnItems) {
        this.returnItems = returnItems;
        return this;
    }

    /**
     * Get returnItems
     *
     * @return returnItems
     **/
    @Schema(required = true, description = "")
    public ReturnItemList getReturnItems() {
        return returnItems;
    }

    public void setReturnItems(ReturnItemList returnItems) {
        this.returnItems = returnItems;
    }

    public GetFulfillmentOrderResult returnAuthorizations(ReturnAuthorizationList returnAuthorizations) {
        this.returnAuthorizations = returnAuthorizations;
        return this;
    }

    /**
     * Get returnAuthorizations
     *
     * @return returnAuthorizations
     **/
    @Schema(required = true, description = "")
    public ReturnAuthorizationList getReturnAuthorizations() {
        return returnAuthorizations;
    }

    public void setReturnAuthorizations(ReturnAuthorizationList returnAuthorizations) {
        this.returnAuthorizations = returnAuthorizations;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetFulfillmentOrderResult getFulfillmentOrderResult = (GetFulfillmentOrderResult) o;
        return Objects.equals(this.fulfillmentOrder, getFulfillmentOrderResult.fulfillmentOrder) &&
                Objects.equals(this.fulfillmentOrderItems, getFulfillmentOrderResult.fulfillmentOrderItems) &&
                Objects.equals(this.fulfillmentShipments, getFulfillmentOrderResult.fulfillmentShipments) &&
                Objects.equals(this.returnItems, getFulfillmentOrderResult.returnItems) &&
                Objects.equals(this.returnAuthorizations, getFulfillmentOrderResult.returnAuthorizations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fulfillmentOrder, fulfillmentOrderItems, fulfillmentShipments, returnItems, returnAuthorizations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFulfillmentOrderResult {\n");
        sb.append("    fulfillmentOrder: ").append(toIndentedString(fulfillmentOrder)).append("\n");
        sb.append("    fulfillmentOrderItems: ").append(toIndentedString(fulfillmentOrderItems)).append("\n");
        sb.append("    fulfillmentShipments: ").append(toIndentedString(fulfillmentShipments)).append("\n");
        sb.append("    returnItems: ").append(toIndentedString(returnItems)).append("\n");
        sb.append("    returnAuthorizations: ").append(toIndentedString(returnAuthorizations)).append("\n");
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
