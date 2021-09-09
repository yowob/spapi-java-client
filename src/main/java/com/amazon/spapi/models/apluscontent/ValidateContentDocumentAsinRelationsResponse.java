package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ValidateContentDocumentAsinRelationsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ValidateContentDocumentAsinRelationsResponse extends AplusResponse {
    @SerializedName("errors")
    private List<Error> errors = new ArrayList<Error>();

    public ValidateContentDocumentAsinRelationsResponse errors(List<Error> errors) {
        this.errors = errors;
        return this;
    }

    public ValidateContentDocumentAsinRelationsResponse addErrorsItem(Error errorsItem) {
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * A list of error responses returned when a request is unsuccessful.
     *
     * @return errors
     **/
    @Schema(required = true, description = "A list of error responses returned when a request is unsuccessful.")
    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidateContentDocumentAsinRelationsResponse validateContentDocumentAsinRelationsResponse = (ValidateContentDocumentAsinRelationsResponse) o;
        return Objects.equals(this.errors, validateContentDocumentAsinRelationsResponse.errors) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateContentDocumentAsinRelationsResponse {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
