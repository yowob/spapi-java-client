package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A list of fulfillment order previews, including estimated shipping weights, estimated shipping fees, and estimated ship dates and arrival dates.
 */
@Schema(description = "A list of fulfillment order previews, including estimated shipping weights, estimated shipping fees, and estimated ship dates and arrival dates.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetFulfillmentPreviewResult {
    @SerializedName("fulfillmentPreviews")
    private FulfillmentPreviewList fulfillmentPreviews = null;

    public GetFulfillmentPreviewResult fulfillmentPreviews(FulfillmentPreviewList fulfillmentPreviews) {
        this.fulfillmentPreviews = fulfillmentPreviews;
        return this;
    }

    /**
     * Get fulfillmentPreviews
     *
     * @return fulfillmentPreviews
     **/
    @Schema(description = "")
    public FulfillmentPreviewList getFulfillmentPreviews() {
        return fulfillmentPreviews;
    }

    public void setFulfillmentPreviews(FulfillmentPreviewList fulfillmentPreviews) {
        this.fulfillmentPreviews = fulfillmentPreviews;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetFulfillmentPreviewResult getFulfillmentPreviewResult = (GetFulfillmentPreviewResult) o;
        return Objects.equals(this.fulfillmentPreviews, getFulfillmentPreviewResult.fulfillmentPreviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fulfillmentPreviews);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFulfillmentPreviewResult {\n");
        sb.append("    fulfillmentPreviews: ").append(toIndentedString(fulfillmentPreviews)).append("\n");
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
