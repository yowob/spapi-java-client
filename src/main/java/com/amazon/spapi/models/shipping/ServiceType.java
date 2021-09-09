package com.amazon.spapi.models.shipping;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The type of shipping service that will be used for the service offering.
 */
@JsonAdapter(ServiceType.Adapter.class)
public enum ServiceType {
    GROUND("Amazon Shipping Ground"),
    STANDARD("Amazon Shipping Standard"),
    PREMIUM("Amazon Shipping Premium");
    private String value;

    ServiceType(String value) {
        this.value = value;
    }

    public static ServiceType fromValue(String text) {
        for (ServiceType b : ServiceType.values()) {
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

    public static class Adapter extends TypeAdapter<ServiceType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ServiceType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ServiceType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ServiceType.fromValue(String.valueOf(value));
        }
    }
}
