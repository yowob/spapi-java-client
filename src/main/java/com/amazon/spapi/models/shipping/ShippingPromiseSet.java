package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The promised delivery time and pickup time.
 */
@Schema(description = "The promised delivery time and pickup time.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ShippingPromiseSet {
    @SerializedName("deliveryWindow")
    private TimeRange deliveryWindow = null;
    @SerializedName("receiveWindow")
    private TimeRange receiveWindow = null;

    public ShippingPromiseSet deliveryWindow(TimeRange deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
        return this;
    }

    /**
     * Get deliveryWindow
     *
     * @return deliveryWindow
     **/
    @Schema(description = "")
    public TimeRange getDeliveryWindow() {
        return deliveryWindow;
    }

    public void setDeliveryWindow(TimeRange deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
    }

    public ShippingPromiseSet receiveWindow(TimeRange receiveWindow) {
        this.receiveWindow = receiveWindow;
        return this;
    }

    /**
     * Get receiveWindow
     *
     * @return receiveWindow
     **/
    @Schema(description = "")
    public TimeRange getReceiveWindow() {
        return receiveWindow;
    }

    public void setReceiveWindow(TimeRange receiveWindow) {
        this.receiveWindow = receiveWindow;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShippingPromiseSet shippingPromiseSet = (ShippingPromiseSet) o;
        return Objects.equals(this.deliveryWindow, shippingPromiseSet.deliveryWindow) &&
                Objects.equals(this.receiveWindow, shippingPromiseSet.receiveWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryWindow, receiveWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShippingPromiseSet {\n");
        sb.append("    deliveryWindow: ").append(toIndentedString(deliveryWindow)).append("\n");
        sb.append("    receiveWindow: ").append(toIndentedString(receiveWindow)).append("\n");
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
