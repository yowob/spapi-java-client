package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The full context for an A+ Content publishing event.
 */
@Schema(description = "The full context for an A+ Content publishing event.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PublishRecord {
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("locale")
    private String locale = null;
    @SerializedName("asin")
    private String asin = null;
    @SerializedName("contentType")
    private ContentType contentType = null;
    @SerializedName("contentSubType")
    private String contentSubType = null;
    @SerializedName("contentReferenceKey")
    private String contentReferenceKey = null;

    public PublishRecord marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get marketplaceId
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public PublishRecord locale(String locale) {
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

    public PublishRecord asin(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * Get asin
     *
     * @return asin
     **/
    @Schema(required = true, description = "")
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public PublishRecord contentType(ContentType contentType) {
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

    public PublishRecord contentSubType(String contentSubType) {
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

    public PublishRecord contentReferenceKey(String contentReferenceKey) {
        this.contentReferenceKey = contentReferenceKey;
        return this;
    }

    /**
     * Get contentReferenceKey
     *
     * @return contentReferenceKey
     **/
    @Schema(required = true, description = "")
    public String getContentReferenceKey() {
        return contentReferenceKey;
    }

    public void setContentReferenceKey(String contentReferenceKey) {
        this.contentReferenceKey = contentReferenceKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublishRecord publishRecord = (PublishRecord) o;
        return Objects.equals(this.marketplaceId, publishRecord.marketplaceId) &&
                Objects.equals(this.locale, publishRecord.locale) &&
                Objects.equals(this.asin, publishRecord.asin) &&
                Objects.equals(this.contentType, publishRecord.contentType) &&
                Objects.equals(this.contentSubType, publishRecord.contentSubType) &&
                Objects.equals(this.contentReferenceKey, publishRecord.contentReferenceKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, locale, asin, contentType, contentSubType, contentReferenceKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishRecord {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    contentSubType: ").append(toIndentedString(contentSubType)).append("\n");
        sb.append("    contentReferenceKey: ").append(toIndentedString(contentReferenceKey)).append("\n");
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
