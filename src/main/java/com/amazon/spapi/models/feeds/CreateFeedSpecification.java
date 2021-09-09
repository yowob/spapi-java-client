package com.amazon.spapi.models.feeds;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CreateFeedSpecification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateFeedSpecification {
    @SerializedName("feedType")
    private String feedType = null;
    @SerializedName("marketplaceIds")
    private List<String> marketplaceIds = new ArrayList<String>();
    @SerializedName("inputFeedDocumentId")
    private String inputFeedDocumentId = null;
    @SerializedName("feedOptions")
    private FeedOptions feedOptions = null;

    public CreateFeedSpecification feedType(String feedType) {
        this.feedType = feedType;
        return this;
    }

    /**
     * The feed type.
     *
     * @return feedType
     **/
    @Schema(required = true, description = "The feed type.")
    public String getFeedType() {
        return feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public CreateFeedSpecification marketplaceIds(List<String> marketplaceIds) {
        this.marketplaceIds = marketplaceIds;
        return this;
    }

    public CreateFeedSpecification addMarketplaceIdsItem(String marketplaceIdsItem) {
        this.marketplaceIds.add(marketplaceIdsItem);
        return this;
    }

    /**
     * A list of identifiers for marketplaces that you want the feed to be applied to.
     *
     * @return marketplaceIds
     **/
    @Schema(required = true, description = "A list of identifiers for marketplaces that you want the feed to be applied to.")
    public List<String> getMarketplaceIds() {
        return marketplaceIds;
    }

    public void setMarketplaceIds(List<String> marketplaceIds) {
        this.marketplaceIds = marketplaceIds;
    }

    public CreateFeedSpecification inputFeedDocumentId(String inputFeedDocumentId) {
        this.inputFeedDocumentId = inputFeedDocumentId;
        return this;
    }

    /**
     * The document identifier returned by the createFeedDocument operation. Upload the feed document contents before calling the createFeed operation.
     *
     * @return inputFeedDocumentId
     **/
    @Schema(required = true, description = "The document identifier returned by the createFeedDocument operation. Upload the feed document contents before calling the createFeed operation.")
    public String getInputFeedDocumentId() {
        return inputFeedDocumentId;
    }

    public void setInputFeedDocumentId(String inputFeedDocumentId) {
        this.inputFeedDocumentId = inputFeedDocumentId;
    }

    public CreateFeedSpecification feedOptions(FeedOptions feedOptions) {
        this.feedOptions = feedOptions;
        return this;
    }

    /**
     * Get feedOptions
     *
     * @return feedOptions
     **/
    @Schema(description = "")
    public FeedOptions getFeedOptions() {
        return feedOptions;
    }

    public void setFeedOptions(FeedOptions feedOptions) {
        this.feedOptions = feedOptions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFeedSpecification createFeedSpecification = (CreateFeedSpecification) o;
        return Objects.equals(this.feedType, createFeedSpecification.feedType) &&
                Objects.equals(this.marketplaceIds, createFeedSpecification.marketplaceIds) &&
                Objects.equals(this.inputFeedDocumentId, createFeedSpecification.inputFeedDocumentId) &&
                Objects.equals(this.feedOptions, createFeedSpecification.feedOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedType, marketplaceIds, inputFeedDocumentId, feedOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFeedSpecification {\n");
        sb.append("    feedType: ").append(toIndentedString(feedType)).append("\n");
        sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
        sb.append("    inputFeedDocumentId: ").append(toIndentedString(inputFeedDocumentId)).append("\n");
        sb.append("    feedOptions: ").append(toIndentedString(feedOptions)).append("\n");
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
