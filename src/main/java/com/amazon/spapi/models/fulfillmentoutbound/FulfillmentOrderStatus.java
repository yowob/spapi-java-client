package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The current status of the fulfillment order.
 */
@JsonAdapter(FulfillmentOrderStatus.Adapter.class)
public enum FulfillmentOrderStatus {
    NEW("New"),
    RECEIVED("Received"),
    PLANNING("Planning"),
    PROCESSING("Processing"),
    CANCELLED("Cancelled"),
    COMPLETE("Complete"),
    COMPLETEPARTIALLED("CompletePartialled"),
    UNFULFILLABLE("Unfulfillable"),
    INVALID("Invalid");
    private String value;

    FulfillmentOrderStatus(String value) {
        this.value = value;
    }

    public static FulfillmentOrderStatus fromValue(String text) {
        for (FulfillmentOrderStatus b : FulfillmentOrderStatus.values()) {
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

    public static class Adapter extends TypeAdapter<FulfillmentOrderStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final FulfillmentOrderStatus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FulfillmentOrderStatus read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return FulfillmentOrderStatus.fromValue(String.valueOf(value));
        }
    }
}
