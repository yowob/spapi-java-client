package com.amazon.spapi.models.services;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Promised delivery information for the item.
 */
@Schema(description = "Promised delivery information for the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemDeliveryPromise {
    @SerializedName("startTime")
    private OffsetDateTime startTime = null;
    @SerializedName("endTime")
    private OffsetDateTime endTime = null;

    public ItemDeliveryPromise startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The date and time of the start of the promised delivery window, in ISO 8601 format.
     *
     * @return startTime
     **/
    @Schema(description = "The date and time of the start of the promised delivery window, in ISO 8601 format.")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ItemDeliveryPromise endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * The date and time of the end of the promised delivery window, in ISO 8601 format.
     *
     * @return endTime
     **/
    @Schema(description = "The date and time of the end of the promised delivery window, in ISO 8601 format.")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemDeliveryPromise itemDeliveryPromise = (ItemDeliveryPromise) o;
        return Objects.equals(this.startTime, itemDeliveryPromise.startTime) &&
                Objects.equals(this.endTime, itemDeliveryPromise.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemDeliveryPromise {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
