package com.amazon.spapi.models.productpricing;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Indicates the condition of the item. Possible values: New, Used, Collectible, Refurbished, Club.
 */
@JsonAdapter(ConditionType.Adapter.class)
public enum ConditionType {
    NEW("New"),
    USED("Used"),
    COLLECTIBLE("Collectible"),
    REFURBISHED("Refurbished"),
    CLUB("Club");
    private String value;

    ConditionType(String value) {
        this.value = value;
    }

    public static ConditionType fromValue(String text) {
        for (ConditionType b : ConditionType.values()) {
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

    public static class Adapter extends TypeAdapter<ConditionType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ConditionType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ConditionType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ConditionType.fromValue(String.valueOf(value));
        }
    }
}
