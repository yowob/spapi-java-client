package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Inbound shipment information, including carrier details, shipment status, and the workflow status for a request for shipment with an Amazon-partnered carrier.
 */
@Schema(description = "Inbound shipment information, including carrier details, shipment status, and the workflow status for a request for shipment with an Amazon-partnered carrier.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TransportContent {
    @SerializedName("TransportHeader")
    private TransportHeader transportHeader = null;
    @SerializedName("TransportDetails")
    private TransportDetailOutput transportDetails = null;
    @SerializedName("TransportResult")
    private TransportResult transportResult = null;

    public TransportContent transportHeader(TransportHeader transportHeader) {
        this.transportHeader = transportHeader;
        return this;
    }

    /**
     * Get transportHeader
     *
     * @return transportHeader
     **/
    @Schema(required = true, description = "")
    public TransportHeader getTransportHeader() {
        return transportHeader;
    }

    public void setTransportHeader(TransportHeader transportHeader) {
        this.transportHeader = transportHeader;
    }

    public TransportContent transportDetails(TransportDetailOutput transportDetails) {
        this.transportDetails = transportDetails;
        return this;
    }

    /**
     * Get transportDetails
     *
     * @return transportDetails
     **/
    @Schema(required = true, description = "")
    public TransportDetailOutput getTransportDetails() {
        return transportDetails;
    }

    public void setTransportDetails(TransportDetailOutput transportDetails) {
        this.transportDetails = transportDetails;
    }

    public TransportContent transportResult(TransportResult transportResult) {
        this.transportResult = transportResult;
        return this;
    }

    /**
     * Get transportResult
     *
     * @return transportResult
     **/
    @Schema(required = true, description = "")
    public TransportResult getTransportResult() {
        return transportResult;
    }

    public void setTransportResult(TransportResult transportResult) {
        this.transportResult = transportResult;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransportContent transportContent = (TransportContent) o;
        return Objects.equals(this.transportHeader, transportContent.transportHeader) &&
                Objects.equals(this.transportDetails, transportContent.transportDetails) &&
                Objects.equals(this.transportResult, transportContent.transportResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportHeader, transportDetails, transportResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransportContent {\n");
        sb.append("    transportHeader: ").append(toIndentedString(transportHeader)).append("\n");
        sb.append("    transportDetails: ").append(toIndentedString(transportDetails)).append("\n");
        sb.append("    transportResult: ").append(toIndentedString(transportResult)).append("\n");
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
