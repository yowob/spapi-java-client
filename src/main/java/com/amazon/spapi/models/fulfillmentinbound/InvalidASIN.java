package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * InvalidASIN
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class InvalidASIN {
    @SerializedName("ASIN")
    private String ASIN = null;
    @SerializedName("ErrorReason")
    private ErrorReason errorReason = null;

    public InvalidASIN ASIN(String ASIN) {
        this.ASIN = ASIN;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item.
     *
     * @return ASIN
     **/
    @Schema(description = "The Amazon Standard Identification Number (ASIN) of the item.")
    public String getASIN() {
        return ASIN;
    }

    public void setASIN(String ASIN) {
        this.ASIN = ASIN;
    }

    public InvalidASIN errorReason(ErrorReason errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    /**
     * Get errorReason
     *
     * @return errorReason
     **/
    @Schema(description = "")
    public ErrorReason getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(ErrorReason errorReason) {
        this.errorReason = errorReason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvalidASIN invalidASIN = (InvalidASIN) o;
        return Objects.equals(this.ASIN, invalidASIN.ASIN) &&
                Objects.equals(this.errorReason, invalidASIN.errorReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ASIN, errorReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvalidASIN {\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
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
