package com.amazon.spapi.models.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The order items list along with the order ID.
 */
@Schema(description = "The order items list along with the order ID.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class OrderItemsList {
    @SerializedName("OrderItems")
    private OrderItemList orderItems = null;
    @SerializedName("NextToken")
    private String nextToken = null;
    @SerializedName("AmazonOrderId")
    private String amazonOrderId = null;

    public OrderItemsList orderItems(OrderItemList orderItems) {
        this.orderItems = orderItems;
        return this;
    }

    /**
     * Get orderItems
     *
     * @return orderItems
     **/
    @Schema(required = true, description = "")
    public OrderItemList getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(OrderItemList orderItems) {
        this.orderItems = orderItems;
    }

    public OrderItemsList nextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * When present and not empty, pass this string token in the next request to return the next response page.
     *
     * @return nextToken
     **/
    @Schema(description = "When present and not empty, pass this string token in the next request to return the next response page.")
    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    public OrderItemsList amazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * An Amazon-defined order identifier, in 3-7-7 format.
     *
     * @return amazonOrderId
     **/
    @Schema(required = true, description = "An Amazon-defined order identifier, in 3-7-7 format.")
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderItemsList orderItemsList = (OrderItemsList) o;
        return Objects.equals(this.orderItems, orderItemsList.orderItems) &&
                Objects.equals(this.nextToken, orderItemsList.nextToken) &&
                Objects.equals(this.amazonOrderId, orderItemsList.amazonOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderItems, nextToken, amazonOrderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderItemsList {\n");
        sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
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
