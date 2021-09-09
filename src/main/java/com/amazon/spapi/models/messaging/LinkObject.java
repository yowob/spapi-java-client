package com.amazon.spapi.models.messaging;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A Link object.
 */
@Schema(description = "A Link object.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class LinkObject {
    @SerializedName("href")
    private String href = null;
    @SerializedName("name")
    private String name = null;

    public LinkObject href(String href) {
        this.href = href;
        return this;
    }

    /**
     * A URI for this object.
     *
     * @return href
     **/
    @Schema(required = true, description = "A URI for this object.")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public LinkObject name(String name) {
        this.name = name;
        return this;
    }

    /**
     * An identifier for this object.
     *
     * @return name
     **/
    @Schema(description = "An identifier for this object.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkObject linkObject = (LinkObject) o;
        return Objects.equals(this.href, linkObject.href) &&
                Objects.equals(this.name, linkObject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkObject {\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
