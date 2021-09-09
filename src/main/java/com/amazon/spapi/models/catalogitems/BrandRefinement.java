package com.amazon.spapi.models.catalogitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Description of a brand that can be used to get more fine-grained search results.
 */
@Schema(description = "Description of a brand that can be used to get more fine-grained search results.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class BrandRefinement {
    @SerializedName("numberOfResults")
    private Integer numberOfResults = null;
    @SerializedName("brandName")
    private String brandName = null;

    public BrandRefinement numberOfResults(Integer numberOfResults) {
        this.numberOfResults = numberOfResults;
        return this;
    }

    /**
     * The estimated number of results that would still be returned if refinement key applied.
     *
     * @return numberOfResults
     **/
    @Schema(required = true, description = "The estimated number of results that would still be returned if refinement key applied.")
    public Integer getNumberOfResults() {
        return numberOfResults;
    }

    public void setNumberOfResults(Integer numberOfResults) {
        this.numberOfResults = numberOfResults;
    }

    public BrandRefinement brandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    /**
     * Brand name. For display and can be used as a search refinement.
     *
     * @return brandName
     **/
    @Schema(required = true, description = "Brand name. For display and can be used as a search refinement.")
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandRefinement brandRefinement = (BrandRefinement) o;
        return Objects.equals(this.numberOfResults, brandRefinement.numberOfResults) &&
                Objects.equals(this.brandName, brandRefinement.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfResults, brandName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandRefinement {\n");
        sb.append("    numberOfResults: ").append(toIndentedString(numberOfResults)).append("\n");
        sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
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
