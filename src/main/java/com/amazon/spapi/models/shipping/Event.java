package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * An event of a shipment
 */
@Schema(description = "An event of a shipment")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Event {
    @SerializedName("eventCode")
    private String eventCode = null;
    @SerializedName("eventTime")
    private OffsetDateTime eventTime = null;
    @SerializedName("location")
    private Location location = null;

    public Event eventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }

    /**
     * Get eventCode
     *
     * @return eventCode
     **/
    @Schema(required = true, description = "")
    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public Event eventTime(OffsetDateTime eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * The date and time of an event for a shipment.
     *
     * @return eventTime
     **/
    @Schema(required = true, description = "The date and time of an event for a shipment.")
    public OffsetDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(OffsetDateTime eventTime) {
        this.eventTime = eventTime;
    }

    public Event location(Location location) {
        this.location = location;
        return this;
    }

    /**
     * Get location
     *
     * @return location
     **/
    @Schema(description = "")
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(this.eventCode, event.eventCode) &&
                Objects.equals(this.eventTime, event.eventTime) &&
                Objects.equals(this.location, event.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventCode, eventTime, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
        sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
