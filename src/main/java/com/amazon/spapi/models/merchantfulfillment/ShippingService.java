package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * A shipping service offer made by a carrier.
 */
@Schema(description = "A shipping service offer made by a carrier.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ShippingService {
    @SerializedName("ShippingServiceName")
    private String shippingServiceName = null;
    @SerializedName("CarrierName")
    private String carrierName = null;
    @SerializedName("ShippingServiceId")
    private String shippingServiceId = null;
    @SerializedName("ShippingServiceOfferId")
    private String shippingServiceOfferId = null;
    @SerializedName("ShipDate")
    private OffsetDateTime shipDate = null;
    @SerializedName("EarliestEstimatedDeliveryDate")
    private OffsetDateTime earliestEstimatedDeliveryDate = null;
    @SerializedName("LatestEstimatedDeliveryDate")
    private OffsetDateTime latestEstimatedDeliveryDate = null;
    @SerializedName("Rate")
    private CurrencyAmount rate = null;
    @SerializedName("ShippingServiceOptions")
    private ShippingServiceOptions shippingServiceOptions = null;
    @SerializedName("AvailableShippingServiceOptions")
    private AvailableShippingServiceOptions availableShippingServiceOptions = null;
    @SerializedName("AvailableLabelFormats")
    private LabelFormatList availableLabelFormats = null;
    @SerializedName("AvailableFormatOptionsForLabel")
    private AvailableFormatOptionsForLabelList availableFormatOptionsForLabel = null;
    @SerializedName("RequiresAdditionalSellerInputs")
    private Boolean requiresAdditionalSellerInputs = null;

    public ShippingService shippingServiceName(String shippingServiceName) {
        this.shippingServiceName = shippingServiceName;
        return this;
    }

    /**
     * A plain text representation of a carrier&#x27;s shipping service. For example, \&quot;UPS Ground\&quot; or \&quot;FedEx Standard Overnight\&quot;.
     *
     * @return shippingServiceName
     **/
    @Schema(required = true, description = "A plain text representation of a carrier's shipping service. For example, \"UPS Ground\" or \"FedEx Standard Overnight\". ")
    public String getShippingServiceName() {
        return shippingServiceName;
    }

    public void setShippingServiceName(String shippingServiceName) {
        this.shippingServiceName = shippingServiceName;
    }

    public ShippingService carrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * The name of the carrier.
     *
     * @return carrierName
     **/
    @Schema(required = true, description = "The name of the carrier.")
    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public ShippingService shippingServiceId(String shippingServiceId) {
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

    public ShippingService shippingServiceOfferId(String shippingServiceOfferId) {
        this.shippingServiceOfferId = shippingServiceOfferId;
        return this;
    }

    /**
     * An Amazon-defined shipping service offer identifier.
     *
     * @return shippingServiceOfferId
     **/
    @Schema(required = true, description = "An Amazon-defined shipping service offer identifier.")
    public String getShippingServiceOfferId() {
        return shippingServiceOfferId;
    }

    public void setShippingServiceOfferId(String shippingServiceOfferId) {
        this.shippingServiceOfferId = shippingServiceOfferId;
    }

    public ShippingService shipDate(OffsetDateTime shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    /**
     * Get shipDate
     *
     * @return shipDate
     **/
    @Schema(required = true, description = "")
    public OffsetDateTime getShipDate() {
        return shipDate;
    }

    public void setShipDate(OffsetDateTime shipDate) {
        this.shipDate = shipDate;
    }

    public ShippingService earliestEstimatedDeliveryDate(OffsetDateTime earliestEstimatedDeliveryDate) {
        this.earliestEstimatedDeliveryDate = earliestEstimatedDeliveryDate;
        return this;
    }

    /**
     * Get earliestEstimatedDeliveryDate
     *
     * @return earliestEstimatedDeliveryDate
     **/
    @Schema(description = "")
    public OffsetDateTime getEarliestEstimatedDeliveryDate() {
        return earliestEstimatedDeliveryDate;
    }

    public void setEarliestEstimatedDeliveryDate(OffsetDateTime earliestEstimatedDeliveryDate) {
        this.earliestEstimatedDeliveryDate = earliestEstimatedDeliveryDate;
    }

    public ShippingService latestEstimatedDeliveryDate(OffsetDateTime latestEstimatedDeliveryDate) {
        this.latestEstimatedDeliveryDate = latestEstimatedDeliveryDate;
        return this;
    }

    /**
     * Get latestEstimatedDeliveryDate
     *
     * @return latestEstimatedDeliveryDate
     **/
    @Schema(description = "")
    public OffsetDateTime getLatestEstimatedDeliveryDate() {
        return latestEstimatedDeliveryDate;
    }

    public void setLatestEstimatedDeliveryDate(OffsetDateTime latestEstimatedDeliveryDate) {
        this.latestEstimatedDeliveryDate = latestEstimatedDeliveryDate;
    }

    public ShippingService rate(CurrencyAmount rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Get rate
     *
     * @return rate
     **/
    @Schema(required = true, description = "")
    public CurrencyAmount getRate() {
        return rate;
    }

    public void setRate(CurrencyAmount rate) {
        this.rate = rate;
    }

    public ShippingService shippingServiceOptions(ShippingServiceOptions shippingServiceOptions) {
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

    public ShippingService availableShippingServiceOptions(AvailableShippingServiceOptions availableShippingServiceOptions) {
        this.availableShippingServiceOptions = availableShippingServiceOptions;
        return this;
    }

    /**
     * Get availableShippingServiceOptions
     *
     * @return availableShippingServiceOptions
     **/
    @Schema(description = "")
    public AvailableShippingServiceOptions getAvailableShippingServiceOptions() {
        return availableShippingServiceOptions;
    }

    public void setAvailableShippingServiceOptions(AvailableShippingServiceOptions availableShippingServiceOptions) {
        this.availableShippingServiceOptions = availableShippingServiceOptions;
    }

    public ShippingService availableLabelFormats(LabelFormatList availableLabelFormats) {
        this.availableLabelFormats = availableLabelFormats;
        return this;
    }

    /**
     * Get availableLabelFormats
     *
     * @return availableLabelFormats
     **/
    @Schema(description = "")
    public LabelFormatList getAvailableLabelFormats() {
        return availableLabelFormats;
    }

    public void setAvailableLabelFormats(LabelFormatList availableLabelFormats) {
        this.availableLabelFormats = availableLabelFormats;
    }

    public ShippingService availableFormatOptionsForLabel(AvailableFormatOptionsForLabelList availableFormatOptionsForLabel) {
        this.availableFormatOptionsForLabel = availableFormatOptionsForLabel;
        return this;
    }

    /**
     * Get availableFormatOptionsForLabel
     *
     * @return availableFormatOptionsForLabel
     **/
    @Schema(description = "")
    public AvailableFormatOptionsForLabelList getAvailableFormatOptionsForLabel() {
        return availableFormatOptionsForLabel;
    }

    public void setAvailableFormatOptionsForLabel(AvailableFormatOptionsForLabelList availableFormatOptionsForLabel) {
        this.availableFormatOptionsForLabel = availableFormatOptionsForLabel;
    }

    public ShippingService requiresAdditionalSellerInputs(Boolean requiresAdditionalSellerInputs) {
        this.requiresAdditionalSellerInputs = requiresAdditionalSellerInputs;
        return this;
    }

    /**
     * When true, additional seller inputs are required.
     *
     * @return requiresAdditionalSellerInputs
     **/
    @Schema(required = true, description = "When true, additional seller inputs are required.")
    public Boolean isRequiresAdditionalSellerInputs() {
        return requiresAdditionalSellerInputs;
    }

    public void setRequiresAdditionalSellerInputs(Boolean requiresAdditionalSellerInputs) {
        this.requiresAdditionalSellerInputs = requiresAdditionalSellerInputs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShippingService shippingService = (ShippingService) o;
        return Objects.equals(this.shippingServiceName, shippingService.shippingServiceName) &&
                Objects.equals(this.carrierName, shippingService.carrierName) &&
                Objects.equals(this.shippingServiceId, shippingService.shippingServiceId) &&
                Objects.equals(this.shippingServiceOfferId, shippingService.shippingServiceOfferId) &&
                Objects.equals(this.shipDate, shippingService.shipDate) &&
                Objects.equals(this.earliestEstimatedDeliveryDate, shippingService.earliestEstimatedDeliveryDate) &&
                Objects.equals(this.latestEstimatedDeliveryDate, shippingService.latestEstimatedDeliveryDate) &&
                Objects.equals(this.rate, shippingService.rate) &&
                Objects.equals(this.shippingServiceOptions, shippingService.shippingServiceOptions) &&
                Objects.equals(this.availableShippingServiceOptions, shippingService.availableShippingServiceOptions) &&
                Objects.equals(this.availableLabelFormats, shippingService.availableLabelFormats) &&
                Objects.equals(this.availableFormatOptionsForLabel, shippingService.availableFormatOptionsForLabel) &&
                Objects.equals(this.requiresAdditionalSellerInputs, shippingService.requiresAdditionalSellerInputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shippingServiceName, carrierName, shippingServiceId, shippingServiceOfferId, shipDate, earliestEstimatedDeliveryDate, latestEstimatedDeliveryDate, rate, shippingServiceOptions, availableShippingServiceOptions, availableLabelFormats, availableFormatOptionsForLabel, requiresAdditionalSellerInputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShippingService {\n");
        sb.append("    shippingServiceName: ").append(toIndentedString(shippingServiceName)).append("\n");
        sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
        sb.append("    shippingServiceId: ").append(toIndentedString(shippingServiceId)).append("\n");
        sb.append("    shippingServiceOfferId: ").append(toIndentedString(shippingServiceOfferId)).append("\n");
        sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
        sb.append("    earliestEstimatedDeliveryDate: ").append(toIndentedString(earliestEstimatedDeliveryDate)).append("\n");
        sb.append("    latestEstimatedDeliveryDate: ").append(toIndentedString(latestEstimatedDeliveryDate)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    shippingServiceOptions: ").append(toIndentedString(shippingServiceOptions)).append("\n");
        sb.append("    availableShippingServiceOptions: ").append(toIndentedString(availableShippingServiceOptions)).append("\n");
        sb.append("    availableLabelFormats: ").append(toIndentedString(availableLabelFormats)).append("\n");
        sb.append("    availableFormatOptionsForLabel: ").append(toIndentedString(availableFormatOptionsForLabel)).append("\n");
        sb.append("    requiresAdditionalSellerInputs: ").append(toIndentedString(requiresAdditionalSellerInputs)).append("\n");
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
