package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * FeatureSettings allows users to apply fulfillment features to an order. To block an order from being shipped using Amazon Logistics (AMZL) and an AMZL tracking number, use featureName as BLOCK_AMZL and featureFulfillmentPolicy as Required. Blocking AMZL will incur an additional fee surcharge on your MCF orders and increase the risk of some of your orders being unfulfilled or delivered late if there are no alternative carriers available. Using BLOCK_AMZL in an order request will take precedence over your Seller Central account setting.
 */
@Schema(description = "FeatureSettings allows users to apply fulfillment features to an order. To block an order from being shipped using Amazon Logistics (AMZL) and an AMZL tracking number, use featureName as BLOCK_AMZL and featureFulfillmentPolicy as Required. Blocking AMZL will incur an additional fee surcharge on your MCF orders and increase the risk of some of your orders being unfulfilled or delivered late if there are no alternative carriers available. Using BLOCK_AMZL in an order request will take precedence over your Seller Central account setting.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FeatureSettings {
    @SerializedName("featureName")
    private String featureName = null;
    @SerializedName("featureFulfillmentPolicy")
    private FeatureFulfillmentPolicyEnum featureFulfillmentPolicy = null;

    public FeatureSettings featureName(String featureName) {
        this.featureName = featureName;
        return this;
    }

    /**
     * The name of the feature.
     *
     * @return featureName
     **/
    @Schema(description = "The name of the feature.")
    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public FeatureSettings featureFulfillmentPolicy(FeatureFulfillmentPolicyEnum featureFulfillmentPolicy) {
        this.featureFulfillmentPolicy = featureFulfillmentPolicy;
        return this;
    }

    /**
     * Specifies the policy to use when fulfilling an order.
     *
     * @return featureFulfillmentPolicy
     **/
    @Schema(description = "Specifies the policy to use when fulfilling an order.")
    public FeatureFulfillmentPolicyEnum getFeatureFulfillmentPolicy() {
        return featureFulfillmentPolicy;
    }

    public void setFeatureFulfillmentPolicy(FeatureFulfillmentPolicyEnum featureFulfillmentPolicy) {
        this.featureFulfillmentPolicy = featureFulfillmentPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeatureSettings featureSettings = (FeatureSettings) o;
        return Objects.equals(this.featureName, featureSettings.featureName) &&
                Objects.equals(this.featureFulfillmentPolicy, featureSettings.featureFulfillmentPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(featureName, featureFulfillmentPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeatureSettings {\n");
        sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
        sb.append("    featureFulfillmentPolicy: ").append(toIndentedString(featureFulfillmentPolicy)).append("\n");
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

    /**
     * Specifies the policy to use when fulfilling an order.
     */
    @JsonAdapter(FeatureFulfillmentPolicyEnum.Adapter.class)
    public enum FeatureFulfillmentPolicyEnum {
        REQUIRED("Required"),
        NOTREQUIRED("NotRequired");
        private String value;

        FeatureFulfillmentPolicyEnum(String value) {
            this.value = value;
        }

        public static FeatureFulfillmentPolicyEnum fromValue(String text) {
            for (FeatureFulfillmentPolicyEnum b : FeatureFulfillmentPolicyEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<FeatureFulfillmentPolicyEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FeatureFulfillmentPolicyEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FeatureFulfillmentPolicyEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return FeatureFulfillmentPolicyEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
