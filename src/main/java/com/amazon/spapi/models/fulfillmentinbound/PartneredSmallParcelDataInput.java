package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information that is required by an Amazon-partnered carrier to ship a Small Parcel inbound shipment.
 */
@Schema(description = "Information that is required by an Amazon-partnered carrier to ship a Small Parcel inbound shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PartneredSmallParcelDataInput {
    @SerializedName("PackageList")
    private PartneredSmallParcelPackageInputList packageList = null;
    @SerializedName("CarrierName")
    private String carrierName = null;

    public PartneredSmallParcelDataInput packageList(PartneredSmallParcelPackageInputList packageList) {
        this.packageList = packageList;
        return this;
    }

    /**
     * Get packageList
     *
     * @return packageList
     **/
    @Schema(description = "")
    public PartneredSmallParcelPackageInputList getPackageList() {
        return packageList;
    }

    public void setPackageList(PartneredSmallParcelPackageInputList packageList) {
        this.packageList = packageList;
    }

    public PartneredSmallParcelDataInput carrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * The Amazon-partnered carrier to use for the inbound shipment.
     *
     * @return carrierName
     **/
    @Schema(description = "The Amazon-partnered carrier to use for the inbound shipment.")
    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PartneredSmallParcelDataInput partneredSmallParcelDataInput = (PartneredSmallParcelDataInput) o;
        return Objects.equals(this.packageList, partneredSmallParcelDataInput.packageList) &&
                Objects.equals(this.carrierName, partneredSmallParcelDataInput.carrierName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageList, carrierName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartneredSmallParcelDataInput {\n");
        sb.append("    packageList: ").append(toIndentedString(packageList)).append("\n");
        sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
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
