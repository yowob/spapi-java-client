package com.amazon.spapi.models.shipping;

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
 * Container in the shipment.
 */
@Schema(description = "Container in the shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Container {
    @SerializedName("containerType")
    private ContainerTypeEnum containerType = null;
    @SerializedName("containerReferenceId")
    private String containerReferenceId = null;
    @SerializedName("value")
    private Currency value = null;
    @SerializedName("dimensions")
    private Dimensions dimensions = null;
    @SerializedName("items")
    private List<ContainerItem> items = new ArrayList<ContainerItem>();
    @SerializedName("weight")
    private Weight weight = null;

    public Container containerType(ContainerTypeEnum containerType) {
        this.containerType = containerType;
        return this;
    }

    /**
     * The type of physical container being used. (always &#x27;PACKAGE&#x27;)
     *
     * @return containerType
     **/
    @Schema(description = "The type of physical container being used. (always 'PACKAGE')")
    public ContainerTypeEnum getContainerType() {
        return containerType;
    }

    public void setContainerType(ContainerTypeEnum containerType) {
        this.containerType = containerType;
    }

    public Container containerReferenceId(String containerReferenceId) {
        this.containerReferenceId = containerReferenceId;
        return this;
    }

    /**
     * Get containerReferenceId
     *
     * @return containerReferenceId
     **/
    @Schema(required = true, description = "")
    public String getContainerReferenceId() {
        return containerReferenceId;
    }

    public void setContainerReferenceId(String containerReferenceId) {
        this.containerReferenceId = containerReferenceId;
    }

    public Container value(Currency value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    @Schema(required = true, description = "")
    public Currency getValue() {
        return value;
    }

    public void setValue(Currency value) {
        this.value = value;
    }

    public Container dimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get dimensions
     *
     * @return dimensions
     **/
    @Schema(required = true, description = "")
    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Container items(List<ContainerItem> items) {
        this.items = items;
        return this;
    }

    public Container addItemsItem(ContainerItem itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * A list of the items in the container.
     *
     * @return items
     **/
    @Schema(required = true, description = "A list of the items in the container.")
    public List<ContainerItem> getItems() {
        return items;
    }

    public void setItems(List<ContainerItem> items) {
        this.items = items;
    }

    public Container weight(Weight weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get weight
     *
     * @return weight
     **/
    @Schema(required = true, description = "")
    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Container container = (Container) o;
        return Objects.equals(this.containerType, container.containerType) &&
                Objects.equals(this.containerReferenceId, container.containerReferenceId) &&
                Objects.equals(this.value, container.value) &&
                Objects.equals(this.dimensions, container.dimensions) &&
                Objects.equals(this.items, container.items) &&
                Objects.equals(this.weight, container.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerType, containerReferenceId, value, dimensions, items, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Container {\n");
        sb.append("    containerType: ").append(toIndentedString(containerType)).append("\n");
        sb.append("    containerReferenceId: ").append(toIndentedString(containerReferenceId)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
     * The type of physical container being used. (always &#x27;PACKAGE&#x27;)
     */
    @JsonAdapter(ContainerTypeEnum.Adapter.class)
    public enum ContainerTypeEnum {
        PACKAGE("PACKAGE");
        private String value;

        ContainerTypeEnum(String value) {
            this.value = value;
        }

        public static ContainerTypeEnum fromValue(String text) {
            for (ContainerTypeEnum b : ContainerTypeEnum.values()) {
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

        public static class Adapter extends TypeAdapter<ContainerTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ContainerTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ContainerTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ContainerTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
