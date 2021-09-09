package com.amazon.spapi.models.apluscontent;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The type of rich text decorator.
 */
@JsonAdapter(DecoratorType.Adapter.class)
public enum DecoratorType {
    LIST_ITEM("LIST_ITEM"),
    LIST_ORDERED("LIST_ORDERED"),
    LIST_UNORDERED("LIST_UNORDERED"),
    STYLE_BOLD("STYLE_BOLD"),
    STYLE_ITALIC("STYLE_ITALIC"),
    STYLE_LINEBREAK("STYLE_LINEBREAK"),
    STYLE_PARAGRAPH("STYLE_PARAGRAPH"),
    STYLE_UNDERLINE("STYLE_UNDERLINE");
    private String value;

    DecoratorType(String value) {
        this.value = value;
    }

    public static DecoratorType fromValue(String text) {
        for (DecoratorType b : DecoratorType.values()) {
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

    public static class Adapter extends TypeAdapter<DecoratorType> {
        @Override
        public void write(final JsonWriter jsonWriter, final DecoratorType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DecoratorType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return DecoratorType.fromValue(String.valueOf(value));
        }
    }
}
