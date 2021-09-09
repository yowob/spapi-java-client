package com.amazon.spapi.models.apluscontent;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The submission status of the content document.
 */
@JsonAdapter(ContentStatus.Adapter.class)
public enum ContentStatus {
    APPROVED("APPROVED"),
    DRAFT("DRAFT"),
    REJECTED("REJECTED"),
    SUBMITTED("SUBMITTED");
    private String value;

    ContentStatus(String value) {
        this.value = value;
    }

    public static ContentStatus fromValue(String text) {
        for (ContentStatus b : ContentStatus.values()) {
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

    public static class Adapter extends TypeAdapter<ContentStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final ContentStatus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ContentStatus read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ContentStatus.fromValue(String.valueOf(value));
        }
    }
}
