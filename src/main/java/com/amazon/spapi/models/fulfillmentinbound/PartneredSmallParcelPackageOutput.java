package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Dimension, weight, and shipping information for the package.
 */
@Schema(description = "Dimension, weight, and shipping information for the package.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PartneredSmallParcelPackageOutput {
    @SerializedName("Dimensions")
    private Dimensions dimensions = null;
    @SerializedName("Weight")
    private Weight weight = null;
    @SerializedName("CarrierName")
    private String carrierName = null;
    @SerializedName("TrackingId")
    private String trackingId = null;
    @SerializedName("PackageStatus")
    private PackageStatus packageStatus = null;

    public PartneredSmallParcelPackageOutput dimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get dimensions
     *
     * @return dimensions
     **/
    @Schema(required = true, description = "")
    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public PartneredSmallParcelPackageOutput weight(Weight weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get weight
     *
     * @return weight
     **/
    @Schema(required = true, description = "")
    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public PartneredSmallParcelPackageOutput carrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * The carrier specified with a previous call to putTransportDetails.
     *
     * @return carrierName
     **/
    @Schema(required = true, description = "The carrier specified with a previous call to putTransportDetails.")
    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public PartneredSmallParcelPackageOutput trackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get trackingId
     *
     * @return trackingId
     **/
    @Schema(required = true, description = "")
    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public PartneredSmallParcelPackageOutput packageStatus(PackageStatus packageStatus) {
        this.packageStatus = packageStatus;
        return this;
    }

    /**
     * Get packageStatus
     *
     * @return packageStatus
     **/
    @Schema(required = true, description = "")
    public PackageStatus getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(PackageStatus packageStatus) {
        this.packageStatus = packageStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PartneredSmallParcelPackageOutput partneredSmallParcelPackageOutput = (PartneredSmallParcelPackageOutput) o;
        return Objects.equals(this.dimensions, partneredSmallParcelPackageOutput.dimensions) &&
                Objects.equals(this.weight, partneredSmallParcelPackageOutput.weight) &&
                Objects.equals(this.carrierName, partneredSmallParcelPackageOutput.carrierName) &&
                Objects.equals(this.trackingId, partneredSmallParcelPackageOutput.trackingId) &&
                Objects.equals(this.packageStatus, partneredSmallParcelPackageOutput.packageStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, weight, carrierName, trackingId, packageStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartneredSmallParcelPackageOutput {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
        sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
        sb.append("    packageStatus: ").append(toIndentedString(packageStatus)).append("\n");
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
