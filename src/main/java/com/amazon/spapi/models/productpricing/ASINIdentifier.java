package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ASINIdentifier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ASINIdentifier {
    @SerializedName("MarketplaceId")
    private String marketplaceId = null;
    @SerializedName("ASIN")
    private String ASIN = null;

    public ASINIdentifier marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * A marketplace identifier.
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "A marketplace identifier.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public ASINIdentifier ASIN(String ASIN) {
        this.ASIN = ASIN;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item.
     *
     * @return ASIN
     **/
    @Schema(required = true, description = "The Amazon Standard Identification Number (ASIN) of the item.")
    public String getASIN() {
        return ASIN;
    }

    public void setASIN(String ASIN) {
        this.ASIN = ASIN;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ASINIdentifier asINIdentifier = (ASINIdentifier) o;
        return Objects.equals(this.marketplaceId, asINIdentifier.marketplaceId) &&
                Objects.equals(this.ASIN, asINIdentifier.ASIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, ASIN);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ASINIdentifier {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
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
