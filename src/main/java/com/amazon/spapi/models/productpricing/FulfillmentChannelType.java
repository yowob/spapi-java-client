package com.amazon.spapi.models.productpricing;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Indicates whether the item is fulfilled by Amazon or by the seller (merchant).
 */
@JsonAdapter(FulfillmentChannelType.Adapter.class)
public enum FulfillmentChannelType {
    AMAZON("Amazon"),
    MERCHANT("Merchant");
    private String value;

    FulfillmentChannelType(String value) {
        this.value = value;
    }

    public static FulfillmentChannelType fromValue(String text) {
        for (FulfillmentChannelType b : FulfillmentChannelType.values()) {
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

    public static class Adapter extends TypeAdapter<FulfillmentChannelType> {
        @Override
        public void write(final JsonWriter jsonWriter, final FulfillmentChannelType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FulfillmentChannelType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return FulfillmentChannelType.fromValue(String.valueOf(value));
        }
    }
}
