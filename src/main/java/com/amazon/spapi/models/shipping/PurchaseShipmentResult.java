package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The payload schema for the purchaseShipment operation.
 */
@Schema(description = "The payload schema for the purchaseShipment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PurchaseShipmentResult {
    @SerializedName("shipmentId")
    private String shipmentId = null;
    @SerializedName("serviceRate")
    private ServiceRate serviceRate = null;
    @SerializedName("labelResults")
    private LabelResultList labelResults = null;

    public PurchaseShipmentResult shipmentId(String shipmentId) {
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

    public PurchaseShipmentResult serviceRate(ServiceRate serviceRate) {
        this.serviceRate = serviceRate;
        return this;
    }

    /**
     * Get serviceRate
     *
     * @return serviceRate
     **/
    @Schema(required = true, description = "")
    public ServiceRate getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(ServiceRate serviceRate) {
        this.serviceRate = serviceRate;
    }

    public PurchaseShipmentResult labelResults(LabelResultList labelResults) {
        this.labelResults = labelResults;
        return this;
    }

    /**
     * Get labelResults
     *
     * @return labelResults
     **/
    @Schema(required = true, description = "")
    public LabelResultList getLabelResults() {
        return labelResults;
    }

    public void setLabelResults(LabelResultList labelResults) {
        this.labelResults = labelResults;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PurchaseShipmentResult purchaseShipmentResult = (PurchaseShipmentResult) o;
        return Objects.equals(this.shipmentId, purchaseShipmentResult.shipmentId) &&
                Objects.equals(this.serviceRate, purchaseShipmentResult.serviceRate) &&
                Objects.equals(this.labelResults, purchaseShipmentResult.labelResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentId, serviceRate, labelResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PurchaseShipmentResult {\n");
        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
        sb.append("    serviceRate: ").append(toIndentedString(serviceRate)).append("\n");
        sb.append("    labelResults: ").append(toIndentedString(labelResults)).append("\n");
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
