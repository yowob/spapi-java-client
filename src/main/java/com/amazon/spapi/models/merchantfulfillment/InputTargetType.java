package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Indicates whether the additional seller input is at the item or shipment level.
 */
@JsonAdapter(InputTargetType.Adapter.class)
public enum InputTargetType {
    SHIPMENT_LEVEL("SHIPMENT_LEVEL"),
    ITEM_LEVEL("ITEM_LEVEL");
    private String value;

    InputTargetType(String value) {
        this.value = value;
    }

    public static InputTargetType fromValue(String text) {
        for (InputTargetType b : InputTargetType.values()) {
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

    public static class Adapter extends TypeAdapter<InputTargetType> {
        @Override
        public void write(final JsonWriter jsonWriter, final InputTargetType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public InputTargetType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return InputTargetType.fromValue(String.valueOf(value));
        }
    }
}
