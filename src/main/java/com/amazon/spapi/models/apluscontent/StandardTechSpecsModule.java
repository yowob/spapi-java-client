package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The standard table of technical feature names and definitions.
 */
@Schema(description = "The standard table of technical feature names and definitions.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardTechSpecsModule {
    @SerializedName("headline")
    private TextComponent headline = null;
    @SerializedName("specificationList")
    private List<StandardTextPairBlock> specificationList = new ArrayList<StandardTextPairBlock>();
    @SerializedName("tableCount")
    private Integer tableCount = null;

    public StandardTechSpecsModule headline(TextComponent headline) {
        this.headline = headline;
        return this;
    }

    /**
     * Get headline
     *
     * @return headline
     **/
    @Schema(description = "")
    public TextComponent getHeadline() {
        return headline;
    }

    public void setHeadline(TextComponent headline) {
        this.headline = headline;
    }

    public StandardTechSpecsModule specificationList(List<StandardTextPairBlock> specificationList) {
        this.specificationList = specificationList;
        return this;
    }

    public StandardTechSpecsModule addSpecificationListItem(StandardTextPairBlock specificationListItem) {
        this.specificationList.add(specificationListItem);
        return this;
    }

    /**
     * The specification list.
     *
     * @return specificationList
     **/
    @Schema(required = true, description = "The specification list.")
    public List<StandardTextPairBlock> getSpecificationList() {
        return specificationList;
    }

    public void setSpecificationList(List<StandardTextPairBlock> specificationList) {
        this.specificationList = specificationList;
    }

    public StandardTechSpecsModule tableCount(Integer tableCount) {
        this.tableCount = tableCount;
        return this;
    }

    /**
     * The number of tables to present. Features are evenly divided between the tables.
     * minimum: 1
     * maximum: 2
     *
     * @return tableCount
     **/
    @Schema(description = "The number of tables to present. Features are evenly divided between the tables.")
    public Integer getTableCount() {
        return tableCount;
    }

    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardTechSpecsModule standardTechSpecsModule = (StandardTechSpecsModule) o;
        return Objects.equals(this.headline, standardTechSpecsModule.headline) &&
                Objects.equals(this.specificationList, standardTechSpecsModule.specificationList) &&
                Objects.equals(this.tableCount, standardTechSpecsModule.tableCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headline, specificationList, tableCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardTechSpecsModule {\n");
        sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
        sb.append("    specificationList: ").append(toIndentedString(specificationList)).append("\n");
        sb.append("    tableCount: ").append(toIndentedString(tableCount)).append("\n");
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
