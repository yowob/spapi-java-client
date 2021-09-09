package com.amazon.spapi.models.shipmentinvoicing;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The shipment invoice status.
 */
@JsonAdapter(ShipmentInvoiceStatus.Adapter.class)
public enum ShipmentInvoiceStatus {
    PROCESSING("Processing"),
    ACCEPTED("Accepted"),
    ERRORED("Errored"),
    NOTFOUND("NotFound");
    private String value;

    ShipmentInvoiceStatus(String value) {
        this.value = value;
    }

    public static ShipmentInvoiceStatus fromValue(String text) {
        for (ShipmentInvoiceStatus b : ShipmentInvoiceStatus.values()) {
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

    public static class Adapter extends TypeAdapter<ShipmentInvoiceStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final ShipmentInvoiceStatus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ShipmentInvoiceStatus read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ShipmentInvoiceStatus.fromValue(String.valueOf(value));
        }
    }
}
