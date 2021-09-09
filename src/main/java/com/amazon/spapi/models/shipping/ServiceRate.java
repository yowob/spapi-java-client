package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The specific rate for a shipping service, or null if no service available.
 */
@Schema(description = "The specific rate for a shipping service, or null if no service available.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ServiceRate {
    @SerializedName("totalCharge")
    private Currency totalCharge = null;
    @SerializedName("billableWeight")
    private Weight billableWeight = null;
    @SerializedName("serviceType")
    private ServiceType serviceType = null;
    @SerializedName("promise")
    private ShippingPromiseSet promise = null;

    public ServiceRate totalCharge(Currency totalCharge) {
        this.totalCharge = totalCharge;
        return this;
    }

    /**
     * Get totalCharge
     *
     * @return totalCharge
     **/
    @Schema(required = true, description = "")
    public Currency getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(Currency totalCharge) {
        this.totalCharge = totalCharge;
    }

    public ServiceRate billableWeight(Weight billableWeight) {
        this.billableWeight = billableWeight;
        return this;
    }

    /**
     * Get billableWeight
     *
     * @return billableWeight
     **/
    @Schema(required = true, description = "")
    public Weight getBillableWeight() {
        return billableWeight;
    }

    public void setBillableWeight(Weight billableWeight) {
        this.billableWeight = billableWeight;
    }

    public ServiceRate serviceType(ServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Get serviceType
     *
     * @return serviceType
     **/
    @Schema(required = true, description = "")
    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public ServiceRate promise(ShippingPromiseSet promise) {
        this.promise = promise;
        return this;
    }

    /**
     * Get promise
     *
     * @return promise
     **/
    @Schema(required = true, description = "")
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
        ServiceRate serviceRate = (ServiceRate) o;
        return Objects.equals(this.totalCharge, serviceRate.totalCharge) &&
                Objects.equals(this.billableWeight, serviceRate.billableWeight) &&
                Objects.equals(this.serviceType, serviceRate.serviceType) &&
                Objects.equals(this.promise, serviceRate.promise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCharge, billableWeight, serviceType, promise);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceRate {\n");
        sb.append("    totalCharge: ").append(toIndentedString(totalCharge)).append("\n");
        sb.append("    billableWeight: ").append(toIndentedString(billableWeight)).append("\n");
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
