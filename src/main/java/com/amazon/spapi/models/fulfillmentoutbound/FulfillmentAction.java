package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Specifies whether the fulfillment order should ship now or have an order hold put on it.
 */
@JsonAdapter(FulfillmentAction.Adapter.class)
public enum FulfillmentAction {
    SHIP("Ship"),
    HOLD("Hold");
    private String value;

    FulfillmentAction(String value) {
        this.value = value;
    }

    public static FulfillmentAction fromValue(String text) {
        for (FulfillmentAction b : FulfillmentAction.values()) {
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

    public static class Adapter extends TypeAdapter<FulfillmentAction> {
        @Override
        public void write(final JsonWriter jsonWriter, final FulfillmentAction enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FulfillmentAction read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return FulfillmentAction.fromValue(String.valueOf(value));
        }
    }
}
