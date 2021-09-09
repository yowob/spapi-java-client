package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Request schema.
 */
@Schema(description = "Request schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetAdditionalSellerInputsRequest {
    @SerializedName("ShippingServiceId")
    private String shippingServiceId = null;
    @SerializedName("ShipFromAddress")
    private Address shipFromAddress = null;
    @SerializedName("OrderId")
    private String orderId = null;

    public GetAdditionalSellerInputsRequest shippingServiceId(String shippingServiceId) {
        this.shippingServiceId = shippingServiceId;
        return this;
    }

    /**
     * Get shippingServiceId
     *
     * @return shippingServiceId
     **/
    @Schema(required = true, description = "")
    public String getShippingServiceId() {
        return shippingServiceId;
    }

    public void setShippingServiceId(String shippingServiceId) {
        this.shippingServiceId = shippingServiceId;
    }

    public GetAdditionalSellerInputsRequest shipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
        return this;
    }

    /**
     * Get shipFromAddress
     *
     * @return shipFromAddress
     **/
    @Schema(required = true, description = "")
    public Address getShipFromAddress() {
        return shipFromAddress;
    }

    public void setShipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
    }

    public GetAdditionalSellerInputsRequest orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Get orderId
     *
     * @return orderId
     **/
    @Schema(required = true, description = "")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAdditionalSellerInputsRequest getAdditionalSellerInputsRequest = (GetAdditionalSellerInputsRequest) o;
        return Objects.equals(this.shippingServiceId, getAdditionalSellerInputsRequest.shippingServiceId) &&
                Objects.equals(this.shipFromAddress, getAdditionalSellerInputsRequest.shipFromAddress) &&
                Objects.equals(this.orderId, getAdditionalSellerInputsRequest.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shippingServiceId, shipFromAddress, orderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAdditionalSellerInputsRequest {\n");
        sb.append("    shippingServiceId: ").append(toIndentedString(shippingServiceId)).append("\n");
        sb.append("    shipFromAddress: ").append(toIndentedString(shipFromAddress)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
