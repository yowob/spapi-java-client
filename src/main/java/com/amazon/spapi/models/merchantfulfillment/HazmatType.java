package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Hazardous materials options for a package. Consult the terms and conditions for each carrier for more information on hazardous materials.
 */
@JsonAdapter(HazmatType.Adapter.class)
public enum HazmatType {
    NONE("None"),
    LQHAZMAT("LQHazmat");
    private String value;

    HazmatType(String value) {
        this.value = value;
    }

    public static HazmatType fromValue(String text) {
        for (HazmatType b : HazmatType.values()) {
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

    public static class Adapter extends TypeAdapter<HazmatType> {
        @Override
        public void write(final JsonWriter jsonWriter, final HazmatType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public HazmatType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return HazmatType.fromValue(String.valueOf(value));
        }
    }
}
