package com.amazon.spapi.models.productfees;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * An optional enrollment program to return the estimated fees when the offer is fulfilled by Amazon (IsAmazonFulfilled is set to true).
 */
@JsonAdapter(OptionalFulfillmentProgram.Adapter.class)
public enum OptionalFulfillmentProgram {
    CORE("FBA_CORE"),
    SNL("FBA_SNL"),
    EFN("FBA_EFN");
    private String value;

    OptionalFulfillmentProgram(String value) {
        this.value = value;
    }

    public static OptionalFulfillmentProgram fromValue(String text) {
        for (OptionalFulfillmentProgram b : OptionalFulfillmentProgram.values()) {
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

    public static class Adapter extends TypeAdapter<OptionalFulfillmentProgram> {
        @Override
        public void write(final JsonWriter jsonWriter, final OptionalFulfillmentProgram enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public OptionalFulfillmentProgram read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return OptionalFulfillmentProgram.fromValue(String.valueOf(value));
        }
    }
}
