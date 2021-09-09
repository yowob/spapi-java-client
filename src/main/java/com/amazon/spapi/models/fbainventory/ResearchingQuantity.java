package com.amazon.spapi.models.fbainventory;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The number of misplaced or warehouse damaged units that are actively being confirmed at our fulfillment centers.
 */
@Schema(description = "The number of misplaced or warehouse damaged units that are actively being confirmed at our fulfillment centers.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ResearchingQuantity {
    @SerializedName("totalResearchingQuantity")
    private Integer totalResearchingQuantity = null;
    @SerializedName("researchingQuantityBreakdown")
    private List<ResearchingQuantityEntry> researchingQuantityBreakdown = null;

    public ResearchingQuantity totalResearchingQuantity(Integer totalResearchingQuantity) {
        this.totalResearchingQuantity = totalResearchingQuantity;
        return this;
    }

    /**
     * The total number of units currently being researched in Amazon&#x27;s fulfillment network.
     *
     * @return totalResearchingQuantity
     **/
    @Schema(description = "The total number of units currently being researched in Amazon's fulfillment network.")
    public Integer getTotalResearchingQuantity() {
        return totalResearchingQuantity;
    }

    public void setTotalResearchingQuantity(Integer totalResearchingQuantity) {
        this.totalResearchingQuantity = totalResearchingQuantity;
    }

    public ResearchingQuantity researchingQuantityBreakdown(List<ResearchingQuantityEntry> researchingQuantityBreakdown) {
        this.researchingQuantityBreakdown = researchingQuantityBreakdown;
        return this;
    }

    public ResearchingQuantity addResearchingQuantityBreakdownItem(ResearchingQuantityEntry researchingQuantityBreakdownItem) {
        if (this.researchingQuantityBreakdown == null) {
            this.researchingQuantityBreakdown = new ArrayList<ResearchingQuantityEntry>();
        }
        this.researchingQuantityBreakdown.add(researchingQuantityBreakdownItem);
        return this;
    }

    /**
     * A list of quantity details for items currently being researched.
     *
     * @return researchingQuantityBreakdown
     **/
    @Schema(description = "A list of quantity details for items currently being researched.")
    public List<ResearchingQuantityEntry> getResearchingQuantityBreakdown() {
        return researchingQuantityBreakdown;
    }

    public void setResearchingQuantityBreakdown(List<ResearchingQuantityEntry> researchingQuantityBreakdown) {
        this.researchingQuantityBreakdown = researchingQuantityBreakdown;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResearchingQuantity researchingQuantity = (ResearchingQuantity) o;
        return Objects.equals(this.totalResearchingQuantity, researchingQuantity.totalResearchingQuantity) &&
                Objects.equals(this.researchingQuantityBreakdown, researchingQuantity.researchingQuantityBreakdown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalResearchingQuantity, researchingQuantityBreakdown);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResearchingQuantity {\n");
        sb.append("    totalResearchingQuantity: ").append(toIndentedString(totalResearchingQuantity)).append("\n");
        sb.append("    researchingQuantityBreakdown: ").append(toIndentedString(researchingQuantityBreakdown)).append("\n");
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
