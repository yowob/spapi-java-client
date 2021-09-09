package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * An A+ Content module. An A+ Content document is composed of content modules. The contentModuleType property selects which content module types to use.
 */
@Schema(description = "An A+ Content module. An A+ Content document is composed of content modules. The contentModuleType property selects which content module types to use.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ContentModule {
    @SerializedName("contentModuleType")
    private ContentModuleType contentModuleType = null;
    @SerializedName("standardCompanyLogo")
    private StandardCompanyLogoModule standardCompanyLogo = null;
    @SerializedName("standardComparisonTable")
    private StandardComparisonTableModule standardComparisonTable = null;
    @SerializedName("standardFourImageText")
    private StandardFourImageTextModule standardFourImageText = null;
    @SerializedName("standardFourImageTextQuadrant")
    private StandardFourImageTextQuadrantModule standardFourImageTextQuadrant = null;
    @SerializedName("standardHeaderImageText")
    private StandardHeaderImageTextModule standardHeaderImageText = null;
    @SerializedName("standardImageSidebar")
    private StandardImageSidebarModule standardImageSidebar = null;
    @SerializedName("standardImageTextOverlay")
    private StandardImageTextOverlayModule standardImageTextOverlay = null;
    @SerializedName("standardMultipleImageText")
    private StandardMultipleImageTextModule standardMultipleImageText = null;
    @SerializedName("standardProductDescription")
    private StandardProductDescriptionModule standardProductDescription = null;
    @SerializedName("standardSingleImageHighlights")
    private StandardSingleImageHighlightsModule standardSingleImageHighlights = null;
    @SerializedName("standardSingleImageSpecsDetail")
    private StandardSingleImageSpecsDetailModule standardSingleImageSpecsDetail = null;
    @SerializedName("standardSingleSideImage")
    private StandardSingleSideImageModule standardSingleSideImage = null;
    @SerializedName("standardTechSpecs")
    private StandardTechSpecsModule standardTechSpecs = null;
    @SerializedName("standardText")
    private StandardTextModule standardText = null;
    @SerializedName("standardThreeImageText")
    private StandardThreeImageTextModule standardThreeImageText = null;

    public ContentModule contentModuleType(ContentModuleType contentModuleType) {
        this.contentModuleType = contentModuleType;
        return this;
    }

    /**
     * Get contentModuleType
     *
     * @return contentModuleType
     **/
    @Schema(required = true, description = "")
    public ContentModuleType getContentModuleType() {
        return contentModuleType;
    }

    public void setContentModuleType(ContentModuleType contentModuleType) {
        this.contentModuleType = contentModuleType;
    }

    public ContentModule standardCompanyLogo(StandardCompanyLogoModule standardCompanyLogo) {
        this.standardCompanyLogo = standardCompanyLogo;
        return this;
    }

    /**
     * Get standardCompanyLogo
     *
     * @return standardCompanyLogo
     **/
    @Schema(description = "")
    public StandardCompanyLogoModule getStandardCompanyLogo() {
        return standardCompanyLogo;
    }

    public void setStandardCompanyLogo(StandardCompanyLogoModule standardCompanyLogo) {
        this.standardCompanyLogo = standardCompanyLogo;
    }

    public ContentModule standardComparisonTable(StandardComparisonTableModule standardComparisonTable) {
        this.standardComparisonTable = standardComparisonTable;
        return this;
    }

    /**
     * Get standardComparisonTable
     *
     * @return standardComparisonTable
     **/
    @Schema(description = "")
    public StandardComparisonTableModule getStandardComparisonTable() {
        return standardComparisonTable;
    }

    public void setStandardComparisonTable(StandardComparisonTableModule standardComparisonTable) {
        this.standardComparisonTable = standardComparisonTable;
    }

    public ContentModule standardFourImageText(StandardFourImageTextModule standardFourImageText) {
        this.standardFourImageText = standardFourImageText;
        return this;
    }

    /**
     * Get standardFourImageText
     *
     * @return standardFourImageText
     **/
    @Schema(description = "")
    public StandardFourImageTextModule getStandardFourImageText() {
        return standardFourImageText;
    }

    public void setStandardFourImageText(StandardFourImageTextModule standardFourImageText) {
        this.standardFourImageText = standardFourImageText;
    }

    public ContentModule standardFourImageTextQuadrant(StandardFourImageTextQuadrantModule standardFourImageTextQuadrant) {
        this.standardFourImageTextQuadrant = standardFourImageTextQuadrant;
        return this;
    }

    /**
     * Get standardFourImageTextQuadrant
     *
     * @return standardFourImageTextQuadrant
     **/
    @Schema(description = "")
    public StandardFourImageTextQuadrantModule getStandardFourImageTextQuadrant() {
        return standardFourImageTextQuadrant;
    }

    public void setStandardFourImageTextQuadrant(StandardFourImageTextQuadrantModule standardFourImageTextQuadrant) {
        this.standardFourImageTextQuadrant = standardFourImageTextQuadrant;
    }

    public ContentModule standardHeaderImageText(StandardHeaderImageTextModule standardHeaderImageText) {
        this.standardHeaderImageText = standardHeaderImageText;
        return this;
    }

    /**
     * Get standardHeaderImageText
     *
     * @return standardHeaderImageText
     **/
    @Schema(description = "")
    public StandardHeaderImageTextModule getStandardHeaderImageText() {
        return standardHeaderImageText;
    }

    public void setStandardHeaderImageText(StandardHeaderImageTextModule standardHeaderImageText) {
        this.standardHeaderImageText = standardHeaderImageText;
    }

    public ContentModule standardImageSidebar(StandardImageSidebarModule standardImageSidebar) {
        this.standardImageSidebar = standardImageSidebar;
        return this;
    }

    /**
     * Get standardImageSidebar
     *
     * @return standardImageSidebar
     **/
    @Schema(description = "")
    public StandardImageSidebarModule getStandardImageSidebar() {
        return standardImageSidebar;
    }

    public void setStandardImageSidebar(StandardImageSidebarModule standardImageSidebar) {
        this.standardImageSidebar = standardImageSidebar;
    }

    public ContentModule standardImageTextOverlay(StandardImageTextOverlayModule standardImageTextOverlay) {
        this.standardImageTextOverlay = standardImageTextOverlay;
        return this;
    }

    /**
     * Get standardImageTextOverlay
     *
     * @return standardImageTextOverlay
     **/
    @Schema(description = "")
    public StandardImageTextOverlayModule getStandardImageTextOverlay() {
        return standardImageTextOverlay;
    }

    public void setStandardImageTextOverlay(StandardImageTextOverlayModule standardImageTextOverlay) {
        this.standardImageTextOverlay = standardImageTextOverlay;
    }

    public ContentModule standardMultipleImageText(StandardMultipleImageTextModule standardMultipleImageText) {
        this.standardMultipleImageText = standardMultipleImageText;
        return this;
    }

    /**
     * Get standardMultipleImageText
     *
     * @return standardMultipleImageText
     **/
    @Schema(description = "")
    public StandardMultipleImageTextModule getStandardMultipleImageText() {
        return standardMultipleImageText;
    }

    public void setStandardMultipleImageText(StandardMultipleImageTextModule standardMultipleImageText) {
        this.standardMultipleImageText = standardMultipleImageText;
    }

    public ContentModule standardProductDescription(StandardProductDescriptionModule standardProductDescription) {
        this.standardProductDescription = standardProductDescription;
        return this;
    }

    /**
     * Get standardProductDescription
     *
     * @return standardProductDescription
     **/
    @Schema(description = "")
    public StandardProductDescriptionModule getStandardProductDescription() {
        return standardProductDescription;
    }

    public void setStandardProductDescription(StandardProductDescriptionModule standardProductDescription) {
        this.standardProductDescription = standardProductDescription;
    }

    public ContentModule standardSingleImageHighlights(StandardSingleImageHighlightsModule standardSingleImageHighlights) {
        this.standardSingleImageHighlights = standardSingleImageHighlights;
        return this;
    }

    /**
     * Get standardSingleImageHighlights
     *
     * @return standardSingleImageHighlights
     **/
    @Schema(description = "")
    public StandardSingleImageHighlightsModule getStandardSingleImageHighlights() {
        return standardSingleImageHighlights;
    }

    public void setStandardSingleImageHighlights(StandardSingleImageHighlightsModule standardSingleImageHighlights) {
        this.standardSingleImageHighlights = standardSingleImageHighlights;
    }

    public ContentModule standardSingleImageSpecsDetail(StandardSingleImageSpecsDetailModule standardSingleImageSpecsDetail) {
        this.standardSingleImageSpecsDetail = standardSingleImageSpecsDetail;
        return this;
    }

    /**
     * Get standardSingleImageSpecsDetail
     *
     * @return standardSingleImageSpecsDetail
     **/
    @Schema(description = "")
    public StandardSingleImageSpecsDetailModule getStandardSingleImageSpecsDetail() {
        return standardSingleImageSpecsDetail;
    }

    public void setStandardSingleImageSpecsDetail(StandardSingleImageSpecsDetailModule standardSingleImageSpecsDetail) {
        this.standardSingleImageSpecsDetail = standardSingleImageSpecsDetail;
    }

    public ContentModule standardSingleSideImage(StandardSingleSideImageModule standardSingleSideImage) {
        this.standardSingleSideImage = standardSingleSideImage;
        return this;
    }

    /**
     * Get standardSingleSideImage
     *
     * @return standardSingleSideImage
     **/
    @Schema(description = "")
    public StandardSingleSideImageModule getStandardSingleSideImage() {
        return standardSingleSideImage;
    }

    public void setStandardSingleSideImage(StandardSingleSideImageModule standardSingleSideImage) {
        this.standardSingleSideImage = standardSingleSideImage;
    }

    public ContentModule standardTechSpecs(StandardTechSpecsModule standardTechSpecs) {
        this.standardTechSpecs = standardTechSpecs;
        return this;
    }

    /**
     * Get standardTechSpecs
     *
     * @return standardTechSpecs
     **/
    @Schema(description = "")
    public StandardTechSpecsModule getStandardTechSpecs() {
        return standardTechSpecs;
    }

    public void setStandardTechSpecs(StandardTechSpecsModule standardTechSpecs) {
        this.standardTechSpecs = standardTechSpecs;
    }

    public ContentModule standardText(StandardTextModule standardText) {
        this.standardText = standardText;
        return this;
    }

    /**
     * Get standardText
     *
     * @return standardText
     **/
    @Schema(description = "")
    public StandardTextModule getStandardText() {
        return standardText;
    }

    public void setStandardText(StandardTextModule standardText) {
        this.standardText = standardText;
    }

    public ContentModule standardThreeImageText(StandardThreeImageTextModule standardThreeImageText) {
        this.standardThreeImageText = standardThreeImageText;
        return this;
    }

    /**
     * Get standardThreeImageText
     *
     * @return standardThreeImageText
     **/
    @Schema(description = "")
    public StandardThreeImageTextModule getStandardThreeImageText() {
        return standardThreeImageText;
    }

    public void setStandardThreeImageText(StandardThreeImageTextModule standardThreeImageText) {
        this.standardThreeImageText = standardThreeImageText;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentModule contentModule = (ContentModule) o;
        return Objects.equals(this.contentModuleType, contentModule.contentModuleType) &&
                Objects.equals(this.standardCompanyLogo, contentModule.standardCompanyLogo) &&
                Objects.equals(this.standardComparisonTable, contentModule.standardComparisonTable) &&
                Objects.equals(this.standardFourImageText, contentModule.standardFourImageText) &&
                Objects.equals(this.standardFourImageTextQuadrant, contentModule.standardFourImageTextQuadrant) &&
                Objects.equals(this.standardHeaderImageText, contentModule.standardHeaderImageText) &&
                Objects.equals(this.standardImageSidebar, contentModule.standardImageSidebar) &&
                Objects.equals(this.standardImageTextOverlay, contentModule.standardImageTextOverlay) &&
                Objects.equals(this.standardMultipleImageText, contentModule.standardMultipleImageText) &&
                Objects.equals(this.standardProductDescription, contentModule.standardProductDescription) &&
                Objects.equals(this.standardSingleImageHighlights, contentModule.standardSingleImageHighlights) &&
                Objects.equals(this.standardSingleImageSpecsDetail, contentModule.standardSingleImageSpecsDetail) &&
                Objects.equals(this.standardSingleSideImage, contentModule.standardSingleSideImage) &&
                Objects.equals(this.standardTechSpecs, contentModule.standardTechSpecs) &&
                Objects.equals(this.standardText, contentModule.standardText) &&
                Objects.equals(this.standardThreeImageText, contentModule.standardThreeImageText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentModuleType, standardCompanyLogo, standardComparisonTable, standardFourImageText, standardFourImageTextQuadrant, standardHeaderImageText, standardImageSidebar, standardImageTextOverlay, standardMultipleImageText, standardProductDescription, standardSingleImageHighlights, standardSingleImageSpecsDetail, standardSingleSideImage, standardTechSpecs, standardText, standardThreeImageText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentModule {\n");
        sb.append("    contentModuleType: ").append(toIndentedString(contentModuleType)).append("\n");
        sb.append("    standardCompanyLogo: ").append(toIndentedString(standardCompanyLogo)).append("\n");
        sb.append("    standardComparisonTable: ").append(toIndentedString(standardComparisonTable)).append("\n");
        sb.append("    standardFourImageText: ").append(toIndentedString(standardFourImageText)).append("\n");
        sb.append("    standardFourImageTextQuadrant: ").append(toIndentedString(standardFourImageTextQuadrant)).append("\n");
        sb.append("    standardHeaderImageText: ").append(toIndentedString(standardHeaderImageText)).append("\n");
        sb.append("    standardImageSidebar: ").append(toIndentedString(standardImageSidebar)).append("\n");
        sb.append("    standardImageTextOverlay: ").append(toIndentedString(standardImageTextOverlay)).append("\n");
        sb.append("    standardMultipleImageText: ").append(toIndentedString(standardMultipleImageText)).append("\n");
        sb.append("    standardProductDescription: ").append(toIndentedString(standardProductDescription)).append("\n");
        sb.append("    standardSingleImageHighlights: ").append(toIndentedString(standardSingleImageHighlights)).append("\n");
        sb.append("    standardSingleImageSpecsDetail: ").append(toIndentedString(standardSingleImageSpecsDetail)).append("\n");
        sb.append("    standardSingleSideImage: ").append(toIndentedString(standardSingleSideImage)).append("\n");
        sb.append("    standardTechSpecs: ").append(toIndentedString(standardTechSpecs)).append("\n");
        sb.append("    standardText: ").append(toIndentedString(standardText)).append("\n");
        sb.append("    standardThreeImageText: ").append(toIndentedString(standardThreeImageText)).append("\n");
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
