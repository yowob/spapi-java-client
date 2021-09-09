package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The type of label preparation that is required for the inbound shipment.
 */
@JsonAdapter(LabelPrepType.Adapter.class)
public enum LabelPrepType {
    NO_LABEL("NO_LABEL"),
    SELLER_LABEL("SELLER_LABEL"),
    AMAZON_LABEL("AMAZON_LABEL");
    private String value;

    LabelPrepType(String value) {
        this.value = value;
    }

    public static LabelPrepType fromValue(String text) {
        for (LabelPrepType b : LabelPrepType.values()) {
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

    public static class Adapter extends TypeAdapter<LabelPrepType> {
        @Override
        public void write(final JsonWriter jsonWriter, final LabelPrepType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public LabelPrepType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return LabelPrepType.fromValue(String.valueOf(value));
        }
    }
}
