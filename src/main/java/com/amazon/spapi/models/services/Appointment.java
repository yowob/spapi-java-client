package com.amazon.spapi.models.services;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The details of an appointment.
 */
@Schema(description = "The details of an appointment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Appointment {
    @SerializedName("appointmentId")
    private String appointmentId = null;
    @SerializedName("appointmentStatus")
    private AppointmentStatusEnum appointmentStatus = null;
    @SerializedName("appointmentTime")
    private AppointmentTime appointmentTime = null;
    @SerializedName("assignedTechnicians")
    private List<Technician> assignedTechnicians = null;
    @SerializedName("rescheduledAppointmentId")
    private String rescheduledAppointmentId = null;
    @SerializedName("poa")
    private Poa poa = null;

    public Appointment appointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
        return this;
    }

    /**
     * Get appointmentId
     *
     * @return appointmentId
     **/
    @Schema(description = "")
    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Appointment appointmentStatus(AppointmentStatusEnum appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
        return this;
    }

    /**
     * The status of the appointment.
     *
     * @return appointmentStatus
     **/
    @Schema(description = "The status of the appointment.")
    public AppointmentStatusEnum getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(AppointmentStatusEnum appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public Appointment appointmentTime(AppointmentTime appointmentTime) {
        this.appointmentTime = appointmentTime;
        return this;
    }

    /**
     * Get appointmentTime
     *
     * @return appointmentTime
     **/
    @Schema(description = "")
    public AppointmentTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(AppointmentTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Appointment assignedTechnicians(List<Technician> assignedTechnicians) {
        this.assignedTechnicians = assignedTechnicians;
        return this;
    }

    public Appointment addAssignedTechniciansItem(Technician assignedTechniciansItem) {
        if (this.assignedTechnicians == null) {
            this.assignedTechnicians = new ArrayList<Technician>();
        }
        this.assignedTechnicians.add(assignedTechniciansItem);
        return this;
    }

    /**
     * A list of technicians assigned to the service job.
     *
     * @return assignedTechnicians
     **/
    @Schema(description = "A list of technicians assigned to the service job.")
    public List<Technician> getAssignedTechnicians() {
        return assignedTechnicians;
    }

    public void setAssignedTechnicians(List<Technician> assignedTechnicians) {
        this.assignedTechnicians = assignedTechnicians;
    }

    public Appointment rescheduledAppointmentId(String rescheduledAppointmentId) {
        this.rescheduledAppointmentId = rescheduledAppointmentId;
        return this;
    }

    /**
     * Get rescheduledAppointmentId
     *
     * @return rescheduledAppointmentId
     **/
    @Schema(description = "")
    public String getRescheduledAppointmentId() {
        return rescheduledAppointmentId;
    }

    public void setRescheduledAppointmentId(String rescheduledAppointmentId) {
        this.rescheduledAppointmentId = rescheduledAppointmentId;
    }

    public Appointment poa(Poa poa) {
        this.poa = poa;
        return this;
    }

    /**
     * Get poa
     *
     * @return poa
     **/
    @Schema(description = "")
    public Poa getPoa() {
        return poa;
    }

    public void setPoa(Poa poa) {
        this.poa = poa;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Appointment appointment = (Appointment) o;
        return Objects.equals(this.appointmentId, appointment.appointmentId) &&
                Objects.equals(this.appointmentStatus, appointment.appointmentStatus) &&
                Objects.equals(this.appointmentTime, appointment.appointmentTime) &&
                Objects.equals(this.assignedTechnicians, appointment.assignedTechnicians) &&
                Objects.equals(this.rescheduledAppointmentId, appointment.rescheduledAppointmentId) &&
                Objects.equals(this.poa, appointment.poa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentId, appointmentStatus, appointmentTime, assignedTechnicians, rescheduledAppointmentId, poa);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Appointment {\n");
        sb.append("    appointmentId: ").append(toIndentedString(appointmentId)).append("\n");
        sb.append("    appointmentStatus: ").append(toIndentedString(appointmentStatus)).append("\n");
        sb.append("    appointmentTime: ").append(toIndentedString(appointmentTime)).append("\n");
        sb.append("    assignedTechnicians: ").append(toIndentedString(assignedTechnicians)).append("\n");
        sb.append("    rescheduledAppointmentId: ").append(toIndentedString(rescheduledAppointmentId)).append("\n");
        sb.append("    poa: ").append(toIndentedString(poa)).append("\n");
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

    /**
     * The status of the appointment.
     */
    @JsonAdapter(AppointmentStatusEnum.Adapter.class)
    public enum AppointmentStatusEnum {
        ACTIVE("ACTIVE"),
        CANCELLED("CANCELLED"),
        COMPLETED("COMPLETED");
        private String value;

        AppointmentStatusEnum(String value) {
            this.value = value;
        }

        public static AppointmentStatusEnum fromValue(String text) {
            for (AppointmentStatusEnum b : AppointmentStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<AppointmentStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AppointmentStatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AppointmentStatusEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return AppointmentStatusEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
