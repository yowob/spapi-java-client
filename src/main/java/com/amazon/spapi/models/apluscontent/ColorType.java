package com.amazon.spapi.models.apluscontent;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The relative color scheme of content.
 */
@JsonAdapter(ColorType.Adapter.class)
public enum ColorType {
    DARK("DARK"),
    LIGHT("LIGHT");
    private String value;

    ColorType(String value) {
        this.value = value;
    }

    public static ColorType fromValue(String text) {
        for (ColorType b : ColorType.values()) {
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

    public static class Adapter extends TypeAdapter<ColorType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ColorType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ColorType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ColorType.fromValue(String.valueOf(value));
        }
    }
}
