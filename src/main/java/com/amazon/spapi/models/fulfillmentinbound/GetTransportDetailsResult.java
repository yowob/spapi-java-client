package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetTransportDetailsResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetTransportDetailsResult {
    @SerializedName("TransportContent")
    private TransportContent transportContent = null;

    public GetTransportDetailsResult transportContent(TransportContent transportContent) {
        this.transportContent = transportContent;
        return this;
    }

    /**
     * Get transportContent
     *
     * @return transportContent
     **/
    @Schema(description = "")
    public TransportContent getTransportContent() {
        return transportContent;
    }

    public void setTransportContent(TransportContent transportContent) {
        this.transportContent = transportContent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetTransportDetailsResult getTransportDetailsResult = (GetTransportDetailsResult) o;
        return Objects.equals(this.transportContent, getTransportDetailsResult.transportContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTransportDetailsResult {\n");
        sb.append("    transportContent: ").append(toIndentedString(transportContent)).append("\n");
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
