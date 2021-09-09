package com.amazon.spapi.models.fbainventory;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The quantity of reserved inventory.
 */
@Schema(description = "The quantity of reserved inventory.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ReservedQuantity {
    @SerializedName("totalReservedQuantity")
    private Integer totalReservedQuantity = null;
    @SerializedName("pendingCustomerOrderQuantity")
    private Integer pendingCustomerOrderQuantity = null;
    @SerializedName("pendingTransshipmentQuantity")
    private Integer pendingTransshipmentQuantity = null;
    @SerializedName("fcProcessingQuantity")
    private Integer fcProcessingQuantity = null;

    public ReservedQuantity totalReservedQuantity(Integer totalReservedQuantity) {
        this.totalReservedQuantity = totalReservedQuantity;
        return this;
    }

    /**
     * The total number of units in Amazon&#x27;s fulfillment network that are currently being picked, packed, and shipped; or are sidelined for measurement, sampling, or other internal processes.
     *
     * @return totalReservedQuantity
     **/
    @Schema(description = "The total number of units in Amazon's fulfillment network that are currently being picked, packed, and shipped; or are sidelined for measurement, sampling, or other internal processes.")
    public Integer getTotalReservedQuantity() {
        return totalReservedQuantity;
    }

    public void setTotalReservedQuantity(Integer totalReservedQuantity) {
        this.totalReservedQuantity = totalReservedQuantity;
    }

    public ReservedQuantity pendingCustomerOrderQuantity(Integer pendingCustomerOrderQuantity) {
        this.pendingCustomerOrderQuantity = pendingCustomerOrderQuantity;
        return this;
    }

    /**
     * The number of units reserved for customer orders.
     *
     * @return pendingCustomerOrderQuantity
     **/
    @Schema(description = "The number of units reserved for customer orders.")
    public Integer getPendingCustomerOrderQuantity() {
        return pendingCustomerOrderQuantity;
    }

    public void setPendingCustomerOrderQuantity(Integer pendingCustomerOrderQuantity) {
        this.pendingCustomerOrderQuantity = pendingCustomerOrderQuantity;
    }

    public ReservedQuantity pendingTransshipmentQuantity(Integer pendingTransshipmentQuantity) {
        this.pendingTransshipmentQuantity = pendingTransshipmentQuantity;
        return this;
    }

    /**
     * The number of units being transferred from one fulfillment center to another.
     *
     * @return pendingTransshipmentQuantity
     **/
    @Schema(description = "The number of units being transferred from one fulfillment center to another.")
    public Integer getPendingTransshipmentQuantity() {
        return pendingTransshipmentQuantity;
    }

    public void setPendingTransshipmentQuantity(Integer pendingTransshipmentQuantity) {
        this.pendingTransshipmentQuantity = pendingTransshipmentQuantity;
    }

    public ReservedQuantity fcProcessingQuantity(Integer fcProcessingQuantity) {
        this.fcProcessingQuantity = fcProcessingQuantity;
        return this;
    }

    /**
     * The number of units that have been sidelined at the fulfillment center for additional processing.
     *
     * @return fcProcessingQuantity
     **/
    @Schema(description = "The number of units that have been sidelined at the fulfillment center for additional processing.")
    public Integer getFcProcessingQuantity() {
        return fcProcessingQuantity;
    }

    public void setFcProcessingQuantity(Integer fcProcessingQuantity) {
        this.fcProcessingQuantity = fcProcessingQuantity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReservedQuantity reservedQuantity = (ReservedQuantity) o;
        return Objects.equals(this.totalReservedQuantity, reservedQuantity.totalReservedQuantity) &&
                Objects.equals(this.pendingCustomerOrderQuantity, reservedQuantity.pendingCustomerOrderQuantity) &&
                Objects.equals(this.pendingTransshipmentQuantity, reservedQuantity.pendingTransshipmentQuantity) &&
                Objects.equals(this.fcProcessingQuantity, reservedQuantity.fcProcessingQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalReservedQuantity, pendingCustomerOrderQuantity, pendingTransshipmentQuantity, fcProcessingQuantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReservedQuantity {\n");
        sb.append("    totalReservedQuantity: ").append(toIndentedString(totalReservedQuantity)).append("\n");
        sb.append("    pendingCustomerOrderQuantity: ").append(toIndentedString(pendingCustomerOrderQuantity)).append("\n");
        sb.append("    pendingTransshipmentQuantity: ").append(toIndentedString(pendingTransshipmentQuantity)).append("\n");
        sb.append("    fcProcessingQuantity: ").append(toIndentedString(fcProcessingQuantity)).append("\n");
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
