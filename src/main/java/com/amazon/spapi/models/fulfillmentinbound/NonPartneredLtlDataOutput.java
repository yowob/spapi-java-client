package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information returned by Amazon about a Less Than Truckload/Full Truckload (LTL/FTL) shipment shipped by a carrier that has not partnered with Amazon.
 */
@Schema(description = "Information returned by Amazon about a Less Than Truckload/Full Truckload (LTL/FTL) shipment shipped by a carrier that has not partnered with Amazon.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class NonPartneredLtlDataOutput {
    @SerializedName("CarrierName")
    private String carrierName = null;
    @SerializedName("ProNumber")
    private String proNumber = null;

    public NonPartneredLtlDataOutput carrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * The carrier that you are using for the inbound shipment.
     *
     * @return carrierName
     **/
    @Schema(required = true, description = "The carrier that you are using for the inbound shipment.")
    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public NonPartneredLtlDataOutput proNumber(String proNumber) {
        this.proNumber = proNumber;
        return this;
    }

    /**
     * Get proNumber
     *
     * @return proNumber
     **/
    @Schema(required = true, description = "")
    public String getProNumber() {
        return proNumber;
    }

    public void setProNumber(String proNumber) {
        this.proNumber = proNumber;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NonPartneredLtlDataOutput nonPartneredLtlDataOutput = (NonPartneredLtlDataOutput) o;
        return Objects.equals(this.carrierName, nonPartneredLtlDataOutput.carrierName) &&
                Objects.equals(this.proNumber, nonPartneredLtlDataOutput.proNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierName, proNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NonPartneredLtlDataOutput {\n");
        sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
        sb.append("    proNumber: ").append(toIndentedString(proNumber)).append("\n");
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
