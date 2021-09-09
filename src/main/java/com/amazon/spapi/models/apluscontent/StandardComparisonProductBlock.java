package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The A+ Content standard comparison product block.
 */
@Schema(description = "The A+ Content standard comparison product block.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardComparisonProductBlock {
    @SerializedName("position")
    private Integer position = null;
    @SerializedName("image")
    private ImageComponent image = null;
    @SerializedName("title")
    private String title = null;
    @SerializedName("asin")
    private String asin = null;
    @SerializedName("highlight")
    private Boolean highlight = null;
    @SerializedName("metrics")
    private List<PlainTextItem> metrics = null;

    public StandardComparisonProductBlock position(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * The rank or index of this comparison product block within the module. Different blocks cannot occupy the same position within a single module.
     * minimum: 1
     * maximum: 6
     *
     * @return position
     **/
    @Schema(required = true, description = "The rank or index of this comparison product block within the module. Different blocks cannot occupy the same position within a single module.")
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public StandardComparisonProductBlock image(ImageComponent image) {
        this.image = image;
        return this;
    }

    /**
     * Get image
     *
     * @return image
     **/
    @Schema(description = "")
    public ImageComponent getImage() {
        return image;
    }

    public void setImage(ImageComponent image) {
        this.image = image;
    }

    public StandardComparisonProductBlock title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The comparison product title.
     *
     * @return title
     **/
    @Schema(description = "The comparison product title.")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StandardComparisonProductBlock asin(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * Get asin
     *
     * @return asin
     **/
    @Schema(description = "")
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public StandardComparisonProductBlock highlight(Boolean highlight) {
        this.highlight = highlight;
        return this;
    }

    /**
     * Determines whether this block of content is visually highlighted.
     *
     * @return highlight
     **/
    @Schema(description = "Determines whether this block of content is visually highlighted.")
    public Boolean isHighlight() {
        return highlight;
    }

    public void setHighlight(Boolean highlight) {
        this.highlight = highlight;
    }

    public StandardComparisonProductBlock metrics(List<PlainTextItem> metrics) {
        this.metrics = metrics;
        return this;
    }

    public StandardComparisonProductBlock addMetricsItem(PlainTextItem metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<PlainTextItem>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    /**
     * Comparison metrics for the product.
     *
     * @return metrics
     **/
    @Schema(description = "Comparison metrics for the product.")
    public List<PlainTextItem> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<PlainTextItem> metrics) {
        this.metrics = metrics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardComparisonProductBlock standardComparisonProductBlock = (StandardComparisonProductBlock) o;
        return Objects.equals(this.position, standardComparisonProductBlock.position) &&
                Objects.equals(this.image, standardComparisonProductBlock.image) &&
                Objects.equals(this.title, standardComparisonProductBlock.title) &&
                Objects.equals(this.asin, standardComparisonProductBlock.asin) &&
                Objects.equals(this.highlight, standardComparisonProductBlock.highlight) &&
                Objects.equals(this.metrics, standardComparisonProductBlock.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, image, title, asin, highlight, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardComparisonProductBlock {\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
        sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
