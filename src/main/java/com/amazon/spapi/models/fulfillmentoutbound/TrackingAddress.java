package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Address information for tracking the package.
 */
@Schema(description = "Address information for tracking the package.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TrackingAddress {
    @SerializedName("city")
    private String city = null;
    @SerializedName("state")
    private String state = null;
    @SerializedName("country")
    private String country = null;

    public TrackingAddress city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The city.
     *
     * @return city
     **/
    @Schema(required = true, description = "The city.")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public TrackingAddress state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state.
     *
     * @return state
     **/
    @Schema(required = true, description = "The state.")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TrackingAddress country(String country) {
        this.country = country;
        return this;
    }

    /**
     * The country.
     *
     * @return country
     **/
    @Schema(required = true, description = "The country.")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrackingAddress trackingAddress = (TrackingAddress) o;
        return Objects.equals(this.city, trackingAddress.city) &&
                Objects.equals(this.state, trackingAddress.state) &&
                Objects.equals(this.country, trackingAddress.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, state, country);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrackingAddress {\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
