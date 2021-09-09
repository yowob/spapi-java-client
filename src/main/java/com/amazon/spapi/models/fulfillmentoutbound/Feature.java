package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A Multi-Channel Fulfillment feature.
 */
@Schema(description = "A Multi-Channel Fulfillment feature.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Feature {
    @SerializedName("featureName")
    private String featureName = null;
    @SerializedName("featureDescription")
    private String featureDescription = null;
    @SerializedName("sellerEligible")
    private Boolean sellerEligible = null;

    public Feature featureName(String featureName) {
        this.featureName = featureName;
        return this;
    }

    /**
     * The feature name.
     *
     * @return featureName
     **/
    @Schema(required = true, description = "The feature name.")
    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public Feature featureDescription(String featureDescription) {
        this.featureDescription = featureDescription;
        return this;
    }

    /**
     * The feature description.
     *
     * @return featureDescription
     **/
    @Schema(required = true, description = "The feature description.")
    public String getFeatureDescription() {
        return featureDescription;
    }

    public void setFeatureDescription(String featureDescription) {
        this.featureDescription = featureDescription;
    }

    public Feature sellerEligible(Boolean sellerEligible) {
        this.sellerEligible = sellerEligible;
        return this;
    }

    /**
     * When true, indicates that the seller is eligible to use the feature.
     *
     * @return sellerEligible
     **/
    @Schema(description = "When true, indicates that the seller is eligible to use the feature.")
    public Boolean isSellerEligible() {
        return sellerEligible;
    }

    public void setSellerEligible(Boolean sellerEligible) {
        this.sellerEligible = sellerEligible;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Feature feature = (Feature) o;
        return Objects.equals(this.featureName, feature.featureName) &&
                Objects.equals(this.featureDescription, feature.featureDescription) &&
                Objects.equals(this.sellerEligible, feature.sellerEligible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(featureName, featureDescription, sellerEligible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Feature {\n");
        sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
        sb.append("    featureDescription: ").append(toIndentedString(featureDescription)).append("\n");
        sb.append("    sellerEligible: ").append(toIndentedString(sellerEligible)).append("\n");
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
