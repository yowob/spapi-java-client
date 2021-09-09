package com.amazon.spapi.models.tokens;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The response schema for the createRestrictedDataToken operation.
 */
@Schema(description = "The response schema for the createRestrictedDataToken operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateRestrictedDataTokenResponse {
    @SerializedName("restrictedDataToken")
    private String restrictedDataToken = null;
    @SerializedName("expiresIn")
    private Integer expiresIn = null;

    public CreateRestrictedDataTokenResponse restrictedDataToken(String restrictedDataToken) {
        this.restrictedDataToken = restrictedDataToken;
        return this;
    }

    /**
     * A Restricted Data Token (RDT). This is a short-lived access token that authorizes you to access the restricted resources that you specified. Pass this value with the x-amz-access-token header when making subsequent calls to these restricted resources.
     *
     * @return restrictedDataToken
     **/
    @Schema(description = "A Restricted Data Token (RDT). This is a short-lived access token that authorizes you to access the restricted resources that you specified. Pass this value with the x-amz-access-token header when making subsequent calls to these restricted resources.")
    public String getRestrictedDataToken() {
        return restrictedDataToken;
    }

    public void setRestrictedDataToken(String restrictedDataToken) {
        this.restrictedDataToken = restrictedDataToken;
    }

    public CreateRestrictedDataTokenResponse expiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * The lifetime of the Restricted Data Token, in seconds.
     *
     * @return expiresIn
     **/
    @Schema(description = "The lifetime of the Restricted Data Token, in seconds.")
    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRestrictedDataTokenResponse createRestrictedDataTokenResponse = (CreateRestrictedDataTokenResponse) o;
        return Objects.equals(this.restrictedDataToken, createRestrictedDataTokenResponse.restrictedDataToken) &&
                Objects.equals(this.expiresIn, createRestrictedDataTokenResponse.expiresIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restrictedDataToken, expiresIn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRestrictedDataTokenResponse {\n");
        sb.append("    restrictedDataToken: ").append(toIndentedString(restrictedDataToken)).append("\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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
