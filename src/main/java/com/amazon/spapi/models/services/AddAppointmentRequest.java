package com.amazon.spapi.models.services;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Input for add appointment operation.
 */
@Schema(description = "Input for add appointment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AddAppointmentRequest {
    @SerializedName("appointmentTime")
    private AppointmentTimeInput appointmentTime = null;

    public AddAppointmentRequest appointmentTime(AppointmentTimeInput appointmentTime) {
        this.appointmentTime = appointmentTime;
        return this;
    }

    /**
     * Get appointmentTime
     *
     * @return appointmentTime
     **/
    @Schema(required = true, description = "")
    public AppointmentTimeInput getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(AppointmentTimeInput appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddAppointmentRequest addAppointmentRequest = (AddAppointmentRequest) o;
        return Objects.equals(this.appointmentTime, addAppointmentRequest.appointmentTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddAppointmentRequest {\n");
        sb.append("    appointmentTime: ").append(toIndentedString(appointmentTime)).append("\n");
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
