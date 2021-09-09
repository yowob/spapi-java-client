package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;

import java.util.Objects;

/**
 * Information returned by Amazon about a Less Than Truckload/Full Truckload (LTL/FTL) shipment by an Amazon-partnered carrier.
 */
@Schema(description = "Information returned by Amazon about a Less Than Truckload/Full Truckload (LTL/FTL) shipment by an Amazon-partnered carrier.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PartneredLtlDataOutput {
    @SerializedName("Contact")
    private Contact contact = null;
    @SerializedName("BoxCount")
    private Long boxCount = null;
    @SerializedName("SellerFreightClass")
    private SellerFreightClass sellerFreightClass = null;
    @SerializedName("FreightReadyDate")
    private LocalDate freightReadyDate = null;
    @SerializedName("PalletList")
    private PalletList palletList = null;
    @SerializedName("TotalWeight")
    private Weight totalWeight = null;
    @SerializedName("SellerDeclaredValue")
    private Amount sellerDeclaredValue = null;
    @SerializedName("AmazonCalculatedValue")
    private Amount amazonCalculatedValue = null;
    @SerializedName("PreviewPickupDate")
    private LocalDate previewPickupDate = null;
    @SerializedName("PreviewDeliveryDate")
    private LocalDate previewDeliveryDate = null;
    @SerializedName("PreviewFreightClass")
    private SellerFreightClass previewFreightClass = null;
    @SerializedName("AmazonReferenceId")
    private String amazonReferenceId = null;
    @SerializedName("IsBillOfLadingAvailable")
    private Boolean isBillOfLadingAvailable = null;
    @SerializedName("PartneredEstimate")
    private PartneredEstimate partneredEstimate = null;
    @SerializedName("CarrierName")
    private String carrierName = null;

    public PartneredLtlDataOutput contact(Contact contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Get contact
     *
     * @return contact
     **/
    @Schema(required = true, description = "")
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public PartneredLtlDataOutput boxCount(Long boxCount) {
        this.boxCount = boxCount;
        return this;
    }

    /**
     * Get boxCount
     *
     * @return boxCount
     **/
    @Schema(required = true, description = "")
    public Long getBoxCount() {
        return boxCount;
    }

    public void setBoxCount(Long boxCount) {
        this.boxCount = boxCount;
    }

    public PartneredLtlDataOutput sellerFreightClass(SellerFreightClass sellerFreightClass) {
        this.sellerFreightClass = sellerFreightClass;
        return this;
    }

    /**
     * Get sellerFreightClass
     *
     * @return sellerFreightClass
     **/
    @Schema(description = "")
    public SellerFreightClass getSellerFreightClass() {
        return sellerFreightClass;
    }

    public void setSellerFreightClass(SellerFreightClass sellerFreightClass) {
        this.sellerFreightClass = sellerFreightClass;
    }

    public PartneredLtlDataOutput freightReadyDate(LocalDate freightReadyDate) {
        this.freightReadyDate = freightReadyDate;
        return this;
    }

    /**
     * Get freightReadyDate
     *
     * @return freightReadyDate
     **/
    @Schema(required = true, description = "")
    public LocalDate getFreightReadyDate() {
        return freightReadyDate;
    }

    public void setFreightReadyDate(LocalDate freightReadyDate) {
        this.freightReadyDate = freightReadyDate;
    }

    public PartneredLtlDataOutput palletList(PalletList palletList) {
        this.palletList = palletList;
        return this;
    }

    /**
     * Get palletList
     *
     * @return palletList
     **/
    @Schema(required = true, description = "")
    public PalletList getPalletList() {
        return palletList;
    }

    public void setPalletList(PalletList palletList) {
        this.palletList = palletList;
    }

    public PartneredLtlDataOutput totalWeight(Weight totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    /**
     * Get totalWeight
     *
     * @return totalWeight
     **/
    @Schema(required = true, description = "")
    public Weight getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Weight totalWeight) {
        this.totalWeight = totalWeight;
    }

    public PartneredLtlDataOutput sellerDeclaredValue(Amount sellerDeclaredValue) {
        this.sellerDeclaredValue = sellerDeclaredValue;
        return this;
    }

    /**
     * Get sellerDeclaredValue
     *
     * @return sellerDeclaredValue
     **/
    @Schema(description = "")
    public Amount getSellerDeclaredValue() {
        return sellerDeclaredValue;
    }

    public void setSellerDeclaredValue(Amount sellerDeclaredValue) {
        this.sellerDeclaredValue = sellerDeclaredValue;
    }

    public PartneredLtlDataOutput amazonCalculatedValue(Amount amazonCalculatedValue) {
        this.amazonCalculatedValue = amazonCalculatedValue;
        return this;
    }

    /**
     * Get amazonCalculatedValue
     *
     * @return amazonCalculatedValue
     **/
    @Schema(description = "")
    public Amount getAmazonCalculatedValue() {
        return amazonCalculatedValue;
    }

    public void setAmazonCalculatedValue(Amount amazonCalculatedValue) {
        this.amazonCalculatedValue = amazonCalculatedValue;
    }

    public PartneredLtlDataOutput previewPickupDate(LocalDate previewPickupDate) {
        this.previewPickupDate = previewPickupDate;
        return this;
    }

    /**
     * Get previewPickupDate
     *
     * @return previewPickupDate
     **/
    @Schema(required = true, description = "")
    public LocalDate getPreviewPickupDate() {
        return previewPickupDate;
    }

    public void setPreviewPickupDate(LocalDate previewPickupDate) {
        this.previewPickupDate = previewPickupDate;
    }

    public PartneredLtlDataOutput previewDeliveryDate(LocalDate previewDeliveryDate) {
        this.previewDeliveryDate = previewDeliveryDate;
        return this;
    }

    /**
     * Get previewDeliveryDate
     *
     * @return previewDeliveryDate
     **/
    @Schema(required = true, description = "")
    public LocalDate getPreviewDeliveryDate() {
        return previewDeliveryDate;
    }

    public void setPreviewDeliveryDate(LocalDate previewDeliveryDate) {
        this.previewDeliveryDate = previewDeliveryDate;
    }

    public PartneredLtlDataOutput previewFreightClass(SellerFreightClass previewFreightClass) {
        this.previewFreightClass = previewFreightClass;
        return this;
    }

    /**
     * Get previewFreightClass
     *
     * @return previewFreightClass
     **/
    @Schema(required = true, description = "")
    public SellerFreightClass getPreviewFreightClass() {
        return previewFreightClass;
    }

    public void setPreviewFreightClass(SellerFreightClass previewFreightClass) {
        this.previewFreightClass = previewFreightClass;
    }

    public PartneredLtlDataOutput amazonReferenceId(String amazonReferenceId) {
        this.amazonReferenceId = amazonReferenceId;
        return this;
    }

    /**
     * A unique identifier created by Amazon that identifies this Amazon-partnered, Less Than Truckload/Full Truckload (LTL/FTL) shipment.
     *
     * @return amazonReferenceId
     **/
    @Schema(required = true, description = "A unique identifier created by Amazon that identifies this Amazon-partnered, Less Than Truckload/Full Truckload (LTL/FTL) shipment.")
    public String getAmazonReferenceId() {
        return amazonReferenceId;
    }

    public void setAmazonReferenceId(String amazonReferenceId) {
        this.amazonReferenceId = amazonReferenceId;
    }

    public PartneredLtlDataOutput isBillOfLadingAvailable(Boolean isBillOfLadingAvailable) {
        this.isBillOfLadingAvailable = isBillOfLadingAvailable;
        return this;
    }

    /**
     * Indicates whether the bill of lading for the shipment is available.
     *
     * @return isBillOfLadingAvailable
     **/
    @Schema(required = true, description = "Indicates whether the bill of lading for the shipment is available.")
    public Boolean isIsBillOfLadingAvailable() {
        return isBillOfLadingAvailable;
    }

    public void setIsBillOfLadingAvailable(Boolean isBillOfLadingAvailable) {
        this.isBillOfLadingAvailable = isBillOfLadingAvailable;
    }

    public PartneredLtlDataOutput partneredEstimate(PartneredEstimate partneredEstimate) {
        this.partneredEstimate = partneredEstimate;
        return this;
    }

    /**
     * Get partneredEstimate
     *
     * @return partneredEstimate
     **/
    @Schema(description = "")
    public PartneredEstimate getPartneredEstimate() {
        return partneredEstimate;
    }

    public void setPartneredEstimate(PartneredEstimate partneredEstimate) {
        this.partneredEstimate = partneredEstimate;
    }

    public PartneredLtlDataOutput carrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * The carrier for the inbound shipment.
     *
     * @return carrierName
     **/
    @Schema(required = true, description = "The carrier for the inbound shipment.")
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
        PartneredLtlDataOutput partneredLtlDataOutput = (PartneredLtlDataOutput) o;
        return Objects.equals(this.contact, partneredLtlDataOutput.contact) &&
                Objects.equals(this.boxCount, partneredLtlDataOutput.boxCount) &&
                Objects.equals(this.sellerFreightClass, partneredLtlDataOutput.sellerFreightClass) &&
                Objects.equals(this.freightReadyDate, partneredLtlDataOutput.freightReadyDate) &&
                Objects.equals(this.palletList, partneredLtlDataOutput.palletList) &&
                Objects.equals(this.totalWeight, partneredLtlDataOutput.totalWeight) &&
                Objects.equals(this.sellerDeclaredValue, partneredLtlDataOutput.sellerDeclaredValue) &&
                Objects.equals(this.amazonCalculatedValue, partneredLtlDataOutput.amazonCalculatedValue) &&
                Objects.equals(this.previewPickupDate, partneredLtlDataOutput.previewPickupDate) &&
                Objects.equals(this.previewDeliveryDate, partneredLtlDataOutput.previewDeliveryDate) &&
                Objects.equals(this.previewFreightClass, partneredLtlDataOutput.previewFreightClass) &&
                Objects.equals(this.amazonReferenceId, partneredLtlDataOutput.amazonReferenceId) &&
                Objects.equals(this.isBillOfLadingAvailable, partneredLtlDataOutput.isBillOfLadingAvailable) &&
                Objects.equals(this.partneredEstimate, partneredLtlDataOutput.partneredEstimate) &&
                Objects.equals(this.carrierName, partneredLtlDataOutput.carrierName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contact, boxCount, sellerFreightClass, freightReadyDate, palletList, totalWeight, sellerDeclaredValue, amazonCalculatedValue, previewPickupDate, previewDeliveryDate, previewFreightClass, amazonReferenceId, isBillOfLadingAvailable, partneredEstimate, carrierName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartneredLtlDataOutput {\n");
        sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
        sb.append("    boxCount: ").append(toIndentedString(boxCount)).append("\n");
        sb.append("    sellerFreightClass: ").append(toIndentedString(sellerFreightClass)).append("\n");
        sb.append("    freightReadyDate: ").append(toIndentedString(freightReadyDate)).append("\n");
        sb.append("    palletList: ").append(toIndentedString(palletList)).append("\n");
        sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
        sb.append("    sellerDeclaredValue: ").append(toIndentedString(sellerDeclaredValue)).append("\n");
        sb.append("    amazonCalculatedValue: ").append(toIndentedString(amazonCalculatedValue)).append("\n");
        sb.append("    previewPickupDate: ").append(toIndentedString(previewPickupDate)).append("\n");
        sb.append("    previewDeliveryDate: ").append(toIndentedString(previewDeliveryDate)).append("\n");
        sb.append("    previewFreightClass: ").append(toIndentedString(previewFreightClass)).append("\n");
        sb.append("    amazonReferenceId: ").append(toIndentedString(amazonReferenceId)).append("\n");
        sb.append("    isBillOfLadingAvailable: ").append(toIndentedString(isBillOfLadingAvailable)).append("\n");
        sb.append("    partneredEstimate: ").append(toIndentedString(partneredEstimate)).append("\n");
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
