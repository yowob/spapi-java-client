package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The available delivery confirmation options, and the fee charged, if any.
 */
@Schema(description = "The available delivery confirmation options, and the fee charged, if any.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AvailableDeliveryExperienceOption {
    @SerializedName("DeliveryExperienceOption")
    private DeliveryExperienceOption deliveryExperienceOption = null;
    @SerializedName("Charge")
    private CurrencyAmount charge = null;

    public AvailableDeliveryExperienceOption deliveryExperienceOption(DeliveryExperienceOption deliveryExperienceOption) {
        this.deliveryExperienceOption = deliveryExperienceOption;
        return this;
    }

    /**
     * Get deliveryExperienceOption
     *
     * @return deliveryExperienceOption
     **/
    @Schema(required = true, description = "")
    public DeliveryExperienceOption getDeliveryExperienceOption() {
        return deliveryExperienceOption;
    }

    public void setDeliveryExperienceOption(DeliveryExperienceOption deliveryExperienceOption) {
        this.deliveryExperienceOption = deliveryExperienceOption;
    }

    public AvailableDeliveryExperienceOption charge(CurrencyAmount charge) {
        this.charge = charge;
        return this;
    }

    /**
     * Get charge
     *
     * @return charge
     **/
    @Schema(required = true, description = "")
    public CurrencyAmount getCharge() {
        return charge;
    }

    public void setCharge(CurrencyAmount charge) {
        this.charge = charge;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailableDeliveryExperienceOption availableDeliveryExperienceOption = (AvailableDeliveryExperienceOption) o;
        return Objects.equals(this.deliveryExperienceOption, availableDeliveryExperienceOption.deliveryExperienceOption) &&
                Objects.equals(this.charge, availableDeliveryExperienceOption.charge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryExperienceOption, charge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableDeliveryExperienceOption {\n");
        sb.append("    deliveryExperienceOption: ").append(toIndentedString(deliveryExperienceOption)).append("\n");
        sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
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
