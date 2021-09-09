package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A carrier who is temporarily unavailable, most likely due to a service outage experienced by the carrier.
 */
@Schema(description = "A carrier who is temporarily unavailable, most likely due to a service outage experienced by the carrier.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TemporarilyUnavailableCarrier {
    @SerializedName("CarrierName")
    private String carrierName = null;

    public TemporarilyUnavailableCarrier carrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * The name of the carrier.
     *
     * @return carrierName
     **/
    @Schema(required = true, description = "The name of the carrier.")
    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemporarilyUnavailableCarrier temporarilyUnavailableCarrier = (TemporarilyUnavailableCarrier) o;
        return Objects.equals(this.carrierName, temporarilyUnavailableCarrier.carrierName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemporarilyUnavailableCarrier {\n");
        sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
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
