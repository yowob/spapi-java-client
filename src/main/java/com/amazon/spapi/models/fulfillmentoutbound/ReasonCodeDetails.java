package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A return reason code, a description, and an optional description translation.
 */
@Schema(description = "A return reason code, a description, and an optional description translation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ReasonCodeDetails {
    @SerializedName("returnReasonCode")
    private String returnReasonCode = null;
    @SerializedName("description")
    private String description = null;
    @SerializedName("translatedDescription")
    private String translatedDescription = null;

    public ReasonCodeDetails returnReasonCode(String returnReasonCode) {
        this.returnReasonCode = returnReasonCode;
        return this;
    }

    /**
     * A code that indicates a valid return reason.
     *
     * @return returnReasonCode
     **/
    @Schema(required = true, description = "A code that indicates a valid return reason.")
    public String getReturnReasonCode() {
        return returnReasonCode;
    }

    public void setReturnReasonCode(String returnReasonCode) {
        this.returnReasonCode = returnReasonCode;
    }

    public ReasonCodeDetails description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A human readable description of the return reason code.
     *
     * @return description
     **/
    @Schema(required = true, description = "A human readable description of the return reason code.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReasonCodeDetails translatedDescription(String translatedDescription) {
        this.translatedDescription = translatedDescription;
        return this;
    }

    /**
     * A translation of the description. The translation is in the language specified in the Language request parameter.
     *
     * @return translatedDescription
     **/
    @Schema(description = "A translation of the description. The translation is in the language specified in the Language request parameter.")
    public String getTranslatedDescription() {
        return translatedDescription;
    }

    public void setTranslatedDescription(String translatedDescription) {
        this.translatedDescription = translatedDescription;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReasonCodeDetails reasonCodeDetails = (ReasonCodeDetails) o;
        return Objects.equals(this.returnReasonCode, reasonCodeDetails.returnReasonCode) &&
                Objects.equals(this.description, reasonCodeDetails.description) &&
                Objects.equals(this.translatedDescription, reasonCodeDetails.translatedDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnReasonCode, description, translatedDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReasonCodeDetails {\n");
        sb.append("    returnReasonCode: ").append(toIndentedString(returnReasonCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    translatedDescription: ").append(toIndentedString(translatedDescription)).append("\n");
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
