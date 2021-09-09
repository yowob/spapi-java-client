package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Delivery information for a scheduled delivery.
 */
@Schema(description = "Delivery information for a scheduled delivery.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ScheduledDeliveryInfo {
    @SerializedName("deliveryTimeZone")
    private String deliveryTimeZone = null;
    @SerializedName("deliveryWindows")
    private DeliveryWindowList deliveryWindows = null;

    public ScheduledDeliveryInfo deliveryTimeZone(String deliveryTimeZone) {
        this.deliveryTimeZone = deliveryTimeZone;
        return this;
    }

    /**
     * The time zone of the destination address for the fulfillment order preview. Must be an IANA time zone name. Example: Asia/Tokyo.
     *
     * @return deliveryTimeZone
     **/
    @Schema(required = true, description = "The time zone of the destination address for the fulfillment order preview. Must be an IANA time zone name. Example: Asia/Tokyo.")
    public String getDeliveryTimeZone() {
        return deliveryTimeZone;
    }

    public void setDeliveryTimeZone(String deliveryTimeZone) {
        this.deliveryTimeZone = deliveryTimeZone;
    }

    public ScheduledDeliveryInfo deliveryWindows(DeliveryWindowList deliveryWindows) {
        this.deliveryWindows = deliveryWindows;
        return this;
    }

    /**
     * Get deliveryWindows
     *
     * @return deliveryWindows
     **/
    @Schema(required = true, description = "")
    public DeliveryWindowList getDeliveryWindows() {
        return deliveryWindows;
    }

    public void setDeliveryWindows(DeliveryWindowList deliveryWindows) {
        this.deliveryWindows = deliveryWindows;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScheduledDeliveryInfo scheduledDeliveryInfo = (ScheduledDeliveryInfo) o;
        return Objects.equals(this.deliveryTimeZone, scheduledDeliveryInfo.deliveryTimeZone) &&
                Objects.equals(this.deliveryWindows, scheduledDeliveryInfo.deliveryWindows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryTimeZone, deliveryWindows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduledDeliveryInfo {\n");
        sb.append("    deliveryTimeZone: ").append(toIndentedString(deliveryTimeZone)).append("\n");
        sb.append("    deliveryWindows: ").append(toIndentedString(deliveryWindows)).append("\n");
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
