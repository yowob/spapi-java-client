package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Inbound shipment information, including carrier details and shipment status.
 */
@Schema(description = "Inbound shipment information, including carrier details and shipment status.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TransportDetailOutput {
    @SerializedName("PartneredSmallParcelData")
    private PartneredSmallParcelDataOutput partneredSmallParcelData = null;
    @SerializedName("NonPartneredSmallParcelData")
    private NonPartneredSmallParcelDataOutput nonPartneredSmallParcelData = null;
    @SerializedName("PartneredLtlData")
    private PartneredLtlDataOutput partneredLtlData = null;
    @SerializedName("NonPartneredLtlData")
    private NonPartneredLtlDataOutput nonPartneredLtlData = null;

    public TransportDetailOutput partneredSmallParcelData(PartneredSmallParcelDataOutput partneredSmallParcelData) {
        this.partneredSmallParcelData = partneredSmallParcelData;
        return this;
    }

    /**
     * Get partneredSmallParcelData
     *
     * @return partneredSmallParcelData
     **/
    @Schema(description = "")
    public PartneredSmallParcelDataOutput getPartneredSmallParcelData() {
        return partneredSmallParcelData;
    }

    public void setPartneredSmallParcelData(PartneredSmallParcelDataOutput partneredSmallParcelData) {
        this.partneredSmallParcelData = partneredSmallParcelData;
    }

    public TransportDetailOutput nonPartneredSmallParcelData(NonPartneredSmallParcelDataOutput nonPartneredSmallParcelData) {
        this.nonPartneredSmallParcelData = nonPartneredSmallParcelData;
        return this;
    }

    /**
     * Get nonPartneredSmallParcelData
     *
     * @return nonPartneredSmallParcelData
     **/
    @Schema(description = "")
    public NonPartneredSmallParcelDataOutput getNonPartneredSmallParcelData() {
        return nonPartneredSmallParcelData;
    }

    public void setNonPartneredSmallParcelData(NonPartneredSmallParcelDataOutput nonPartneredSmallParcelData) {
        this.nonPartneredSmallParcelData = nonPartneredSmallParcelData;
    }

    public TransportDetailOutput partneredLtlData(PartneredLtlDataOutput partneredLtlData) {
        this.partneredLtlData = partneredLtlData;
        return this;
    }

    /**
     * Get partneredLtlData
     *
     * @return partneredLtlData
     **/
    @Schema(description = "")
    public PartneredLtlDataOutput getPartneredLtlData() {
        return partneredLtlData;
    }

    public void setPartneredLtlData(PartneredLtlDataOutput partneredLtlData) {
        this.partneredLtlData = partneredLtlData;
    }

    public TransportDetailOutput nonPartneredLtlData(NonPartneredLtlDataOutput nonPartneredLtlData) {
        this.nonPartneredLtlData = nonPartneredLtlData;
        return this;
    }

    /**
     * Get nonPartneredLtlData
     *
     * @return nonPartneredLtlData
     **/
    @Schema(description = "")
    public NonPartneredLtlDataOutput getNonPartneredLtlData() {
        return nonPartneredLtlData;
    }

    public void setNonPartneredLtlData(NonPartneredLtlDataOutput nonPartneredLtlData) {
        this.nonPartneredLtlData = nonPartneredLtlData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransportDetailOutput transportDetailOutput = (TransportDetailOutput) o;
        return Objects.equals(this.partneredSmallParcelData, transportDetailOutput.partneredSmallParcelData) &&
                Objects.equals(this.nonPartneredSmallParcelData, transportDetailOutput.nonPartneredSmallParcelData) &&
                Objects.equals(this.partneredLtlData, transportDetailOutput.partneredLtlData) &&
                Objects.equals(this.nonPartneredLtlData, transportDetailOutput.nonPartneredLtlData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partneredSmallParcelData, nonPartneredSmallParcelData, partneredLtlData, nonPartneredLtlData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransportDetailOutput {\n");
        sb.append("    partneredSmallParcelData: ").append(toIndentedString(partneredSmallParcelData)).append("\n");
        sb.append("    nonPartneredSmallParcelData: ").append(toIndentedString(nonPartneredSmallParcelData)).append("\n");
        sb.append("    partneredLtlData: ").append(toIndentedString(partneredLtlData)).append("\n");
        sb.append("    nonPartneredLtlData: ").append(toIndentedString(nonPartneredLtlData)).append("\n");
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
