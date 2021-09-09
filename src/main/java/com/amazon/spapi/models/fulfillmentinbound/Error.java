package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Error response returned when the request is unsuccessful.
 */
@Schema(description = "Error response returned when the request is unsuccessful.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Error {
    @SerializedName("code")
    private String code = null;
    @SerializedName("message")
    private String message = null;
    @SerializedName("details")
    private String details = null;

    public Error code(String code) {
        this.code = code;
        return this;
    }

    /**
     * An error code that identifies the type of error that occured.
     *
     * @return code
     **/
    @Schema(required = true, description = "An error code that identifies the type of error that occured.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Error message(String message) {
        this.message = message;
        return this;
    }

    /**
     * A message that describes the error condition in a human-readable form.
     *
     * @return message
     **/
    @Schema(required = true, description = "A message that describes the error condition in a human-readable form.")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Error details(String details) {
        this.details = details;
        return this;
    }

    /**
     * Additional details that can help the caller understand or fix the issue.
     *
     * @return details
     **/
    @Schema(description = "Additional details that can help the caller understand or fix the issue.")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.code, error.code) &&
                Objects.equals(this.message, error.message) &&
                Objects.equals(this.details, error.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
