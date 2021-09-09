package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The shipment status.
 */
@JsonAdapter(ShipmentStatus.Adapter.class)
public enum ShipmentStatus {
    PURCHASED("Purchased"),
    REFUNDPENDING("RefundPending"),
    REFUNDREJECTED("RefundRejected"),
    REFUNDAPPLIED("RefundApplied");
    private String value;

    ShipmentStatus(String value) {
        this.value = value;
    }

    public static ShipmentStatus fromValue(String text) {
        for (ShipmentStatus b : ShipmentStatus.values()) {
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

    public static class Adapter extends TypeAdapter<ShipmentStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final ShipmentStatus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ShipmentStatus read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ShipmentStatus.fromValue(String.valueOf(value));
        }
    }
}
