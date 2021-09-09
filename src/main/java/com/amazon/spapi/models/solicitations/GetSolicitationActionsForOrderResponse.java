package com.amazon.spapi.models.solicitations;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The response schema for the getSolicitationActionsForOrder operation.
 */
@Schema(description = "The response schema for the getSolicitationActionsForOrder operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetSolicitationActionsForOrderResponse {
    @SerializedName("_links")
    private GetSolicitationActionsForOrderResponseLinks _links = null;
    @SerializedName("_embedded")
    private GetSolicitationActionsForOrderResponseEmbedded _embedded = null;
    @SerializedName("errors")
    private ErrorList errors = null;

    public GetSolicitationActionsForOrderResponse _links(GetSolicitationActionsForOrderResponseLinks _links) {
        this._links = _links;
        return this;
    }

    /**
     * Get _links
     *
     * @return _links
     **/
    @Schema(description = "")
    public GetSolicitationActionsForOrderResponseLinks getLinks() {
        return _links;
    }

    public void setLinks(GetSolicitationActionsForOrderResponseLinks _links) {
        this._links = _links;
    }

    public GetSolicitationActionsForOrderResponse _embedded(GetSolicitationActionsForOrderResponseEmbedded _embedded) {
        this._embedded = _embedded;
        return this;
    }

    /**
     * Get _embedded
     *
     * @return _embedded
     **/
    @Schema(description = "")
    public GetSolicitationActionsForOrderResponseEmbedded getEmbedded() {
        return _embedded;
    }

    public void setEmbedded(GetSolicitationActionsForOrderResponseEmbedded _embedded) {
        this._embedded = _embedded;
    }

    public GetSolicitationActionsForOrderResponse errors(ErrorList errors) {
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
        GetSolicitationActionsForOrderResponse getSolicitationActionsForOrderResponse = (GetSolicitationActionsForOrderResponse) o;
        return Objects.equals(this._links, getSolicitationActionsForOrderResponse._links) &&
                Objects.equals(this._embedded, getSolicitationActionsForOrderResponse._embedded) &&
                Objects.equals(this.errors, getSolicitationActionsForOrderResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_links, _embedded, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSolicitationActionsForOrderResponse {\n");
        sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
        sb.append("    _embedded: ").append(toIndentedString(_embedded)).append("\n");
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
