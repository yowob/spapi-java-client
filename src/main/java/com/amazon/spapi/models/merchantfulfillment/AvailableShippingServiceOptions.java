package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The available shipping service options.
 */
@Schema(description = "The available shipping service options.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AvailableShippingServiceOptions {
    @SerializedName("AvailableCarrierWillPickUpOptions")
    private AvailableCarrierWillPickUpOptionsList availableCarrierWillPickUpOptions = null;
    @SerializedName("AvailableDeliveryExperienceOptions")
    private AvailableDeliveryExperienceOptionsList availableDeliveryExperienceOptions = null;

    public AvailableShippingServiceOptions availableCarrierWillPickUpOptions(AvailableCarrierWillPickUpOptionsList availableCarrierWillPickUpOptions) {
        this.availableCarrierWillPickUpOptions = availableCarrierWillPickUpOptions;
        return this;
    }

    /**
     * Get availableCarrierWillPickUpOptions
     *
     * @return availableCarrierWillPickUpOptions
     **/
    @Schema(required = true, description = "")
    public AvailableCarrierWillPickUpOptionsList getAvailableCarrierWillPickUpOptions() {
        return availableCarrierWillPickUpOptions;
    }

    public void setAvailableCarrierWillPickUpOptions(AvailableCarrierWillPickUpOptionsList availableCarrierWillPickUpOptions) {
        this.availableCarrierWillPickUpOptions = availableCarrierWillPickUpOptions;
    }

    public AvailableShippingServiceOptions availableDeliveryExperienceOptions(AvailableDeliveryExperienceOptionsList availableDeliveryExperienceOptions) {
        this.availableDeliveryExperienceOptions = availableDeliveryExperienceOptions;
        return this;
    }

    /**
     * Get availableDeliveryExperienceOptions
     *
     * @return availableDeliveryExperienceOptions
     **/
    @Schema(required = true, description = "")
    public AvailableDeliveryExperienceOptionsList getAvailableDeliveryExperienceOptions() {
        return availableDeliveryExperienceOptions;
    }

    public void setAvailableDeliveryExperienceOptions(AvailableDeliveryExperienceOptionsList availableDeliveryExperienceOptions) {
        this.availableDeliveryExperienceOptions = availableDeliveryExperienceOptions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailableShippingServiceOptions availableShippingServiceOptions = (AvailableShippingServiceOptions) o;
        return Objects.equals(this.availableCarrierWillPickUpOptions, availableShippingServiceOptions.availableCarrierWillPickUpOptions) &&
                Objects.equals(this.availableDeliveryExperienceOptions, availableShippingServiceOptions.availableDeliveryExperienceOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableCarrierWillPickUpOptions, availableDeliveryExperienceOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableShippingServiceOptions {\n");
        sb.append("    availableCarrierWillPickUpOptions: ").append(toIndentedString(availableCarrierWillPickUpOptions)).append("\n");
        sb.append("    availableDeliveryExperienceOptions: ").append(toIndentedString(availableDeliveryExperienceOptions)).append("\n");
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
