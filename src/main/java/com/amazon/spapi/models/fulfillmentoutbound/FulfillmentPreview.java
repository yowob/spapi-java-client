package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Information about a fulfillment order preview, including delivery and fee information based on shipping method.
 */
@Schema(description = "Information about a fulfillment order preview, including delivery and fee information based on shipping method.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FulfillmentPreview {
    @SerializedName("shippingSpeedCategory")
    private ShippingSpeedCategory shippingSpeedCategory = null;
    @SerializedName("scheduledDeliveryInfo")
    private ScheduledDeliveryInfo scheduledDeliveryInfo = null;
    @SerializedName("isFulfillable")
    private Boolean isFulfillable = null;
    @SerializedName("isCODCapable")
    private Boolean isCODCapable = null;
    @SerializedName("estimatedShippingWeight")
    private Weight estimatedShippingWeight = null;
    @SerializedName("estimatedFees")
    private FeeList estimatedFees = null;
    @SerializedName("fulfillmentPreviewShipments")
    private FulfillmentPreviewShipmentList fulfillmentPreviewShipments = null;
    @SerializedName("unfulfillablePreviewItems")
    private UnfulfillablePreviewItemList unfulfillablePreviewItems = null;
    @SerializedName("orderUnfulfillableReasons")
    private StringList orderUnfulfillableReasons = null;
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("featureConstraints")
    private List<FeatureSettings> featureConstraints = null;

    public FulfillmentPreview shippingSpeedCategory(ShippingSpeedCategory shippingSpeedCategory) {
        this.shippingSpeedCategory = shippingSpeedCategory;
        return this;
    }

    /**
     * Get shippingSpeedCategory
     *
     * @return shippingSpeedCategory
     **/
    @Schema(required = true, description = "")
    public ShippingSpeedCategory getShippingSpeedCategory() {
        return shippingSpeedCategory;
    }

    public void setShippingSpeedCategory(ShippingSpeedCategory shippingSpeedCategory) {
        this.shippingSpeedCategory = shippingSpeedCategory;
    }

    public FulfillmentPreview scheduledDeliveryInfo(ScheduledDeliveryInfo scheduledDeliveryInfo) {
        this.scheduledDeliveryInfo = scheduledDeliveryInfo;
        return this;
    }

    /**
     * Get scheduledDeliveryInfo
     *
     * @return scheduledDeliveryInfo
     **/
    @Schema(description = "")
    public ScheduledDeliveryInfo getScheduledDeliveryInfo() {
        return scheduledDeliveryInfo;
    }

    public void setScheduledDeliveryInfo(ScheduledDeliveryInfo scheduledDeliveryInfo) {
        this.scheduledDeliveryInfo = scheduledDeliveryInfo;
    }

    public FulfillmentPreview isFulfillable(Boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
        return this;
    }

    /**
     * When true, this fulfillment order preview is fulfillable.
     *
     * @return isFulfillable
     **/
    @Schema(required = true, description = "When true, this fulfillment order preview is fulfillable.")
    public Boolean isIsFulfillable() {
        return isFulfillable;
    }

    public void setIsFulfillable(Boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
    }

    public FulfillmentPreview isCODCapable(Boolean isCODCapable) {
        this.isCODCapable = isCODCapable;
        return this;
    }

    /**
     * When true, this fulfillment order preview is for COD (Cash On Delivery).
     *
     * @return isCODCapable
     **/
    @Schema(required = true, description = "When true, this fulfillment order preview is for COD (Cash On Delivery).")
    public Boolean isIsCODCapable() {
        return isCODCapable;
    }

    public void setIsCODCapable(Boolean isCODCapable) {
        this.isCODCapable = isCODCapable;
    }

    public FulfillmentPreview estimatedShippingWeight(Weight estimatedShippingWeight) {
        this.estimatedShippingWeight = estimatedShippingWeight;
        return this;
    }

    /**
     * Get estimatedShippingWeight
     *
     * @return estimatedShippingWeight
     **/
    @Schema(description = "")
    public Weight getEstimatedShippingWeight() {
        return estimatedShippingWeight;
    }

    public void setEstimatedShippingWeight(Weight estimatedShippingWeight) {
        this.estimatedShippingWeight = estimatedShippingWeight;
    }

    public FulfillmentPreview estimatedFees(FeeList estimatedFees) {
        this.estimatedFees = estimatedFees;
        return this;
    }

    /**
     * Get estimatedFees
     *
     * @return estimatedFees
     **/
    @Schema(description = "")
    public FeeList getEstimatedFees() {
        return estimatedFees;
    }

    public void setEstimatedFees(FeeList estimatedFees) {
        this.estimatedFees = estimatedFees;
    }

    public FulfillmentPreview fulfillmentPreviewShipments(FulfillmentPreviewShipmentList fulfillmentPreviewShipments) {
        this.fulfillmentPreviewShipments = fulfillmentPreviewShipments;
        return this;
    }

    /**
     * Get fulfillmentPreviewShipments
     *
     * @return fulfillmentPreviewShipments
     **/
    @Schema(description = "")
    public FulfillmentPreviewShipmentList getFulfillmentPreviewShipments() {
        return fulfillmentPreviewShipments;
    }

    public void setFulfillmentPreviewShipments(FulfillmentPreviewShipmentList fulfillmentPreviewShipments) {
        this.fulfillmentPreviewShipments = fulfillmentPreviewShipments;
    }

    public FulfillmentPreview unfulfillablePreviewItems(UnfulfillablePreviewItemList unfulfillablePreviewItems) {
        this.unfulfillablePreviewItems = unfulfillablePreviewItems;
        return this;
    }

    /**
     * Get unfulfillablePreviewItems
     *
     * @return unfulfillablePreviewItems
     **/
    @Schema(description = "")
    public UnfulfillablePreviewItemList getUnfulfillablePreviewItems() {
        return unfulfillablePreviewItems;
    }

    public void setUnfulfillablePreviewItems(UnfulfillablePreviewItemList unfulfillablePreviewItems) {
        this.unfulfillablePreviewItems = unfulfillablePreviewItems;
    }

    public FulfillmentPreview orderUnfulfillableReasons(StringList orderUnfulfillableReasons) {
        this.orderUnfulfillableReasons = orderUnfulfillableReasons;
        return this;
    }

    /**
     * Get orderUnfulfillableReasons
     *
     * @return orderUnfulfillableReasons
     **/
    @Schema(description = "")
    public StringList getOrderUnfulfillableReasons() {
        return orderUnfulfillableReasons;
    }

    public void setOrderUnfulfillableReasons(StringList orderUnfulfillableReasons) {
        this.orderUnfulfillableReasons = orderUnfulfillableReasons;
    }

    public FulfillmentPreview marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * The marketplace the fulfillment order is placed against.
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "The marketplace the fulfillment order is placed against.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public FulfillmentPreview featureConstraints(List<FeatureSettings> featureConstraints) {
        this.featureConstraints = featureConstraints;
        return this;
    }

    public FulfillmentPreview addFeatureConstraintsItem(FeatureSettings featureConstraintsItem) {
        if (this.featureConstraints == null) {
            this.featureConstraints = new ArrayList<FeatureSettings>();
        }
        this.featureConstraints.add(featureConstraintsItem);
        return this;
    }

    /**
     * A list of features and their fulfillment policies to apply to the order.
     *
     * @return featureConstraints
     **/
    @Schema(description = "A list of features and their fulfillment policies to apply to the order.")
    public List<FeatureSettings> getFeatureConstraints() {
        return featureConstraints;
    }

    public void setFeatureConstraints(List<FeatureSettings> featureConstraints) {
        this.featureConstraints = featureConstraints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FulfillmentPreview fulfillmentPreview = (FulfillmentPreview) o;
        return Objects.equals(this.shippingSpeedCategory, fulfillmentPreview.shippingSpeedCategory) &&
                Objects.equals(this.scheduledDeliveryInfo, fulfillmentPreview.scheduledDeliveryInfo) &&
                Objects.equals(this.isFulfillable, fulfillmentPreview.isFulfillable) &&
                Objects.equals(this.isCODCapable, fulfillmentPreview.isCODCapable) &&
                Objects.equals(this.estimatedShippingWeight, fulfillmentPreview.estimatedShippingWeight) &&
                Objects.equals(this.estimatedFees, fulfillmentPreview.estimatedFees) &&
                Objects.equals(this.fulfillmentPreviewShipments, fulfillmentPreview.fulfillmentPreviewShipments) &&
                Objects.equals(this.unfulfillablePreviewItems, fulfillmentPreview.unfulfillablePreviewItems) &&
                Objects.equals(this.orderUnfulfillableReasons, fulfillmentPreview.orderUnfulfillableReasons) &&
                Objects.equals(this.marketplaceId, fulfillmentPreview.marketplaceId) &&
                Objects.equals(this.featureConstraints, fulfillmentPreview.featureConstraints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shippingSpeedCategory, scheduledDeliveryInfo, isFulfillable, isCODCapable, estimatedShippingWeight, estimatedFees, fulfillmentPreviewShipments, unfulfillablePreviewItems, orderUnfulfillableReasons, marketplaceId, featureConstraints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FulfillmentPreview {\n");
        sb.append("    shippingSpeedCategory: ").append(toIndentedString(shippingSpeedCategory)).append("\n");
        sb.append("    scheduledDeliveryInfo: ").append(toIndentedString(scheduledDeliveryInfo)).append("\n");
        sb.append("    isFulfillable: ").append(toIndentedString(isFulfillable)).append("\n");
        sb.append("    isCODCapable: ").append(toIndentedString(isCODCapable)).append("\n");
        sb.append("    estimatedShippingWeight: ").append(toIndentedString(estimatedShippingWeight)).append("\n");
        sb.append("    estimatedFees: ").append(toIndentedString(estimatedFees)).append("\n");
        sb.append("    fulfillmentPreviewShipments: ").append(toIndentedString(fulfillmentPreviewShipments)).append("\n");
        sb.append("    unfulfillablePreviewItems: ").append(toIndentedString(unfulfillablePreviewItems)).append("\n");
        sb.append("    orderUnfulfillableReasons: ").append(toIndentedString(orderUnfulfillableReasons)).append("\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    featureConstraints: ").append(toIndentedString(featureConstraints)).append("\n");
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
