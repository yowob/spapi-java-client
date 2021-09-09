package com.amazon.spapi.models.reports;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * CreateReportResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateReportResult {
    @SerializedName("reportId")
    private String reportId = null;

    public CreateReportResult reportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * The identifier for the report. This identifier is unique only in combination with a seller ID.
     *
     * @return reportId
     **/
    @Schema(required = true, description = "The identifier for the report. This identifier is unique only in combination with a seller ID.")
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateReportResult createReportResult = (CreateReportResult) o;
        return Objects.equals(this.reportId, createReportResult.reportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReportResult {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
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
