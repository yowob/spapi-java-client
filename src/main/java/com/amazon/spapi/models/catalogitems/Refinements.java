package com.amazon.spapi.models.catalogitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Search refinements.
 */
@Schema(description = "Search refinements.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Refinements {
    @SerializedName("brands")
    private List<BrandRefinement> brands = new ArrayList<BrandRefinement>();
    @SerializedName("classifications")
    private List<ClassificationRefinement> classifications = new ArrayList<ClassificationRefinement>();

    public Refinements brands(List<BrandRefinement> brands) {
        this.brands = brands;
        return this;
    }

    public Refinements addBrandsItem(BrandRefinement brandsItem) {
        this.brands.add(brandsItem);
        return this;
    }

    /**
     * Brand search refinements.
     *
     * @return brands
     **/
    @Schema(required = true, description = "Brand search refinements.")
    public List<BrandRefinement> getBrands() {
        return brands;
    }

    public void setBrands(List<BrandRefinement> brands) {
        this.brands = brands;
    }

    public Refinements classifications(List<ClassificationRefinement> classifications) {
        this.classifications = classifications;
        return this;
    }

    public Refinements addClassificationsItem(ClassificationRefinement classificationsItem) {
        this.classifications.add(classificationsItem);
        return this;
    }

    /**
     * Classification search refinements.
     *
     * @return classifications
     **/
    @Schema(required = true, description = "Classification search refinements.")
    public List<ClassificationRefinement> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<ClassificationRefinement> classifications) {
        this.classifications = classifications;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Refinements refinements = (Refinements) o;
        return Objects.equals(this.brands, refinements.brands) &&
                Objects.equals(this.classifications, refinements.classifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brands, classifications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Refinements {\n");
        sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
        sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
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
