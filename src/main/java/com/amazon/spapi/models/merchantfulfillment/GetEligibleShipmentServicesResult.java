package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The payload for the getEligibleShipmentServices operation.
 */
@Schema(description = "The payload for the getEligibleShipmentServices operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetEligibleShipmentServicesResult {
    @SerializedName("ShippingServiceList")
    private ShippingServiceList shippingServiceList = null;
    @SerializedName("RejectedShippingServiceList")
    private RejectedShippingServiceList rejectedShippingServiceList = null;
    @SerializedName("TemporarilyUnavailableCarrierList")
    private TemporarilyUnavailableCarrierList temporarilyUnavailableCarrierList = null;
    @SerializedName("TermsAndConditionsNotAcceptedCarrierList")
    private TermsAndConditionsNotAcceptedCarrierList termsAndConditionsNotAcceptedCarrierList = null;

    public GetEligibleShipmentServicesResult shippingServiceList(ShippingServiceList shippingServiceList) {
        this.shippingServiceList = shippingServiceList;
        return this;
    }

    /**
     * Get shippingServiceList
     *
     * @return shippingServiceList
     **/
    @Schema(required = true, description = "")
    public ShippingServiceList getShippingServiceList() {
        return shippingServiceList;
    }

    public void setShippingServiceList(ShippingServiceList shippingServiceList) {
        this.shippingServiceList = shippingServiceList;
    }

    public GetEligibleShipmentServicesResult rejectedShippingServiceList(RejectedShippingServiceList rejectedShippingServiceList) {
        this.rejectedShippingServiceList = rejectedShippingServiceList;
        return this;
    }

    /**
     * Get rejectedShippingServiceList
     *
     * @return rejectedShippingServiceList
     **/
    @Schema(description = "")
    public RejectedShippingServiceList getRejectedShippingServiceList() {
        return rejectedShippingServiceList;
    }

    public void setRejectedShippingServiceList(RejectedShippingServiceList rejectedShippingServiceList) {
        this.rejectedShippingServiceList = rejectedShippingServiceList;
    }

    public GetEligibleShipmentServicesResult temporarilyUnavailableCarrierList(TemporarilyUnavailableCarrierList temporarilyUnavailableCarrierList) {
        this.temporarilyUnavailableCarrierList = temporarilyUnavailableCarrierList;
        return this;
    }

    /**
     * Get temporarilyUnavailableCarrierList
     *
     * @return temporarilyUnavailableCarrierList
     **/
    @Schema(description = "")
    public TemporarilyUnavailableCarrierList getTemporarilyUnavailableCarrierList() {
        return temporarilyUnavailableCarrierList;
    }

    public void setTemporarilyUnavailableCarrierList(TemporarilyUnavailableCarrierList temporarilyUnavailableCarrierList) {
        this.temporarilyUnavailableCarrierList = temporarilyUnavailableCarrierList;
    }

    public GetEligibleShipmentServicesResult termsAndConditionsNotAcceptedCarrierList(TermsAndConditionsNotAcceptedCarrierList termsAndConditionsNotAcceptedCarrierList) {
        this.termsAndConditionsNotAcceptedCarrierList = termsAndConditionsNotAcceptedCarrierList;
        return this;
    }

    /**
     * Get termsAndConditionsNotAcceptedCarrierList
     *
     * @return termsAndConditionsNotAcceptedCarrierList
     **/
    @Schema(description = "")
    public TermsAndConditionsNotAcceptedCarrierList getTermsAndConditionsNotAcceptedCarrierList() {
        return termsAndConditionsNotAcceptedCarrierList;
    }

    public void setTermsAndConditionsNotAcceptedCarrierList(TermsAndConditionsNotAcceptedCarrierList termsAndConditionsNotAcceptedCarrierList) {
        this.termsAndConditionsNotAcceptedCarrierList = termsAndConditionsNotAcceptedCarrierList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetEligibleShipmentServicesResult getEligibleShipmentServicesResult = (GetEligibleShipmentServicesResult) o;
        return Objects.equals(this.shippingServiceList, getEligibleShipmentServicesResult.shippingServiceList) &&
                Objects.equals(this.rejectedShippingServiceList, getEligibleShipmentServicesResult.rejectedShippingServiceList) &&
                Objects.equals(this.temporarilyUnavailableCarrierList, getEligibleShipmentServicesResult.temporarilyUnavailableCarrierList) &&
                Objects.equals(this.termsAndConditionsNotAcceptedCarrierList, getEligibleShipmentServicesResult.termsAndConditionsNotAcceptedCarrierList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shippingServiceList, rejectedShippingServiceList, temporarilyUnavailableCarrierList, termsAndConditionsNotAcceptedCarrierList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetEligibleShipmentServicesResult {\n");
        sb.append("    shippingServiceList: ").append(toIndentedString(shippingServiceList)).append("\n");
        sb.append("    rejectedShippingServiceList: ").append(toIndentedString(rejectedShippingServiceList)).append("\n");
        sb.append("    temporarilyUnavailableCarrierList: ").append(toIndentedString(temporarilyUnavailableCarrierList)).append("\n");
        sb.append("    termsAndConditionsNotAcceptedCarrierList: ").append(toIndentedString(termsAndConditionsNotAcceptedCarrierList)).append("\n");
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
