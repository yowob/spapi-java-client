package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Shipment information required for requesting shipping service offers or for creating a shipment.
 */
@Schema(description = "Shipment information required for requesting shipping service offers or for creating a shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ShipmentRequestDetails {
    @SerializedName("AmazonOrderId")
    private String amazonOrderId = null;
    @SerializedName("SellerOrderId")
    private String sellerOrderId = null;
    @SerializedName("ItemList")
    private ItemList itemList = null;
    @SerializedName("ShipFromAddress")
    private Address shipFromAddress = null;
    @SerializedName("PackageDimensions")
    private PackageDimensions packageDimensions = null;
    @SerializedName("Weight")
    private Weight weight = null;
    @SerializedName("MustArriveByDate")
    private OffsetDateTime mustArriveByDate = null;
    @SerializedName("ShipDate")
    private OffsetDateTime shipDate = null;
    @SerializedName("ShippingServiceOptions")
    private ShippingServiceOptions shippingServiceOptions = null;
    @SerializedName("LabelCustomization")
    private LabelCustomization labelCustomization = null;

    public ShipmentRequestDetails amazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * Get amazonOrderId
     *
     * @return amazonOrderId
     **/
    @Schema(required = true, description = "")
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    public ShipmentRequestDetails sellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
        return this;
    }

    /**
     * Get sellerOrderId
     *
     * @return sellerOrderId
     **/
    @Schema(description = "")
    public String getSellerOrderId() {
        return sellerOrderId;
    }

    public void setSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
    }

    public ShipmentRequestDetails itemList(ItemList itemList) {
        this.itemList = itemList;
        return this;
    }

    /**
     * Get itemList
     *
     * @return itemList
     **/
    @Schema(required = true, description = "")
    public ItemList getItemList() {
        return itemList;
    }

    public void setItemList(ItemList itemList) {
        this.itemList = itemList;
    }

    public ShipmentRequestDetails shipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
        return this;
    }

    /**
     * Get shipFromAddress
     *
     * @return shipFromAddress
     **/
    @Schema(required = true, description = "")
    public Address getShipFromAddress() {
        return shipFromAddress;
    }

    public void setShipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
    }

    public ShipmentRequestDetails packageDimensions(PackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
        return this;
    }

    /**
     * Get packageDimensions
     *
     * @return packageDimensions
     **/
    @Schema(required = true, description = "")
    public PackageDimensions getPackageDimensions() {
        return packageDimensions;
    }

    public void setPackageDimensions(PackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    public ShipmentRequestDetails weight(Weight weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get weight
     *
     * @return weight
     **/
    @Schema(required = true, description = "")
    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public ShipmentRequestDetails mustArriveByDate(OffsetDateTime mustArriveByDate) {
        this.mustArriveByDate = mustArriveByDate;
        return this;
    }

    /**
     * Get mustArriveByDate
     *
     * @return mustArriveByDate
     **/
    @Schema(description = "")
    public OffsetDateTime getMustArriveByDate() {
        return mustArriveByDate;
    }

    public void setMustArriveByDate(OffsetDateTime mustArriveByDate) {
        this.mustArriveByDate = mustArriveByDate;
    }

    public ShipmentRequestDetails shipDate(OffsetDateTime shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    /**
     * Get shipDate
     *
     * @return shipDate
     **/
    @Schema(description = "")
    public OffsetDateTime getShipDate() {
        return shipDate;
    }

    public void setShipDate(OffsetDateTime shipDate) {
        this.shipDate = shipDate;
    }

    public ShipmentRequestDetails shippingServiceOptions(ShippingServiceOptions shippingServiceOptions) {
        this.shippingServiceOptions = shippingServiceOptions;
        return this;
    }

    /**
     * Get shippingServiceOptions
     *
     * @return shippingServiceOptions
     **/
    @Schema(required = true, description = "")
    public ShippingServiceOptions getShippingServiceOptions() {
        return shippingServiceOptions;
    }

    public void setShippingServiceOptions(ShippingServiceOptions shippingServiceOptions) {
        this.shippingServiceOptions = shippingServiceOptions;
    }

    public ShipmentRequestDetails labelCustomization(LabelCustomization labelCustomization) {
        this.labelCustomization = labelCustomization;
        return this;
    }

    /**
     * Get labelCustomization
     *
     * @return labelCustomization
     **/
    @Schema(description = "")
    public LabelCustomization getLabelCustomization() {
        return labelCustomization;
    }

    public void setLabelCustomization(LabelCustomization labelCustomization) {
        this.labelCustomization = labelCustomization;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentRequestDetails shipmentRequestDetails = (ShipmentRequestDetails) o;
        return Objects.equals(this.amazonOrderId, shipmentRequestDetails.amazonOrderId) &&
                Objects.equals(this.sellerOrderId, shipmentRequestDetails.sellerOrderId) &&
                Objects.equals(this.itemList, shipmentRequestDetails.itemList) &&
                Objects.equals(this.shipFromAddress, shipmentRequestDetails.shipFromAddress) &&
                Objects.equals(this.packageDimensions, shipmentRequestDetails.packageDimensions) &&
                Objects.equals(this.weight, shipmentRequestDetails.weight) &&
                Objects.equals(this.mustArriveByDate, shipmentRequestDetails.mustArriveByDate) &&
                Objects.equals(this.shipDate, shipmentRequestDetails.shipDate) &&
                Objects.equals(this.shippingServiceOptions, shipmentRequestDetails.shippingServiceOptions) &&
                Objects.equals(this.labelCustomization, shipmentRequestDetails.labelCustomization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amazonOrderId, sellerOrderId, itemList, shipFromAddress, packageDimensions, weight, mustArriveByDate, shipDate, shippingServiceOptions, labelCustomization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipmentRequestDetails {\n");
        sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
        sb.append("    sellerOrderId: ").append(toIndentedString(sellerOrderId)).append("\n");
        sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
        sb.append("    shipFromAddress: ").append(toIndentedString(shipFromAddress)).append("\n");
        sb.append("    packageDimensions: ").append(toIndentedString(packageDimensions)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    mustArriveByDate: ").append(toIndentedString(mustArriveByDate)).append("\n");
        sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
        sb.append("    shippingServiceOptions: ").append(toIndentedString(shippingServiceOptions)).append("\n");
        sb.append("    labelCustomization: ").append(toIndentedString(labelCustomization)).append("\n");
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
