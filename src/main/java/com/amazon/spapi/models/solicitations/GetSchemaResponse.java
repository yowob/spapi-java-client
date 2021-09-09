package com.amazon.spapi.models.solicitations;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetSchemaResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetSchemaResponse {
    @SerializedName("_links")
    private GetSchemaResponseLinks _links = null;
    @SerializedName("payload")
    private Schema payload = null;
    @SerializedName("errors")
    private ErrorList errors = null;

    public GetSchemaResponse _links(GetSchemaResponseLinks _links) {
        this._links = _links;
        return this;
    }

    /**
     * Get _links
     *
     * @return _links
     **/
    @Schema(description = "")
    public GetSchemaResponseLinks getLinks() {
        return _links;
    }

    public void setLinks(GetSchemaResponseLinks _links) {
        this._links = _links;
    }

    public GetSchemaResponse payload(Schema payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     *
     * @return payload
     **/
    @Schema(description = "")
    public Schema getPayload() {
        return payload;
    }

    public void setPayload(Schema payload) {
        this.payload = payload;
    }

    public GetSchemaResponse errors(ErrorList errors) {
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
        GetSchemaResponse getSchemaResponse = (GetSchemaResponse) o;
        return Objects.equals(this._links, getSchemaResponse._links) &&
                Objects.equals(this.payload, getSchemaResponse.payload) &&
                Objects.equals(this.errors, getSchemaResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_links, payload, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSchemaResponse {\n");
        sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
