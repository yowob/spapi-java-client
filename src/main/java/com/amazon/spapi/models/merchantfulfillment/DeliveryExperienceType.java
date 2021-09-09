package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The delivery confirmation level.
 */
@JsonAdapter(DeliveryExperienceType.Adapter.class)
public enum DeliveryExperienceType {
    DELIVERYCONFIRMATIONWITHADULTSIGNATURE("DeliveryConfirmationWithAdultSignature"),
    DELIVERYCONFIRMATIONWITHSIGNATURE("DeliveryConfirmationWithSignature"),
    DELIVERYCONFIRMATIONWITHOUTSIGNATURE("DeliveryConfirmationWithoutSignature"),
    NOTRACKING("NoTracking");
    private String value;

    DeliveryExperienceType(String value) {
        this.value = value;
    }

    public static DeliveryExperienceType fromValue(String text) {
        for (DeliveryExperienceType b : DeliveryExperienceType.values()) {
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

    public static class Adapter extends TypeAdapter<DeliveryExperienceType> {
        @Override
        public void write(final JsonWriter jsonWriter, final DeliveryExperienceType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DeliveryExperienceType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return DeliveryExperienceType.fromValue(String.valueOf(value));
        }
    }
}
