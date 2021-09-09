package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information that you provide to Amazon about a Small Parcel shipment shipped by a carrier that has not partnered with Amazon.
 */
@Schema(description = "Information that you provide to Amazon about a Small Parcel shipment shipped by a carrier that has not partnered with Amazon.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class NonPartneredSmallParcelDataInput {
    @SerializedName("CarrierName")
    private String carrierName = null;
    @SerializedName("PackageList")
    private NonPartneredSmallParcelPackageInputList packageList = null;

    public NonPartneredSmallParcelDataInput carrierName(String carrierName) {
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

    public NonPartneredSmallParcelDataInput packageList(NonPartneredSmallParcelPackageInputList packageList) {
        this.packageList = packageList;
        return this;
    }

    /**
     * Get packageList
     *
     * @return packageList
     **/
    @Schema(required = true, description = "")
    public NonPartneredSmallParcelPackageInputList getPackageList() {
        return packageList;
    }

    public void setPackageList(NonPartneredSmallParcelPackageInputList packageList) {
        this.packageList = packageList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NonPartneredSmallParcelDataInput nonPartneredSmallParcelDataInput = (NonPartneredSmallParcelDataInput) o;
        return Objects.equals(this.carrierName, nonPartneredSmallParcelDataInput.carrierName) &&
                Objects.equals(this.packageList, nonPartneredSmallParcelDataInput.packageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierName, packageList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NonPartneredSmallParcelDataInput {\n");
        sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
        sb.append("    packageList: ").append(toIndentedString(packageList)).append("\n");
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
