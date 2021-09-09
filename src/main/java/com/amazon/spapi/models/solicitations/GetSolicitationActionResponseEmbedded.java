package com.amazon.spapi.models.solicitations;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetSolicitationActionResponseEmbedded
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetSolicitationActionResponseEmbedded {
    @SerializedName("schema")
    private GetSchemaResponse schema = null;

    public GetSolicitationActionResponseEmbedded schema(GetSchemaResponse schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get schema
     *
     * @return schema
     **/
    @Schema(description = "")
    public GetSchemaResponse getSchema() {
        return schema;
    }

    public void setSchema(GetSchemaResponse schema) {
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
        GetSolicitationActionResponseEmbedded getSolicitationActionResponseEmbedded = (GetSolicitationActionResponseEmbedded) o;
        return Objects.equals(this.schema, getSolicitationActionResponseEmbedded.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSolicitationActionResponseEmbedded {\n");
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
