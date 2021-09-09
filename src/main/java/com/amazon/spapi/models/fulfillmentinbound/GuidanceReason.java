package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * A reason for the current inbound guidance for an item.
 */
@JsonAdapter(GuidanceReason.Adapter.class)
public enum GuidanceReason {
    SLOWMOVINGASIN("SlowMovingASIN"),
    NOAPPLICABLEGUIDANCE("NoApplicableGuidance");
    private String value;

    GuidanceReason(String value) {
        this.value = value;
    }

    public static GuidanceReason fromValue(String text) {
        for (GuidanceReason b : GuidanceReason.values()) {
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

    public static class Adapter extends TypeAdapter<GuidanceReason> {
        @Override
        public void write(final JsonWriter jsonWriter, final GuidanceReason enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public GuidanceReason read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return GuidanceReason.fromValue(String.valueOf(value));
        }
    }
}
