package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * CreateInboundShipmentPlanResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateInboundShipmentPlanResult {
    @SerializedName("InboundShipmentPlans")
    private InboundShipmentPlanList inboundShipmentPlans = null;

    public CreateInboundShipmentPlanResult inboundShipmentPlans(InboundShipmentPlanList inboundShipmentPlans) {
        this.inboundShipmentPlans = inboundShipmentPlans;
        return this;
    }

    /**
     * Get inboundShipmentPlans
     *
     * @return inboundShipmentPlans
     **/
    @Schema(description = "")
    public InboundShipmentPlanList getInboundShipmentPlans() {
        return inboundShipmentPlans;
    }

    public void setInboundShipmentPlans(InboundShipmentPlanList inboundShipmentPlans) {
        this.inboundShipmentPlans = inboundShipmentPlans;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInboundShipmentPlanResult createInboundShipmentPlanResult = (CreateInboundShipmentPlanResult) o;
        return Objects.equals(this.inboundShipmentPlans, createInboundShipmentPlanResult.inboundShipmentPlans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inboundShipmentPlans);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInboundShipmentPlanResult {\n");
        sb.append("    inboundShipmentPlans: ").append(toIndentedString(inboundShipmentPlans)).append("\n");
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
