package com.amazon.spapi.models.productpricing;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Gets or Sets OfferCustomerType
 */
@JsonAdapter(OfferCustomerType.Adapter.class)
public enum OfferCustomerType {
    B2C("B2C"),
    B2B("B2B");
    private String value;

    OfferCustomerType(String value) {
        this.value = value;
    }

    public static OfferCustomerType fromValue(String text) {
        for (OfferCustomerType b : OfferCustomerType.values()) {
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

    public static class Adapter extends TypeAdapter<OfferCustomerType> {
        @Override
        public void write(final JsonWriter jsonWriter, final OfferCustomerType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public OfferCustomerType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return OfferCustomerType.fromValue(String.valueOf(value));
        }
    }
}
