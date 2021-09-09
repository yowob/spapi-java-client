package com.amazon.spapi.models.reports;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * CreateReportScheduleResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateReportScheduleResult {
    @SerializedName("reportScheduleId")
    private String reportScheduleId = null;

    public CreateReportScheduleResult reportScheduleId(String reportScheduleId) {
        this.reportScheduleId = reportScheduleId;
        return this;
    }

    /**
     * The identifier for the report schedule. This identifier is unique only in combination with a seller ID.
     *
     * @return reportScheduleId
     **/
    @Schema(required = true, description = "The identifier for the report schedule. This identifier is unique only in combination with a seller ID.")
    public String getReportScheduleId() {
        return reportScheduleId;
    }

    public void setReportScheduleId(String reportScheduleId) {
        this.reportScheduleId = reportScheduleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateReportScheduleResult createReportScheduleResult = (CreateReportScheduleResult) o;
        return Objects.equals(this.reportScheduleId, createReportScheduleResult.reportScheduleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportScheduleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReportScheduleResult {\n");
        sb.append("    reportScheduleId: ").append(toIndentedString(reportScheduleId)).append("\n");
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
