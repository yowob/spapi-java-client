package com.amazon.spapi.models.sellers;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Detailed information that is specific to a seller in a Marketplace.
 */
@Schema(description = "Detailed information that is specific to a seller in a Marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Participation {
    @SerializedName("isParticipating")
    private Boolean isParticipating = null;
    @SerializedName("hasSuspendedListings")
    private Boolean hasSuspendedListings = null;

    public Participation isParticipating(Boolean isParticipating) {
        this.isParticipating = isParticipating;
        return this;
    }

    /**
     * Get isParticipating
     *
     * @return isParticipating
     **/
    @Schema(required = true, description = "")
    public Boolean isIsParticipating() {
        return isParticipating;
    }

    public void setIsParticipating(Boolean isParticipating) {
        this.isParticipating = isParticipating;
    }

    public Participation hasSuspendedListings(Boolean hasSuspendedListings) {
        this.hasSuspendedListings = hasSuspendedListings;
        return this;
    }

    /**
     * Specifies if the seller has suspended listings. True if the seller Listing Status is set to Inactive, otherwise False.
     *
     * @return hasSuspendedListings
     **/
    @Schema(required = true, description = "Specifies if the seller has suspended listings. True if the seller Listing Status is set to Inactive, otherwise False.")
    public Boolean isHasSuspendedListings() {
        return hasSuspendedListings;
    }

    public void setHasSuspendedListings(Boolean hasSuspendedListings) {
        this.hasSuspendedListings = hasSuspendedListings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Participation participation = (Participation) o;
        return Objects.equals(this.isParticipating, participation.isParticipating) &&
                Objects.equals(this.hasSuspendedListings, participation.hasSuspendedListings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isParticipating, hasSuspendedListings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Participation {\n");
        sb.append("    isParticipating: ").append(toIndentedString(isParticipating)).append("\n");
        sb.append("    hasSuspendedListings: ").append(toIndentedString(hasSuspendedListings)).append("\n");
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
