package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The workflow status for a shipment with an Amazon-partnered carrier.
 */
@Schema(description = "The workflow status for a shipment with an Amazon-partnered carrier.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TransportResult {
    @SerializedName("TransportStatus")
    private TransportStatus transportStatus = null;
    @SerializedName("ErrorCode")
    private String errorCode = null;
    @SerializedName("ErrorDescription")
    private String errorDescription = null;

    public TransportResult transportStatus(TransportStatus transportStatus) {
        this.transportStatus = transportStatus;
        return this;
    }

    /**
     * Get transportStatus
     *
     * @return transportStatus
     **/
    @Schema(required = true, description = "")
    public TransportStatus getTransportStatus() {
        return transportStatus;
    }

    public void setTransportStatus(TransportStatus transportStatus) {
        this.transportStatus = transportStatus;
    }

    public TransportResult errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * An error code that identifies the type of error that occured.
     *
     * @return errorCode
     **/
    @Schema(description = "An error code that identifies the type of error that occured.")
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public TransportResult errorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }

    /**
     * A message that describes the error condition.
     *
     * @return errorDescription
     **/
    @Schema(description = "A message that describes the error condition.")
    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransportResult transportResult = (TransportResult) o;
        return Objects.equals(this.transportStatus, transportResult.transportStatus) &&
                Objects.equals(this.errorCode, transportResult.errorCode) &&
                Objects.equals(this.errorDescription, transportResult.errorDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportStatus, errorCode, errorDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransportResult {\n");
        sb.append("    transportStatus: ").append(toIndentedString(transportStatus)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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
