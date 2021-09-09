package com.amazon.spapi.models.services;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information about the seller of the service job.
 */
@Schema(description = "Information about the seller of the service job.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Seller {
    @SerializedName("sellerId")
    private String sellerId = null;

    public Seller sellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * The identifier of the seller of the service job.
     *
     * @return sellerId
     **/
    @Schema(description = "The identifier of the seller of the service job.")
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Seller seller = (Seller) o;
        return Objects.equals(this.sellerId, seller.sellerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Seller {\n");
        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
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
