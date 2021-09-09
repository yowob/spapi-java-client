package com.amazon.spapi.models.productfees;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * An unexpected error occurred during this operation.
 */
@Schema(description = "An unexpected error occurred during this operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FeesEstimateError {
    @SerializedName("Type")
    private String type = null;
    @SerializedName("Code")
    private String code = null;
    @SerializedName("Message")
    private String message = null;
    @SerializedName("Detail")
    private FeesEstimateErrorDetail detail = null;

    public FeesEstimateError type(String type) {
        this.type = type;
        return this;
    }

    /**
     * An error type, identifying either the receiver or the sender as the originator of the error.
     *
     * @return type
     **/
    @Schema(required = true, description = "An error type, identifying either the receiver or the sender as the originator of the error.")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FeesEstimateError code(String code) {
        this.code = code;
        return this;
    }

    /**
     * An error code that identifies the type of error that occurred.
     *
     * @return code
     **/
    @Schema(required = true, description = "An error code that identifies the type of error that occurred.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public FeesEstimateError message(String message) {
        this.message = message;
        return this;
    }

    /**
     * A message that describes the error condition.
     *
     * @return message
     **/
    @Schema(required = true, description = "A message that describes the error condition.")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FeesEstimateError detail(FeesEstimateErrorDetail detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Get detail
     *
     * @return detail
     **/
    @Schema(required = true, description = "")
    public FeesEstimateErrorDetail getDetail() {
        return detail;
    }

    public void setDetail(FeesEstimateErrorDetail detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeesEstimateError feesEstimateError = (FeesEstimateError) o;
        return Objects.equals(this.type, feesEstimateError.type) &&
                Objects.equals(this.code, feesEstimateError.code) &&
                Objects.equals(this.message, feesEstimateError.message) &&
                Objects.equals(this.detail, feesEstimateError.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, code, message, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeesEstimateError {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
