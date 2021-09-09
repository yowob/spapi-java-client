package com.amazon.spapi.models.fbainventory;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The quantity of unfulfillable inventory.
 */
@Schema(description = "The quantity of unfulfillable inventory.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class UnfulfillableQuantity {
    @SerializedName("totalUnfulfillableQuantity")
    private Integer totalUnfulfillableQuantity = null;
    @SerializedName("customerDamagedQuantity")
    private Integer customerDamagedQuantity = null;
    @SerializedName("warehouseDamagedQuantity")
    private Integer warehouseDamagedQuantity = null;
    @SerializedName("distributorDamagedQuantity")
    private Integer distributorDamagedQuantity = null;
    @SerializedName("carrierDamagedQuantity")
    private Integer carrierDamagedQuantity = null;
    @SerializedName("defectiveQuantity")
    private Integer defectiveQuantity = null;
    @SerializedName("expiredQuantity")
    private Integer expiredQuantity = null;

    public UnfulfillableQuantity totalUnfulfillableQuantity(Integer totalUnfulfillableQuantity) {
        this.totalUnfulfillableQuantity = totalUnfulfillableQuantity;
        return this;
    }

    /**
     * The total number of units in Amazon&#x27;s fulfillment network in unsellable condition.
     *
     * @return totalUnfulfillableQuantity
     **/
    @Schema(description = "The total number of units in Amazon's fulfillment network in unsellable condition.")
    public Integer getTotalUnfulfillableQuantity() {
        return totalUnfulfillableQuantity;
    }

    public void setTotalUnfulfillableQuantity(Integer totalUnfulfillableQuantity) {
        this.totalUnfulfillableQuantity = totalUnfulfillableQuantity;
    }

    public UnfulfillableQuantity customerDamagedQuantity(Integer customerDamagedQuantity) {
        this.customerDamagedQuantity = customerDamagedQuantity;
        return this;
    }

    /**
     * The number of units in customer damaged disposition.
     *
     * @return customerDamagedQuantity
     **/
    @Schema(description = "The number of units in customer damaged disposition.")
    public Integer getCustomerDamagedQuantity() {
        return customerDamagedQuantity;
    }

    public void setCustomerDamagedQuantity(Integer customerDamagedQuantity) {
        this.customerDamagedQuantity = customerDamagedQuantity;
    }

    public UnfulfillableQuantity warehouseDamagedQuantity(Integer warehouseDamagedQuantity) {
        this.warehouseDamagedQuantity = warehouseDamagedQuantity;
        return this;
    }

    /**
     * The number of units in warehouse damaged disposition.
     *
     * @return warehouseDamagedQuantity
     **/
    @Schema(description = "The number of units in warehouse damaged disposition.")
    public Integer getWarehouseDamagedQuantity() {
        return warehouseDamagedQuantity;
    }

    public void setWarehouseDamagedQuantity(Integer warehouseDamagedQuantity) {
        this.warehouseDamagedQuantity = warehouseDamagedQuantity;
    }

    public UnfulfillableQuantity distributorDamagedQuantity(Integer distributorDamagedQuantity) {
        this.distributorDamagedQuantity = distributorDamagedQuantity;
        return this;
    }

    /**
     * The number of units in distributor damaged disposition.
     *
     * @return distributorDamagedQuantity
     **/
    @Schema(description = "The number of units in distributor damaged disposition.")
    public Integer getDistributorDamagedQuantity() {
        return distributorDamagedQuantity;
    }

    public void setDistributorDamagedQuantity(Integer distributorDamagedQuantity) {
        this.distributorDamagedQuantity = distributorDamagedQuantity;
    }

    public UnfulfillableQuantity carrierDamagedQuantity(Integer carrierDamagedQuantity) {
        this.carrierDamagedQuantity = carrierDamagedQuantity;
        return this;
    }

    /**
     * The number of units in carrier damaged disposition.
     *
     * @return carrierDamagedQuantity
     **/
    @Schema(description = "The number of units in carrier damaged disposition.")
    public Integer getCarrierDamagedQuantity() {
        return carrierDamagedQuantity;
    }

    public void setCarrierDamagedQuantity(Integer carrierDamagedQuantity) {
        this.carrierDamagedQuantity = carrierDamagedQuantity;
    }

    public UnfulfillableQuantity defectiveQuantity(Integer defectiveQuantity) {
        this.defectiveQuantity = defectiveQuantity;
        return this;
    }

    /**
     * The number of units in defective disposition.
     *
     * @return defectiveQuantity
     **/
    @Schema(description = "The number of units in defective disposition.")
    public Integer getDefectiveQuantity() {
        return defectiveQuantity;
    }

    public void setDefectiveQuantity(Integer defectiveQuantity) {
        this.defectiveQuantity = defectiveQuantity;
    }

    public UnfulfillableQuantity expiredQuantity(Integer expiredQuantity) {
        this.expiredQuantity = expiredQuantity;
        return this;
    }

    /**
     * The number of units in expired disposition.
     *
     * @return expiredQuantity
     **/
    @Schema(description = "The number of units in expired disposition.")
    public Integer getExpiredQuantity() {
        return expiredQuantity;
    }

    public void setExpiredQuantity(Integer expiredQuantity) {
        this.expiredQuantity = expiredQuantity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnfulfillableQuantity unfulfillableQuantity = (UnfulfillableQuantity) o;
        return Objects.equals(this.totalUnfulfillableQuantity, unfulfillableQuantity.totalUnfulfillableQuantity) &&
                Objects.equals(this.customerDamagedQuantity, unfulfillableQuantity.customerDamagedQuantity) &&
                Objects.equals(this.warehouseDamagedQuantity, unfulfillableQuantity.warehouseDamagedQuantity) &&
                Objects.equals(this.distributorDamagedQuantity, unfulfillableQuantity.distributorDamagedQuantity) &&
                Objects.equals(this.carrierDamagedQuantity, unfulfillableQuantity.carrierDamagedQuantity) &&
                Objects.equals(this.defectiveQuantity, unfulfillableQuantity.defectiveQuantity) &&
                Objects.equals(this.expiredQuantity, unfulfillableQuantity.expiredQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalUnfulfillableQuantity, customerDamagedQuantity, warehouseDamagedQuantity, distributorDamagedQuantity, carrierDamagedQuantity, defectiveQuantity, expiredQuantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnfulfillableQuantity {\n");
        sb.append("    totalUnfulfillableQuantity: ").append(toIndentedString(totalUnfulfillableQuantity)).append("\n");
        sb.append("    customerDamagedQuantity: ").append(toIndentedString(customerDamagedQuantity)).append("\n");
        sb.append("    warehouseDamagedQuantity: ").append(toIndentedString(warehouseDamagedQuantity)).append("\n");
        sb.append("    distributorDamagedQuantity: ").append(toIndentedString(distributorDamagedQuantity)).append("\n");
        sb.append("    carrierDamagedQuantity: ").append(toIndentedString(carrierDamagedQuantity)).append("\n");
        sb.append("    defectiveQuantity: ").append(toIndentedString(defectiveQuantity)).append("\n");
        sb.append("    expiredQuantity: ").append(toIndentedString(expiredQuantity)).append("\n");
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