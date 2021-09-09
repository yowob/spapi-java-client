package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The A+ Content document. This is the enhanced content that is published to product detail pages.
 */
@Schema(description = "The A+ Content document. This is the enhanced content that is published to product detail pages.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ContentDocument {
    @SerializedName("name")
    private String name = null;
    @SerializedName("contentType")
    private ContentType contentType = null;
    @SerializedName("contentSubType")
    private String contentSubType = null;
    @SerializedName("locale")
    private String locale = null;
    @SerializedName("contentModuleList")
    private ContentModuleList contentModuleList = null;

    public ContentDocument name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The A+ Content document name.
     *
     * @return name
     **/
    @Schema(required = true, description = "The A+ Content document name.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContentDocument contentType(ContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get contentType
     *
     * @return contentType
     **/
    @Schema(required = true, description = "")
    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public ContentDocument contentSubType(String contentSubType) {
        this.contentSubType = contentSubType;
        return this;
    }

    /**
     * Get contentSubType
     *
     * @return contentSubType
     **/
    @Schema(description = "")
    public String getContentSubType() {
        return contentSubType;
    }

    public void setContentSubType(String contentSubType) {
        this.contentSubType = contentSubType;
    }

    public ContentDocument locale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get locale
     *
     * @return locale
     **/
    @Schema(required = true, description = "")
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public ContentDocument contentModuleList(ContentModuleList contentModuleList) {
        this.contentModuleList = contentModuleList;
        return this;
    }

    /**
     * Get contentModuleList
     *
     * @return contentModuleList
     **/
    @Schema(required = true, description = "")
    public ContentModuleList getContentModuleList() {
        return contentModuleList;
    }

    public void setContentModuleList(ContentModuleList contentModuleList) {
        this.contentModuleList = contentModuleList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentDocument contentDocument = (ContentDocument) o;
        return Objects.equals(this.name, contentDocument.name) &&
                Objects.equals(this.contentType, contentDocument.contentType) &&
                Objects.equals(this.contentSubType, contentDocument.contentSubType) &&
                Objects.equals(this.locale, contentDocument.locale) &&
                Objects.equals(this.contentModuleList, contentDocument.contentModuleList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentType, contentSubType, locale, contentModuleList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentDocument {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    contentSubType: ").append(toIndentedString(contentSubType)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    contentModuleList: ").append(toIndentedString(contentModuleList)).append("\n");
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
