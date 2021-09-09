package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The payload schema for the createShipment operation.
 */
@Schema(description = "The payload schema for the createShipment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateShipmentResult {
    @SerializedName("shipmentId")
    private String shipmentId = null;
    @SerializedName("eligibleRates")
    private RateList eligibleRates = null;

    public CreateShipmentResult shipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * Get shipmentId
     *
     * @return shipmentId
     **/
    @Schema(required = true, description = "")
    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public CreateShipmentResult eligibleRates(RateList eligibleRates) {
        this.eligibleRates = eligibleRates;
        return this;
    }

    /**
     * Get eligibleRates
     *
     * @return eligibleRates
     **/
    @Schema(required = true, description = "")
    public RateList getEligibleRates() {
        return eligibleRates;
    }

    public void setEligibleRates(RateList eligibleRates) {
        this.eligibleRates = eligibleRates;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateShipmentResult createShipmentResult = (CreateShipmentResult) o;
        return Objects.equals(this.shipmentId, createShipmentResult.shipmentId) &&
                Objects.equals(this.eligibleRates, createShipmentResult.eligibleRates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentId, eligibleRates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateShipmentResult {\n");
        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
        sb.append("    eligibleRates: ").append(toIndentedString(eligibleRates)).append("\n");
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
