package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetInboundGuidanceResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetInboundGuidanceResult {
    @SerializedName("SKUInboundGuidanceList")
    private SKUInboundGuidanceList skUInboundGuidanceList = null;
    @SerializedName("InvalidSKUList")
    private InvalidSKUList invalidSKUList = null;
    @SerializedName("ASINInboundGuidanceList")
    private ASINInboundGuidanceList asINInboundGuidanceList = null;
    @SerializedName("InvalidASINList")
    private InvalidASINList invalidASINList = null;

    public GetInboundGuidanceResult skUInboundGuidanceList(SKUInboundGuidanceList skUInboundGuidanceList) {
        this.skUInboundGuidanceList = skUInboundGuidanceList;
        return this;
    }

    /**
     * Get skUInboundGuidanceList
     *
     * @return skUInboundGuidanceList
     **/
    @Schema(description = "")
    public SKUInboundGuidanceList getSkUInboundGuidanceList() {
        return skUInboundGuidanceList;
    }

    public void setSkUInboundGuidanceList(SKUInboundGuidanceList skUInboundGuidanceList) {
        this.skUInboundGuidanceList = skUInboundGuidanceList;
    }

    public GetInboundGuidanceResult invalidSKUList(InvalidSKUList invalidSKUList) {
        this.invalidSKUList = invalidSKUList;
        return this;
    }

    /**
     * Get invalidSKUList
     *
     * @return invalidSKUList
     **/
    @Schema(description = "")
    public InvalidSKUList getInvalidSKUList() {
        return invalidSKUList;
    }

    public void setInvalidSKUList(InvalidSKUList invalidSKUList) {
        this.invalidSKUList = invalidSKUList;
    }

    public GetInboundGuidanceResult asINInboundGuidanceList(ASINInboundGuidanceList asINInboundGuidanceList) {
        this.asINInboundGuidanceList = asINInboundGuidanceList;
        return this;
    }

    /**
     * Get asINInboundGuidanceList
     *
     * @return asINInboundGuidanceList
     **/
    @Schema(description = "")
    public ASINInboundGuidanceList getAsINInboundGuidanceList() {
        return asINInboundGuidanceList;
    }

    public void setAsINInboundGuidanceList(ASINInboundGuidanceList asINInboundGuidanceList) {
        this.asINInboundGuidanceList = asINInboundGuidanceList;
    }

    public GetInboundGuidanceResult invalidASINList(InvalidASINList invalidASINList) {
        this.invalidASINList = invalidASINList;
        return this;
    }

    /**
     * Get invalidASINList
     *
     * @return invalidASINList
     **/
    @Schema(description = "")
    public InvalidASINList getInvalidASINList() {
        return invalidASINList;
    }

    public void setInvalidASINList(InvalidASINList invalidASINList) {
        this.invalidASINList = invalidASINList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetInboundGuidanceResult getInboundGuidanceResult = (GetInboundGuidanceResult) o;
        return Objects.equals(this.skUInboundGuidanceList, getInboundGuidanceResult.skUInboundGuidanceList) &&
                Objects.equals(this.invalidSKUList, getInboundGuidanceResult.invalidSKUList) &&
                Objects.equals(this.asINInboundGuidanceList, getInboundGuidanceResult.asINInboundGuidanceList) &&
                Objects.equals(this.invalidASINList, getInboundGuidanceResult.invalidASINList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skUInboundGuidanceList, invalidSKUList, asINInboundGuidanceList, invalidASINList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetInboundGuidanceResult {\n");
        sb.append("    skUInboundGuidanceList: ").append(toIndentedString(skUInboundGuidanceList)).append("\n");
        sb.append("    invalidSKUList: ").append(toIndentedString(invalidSKUList)).append("\n");
        sb.append("    asINInboundGuidanceList: ").append(toIndentedString(asINInboundGuidanceList)).append("\n");
        sb.append("    invalidASINList: ").append(toIndentedString(invalidASINList)).append("\n");
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
