package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Additional location information.
 */
@JsonAdapter(AdditionalLocationInfo.Adapter.class)
public enum AdditionalLocationInfo {
    AS_INSTRUCTED("AS_INSTRUCTED"),
    CARPORT("CARPORT"),
    CUSTOMER_PICKUP("CUSTOMER_PICKUP"),
    DECK("DECK"),
    DOOR_PERSON("DOOR_PERSON"),
    FRONT_DESK("FRONT_DESK"),
    FRONT_DOOR("FRONT_DOOR"),
    GARAGE("GARAGE"),
    GUARD("GUARD"),
    MAIL_ROOM("MAIL_ROOM"),
    MAIL_SLOT("MAIL_SLOT"),
    MAILBOX("MAILBOX"),
    MC_BOY("MC_BOY"),
    MC_GIRL("MC_GIRL"),
    MC_MAN("MC_MAN"),
    MC_WOMAN("MC_WOMAN"),
    NEIGHBOR("NEIGHBOR"),
    OFFICE("OFFICE"),
    OUTBUILDING("OUTBUILDING"),
    PATIO("PATIO"),
    PORCH("PORCH"),
    REAR_DOOR("REAR_DOOR"),
    RECEPTIONIST("RECEPTIONIST"),
    RECEIVER("RECEIVER"),
    SECURE_LOCATION("SECURE_LOCATION"),
    SIDE_DOOR("SIDE_DOOR");
    private String value;

    AdditionalLocationInfo(String value) {
        this.value = value;
    }

    public static AdditionalLocationInfo fromValue(String text) {
        for (AdditionalLocationInfo b : AdditionalLocationInfo.values()) {
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

    public static class Adapter extends TypeAdapter<AdditionalLocationInfo> {
        @Override
        public void write(final JsonWriter jsonWriter, final AdditionalLocationInfo enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AdditionalLocationInfo read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return AdditionalLocationInfo.fromValue(String.valueOf(value));
        }
    }
}
