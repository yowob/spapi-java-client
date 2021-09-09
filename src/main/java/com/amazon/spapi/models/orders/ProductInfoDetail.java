package com.amazon.spapi.models.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Product information on the number of items.
 */
@Schema(description = "Product information on the number of items.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ProductInfoDetail {
    @SerializedName("NumberOfItems")
    private Integer numberOfItems = null;

    public ProductInfoDetail numberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
        return this;
    }

    /**
     * The total number of items that are included in the ASIN.
     *
     * @return numberOfItems
     **/
    @Schema(description = "The total number of items that are included in the ASIN.")
    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductInfoDetail productInfoDetail = (ProductInfoDetail) o;
        return Objects.equals(this.numberOfItems, productInfoDetail.numberOfItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductInfoDetail {\n");
        sb.append("    numberOfItems: ").append(toIndentedString(numberOfItems)).append("\n");
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
