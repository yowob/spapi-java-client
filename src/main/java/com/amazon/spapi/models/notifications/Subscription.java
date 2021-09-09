package com.amazon.spapi.models.notifications;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Represents a subscription to receive notifications.
 */
@Schema(description = "Represents a subscription to receive notifications.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Subscription {
    @SerializedName("subscriptionId")
    private String subscriptionId = null;
    @SerializedName("payloadVersion")
    private String payloadVersion = null;
    @SerializedName("destinationId")
    private String destinationId = null;

    public Subscription subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * The subscription identifier generated when the subscription is created.
     *
     * @return subscriptionId
     **/
    @Schema(required = true, description = "The subscription identifier generated when the subscription is created.")
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Subscription payloadVersion(String payloadVersion) {
        this.payloadVersion = payloadVersion;
        return this;
    }

    /**
     * The version of the payload object to be used in the notification.
     *
     * @return payloadVersion
     **/
    @Schema(required = true, description = "The version of the payload object to be used in the notification.")
    public String getPayloadVersion() {
        return payloadVersion;
    }

    public void setPayloadVersion(String payloadVersion) {
        this.payloadVersion = payloadVersion;
    }

    public Subscription destinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    /**
     * The identifier for the destination where notifications will be delivered.
     *
     * @return destinationId
     **/
    @Schema(required = true, description = "The identifier for the destination where notifications will be delivered.")
    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subscription subscription = (Subscription) o;
        return Objects.equals(this.subscriptionId, subscription.subscriptionId) &&
                Objects.equals(this.payloadVersion, subscription.payloadVersion) &&
                Objects.equals(this.destinationId, subscription.destinationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionId, payloadVersion, destinationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Subscription {\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    payloadVersion: ").append(toIndentedString(payloadVersion)).append("\n");
        sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
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
