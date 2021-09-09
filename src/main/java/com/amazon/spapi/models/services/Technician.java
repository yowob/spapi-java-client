package com.amazon.spapi.models.services;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A technician who is assigned to perform the service job in part or in full.
 */
@Schema(description = "A technician who is assigned to perform the service job in part or in full.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Technician {
    @SerializedName("technicianId")
    private String technicianId = null;
    @SerializedName("name")
    private String name = null;

    public Technician technicianId(String technicianId) {
        this.technicianId = technicianId;
        return this;
    }

    /**
     * The technician identifier.
     *
     * @return technicianId
     **/
    @Schema(description = "The technician identifier.")
    public String getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(String technicianId) {
        this.technicianId = technicianId;
    }

    public Technician name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the technician.
     *
     * @return name
     **/
    @Schema(description = "The name of the technician.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Technician technician = (Technician) o;
        return Objects.equals(this.technicianId, technician.technicianId) &&
                Objects.equals(this.name, technician.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(technicianId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Technician {\n");
        sb.append("    technicianId: ").append(toIndentedString(technicianId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
