package com.amazon.spapi.models.messaging;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The request schema for the createDigitalAccessKey operation.
 */
@Schema(description = "The request schema for the createDigitalAccessKey operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateDigitalAccessKeyRequest {
    @SerializedName("text")
    private String text = null;
    @SerializedName("attachments")
    private List<Attachment> attachments = null;

    public CreateDigitalAccessKeyRequest text(String text) {
        this.text = text;
        return this;
    }

    /**
     * The text to be sent to the buyer. Only links related to the digital access key are allowed. Do not include HTML or email addresses. The text must be written in the buyer&#x27;s language of preference, which can be retrieved from the GetAttributes operation.
     *
     * @return text
     **/
    @Schema(description = "The text to be sent to the buyer. Only links related to the digital access key are allowed. Do not include HTML or email addresses. The text must be written in the buyer's language of preference, which can be retrieved from the GetAttributes operation.")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CreateDigitalAccessKeyRequest attachments(List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public CreateDigitalAccessKeyRequest addAttachmentsItem(Attachment attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<Attachment>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    /**
     * Attachments to include in the message to the buyer.
     *
     * @return attachments
     **/
    @Schema(description = "Attachments to include in the message to the buyer.")
    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDigitalAccessKeyRequest createDigitalAccessKeyRequest = (CreateDigitalAccessKeyRequest) o;
        return Objects.equals(this.text, createDigitalAccessKeyRequest.text) &&
                Objects.equals(this.attachments, createDigitalAccessKeyRequest.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, attachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDigitalAccessKeyRequest {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
