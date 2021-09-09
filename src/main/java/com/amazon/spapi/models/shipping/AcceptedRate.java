package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The specific rate purchased for the shipment, or null if unpurchased.
 */
@Schema(description = "The specific rate purchased for the shipment, or null if unpurchased.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AcceptedRate {
    @SerializedName("totalCharge")
    private Currency totalCharge = null;
    @SerializedName("billedWeight")
    private Weight billedWeight = null;
    @SerializedName("serviceType")
    private ServiceType serviceType = null;
    @SerializedName("promise")
    private ShippingPromiseSet promise = null;

    public AcceptedRate totalCharge(Currency totalCharge) {
        this.totalCharge = totalCharge;
        return this;
    }

    /**
     * Get totalCharge
     *
     * @return totalCharge
     **/
    @Schema(description = "")
    public Currency getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(Currency totalCharge) {
        this.totalCharge = totalCharge;
    }

    public AcceptedRate billedWeight(Weight billedWeight) {
        this.billedWeight = billedWeight;
        return this;
    }

    /**
     * Get billedWeight
     *
     * @return billedWeight
     **/
    @Schema(description = "")
    public Weight getBilledWeight() {
        return billedWeight;
    }

    public void setBilledWeight(Weight billedWeight) {
        this.billedWeight = billedWeight;
    }

    public AcceptedRate serviceType(ServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Get serviceType
     *
     * @return serviceType
     **/
    @Schema(description = "")
    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public AcceptedRate promise(ShippingPromiseSet promise) {
        this.promise = promise;
        return this;
    }

    /**
     * Get promise
     *
     * @return promise
     **/
    @Schema(description = "")
    public ShippingPromiseSet getPromise() {
        return promise;
    }

    public void setPromise(ShippingPromiseSet promise) {
        this.promise = promise;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AcceptedRate acceptedRate = (AcceptedRate) o;
        return Objects.equals(this.totalCharge, acceptedRate.totalCharge) &&
                Objects.equals(this.billedWeight, acceptedRate.billedWeight) &&
                Objects.equals(this.serviceType, acceptedRate.serviceType) &&
                Objects.equals(this.promise, acceptedRate.promise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCharge, billedWeight, serviceType, promise);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceptedRate {\n");
        sb.append("    totalCharge: ").append(toIndentedString(totalCharge)).append("\n");
        sb.append("    billedWeight: ").append(toIndentedString(billedWeight)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    promise: ").append(toIndentedString(promise)).append("\n");
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
