package com.amazon.spapi.models.fbainventory;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The payload schema for the getInventorySummaries operation.
 */
@Schema(description = "The payload schema for the getInventorySummaries operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetInventorySummariesResult {
    @SerializedName("granularity")
    private Granularity granularity = null;
    @SerializedName("inventorySummaries")
    private InventorySummaries inventorySummaries = null;

    public GetInventorySummariesResult granularity(Granularity granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * Get granularity
     *
     * @return granularity
     **/
    @Schema(required = true, description = "")
    public Granularity getGranularity() {
        return granularity;
    }

    public void setGranularity(Granularity granularity) {
        this.granularity = granularity;
    }

    public GetInventorySummariesResult inventorySummaries(InventorySummaries inventorySummaries) {
        this.inventorySummaries = inventorySummaries;
        return this;
    }

    /**
     * Get inventorySummaries
     *
     * @return inventorySummaries
     **/
    @Schema(required = true, description = "")
    public InventorySummaries getInventorySummaries() {
        return inventorySummaries;
    }

    public void setInventorySummaries(InventorySummaries inventorySummaries) {
        this.inventorySummaries = inventorySummaries;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetInventorySummariesResult getInventorySummariesResult = (GetInventorySummariesResult) o;
        return Objects.equals(this.granularity, getInventorySummariesResult.granularity) &&
                Objects.equals(this.inventorySummaries, getInventorySummariesResult.inventorySummaries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(granularity, inventorySummaries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetInventorySummariesResult {\n");
        sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
        sb.append("    inventorySummaries: ").append(toIndentedString(inventorySummaries)).append("\n");
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
