package com.amazon.spapi.models.listingsitems;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * The request body schema for the putListingsItem operation.
 */
@Schema(description = "The request body schema for the putListingsItem operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ListingsItemPutRequest {
    @SerializedName("productType")
    private String productType = null;
    @SerializedName("requirements")
    private RequirementsEnum requirements = null;
    @SerializedName("attributes")
    private Object attributes = null;

    public ListingsItemPutRequest productType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * The Amazon product type of the listings item.
     *
     * @return productType
     **/
    @Schema(required = true, description = "The Amazon product type of the listings item.")
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public ListingsItemPutRequest requirements(RequirementsEnum requirements) {
        this.requirements = requirements;
        return this;
    }

    /**
     * The name of the requirements set for the provided data.
     *
     * @return requirements
     **/
    @Schema(description = "The name of the requirements set for the provided data.")
    public RequirementsEnum getRequirements() {
        return requirements;
    }

    public void setRequirements(RequirementsEnum requirements) {
        this.requirements = requirements;
    }

    public ListingsItemPutRequest attributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * JSON object containing structured listings item attribute data keyed by attribute name.
     *
     * @return attributes
     **/
    @Schema(required = true, description = "JSON object containing structured listings item attribute data keyed by attribute name.")
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListingsItemPutRequest listingsItemPutRequest = (ListingsItemPutRequest) o;
        return Objects.equals(this.productType, listingsItemPutRequest.productType) &&
                Objects.equals(this.requirements, listingsItemPutRequest.requirements) &&
                Objects.equals(this.attributes, listingsItemPutRequest.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productType, requirements, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListingsItemPutRequest {\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
     * The name of the requirements set for the provided data.
     */
    @JsonAdapter(RequirementsEnum.Adapter.class)
    public enum RequirementsEnum {
        LISTING("LISTING"),
        LISTING_PRODUCT_ONLY("LISTING_PRODUCT_ONLY"),
        LISTING_OFFER_ONLY("LISTING_OFFER_ONLY");
        private String value;

        RequirementsEnum(String value) {
            this.value = value;
        }

        public static RequirementsEnum fromValue(String text) {
            for (RequirementsEnum b : RequirementsEnum.values()) {
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

        public static class Adapter extends TypeAdapter<RequirementsEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RequirementsEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RequirementsEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return RequirementsEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
