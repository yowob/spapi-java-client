package com.amazon.spapi.models.apluscontent;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The type of A+ Content module.
 */
@JsonAdapter(ContentModuleType.Adapter.class)
public enum ContentModuleType {
    COMPANY_LOGO("STANDARD_COMPANY_LOGO"),
    COMPARISON_TABLE("STANDARD_COMPARISON_TABLE"),
    FOUR_IMAGE_TEXT("STANDARD_FOUR_IMAGE_TEXT"),
    FOUR_IMAGE_TEXT_QUADRANT("STANDARD_FOUR_IMAGE_TEXT_QUADRANT"),
    HEADER_IMAGE_TEXT("STANDARD_HEADER_IMAGE_TEXT"),
    IMAGE_SIDEBAR("STANDARD_IMAGE_SIDEBAR"),
    IMAGE_TEXT_OVERLAY("STANDARD_IMAGE_TEXT_OVERLAY"),
    MULTIPLE_IMAGE_TEXT("STANDARD_MULTIPLE_IMAGE_TEXT"),
    PRODUCT_DESCRIPTION("STANDARD_PRODUCT_DESCRIPTION"),
    SINGLE_IMAGE_HIGHLIGHTS("STANDARD_SINGLE_IMAGE_HIGHLIGHTS"),
    SINGLE_IMAGE_SPECS_DETAIL("STANDARD_SINGLE_IMAGE_SPECS_DETAIL"),
    SINGLE_SIDE_IMAGE("STANDARD_SINGLE_SIDE_IMAGE"),
    TECH_SPECS("STANDARD_TECH_SPECS"),
    TEXT("STANDARD_TEXT"),
    THREE_IMAGE_TEXT("STANDARD_THREE_IMAGE_TEXT");
    private String value;

    ContentModuleType(String value) {
        this.value = value;
    }

    public static ContentModuleType fromValue(String text) {
        for (ContentModuleType b : ContentModuleType.values()) {
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

    public static class Adapter extends TypeAdapter<ContentModuleType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ContentModuleType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ContentModuleType read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return ContentModuleType.fromValue(String.valueOf(value));
        }
    }
}
