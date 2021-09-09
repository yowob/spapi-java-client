package com.amazon.spapi.models.orders;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * Order information.
 */
@Schema(description = "Order information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Order {
    @SerializedName("AmazonOrderId")
    private String amazonOrderId = null;
    @SerializedName("SellerOrderId")
    private String sellerOrderId = null;
    @SerializedName("PurchaseDate")
    private String purchaseDate = null;
    @SerializedName("LastUpdateDate")
    private String lastUpdateDate = null;
    @SerializedName("OrderStatus")
    private OrderStatusEnum orderStatus = null;
    @SerializedName("FulfillmentChannel")
    private FulfillmentChannelEnum fulfillmentChannel = null;
    @SerializedName("SalesChannel")
    private String salesChannel = null;
    @SerializedName("OrderChannel")
    private String orderChannel = null;
    @SerializedName("ShipServiceLevel")
    private String shipServiceLevel = null;
    @SerializedName("OrderTotal")
    private Money orderTotal = null;
    @SerializedName("NumberOfItemsShipped")
    private Integer numberOfItemsShipped = null;
    @SerializedName("NumberOfItemsUnshipped")
    private Integer numberOfItemsUnshipped = null;
    @SerializedName("PaymentExecutionDetail")
    private PaymentExecutionDetailItemList paymentExecutionDetail = null;
    @SerializedName("PaymentMethod")
    private PaymentMethodEnum paymentMethod = null;
    @SerializedName("PaymentMethodDetails")
    private PaymentMethodDetailItemList paymentMethodDetails = null;
    @SerializedName("MarketplaceId")
    private String marketplaceId = null;
    @SerializedName("ShipmentServiceLevelCategory")
    private String shipmentServiceLevelCategory = null;
    @SerializedName("EasyShipShipmentStatus")
    private String easyShipShipmentStatus = null;
    @SerializedName("CbaDisplayableShippingLabel")
    private String cbaDisplayableShippingLabel = null;
    @SerializedName("OrderType")
    private OrderTypeEnum orderType = null;
    @SerializedName("EarliestShipDate")
    private String earliestShipDate = null;
    @SerializedName("LatestShipDate")
    private String latestShipDate = null;
    @SerializedName("EarliestDeliveryDate")
    private String earliestDeliveryDate = null;
    @SerializedName("LatestDeliveryDate")
    private String latestDeliveryDate = null;
    @SerializedName("IsBusinessOrder")
    private Boolean isBusinessOrder = null;
    @SerializedName("IsPrime")
    private Boolean isPrime = null;
    @SerializedName("IsPremiumOrder")
    private Boolean isPremiumOrder = null;
    @SerializedName("IsGlobalExpressEnabled")
    private Boolean isGlobalExpressEnabled = null;
    @SerializedName("ReplacedOrderId")
    private String replacedOrderId = null;
    @SerializedName("IsReplacementOrder")
    private Boolean isReplacementOrder = null;
    @SerializedName("PromiseResponseDueDate")
    private String promiseResponseDueDate = null;
    @SerializedName("IsEstimatedShipDateSet")
    private Boolean isEstimatedShipDateSet = null;
    @SerializedName("IsSoldByAB")
    private Boolean isSoldByAB = null;
    @SerializedName("DefaultShipFromLocationAddress")
    private Address defaultShipFromLocationAddress = null;
    @SerializedName("FulfillmentInstruction")
    private FulfillmentInstruction fulfillmentInstruction = null;
    @SerializedName("IsISPU")
    private Boolean isISPU = null;
    @SerializedName("MarketplaceTaxInfo")
    private MarketplaceTaxInfo marketplaceTaxInfo = null;
    @SerializedName("SellerDisplayName")
    private String sellerDisplayName = null;
    @SerializedName("ShippingAddress")
    private Address shippingAddress = null;
    @SerializedName("BuyerInfo")
    private BuyerInfo buyerInfo = null;

    public Order amazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * An Amazon-defined order identifier, in 3-7-7 format.
     *
     * @return amazonOrderId
     **/
    @Schema(required = true, description = "An Amazon-defined order identifier, in 3-7-7 format.")
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    public Order sellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
        return this;
    }

    /**
     * A seller-defined order identifier.
     *
     * @return sellerOrderId
     **/
    @Schema(description = "A seller-defined order identifier.")
    public String getSellerOrderId() {
        return sellerOrderId;
    }

    public void setSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
    }

    public Order purchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
        return this;
    }

    /**
     * The date when the order was created.
     *
     * @return purchaseDate
     **/
    @Schema(required = true, description = "The date when the order was created.")
    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Order lastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    /**
     * The date when the order was last updated.  Note: LastUpdateDate is returned with an incorrect date for orders that were last updated before 2009-04-01.
     *
     * @return lastUpdateDate
     **/
    @Schema(required = true, description = "The date when the order was last updated.  Note: LastUpdateDate is returned with an incorrect date for orders that were last updated before 2009-04-01.")
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Order orderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * The current order status.
     *
     * @return orderStatus
     **/
    @Schema(required = true, description = "The current order status.")
    public OrderStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Order fulfillmentChannel(FulfillmentChannelEnum fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
        return this;
    }

    /**
     * Whether the order was fulfilled by Amazon (AFN) or by the seller (MFN).
     *
     * @return fulfillmentChannel
     **/
    @Schema(description = "Whether the order was fulfilled by Amazon (AFN) or by the seller (MFN).")
    public FulfillmentChannelEnum getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    public void setFulfillmentChannel(FulfillmentChannelEnum fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
    }

    public Order salesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
        return this;
    }

    /**
     * The sales channel of the first item in the order.
     *
     * @return salesChannel
     **/
    @Schema(description = "The sales channel of the first item in the order.")
    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    public Order orderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
        return this;
    }

    /**
     * The order channel of the first item in the order.
     *
     * @return orderChannel
     **/
    @Schema(description = "The order channel of the first item in the order.")
    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

    public Order shipServiceLevel(String shipServiceLevel) {
        this.shipServiceLevel = shipServiceLevel;
        return this;
    }

    /**
     * The shipment service level of the order.
     *
     * @return shipServiceLevel
     **/
    @Schema(description = "The shipment service level of the order.")
    public String getShipServiceLevel() {
        return shipServiceLevel;
    }

    public void setShipServiceLevel(String shipServiceLevel) {
        this.shipServiceLevel = shipServiceLevel;
    }

    public Order orderTotal(Money orderTotal) {
        this.orderTotal = orderTotal;
        return this;
    }

    /**
     * Get orderTotal
     *
     * @return orderTotal
     **/
    @Schema(description = "")
    public Money getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Money orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Order numberOfItemsShipped(Integer numberOfItemsShipped) {
        this.numberOfItemsShipped = numberOfItemsShipped;
        return this;
    }

    /**
     * The number of items shipped.
     *
     * @return numberOfItemsShipped
     **/
    @Schema(description = "The number of items shipped.")
    public Integer getNumberOfItemsShipped() {
        return numberOfItemsShipped;
    }

    public void setNumberOfItemsShipped(Integer numberOfItemsShipped) {
        this.numberOfItemsShipped = numberOfItemsShipped;
    }

    public Order numberOfItemsUnshipped(Integer numberOfItemsUnshipped) {
        this.numberOfItemsUnshipped = numberOfItemsUnshipped;
        return this;
    }

    /**
     * The number of items unshipped.
     *
     * @return numberOfItemsUnshipped
     **/
    @Schema(description = "The number of items unshipped.")
    public Integer getNumberOfItemsUnshipped() {
        return numberOfItemsUnshipped;
    }

    public void setNumberOfItemsUnshipped(Integer numberOfItemsUnshipped) {
        this.numberOfItemsUnshipped = numberOfItemsUnshipped;
    }

    public Order paymentExecutionDetail(PaymentExecutionDetailItemList paymentExecutionDetail) {
        this.paymentExecutionDetail = paymentExecutionDetail;
        return this;
    }

    /**
     * Get paymentExecutionDetail
     *
     * @return paymentExecutionDetail
     **/
    @Schema(description = "")
    public PaymentExecutionDetailItemList getPaymentExecutionDetail() {
        return paymentExecutionDetail;
    }

    public void setPaymentExecutionDetail(PaymentExecutionDetailItemList paymentExecutionDetail) {
        this.paymentExecutionDetail = paymentExecutionDetail;
    }

    public Order paymentMethod(PaymentMethodEnum paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * The payment method for the order. This property is limited to Cash On Delivery (COD) and Convenience Store (CVS) payment methods. Unless you need the specific COD payment information provided by the PaymentExecutionDetailItem object, we recommend using the PaymentMethodDetails property to get payment method information.
     *
     * @return paymentMethod
     **/
    @Schema(description = "The payment method for the order. This property is limited to Cash On Delivery (COD) and Convenience Store (CVS) payment methods. Unless you need the specific COD payment information provided by the PaymentExecutionDetailItem object, we recommend using the PaymentMethodDetails property to get payment method information.")
    public PaymentMethodEnum getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Order paymentMethodDetails(PaymentMethodDetailItemList paymentMethodDetails) {
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

    public Order marketplaceId(String marketplaceId) {
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

    public Order shipmentServiceLevelCategory(String shipmentServiceLevelCategory) {
        this.shipmentServiceLevelCategory = shipmentServiceLevelCategory;
        return this;
    }

    /**
     * The shipment service level category of the order.  Possible values: Expedited, FreeEconomy, NextDay, SameDay, SecondDay, Scheduled, Standard.
     *
     * @return shipmentServiceLevelCategory
     **/
    @Schema(description = "The shipment service level category of the order.  Possible values: Expedited, FreeEconomy, NextDay, SameDay, SecondDay, Scheduled, Standard.")
    public String getShipmentServiceLevelCategory() {
        return shipmentServiceLevelCategory;
    }

    public void setShipmentServiceLevelCategory(String shipmentServiceLevelCategory) {
        this.shipmentServiceLevelCategory = shipmentServiceLevelCategory;
    }

    public Order easyShipShipmentStatus(String easyShipShipmentStatus) {
        this.easyShipShipmentStatus = easyShipShipmentStatus;
        return this;
    }

    /**
     * The status of the Amazon Easy Ship order. This property is included only for Amazon Easy Ship orders.  Possible values: PendingPickUp, LabelCanceled, PickedUp, OutForDelivery, Damaged, Delivered, RejectedByBuyer, Undeliverable, ReturnedToSeller, ReturningToSeller.
     *
     * @return easyShipShipmentStatus
     **/
    @Schema(description = "The status of the Amazon Easy Ship order. This property is included only for Amazon Easy Ship orders.  Possible values: PendingPickUp, LabelCanceled, PickedUp, OutForDelivery, Damaged, Delivered, RejectedByBuyer, Undeliverable, ReturnedToSeller, ReturningToSeller.")
    public String getEasyShipShipmentStatus() {
        return easyShipShipmentStatus;
    }

    public void setEasyShipShipmentStatus(String easyShipShipmentStatus) {
        this.easyShipShipmentStatus = easyShipShipmentStatus;
    }

    public Order cbaDisplayableShippingLabel(String cbaDisplayableShippingLabel) {
        this.cbaDisplayableShippingLabel = cbaDisplayableShippingLabel;
        return this;
    }

    /**
     * Custom ship label for Checkout by Amazon (CBA).
     *
     * @return cbaDisplayableShippingLabel
     **/
    @Schema(description = "Custom ship label for Checkout by Amazon (CBA).")
    public String getCbaDisplayableShippingLabel() {
        return cbaDisplayableShippingLabel;
    }

    public void setCbaDisplayableShippingLabel(String cbaDisplayableShippingLabel) {
        this.cbaDisplayableShippingLabel = cbaDisplayableShippingLabel;
    }

    public Order orderType(OrderTypeEnum orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * The type of the order.
     *
     * @return orderType
     **/
    @Schema(description = "The type of the order.")
    public OrderTypeEnum getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderTypeEnum orderType) {
        this.orderType = orderType;
    }

    public Order earliestShipDate(String earliestShipDate) {
        this.earliestShipDate = earliestShipDate;
        return this;
    }

    /**
     * The start of the time period within which you have committed to ship the order. In ISO 8601 date time format. Returned only for seller-fulfilled orders.  Note: EarliestShipDate might not be returned for orders placed before February 1, 2013.
     *
     * @return earliestShipDate
     **/
    @Schema(description = "The start of the time period within which you have committed to ship the order. In ISO 8601 date time format. Returned only for seller-fulfilled orders.  Note: EarliestShipDate might not be returned for orders placed before February 1, 2013.")
    public String getEarliestShipDate() {
        return earliestShipDate;
    }

    public void setEarliestShipDate(String earliestShipDate) {
        this.earliestShipDate = earliestShipDate;
    }

    public Order latestShipDate(String latestShipDate) {
        this.latestShipDate = latestShipDate;
        return this;
    }

    /**
     * The end of the time period within which you have committed to ship the order. In ISO 8601 date time format. Returned only for seller-fulfilled orders.  Note: LatestShipDate might not be returned for orders placed before February 1, 2013.
     *
     * @return latestShipDate
     **/
    @Schema(description = "The end of the time period within which you have committed to ship the order. In ISO 8601 date time format. Returned only for seller-fulfilled orders.  Note: LatestShipDate might not be returned for orders placed before February 1, 2013.")
    public String getLatestShipDate() {
        return latestShipDate;
    }

    public void setLatestShipDate(String latestShipDate) {
        this.latestShipDate = latestShipDate;
    }

    public Order earliestDeliveryDate(String earliestDeliveryDate) {
        this.earliestDeliveryDate = earliestDeliveryDate;
        return this;
    }

    /**
     * The start of the time period within which you have committed to fulfill the order. In ISO 8601 date time format. Returned only for seller-fulfilled orders.
     *
     * @return earliestDeliveryDate
     **/
    @Schema(description = "The start of the time period within which you have committed to fulfill the order. In ISO 8601 date time format. Returned only for seller-fulfilled orders.")
    public String getEarliestDeliveryDate() {
        return earliestDeliveryDate;
    }

    public void setEarliestDeliveryDate(String earliestDeliveryDate) {
        this.earliestDeliveryDate = earliestDeliveryDate;
    }

    public Order latestDeliveryDate(String latestDeliveryDate) {
        this.latestDeliveryDate = latestDeliveryDate;
        return this;
    }

    /**
     * The end of the time period within which you have committed to fulfill the order. In ISO 8601 date time format. Returned only for seller-fulfilled orders that do not have a PendingAvailability, Pending, or Canceled status.
     *
     * @return latestDeliveryDate
     **/
    @Schema(description = "The end of the time period within which you have committed to fulfill the order. In ISO 8601 date time format. Returned only for seller-fulfilled orders that do not have a PendingAvailability, Pending, or Canceled status.")
    public String getLatestDeliveryDate() {
        return latestDeliveryDate;
    }

    public void setLatestDeliveryDate(String latestDeliveryDate) {
        this.latestDeliveryDate = latestDeliveryDate;
    }

    public Order isBusinessOrder(Boolean isBusinessOrder) {
        this.isBusinessOrder = isBusinessOrder;
        return this;
    }

    /**
     * When true, the order is an Amazon Business order. An Amazon Business order is an order where the buyer is a Verified Business Buyer.
     *
     * @return isBusinessOrder
     **/
    @Schema(description = "When true, the order is an Amazon Business order. An Amazon Business order is an order where the buyer is a Verified Business Buyer.")
    public Boolean isIsBusinessOrder() {
        return isBusinessOrder;
    }

    public void setIsBusinessOrder(Boolean isBusinessOrder) {
        this.isBusinessOrder = isBusinessOrder;
    }

    public Order isPrime(Boolean isPrime) {
        this.isPrime = isPrime;
        return this;
    }

    /**
     * When true, the order is a seller-fulfilled Amazon Prime order.
     *
     * @return isPrime
     **/
    @Schema(description = "When true, the order is a seller-fulfilled Amazon Prime order.")
    public Boolean isIsPrime() {
        return isPrime;
    }

    public void setIsPrime(Boolean isPrime) {
        this.isPrime = isPrime;
    }

    public Order isPremiumOrder(Boolean isPremiumOrder) {
        this.isPremiumOrder = isPremiumOrder;
        return this;
    }

    /**
     * When true, the order has a Premium Shipping Service Level Agreement. For more information about Premium Shipping orders, see \&quot;Premium Shipping Options\&quot; in the Seller Central Help for your marketplace.
     *
     * @return isPremiumOrder
     **/
    @Schema(description = "When true, the order has a Premium Shipping Service Level Agreement. For more information about Premium Shipping orders, see \"Premium Shipping Options\" in the Seller Central Help for your marketplace.")
    public Boolean isIsPremiumOrder() {
        return isPremiumOrder;
    }

    public void setIsPremiumOrder(Boolean isPremiumOrder) {
        this.isPremiumOrder = isPremiumOrder;
    }

    public Order isGlobalExpressEnabled(Boolean isGlobalExpressEnabled) {
        this.isGlobalExpressEnabled = isGlobalExpressEnabled;
        return this;
    }

    /**
     * When true, the order is a GlobalExpress order.
     *
     * @return isGlobalExpressEnabled
     **/
    @Schema(description = "When true, the order is a GlobalExpress order.")
    public Boolean isIsGlobalExpressEnabled() {
        return isGlobalExpressEnabled;
    }

    public void setIsGlobalExpressEnabled(Boolean isGlobalExpressEnabled) {
        this.isGlobalExpressEnabled = isGlobalExpressEnabled;
    }

    public Order replacedOrderId(String replacedOrderId) {
        this.replacedOrderId = replacedOrderId;
        return this;
    }

    /**
     * The order ID value for the order that is being replaced. Returned only if IsReplacementOrder &#x3D; true.
     *
     * @return replacedOrderId
     **/
    @Schema(description = "The order ID value for the order that is being replaced. Returned only if IsReplacementOrder = true.")
    public String getReplacedOrderId() {
        return replacedOrderId;
    }

    public void setReplacedOrderId(String replacedOrderId) {
        this.replacedOrderId = replacedOrderId;
    }

    public Order isReplacementOrder(Boolean isReplacementOrder) {
        this.isReplacementOrder = isReplacementOrder;
        return this;
    }

    /**
     * When true, this is a replacement order.
     *
     * @return isReplacementOrder
     **/
    @Schema(description = "When true, this is a replacement order.")
    public Boolean isIsReplacementOrder() {
        return isReplacementOrder;
    }

    public void setIsReplacementOrder(Boolean isReplacementOrder) {
        this.isReplacementOrder = isReplacementOrder;
    }

    public Order promiseResponseDueDate(String promiseResponseDueDate) {
        this.promiseResponseDueDate = promiseResponseDueDate;
        return this;
    }

    /**
     * Indicates the date by which the seller must respond to the buyer with an estimated ship date. Returned only for Sourcing on Demand orders.
     *
     * @return promiseResponseDueDate
     **/
    @Schema(description = "Indicates the date by which the seller must respond to the buyer with an estimated ship date. Returned only for Sourcing on Demand orders.")
    public String getPromiseResponseDueDate() {
        return promiseResponseDueDate;
    }

    public void setPromiseResponseDueDate(String promiseResponseDueDate) {
        this.promiseResponseDueDate = promiseResponseDueDate;
    }

    public Order isEstimatedShipDateSet(Boolean isEstimatedShipDateSet) {
        this.isEstimatedShipDateSet = isEstimatedShipDateSet;
        return this;
    }

    /**
     * When true, the estimated ship date is set for the order. Returned only for Sourcing on Demand orders.
     *
     * @return isEstimatedShipDateSet
     **/
    @Schema(description = "When true, the estimated ship date is set for the order. Returned only for Sourcing on Demand orders.")
    public Boolean isIsEstimatedShipDateSet() {
        return isEstimatedShipDateSet;
    }

    public void setIsEstimatedShipDateSet(Boolean isEstimatedShipDateSet) {
        this.isEstimatedShipDateSet = isEstimatedShipDateSet;
    }

    public Order isSoldByAB(Boolean isSoldByAB) {
        this.isSoldByAB = isSoldByAB;
        return this;
    }

    /**
     * When true, the item within this order was bought and re-sold by Amazon Business EU SARL (ABEU). By buying and instantly re-selling your items, ABEU becomes the seller of record, making your inventory available for sale to customers who would not otherwise purchase from a third-party seller.
     *
     * @return isSoldByAB
     **/
    @Schema(description = "When true, the item within this order was bought and re-sold by Amazon Business EU SARL (ABEU). By buying and instantly re-selling your items, ABEU becomes the seller of record, making your inventory available for sale to customers who would not otherwise purchase from a third-party seller.")
    public Boolean isIsSoldByAB() {
        return isSoldByAB;
    }

    public void setIsSoldByAB(Boolean isSoldByAB) {
        this.isSoldByAB = isSoldByAB;
    }

    public Order defaultShipFromLocationAddress(Address defaultShipFromLocationAddress) {
        this.defaultShipFromLocationAddress = defaultShipFromLocationAddress;
        return this;
    }

    /**
     * Get defaultShipFromLocationAddress
     *
     * @return defaultShipFromLocationAddress
     **/
    @Schema(description = "")
    public Address getDefaultShipFromLocationAddress() {
        return defaultShipFromLocationAddress;
    }

    public void setDefaultShipFromLocationAddress(Address defaultShipFromLocationAddress) {
        this.defaultShipFromLocationAddress = defaultShipFromLocationAddress;
    }

    public Order fulfillmentInstruction(FulfillmentInstruction fulfillmentInstruction) {
        this.fulfillmentInstruction = fulfillmentInstruction;
        return this;
    }

    /**
     * Get fulfillmentInstruction
     *
     * @return fulfillmentInstruction
     **/
    @Schema(description = "")
    public FulfillmentInstruction getFulfillmentInstruction() {
        return fulfillmentInstruction;
    }

    public void setFulfillmentInstruction(FulfillmentInstruction fulfillmentInstruction) {
        this.fulfillmentInstruction = fulfillmentInstruction;
    }

    public Order isISPU(Boolean isISPU) {
        this.isISPU = isISPU;
        return this;
    }

    /**
     * When true, this order is marked to be picked up from a store rather than delivered.
     *
     * @return isISPU
     **/
    @Schema(description = "When true, this order is marked to be picked up from a store rather than delivered.")
    public Boolean isIsISPU() {
        return isISPU;
    }

    public void setIsISPU(Boolean isISPU) {
        this.isISPU = isISPU;
    }

    public Order marketplaceTaxInfo(MarketplaceTaxInfo marketplaceTaxInfo) {
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

    public Order sellerDisplayName(String sellerDisplayName) {
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

    public Order shippingAddress(Address shippingAddress) {
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

    public Order buyerInfo(BuyerInfo buyerInfo) {
        this.buyerInfo = buyerInfo;
        return this;
    }

    /**
     * Get buyerInfo
     *
     * @return buyerInfo
     **/
    @Schema(description = "")
    public BuyerInfo getBuyerInfo() {
        return buyerInfo;
    }

    public void setBuyerInfo(BuyerInfo buyerInfo) {
        this.buyerInfo = buyerInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(this.amazonOrderId, order.amazonOrderId) &&
                Objects.equals(this.sellerOrderId, order.sellerOrderId) &&
                Objects.equals(this.purchaseDate, order.purchaseDate) &&
                Objects.equals(this.lastUpdateDate, order.lastUpdateDate) &&
                Objects.equals(this.orderStatus, order.orderStatus) &&
                Objects.equals(this.fulfillmentChannel, order.fulfillmentChannel) &&
                Objects.equals(this.salesChannel, order.salesChannel) &&
                Objects.equals(this.orderChannel, order.orderChannel) &&
                Objects.equals(this.shipServiceLevel, order.shipServiceLevel) &&
                Objects.equals(this.orderTotal, order.orderTotal) &&
                Objects.equals(this.numberOfItemsShipped, order.numberOfItemsShipped) &&
                Objects.equals(this.numberOfItemsUnshipped, order.numberOfItemsUnshipped) &&
                Objects.equals(this.paymentExecutionDetail, order.paymentExecutionDetail) &&
                Objects.equals(this.paymentMethod, order.paymentMethod) &&
                Objects.equals(this.paymentMethodDetails, order.paymentMethodDetails) &&
                Objects.equals(this.marketplaceId, order.marketplaceId) &&
                Objects.equals(this.shipmentServiceLevelCategory, order.shipmentServiceLevelCategory) &&
                Objects.equals(this.easyShipShipmentStatus, order.easyShipShipmentStatus) &&
                Objects.equals(this.cbaDisplayableShippingLabel, order.cbaDisplayableShippingLabel) &&
                Objects.equals(this.orderType, order.orderType) &&
                Objects.equals(this.earliestShipDate, order.earliestShipDate) &&
                Objects.equals(this.latestShipDate, order.latestShipDate) &&
                Objects.equals(this.earliestDeliveryDate, order.earliestDeliveryDate) &&
                Objects.equals(this.latestDeliveryDate, order.latestDeliveryDate) &&
                Objects.equals(this.isBusinessOrder, order.isBusinessOrder) &&
                Objects.equals(this.isPrime, order.isPrime) &&
                Objects.equals(this.isPremiumOrder, order.isPremiumOrder) &&
                Objects.equals(this.isGlobalExpressEnabled, order.isGlobalExpressEnabled) &&
                Objects.equals(this.replacedOrderId, order.replacedOrderId) &&
                Objects.equals(this.isReplacementOrder, order.isReplacementOrder) &&
                Objects.equals(this.promiseResponseDueDate, order.promiseResponseDueDate) &&
                Objects.equals(this.isEstimatedShipDateSet, order.isEstimatedShipDateSet) &&
                Objects.equals(this.isSoldByAB, order.isSoldByAB) &&
                Objects.equals(this.defaultShipFromLocationAddress, order.defaultShipFromLocationAddress) &&
                Objects.equals(this.fulfillmentInstruction, order.fulfillmentInstruction) &&
                Objects.equals(this.isISPU, order.isISPU) &&
                Objects.equals(this.marketplaceTaxInfo, order.marketplaceTaxInfo) &&
                Objects.equals(this.sellerDisplayName, order.sellerDisplayName) &&
                Objects.equals(this.shippingAddress, order.shippingAddress) &&
                Objects.equals(this.buyerInfo, order.buyerInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amazonOrderId, sellerOrderId, purchaseDate, lastUpdateDate, orderStatus, fulfillmentChannel, salesChannel, orderChannel, shipServiceLevel, orderTotal, numberOfItemsShipped, numberOfItemsUnshipped, paymentExecutionDetail, paymentMethod, paymentMethodDetails, marketplaceId, shipmentServiceLevelCategory, easyShipShipmentStatus, cbaDisplayableShippingLabel, orderType, earliestShipDate, latestShipDate, earliestDeliveryDate, latestDeliveryDate, isBusinessOrder, isPrime, isPremiumOrder, isGlobalExpressEnabled, replacedOrderId, isReplacementOrder, promiseResponseDueDate, isEstimatedShipDateSet, isSoldByAB, defaultShipFromLocationAddress, fulfillmentInstruction, isISPU, marketplaceTaxInfo, sellerDisplayName, shippingAddress, buyerInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Order {\n");
        sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
        sb.append("    sellerOrderId: ").append(toIndentedString(sellerOrderId)).append("\n");
        sb.append("    purchaseDate: ").append(toIndentedString(purchaseDate)).append("\n");
        sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
        sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
        sb.append("    fulfillmentChannel: ").append(toIndentedString(fulfillmentChannel)).append("\n");
        sb.append("    salesChannel: ").append(toIndentedString(salesChannel)).append("\n");
        sb.append("    orderChannel: ").append(toIndentedString(orderChannel)).append("\n");
        sb.append("    shipServiceLevel: ").append(toIndentedString(shipServiceLevel)).append("\n");
        sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
        sb.append("    numberOfItemsShipped: ").append(toIndentedString(numberOfItemsShipped)).append("\n");
        sb.append("    numberOfItemsUnshipped: ").append(toIndentedString(numberOfItemsUnshipped)).append("\n");
        sb.append("    paymentExecutionDetail: ").append(toIndentedString(paymentExecutionDetail)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("    paymentMethodDetails: ").append(toIndentedString(paymentMethodDetails)).append("\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    shipmentServiceLevelCategory: ").append(toIndentedString(shipmentServiceLevelCategory)).append("\n");
        sb.append("    easyShipShipmentStatus: ").append(toIndentedString(easyShipShipmentStatus)).append("\n");
        sb.append("    cbaDisplayableShippingLabel: ").append(toIndentedString(cbaDisplayableShippingLabel)).append("\n");
        sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
        sb.append("    earliestShipDate: ").append(toIndentedString(earliestShipDate)).append("\n");
        sb.append("    latestShipDate: ").append(toIndentedString(latestShipDate)).append("\n");
        sb.append("    earliestDeliveryDate: ").append(toIndentedString(earliestDeliveryDate)).append("\n");
        sb.append("    latestDeliveryDate: ").append(toIndentedString(latestDeliveryDate)).append("\n");
        sb.append("    isBusinessOrder: ").append(toIndentedString(isBusinessOrder)).append("\n");
        sb.append("    isPrime: ").append(toIndentedString(isPrime)).append("\n");
        sb.append("    isPremiumOrder: ").append(toIndentedString(isPremiumOrder)).append("\n");
        sb.append("    isGlobalExpressEnabled: ").append(toIndentedString(isGlobalExpressEnabled)).append("\n");
        sb.append("    replacedOrderId: ").append(toIndentedString(replacedOrderId)).append("\n");
        sb.append("    isReplacementOrder: ").append(toIndentedString(isReplacementOrder)).append("\n");
        sb.append("    promiseResponseDueDate: ").append(toIndentedString(promiseResponseDueDate)).append("\n");
        sb.append("    isEstimatedShipDateSet: ").append(toIndentedString(isEstimatedShipDateSet)).append("\n");
        sb.append("    isSoldByAB: ").append(toIndentedString(isSoldByAB)).append("\n");
        sb.append("    defaultShipFromLocationAddress: ").append(toIndentedString(defaultShipFromLocationAddress)).append("\n");
        sb.append("    fulfillmentInstruction: ").append(toIndentedString(fulfillmentInstruction)).append("\n");
        sb.append("    isISPU: ").append(toIndentedString(isISPU)).append("\n");
        sb.append("    marketplaceTaxInfo: ").append(toIndentedString(marketplaceTaxInfo)).append("\n");
        sb.append("    sellerDisplayName: ").append(toIndentedString(sellerDisplayName)).append("\n");
        sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
        sb.append("    buyerInfo: ").append(toIndentedString(buyerInfo)).append("\n");
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

    /**
     * The current order status.
     */
    @JsonAdapter(OrderStatusEnum.Adapter.class)
    public enum OrderStatusEnum {
        PENDING("Pending"),
        UNSHIPPED("Unshipped"),
        PARTIALLYSHIPPED("PartiallyShipped"),
        SHIPPED("Shipped"),
        CANCELED("Canceled"),
        UNFULFILLABLE("Unfulfillable"),
        INVOICEUNCONFIRMED("InvoiceUnconfirmed"),
        PENDINGAVAILABILITY("PendingAvailability");
        private String value;

        OrderStatusEnum(String value) {
            this.value = value;
        }

        public static OrderStatusEnum fromValue(String text) {
            for (OrderStatusEnum b : OrderStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<OrderStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrderStatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OrderStatusEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return OrderStatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Whether the order was fulfilled by Amazon (AFN) or by the seller (MFN).
     */
    @JsonAdapter(FulfillmentChannelEnum.Adapter.class)
    public enum FulfillmentChannelEnum {
        MFN("MFN"),
        AFN("AFN");
        private String value;

        FulfillmentChannelEnum(String value) {
            this.value = value;
        }

        public static FulfillmentChannelEnum fromValue(String text) {
            for (FulfillmentChannelEnum b : FulfillmentChannelEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<FulfillmentChannelEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FulfillmentChannelEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FulfillmentChannelEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return FulfillmentChannelEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * The payment method for the order. This property is limited to Cash On Delivery (COD) and Convenience Store (CVS) payment methods. Unless you need the specific COD payment information provided by the PaymentExecutionDetailItem object, we recommend using the PaymentMethodDetails property to get payment method information.
     */
    @JsonAdapter(PaymentMethodEnum.Adapter.class)
    public enum PaymentMethodEnum {
        COD("COD"),
        CVS("CVS"),
        OTHER("Other");
        private String value;

        PaymentMethodEnum(String value) {
            this.value = value;
        }

        public static PaymentMethodEnum fromValue(String text) {
            for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<PaymentMethodEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PaymentMethodEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PaymentMethodEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return PaymentMethodEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * The type of the order.
     */
    @JsonAdapter(OrderTypeEnum.Adapter.class)
    public enum OrderTypeEnum {
        STANDARDORDER("StandardOrder"),
        LONGLEADTIMEORDER("LongLeadTimeOrder"),
        PREORDER("Preorder"),
        BACKORDER("BackOrder"),
        SOURCINGONDEMANDORDER("SourcingOnDemandOrder");
        private String value;

        OrderTypeEnum(String value) {
            this.value = value;
        }

        public static OrderTypeEnum fromValue(String text) {
            for (OrderTypeEnum b : OrderTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<OrderTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrderTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OrderTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return OrderTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
