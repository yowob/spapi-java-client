package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Response schema.
 */
@Schema(description = "Response schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CancelShipmentResponse {
    @SerializedName("payload")
    private Shipment payload = null;
    @SerializedName("errors")
    private ErrorList errors = null;

    public CancelShipmentResponse payload(Shipment payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     *
     * @return payload
     **/
    @Schema(description = "")
    public Shipment getPayload() {
        return payload;
    }

    public void setPayload(Shipment payload) {
        this.payload = payload;
    }

    public CancelShipmentResponse errors(ErrorList errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get errors
     *
     * @return errors
     **/
    @Schema(description = "")
    public ErrorList getErrors() {
        return errors;
    }

    public void setErrors(ErrorList errors) {
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
        CancelShipmentResponse cancelShipmentResponse = (CancelShipmentResponse) o;
        return Objects.equals(this.payload, cancelShipmentResponse.payload) &&
                Objects.equals(this.errors, cancelShipmentResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelShipmentResponse {\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
