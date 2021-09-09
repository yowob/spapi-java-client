package com.amazon.spapi.models.fbasmallandlight;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * An item to be sold.
 */
@Schema(description = "An item to be sold.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Item {
    @SerializedName("asin")
    private String asin = null;
    @SerializedName("price")
    private MoneyType price = null;

    public Item asin(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) value used to identify the item.
     *
     * @return asin
     **/
    @Schema(required = true, description = "The Amazon Standard Identification Number (ASIN) value used to identify the item.")
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public Item price(MoneyType price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/
    @Schema(required = true, description = "")
    public MoneyType getPrice() {
        return price;
    }

    public void setPrice(MoneyType price) {
        this.price = price;
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
        return Objects.equals(this.asin, item.asin) &&
                Objects.equals(this.price, item.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asin, price);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Item {\n");
        sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
