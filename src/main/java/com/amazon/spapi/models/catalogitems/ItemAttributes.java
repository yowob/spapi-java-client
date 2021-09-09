package com.amazon.spapi.models.catalogitems;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A JSON object that contains structured item attribute data keyed by attribute name. Catalog item attributes are available only to brand owners and conform to the related product type definitions available in the Selling Partner API for Product Type Definitions.
 */
@Schema(description = "A JSON object that contains structured item attribute data keyed by attribute name. Catalog item attributes are available only to brand owners and conform to the related product type definitions available in the Selling Partner API for Product Type Definitions.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemAttributes {
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemAttributes {\n");
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
