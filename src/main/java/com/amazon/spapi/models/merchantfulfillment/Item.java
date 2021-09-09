package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * An Amazon order item identifier and a quantity.
 */
@Schema(description = "An Amazon order item identifier and a quantity.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Item {
    @SerializedName("OrderItemId")
    private String orderItemId = null;
    @SerializedName("Quantity")
    private Integer quantity = null;
    @SerializedName("ItemWeight")
    private Weight itemWeight = null;
    @SerializedName("ItemDescription")
    private String itemDescription = null;
    @SerializedName("TransparencyCodeList")
    private TransparencyCodeList transparencyCodeList = null;
    @SerializedName("ItemLevelSellerInputsList")
    private AdditionalSellerInputsList itemLevelSellerInputsList = null;

    public Item orderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
        return this;
    }

    /**
     * Get orderItemId
     *
     * @return orderItemId
     **/
    @Schema(required = true, description = "")
    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Item quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get quantity
     *
     * @return quantity
     **/
    @Schema(required = true, description = "")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Item itemWeight(Weight itemWeight) {
        this.itemWeight = itemWeight;
        return this;
    }

    /**
     * Get itemWeight
     *
     * @return itemWeight
     **/
    @Schema(description = "")
    public Weight getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Weight itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Item itemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }

    /**
     * Get itemDescription
     *
     * @return itemDescription
     **/
    @Schema(description = "")
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Item transparencyCodeList(TransparencyCodeList transparencyCodeList) {
        this.transparencyCodeList = transparencyCodeList;
        return this;
    }

    /**
     * Get transparencyCodeList
     *
     * @return transparencyCodeList
     **/
    @Schema(description = "")
    public TransparencyCodeList getTransparencyCodeList() {
        return transparencyCodeList;
    }

    public void setTransparencyCodeList(TransparencyCodeList transparencyCodeList) {
        this.transparencyCodeList = transparencyCodeList;
    }

    public Item itemLevelSellerInputsList(AdditionalSellerInputsList itemLevelSellerInputsList) {
        this.itemLevelSellerInputsList = itemLevelSellerInputsList;
        return this;
    }

    /**
     * Get itemLevelSellerInputsList
     *
     * @return itemLevelSellerInputsList
     **/
    @Schema(description = "")
    public AdditionalSellerInputsList getItemLevelSellerInputsList() {
        return itemLevelSellerInputsList;
    }

    public void setItemLevelSellerInputsList(AdditionalSellerInputsList itemLevelSellerInputsList) {
        this.itemLevelSellerInputsList = itemLevelSellerInputsList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(this.orderItemId, item.orderItemId) &&
                Objects.equals(this.quantity, item.quantity) &&
                Objects.equals(this.itemWeight, item.itemWeight) &&
                Objects.equals(this.itemDescription, item.itemDescription) &&
                Objects.equals(this.transparencyCodeList, item.transparencyCodeList) &&
                Objects.equals(this.itemLevelSellerInputsList, item.itemLevelSellerInputsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderItemId, quantity, itemWeight, itemDescription, transparencyCodeList, itemLevelSellerInputsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Item {\n");
        sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    itemWeight: ").append(toIndentedString(itemWeight)).append("\n");
        sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
        sb.append("    transparencyCodeList: ").append(toIndentedString(transparencyCodeList)).append("\n");
        sb.append("    itemLevelSellerInputsList: ").append(toIndentedString(itemLevelSellerInputsList)).append("\n");
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
