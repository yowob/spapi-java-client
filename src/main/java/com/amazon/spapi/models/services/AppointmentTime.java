package com.amazon.spapi.models.services;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * The time of the appointment window.
 */
@Schema(description = "The time of the appointment window.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AppointmentTime {
    @SerializedName("startTime")
    private OffsetDateTime startTime = null;
    @SerializedName("durationInMinutes")
    private Integer durationInMinutes = null;

    public AppointmentTime startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The date and time of the start of the appointment window, in ISO 8601 format.
     *
     * @return startTime
     **/
    @Schema(required = true, description = "The date and time of the start of the appointment window, in ISO 8601 format.")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public AppointmentTime durationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
        return this;
    }

    /**
     * The duration of the appointment window, in minutes.
     * minimum: 1
     *
     * @return durationInMinutes
     **/
    @Schema(required = true, description = "The duration of the appointment window, in minutes.")
    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppointmentTime appointmentTime = (AppointmentTime) o;
        return Objects.equals(this.startTime, appointmentTime.startTime) &&
                Objects.equals(this.durationInMinutes, appointmentTime.durationInMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, durationInMinutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppointmentTime {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    durationInMinutes: ").append(toIndentedString(durationInMinutes)).append("\n");
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
