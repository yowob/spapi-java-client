package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The delivery confirmation level.
 */
@JsonAdapter(DeliveryExperienceOption.Adapter.class)
public enum DeliveryExperienceOption {
    DELIVERYCONFIRMATIONWITHADULTSIGNATURE("DeliveryConfirmationWithAdultSignature"),
    DELIVERYCONFIRMATIONWITHSIGNATURE("DeliveryConfirmationWithSignature"),
    DELIVERYCONFIRMATIONWITHOUTSIGNATURE("DeliveryConfirmationWithoutSignature"),
    NOTRACKING("NoTracking"),
    NOPREFERENCE("NoPreference");
    private String value;

    DeliveryExperienceOption(String value) {
        this.value = value;
    }

    public static DeliveryExperienceOption fromValue(String text) {
        for (DeliveryExperienceOption b : DeliveryExperienceOption.values()) {
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

    public static class Adapter extends TypeAdapter<DeliveryExperienceOption> {
        @Override
        public void write(final JsonWriter jsonWriter, final DeliveryExperienceOption enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DeliveryExperienceOption read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return DeliveryExperienceOption.fromValue(String.valueOf(value));
        }
    }
}
