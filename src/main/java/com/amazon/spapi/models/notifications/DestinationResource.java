package com.amazon.spapi.models.notifications;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The destination resource types.
 */
@Schema(description = "The destination resource types.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class DestinationResource {
    @SerializedName("sqs")
    private SqsResource sqs = null;
    @SerializedName("eventBridge")
    private EventBridgeResource eventBridge = null;

    public DestinationResource sqs(SqsResource sqs) {
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

    public DestinationResource eventBridge(EventBridgeResource eventBridge) {
        this.eventBridge = eventBridge;
        return this;
    }

    /**
     * Get eventBridge
     *
     * @return eventBridge
     **/
    @Schema(description = "")
    public EventBridgeResource getEventBridge() {
        return eventBridge;
    }

    public void setEventBridge(EventBridgeResource eventBridge) {
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
        DestinationResource destinationResource = (DestinationResource) o;
        return Objects.equals(this.sqs, destinationResource.sqs) &&
                Objects.equals(this.eventBridge, destinationResource.eventBridge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqs, eventBridge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DestinationResource {\n");
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
