package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetPrepInstructionsResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetPrepInstructionsResult {
    @SerializedName("SKUPrepInstructionsList")
    private SKUPrepInstructionsList skUPrepInstructionsList = null;
    @SerializedName("InvalidSKUList")
    private InvalidSKUList invalidSKUList = null;
    @SerializedName("ASINPrepInstructionsList")
    private ASINPrepInstructionsList asINPrepInstructionsList = null;
    @SerializedName("InvalidASINList")
    private InvalidASINList invalidASINList = null;

    public GetPrepInstructionsResult skUPrepInstructionsList(SKUPrepInstructionsList skUPrepInstructionsList) {
        this.skUPrepInstructionsList = skUPrepInstructionsList;
        return this;
    }

    /**
     * Get skUPrepInstructionsList
     *
     * @return skUPrepInstructionsList
     **/
    @Schema(description = "")
    public SKUPrepInstructionsList getSkUPrepInstructionsList() {
        return skUPrepInstructionsList;
    }

    public void setSkUPrepInstructionsList(SKUPrepInstructionsList skUPrepInstructionsList) {
        this.skUPrepInstructionsList = skUPrepInstructionsList;
    }

    public GetPrepInstructionsResult invalidSKUList(InvalidSKUList invalidSKUList) {
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

    public GetPrepInstructionsResult asINPrepInstructionsList(ASINPrepInstructionsList asINPrepInstructionsList) {
        this.asINPrepInstructionsList = asINPrepInstructionsList;
        return this;
    }

    /**
     * Get asINPrepInstructionsList
     *
     * @return asINPrepInstructionsList
     **/
    @Schema(description = "")
    public ASINPrepInstructionsList getAsINPrepInstructionsList() {
        return asINPrepInstructionsList;
    }

    public void setAsINPrepInstructionsList(ASINPrepInstructionsList asINPrepInstructionsList) {
        this.asINPrepInstructionsList = asINPrepInstructionsList;
    }

    public GetPrepInstructionsResult invalidASINList(InvalidASINList invalidASINList) {
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
        GetPrepInstructionsResult getPrepInstructionsResult = (GetPrepInstructionsResult) o;
        return Objects.equals(this.skUPrepInstructionsList, getPrepInstructionsResult.skUPrepInstructionsList) &&
                Objects.equals(this.invalidSKUList, getPrepInstructionsResult.invalidSKUList) &&
                Objects.equals(this.asINPrepInstructionsList, getPrepInstructionsResult.asINPrepInstructionsList) &&
                Objects.equals(this.invalidASINList, getPrepInstructionsResult.invalidASINList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skUPrepInstructionsList, invalidSKUList, asINPrepInstructionsList, invalidASINList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPrepInstructionsResult {\n");
        sb.append("    skUPrepInstructionsList: ").append(toIndentedString(skUPrepInstructionsList)).append("\n");
        sb.append("    invalidSKUList: ").append(toIndentedString(invalidSKUList)).append("\n");
        sb.append("    asINPrepInstructionsList: ").append(toIndentedString(asINPrepInstructionsList)).append("\n");
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
