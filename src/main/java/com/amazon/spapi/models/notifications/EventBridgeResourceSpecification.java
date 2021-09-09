package com.amazon.spapi.models.notifications;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The information required to create an Amazon EventBridge destination.
 */
@Schema(description = "The information required to create an Amazon EventBridge destination.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class EventBridgeResourceSpecification {
    @SerializedName("region")
    private String region = null;
    @SerializedName("accountId")
    private String accountId = null;

    public EventBridgeResourceSpecification region(String region) {
        this.region = region;
        return this;
    }

    /**
     * The AWS region in which you will be receiving the notifications.
     *
     * @return region
     **/
    @Schema(required = true, description = "The AWS region in which you will be receiving the notifications.")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public EventBridgeResourceSpecification accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * The identifier for the AWS account that is responsible for charges related to receiving notifications.
     *
     * @return accountId
     **/
    @Schema(required = true, description = "The identifier for the AWS account that is responsible for charges related to receiving notifications.")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventBridgeResourceSpecification eventBridgeResourceSpecification = (EventBridgeResourceSpecification) o;
        return Objects.equals(this.region, eventBridgeResourceSpecification.region) &&
                Objects.equals(this.accountId, eventBridgeResourceSpecification.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, accountId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventBridgeResourceSpecification {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
