package com.amazon.spapi.models.fbasmallandlight;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The Small and Light enrollment status of the item.
 */
@JsonAdapter(SmallAndLightEnrollmentStatus.Adapter.class)
public enum SmallAndLightEnrollmentStatus {
    ENROLLED("ENROLLED"),
    NOT_ENROLLED("NOT_ENROLLED");
    private String value;

    SmallAndLightEnrollmentStatus(String value) {
        this.value = value;
    }

    public static SmallAndLightEnrollmentStatus fromValue(String text) {
        for (SmallAndLightEnrollmentStatus b : SmallAndLightEnrollmentStatus.values()) {
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

    public static class Adapter extends TypeAdapter<SmallAndLightEnrollmentStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final SmallAndLightEnrollmentStatus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SmallAndLightEnrollmentStatus read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return SmallAndLightEnrollmentStatus.fromValue(String.valueOf(value));
        }
    }
}
