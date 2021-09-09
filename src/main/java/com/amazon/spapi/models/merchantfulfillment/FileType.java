package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The file type for a label.
 */
@JsonAdapter(FileType.Adapter.class)
public enum FileType {
    APPLICATION_PDF("application/pdf"),
    APPLICATION_ZPL("application/zpl"),
    IMAGE_PNG("image/png");
    private String value;

    FileType(String value) {
        this.value = value;
    }

    public static FileType fromValue(String text) {
        for (FileType b : FileType.values()) {
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

    public static class Adapter extends TypeAdapter<FileType> {
        @Override
        public void write(final JsonWriter jsonWriter, final FileType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FileType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return FileType.fromValue(String.valueOf(value));
        }
    }
}
