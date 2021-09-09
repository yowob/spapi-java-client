package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The shipping method used for the fulfillment order.
 */
@JsonAdapter(ShippingSpeedCategory.Adapter.class)
public enum ShippingSpeedCategory {
    STANDARD("Standard"),
    EXPEDITED("Expedited"),
    PRIORITY("Priority"),
    SCHEDULEDDELIVERY("ScheduledDelivery");
    private String value;

    ShippingSpeedCategory(String value) {
        this.value = value;
    }

    public static ShippingSpeedCategory fromValue(String text) {
        for (ShippingSpeedCategory b : ShippingSpeedCategory.values()) {
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

    public static class Adapter extends TypeAdapter<ShippingSpeedCategory> {
        @Override
        public void write(final JsonWriter jsonWriter, final ShippingSpeedCategory enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ShippingSpeedCategory read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ShippingSpeedCategory.fromValue(String.valueOf(value));
        }
    }
}
