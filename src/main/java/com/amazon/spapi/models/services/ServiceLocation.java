package com.amazon.spapi.models.services;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * Information about the location of the service job.
 */
@Schema(description = "Information about the location of the service job.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ServiceLocation {
    @SerializedName("serviceLocationType")
    private ServiceLocationTypeEnum serviceLocationType = null;
    @SerializedName("address")
    private Address address = null;

    public ServiceLocation serviceLocationType(ServiceLocationTypeEnum serviceLocationType) {
        this.serviceLocationType = serviceLocationType;
        return this;
    }

    /**
     * The location of the service job.
     *
     * @return serviceLocationType
     **/
    @Schema(description = "The location of the service job.")
    public ServiceLocationTypeEnum getServiceLocationType() {
        return serviceLocationType;
    }

    public void setServiceLocationType(ServiceLocationTypeEnum serviceLocationType) {
        this.serviceLocationType = serviceLocationType;
    }

    public ServiceLocation address(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    @Schema(description = "")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceLocation serviceLocation = (ServiceLocation) o;
        return Objects.equals(this.serviceLocationType, serviceLocation.serviceLocationType) &&
                Objects.equals(this.address, serviceLocation.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceLocationType, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceLocation {\n");
        sb.append("    serviceLocationType: ").append(toIndentedString(serviceLocationType)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

    /**
     * The location of the service job.
     */
    @JsonAdapter(ServiceLocationTypeEnum.Adapter.class)
    public enum ServiceLocationTypeEnum {
        IN_HOME("IN_HOME"),
        IN_STORE("IN_STORE"),
        ONLINE("ONLINE");
        private String value;

        ServiceLocationTypeEnum(String value) {
            this.value = value;
        }

        public static ServiceLocationTypeEnum fromValue(String text) {
            for (ServiceLocationTypeEnum b : ServiceLocationTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<ServiceLocationTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ServiceLocationTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ServiceLocationTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ServiceLocationTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
