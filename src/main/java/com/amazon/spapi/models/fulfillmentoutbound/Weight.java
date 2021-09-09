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
 * The weight.
 */
@Schema(description = "The weight.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Weight {
    @SerializedName("unit")
    private UnitEnum unit = null;
    @SerializedName("value")
    private String value = null;

    public Weight unit(UnitEnum unit) {
        this.unit = unit;
        return this;
    }

    /**
     * The unit of weight.
     *
     * @return unit
     **/
    @Schema(required = true, description = "The unit of weight.")
    public UnitEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    public Weight value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The weight value.
     *
     * @return value
     **/
    @Schema(required = true, description = "The weight value.")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Weight weight = (Weight) o;
        return Objects.equals(this.unit, weight.unit) &&
                Objects.equals(this.value, weight.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Weight {\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
     * The unit of weight.
     */
    @JsonAdapter(UnitEnum.Adapter.class)
    public enum UnitEnum {
        KG("KG"),
        LB("LB");
        private String value;

        UnitEnum(String value) {
            this.value = value;
        }

        public static UnitEnum fromValue(String text) {
            for (UnitEnum b : UnitEnum.values()) {
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

        public static class Adapter extends TypeAdapter<UnitEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public UnitEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return UnitEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
