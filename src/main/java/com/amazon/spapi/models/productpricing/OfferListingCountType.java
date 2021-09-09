package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The number of offer listings with the specified condition.
 */
@Schema(description = "The number of offer listings with the specified condition.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class OfferListingCountType {
    @SerializedName("Count")
    private Integer count = null;
    @SerializedName("condition")
    private String condition = null;

    public OfferListingCountType count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * The number of offer listings.
     *
     * @return count
     **/
    @Schema(required = true, description = "The number of offer listings.")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public OfferListingCountType condition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * The condition of the item.
     *
     * @return condition
     **/
    @Schema(required = true, description = "The condition of the item.")
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OfferListingCountType offerListingCountType = (OfferListingCountType) o;
        return Objects.equals(this.count, offerListingCountType.count) &&
                Objects.equals(this.condition, offerListingCountType.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, condition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferListingCountType {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
