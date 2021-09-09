package com.amazon.spapi.models.authorization;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A Login with Amazon (LWA) authorization code.
 */
@Schema(description = "A Login with Amazon (LWA) authorization code.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AuthorizationCode {
    @SerializedName("authorizationCode")
    private String authorizationCode = null;

    public AuthorizationCode authorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }

    /**
     * A Login with Amazon (LWA) authorization code that can be exchanged for a refresh token and access token that authorize you to make calls to a Selling Partner API.
     *
     * @return authorizationCode
     **/
    @Schema(description = "A Login with Amazon (LWA) authorization code that can be exchanged for a refresh token and access token that authorize you to make calls to a Selling Partner API.")
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizationCode authorizationCode = (AuthorizationCode) o;
        return Objects.equals(this.authorizationCode, authorizationCode.authorizationCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizationCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizationCode {\n");
        sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
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
