package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The standard product comparison table.
 */
@Schema(description = "The standard product comparison table.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardComparisonTableModule {
    @SerializedName("productColumns")
    private List<StandardComparisonProductBlock> productColumns = null;
    @SerializedName("metricRowLabels")
    private List<PlainTextItem> metricRowLabels = null;

    public StandardComparisonTableModule productColumns(List<StandardComparisonProductBlock> productColumns) {
        this.productColumns = productColumns;
        return this;
    }

    public StandardComparisonTableModule addProductColumnsItem(StandardComparisonProductBlock productColumnsItem) {
        if (this.productColumns == null) {
            this.productColumns = new ArrayList<StandardComparisonProductBlock>();
        }
        this.productColumns.add(productColumnsItem);
        return this;
    }

    /**
     * Get productColumns
     *
     * @return productColumns
     **/
    @Schema(description = "")
    public List<StandardComparisonProductBlock> getProductColumns() {
        return productColumns;
    }

    public void setProductColumns(List<StandardComparisonProductBlock> productColumns) {
        this.productColumns = productColumns;
    }

    public StandardComparisonTableModule metricRowLabels(List<PlainTextItem> metricRowLabels) {
        this.metricRowLabels = metricRowLabels;
        return this;
    }

    public StandardComparisonTableModule addMetricRowLabelsItem(PlainTextItem metricRowLabelsItem) {
        if (this.metricRowLabels == null) {
            this.metricRowLabels = new ArrayList<PlainTextItem>();
        }
        this.metricRowLabels.add(metricRowLabelsItem);
        return this;
    }

    /**
     * Get metricRowLabels
     *
     * @return metricRowLabels
     **/
    @Schema(description = "")
    public List<PlainTextItem> getMetricRowLabels() {
        return metricRowLabels;
    }

    public void setMetricRowLabels(List<PlainTextItem> metricRowLabels) {
        this.metricRowLabels = metricRowLabels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardComparisonTableModule standardComparisonTableModule = (StandardComparisonTableModule) o;
        return Objects.equals(this.productColumns, standardComparisonTableModule.productColumns) &&
                Objects.equals(this.metricRowLabels, standardComparisonTableModule.metricRowLabels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productColumns, metricRowLabels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardComparisonTableModule {\n");
        sb.append("    productColumns: ").append(toIndentedString(productColumns)).append("\n");
        sb.append("    metricRowLabels: ").append(toIndentedString(metricRowLabels)).append("\n");
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
