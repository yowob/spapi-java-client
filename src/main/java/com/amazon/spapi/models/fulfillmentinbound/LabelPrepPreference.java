package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The preference for label preparation for an inbound shipment.
 */
@JsonAdapter(LabelPrepPreference.Adapter.class)
public enum LabelPrepPreference {
    SELLER_LABEL("SELLER_LABEL"),
    AMAZON_LABEL_ONLY("AMAZON_LABEL_ONLY"),
    AMAZON_LABEL_PREFERRED("AMAZON_LABEL_PREFERRED");
    private String value;

    LabelPrepPreference(String value) {
        this.value = value;
    }

    public static LabelPrepPreference fromValue(String text) {
        for (LabelPrepPreference b : LabelPrepPreference.values()) {
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

    public static class Adapter extends TypeAdapter<LabelPrepPreference> {
        @Override
        public void write(final JsonWriter jsonWriter, final LabelPrepPreference enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public LabelPrepPreference read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return LabelPrepPreference.fromValue(String.valueOf(value));
        }
    }
}
