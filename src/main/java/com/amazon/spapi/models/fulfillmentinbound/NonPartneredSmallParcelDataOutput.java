package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information returned by Amazon about a Small Parcel shipment by a carrier that has not partnered with Amazon.
 */
@Schema(description = "Information returned by Amazon about a Small Parcel shipment by a carrier that has not partnered with Amazon.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class NonPartneredSmallParcelDataOutput {
    @SerializedName("PackageList")
    private NonPartneredSmallParcelPackageOutputList packageList = null;

    public NonPartneredSmallParcelDataOutput packageList(NonPartneredSmallParcelPackageOutputList packageList) {
        this.packageList = packageList;
        return this;
    }

    /**
     * Get packageList
     *
     * @return packageList
     **/
    @Schema(required = true, description = "")
    public NonPartneredSmallParcelPackageOutputList getPackageList() {
        return packageList;
    }

    public void setPackageList(NonPartneredSmallParcelPackageOutputList packageList) {
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
        NonPartneredSmallParcelDataOutput nonPartneredSmallParcelDataOutput = (NonPartneredSmallParcelDataOutput) o;
        return Objects.equals(this.packageList, nonPartneredSmallParcelDataOutput.packageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NonPartneredSmallParcelDataOutput {\n");
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
