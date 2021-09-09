package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * General information about a fulfillment order, including its status.
 */
@Schema(description = "General information about a fulfillment order, including its status.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FulfillmentOrder {
    @SerializedName("sellerFulfillmentOrderId")
    private String sellerFulfillmentOrderId = null;
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("displayableOrderId")
    private String displayableOrderId = null;
    @SerializedName("displayableOrderDate")
    private OffsetDateTime displayableOrderDate = null;
    @SerializedName("displayableOrderComment")
    private String displayableOrderComment = null;
    @SerializedName("shippingSpeedCategory")
    private ShippingSpeedCategory shippingSpeedCategory = null;
    @SerializedName("deliveryWindow")
    private DeliveryWindow deliveryWindow = null;
    @SerializedName("destinationAddress")
    private Address destinationAddress = null;
    @SerializedName("fulfillmentAction")
    private FulfillmentAction fulfillmentAction = null;
    @SerializedName("fulfillmentPolicy")
    private FulfillmentPolicy fulfillmentPolicy = null;
    @SerializedName("codSettings")
    private CODSettings codSettings = null;
    @SerializedName("receivedDate")
    private OffsetDateTime receivedDate = null;
    @SerializedName("fulfillmentOrderStatus")
    private FulfillmentOrderStatus fulfillmentOrderStatus = null;
    @SerializedName("statusUpdatedDate")
    private OffsetDateTime statusUpdatedDate = null;
    @SerializedName("notificationEmails")
    private NotificationEmailList notificationEmails = null;
    @SerializedName("featureConstraints")
    private List<FeatureSettings> featureConstraints = null;

    public FulfillmentOrder sellerFulfillmentOrderId(String sellerFulfillmentOrderId) {
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
        return this;
    }

    /**
     * The fulfillment order identifier submitted with the createFulfillmentOrder operation.
     *
     * @return sellerFulfillmentOrderId
     **/
    @Schema(required = true, description = "The fulfillment order identifier submitted with the createFulfillmentOrder operation.")
    public String getSellerFulfillmentOrderId() {
        return sellerFulfillmentOrderId;
    }

    public void setSellerFulfillmentOrderId(String sellerFulfillmentOrderId) {
        this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
    }

    public FulfillmentOrder marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * The identifier for the marketplace the fulfillment order is placed against.
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "The identifier for the marketplace the fulfillment order is placed against.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public FulfillmentOrder displayableOrderId(String displayableOrderId) {
        this.displayableOrderId = displayableOrderId;
        return this;
    }

    /**
     * A fulfillment order identifier submitted with the createFulfillmentOrder operation. Displays as the order identifier in recipient-facing materials such as the packing slip.
     *
     * @return displayableOrderId
     **/
    @Schema(required = true, description = "A fulfillment order identifier submitted with the createFulfillmentOrder operation. Displays as the order identifier in recipient-facing materials such as the packing slip.")
    public String getDisplayableOrderId() {
        return displayableOrderId;
    }

    public void setDisplayableOrderId(String displayableOrderId) {
        this.displayableOrderId = displayableOrderId;
    }

    public FulfillmentOrder displayableOrderDate(OffsetDateTime displayableOrderDate) {
        this.displayableOrderDate = displayableOrderDate;
        return this;
    }

    /**
     * Get displayableOrderDate
     *
     * @return displayableOrderDate
     **/
    @Schema(required = true, description = "")
    public OffsetDateTime getDisplayableOrderDate() {
        return displayableOrderDate;
    }

    public void setDisplayableOrderDate(OffsetDateTime displayableOrderDate) {
        this.displayableOrderDate = displayableOrderDate;
    }

    public FulfillmentOrder displayableOrderComment(String displayableOrderComment) {
        this.displayableOrderComment = displayableOrderComment;
        return this;
    }

    /**
     * A text block submitted with the createFulfillmentOrder operation. Displays in recipient-facing materials such as the packing slip.
     *
     * @return displayableOrderComment
     **/
    @Schema(required = true, description = "A text block submitted with the createFulfillmentOrder operation. Displays in recipient-facing materials such as the packing slip.")
    public String getDisplayableOrderComment() {
        return displayableOrderComment;
    }

    public void setDisplayableOrderComment(String displayableOrderComment) {
        this.displayableOrderComment = displayableOrderComment;
    }

    public FulfillmentOrder shippingSpeedCategory(ShippingSpeedCategory shippingSpeedCategory) {
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

    public FulfillmentOrder deliveryWindow(DeliveryWindow deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
        return this;
    }

    /**
     * Get deliveryWindow
     *
     * @return deliveryWindow
     **/
    @Schema(description = "")
    public DeliveryWindow getDeliveryWindow() {
        return deliveryWindow;
    }

    public void setDeliveryWindow(DeliveryWindow deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
    }

    public FulfillmentOrder destinationAddress(Address destinationAddress) {
        this.destinationAddress = destinationAddress;
        return this;
    }

    /**
     * Get destinationAddress
     *
     * @return destinationAddress
     **/
    @Schema(required = true, description = "")
    public Address getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(Address destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public FulfillmentOrder fulfillmentAction(FulfillmentAction fulfillmentAction) {
        this.fulfillmentAction = fulfillmentAction;
        return this;
    }

    /**
     * Get fulfillmentAction
     *
     * @return fulfillmentAction
     **/
    @Schema(description = "")
    public FulfillmentAction getFulfillmentAction() {
        return fulfillmentAction;
    }

    public void setFulfillmentAction(FulfillmentAction fulfillmentAction) {
        this.fulfillmentAction = fulfillmentAction;
    }

    public FulfillmentOrder fulfillmentPolicy(FulfillmentPolicy fulfillmentPolicy) {
        this.fulfillmentPolicy = fulfillmentPolicy;
        return this;
    }

    /**
     * Get fulfillmentPolicy
     *
     * @return fulfillmentPolicy
     **/
    @Schema(description = "")
    public FulfillmentPolicy getFulfillmentPolicy() {
        return fulfillmentPolicy;
    }

    public void setFulfillmentPolicy(FulfillmentPolicy fulfillmentPolicy) {
        this.fulfillmentPolicy = fulfillmentPolicy;
    }

    public FulfillmentOrder codSettings(CODSettings codSettings) {
        this.codSettings = codSettings;
        return this;
    }

    /**
     * Get codSettings
     *
     * @return codSettings
     **/
    @Schema(description = "")
    public CODSettings getCodSettings() {
        return codSettings;
    }

    public void setCodSettings(CODSettings codSettings) {
        this.codSettings = codSettings;
    }

    public FulfillmentOrder receivedDate(OffsetDateTime receivedDate) {
        this.receivedDate = receivedDate;
        return this;
    }

    /**
     * Get receivedDate
     *
     * @return receivedDate
     **/
    @Schema(required = true, description = "")
    public OffsetDateTime getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(OffsetDateTime receivedDate) {
        this.receivedDate = receivedDate;
    }

    public FulfillmentOrder fulfillmentOrderStatus(FulfillmentOrderStatus fulfillmentOrderStatus) {
        this.fulfillmentOrderStatus = fulfillmentOrderStatus;
        return this;
    }

    /**
     * Get fulfillmentOrderStatus
     *
     * @return fulfillmentOrderStatus
     **/
    @Schema(required = true, description = "")
    public FulfillmentOrderStatus getFulfillmentOrderStatus() {
        return fulfillmentOrderStatus;
    }

    public void setFulfillmentOrderStatus(FulfillmentOrderStatus fulfillmentOrderStatus) {
        this.fulfillmentOrderStatus = fulfillmentOrderStatus;
    }

    public FulfillmentOrder statusUpdatedDate(OffsetDateTime statusUpdatedDate) {
        this.statusUpdatedDate = statusUpdatedDate;
        return this;
    }

    /**
     * Get statusUpdatedDate
     *
     * @return statusUpdatedDate
     **/
    @Schema(required = true, description = "")
    public OffsetDateTime getStatusUpdatedDate() {
        return statusUpdatedDate;
    }

    public void setStatusUpdatedDate(OffsetDateTime statusUpdatedDate) {
        this.statusUpdatedDate = statusUpdatedDate;
    }

    public FulfillmentOrder notificationEmails(NotificationEmailList notificationEmails) {
        this.notificationEmails = notificationEmails;
        return this;
    }

    /**
     * Get notificationEmails
     *
     * @return notificationEmails
     **/
    @Schema(description = "")
    public NotificationEmailList getNotificationEmails() {
        return notificationEmails;
    }

    public void setNotificationEmails(NotificationEmailList notificationEmails) {
        this.notificationEmails = notificationEmails;
    }

    public FulfillmentOrder featureConstraints(List<FeatureSettings> featureConstraints) {
        this.featureConstraints = featureConstraints;
        return this;
    }

    public FulfillmentOrder addFeatureConstraintsItem(FeatureSettings featureConstraintsItem) {
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
        FulfillmentOrder fulfillmentOrder = (FulfillmentOrder) o;
        return Objects.equals(this.sellerFulfillmentOrderId, fulfillmentOrder.sellerFulfillmentOrderId) &&
                Objects.equals(this.marketplaceId, fulfillmentOrder.marketplaceId) &&
                Objects.equals(this.displayableOrderId, fulfillmentOrder.displayableOrderId) &&
                Objects.equals(this.displayableOrderDate, fulfillmentOrder.displayableOrderDate) &&
                Objects.equals(this.displayableOrderComment, fulfillmentOrder.displayableOrderComment) &&
                Objects.equals(this.shippingSpeedCategory, fulfillmentOrder.shippingSpeedCategory) &&
                Objects.equals(this.deliveryWindow, fulfillmentOrder.deliveryWindow) &&
                Objects.equals(this.destinationAddress, fulfillmentOrder.destinationAddress) &&
                Objects.equals(this.fulfillmentAction, fulfillmentOrder.fulfillmentAction) &&
                Objects.equals(this.fulfillmentPolicy, fulfillmentOrder.fulfillmentPolicy) &&
                Objects.equals(this.codSettings, fulfillmentOrder.codSettings) &&
                Objects.equals(this.receivedDate, fulfillmentOrder.receivedDate) &&
                Objects.equals(this.fulfillmentOrderStatus, fulfillmentOrder.fulfillmentOrderStatus) &&
                Objects.equals(this.statusUpdatedDate, fulfillmentOrder.statusUpdatedDate) &&
                Objects.equals(this.notificationEmails, fulfillmentOrder.notificationEmails) &&
                Objects.equals(this.featureConstraints, fulfillmentOrder.featureConstraints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerFulfillmentOrderId, marketplaceId, displayableOrderId, displayableOrderDate, displayableOrderComment, shippingSpeedCategory, deliveryWindow, destinationAddress, fulfillmentAction, fulfillmentPolicy, codSettings, receivedDate, fulfillmentOrderStatus, statusUpdatedDate, notificationEmails, featureConstraints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FulfillmentOrder {\n");
        sb.append("    sellerFulfillmentOrderId: ").append(toIndentedString(sellerFulfillmentOrderId)).append("\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    displayableOrderId: ").append(toIndentedString(displayableOrderId)).append("\n");
        sb.append("    displayableOrderDate: ").append(toIndentedString(displayableOrderDate)).append("\n");
        sb.append("    displayableOrderComment: ").append(toIndentedString(displayableOrderComment)).append("\n");
        sb.append("    shippingSpeedCategory: ").append(toIndentedString(shippingSpeedCategory)).append("\n");
        sb.append("    deliveryWindow: ").append(toIndentedString(deliveryWindow)).append("\n");
        sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
        sb.append("    fulfillmentAction: ").append(toIndentedString(fulfillmentAction)).append("\n");
        sb.append("    fulfillmentPolicy: ").append(toIndentedString(fulfillmentPolicy)).append("\n");
        sb.append("    codSettings: ").append(toIndentedString(codSettings)).append("\n");
        sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
        sb.append("    fulfillmentOrderStatus: ").append(toIndentedString(fulfillmentOrderStatus)).append("\n");
        sb.append("    statusUpdatedDate: ").append(toIndentedString(statusUpdatedDate)).append("\n");
        sb.append("    notificationEmails: ").append(toIndentedString(notificationEmails)).append("\n");
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
