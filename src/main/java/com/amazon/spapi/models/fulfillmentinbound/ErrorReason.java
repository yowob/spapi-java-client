package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The reason that the ASIN is invalid.
 */
@JsonAdapter(ErrorReason.Adapter.class)
public enum ErrorReason {
    DOESNOTEXIST("DoesNotExist"),
    INVALIDASIN("InvalidASIN");
    private String value;

    ErrorReason(String value) {
        this.value = value;
    }

    public static ErrorReason fromValue(String text) {
        for (ErrorReason b : ErrorReason.values()) {
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

    public static class Adapter extends TypeAdapter<ErrorReason> {
        @Override
        public void write(final JsonWriter jsonWriter, final ErrorReason enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ErrorReason read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ErrorReason.fromValue(String.valueOf(value));
        }
    }
}
