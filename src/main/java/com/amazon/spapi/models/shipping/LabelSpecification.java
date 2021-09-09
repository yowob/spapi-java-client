package com.amazon.spapi.models.shipping;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * The label specification info.
 */
@Schema(description = "The label specification info.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class LabelSpecification {
    @SerializedName("labelFormat")
    private LabelFormatEnum labelFormat = null;
    @SerializedName("labelStockSize")
    private LabelStockSizeEnum labelStockSize = null;

    public LabelSpecification labelFormat(LabelFormatEnum labelFormat) {
        this.labelFormat = labelFormat;
        return this;
    }

    /**
     * The format of the label. Enum of PNG only for now.
     *
     * @return labelFormat
     **/
    @Schema(required = true, description = "The format of the label. Enum of PNG only for now.")
    public LabelFormatEnum getLabelFormat() {
        return labelFormat;
    }

    public void setLabelFormat(LabelFormatEnum labelFormat) {
        this.labelFormat = labelFormat;
    }

    public LabelSpecification labelStockSize(LabelStockSizeEnum labelStockSize) {
        this.labelStockSize = labelStockSize;
        return this;
    }

    /**
     * The label stock size specification in length and height. Enum of 4x6 only for now.
     *
     * @return labelStockSize
     **/
    @Schema(required = true, description = "The label stock size specification in length and height. Enum of 4x6 only for now.")
    public LabelStockSizeEnum getLabelStockSize() {
        return labelStockSize;
    }

    public void setLabelStockSize(LabelStockSizeEnum labelStockSize) {
        this.labelStockSize = labelStockSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelSpecification labelSpecification = (LabelSpecification) o;
        return Objects.equals(this.labelFormat, labelSpecification.labelFormat) &&
                Objects.equals(this.labelStockSize, labelSpecification.labelStockSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelFormat, labelStockSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelSpecification {\n");
        sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
        sb.append("    labelStockSize: ").append(toIndentedString(labelStockSize)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * The format of the label. Enum of PNG only for now.
     */
    @JsonAdapter(LabelFormatEnum.Adapter.class)
    public enum LabelFormatEnum {
        PNG("PNG");
        private String value;

        LabelFormatEnum(String value) {
            this.value = value;
        }

        public static LabelFormatEnum fromValue(String text) {
            for (LabelFormatEnum b : LabelFormatEnum.values()) {
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

        public static class Adapter extends TypeAdapter<LabelFormatEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final LabelFormatEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LabelFormatEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return LabelFormatEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * The label stock size specification in length and height. Enum of 4x6 only for now.
     */
    @JsonAdapter(LabelStockSizeEnum.Adapter.class)
    public enum LabelStockSizeEnum {
        _4X6("4x6");
        private String value;

        LabelStockSizeEnum(String value) {
            this.value = value;
        }

        public static LabelStockSizeEnum fromValue(String text) {
            for (LabelStockSizeEnum b : LabelStockSizeEnum.values()) {
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

        public static class Adapter extends TypeAdapter<LabelStockSizeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final LabelStockSizeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LabelStockSizeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return LabelStockSizeEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
