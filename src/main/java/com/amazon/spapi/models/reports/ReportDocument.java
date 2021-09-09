package com.amazon.spapi.models.reports;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * ReportDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ReportDocument {
    @SerializedName("reportDocumentId")
    private String reportDocumentId = null;
    @SerializedName("url")
    private String url = null;
    @SerializedName("encryptionDetails")
    private ReportDocumentEncryptionDetails encryptionDetails = null;
    @SerializedName("compressionAlgorithm")
    private CompressionAlgorithmEnum compressionAlgorithm = null;

    public ReportDocument reportDocumentId(String reportDocumentId) {
        this.reportDocumentId = reportDocumentId;
        return this;
    }

    /**
     * The identifier for the report document. This identifier is unique only in combination with a seller ID.
     *
     * @return reportDocumentId
     **/
    @Schema(required = true, description = "The identifier for the report document. This identifier is unique only in combination with a seller ID.")
    public String getReportDocumentId() {
        return reportDocumentId;
    }

    public void setReportDocumentId(String reportDocumentId) {
        this.reportDocumentId = reportDocumentId;
    }

    public ReportDocument url(String url) {
        this.url = url;
        return this;
    }

    /**
     * A presigned URL for the report document. This URL expires after 5 minutes.
     *
     * @return url
     **/
    @Schema(required = true, description = "A presigned URL for the report document. This URL expires after 5 minutes.")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ReportDocument encryptionDetails(ReportDocumentEncryptionDetails encryptionDetails) {
        this.encryptionDetails = encryptionDetails;
        return this;
    }

    /**
     * Get encryptionDetails
     *
     * @return encryptionDetails
     **/
    @Schema(required = true, description = "")
    public ReportDocumentEncryptionDetails getEncryptionDetails() {
        return encryptionDetails;
    }

    public void setEncryptionDetails(ReportDocumentEncryptionDetails encryptionDetails) {
        this.encryptionDetails = encryptionDetails;
    }

    public ReportDocument compressionAlgorithm(CompressionAlgorithmEnum compressionAlgorithm) {
        this.compressionAlgorithm = compressionAlgorithm;
        return this;
    }

    /**
     * If present, the report document contents have been compressed with the provided algorithm.
     *
     * @return compressionAlgorithm
     **/
    @Schema(description = "If present, the report document contents have been compressed with the provided algorithm.")
    public CompressionAlgorithmEnum getCompressionAlgorithm() {
        return compressionAlgorithm;
    }

    public void setCompressionAlgorithm(CompressionAlgorithmEnum compressionAlgorithm) {
        this.compressionAlgorithm = compressionAlgorithm;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportDocument reportDocument = (ReportDocument) o;
        return Objects.equals(this.reportDocumentId, reportDocument.reportDocumentId) &&
                Objects.equals(this.url, reportDocument.url) &&
                Objects.equals(this.encryptionDetails, reportDocument.encryptionDetails) &&
                Objects.equals(this.compressionAlgorithm, reportDocument.compressionAlgorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportDocumentId, url, encryptionDetails, compressionAlgorithm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportDocument {\n");
        sb.append("    reportDocumentId: ").append(toIndentedString(reportDocumentId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    encryptionDetails: ").append(toIndentedString(encryptionDetails)).append("\n");
        sb.append("    compressionAlgorithm: ").append(toIndentedString(compressionAlgorithm)).append("\n");
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
     * If present, the report document contents have been compressed with the provided algorithm.
     */
    @JsonAdapter(CompressionAlgorithmEnum.Adapter.class)
    public enum CompressionAlgorithmEnum {
        GZIP("GZIP");
        private String value;

        CompressionAlgorithmEnum(String value) {
            this.value = value;
        }

        public static CompressionAlgorithmEnum fromValue(String text) {
            for (CompressionAlgorithmEnum b : CompressionAlgorithmEnum.values()) {
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

        public static class Adapter extends TypeAdapter<CompressionAlgorithmEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CompressionAlgorithmEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CompressionAlgorithmEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return CompressionAlgorithmEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
