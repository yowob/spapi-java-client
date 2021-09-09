package com.amazon.spapi.models.fbasmallandlight;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The Small and Light eligibility status of the item.
 */
@JsonAdapter(SmallAndLightEligibilityStatus.Adapter.class)
public enum SmallAndLightEligibilityStatus {
    ELIGIBLE("ELIGIBLE"),
    NOT_ELIGIBLE("NOT_ELIGIBLE");
    private String value;

    SmallAndLightEligibilityStatus(String value) {
        this.value = value;
    }

    public static SmallAndLightEligibilityStatus fromValue(String text) {
        for (SmallAndLightEligibilityStatus b : SmallAndLightEligibilityStatus.values()) {
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

    public static class Adapter extends TypeAdapter<SmallAndLightEligibilityStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final SmallAndLightEligibilityStatus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SmallAndLightEligibilityStatus read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return SmallAndLightEligibilityStatus.fromValue(String.valueOf(value));
        }
    }
}
