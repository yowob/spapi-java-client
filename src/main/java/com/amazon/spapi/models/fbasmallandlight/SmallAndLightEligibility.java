package com.amazon.spapi.models.fbasmallandlight;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The Small and Light eligibility status of the item indicated by the specified seller SKU.
 */
@Schema(description = "The Small and Light eligibility status of the item indicated by the specified seller SKU.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SmallAndLightEligibility {
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("sellerSKU")
    private String sellerSKU = null;
    @SerializedName("status")
    private SmallAndLightEligibilityStatus status = null;

    public SmallAndLightEligibility marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get marketplaceId
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public SmallAndLightEligibility sellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * Get sellerSKU
     *
     * @return sellerSKU
     **/
    @Schema(required = true, description = "")
    public String getSellerSKU() {
        return sellerSKU;
    }

    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    public SmallAndLightEligibility status(SmallAndLightEligibilityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(required = true, description = "")
    public SmallAndLightEligibilityStatus getStatus() {
        return status;
    }

    public void setStatus(SmallAndLightEligibilityStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmallAndLightEligibility smallAndLightEligibility = (SmallAndLightEligibility) o;
        return Objects.equals(this.marketplaceId, smallAndLightEligibility.marketplaceId) &&
                Objects.equals(this.sellerSKU, smallAndLightEligibility.sellerSKU) &&
                Objects.equals(this.status, smallAndLightEligibility.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, sellerSKU, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmallAndLightEligibility {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
