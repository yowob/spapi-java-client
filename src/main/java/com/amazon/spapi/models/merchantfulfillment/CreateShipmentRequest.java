package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Request schema.
 */
@Schema(description = "Request schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateShipmentRequest {
    @SerializedName("ShipmentRequestDetails")
    private ShipmentRequestDetails shipmentRequestDetails = null;
    @SerializedName("ShippingServiceId")
    private String shippingServiceId = null;
    @SerializedName("ShippingServiceOfferId")
    private String shippingServiceOfferId = null;
    @SerializedName("HazmatType")
    private HazmatType hazmatType = null;
    @SerializedName("LabelFormatOption")
    private LabelFormatOptionRequest labelFormatOption = null;
    @SerializedName("ShipmentLevelSellerInputsList")
    private AdditionalSellerInputsList shipmentLevelSellerInputsList = null;

    public CreateShipmentRequest shipmentRequestDetails(ShipmentRequestDetails shipmentRequestDetails) {
        this.shipmentRequestDetails = shipmentRequestDetails;
        return this;
    }

    /**
     * Get shipmentRequestDetails
     *
     * @return shipmentRequestDetails
     **/
    @Schema(required = true, description = "")
    public ShipmentRequestDetails getShipmentRequestDetails() {
        return shipmentRequestDetails;
    }

    public void setShipmentRequestDetails(ShipmentRequestDetails shipmentRequestDetails) {
        this.shipmentRequestDetails = shipmentRequestDetails;
    }

    public CreateShipmentRequest shippingServiceId(String shippingServiceId) {
        this.shippingServiceId = shippingServiceId;
        return this;
    }

    /**
     * Get shippingServiceId
     *
     * @return shippingServiceId
     **/
    @Schema(required = true, description = "")
    public String getShippingServiceId() {
        return shippingServiceId;
    }

    public void setShippingServiceId(String shippingServiceId) {
        this.shippingServiceId = shippingServiceId;
    }

    public CreateShipmentRequest shippingServiceOfferId(String shippingServiceOfferId) {
        this.shippingServiceOfferId = shippingServiceOfferId;
        return this;
    }

    /**
     * Identifies a shipping service order made by a carrier.
     *
     * @return shippingServiceOfferId
     **/
    @Schema(description = "Identifies a shipping service order made by a carrier.")
    public String getShippingServiceOfferId() {
        return shippingServiceOfferId;
    }

    public void setShippingServiceOfferId(String shippingServiceOfferId) {
        this.shippingServiceOfferId = shippingServiceOfferId;
    }

    public CreateShipmentRequest hazmatType(HazmatType hazmatType) {
        this.hazmatType = hazmatType;
        return this;
    }

    /**
     * Get hazmatType
     *
     * @return hazmatType
     **/
    @Schema(description = "")
    public HazmatType getHazmatType() {
        return hazmatType;
    }

    public void setHazmatType(HazmatType hazmatType) {
        this.hazmatType = hazmatType;
    }

    public CreateShipmentRequest labelFormatOption(LabelFormatOptionRequest labelFormatOption) {
        this.labelFormatOption = labelFormatOption;
        return this;
    }

    /**
     * Get labelFormatOption
     *
     * @return labelFormatOption
     **/
    @Schema(description = "")
    public LabelFormatOptionRequest getLabelFormatOption() {
        return labelFormatOption;
    }

    public void setLabelFormatOption(LabelFormatOptionRequest labelFormatOption) {
        this.labelFormatOption = labelFormatOption;
    }

    public CreateShipmentRequest shipmentLevelSellerInputsList(AdditionalSellerInputsList shipmentLevelSellerInputsList) {
        this.shipmentLevelSellerInputsList = shipmentLevelSellerInputsList;
        return this;
    }

    /**
     * Get shipmentLevelSellerInputsList
     *
     * @return shipmentLevelSellerInputsList
     **/
    @Schema(description = "")
    public AdditionalSellerInputsList getShipmentLevelSellerInputsList() {
        return shipmentLevelSellerInputsList;
    }

    public void setShipmentLevelSellerInputsList(AdditionalSellerInputsList shipmentLevelSellerInputsList) {
        this.shipmentLevelSellerInputsList = shipmentLevelSellerInputsList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateShipmentRequest createShipmentRequest = (CreateShipmentRequest) o;
        return Objects.equals(this.shipmentRequestDetails, createShipmentRequest.shipmentRequestDetails) &&
                Objects.equals(this.shippingServiceId, createShipmentRequest.shippingServiceId) &&
                Objects.equals(this.shippingServiceOfferId, createShipmentRequest.shippingServiceOfferId) &&
                Objects.equals(this.hazmatType, createShipmentRequest.hazmatType) &&
                Objects.equals(this.labelFormatOption, createShipmentRequest.labelFormatOption) &&
                Objects.equals(this.shipmentLevelSellerInputsList, createShipmentRequest.shipmentLevelSellerInputsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentRequestDetails, shippingServiceId, shippingServiceOfferId, hazmatType, labelFormatOption, shipmentLevelSellerInputsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateShipmentRequest {\n");
        sb.append("    shipmentRequestDetails: ").append(toIndentedString(shipmentRequestDetails)).append("\n");
        sb.append("    shippingServiceId: ").append(toIndentedString(shippingServiceId)).append("\n");
        sb.append("    shippingServiceOfferId: ").append(toIndentedString(shippingServiceOfferId)).append("\n");
        sb.append("    hazmatType: ").append(toIndentedString(hazmatType)).append("\n");
        sb.append("    labelFormatOption: ").append(toIndentedString(labelFormatOption)).append("\n");
        sb.append("    shipmentLevelSellerInputsList: ").append(toIndentedString(shipmentLevelSellerInputsList)).append("\n");
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
