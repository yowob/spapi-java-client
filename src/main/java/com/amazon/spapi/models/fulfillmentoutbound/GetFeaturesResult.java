package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The payload for the getFeatures operation.
 */
@Schema(description = "The payload for the getFeatures operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetFeaturesResult {
    @SerializedName("features")
    private Features features = null;

    public GetFeaturesResult features(Features features) {
        this.features = features;
        return this;
    }

    /**
     * Get features
     *
     * @return features
     **/
    @Schema(required = true, description = "")
    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetFeaturesResult getFeaturesResult = (GetFeaturesResult) o;
        return Objects.equals(this.features, getFeaturesResult.features);
    }

    @Override
    public int hashCode() {
        return Objects.hash(features);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFeaturesResult {\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
