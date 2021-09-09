package com.amazon.spapi.models.solicitations;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Describes a solicitation action that can be taken for an order. Provides a JSON Hypertext Application Language (HAL) link to the JSON schema document that describes the expected input.
 */
@Schema(description = "Describes a solicitation action that can be taken for an order. Provides a JSON Hypertext Application Language (HAL) link to the JSON schema document that describes the expected input.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetSolicitationActionResponse {
    @SerializedName("_links")
    private GetSolicitationActionResponseLinks _links = null;
    @SerializedName("_embedded")
    private GetSolicitationActionResponseEmbedded _embedded = null;
    @SerializedName("payload")
    private SolicitationsAction payload = null;
    @SerializedName("errors")
    private ErrorList errors = null;

    public GetSolicitationActionResponse _links(GetSolicitationActionResponseLinks _links) {
        this._links = _links;
        return this;
    }

    /**
     * Get _links
     *
     * @return _links
     **/
    @Schema(description = "")
    public GetSolicitationActionResponseLinks getLinks() {
        return _links;
    }

    public void setLinks(GetSolicitationActionResponseLinks _links) {
        this._links = _links;
    }

    public GetSolicitationActionResponse _embedded(GetSolicitationActionResponseEmbedded _embedded) {
        this._embedded = _embedded;
        return this;
    }

    /**
     * Get _embedded
     *
     * @return _embedded
     **/
    @Schema(description = "")
    public GetSolicitationActionResponseEmbedded getEmbedded() {
        return _embedded;
    }

    public void setEmbedded(GetSolicitationActionResponseEmbedded _embedded) {
        this._embedded = _embedded;
    }

    public GetSolicitationActionResponse payload(SolicitationsAction payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     *
     * @return payload
     **/
    @Schema(description = "")
    public SolicitationsAction getPayload() {
        return payload;
    }

    public void setPayload(SolicitationsAction payload) {
        this.payload = payload;
    }

    public GetSolicitationActionResponse errors(ErrorList errors) {
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
        GetSolicitationActionResponse getSolicitationActionResponse = (GetSolicitationActionResponse) o;
        return Objects.equals(this._links, getSolicitationActionResponse._links) &&
                Objects.equals(this._embedded, getSolicitationActionResponse._embedded) &&
                Objects.equals(this.payload, getSolicitationActionResponse.payload) &&
                Objects.equals(this.errors, getSolicitationActionResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_links, _embedded, payload, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSolicitationActionResponse {\n");
        sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
        sb.append("    _embedded: ").append(toIndentedString(_embedded)).append("\n");
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
