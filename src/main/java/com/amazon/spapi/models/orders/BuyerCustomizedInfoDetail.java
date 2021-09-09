package com.amazon.spapi.models.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Buyer information for custom orders from the Amazon Custom program.
 */
@Schema(description = "Buyer information for custom orders from the Amazon Custom program.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class BuyerCustomizedInfoDetail {
    @SerializedName("CustomizedURL")
    private String customizedURL = null;

    public BuyerCustomizedInfoDetail customizedURL(String customizedURL) {
        this.customizedURL = customizedURL;
        return this;
    }

    /**
     * The location of a zip file containing Amazon Custom data.
     *
     * @return customizedURL
     **/
    @Schema(description = "The location of a zip file containing Amazon Custom data.")
    public String getCustomizedURL() {
        return customizedURL;
    }

    public void setCustomizedURL(String customizedURL) {
        this.customizedURL = customizedURL;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BuyerCustomizedInfoDetail buyerCustomizedInfoDetail = (BuyerCustomizedInfoDetail) o;
        return Objects.equals(this.customizedURL, buyerCustomizedInfoDetail.customizedURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customizedURL);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuyerCustomizedInfoDetail {\n");
        sb.append("    customizedURL: ").append(toIndentedString(customizedURL)).append("\n");
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
