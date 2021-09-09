package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The payload for the getAdditionalSellerInputs operation.
 */
@Schema(description = "The payload for the getAdditionalSellerInputs operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetAdditionalSellerInputsResult {
    @SerializedName("ShipmentLevelFields")
    private AdditionalInputsList shipmentLevelFields = null;
    @SerializedName("ItemLevelFieldsList")
    private ItemLevelFieldsList itemLevelFieldsList = null;

    public GetAdditionalSellerInputsResult shipmentLevelFields(AdditionalInputsList shipmentLevelFields) {
        this.shipmentLevelFields = shipmentLevelFields;
        return this;
    }

    /**
     * Get shipmentLevelFields
     *
     * @return shipmentLevelFields
     **/
    @Schema(description = "")
    public AdditionalInputsList getShipmentLevelFields() {
        return shipmentLevelFields;
    }

    public void setShipmentLevelFields(AdditionalInputsList shipmentLevelFields) {
        this.shipmentLevelFields = shipmentLevelFields;
    }

    public GetAdditionalSellerInputsResult itemLevelFieldsList(ItemLevelFieldsList itemLevelFieldsList) {
        this.itemLevelFieldsList = itemLevelFieldsList;
        return this;
    }

    /**
     * Get itemLevelFieldsList
     *
     * @return itemLevelFieldsList
     **/
    @Schema(description = "")
    public ItemLevelFieldsList getItemLevelFieldsList() {
        return itemLevelFieldsList;
    }

    public void setItemLevelFieldsList(ItemLevelFieldsList itemLevelFieldsList) {
        this.itemLevelFieldsList = itemLevelFieldsList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAdditionalSellerInputsResult getAdditionalSellerInputsResult = (GetAdditionalSellerInputsResult) o;
        return Objects.equals(this.shipmentLevelFields, getAdditionalSellerInputsResult.shipmentLevelFields) &&
                Objects.equals(this.itemLevelFieldsList, getAdditionalSellerInputsResult.itemLevelFieldsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentLevelFields, itemLevelFieldsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAdditionalSellerInputsResult {\n");
        sb.append("    shipmentLevelFields: ").append(toIndentedString(shipmentLevelFields)).append("\n");
        sb.append("    itemLevelFieldsList: ").append(toIndentedString(itemLevelFieldsList)).append("\n");
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
