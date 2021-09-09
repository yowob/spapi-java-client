package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * PackageTrackingDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PackageTrackingDetails {
    @SerializedName("packageNumber")
    private Integer packageNumber = null;
    @SerializedName("trackingNumber")
    private String trackingNumber = null;
    @SerializedName("customerTrackingLink")
    private String customerTrackingLink = null;
    @SerializedName("carrierCode")
    private String carrierCode = null;
    @SerializedName("carrierPhoneNumber")
    private String carrierPhoneNumber = null;
    @SerializedName("carrierURL")
    private String carrierURL = null;
    @SerializedName("shipDate")
    private OffsetDateTime shipDate = null;
    @SerializedName("estimatedArrivalDate")
    private OffsetDateTime estimatedArrivalDate = null;
    @SerializedName("shipToAddress")
    private TrackingAddress shipToAddress = null;
    @SerializedName("currentStatus")
    private CurrentStatus currentStatus = null;
    @SerializedName("currentStatusDescription")
    private String currentStatusDescription = null;
    @SerializedName("signedForBy")
    private String signedForBy = null;
    @SerializedName("additionalLocationInfo")
    private AdditionalLocationInfo additionalLocationInfo = null;
    @SerializedName("trackingEvents")
    private TrackingEventList trackingEvents = null;

    public PackageTrackingDetails packageNumber(Integer packageNumber) {
        this.packageNumber = packageNumber;
        return this;
    }

    /**
     * The package identifier.
     *
     * @return packageNumber
     **/
    @Schema(required = true, description = "The package identifier.")
    public Integer getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(Integer packageNumber) {
        this.packageNumber = packageNumber;
    }

    public PackageTrackingDetails trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    /**
     * The tracking number for the package.
     *
     * @return trackingNumber
     **/
    @Schema(description = "The tracking number for the package.")
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public PackageTrackingDetails customerTrackingLink(String customerTrackingLink) {
        this.customerTrackingLink = customerTrackingLink;
        return this;
    }

    /**
     * Link on swiship.com that allows customers to track the package.
     *
     * @return customerTrackingLink
     **/
    @Schema(description = "Link on swiship.com that allows customers to track the package.")
    public String getCustomerTrackingLink() {
        return customerTrackingLink;
    }

    public void setCustomerTrackingLink(String customerTrackingLink) {
        this.customerTrackingLink = customerTrackingLink;
    }

    public PackageTrackingDetails carrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
        return this;
    }

    /**
     * The name of the carrier.
     *
     * @return carrierCode
     **/
    @Schema(description = "The name of the carrier.")
    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public PackageTrackingDetails carrierPhoneNumber(String carrierPhoneNumber) {
        this.carrierPhoneNumber = carrierPhoneNumber;
        return this;
    }

    /**
     * The phone number of the carrier.
     *
     * @return carrierPhoneNumber
     **/
    @Schema(description = "The phone number of the carrier.")
    public String getCarrierPhoneNumber() {
        return carrierPhoneNumber;
    }

    public void setCarrierPhoneNumber(String carrierPhoneNumber) {
        this.carrierPhoneNumber = carrierPhoneNumber;
    }

    public PackageTrackingDetails carrierURL(String carrierURL) {
        this.carrierURL = carrierURL;
        return this;
    }

    /**
     * The URL of the carrier’s website.
     *
     * @return carrierURL
     **/
    @Schema(description = "The URL of the carrier’s website.")
    public String getCarrierURL() {
        return carrierURL;
    }

    public void setCarrierURL(String carrierURL) {
        this.carrierURL = carrierURL;
    }

    public PackageTrackingDetails shipDate(OffsetDateTime shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    /**
     * Get shipDate
     *
     * @return shipDate
     **/
    @Schema(description = "")
    public OffsetDateTime getShipDate() {
        return shipDate;
    }

    public void setShipDate(OffsetDateTime shipDate) {
        this.shipDate = shipDate;
    }

    public PackageTrackingDetails estimatedArrivalDate(OffsetDateTime estimatedArrivalDate) {
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

    public PackageTrackingDetails shipToAddress(TrackingAddress shipToAddress) {
        this.shipToAddress = shipToAddress;
        return this;
    }

    /**
     * Get shipToAddress
     *
     * @return shipToAddress
     **/
    @Schema(description = "")
    public TrackingAddress getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(TrackingAddress shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public PackageTrackingDetails currentStatus(CurrentStatus currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }

    /**
     * Get currentStatus
     *
     * @return currentStatus
     **/
    @Schema(description = "")
    public CurrentStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(CurrentStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    public PackageTrackingDetails currentStatusDescription(String currentStatusDescription) {
        this.currentStatusDescription = currentStatusDescription;
        return this;
    }

    /**
     * Description corresponding to the CurrentStatus value.
     *
     * @return currentStatusDescription
     **/
    @Schema(description = "Description corresponding to the CurrentStatus value.")
    public String getCurrentStatusDescription() {
        return currentStatusDescription;
    }

    public void setCurrentStatusDescription(String currentStatusDescription) {
        this.currentStatusDescription = currentStatusDescription;
    }

    public PackageTrackingDetails signedForBy(String signedForBy) {
        this.signedForBy = signedForBy;
        return this;
    }

    /**
     * The name of the person who signed for the package.
     *
     * @return signedForBy
     **/
    @Schema(description = "The name of the person who signed for the package.")
    public String getSignedForBy() {
        return signedForBy;
    }

    public void setSignedForBy(String signedForBy) {
        this.signedForBy = signedForBy;
    }

    public PackageTrackingDetails additionalLocationInfo(AdditionalLocationInfo additionalLocationInfo) {
        this.additionalLocationInfo = additionalLocationInfo;
        return this;
    }

    /**
     * Get additionalLocationInfo
     *
     * @return additionalLocationInfo
     **/
    @Schema(description = "")
    public AdditionalLocationInfo getAdditionalLocationInfo() {
        return additionalLocationInfo;
    }

    public void setAdditionalLocationInfo(AdditionalLocationInfo additionalLocationInfo) {
        this.additionalLocationInfo = additionalLocationInfo;
    }

    public PackageTrackingDetails trackingEvents(TrackingEventList trackingEvents) {
        this.trackingEvents = trackingEvents;
        return this;
    }

    /**
     * Get trackingEvents
     *
     * @return trackingEvents
     **/
    @Schema(description = "")
    public TrackingEventList getTrackingEvents() {
        return trackingEvents;
    }

    public void setTrackingEvents(TrackingEventList trackingEvents) {
        this.trackingEvents = trackingEvents;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackageTrackingDetails packageTrackingDetails = (PackageTrackingDetails) o;
        return Objects.equals(this.packageNumber, packageTrackingDetails.packageNumber) &&
                Objects.equals(this.trackingNumber, packageTrackingDetails.trackingNumber) &&
                Objects.equals(this.customerTrackingLink, packageTrackingDetails.customerTrackingLink) &&
                Objects.equals(this.carrierCode, packageTrackingDetails.carrierCode) &&
                Objects.equals(this.carrierPhoneNumber, packageTrackingDetails.carrierPhoneNumber) &&
                Objects.equals(this.carrierURL, packageTrackingDetails.carrierURL) &&
                Objects.equals(this.shipDate, packageTrackingDetails.shipDate) &&
                Objects.equals(this.estimatedArrivalDate, packageTrackingDetails.estimatedArrivalDate) &&
                Objects.equals(this.shipToAddress, packageTrackingDetails.shipToAddress) &&
                Objects.equals(this.currentStatus, packageTrackingDetails.currentStatus) &&
                Objects.equals(this.currentStatusDescription, packageTrackingDetails.currentStatusDescription) &&
                Objects.equals(this.signedForBy, packageTrackingDetails.signedForBy) &&
                Objects.equals(this.additionalLocationInfo, packageTrackingDetails.additionalLocationInfo) &&
                Objects.equals(this.trackingEvents, packageTrackingDetails.trackingEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageNumber, trackingNumber, customerTrackingLink, carrierCode, carrierPhoneNumber, carrierURL, shipDate, estimatedArrivalDate, shipToAddress, currentStatus, currentStatusDescription, signedForBy, additionalLocationInfo, trackingEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageTrackingDetails {\n");
        sb.append("    packageNumber: ").append(toIndentedString(packageNumber)).append("\n");
        sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
        sb.append("    customerTrackingLink: ").append(toIndentedString(customerTrackingLink)).append("\n");
        sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
        sb.append("    carrierPhoneNumber: ").append(toIndentedString(carrierPhoneNumber)).append("\n");
        sb.append("    carrierURL: ").append(toIndentedString(carrierURL)).append("\n");
        sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
        sb.append("    estimatedArrivalDate: ").append(toIndentedString(estimatedArrivalDate)).append("\n");
        sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
        sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
        sb.append("    currentStatusDescription: ").append(toIndentedString(currentStatusDescription)).append("\n");
        sb.append("    signedForBy: ").append(toIndentedString(signedForBy)).append("\n");
        sb.append("    additionalLocationInfo: ").append(toIndentedString(additionalLocationInfo)).append("\n");
        sb.append("    trackingEvents: ").append(toIndentedString(trackingEvents)).append("\n");
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
