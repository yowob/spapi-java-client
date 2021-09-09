package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * The available rate that can be used to send the shipment
 */
@Schema(description = "The available rate that can be used to send the shipment")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Rate {
    @SerializedName("rateId")
    private String rateId = null;
    @SerializedName("totalCharge")
    private Currency totalCharge = null;
    @SerializedName("billedWeight")
    private Weight billedWeight = null;
    @SerializedName("expirationTime")
    private OffsetDateTime expirationTime = null;
    @SerializedName("serviceType")
    private ServiceType serviceType = null;
    @SerializedName("promise")
    private ShippingPromiseSet promise = null;

    public Rate rateId(String rateId) {
        this.rateId = rateId;
        return this;
    }

    /**
     * An identifier for the rate.
     *
     * @return rateId
     **/
    @Schema(description = "An identifier for the rate.")
    public String getRateId() {
        return rateId;
    }

    public void setRateId(String rateId) {
        this.rateId = rateId;
    }

    public Rate totalCharge(Currency totalCharge) {
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

    public Rate billedWeight(Weight billedWeight) {
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

    public Rate expirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * The time after which the offering will expire.
     *
     * @return expirationTime
     **/
    @Schema(description = "The time after which the offering will expire.")
    public OffsetDateTime getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
    }

    public Rate serviceType(ServiceType serviceType) {
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

    public Rate promise(ShippingPromiseSet promise) {
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
        Rate rate = (Rate) o;
        return Objects.equals(this.rateId, rate.rateId) &&
                Objects.equals(this.totalCharge, rate.totalCharge) &&
                Objects.equals(this.billedWeight, rate.billedWeight) &&
                Objects.equals(this.expirationTime, rate.expirationTime) &&
                Objects.equals(this.serviceType, rate.serviceType) &&
                Objects.equals(this.promise, rate.promise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rateId, totalCharge, billedWeight, expirationTime, serviceType, promise);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rate {\n");
        sb.append("    rateId: ").append(toIndentedString(rateId)).append("\n");
        sb.append("    totalCharge: ").append(toIndentedString(totalCharge)).append("\n");
        sb.append("    billedWeight: ").append(toIndentedString(billedWeight)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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
