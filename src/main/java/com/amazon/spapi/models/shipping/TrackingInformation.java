package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * The payload schema for the getTrackingInformation operation.
 */
@Schema(description = "The payload schema for the getTrackingInformation operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TrackingInformation {
    @SerializedName("trackingId")
    private String trackingId = null;
    @SerializedName("summary")
    private TrackingSummary summary = null;
    @SerializedName("promisedDeliveryDate")
    private OffsetDateTime promisedDeliveryDate = null;
    @SerializedName("eventHistory")
    private EventList eventHistory = null;

    public TrackingInformation trackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get trackingId
     *
     * @return trackingId
     **/
    @Schema(required = true, description = "")
    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public TrackingInformation summary(TrackingSummary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get summary
     *
     * @return summary
     **/
    @Schema(required = true, description = "")
    public TrackingSummary getSummary() {
        return summary;
    }

    public void setSummary(TrackingSummary summary) {
        this.summary = summary;
    }

    public TrackingInformation promisedDeliveryDate(OffsetDateTime promisedDeliveryDate) {
        this.promisedDeliveryDate = promisedDeliveryDate;
        return this;
    }

    /**
     * Get promisedDeliveryDate
     *
     * @return promisedDeliveryDate
     **/
    @Schema(required = true, description = "")
    public OffsetDateTime getPromisedDeliveryDate() {
        return promisedDeliveryDate;
    }

    public void setPromisedDeliveryDate(OffsetDateTime promisedDeliveryDate) {
        this.promisedDeliveryDate = promisedDeliveryDate;
    }

    public TrackingInformation eventHistory(EventList eventHistory) {
        this.eventHistory = eventHistory;
        return this;
    }

    /**
     * Get eventHistory
     *
     * @return eventHistory
     **/
    @Schema(required = true, description = "")
    public EventList getEventHistory() {
        return eventHistory;
    }

    public void setEventHistory(EventList eventHistory) {
        this.eventHistory = eventHistory;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrackingInformation trackingInformation = (TrackingInformation) o;
        return Objects.equals(this.trackingId, trackingInformation.trackingId) &&
                Objects.equals(this.summary, trackingInformation.summary) &&
                Objects.equals(this.promisedDeliveryDate, trackingInformation.promisedDeliveryDate) &&
                Objects.equals(this.eventHistory, trackingInformation.eventHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackingId, summary, promisedDeliveryDate, eventHistory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrackingInformation {\n");
        sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    promisedDeliveryDate: ").append(toIndentedString(promisedDeliveryDate)).append("\n");
        sb.append("    eventHistory: ").append(toIndentedString(eventHistory)).append("\n");
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
