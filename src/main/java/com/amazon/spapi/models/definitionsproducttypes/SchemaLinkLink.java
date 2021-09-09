package com.amazon.spapi.models.definitionsproducttypes;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * Link to retrieve the schema.
 */
@Schema(description = "Link to retrieve the schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SchemaLinkLink {
    @SerializedName("resource")
    private String resource = null;
    @SerializedName("verb")
    private VerbEnum verb = null;

    public SchemaLinkLink resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * URI resource for the link.
     *
     * @return resource
     **/
    @Schema(required = true, description = "URI resource for the link.")
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public SchemaLinkLink verb(VerbEnum verb) {
        this.verb = verb;
        return this;
    }

    /**
     * HTTP method for the link operation.
     *
     * @return verb
     **/
    @Schema(required = true, description = "HTTP method for the link operation.")
    public VerbEnum getVerb() {
        return verb;
    }

    public void setVerb(VerbEnum verb) {
        this.verb = verb;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SchemaLinkLink schemaLinkLink = (SchemaLinkLink) o;
        return Objects.equals(this.resource, schemaLinkLink.resource) &&
                Objects.equals(this.verb, schemaLinkLink.verb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, verb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchemaLinkLink {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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
     * HTTP method for the link operation.
     */
    @JsonAdapter(VerbEnum.Adapter.class)
    public enum VerbEnum {
        GET("GET");
        private String value;

        VerbEnum(String value) {
            this.value = value;
        }

        public static VerbEnum fromValue(String text) {
            for (VerbEnum b : VerbEnum.values()) {
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

        public static class Adapter extends TypeAdapter<VerbEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final VerbEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public VerbEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return VerbEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
