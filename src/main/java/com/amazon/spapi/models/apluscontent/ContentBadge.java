package com.amazon.spapi.models.apluscontent;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * A flag that provides additional information about an A+ Content document.
 */
@JsonAdapter(ContentBadge.Adapter.class)
public enum ContentBadge {
    BULK("BULK"),
    GENERATED("GENERATED"),
    LAUNCHPAD("LAUNCHPAD"),
    PREMIUM("PREMIUM"),
    STANDARD("STANDARD");
    private String value;

    ContentBadge(String value) {
        this.value = value;
    }

    public static ContentBadge fromValue(String text) {
        for (ContentBadge b : ContentBadge.values()) {
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

    public static class Adapter extends TypeAdapter<ContentBadge> {
        @Override
        public void write(final JsonWriter jsonWriter, final ContentBadge enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ContentBadge read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ContentBadge.fromValue(String.valueOf(value));
        }
    }
}
