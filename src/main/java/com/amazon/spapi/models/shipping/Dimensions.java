package com.amazon.spapi.models.shipping;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * A set of measurements for a three-dimensional object.
 */
@Schema(description = "A set of measurements for a three-dimensional object.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Dimensions {
    @SerializedName("length")
    private BigDecimal length = null;
    @SerializedName("width")
    private BigDecimal width = null;
    @SerializedName("height")
    private BigDecimal height = null;
    @SerializedName("unit")
    private UnitEnum unit = null;

    public Dimensions length(BigDecimal length) {
        this.length = length;
        return this;
    }

    /**
     * The length of the container.
     *
     * @return length
     **/
    @Schema(required = true, description = "The length of the container.")
    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public Dimensions width(BigDecimal width) {
        this.width = width;
        return this;
    }

    /**
     * The width of the container.
     *
     * @return width
     **/
    @Schema(required = true, description = "The width of the container.")
    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public Dimensions height(BigDecimal height) {
        this.height = height;
        return this;
    }

    /**
     * The height of the container.
     *
     * @return height
     **/
    @Schema(required = true, description = "The height of the container.")
    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public Dimensions unit(UnitEnum unit) {
        this.unit = unit;
        return this;
    }

    /**
     * The unit of these measurements.
     *
     * @return unit
     **/
    @Schema(required = true, description = "The unit of these measurements.")
    public UnitEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dimensions dimensions = (Dimensions) o;
        return Objects.equals(this.length, dimensions.length) &&
                Objects.equals(this.width, dimensions.width) &&
                Objects.equals(this.height, dimensions.height) &&
                Objects.equals(this.unit, dimensions.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, height, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dimensions {\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
     * The unit of these measurements.
     */
    @JsonAdapter(UnitEnum.Adapter.class)
    public enum UnitEnum {
        IN("IN"),
        CM("CM");
        private String value;

        UnitEnum(String value) {
            this.value = value;
        }

        public static UnitEnum fromValue(String text) {
            for (UnitEnum b : UnitEnum.values()) {
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

        public static class Adapter extends TypeAdapter<UnitEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public UnitEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return UnitEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
