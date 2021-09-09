package com.amazon.spapi.models.messaging;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Represents a file uploaded to a destination that was created by the createUploadDestination operation of the Uploads API.
 */
@Schema(description = "Represents a file uploaded to a destination that was created by the createUploadDestination operation of the Uploads API.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Attachment {
    @SerializedName("uploadDestinationId")
    private String uploadDestinationId = null;
    @SerializedName("fileName")
    private String fileName = null;

    public Attachment uploadDestinationId(String uploadDestinationId) {
        this.uploadDestinationId = uploadDestinationId;
        return this;
    }

    /**
     * The identifier of the upload destination. Get this value by calling the createUploadDestination operation of the Uploads API.
     *
     * @return uploadDestinationId
     **/
    @Schema(required = true, description = "The identifier of the upload destination. Get this value by calling the createUploadDestination operation of the Uploads API.")
    public String getUploadDestinationId() {
        return uploadDestinationId;
    }

    public void setUploadDestinationId(String uploadDestinationId) {
        this.uploadDestinationId = uploadDestinationId;
    }

    public Attachment fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * The name of the file, including the extension. This is the file name that will appear in the message. This does not need to match the file name of the file that you uploaded.
     *
     * @return fileName
     **/
    @Schema(required = true, description = "The name of the file, including the extension. This is the file name that will appear in the message. This does not need to match the file name of the file that you uploaded.")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attachment attachment = (Attachment) o;
        return Objects.equals(this.uploadDestinationId, attachment.uploadDestinationId) &&
                Objects.equals(this.fileName, attachment.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadDestinationId, fileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Attachment {\n");
        sb.append("    uploadDestinationId: ").append(toIndentedString(uploadDestinationId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
