package com.amazon.spapi.models.fbainventory;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Describes a granularity at which inventory data can be aggregated. For example, if you use Marketplace granularity, the fulfillable quantity will reflect inventory that could be fulfilled in the given marketplace.
 */
@Schema(description = "Describes a granularity at which inventory data can be aggregated. For example, if you use Marketplace granularity, the fulfillable quantity will reflect inventory that could be fulfilled in the given marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Granularity {
    @SerializedName("granularityType")
    private String granularityType = null;
    @SerializedName("granularityId")
    private String granularityId = null;

    public Granularity granularityType(String granularityType) {
        this.granularityType = granularityType;
        return this;
    }

    /**
     * The granularity type for the inventory aggregation level.
     *
     * @return granularityType
     **/
    @Schema(description = "The granularity type for the inventory aggregation level.")
    public String getGranularityType() {
        return granularityType;
    }

    public void setGranularityType(String granularityType) {
        this.granularityType = granularityType;
    }

    public Granularity granularityId(String granularityId) {
        this.granularityId = granularityId;
        return this;
    }

    /**
     * The granularity ID for the specified granularity type. When granularityType is Marketplace, specify the marketplaceId.
     *
     * @return granularityId
     **/
    @Schema(description = "The granularity ID for the specified granularity type. When granularityType is Marketplace, specify the marketplaceId.")
    public String getGranularityId() {
        return granularityId;
    }

    public void setGranularityId(String granularityId) {
        this.granularityId = granularityId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Granularity granularity = (Granularity) o;
        return Objects.equals(this.granularityType, granularity.granularityType) &&
                Objects.equals(this.granularityId, granularity.granularityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(granularityType, granularityId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Granularity {\n");
        sb.append("    granularityType: ").append(toIndentedString(granularityType)).append("\n");
        sb.append("    granularityId: ").append(toIndentedString(granularityId)).append("\n");
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
