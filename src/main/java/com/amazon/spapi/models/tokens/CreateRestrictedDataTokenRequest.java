package com.amazon.spapi.models.tokens;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The request schema for the createRestrictedDataToken operation.
 */
@Schema(description = "The request schema for the createRestrictedDataToken operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateRestrictedDataTokenRequest {
    @SerializedName("targetApplication")
    private String targetApplication = null;
    @SerializedName("restrictedResources")
    private List<RestrictedResource> restrictedResources = new ArrayList<RestrictedResource>();

    public CreateRestrictedDataTokenRequest targetApplication(String targetApplication) {
        this.targetApplication = targetApplication;
        return this;
    }

    /**
     * The application ID for the target application to which access is being delegated.
     *
     * @return targetApplication
     **/
    @Schema(description = "The application ID for the target application to which access is being delegated.")
    public String getTargetApplication() {
        return targetApplication;
    }

    public void setTargetApplication(String targetApplication) {
        this.targetApplication = targetApplication;
    }

    public CreateRestrictedDataTokenRequest restrictedResources(List<RestrictedResource> restrictedResources) {
        this.restrictedResources = restrictedResources;
        return this;
    }

    public CreateRestrictedDataTokenRequest addRestrictedResourcesItem(RestrictedResource restrictedResourcesItem) {
        this.restrictedResources.add(restrictedResourcesItem);
        return this;
    }

    /**
     * A list of restricted resources. Maximum: 50
     *
     * @return restrictedResources
     **/
    @Schema(required = true, description = "A list of restricted resources. Maximum: 50")
    public List<RestrictedResource> getRestrictedResources() {
        return restrictedResources;
    }

    public void setRestrictedResources(List<RestrictedResource> restrictedResources) {
        this.restrictedResources = restrictedResources;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRestrictedDataTokenRequest createRestrictedDataTokenRequest = (CreateRestrictedDataTokenRequest) o;
        return Objects.equals(this.targetApplication, createRestrictedDataTokenRequest.targetApplication) &&
                Objects.equals(this.restrictedResources, createRestrictedDataTokenRequest.restrictedResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetApplication, restrictedResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRestrictedDataTokenRequest {\n");
        sb.append("    targetApplication: ").append(toIndentedString(targetApplication)).append("\n");
        sb.append("    restrictedResources: ").append(toIndentedString(restrictedResources)).append("\n");
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
