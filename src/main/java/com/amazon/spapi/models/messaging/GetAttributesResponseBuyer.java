package com.amazon.spapi.models.messaging;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The list of attributes related to the buyer.
 */
@Schema(description = "The list of attributes related to the buyer.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetAttributesResponseBuyer {
    @SerializedName("locale")
    private String locale = null;

    public GetAttributesResponseBuyer locale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * The buyer&#x27;s language of preference, indicated with a locale-specific language tag. Examples: \&quot;en-US\&quot;, \&quot;zh-CN\&quot;, and \&quot;en-GB\&quot;.
     *
     * @return locale
     **/
    @Schema(description = "The buyer's language of preference, indicated with a locale-specific language tag. Examples: \"en-US\", \"zh-CN\", and \"en-GB\".")
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAttributesResponseBuyer getAttributesResponseBuyer = (GetAttributesResponseBuyer) o;
        return Objects.equals(this.locale, getAttributesResponseBuyer.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAttributesResponseBuyer {\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
