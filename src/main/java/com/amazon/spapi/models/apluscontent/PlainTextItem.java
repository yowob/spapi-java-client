package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Plain positional text, used in collections of brief labels and descriptors.
 */
@Schema(description = "Plain positional text, used in collections of brief labels and descriptors.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PlainTextItem {
    @SerializedName("position")
    private Integer position = null;
    @SerializedName("value")
    private String value = null;

    public PlainTextItem position(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * The rank or index of this text item within the collection. Different items cannot occupy the same position within a single collection.
     * minimum: 1
     * maximum: 100
     *
     * @return position
     **/
    @Schema(required = true, description = "The rank or index of this text item within the collection. Different items cannot occupy the same position within a single collection.")
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public PlainTextItem value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The actual plain text.
     *
     * @return value
     **/
    @Schema(required = true, description = "The actual plain text.")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlainTextItem plainTextItem = (PlainTextItem) o;
        return Objects.equals(this.position, plainTextItem.position) &&
                Objects.equals(this.value, plainTextItem.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlainTextItem {\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
}
