package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The label format.
 */
@JsonAdapter(LabelFormat.Adapter.class)
public enum LabelFormat {
    PDF("PDF"),
    PNG("PNG"),
    ZPL203("ZPL203"),
    ZPL300("ZPL300"),
    SHIPPINGSERVICEDEFAULT("ShippingServiceDefault");
    private String value;

    LabelFormat(String value) {
        this.value = value;
    }

    public static LabelFormat fromValue(String text) {
        for (LabelFormat b : LabelFormat.values()) {
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

    public static class Adapter extends TypeAdapter<LabelFormat> {
        @Override
        public void write(final JsonWriter jsonWriter, final LabelFormat enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public LabelFormat read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return LabelFormat.fromValue(String.valueOf(value));
        }
    }
}
