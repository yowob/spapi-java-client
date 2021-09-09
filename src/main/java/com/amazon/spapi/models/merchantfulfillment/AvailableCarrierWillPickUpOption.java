package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Indicates whether the carrier will pick up the package, and what fee is charged, if any.
 */
@Schema(description = "Indicates whether the carrier will pick up the package, and what fee is charged, if any.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AvailableCarrierWillPickUpOption {
    @SerializedName("CarrierWillPickUpOption")
    private CarrierWillPickUpOption carrierWillPickUpOption = null;
    @SerializedName("Charge")
    private CurrencyAmount charge = null;

    public AvailableCarrierWillPickUpOption carrierWillPickUpOption(CarrierWillPickUpOption carrierWillPickUpOption) {
        this.carrierWillPickUpOption = carrierWillPickUpOption;
        return this;
    }

    /**
     * Get carrierWillPickUpOption
     *
     * @return carrierWillPickUpOption
     **/
    @Schema(required = true, description = "")
    public CarrierWillPickUpOption getCarrierWillPickUpOption() {
        return carrierWillPickUpOption;
    }

    public void setCarrierWillPickUpOption(CarrierWillPickUpOption carrierWillPickUpOption) {
        this.carrierWillPickUpOption = carrierWillPickUpOption;
    }

    public AvailableCarrierWillPickUpOption charge(CurrencyAmount charge) {
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
        AvailableCarrierWillPickUpOption availableCarrierWillPickUpOption = (AvailableCarrierWillPickUpOption) o;
        return Objects.equals(this.carrierWillPickUpOption, availableCarrierWillPickUpOption.carrierWillPickUpOption) &&
                Objects.equals(this.charge, availableCarrierWillPickUpOption.charge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierWillPickUpOption, charge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableCarrierWillPickUpOption {\n");
        sb.append("    carrierWillPickUpOption: ").append(toIndentedString(carrierWillPickUpOption)).append("\n");
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
