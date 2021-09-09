package com.amazon.spapi.models.catalogitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Description of a classification that can be used to get more fine-grained search results.
 */
@Schema(description = "Description of a classification that can be used to get more fine-grained search results.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ClassificationRefinement {
    @SerializedName("numberOfResults")
    private Integer numberOfResults = null;
    @SerializedName("displayName")
    private String displayName = null;
    @SerializedName("classificationId")
    private String classificationId = null;

    public ClassificationRefinement numberOfResults(Integer numberOfResults) {
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

    public ClassificationRefinement displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name for the classification.
     *
     * @return displayName
     **/
    @Schema(required = true, description = "Display name for the classification.")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ClassificationRefinement classificationId(String classificationId) {
        this.classificationId = classificationId;
        return this;
    }

    /**
     * Identifier for the classification that can be used for search refinement purposes.
     *
     * @return classificationId
     **/
    @Schema(required = true, description = "Identifier for the classification that can be used for search refinement purposes.")
    public String getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(String classificationId) {
        this.classificationId = classificationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClassificationRefinement classificationRefinement = (ClassificationRefinement) o;
        return Objects.equals(this.numberOfResults, classificationRefinement.numberOfResults) &&
                Objects.equals(this.displayName, classificationRefinement.displayName) &&
                Objects.equals(this.classificationId, classificationRefinement.classificationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfResults, displayName, classificationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClassificationRefinement {\n");
        sb.append("    numberOfResults: ").append(toIndentedString(numberOfResults)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    classificationId: ").append(toIndentedString(classificationId)).append("\n");
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
