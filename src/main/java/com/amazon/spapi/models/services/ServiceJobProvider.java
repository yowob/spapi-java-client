package com.amazon.spapi.models.services;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information about the service job provider.
 */
@Schema(description = "Information about the service job provider.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ServiceJobProvider {
    @SerializedName("serviceJobProviderId")
    private String serviceJobProviderId = null;

    public ServiceJobProvider serviceJobProviderId(String serviceJobProviderId) {
        this.serviceJobProviderId = serviceJobProviderId;
        return this;
    }

    /**
     * The identifier of the service job provider.
     *
     * @return serviceJobProviderId
     **/
    @Schema(description = "The identifier of the service job provider.")
    public String getServiceJobProviderId() {
        return serviceJobProviderId;
    }

    public void setServiceJobProviderId(String serviceJobProviderId) {
        this.serviceJobProviderId = serviceJobProviderId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceJobProvider serviceJobProvider = (ServiceJobProvider) o;
        return Objects.equals(this.serviceJobProviderId, serviceJobProvider.serviceJobProviderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceJobProviderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceJobProvider {\n");
        sb.append("    serviceJobProviderId: ").append(toIndentedString(serviceJobProviderId)).append("\n");
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
