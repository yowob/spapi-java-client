package com.amazon.spapi.models.services;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Proof of Appointment (POA) details.
 */
@Schema(description = "Proof of Appointment (POA) details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Poa {
    @SerializedName("appointmentTime")
    private AppointmentTime appointmentTime = null;
    @SerializedName("technicians")
    private List<Technician> technicians = null;
    @SerializedName("uploadingTechnician")
    private String uploadingTechnician = null;
    @SerializedName("uploadTime")
    private OffsetDateTime uploadTime = null;
    @SerializedName("poaType")
    private PoaTypeEnum poaType = null;

    public Poa appointmentTime(AppointmentTime appointmentTime) {
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

    public Poa technicians(List<Technician> technicians) {
        this.technicians = technicians;
        return this;
    }

    public Poa addTechniciansItem(Technician techniciansItem) {
        if (this.technicians == null) {
            this.technicians = new ArrayList<Technician>();
        }
        this.technicians.add(techniciansItem);
        return this;
    }

    /**
     * A list of technicians.
     *
     * @return technicians
     **/
    @Schema(description = "A list of technicians.")
    public List<Technician> getTechnicians() {
        return technicians;
    }

    public void setTechnicians(List<Technician> technicians) {
        this.technicians = technicians;
    }

    public Poa uploadingTechnician(String uploadingTechnician) {
        this.uploadingTechnician = uploadingTechnician;
        return this;
    }

    /**
     * The identifier of the technician who uploaded the POA.
     *
     * @return uploadingTechnician
     **/
    @Schema(description = "The identifier of the technician who uploaded the POA.")
    public String getUploadingTechnician() {
        return uploadingTechnician;
    }

    public void setUploadingTechnician(String uploadingTechnician) {
        this.uploadingTechnician = uploadingTechnician;
    }

    public Poa uploadTime(OffsetDateTime uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }

    /**
     * The date and time when the POA was uploaded, in ISO 8601 format.
     *
     * @return uploadTime
     **/
    @Schema(description = "The date and time when the POA was uploaded, in ISO 8601 format.")
    public OffsetDateTime getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(OffsetDateTime uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Poa poaType(PoaTypeEnum poaType) {
        this.poaType = poaType;
        return this;
    }

    /**
     * The type of POA uploaded.
     *
     * @return poaType
     **/
    @Schema(description = "The type of POA uploaded.")
    public PoaTypeEnum getPoaType() {
        return poaType;
    }

    public void setPoaType(PoaTypeEnum poaType) {
        this.poaType = poaType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Poa poa = (Poa) o;
        return Objects.equals(this.appointmentTime, poa.appointmentTime) &&
                Objects.equals(this.technicians, poa.technicians) &&
                Objects.equals(this.uploadingTechnician, poa.uploadingTechnician) &&
                Objects.equals(this.uploadTime, poa.uploadTime) &&
                Objects.equals(this.poaType, poa.poaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentTime, technicians, uploadingTechnician, uploadTime, poaType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Poa {\n");
        sb.append("    appointmentTime: ").append(toIndentedString(appointmentTime)).append("\n");
        sb.append("    technicians: ").append(toIndentedString(technicians)).append("\n");
        sb.append("    uploadingTechnician: ").append(toIndentedString(uploadingTechnician)).append("\n");
        sb.append("    uploadTime: ").append(toIndentedString(uploadTime)).append("\n");
        sb.append("    poaType: ").append(toIndentedString(poaType)).append("\n");
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
     * The type of POA uploaded.
     */
    @JsonAdapter(PoaTypeEnum.Adapter.class)
    public enum PoaTypeEnum {
        NO_SIGNATURE_DUMMY_POS("NO_SIGNATURE_DUMMY_POS"),
        CUSTOMER_SIGNATURE("CUSTOMER_SIGNATURE"),
        DUMMY_RECEIPT("DUMMY_RECEIPT"),
        POA_RECEIPT("POA_RECEIPT");
        private String value;

        PoaTypeEnum(String value) {
            this.value = value;
        }

        public static PoaTypeEnum fromValue(String text) {
            for (PoaTypeEnum b : PoaTypeEnum.values()) {
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

        public static class Adapter extends TypeAdapter<PoaTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PoaTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PoaTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return PoaTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
