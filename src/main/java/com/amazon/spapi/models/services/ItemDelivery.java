package com.amazon.spapi.models.services;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Delivery information for the item.
 */
@Schema(description = "Delivery information for the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemDelivery {
    @SerializedName("estimatedDeliveryDate")
    private OffsetDateTime estimatedDeliveryDate = null;
    @SerializedName("itemDeliveryPromise")
    private ItemDeliveryPromise itemDeliveryPromise = null;

    public ItemDelivery estimatedDeliveryDate(OffsetDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        return this;
    }

    /**
     * The date and time of the latest Estimated Delivery Date (EDD) of all the items with an EDD. In ISO 8601 format.
     *
     * @return estimatedDeliveryDate
     **/
    @Schema(description = "The date and time of the latest Estimated Delivery Date (EDD) of all the items with an EDD. In ISO 8601 format.")
    public OffsetDateTime getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(OffsetDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public ItemDelivery itemDeliveryPromise(ItemDeliveryPromise itemDeliveryPromise) {
        this.itemDeliveryPromise = itemDeliveryPromise;
        return this;
    }

    /**
     * Get itemDeliveryPromise
     *
     * @return itemDeliveryPromise
     **/
    @Schema(description = "")
    public ItemDeliveryPromise getItemDeliveryPromise() {
        return itemDeliveryPromise;
    }

    public void setItemDeliveryPromise(ItemDeliveryPromise itemDeliveryPromise) {
        this.itemDeliveryPromise = itemDeliveryPromise;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemDelivery itemDelivery = (ItemDelivery) o;
        return Objects.equals(this.estimatedDeliveryDate, itemDelivery.estimatedDeliveryDate) &&
                Objects.equals(this.itemDeliveryPromise, itemDelivery.itemDeliveryPromise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estimatedDeliveryDate, itemDeliveryPromise);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemDelivery {\n");
        sb.append("    estimatedDeliveryDate: ").append(toIndentedString(estimatedDeliveryDate)).append("\n");
        sb.append("    itemDeliveryPromise: ").append(toIndentedString(itemDeliveryPromise)).append("\n");
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
