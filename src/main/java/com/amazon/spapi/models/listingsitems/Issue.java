package com.amazon.spapi.models.listingsitems;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * An issue with a listings item.
 */
@Schema(description = "An issue with a listings item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Issue {
    @SerializedName("code")
    private String code = null;
    @SerializedName("message")
    private String message = null;
    @SerializedName("severity")
    private SeverityEnum severity = null;
    @SerializedName("attributeName")
    private String attributeName = null;

    public Issue code(String code) {
        this.code = code;
        return this;
    }

    /**
     * An issue code that identifies the type of issue.
     *
     * @return code
     **/
    @Schema(required = true, description = "An issue code that identifies the type of issue.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Issue message(String message) {
        this.message = message;
        return this;
    }

    /**
     * A message that describes the issue.
     *
     * @return message
     **/
    @Schema(required = true, description = "A message that describes the issue.")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Issue severity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * The severity of the issue.
     *
     * @return severity
     **/
    @Schema(required = true, description = "The severity of the issue.")
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public Issue attributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * Name of the attribute associated with the issue, if applicable.
     *
     * @return attributeName
     **/
    @Schema(description = "Name of the attribute associated with the issue, if applicable.")
    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Issue issue = (Issue) o;
        return Objects.equals(this.code, issue.code) &&
                Objects.equals(this.message, issue.message) &&
                Objects.equals(this.severity, issue.severity) &&
                Objects.equals(this.attributeName, issue.attributeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, severity, attributeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Issue {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
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

    /**
     * The severity of the issue.
     */
    @JsonAdapter(SeverityEnum.Adapter.class)
    public enum SeverityEnum {
        ERROR("ERROR"),
        WARNING("WARNING"),
        INFO("INFO");
        private String value;

        SeverityEnum(String value) {
            this.value = value;
        }

        public static SeverityEnum fromValue(String text) {
            for (SeverityEnum b : SeverityEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<SeverityEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SeverityEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return SeverityEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
