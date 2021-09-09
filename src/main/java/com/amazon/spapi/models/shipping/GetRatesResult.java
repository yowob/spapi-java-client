package com.amazon.spapi.models.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The payload schema for the getRates operation.
 */
@Schema(description = "The payload schema for the getRates operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetRatesResult {
    @SerializedName("serviceRates")
    private ServiceRateList serviceRates = null;

    public GetRatesResult serviceRates(ServiceRateList serviceRates) {
        this.serviceRates = serviceRates;
        return this;
    }

    /**
     * Get serviceRates
     *
     * @return serviceRates
     **/
    @Schema(required = true, description = "")
    public ServiceRateList getServiceRates() {
        return serviceRates;
    }

    public void setServiceRates(ServiceRateList serviceRates) {
        this.serviceRates = serviceRates;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetRatesResult getRatesResult = (GetRatesResult) o;
        return Objects.equals(this.serviceRates, getRatesResult.serviceRates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceRates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetRatesResult {\n");
        sb.append("    serviceRates: ").append(toIndentedString(serviceRates)).append("\n");
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
