package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The event code for the delivery event.
 */
@JsonAdapter(EventCode.Adapter.class)
public enum EventCode {
    _101("EVENT_101"),
    _102("EVENT_102"),
    _201("EVENT_201"),
    _202("EVENT_202"),
    _203("EVENT_203"),
    _204("EVENT_204"),
    _205("EVENT_205"),
    _206("EVENT_206"),
    _301("EVENT_301"),
    _302("EVENT_302"),
    _304("EVENT_304"),
    _306("EVENT_306"),
    _307("EVENT_307"),
    _308("EVENT_308"),
    _309("EVENT_309"),
    _401("EVENT_401"),
    _402("EVENT_402"),
    _403("EVENT_403"),
    _404("EVENT_404"),
    _405("EVENT_405"),
    _406("EVENT_406"),
    _407("EVENT_407"),
    _408("EVENT_408"),
    _409("EVENT_409"),
    _411("EVENT_411"),
    _412("EVENT_412"),
    _413("EVENT_413"),
    _414("EVENT_414"),
    _415("EVENT_415"),
    _416("EVENT_416"),
    _417("EVENT_417"),
    _418("EVENT_418"),
    _419("EVENT_419");
    private String value;

    EventCode(String value) {
        this.value = value;
    }

    public static EventCode fromValue(String text) {
        for (EventCode b : EventCode.values()) {
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

    public static class Adapter extends TypeAdapter<EventCode> {
        @Override
        public void write(final JsonWriter jsonWriter, final EventCode enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EventCode read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return EventCode.fromValue(String.valueOf(value));
        }
    }
}
