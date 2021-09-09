package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The state and country from where the item is shipped.
 */
@Schema(description = "The state and country from where the item is shipped.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ShipsFromType {
    @SerializedName("State")
    private String state = null;
    @SerializedName("Country")
    private String country = null;

    public ShipsFromType state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state from where the item is shipped.
     *
     * @return state
     **/
    @Schema(description = "The state from where the item is shipped.")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShipsFromType country(String country) {
        this.country = country;
        return this;
    }

    /**
     * The country from where the item is shipped.
     *
     * @return country
     **/
    @Schema(description = "The country from where the item is shipped.")
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
        ShipsFromType shipsFromType = (ShipsFromType) o;
        return Objects.equals(this.state, shipsFromType.state) &&
                Objects.equals(this.country, shipsFromType.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, country);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipsFromType {\n");
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
