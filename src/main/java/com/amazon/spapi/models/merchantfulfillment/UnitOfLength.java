package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The unit of length.
 */
@JsonAdapter(UnitOfLength.Adapter.class)
public enum UnitOfLength {
    INCHES("inches"),
    CENTIMETERS("centimeters");
    private String value;

    UnitOfLength(String value) {
        this.value = value;
    }

    public static UnitOfLength fromValue(String text) {
        for (UnitOfLength b : UnitOfLength.values()) {
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

    public static class Adapter extends TypeAdapter<UnitOfLength> {
        @Override
        public void write(final JsonWriter jsonWriter, final UnitOfLength enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UnitOfLength read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return UnitOfLength.fromValue(String.valueOf(value));
        }
    }
}
