package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Information about an SKU, including the count available, identifiers, and a list of overlapping SKUs that share the same inventory pool.
 */
@Schema(description = "Information about an SKU, including the count available, identifiers, and a list of overlapping SKUs that share the same inventory pool.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FeatureSku {
    @SerializedName("sellerSku")
    private String sellerSku = null;
    @SerializedName("fnSku")
    private String fnSku = null;
    @SerializedName("asin")
    private String asin = null;
    @SerializedName("skuCount")
    private BigDecimal skuCount = null;
    @SerializedName("overlappingSkus")
    private List<String> overlappingSkus = null;

    public FeatureSku sellerSku(String sellerSku) {
        this.sellerSku = sellerSku;
        return this;
    }

    /**
     * Used to identify an item in the given marketplace. SellerSKU is qualified by the seller&#x27;s SellerId, which is included with every operation that you submit.
     *
     * @return sellerSku
     **/
    @Schema(description = "Used to identify an item in the given marketplace. SellerSKU is qualified by the seller's SellerId, which is included with every operation that you submit.")
    public String getSellerSku() {
        return sellerSku;
    }

    public void setSellerSku(String sellerSku) {
        this.sellerSku = sellerSku;
    }

    public FeatureSku fnSku(String fnSku) {
        this.fnSku = fnSku;
        return this;
    }

    /**
     * The unique SKU used by Amazon&#x27;s fulfillment network.
     *
     * @return fnSku
     **/
    @Schema(description = "The unique SKU used by Amazon's fulfillment network.")
    public String getFnSku() {
        return fnSku;
    }

    public void setFnSku(String fnSku) {
        this.fnSku = fnSku;
    }

    public FeatureSku asin(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item.
     *
     * @return asin
     **/
    @Schema(description = "The Amazon Standard Identification Number (ASIN) of the item.")
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public FeatureSku skuCount(BigDecimal skuCount) {
        this.skuCount = skuCount;
        return this;
    }

    /**
     * The number of SKUs available for this service.
     *
     * @return skuCount
     **/
    @Schema(description = "The number of SKUs available for this service.")
    public BigDecimal getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(BigDecimal skuCount) {
        this.skuCount = skuCount;
    }

    public FeatureSku overlappingSkus(List<String> overlappingSkus) {
        this.overlappingSkus = overlappingSkus;
        return this;
    }

    public FeatureSku addOverlappingSkusItem(String overlappingSkusItem) {
        if (this.overlappingSkus == null) {
            this.overlappingSkus = new ArrayList<String>();
        }
        this.overlappingSkus.add(overlappingSkusItem);
        return this;
    }

    /**
     * Other seller SKUs that are shared across the same inventory.
     *
     * @return overlappingSkus
     **/
    @Schema(description = "Other seller SKUs that are shared across the same inventory.")
    public List<String> getOverlappingSkus() {
        return overlappingSkus;
    }

    public void setOverlappingSkus(List<String> overlappingSkus) {
        this.overlappingSkus = overlappingSkus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeatureSku featureSku = (FeatureSku) o;
        return Objects.equals(this.sellerSku, featureSku.sellerSku) &&
                Objects.equals(this.fnSku, featureSku.fnSku) &&
                Objects.equals(this.asin, featureSku.asin) &&
                Objects.equals(this.skuCount, featureSku.skuCount) &&
                Objects.equals(this.overlappingSkus, featureSku.overlappingSkus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerSku, fnSku, asin, skuCount, overlappingSkus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeatureSku {\n");
        sb.append("    sellerSku: ").append(toIndentedString(sellerSku)).append("\n");
        sb.append("    fnSku: ").append(toIndentedString(fnSku)).append("\n");
        sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
        sb.append("    skuCount: ").append(toIndentedString(skuCount)).append("\n");
        sb.append("    overlappingSkus: ").append(toIndentedString(overlappingSkus)).append("\n");
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
