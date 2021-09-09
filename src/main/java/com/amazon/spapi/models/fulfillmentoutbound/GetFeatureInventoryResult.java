package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The payload for the getEligibileInventory operation.
 */
@Schema(description = "The payload for the getEligibileInventory operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetFeatureInventoryResult {
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("featureName")
    private String featureName = null;
    @SerializedName("nextToken")
    private String nextToken = null;
    @SerializedName("featureSkus")
    private List<FeatureSku> featureSkus = null;

    public GetFeatureInventoryResult marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * The requested marketplace.
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "The requested marketplace.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public GetFeatureInventoryResult featureName(String featureName) {
        this.featureName = featureName;
        return this;
    }

    /**
     * The name of the feature.
     *
     * @return featureName
     **/
    @Schema(required = true, description = "The name of the feature.")
    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public GetFeatureInventoryResult nextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * When present and not empty, pass this string token in the next request to return the next response page.
     *
     * @return nextToken
     **/
    @Schema(description = "When present and not empty, pass this string token in the next request to return the next response page.")
    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    public GetFeatureInventoryResult featureSkus(List<FeatureSku> featureSkus) {
        this.featureSkus = featureSkus;
        return this;
    }

    public GetFeatureInventoryResult addFeatureSkusItem(FeatureSku featureSkusItem) {
        if (this.featureSkus == null) {
            this.featureSkus = new ArrayList<FeatureSku>();
        }
        this.featureSkus.add(featureSkusItem);
        return this;
    }

    /**
     * An array of SKUs eligible for this feature and the quantity available.
     *
     * @return featureSkus
     **/
    @Schema(description = "An array of SKUs eligible for this feature and the quantity available.")
    public List<FeatureSku> getFeatureSkus() {
        return featureSkus;
    }

    public void setFeatureSkus(List<FeatureSku> featureSkus) {
        this.featureSkus = featureSkus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetFeatureInventoryResult getFeatureInventoryResult = (GetFeatureInventoryResult) o;
        return Objects.equals(this.marketplaceId, getFeatureInventoryResult.marketplaceId) &&
                Objects.equals(this.featureName, getFeatureInventoryResult.featureName) &&
                Objects.equals(this.nextToken, getFeatureInventoryResult.nextToken) &&
                Objects.equals(this.featureSkus, getFeatureInventoryResult.featureSkus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, featureName, nextToken, featureSkus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFeatureInventoryResult {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    featureSkus: ").append(toIndentedString(featureSkus)).append("\n");
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
