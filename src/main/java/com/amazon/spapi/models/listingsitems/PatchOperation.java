package com.amazon.spapi.models.listingsitems;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Individual JSON Patch operation for an HTTP PATCH request.
 */
@Schema(description = "Individual JSON Patch operation for an HTTP PATCH request.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PatchOperation {
    @SerializedName("op")
    private OpEnum op = null;
    @SerializedName("path")
    private String path = null;
    @SerializedName("value")
    private List<Object> value = null;

    public PatchOperation op(OpEnum op) {
        this.op = op;
        return this;
    }

    /**
     * Type of JSON Patch operation. Supported JSON Patch operations include add, replace, and delete. See &lt;https://tools.ietf.org/html/rfc6902&gt;.
     *
     * @return op
     **/
    @Schema(required = true, description = "Type of JSON Patch operation. Supported JSON Patch operations include add, replace, and delete. See <https://tools.ietf.org/html/rfc6902>.")
    public OpEnum getOp() {
        return op;
    }

    public void setOp(OpEnum op) {
        this.op = op;
    }

    public PatchOperation path(String path) {
        this.path = path;
        return this;
    }

    /**
     * JSON Pointer path of the element to patch. See &lt;https://tools.ietf.org/html/rfc6902&gt;.
     *
     * @return path
     **/
    @Schema(required = true, description = "JSON Pointer path of the element to patch. See <https://tools.ietf.org/html/rfc6902>.")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PatchOperation value(List<Object> value) {
        this.value = value;
        return this;
    }

    public PatchOperation addValueItem(Object valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<Object>();
        }
        this.value.add(valueItem);
        return this;
    }

    /**
     * JSON value to add, replace, or delete.
     *
     * @return value
     **/
    @Schema(description = "JSON value to add, replace, or delete.")
    public List<Object> getValue() {
        return value;
    }

    public void setValue(List<Object> value) {
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
        PatchOperation patchOperation = (PatchOperation) o;
        return Objects.equals(this.op, patchOperation.op) &&
                Objects.equals(this.path, patchOperation.path) &&
                Objects.equals(this.value, patchOperation.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(op, path, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatchOperation {\n");
        sb.append("    op: ").append(toIndentedString(op)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

    /**
     * Type of JSON Patch operation. Supported JSON Patch operations include add, replace, and delete. See &lt;https://tools.ietf.org/html/rfc6902&gt;.
     */
    @JsonAdapter(OpEnum.Adapter.class)
    public enum OpEnum {
        ADD("add"),
        REPLACE("replace"),
        DELETE("delete");
        private String value;

        OpEnum(String value) {
            this.value = value;
        }

        public static OpEnum fromValue(String text) {
            for (OpEnum b : OpEnum.values()) {
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

        public static class Adapter extends TypeAdapter<OpEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OpEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OpEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return OpEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
