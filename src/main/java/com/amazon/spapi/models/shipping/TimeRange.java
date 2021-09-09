package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * The time range.
 */
@Schema(description = "The time range.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TimeRange {
    @SerializedName("start")
    private OffsetDateTime start = null;
    @SerializedName("end")
    private OffsetDateTime end = null;

    public TimeRange start(OffsetDateTime start) {
        this.start = start;
        return this;
    }

    /**
     * The start date and time. This defaults to the current date and time.
     *
     * @return start
     **/
    @Schema(description = "The start date and time. This defaults to the current date and time.")
    public OffsetDateTime getStart() {
        return start;
    }

    public void setStart(OffsetDateTime start) {
        this.start = start;
    }

    public TimeRange end(OffsetDateTime end) {
        this.end = end;
        return this;
    }

    /**
     * The end date and time. This must come after the value of start. This defaults to the next business day from the start.
     *
     * @return end
     **/
    @Schema(description = "The end date and time. This must come after the value of start. This defaults to the next business day from the start.")
    public OffsetDateTime getEnd() {
        return end;
    }

    public void setEnd(OffsetDateTime end) {
        this.end = end;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimeRange timeRange = (TimeRange) o;
        return Objects.equals(this.start, timeRange.start) &&
                Objects.equals(this.end, timeRange.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeRange {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
