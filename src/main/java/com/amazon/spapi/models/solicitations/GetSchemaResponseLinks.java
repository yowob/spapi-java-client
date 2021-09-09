package com.amazon.spapi.models.solicitations;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetSchemaResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetSchemaResponseLinks {
    @SerializedName("self")
    private LinkObject self = null;

    public GetSchemaResponseLinks self(LinkObject self) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSchemaResponseLinks getSchemaResponseLinks = (GetSchemaResponseLinks) o;
        return Objects.equals(this.self, getSchemaResponseLinks.self);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSchemaResponseLinks {\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
