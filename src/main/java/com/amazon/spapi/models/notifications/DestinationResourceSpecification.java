package com.amazon.spapi.models.notifications;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The information required to create a destination resource. Applications should use one resource type (sqs or eventBridge) per destination.
 */
@Schema(description = "The information required to create a destination resource. Applications should use one resource type (sqs or eventBridge) per destination.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class DestinationResourceSpecification {
    @SerializedName("sqs")
    private SqsResource sqs = null;
    @SerializedName("eventBridge")
    private EventBridgeResourceSpecification eventBridge = null;

    public DestinationResourceSpecification sqs(SqsResource sqs) {
        this.sqs = sqs;
        return this;
    }

    /**
     * Get sqs
     *
     * @return sqs
     **/
    @Schema(description = "")
    public SqsResource getSqs() {
        return sqs;
    }

    public void setSqs(SqsResource sqs) {
        this.sqs = sqs;
    }

    public DestinationResourceSpecification eventBridge(EventBridgeResourceSpecification eventBridge) {
        this.eventBridge = eventBridge;
        return this;
    }

    /**
     * Get eventBridge
     *
     * @return eventBridge
     **/
    @Schema(description = "")
    public EventBridgeResourceSpecification getEventBridge() {
        return eventBridge;
    }

    public void setEventBridge(EventBridgeResourceSpecification eventBridge) {
        this.eventBridge = eventBridge;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DestinationResourceSpecification destinationResourceSpecification = (DestinationResourceSpecification) o;
        return Objects.equals(this.sqs, destinationResourceSpecification.sqs) &&
                Objects.equals(this.eventBridge, destinationResourceSpecification.eventBridge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqs, eventBridge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DestinationResourceSpecification {\n");
        sb.append("    sqs: ").append(toIndentedString(sqs)).append("\n");
        sb.append("    eventBridge: ").append(toIndentedString(eventBridge)).append("\n");
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
