package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Indicates if the return item has been processed by a fulfillment center.
 */
@JsonAdapter(FulfillmentReturnItemStatus.Adapter.class)
public enum FulfillmentReturnItemStatus {
    NEW("New"),
    PROCESSED("Processed");
    private String value;

    FulfillmentReturnItemStatus(String value) {
        this.value = value;
    }

    public static FulfillmentReturnItemStatus fromValue(String text) {
        for (FulfillmentReturnItemStatus b : FulfillmentReturnItemStatus.values()) {
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

    public static class Adapter extends TypeAdapter<FulfillmentReturnItemStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final FulfillmentReturnItemStatus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FulfillmentReturnItemStatus read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return FulfillmentReturnItemStatus.fromValue(String.valueOf(value));
        }
    }
}
