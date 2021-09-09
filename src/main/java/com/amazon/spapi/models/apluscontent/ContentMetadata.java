package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * The metadata of an A+ Content document.
 */
@Schema(description = "The metadata of an A+ Content document.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ContentMetadata {
    @SerializedName("name")
    private String name = null;
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("status")
    private ContentStatus status = null;
    @SerializedName("badgeSet")
    private ContentBadgeSet badgeSet = null;
    @SerializedName("updateTime")
    private OffsetDateTime updateTime = null;

    public ContentMetadata name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The A+ Content document name.
     *
     * @return name
     **/
    @Schema(required = true, description = "The A+ Content document name.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContentMetadata marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get marketplaceId
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public ContentMetadata status(ContentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(required = true, description = "")
    public ContentStatus getStatus() {
        return status;
    }

    public void setStatus(ContentStatus status) {
        this.status = status;
    }

    public ContentMetadata badgeSet(ContentBadgeSet badgeSet) {
        this.badgeSet = badgeSet;
        return this;
    }

    /**
     * Get badgeSet
     *
     * @return badgeSet
     **/
    @Schema(required = true, description = "")
    public ContentBadgeSet getBadgeSet() {
        return badgeSet;
    }

    public void setBadgeSet(ContentBadgeSet badgeSet) {
        this.badgeSet = badgeSet;
    }

    public ContentMetadata updateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * The approximate age of the A+ Content document and metadata.
     *
     * @return updateTime
     **/
    @Schema(required = true, description = "The approximate age of the A+ Content document and metadata.")
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentMetadata contentMetadata = (ContentMetadata) o;
        return Objects.equals(this.name, contentMetadata.name) &&
                Objects.equals(this.marketplaceId, contentMetadata.marketplaceId) &&
                Objects.equals(this.status, contentMetadata.status) &&
                Objects.equals(this.badgeSet, contentMetadata.badgeSet) &&
                Objects.equals(this.updateTime, contentMetadata.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marketplaceId, status, badgeSet, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    badgeSet: ").append(toIndentedString(badgeSet)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
