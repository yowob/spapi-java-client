package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Information for tracking package deliveries.
 */
@Schema(description = "Information for tracking package deliveries.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TrackingEvent {
    @SerializedName("eventDate")
    private OffsetDateTime eventDate = null;
    @SerializedName("eventAddress")
    private TrackingAddress eventAddress = null;
    @SerializedName("eventCode")
    private EventCode eventCode = null;
    @SerializedName("eventDescription")
    private String eventDescription = null;

    public TrackingEvent eventDate(OffsetDateTime eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    /**
     * Get eventDate
     *
     * @return eventDate
     **/
    @Schema(required = true, description = "")
    public OffsetDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(OffsetDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public TrackingEvent eventAddress(TrackingAddress eventAddress) {
        this.eventAddress = eventAddress;
        return this;
    }

    /**
     * Get eventAddress
     *
     * @return eventAddress
     **/
    @Schema(required = true, description = "")
    public TrackingAddress getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(TrackingAddress eventAddress) {
        this.eventAddress = eventAddress;
    }

    public TrackingEvent eventCode(EventCode eventCode) {
        this.eventCode = eventCode;
        return this;
    }

    /**
     * Get eventCode
     *
     * @return eventCode
     **/
    @Schema(required = true, description = "")
    public EventCode getEventCode() {
        return eventCode;
    }

    public void setEventCode(EventCode eventCode) {
        this.eventCode = eventCode;
    }

    public TrackingEvent eventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }

    /**
     * A description for the corresponding event code.
     *
     * @return eventDescription
     **/
    @Schema(required = true, description = "A description for the corresponding event code.")
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrackingEvent trackingEvent = (TrackingEvent) o;
        return Objects.equals(this.eventDate, trackingEvent.eventDate) &&
                Objects.equals(this.eventAddress, trackingEvent.eventAddress) &&
                Objects.equals(this.eventCode, trackingEvent.eventCode) &&
                Objects.equals(this.eventDescription, trackingEvent.eventDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventDate, eventAddress, eventCode, eventDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrackingEvent {\n");
        sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
        sb.append("    eventAddress: ").append(toIndentedString(eventAddress)).append("\n");
        sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
        sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
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
