package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The current delivery status of the package.
 */
@JsonAdapter(CurrentStatus.Adapter.class)
public enum CurrentStatus {
    IN_TRANSIT("IN_TRANSIT"),
    DELIVERED("DELIVERED"),
    RETURNING("RETURNING"),
    RETURNED("RETURNED"),
    UNDELIVERABLE("UNDELIVERABLE"),
    DELAYED("DELAYED"),
    AVAILABLE_FOR_PICKUP("AVAILABLE_FOR_PICKUP"),
    CUSTOMER_ACTION("CUSTOMER_ACTION");
    private String value;

    CurrentStatus(String value) {
        this.value = value;
    }

    public static CurrentStatus fromValue(String text) {
        for (CurrentStatus b : CurrentStatus.values()) {
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

    public static class Adapter extends TypeAdapter<CurrentStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final CurrentStatus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CurrentStatus read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return CurrentStatus.fromValue(String.valueOf(value));
        }
    }
}
