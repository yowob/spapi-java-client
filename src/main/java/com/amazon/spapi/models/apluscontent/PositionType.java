package com.amazon.spapi.models.apluscontent;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The relative positioning of content.
 */
@JsonAdapter(PositionType.Adapter.class)
public enum PositionType {
    LEFT("LEFT"),
    RIGHT("RIGHT");
    private String value;

    PositionType(String value) {
        this.value = value;
    }

    public static PositionType fromValue(String text) {
        for (PositionType b : PositionType.values()) {
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

    public static class Adapter extends TypeAdapter<PositionType> {
        @Override
        public void write(final JsonWriter jsonWriter, final PositionType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PositionType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return PositionType.fromValue(String.valueOf(value));
        }
    }
}
