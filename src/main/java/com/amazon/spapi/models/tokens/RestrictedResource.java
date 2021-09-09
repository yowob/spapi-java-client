package com.amazon.spapi.models.tokens;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Model of a restricted resource.
 */
@Schema(description = "Model of a restricted resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class RestrictedResource {
    @SerializedName("method")
    private MethodEnum method = null;
    @SerializedName("path")
    private String path = null;
    @SerializedName("dataElements")
    private List<String> dataElements = null;

    public RestrictedResource method(MethodEnum method) {
        this.method = method;
        return this;
    }

    /**
     * The HTTP method in the restricted resource.
     *
     * @return method
     **/
    @Schema(required = true, description = "The HTTP method in the restricted resource.")
    public MethodEnum getMethod() {
        return method;
    }

    public void setMethod(MethodEnum method) {
        this.method = method;
    }

    public RestrictedResource path(String path) {
        this.path = path;
        return this;
    }

    /**
     * The path in the restricted resource. Here are some path examples: - &#x60;&#x60;&#x60;/orders/v0/orders&#x60;&#x60;&#x60;. For getting an RDT for the getOrders operation of the Orders API. For bulk orders. - &#x60;&#x60;&#x60;/orders/v0/orders/123-1234567-1234567&#x60;&#x60;&#x60;. For getting an RDT for the getOrder operation of the Orders API. For a specific order. - &#x60;&#x60;&#x60;/orders/v0/orders/123-1234567-1234567/orderItems&#x60;&#x60;&#x60;. For getting an RDT for the getOrderItems operation of the Orders API. For the order items in a specific order. - &#x60;&#x60;&#x60;/mfn/v0/shipments/FBA1234ABC5D&#x60;&#x60;&#x60;. For getting an RDT for the getShipment operation of the Shipping API. For a specific shipment. - &#x60;&#x60;&#x60;/mfn/v0/shipments/{shipmentId}&#x60;&#x60;&#x60;. For getting an RDT for the getShipment operation of the Shipping API. For any of a selling partner&#x27;s shipments that you specify when you call the getShipment operation.
     *
     * @return path
     **/
    @Schema(required = true, description = "The path in the restricted resource. Here are some path examples: - ```/orders/v0/orders```. For getting an RDT for the getOrders operation of the Orders API. For bulk orders. - ```/orders/v0/orders/123-1234567-1234567```. For getting an RDT for the getOrder operation of the Orders API. For a specific order. - ```/orders/v0/orders/123-1234567-1234567/orderItems```. For getting an RDT for the getOrderItems operation of the Orders API. For the order items in a specific order. - ```/mfn/v0/shipments/FBA1234ABC5D```. For getting an RDT for the getShipment operation of the Shipping API. For a specific shipment. - ```/mfn/v0/shipments/{shipmentId}```. For getting an RDT for the getShipment operation of the Shipping API. For any of a selling partner's shipments that you specify when you call the getShipment operation.")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RestrictedResource dataElements(List<String> dataElements) {
        this.dataElements = dataElements;
        return this;
    }

    public RestrictedResource addDataElementsItem(String dataElementsItem) {
        if (this.dataElements == null) {
            this.dataElements = new ArrayList<String>();
        }
        this.dataElements.add(dataElementsItem);
        return this;
    }

    /**
     * Indicates the type of Personally Identifiable Information requested. This parameter is required only when getting an RDT for use with the getOrder, getOrders, or getOrderItems operation of the Orders API. For more information, see the [Tokens API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/references/tokens-api/tokens_2021-03-01.md). Possible values include: - **buyerInfo**. On the order level this includes general identifying information about the buyer and tax-related information. On the order item level this includes gift wrap information and custom order information, if available. - **shippingAddress**. This includes information for fulfilling orders.
     *
     * @return dataElements
     **/
    @Schema(description = "Indicates the type of Personally Identifiable Information requested. This parameter is required only when getting an RDT for use with the getOrder, getOrders, or getOrderItems operation of the Orders API. For more information, see the [Tokens API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/references/tokens-api/tokens_2021-03-01.md). Possible values include: - **buyerInfo**. On the order level this includes general identifying information about the buyer and tax-related information. On the order item level this includes gift wrap information and custom order information, if available. - **shippingAddress**. This includes information for fulfilling orders.")
    public List<String> getDataElements() {
        return dataElements;
    }

    public void setDataElements(List<String> dataElements) {
        this.dataElements = dataElements;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestrictedResource restrictedResource = (RestrictedResource) o;
        return Objects.equals(this.method, restrictedResource.method) &&
                Objects.equals(this.path, restrictedResource.path) &&
                Objects.equals(this.dataElements, restrictedResource.dataElements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, path, dataElements);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestrictedResource {\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    dataElements: ").append(toIndentedString(dataElements)).append("\n");
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
     * The HTTP method in the restricted resource.
     */
    @JsonAdapter(MethodEnum.Adapter.class)
    public enum MethodEnum {
        GET("GET"),
        PUT("PUT"),
        POST("POST"),
        DELETE("DELETE");
        private String value;

        MethodEnum(String value) {
            this.value = value;
        }

        public static MethodEnum fromValue(String text) {
            for (MethodEnum b : MethodEnum.values()) {
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

        public static class Adapter extends TypeAdapter<MethodEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MethodEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return MethodEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
