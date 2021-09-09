package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * The details of a shipment, including the shipment status.
 */
@Schema(description = "The details of a shipment, including the shipment status.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Shipment {
    @SerializedName("ShipmentId")
    private String shipmentId = null;
    @SerializedName("AmazonOrderId")
    private String amazonOrderId = null;
    @SerializedName("SellerOrderId")
    private String sellerOrderId = null;
    @SerializedName("ItemList")
    private ItemList itemList = null;
    @SerializedName("ShipFromAddress")
    private Address shipFromAddress = null;
    @SerializedName("ShipToAddress")
    private Address shipToAddress = null;
    @SerializedName("PackageDimensions")
    private PackageDimensions packageDimensions = null;
    @SerializedName("Weight")
    private Weight weight = null;
    @SerializedName("Insurance")
    private CurrencyAmount insurance = null;
    @SerializedName("ShippingService")
    private ShippingService shippingService = null;
    @SerializedName("Label")
    private Label label = null;
    @SerializedName("Status")
    private ShipmentStatus status = null;
    @SerializedName("TrackingId")
    private String trackingId = null;
    @SerializedName("CreatedDate")
    private OffsetDateTime createdDate = null;
    @SerializedName("LastUpdatedDate")
    private OffsetDateTime lastUpdatedDate = null;

    public Shipment shipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * Get shipmentId
     *
     * @return shipmentId
     **/
    @Schema(required = true, description = "")
    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Shipment amazonOrderId(String amazonOrderId) {
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

    public Shipment sellerOrderId(String sellerOrderId) {
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

    public Shipment itemList(ItemList itemList) {
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

    public Shipment shipFromAddress(Address shipFromAddress) {
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

    public Shipment shipToAddress(Address shipToAddress) {
        this.shipToAddress = shipToAddress;
        return this;
    }

    /**
     * Get shipToAddress
     *
     * @return shipToAddress
     **/
    @Schema(required = true, description = "")
    public Address getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(Address shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public Shipment packageDimensions(PackageDimensions packageDimensions) {
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

    public Shipment weight(Weight weight) {
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

    public Shipment insurance(CurrencyAmount insurance) {
        this.insurance = insurance;
        return this;
    }

    /**
     * Get insurance
     *
     * @return insurance
     **/
    @Schema(required = true, description = "")
    public CurrencyAmount getInsurance() {
        return insurance;
    }

    public void setInsurance(CurrencyAmount insurance) {
        this.insurance = insurance;
    }

    public Shipment shippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
        return this;
    }

    /**
     * Get shippingService
     *
     * @return shippingService
     **/
    @Schema(required = true, description = "")
    public ShippingService getShippingService() {
        return shippingService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Shipment label(Label label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     *
     * @return label
     **/
    @Schema(required = true, description = "")
    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public Shipment status(ShipmentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(required = true, description = "")
    public ShipmentStatus getStatus() {
        return status;
    }

    public void setStatus(ShipmentStatus status) {
        this.status = status;
    }

    public Shipment trackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get trackingId
     *
     * @return trackingId
     **/
    @Schema(description = "")
    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public Shipment createdDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get createdDate
     *
     * @return createdDate
     **/
    @Schema(required = true, description = "")
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Shipment lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    /**
     * Get lastUpdatedDate
     *
     * @return lastUpdatedDate
     **/
    @Schema(description = "")
    public OffsetDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(OffsetDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shipment shipment = (Shipment) o;
        return Objects.equals(this.shipmentId, shipment.shipmentId) &&
                Objects.equals(this.amazonOrderId, shipment.amazonOrderId) &&
                Objects.equals(this.sellerOrderId, shipment.sellerOrderId) &&
                Objects.equals(this.itemList, shipment.itemList) &&
                Objects.equals(this.shipFromAddress, shipment.shipFromAddress) &&
                Objects.equals(this.shipToAddress, shipment.shipToAddress) &&
                Objects.equals(this.packageDimensions, shipment.packageDimensions) &&
                Objects.equals(this.weight, shipment.weight) &&
                Objects.equals(this.insurance, shipment.insurance) &&
                Objects.equals(this.shippingService, shipment.shippingService) &&
                Objects.equals(this.label, shipment.label) &&
                Objects.equals(this.status, shipment.status) &&
                Objects.equals(this.trackingId, shipment.trackingId) &&
                Objects.equals(this.createdDate, shipment.createdDate) &&
                Objects.equals(this.lastUpdatedDate, shipment.lastUpdatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentId, amazonOrderId, sellerOrderId, itemList, shipFromAddress, shipToAddress, packageDimensions, weight, insurance, shippingService, label, status, trackingId, createdDate, lastUpdatedDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Shipment {\n");
        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
        sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
        sb.append("    sellerOrderId: ").append(toIndentedString(sellerOrderId)).append("\n");
        sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
        sb.append("    shipFromAddress: ").append(toIndentedString(shipFromAddress)).append("\n");
        sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
        sb.append("    packageDimensions: ").append(toIndentedString(packageDimensions)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
        sb.append("    shippingService: ").append(toIndentedString(shippingService)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
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
