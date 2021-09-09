package com.amazon.spapi.models.definitionsproducttypes;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The version details for an Amazon product type.
 */
@Schema(description = "The version details for an Amazon product type.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ProductTypeVersion {
    @SerializedName("version")
    private String version = null;
    @SerializedName("latest")
    private Boolean latest = null;
    @SerializedName("releaseCandidate")
    private Boolean releaseCandidate = null;

    public ProductTypeVersion version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Version identifier.
     *
     * @return version
     **/
    @Schema(required = true, description = "Version identifier.")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ProductTypeVersion latest(Boolean latest) {
        this.latest = latest;
        return this;
    }

    /**
     * When true, the version indicated by the version identifier is the latest available for the Amazon product type.
     *
     * @return latest
     **/
    @Schema(required = true, description = "When true, the version indicated by the version identifier is the latest available for the Amazon product type.")
    public Boolean isLatest() {
        return latest;
    }

    public void setLatest(Boolean latest) {
        this.latest = latest;
    }

    public ProductTypeVersion releaseCandidate(Boolean releaseCandidate) {
        this.releaseCandidate = releaseCandidate;
        return this;
    }

    /**
     * When true, the version indicated by the version identifier is the prerelease (release candidate) for the Amazon product type.
     *
     * @return releaseCandidate
     **/
    @Schema(description = "When true, the version indicated by the version identifier is the prerelease (release candidate) for the Amazon product type.")
    public Boolean isReleaseCandidate() {
        return releaseCandidate;
    }

    public void setReleaseCandidate(Boolean releaseCandidate) {
        this.releaseCandidate = releaseCandidate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductTypeVersion productTypeVersion = (ProductTypeVersion) o;
        return Objects.equals(this.version, productTypeVersion.version) &&
                Objects.equals(this.latest, productTypeVersion.latest) &&
                Objects.equals(this.releaseCandidate, productTypeVersion.releaseCandidate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, latest, releaseCandidate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductTypeVersion {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
        sb.append("    releaseCandidate: ").append(toIndentedString(releaseCandidate)).append("\n");
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
