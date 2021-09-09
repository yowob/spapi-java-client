package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ListAllFulfillmentOrdersResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ListAllFulfillmentOrdersResult {
    @SerializedName("nextToken")
    private String nextToken = null;
    @SerializedName("fulfillmentOrders")
    private List<FulfillmentOrder> fulfillmentOrders = null;

    public ListAllFulfillmentOrdersResult nextToken(String nextToken) {
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

    public ListAllFulfillmentOrdersResult fulfillmentOrders(List<FulfillmentOrder> fulfillmentOrders) {
        this.fulfillmentOrders = fulfillmentOrders;
        return this;
    }

    public ListAllFulfillmentOrdersResult addFulfillmentOrdersItem(FulfillmentOrder fulfillmentOrdersItem) {
        if (this.fulfillmentOrders == null) {
            this.fulfillmentOrders = new ArrayList<FulfillmentOrder>();
        }
        this.fulfillmentOrders.add(fulfillmentOrdersItem);
        return this;
    }

    /**
     * An array of fulfillment order information.
     *
     * @return fulfillmentOrders
     **/
    @Schema(description = "An array of fulfillment order information.")
    public List<FulfillmentOrder> getFulfillmentOrders() {
        return fulfillmentOrders;
    }

    public void setFulfillmentOrders(List<FulfillmentOrder> fulfillmentOrders) {
        this.fulfillmentOrders = fulfillmentOrders;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAllFulfillmentOrdersResult listAllFulfillmentOrdersResult = (ListAllFulfillmentOrdersResult) o;
        return Objects.equals(this.nextToken, listAllFulfillmentOrdersResult.nextToken) &&
                Objects.equals(this.fulfillmentOrders, listAllFulfillmentOrdersResult.fulfillmentOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextToken, fulfillmentOrders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllFulfillmentOrdersResult {\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    fulfillmentOrders: ").append(toIndentedString(fulfillmentOrders)).append("\n");
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
