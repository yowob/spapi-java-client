package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information about the seller&#x27;s feedback, including the percentage of positive feedback, and the total number of ratings received.
 */
@Schema(description = "Information about the seller's feedback, including the percentage of positive feedback, and the total number of ratings received.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SellerFeedbackType {
    @SerializedName("SellerPositiveFeedbackRating")
    private Double sellerPositiveFeedbackRating = null;
    @SerializedName("FeedbackCount")
    private Long feedbackCount = null;

    public SellerFeedbackType sellerPositiveFeedbackRating(Double sellerPositiveFeedbackRating) {
        this.sellerPositiveFeedbackRating = sellerPositiveFeedbackRating;
        return this;
    }

    /**
     * The percentage of positive feedback for the seller in the past 365 days.
     *
     * @return sellerPositiveFeedbackRating
     **/
    @Schema(description = "The percentage of positive feedback for the seller in the past 365 days.")
    public Double getSellerPositiveFeedbackRating() {
        return sellerPositiveFeedbackRating;
    }

    public void setSellerPositiveFeedbackRating(Double sellerPositiveFeedbackRating) {
        this.sellerPositiveFeedbackRating = sellerPositiveFeedbackRating;
    }

    public SellerFeedbackType feedbackCount(Long feedbackCount) {
        this.feedbackCount = feedbackCount;
        return this;
    }

    /**
     * The number of ratings received about the seller.
     *
     * @return feedbackCount
     **/
    @Schema(required = true, description = "The number of ratings received about the seller.")
    public Long getFeedbackCount() {
        return feedbackCount;
    }

    public void setFeedbackCount(Long feedbackCount) {
        this.feedbackCount = feedbackCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SellerFeedbackType sellerFeedbackType = (SellerFeedbackType) o;
        return Objects.equals(this.sellerPositiveFeedbackRating, sellerFeedbackType.sellerPositiveFeedbackRating) &&
                Objects.equals(this.feedbackCount, sellerFeedbackType.feedbackCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerPositiveFeedbackRating, feedbackCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SellerFeedbackType {\n");
        sb.append("    sellerPositiveFeedbackRating: ").append(toIndentedString(sellerPositiveFeedbackRating)).append("\n");
        sb.append("    feedbackCount: ").append(toIndentedString(feedbackCount)).append("\n");
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
