package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Package information for a shipment in a fulfillment order.
 */
@Schema(description = "Package information for a shipment in a fulfillment order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FulfillmentShipmentPackage {
    @SerializedName("packageNumber")
    private Integer packageNumber = null;
    @SerializedName("carrierCode")
    private String carrierCode = null;
    @SerializedName("trackingNumber")
    private String trackingNumber = null;
    @SerializedName("estimatedArrivalDate")
    private OffsetDateTime estimatedArrivalDate = null;

    public FulfillmentShipmentPackage packageNumber(Integer packageNumber) {
        this.packageNumber = packageNumber;
        return this;
    }

    /**
     * Identifies a package in a shipment.
     *
     * @return packageNumber
     **/
    @Schema(required = true, description = "Identifies a package in a shipment.")
    public Integer getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(Integer packageNumber) {
        this.packageNumber = packageNumber;
    }

    public FulfillmentShipmentPackage carrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
        return this;
    }

    /**
     * Identifies the carrier who will deliver the shipment to the recipient.
     *
     * @return carrierCode
     **/
    @Schema(required = true, description = "Identifies the carrier who will deliver the shipment to the recipient.")
    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public FulfillmentShipmentPackage trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    /**
     * The tracking number, if provided, can be used to obtain tracking and delivery information.
     *
     * @return trackingNumber
     **/
    @Schema(description = "The tracking number, if provided, can be used to obtain tracking and delivery information.")
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public FulfillmentShipmentPackage estimatedArrivalDate(OffsetDateTime estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
        return this;
    }

    /**
     * Get estimatedArrivalDate
     *
     * @return estimatedArrivalDate
     **/
    @Schema(description = "")
    public OffsetDateTime getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    public void setEstimatedArrivalDate(OffsetDateTime estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FulfillmentShipmentPackage fulfillmentShipmentPackage = (FulfillmentShipmentPackage) o;
        return Objects.equals(this.packageNumber, fulfillmentShipmentPackage.packageNumber) &&
                Objects.equals(this.carrierCode, fulfillmentShipmentPackage.carrierCode) &&
                Objects.equals(this.trackingNumber, fulfillmentShipmentPackage.trackingNumber) &&
                Objects.equals(this.estimatedArrivalDate, fulfillmentShipmentPackage.estimatedArrivalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageNumber, carrierCode, trackingNumber, estimatedArrivalDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FulfillmentShipmentPackage {\n");
        sb.append("    packageNumber: ").append(toIndentedString(packageNumber)).append("\n");
        sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
        sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
        sb.append("    estimatedArrivalDate: ").append(toIndentedString(estimatedArrivalDate)).append("\n");
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
