package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Preparation instructions for shipping an item to Amazon&#x27;s fulfillment network. For more information about preparing items for shipment to Amazon&#x27;s fulfillment network, see the Seller Central Help for your marketplace.
 */
@JsonAdapter(PrepInstruction.Adapter.class)
public enum PrepInstruction {
    POLYBAGGING("Polybagging"),
    BUBBLEWRAPPING("BubbleWrapping"),
    TAPING("Taping"),
    BLACKSHRINKWRAPPING("BlackShrinkWrapping"),
    LABELING("Labeling"),
    HANGGARMENT("HangGarment");
    private String value;

    PrepInstruction(String value) {
        this.value = value;
    }

    public static PrepInstruction fromValue(String text) {
        for (PrepInstruction b : PrepInstruction.values()) {
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

    public static class Adapter extends TypeAdapter<PrepInstruction> {
        @Override
        public void write(final JsonWriter jsonWriter, final PrepInstruction enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PrepInstruction read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return PrepInstruction.fromValue(String.valueOf(value));
        }
    }
}
