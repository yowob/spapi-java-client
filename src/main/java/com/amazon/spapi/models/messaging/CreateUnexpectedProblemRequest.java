package com.amazon.spapi.models.messaging;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The request schema for the createUnexpectedProblem operation.
 */
@Schema(description = "The request schema for the createUnexpectedProblem operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateUnexpectedProblemRequest {
    @SerializedName("text")
    private String text = null;

    public CreateUnexpectedProblemRequest text(String text) {
        this.text = text;
        return this;
    }

    /**
     * The text to be sent to the buyer. Only links related to unexpected problem calls are allowed. Do not include HTML or email addresses. The text must be written in the buyer&#x27;s language of preference, which can be retrieved from the GetAttributes operation.
     *
     * @return text
     **/
    @Schema(description = "The text to be sent to the buyer. Only links related to unexpected problem calls are allowed. Do not include HTML or email addresses. The text must be written in the buyer's language of preference, which can be retrieved from the GetAttributes operation.")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateUnexpectedProblemRequest createUnexpectedProblemRequest = (CreateUnexpectedProblemRequest) o;
        return Objects.equals(this.text, createUnexpectedProblemRequest.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUnexpectedProblemRequest {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
