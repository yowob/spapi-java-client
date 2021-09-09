package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Extra services provided by a carrier.
 */
@Schema(description = "Extra services provided by a carrier.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ShippingServiceOptions {
    @SerializedName("DeliveryExperience")
    private DeliveryExperienceType deliveryExperience = null;
    @SerializedName("DeclaredValue")
    private CurrencyAmount declaredValue = null;
    @SerializedName("CarrierWillPickUp")
    private Boolean carrierWillPickUp = null;
    @SerializedName("CarrierWillPickUpOption")
    private CarrierWillPickUpOption carrierWillPickUpOption = null;
    @SerializedName("LabelFormat")
    private LabelFormat labelFormat = null;

    public ShippingServiceOptions deliveryExperience(DeliveryExperienceType deliveryExperience) {
        this.deliveryExperience = deliveryExperience;
        return this;
    }

    /**
     * Get deliveryExperience
     *
     * @return deliveryExperience
     **/
    @Schema(required = true, description = "")
    public DeliveryExperienceType getDeliveryExperience() {
        return deliveryExperience;
    }

    public void setDeliveryExperience(DeliveryExperienceType deliveryExperience) {
        this.deliveryExperience = deliveryExperience;
    }

    public ShippingServiceOptions declaredValue(CurrencyAmount declaredValue) {
        this.declaredValue = declaredValue;
        return this;
    }

    /**
     * Get declaredValue
     *
     * @return declaredValue
     **/
    @Schema(description = "")
    public CurrencyAmount getDeclaredValue() {
        return declaredValue;
    }

    public void setDeclaredValue(CurrencyAmount declaredValue) {
        this.declaredValue = declaredValue;
    }

    public ShippingServiceOptions carrierWillPickUp(Boolean carrierWillPickUp) {
        this.carrierWillPickUp = carrierWillPickUp;
        return this;
    }

    /**
     * When true, the carrier will pick up the package.  Note: Scheduled carrier pickup is available only using Dynamex (US), DPD (UK), and Royal Mail (UK).
     *
     * @return carrierWillPickUp
     **/
    @Schema(required = true, description = "When true, the carrier will pick up the package.  Note: Scheduled carrier pickup is available only using Dynamex (US), DPD (UK), and Royal Mail (UK).")
    public Boolean isCarrierWillPickUp() {
        return carrierWillPickUp;
    }

    public void setCarrierWillPickUp(Boolean carrierWillPickUp) {
        this.carrierWillPickUp = carrierWillPickUp;
    }

    public ShippingServiceOptions carrierWillPickUpOption(CarrierWillPickUpOption carrierWillPickUpOption) {
        this.carrierWillPickUpOption = carrierWillPickUpOption;
        return this;
    }

    /**
     * Get carrierWillPickUpOption
     *
     * @return carrierWillPickUpOption
     **/
    @Schema(description = "")
    public CarrierWillPickUpOption getCarrierWillPickUpOption() {
        return carrierWillPickUpOption;
    }

    public void setCarrierWillPickUpOption(CarrierWillPickUpOption carrierWillPickUpOption) {
        this.carrierWillPickUpOption = carrierWillPickUpOption;
    }

    public ShippingServiceOptions labelFormat(LabelFormat labelFormat) {
        this.labelFormat = labelFormat;
        return this;
    }

    /**
     * Get labelFormat
     *
     * @return labelFormat
     **/
    @Schema(description = "")
    public LabelFormat getLabelFormat() {
        return labelFormat;
    }

    public void setLabelFormat(LabelFormat labelFormat) {
        this.labelFormat = labelFormat;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShippingServiceOptions shippingServiceOptions = (ShippingServiceOptions) o;
        return Objects.equals(this.deliveryExperience, shippingServiceOptions.deliveryExperience) &&
                Objects.equals(this.declaredValue, shippingServiceOptions.declaredValue) &&
                Objects.equals(this.carrierWillPickUp, shippingServiceOptions.carrierWillPickUp) &&
                Objects.equals(this.carrierWillPickUpOption, shippingServiceOptions.carrierWillPickUpOption) &&
                Objects.equals(this.labelFormat, shippingServiceOptions.labelFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryExperience, declaredValue, carrierWillPickUp, carrierWillPickUpOption, labelFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShippingServiceOptions {\n");
        sb.append("    deliveryExperience: ").append(toIndentedString(deliveryExperience)).append("\n");
        sb.append("    declaredValue: ").append(toIndentedString(declaredValue)).append("\n");
        sb.append("    carrierWillPickUp: ").append(toIndentedString(carrierWillPickUp)).append("\n");
        sb.append("    carrierWillPickUpOption: ").append(toIndentedString(carrierWillPickUpOption)).append("\n");
        sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
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
