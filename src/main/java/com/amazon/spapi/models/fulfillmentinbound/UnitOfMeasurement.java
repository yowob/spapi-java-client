package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Indicates the unit of measurement.
 */
@JsonAdapter(UnitOfMeasurement.Adapter.class)
public enum UnitOfMeasurement {
    INCHES("inches"),
    CENTIMETERS("centimeters");
    private String value;

    UnitOfMeasurement(String value) {
        this.value = value;
    }

    public static UnitOfMeasurement fromValue(String text) {
        for (UnitOfMeasurement b : UnitOfMeasurement.values()) {
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

    public static class Adapter extends TypeAdapter<UnitOfMeasurement> {
        @Override
        public void write(final JsonWriter jsonWriter, final UnitOfMeasurement enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UnitOfMeasurement read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return UnitOfMeasurement.fromValue(String.valueOf(value));
        }
    }
}
