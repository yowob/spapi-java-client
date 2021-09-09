package com.amazon.spapi.models.apluscontent;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The A+ Content document type.
 */
@JsonAdapter(ContentType.Adapter.class)
public enum ContentType {
    EBC("EBC"),
    EMC("EMC");
    private String value;

    ContentType(String value) {
        this.value = value;
    }

    public static ContentType fromValue(String text) {
        for (ContentType b : ContentType.values()) {
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

    public static class Adapter extends TypeAdapter<ContentType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ContentType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ContentType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ContentType.fromValue(String.valueOf(value));
        }
    }
}
