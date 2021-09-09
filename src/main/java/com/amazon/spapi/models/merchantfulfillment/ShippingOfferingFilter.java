package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Filter for use when requesting eligible shipping services.
 */
@Schema(description = "Filter for use when requesting eligible shipping services.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ShippingOfferingFilter {
    @SerializedName("IncludePackingSlipWithLabel")
    private Boolean includePackingSlipWithLabel = null;
    @SerializedName("IncludeComplexShippingOptions")
    private Boolean includeComplexShippingOptions = null;
    @SerializedName("CarrierWillPickUp")
    private CarrierWillPickUpOption carrierWillPickUp = null;
    @SerializedName("DeliveryExperience")
    private DeliveryExperienceOption deliveryExperience = null;

    public ShippingOfferingFilter includePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
        this.includePackingSlipWithLabel = includePackingSlipWithLabel;
        return this;
    }

    /**
     * When true, include a packing slip with the label.
     *
     * @return includePackingSlipWithLabel
     **/
    @Schema(description = "When true, include a packing slip with the label.")
    public Boolean isIncludePackingSlipWithLabel() {
        return includePackingSlipWithLabel;
    }

    public void setIncludePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
        this.includePackingSlipWithLabel = includePackingSlipWithLabel;
    }

    public ShippingOfferingFilter includeComplexShippingOptions(Boolean includeComplexShippingOptions) {
        this.includeComplexShippingOptions = includeComplexShippingOptions;
        return this;
    }

    /**
     * When true, include complex shipping options.
     *
     * @return includeComplexShippingOptions
     **/
    @Schema(description = "When true, include complex shipping options.")
    public Boolean isIncludeComplexShippingOptions() {
        return includeComplexShippingOptions;
    }

    public void setIncludeComplexShippingOptions(Boolean includeComplexShippingOptions) {
        this.includeComplexShippingOptions = includeComplexShippingOptions;
    }

    public ShippingOfferingFilter carrierWillPickUp(CarrierWillPickUpOption carrierWillPickUp) {
        this.carrierWillPickUp = carrierWillPickUp;
        return this;
    }

    /**
     * Get carrierWillPickUp
     *
     * @return carrierWillPickUp
     **/
    @Schema(description = "")
    public CarrierWillPickUpOption getCarrierWillPickUp() {
        return carrierWillPickUp;
    }

    public void setCarrierWillPickUp(CarrierWillPickUpOption carrierWillPickUp) {
        this.carrierWillPickUp = carrierWillPickUp;
    }

    public ShippingOfferingFilter deliveryExperience(DeliveryExperienceOption deliveryExperience) {
        this.deliveryExperience = deliveryExperience;
        return this;
    }

    /**
     * Get deliveryExperience
     *
     * @return deliveryExperience
     **/
    @Schema(description = "")
    public DeliveryExperienceOption getDeliveryExperience() {
        return deliveryExperience;
    }

    public void setDeliveryExperience(DeliveryExperienceOption deliveryExperience) {
        this.deliveryExperience = deliveryExperience;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShippingOfferingFilter shippingOfferingFilter = (ShippingOfferingFilter) o;
        return Objects.equals(this.includePackingSlipWithLabel, shippingOfferingFilter.includePackingSlipWithLabel) &&
                Objects.equals(this.includeComplexShippingOptions, shippingOfferingFilter.includeComplexShippingOptions) &&
                Objects.equals(this.carrierWillPickUp, shippingOfferingFilter.carrierWillPickUp) &&
                Objects.equals(this.deliveryExperience, shippingOfferingFilter.deliveryExperience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includePackingSlipWithLabel, includeComplexShippingOptions, carrierWillPickUp, deliveryExperience);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShippingOfferingFilter {\n");
        sb.append("    includePackingSlipWithLabel: ").append(toIndentedString(includePackingSlipWithLabel)).append("\n");
        sb.append("    includeComplexShippingOptions: ").append(toIndentedString(includeComplexShippingOptions)).append("\n");
        sb.append("    carrierWillPickUp: ").append(toIndentedString(carrierWillPickUp)).append("\n");
        sb.append("    deliveryExperience: ").append(toIndentedString(deliveryExperience)).append("\n");
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
