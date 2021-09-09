package com.amazon.spapi.models.productpricing;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Gets or Sets QuantityDiscountType
 */
@JsonAdapter(QuantityDiscountType.Adapter.class)
public enum QuantityDiscountType {
    DISCOUNT("QUANTITY_DISCOUNT");
    private String value;

    QuantityDiscountType(String value) {
        this.value = value;
    }

    public static QuantityDiscountType fromValue(String text) {
        for (QuantityDiscountType b : QuantityDiscountType.values()) {
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

    public static class Adapter extends TypeAdapter<QuantityDiscountType> {
        @Override
        public void write(final JsonWriter jsonWriter, final QuantityDiscountType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public QuantityDiscountType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return QuantityDiscountType.fromValue(String.valueOf(value));
        }
    }
}
