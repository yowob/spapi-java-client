package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The FulfillmentPolicy value specified when you submitted the createFulfillmentOrder operation.
 */
@JsonAdapter(FulfillmentPolicy.Adapter.class)
public enum FulfillmentPolicy {
    FILLORKILL("FillOrKill"),
    FILLALL("FillAll"),
    FILLALLAVAILABLE("FillAllAvailable");
    private String value;

    FulfillmentPolicy(String value) {
        this.value = value;
    }

    public static FulfillmentPolicy fromValue(String text) {
        for (FulfillmentPolicy b : FulfillmentPolicy.values()) {
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

    public static class Adapter extends TypeAdapter<FulfillmentPolicy> {
        @Override
        public void write(final JsonWriter jsonWriter, final FulfillmentPolicy enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FulfillmentPolicy read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return FulfillmentPolicy.fromValue(String.valueOf(value));
        }
    }
}
