package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A validation constraint.
 */
@Schema(description = "A validation constraint.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Constraint {
    @SerializedName("ValidationRegEx")
    private String validationRegEx = null;
    @SerializedName("ValidationString")
    private String validationString = null;

    public Constraint validationRegEx(String validationRegEx) {
        this.validationRegEx = validationRegEx;
        return this;
    }

    /**
     * A regular expression.
     *
     * @return validationRegEx
     **/
    @Schema(description = "A regular expression.")
    public String getValidationRegEx() {
        return validationRegEx;
    }

    public void setValidationRegEx(String validationRegEx) {
        this.validationRegEx = validationRegEx;
    }

    public Constraint validationString(String validationString) {
        this.validationString = validationString;
        return this;
    }

    /**
     * A validation string.
     *
     * @return validationString
     **/
    @Schema(required = true, description = "A validation string.")
    public String getValidationString() {
        return validationString;
    }

    public void setValidationString(String validationString) {
        this.validationString = validationString;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Constraint constraint = (Constraint) o;
        return Objects.equals(this.validationRegEx, constraint.validationRegEx) &&
                Objects.equals(this.validationString, constraint.validationString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validationRegEx, validationString);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Constraint {\n");
        sb.append("    validationRegEx: ").append(toIndentedString(validationRegEx)).append("\n");
        sb.append("    validationString: ").append(toIndentedString(validationString)).append("\n");
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
