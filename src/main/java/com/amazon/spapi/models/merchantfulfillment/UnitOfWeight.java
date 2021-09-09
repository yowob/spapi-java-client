package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The unit of weight.
 */
@JsonAdapter(UnitOfWeight.Adapter.class)
public enum UnitOfWeight {
    OZ("oz"),
    G("g");
    private String value;

    UnitOfWeight(String value) {
        this.value = value;
    }

    public static UnitOfWeight fromValue(String text) {
        for (UnitOfWeight b : UnitOfWeight.values()) {
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

    public static class Adapter extends TypeAdapter<UnitOfWeight> {
        @Override
        public void write(final JsonWriter jsonWriter, final UnitOfWeight enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UnitOfWeight read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return UnitOfWeight.fromValue(String.valueOf(value));
        }
    }
}
