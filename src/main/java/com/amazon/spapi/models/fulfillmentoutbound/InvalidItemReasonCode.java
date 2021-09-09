package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * A code for why the item is invalid for return.
 */
@JsonAdapter(InvalidItemReasonCode.Adapter.class)
public enum InvalidItemReasonCode {
    INVALIDVALUES("InvalidValues"),
    DUPLICATEREQUEST("DuplicateRequest"),
    NOCOMPLETEDSHIPITEMS("NoCompletedShipItems"),
    NORETURNABLEQUANTITY("NoReturnableQuantity");
    private String value;

    InvalidItemReasonCode(String value) {
        this.value = value;
    }

    public static InvalidItemReasonCode fromValue(String text) {
        for (InvalidItemReasonCode b : InvalidItemReasonCode.values()) {
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

    public static class Adapter extends TypeAdapter<InvalidItemReasonCode> {
        @Override
        public void write(final JsonWriter jsonWriter, final InvalidItemReasonCode enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public InvalidItemReasonCode read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return InvalidItemReasonCode.fromValue(String.valueOf(value));
        }
    }
}
