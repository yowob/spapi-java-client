package com.amazon.spapi.models.shipmentinvoicing;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The shipping address type.
 */
@JsonAdapter(AddressTypeEnum.Adapter.class)
public enum AddressTypeEnum {
    RESIDENTIAL("Residential"),
    COMMERCIAL("Commercial");
    private String value;

    AddressTypeEnum(String value) {
        this.value = value;
    }

    public static AddressTypeEnum fromValue(String text) {
        for (AddressTypeEnum b : AddressTypeEnum.values()) {
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

    public static class Adapter extends TypeAdapter<AddressTypeEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final AddressTypeEnum enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AddressTypeEnum read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return AddressTypeEnum.fromValue(String.valueOf(value));
        }
    }
}
