package com.amazon.spapi.models.sellers;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * MarketplaceParticipation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class MarketplaceParticipation {
    @SerializedName("marketplace")
    private Marketplace marketplace = null;
    @SerializedName("participation")
    private Participation participation = null;

    public MarketplaceParticipation marketplace(Marketplace marketplace) {
        this.marketplace = marketplace;
        return this;
    }

    /**
     * Get marketplace
     *
     * @return marketplace
     **/
    @Schema(required = true, description = "")
    public Marketplace getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public MarketplaceParticipation participation(Participation participation) {
        this.participation = participation;
        return this;
    }

    /**
     * Get participation
     *
     * @return participation
     **/
    @Schema(required = true, description = "")
    public Participation getParticipation() {
        return participation;
    }

    public void setParticipation(Participation participation) {
        this.participation = participation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketplaceParticipation marketplaceParticipation = (MarketplaceParticipation) o;
        return Objects.equals(this.marketplace, marketplaceParticipation.marketplace) &&
                Objects.equals(this.participation, marketplaceParticipation.participation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplace, participation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketplaceParticipation {\n");
        sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
        sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
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
