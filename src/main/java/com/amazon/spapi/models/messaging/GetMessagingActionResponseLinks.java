package com.amazon.spapi.models.messaging;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetMessagingActionResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetMessagingActionResponseLinks {
    @SerializedName("self")
    private LinkObject self = null;
    @SerializedName("schema")
    private LinkObject schema = null;

    public GetMessagingActionResponseLinks self(LinkObject self) {
        this.self = self;
        return this;
    }

    /**
     * Get self
     *
     * @return self
     **/
    @Schema(required = true, description = "")
    public LinkObject getSelf() {
        return self;
    }

    public void setSelf(LinkObject self) {
        this.self = self;
    }

    public GetMessagingActionResponseLinks schema(LinkObject schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get schema
     *
     * @return schema
     **/
    @Schema(required = true, description = "")
    public LinkObject getSchema() {
        return schema;
    }

    public void setSchema(LinkObject schema) {
        this.schema = schema;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetMessagingActionResponseLinks getMessagingActionResponseLinks = (GetMessagingActionResponseLinks) o;
        return Objects.equals(this.self, getMessagingActionResponseLinks.self) &&
                Objects.equals(this.schema, getMessagingActionResponseLinks.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMessagingActionResponseLinks {\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
