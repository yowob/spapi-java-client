package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The type of standard identifier to print on the label.
 */
@JsonAdapter(StandardIdForLabel.Adapter.class)
public enum StandardIdForLabel {
    AMAZONORDERID("AmazonOrderId");
    private String value;

    StandardIdForLabel(String value) {
        this.value = value;
    }

    public static StandardIdForLabel fromValue(String text) {
        for (StandardIdForLabel b : StandardIdForLabel.values()) {
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

    public static class Adapter extends TypeAdapter<StandardIdForLabel> {
        @Override
        public void write(final JsonWriter jsonWriter, final StandardIdForLabel enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public StandardIdForLabel read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return StandardIdForLabel.fromValue(String.valueOf(value));
        }
    }
}
