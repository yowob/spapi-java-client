package com.amazon.spapi.models.messaging;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The response schema for the getMessagingActionsForOrder operation.
 */
@Schema(description = "The response schema for the getMessagingActionsForOrder operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetMessagingActionsForOrderResponse {
    @SerializedName("_links")
    private GetMessagingActionsForOrderResponseLinks _links = null;
    @SerializedName("_embedded")
    private GetMessagingActionsForOrderResponseEmbedded _embedded = null;
    @SerializedName("errors")
    private ErrorList errors = null;

    public GetMessagingActionsForOrderResponse _links(GetMessagingActionsForOrderResponseLinks _links) {
        this._links = _links;
        return this;
    }

    /**
     * Get _links
     *
     * @return _links
     **/
    @Schema(description = "")
    public GetMessagingActionsForOrderResponseLinks getLinks() {
        return _links;
    }

    public void setLinks(GetMessagingActionsForOrderResponseLinks _links) {
        this._links = _links;
    }

    public GetMessagingActionsForOrderResponse _embedded(GetMessagingActionsForOrderResponseEmbedded _embedded) {
        this._embedded = _embedded;
        return this;
    }

    /**
     * Get _embedded
     *
     * @return _embedded
     **/
    @Schema(description = "")
    public GetMessagingActionsForOrderResponseEmbedded getEmbedded() {
        return _embedded;
    }

    public void setEmbedded(GetMessagingActionsForOrderResponseEmbedded _embedded) {
        this._embedded = _embedded;
    }

    public GetMessagingActionsForOrderResponse errors(ErrorList errors) {
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
        GetMessagingActionsForOrderResponse getMessagingActionsForOrderResponse = (GetMessagingActionsForOrderResponse) o;
        return Objects.equals(this._links, getMessagingActionsForOrderResponse._links) &&
                Objects.equals(this._embedded, getMessagingActionsForOrderResponse._embedded) &&
                Objects.equals(this.errors, getMessagingActionsForOrderResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_links, _embedded, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMessagingActionsForOrderResponse {\n");
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
