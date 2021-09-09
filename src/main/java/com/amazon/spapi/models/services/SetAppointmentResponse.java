package com.amazon.spapi.models.services;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Response schema for add or reschedule appointment operation.
 */
@Schema(description = "Response schema for add or reschedule appointment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SetAppointmentResponse {
    @SerializedName("appointmentId")
    private String appointmentId = null;
    @SerializedName("warnings")
    private WarningList warnings = null;
    @SerializedName("errors")
    private ErrorList errors = null;

    public SetAppointmentResponse appointmentId(String appointmentId) {
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

    public SetAppointmentResponse warnings(WarningList warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Get warnings
     *
     * @return warnings
     **/
    @Schema(description = "")
    public WarningList getWarnings() {
        return warnings;
    }

    public void setWarnings(WarningList warnings) {
        this.warnings = warnings;
    }

    public SetAppointmentResponse errors(ErrorList errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get errors
     *
     * @return errors
     **/
    @Schema(description = "")
    public ErrorList getErrors() {
        return errors;
    }

    public void setErrors(ErrorList errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetAppointmentResponse setAppointmentResponse = (SetAppointmentResponse) o;
        return Objects.equals(this.appointmentId, setAppointmentResponse.appointmentId) &&
                Objects.equals(this.warnings, setAppointmentResponse.warnings) &&
                Objects.equals(this.errors, setAppointmentResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentId, warnings, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAppointmentResponse {\n");
        sb.append("    appointmentId: ").append(toIndentedString(appointmentId)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
