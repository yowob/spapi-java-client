package com.amazon.spapi.models.definitionsproducttypes;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * SchemaLink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SchemaLink {
    @SerializedName("link")
    private SchemaLinkLink link = null;
    @SerializedName("checksum")
    private String checksum = null;

    public SchemaLink link(SchemaLinkLink link) {
        this.link = link;
        return this;
    }

    /**
     * Get link
     *
     * @return link
     **/
    @Schema(required = true, description = "")
    public SchemaLinkLink getLink() {
        return link;
    }

    public void setLink(SchemaLinkLink link) {
        this.link = link;
    }

    public SchemaLink checksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * Checksum hash of the schema (Base64 MD5). Can be used to verify schema contents, identify changes between schema versions, and for caching.
     *
     * @return checksum
     **/
    @Schema(required = true, description = "Checksum hash of the schema (Base64 MD5). Can be used to verify schema contents, identify changes between schema versions, and for caching.")
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SchemaLink schemaLink = (SchemaLink) o;
        return Objects.equals(this.link, schemaLink.link) &&
                Objects.equals(this.checksum, schemaLink.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, checksum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchemaLink {\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
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
