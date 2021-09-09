package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The total number of offers for the specified condition and fulfillment channel.
 */
@Schema(description = "The total number of offers for the specified condition and fulfillment channel.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class OfferCountType {
    @SerializedName("condition")
    private String condition = null;
    @SerializedName("fulfillmentChannel")
    private FulfillmentChannelType fulfillmentChannel = null;
    @SerializedName("OfferCount")
    private Integer offerCount = null;

    public OfferCountType condition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Indicates the condition of the item. For example: New, Used, Collectible, Refurbished, or Club.
     *
     * @return condition
     **/
    @Schema(description = "Indicates the condition of the item. For example: New, Used, Collectible, Refurbished, or Club.")
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public OfferCountType fulfillmentChannel(FulfillmentChannelType fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
        return this;
    }

    /**
     * Get fulfillmentChannel
     *
     * @return fulfillmentChannel
     **/
    @Schema(description = "")
    public FulfillmentChannelType getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    public void setFulfillmentChannel(FulfillmentChannelType fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
    }

    public OfferCountType offerCount(Integer offerCount) {
        this.offerCount = offerCount;
        return this;
    }

    /**
     * The number of offers in a fulfillment channel that meet a specific condition.
     *
     * @return offerCount
     **/
    @Schema(description = "The number of offers in a fulfillment channel that meet a specific condition.")
    public Integer getOfferCount() {
        return offerCount;
    }

    public void setOfferCount(Integer offerCount) {
        this.offerCount = offerCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OfferCountType offerCountType = (OfferCountType) o;
        return Objects.equals(this.condition, offerCountType.condition) &&
                Objects.equals(this.fulfillmentChannel, offerCountType.fulfillmentChannel) &&
                Objects.equals(this.offerCount, offerCountType.offerCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, fulfillmentChannel, offerCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferCountType {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    fulfillmentChannel: ").append(toIndentedString(fulfillmentChannel)).append("\n");
        sb.append("    offerCount: ").append(toIndentedString(offerCount)).append("\n");
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
