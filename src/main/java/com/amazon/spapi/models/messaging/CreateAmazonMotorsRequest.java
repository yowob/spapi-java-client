package com.amazon.spapi.models.messaging;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The request schema for the createAmazonMotors operation.
 */
@Schema(description = "The request schema for the createAmazonMotors operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateAmazonMotorsRequest {
    @SerializedName("attachments")
    private List<Attachment> attachments = null;

    public CreateAmazonMotorsRequest attachments(List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public CreateAmazonMotorsRequest addAttachmentsItem(Attachment attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<Attachment>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    /**
     * Attachments to include in the message to the buyer. If any text is included in the attachment, the text must be written in the buyer&#x27;s language of preference, which can be retrieved from the GetAttributes operation.
     *
     * @return attachments
     **/
    @Schema(description = "Attachments to include in the message to the buyer. If any text is included in the attachment, the text must be written in the buyer's language of preference, which can be retrieved from the GetAttributes operation.")
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
        CreateAmazonMotorsRequest createAmazonMotorsRequest = (CreateAmazonMotorsRequest) o;
        return Objects.equals(this.attachments, createAmazonMotorsRequest.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAmazonMotorsRequest {\n");
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