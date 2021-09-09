package com.amazon.spapi.models.notifications;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The request schema for the createSubscription operation.
 */
@Schema(description = "The request schema for the createSubscription operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateSubscriptionRequest {
    @SerializedName("payloadVersion")
    private String payloadVersion = null;
    @SerializedName("destinationId")
    private String destinationId = null;

    public CreateSubscriptionRequest payloadVersion(String payloadVersion) {
        this.payloadVersion = payloadVersion;
        return this;
    }

    /**
     * The version of the payload object to be used in the notification.
     *
     * @return payloadVersion
     **/
    @Schema(description = "The version of the payload object to be used in the notification.")
    public String getPayloadVersion() {
        return payloadVersion;
    }

    public void setPayloadVersion(String payloadVersion) {
        this.payloadVersion = payloadVersion;
    }

    public CreateSubscriptionRequest destinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    /**
     * The identifier for the destination where notifications will be delivered.
     *
     * @return destinationId
     **/
    @Schema(description = "The identifier for the destination where notifications will be delivered.")
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
        CreateSubscriptionRequest createSubscriptionRequest = (CreateSubscriptionRequest) o;
        return Objects.equals(this.payloadVersion, createSubscriptionRequest.payloadVersion) &&
                Objects.equals(this.destinationId, createSubscriptionRequest.destinationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payloadVersion, destinationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubscriptionRequest {\n");
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
