package com.amazon.spapi.models.sellers;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Detailed information about an Amazon market where a seller can list items for sale and customers can view and purchase items.
 */
@Schema(description = "Detailed information about an Amazon market where a seller can list items for sale and customers can view and purchase items.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Marketplace {
    @SerializedName("id")
    private String id = null;
    @SerializedName("name")
    private String name = null;
    @SerializedName("countryCode")
    private String countryCode = null;
    @SerializedName("defaultCurrencyCode")
    private String defaultCurrencyCode = null;
    @SerializedName("defaultLanguageCode")
    private String defaultLanguageCode = null;
    @SerializedName("domainName")
    private String domainName = null;

    public Marketplace id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The encrypted marketplace value.
     *
     * @return id
     **/
    @Schema(required = true, description = "The encrypted marketplace value.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Marketplace name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Marketplace name.
     *
     * @return name
     **/
    @Schema(required = true, description = "Marketplace name.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Marketplace countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The ISO 3166-1 alpha-2 format country code of the marketplace.
     *
     * @return countryCode
     **/
    @Schema(required = true, description = "The ISO 3166-1 alpha-2 format country code of the marketplace.")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Marketplace defaultCurrencyCode(String defaultCurrencyCode) {
        this.defaultCurrencyCode = defaultCurrencyCode;
        return this;
    }

    /**
     * The ISO 4217 format currency code of the marketplace.
     *
     * @return defaultCurrencyCode
     **/
    @Schema(required = true, description = "The ISO 4217 format currency code of the marketplace.")
    public String getDefaultCurrencyCode() {
        return defaultCurrencyCode;
    }

    public void setDefaultCurrencyCode(String defaultCurrencyCode) {
        this.defaultCurrencyCode = defaultCurrencyCode;
    }

    public Marketplace defaultLanguageCode(String defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * The ISO 639-1 format language code of the marketplace.
     *
     * @return defaultLanguageCode
     **/
    @Schema(required = true, description = "The ISO 639-1 format language code of the marketplace.")
    public String getDefaultLanguageCode() {
        return defaultLanguageCode;
    }

    public void setDefaultLanguageCode(String defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
    }

    public Marketplace domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * The domain name of the marketplace.
     *
     * @return domainName
     **/
    @Schema(required = true, description = "The domain name of the marketplace.")
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Marketplace marketplace = (Marketplace) o;
        return Objects.equals(this.id, marketplace.id) &&
                Objects.equals(this.name, marketplace.name) &&
                Objects.equals(this.countryCode, marketplace.countryCode) &&
                Objects.equals(this.defaultCurrencyCode, marketplace.defaultCurrencyCode) &&
                Objects.equals(this.defaultLanguageCode, marketplace.defaultLanguageCode) &&
                Objects.equals(this.domainName, marketplace.domainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, countryCode, defaultCurrencyCode, defaultLanguageCode, domainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Marketplace {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    defaultCurrencyCode: ").append(toIndentedString(defaultCurrencyCode)).append("\n");
        sb.append("    defaultLanguageCode: ").append(toIndentedString(defaultLanguageCode)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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
