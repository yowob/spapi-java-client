package com.amazon.spapi.models.fbainventory;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * The misplaced or warehouse damaged inventory that is actively being confirmed at our fulfillment centers.
 */
@Schema(description = "The misplaced or warehouse damaged inventory that is actively being confirmed at our fulfillment centers.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ResearchingQuantityEntry {
    @SerializedName("name")
    private NameEnum name = null;
    @SerializedName("quantity")
    private Integer quantity = null;

    public ResearchingQuantityEntry name(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * The duration of the research.
     *
     * @return name
     **/
    @Schema(required = true, description = "The duration of the research.")
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public ResearchingQuantityEntry quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The number of units.
     *
     * @return quantity
     **/
    @Schema(required = true, description = "The number of units.")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResearchingQuantityEntry researchingQuantityEntry = (ResearchingQuantityEntry) o;
        return Objects.equals(this.name, researchingQuantityEntry.name) &&
                Objects.equals(this.quantity, researchingQuantityEntry.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResearchingQuantityEntry {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
     * The duration of the research.
     */
    @JsonAdapter(NameEnum.Adapter.class)
    public enum NameEnum {
        RESEARCHINGQUANTITYINSHORTTERM("researchingQuantityInShortTerm"),
        RESEARCHINGQUANTITYINMIDTERM("researchingQuantityInMidTerm"),
        RESEARCHINGQUANTITYINLONGTERM("researchingQuantityInLongTerm");
        private String value;

        NameEnum(String value) {
            this.value = value;
        }

        public static NameEnum fromValue(String text) {
            for (NameEnum b : NameEnum.values()) {
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

        public static class Adapter extends TypeAdapter<NameEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public NameEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return NameEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
