package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Specifies the identifiers used to uniquely identify an item.
 */
@Schema(description = "Specifies the identifiers used to uniquely identify an item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class IdentifierType {
    @SerializedName("MarketplaceASIN")
    private ASINIdentifier marketplaceASIN = null;
    @SerializedName("SKUIdentifier")
    private SellerSKUIdentifier skUIdentifier = null;

    public IdentifierType marketplaceASIN(ASINIdentifier marketplaceASIN) {
        this.marketplaceASIN = marketplaceASIN;
        return this;
    }

    /**
     * Get marketplaceASIN
     *
     * @return marketplaceASIN
     **/
    @Schema(required = true, description = "")
    public ASINIdentifier getMarketplaceASIN() {
        return marketplaceASIN;
    }

    public void setMarketplaceASIN(ASINIdentifier marketplaceASIN) {
        this.marketplaceASIN = marketplaceASIN;
    }

    public IdentifierType skUIdentifier(SellerSKUIdentifier skUIdentifier) {
        this.skUIdentifier = skUIdentifier;
        return this;
    }

    /**
     * Get skUIdentifier
     *
     * @return skUIdentifier
     **/
    @Schema(description = "")
    public SellerSKUIdentifier getSkUIdentifier() {
        return skUIdentifier;
    }

    public void setSkUIdentifier(SellerSKUIdentifier skUIdentifier) {
        this.skUIdentifier = skUIdentifier;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentifierType identifierType = (IdentifierType) o;
        return Objects.equals(this.marketplaceASIN, identifierType.marketplaceASIN) &&
                Objects.equals(this.skUIdentifier, identifierType.skUIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceASIN, skUIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentifierType {\n");
        sb.append("    marketplaceASIN: ").append(toIndentedString(marketplaceASIN)).append("\n");
        sb.append("    skUIdentifier: ").append(toIndentedString(skUIdentifier)).append("\n");
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
