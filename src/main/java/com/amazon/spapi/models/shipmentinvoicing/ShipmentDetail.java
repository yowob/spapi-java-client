package com.amazon.spapi.models.shipmentinvoicing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * The information required by a selling partner to issue a shipment invoice.
 */
@Schema(description = "The information required by a selling partner to issue a shipment invoice.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ShipmentDetail {
    @SerializedName("WarehouseId")
    private String warehouseId = null;
    @SerializedName("AmazonOrderId")
    private String amazonOrderId = null;
    @SerializedName("AmazonShipmentId")
    private String amazonShipmentId = null;
    @SerializedName("PurchaseDate")
    private OffsetDateTime purchaseDate = null;
    @SerializedName("ShippingAddress")
    private Address shippingAddress = null;
    @SerializedName("PaymentMethodDetails")
    private PaymentMethodDetailItemList paymentMethodDetails = null;
    @SerializedName("MarketplaceId")
    private String marketplaceId = null;
    @SerializedName("SellerId")
    private String sellerId = null;
    @SerializedName("BuyerName")
    private String buyerName = null;
    @SerializedName("BuyerCounty")
    private String buyerCounty = null;
    @SerializedName("BuyerTaxInfo")
    private BuyerTaxInfo buyerTaxInfo = null;
    @SerializedName("MarketplaceTaxInfo")
    private MarketplaceTaxInfo marketplaceTaxInfo = null;
    @SerializedName("SellerDisplayName")
    private String sellerDisplayName = null;
    @SerializedName("ShipmentItems")
    private ShipmentItems shipmentItems = null;

    public ShipmentDetail warehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }

    /**
     * The Amazon-defined identifier for the warehouse.
     *
     * @return warehouseId
     **/
    @Schema(description = "The Amazon-defined identifier for the warehouse.")
    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public ShipmentDetail amazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * The Amazon-defined identifier for the order.
     *
     * @return amazonOrderId
     **/
    @Schema(description = "The Amazon-defined identifier for the order.")
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    public ShipmentDetail amazonShipmentId(String amazonShipmentId) {
        this.amazonShipmentId = amazonShipmentId;
        return this;
    }

    /**
     * The Amazon-defined identifier for the shipment.
     *
     * @return amazonShipmentId
     **/
    @Schema(description = "The Amazon-defined identifier for the shipment.")
    public String getAmazonShipmentId() {
        return amazonShipmentId;
    }

    public void setAmazonShipmentId(String amazonShipmentId) {
        this.amazonShipmentId = amazonShipmentId;
    }

    public ShipmentDetail purchaseDate(OffsetDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
        return this;
    }

    /**
     * The date and time when the order was created.
     *
     * @return purchaseDate
     **/
    @Schema(description = "The date and time when the order was created.")
    public OffsetDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(OffsetDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public ShipmentDetail shippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     * Get shippingAddress
     *
     * @return shippingAddress
     **/
    @Schema(description = "")
    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ShipmentDetail paymentMethodDetails(PaymentMethodDetailItemList paymentMethodDetails) {
        this.paymentMethodDetails = paymentMethodDetails;
        return this;
    }

    /**
     * Get paymentMethodDetails
     *
     * @return paymentMethodDetails
     **/
    @Schema(description = "")
    public PaymentMethodDetailItemList getPaymentMethodDetails() {
        return paymentMethodDetails;
    }

    public void setPaymentMethodDetails(PaymentMethodDetailItemList paymentMethodDetails) {
        this.paymentMethodDetails = paymentMethodDetails;
    }

    public ShipmentDetail marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * The identifier for the marketplace where the order was placed.
     *
     * @return marketplaceId
     **/
    @Schema(description = "The identifier for the marketplace where the order was placed.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public ShipmentDetail sellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * The seller identifier.
     *
     * @return sellerId
     **/
    @Schema(description = "The seller identifier.")
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public ShipmentDetail buyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }

    /**
     * The name of the buyer.
     *
     * @return buyerName
     **/
    @Schema(description = "The name of the buyer.")
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public ShipmentDetail buyerCounty(String buyerCounty) {
        this.buyerCounty = buyerCounty;
        return this;
    }

    /**
     * The county of the buyer.
     *
     * @return buyerCounty
     **/
    @Schema(description = "The county of the buyer.")
    public String getBuyerCounty() {
        return buyerCounty;
    }

    public void setBuyerCounty(String buyerCounty) {
        this.buyerCounty = buyerCounty;
    }

    public ShipmentDetail buyerTaxInfo(BuyerTaxInfo buyerTaxInfo) {
        this.buyerTaxInfo = buyerTaxInfo;
        return this;
    }

    /**
     * Get buyerTaxInfo
     *
     * @return buyerTaxInfo
     **/
    @Schema(description = "")
    public BuyerTaxInfo getBuyerTaxInfo() {
        return buyerTaxInfo;
    }

    public void setBuyerTaxInfo(BuyerTaxInfo buyerTaxInfo) {
        this.buyerTaxInfo = buyerTaxInfo;
    }

    public ShipmentDetail marketplaceTaxInfo(MarketplaceTaxInfo marketplaceTaxInfo) {
        this.marketplaceTaxInfo = marketplaceTaxInfo;
        return this;
    }

    /**
     * Get marketplaceTaxInfo
     *
     * @return marketplaceTaxInfo
     **/
    @Schema(description = "")
    public MarketplaceTaxInfo getMarketplaceTaxInfo() {
        return marketplaceTaxInfo;
    }

    public void setMarketplaceTaxInfo(MarketplaceTaxInfo marketplaceTaxInfo) {
        this.marketplaceTaxInfo = marketplaceTaxInfo;
    }

    public ShipmentDetail sellerDisplayName(String sellerDisplayName) {
        this.sellerDisplayName = sellerDisplayName;
        return this;
    }

    /**
     * The seller’s friendly name registered in the marketplace.
     *
     * @return sellerDisplayName
     **/
    @Schema(description = "The seller’s friendly name registered in the marketplace.")
    public String getSellerDisplayName() {
        return sellerDisplayName;
    }

    public void setSellerDisplayName(String sellerDisplayName) {
        this.sellerDisplayName = sellerDisplayName;
    }

    public ShipmentDetail shipmentItems(ShipmentItems shipmentItems) {
        this.shipmentItems = shipmentItems;
        return this;
    }

    /**
     * Get shipmentItems
     *
     * @return shipmentItems
     **/
    @Schema(description = "")
    public ShipmentItems getShipmentItems() {
        return shipmentItems;
    }

    public void setShipmentItems(ShipmentItems shipmentItems) {
        this.shipmentItems = shipmentItems;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentDetail shipmentDetail = (ShipmentDetail) o;
        return Objects.equals(this.warehouseId, shipmentDetail.warehouseId) &&
                Objects.equals(this.amazonOrderId, shipmentDetail.amazonOrderId) &&
                Objects.equals(this.amazonShipmentId, shipmentDetail.amazonShipmentId) &&
                Objects.equals(this.purchaseDate, shipmentDetail.purchaseDate) &&
                Objects.equals(this.shippingAddress, shipmentDetail.shippingAddress) &&
                Objects.equals(this.paymentMethodDetails, shipmentDetail.paymentMethodDetails) &&
                Objects.equals(this.marketplaceId, shipmentDetail.marketplaceId) &&
                Objects.equals(this.sellerId, shipmentDetail.sellerId) &&
                Objects.equals(this.buyerName, shipmentDetail.buyerName) &&
                Objects.equals(this.buyerCounty, shipmentDetail.buyerCounty) &&
                Objects.equals(this.buyerTaxInfo, shipmentDetail.buyerTaxInfo) &&
                Objects.equals(this.marketplaceTaxInfo, shipmentDetail.marketplaceTaxInfo) &&
                Objects.equals(this.sellerDisplayName, shipmentDetail.sellerDisplayName) &&
                Objects.equals(this.shipmentItems, shipmentDetail.shipmentItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warehouseId, amazonOrderId, amazonShipmentId, purchaseDate, shippingAddress, paymentMethodDetails, marketplaceId, sellerId, buyerName, buyerCounty, buyerTaxInfo, marketplaceTaxInfo, sellerDisplayName, shipmentItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipmentDetail {\n");
        sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
        sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
        sb.append("    amazonShipmentId: ").append(toIndentedString(amazonShipmentId)).append("\n");
        sb.append("    purchaseDate: ").append(toIndentedString(purchaseDate)).append("\n");
        sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
        sb.append("    paymentMethodDetails: ").append(toIndentedString(paymentMethodDetails)).append("\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
        sb.append("    buyerName: ").append(toIndentedString(buyerName)).append("\n");
        sb.append("    buyerCounty: ").append(toIndentedString(buyerCounty)).append("\n");
        sb.append("    buyerTaxInfo: ").append(toIndentedString(buyerTaxInfo)).append("\n");
        sb.append("    marketplaceTaxInfo: ").append(toIndentedString(marketplaceTaxInfo)).append("\n");
        sb.append("    sellerDisplayName: ").append(toIndentedString(sellerDisplayName)).append("\n");
        sb.append("    shipmentItems: ").append(toIndentedString(shipmentItems)).append("\n");
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
