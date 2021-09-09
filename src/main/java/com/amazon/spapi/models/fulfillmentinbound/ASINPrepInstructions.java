package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Item preparation instructions to help with item sourcing decisions.
 */
@Schema(description = "Item preparation instructions to help with item sourcing decisions.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ASINPrepInstructions {
    @SerializedName("ASIN")
    private String ASIN = null;
    @SerializedName("BarcodeInstruction")
    private BarcodeInstruction barcodeInstruction = null;
    @SerializedName("PrepGuidance")
    private PrepGuidance prepGuidance = null;
    @SerializedName("PrepInstructionList")
    private PrepInstructionList prepInstructionList = null;

    public ASINPrepInstructions ASIN(String ASIN) {
        this.ASIN = ASIN;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item.
     *
     * @return ASIN
     **/
    @Schema(description = "The Amazon Standard Identification Number (ASIN) of the item.")
    public String getASIN() {
        return ASIN;
    }

    public void setASIN(String ASIN) {
        this.ASIN = ASIN;
    }

    public ASINPrepInstructions barcodeInstruction(BarcodeInstruction barcodeInstruction) {
        this.barcodeInstruction = barcodeInstruction;
        return this;
    }

    /**
     * Get barcodeInstruction
     *
     * @return barcodeInstruction
     **/
    @Schema(description = "")
    public BarcodeInstruction getBarcodeInstruction() {
        return barcodeInstruction;
    }

    public void setBarcodeInstruction(BarcodeInstruction barcodeInstruction) {
        this.barcodeInstruction = barcodeInstruction;
    }

    public ASINPrepInstructions prepGuidance(PrepGuidance prepGuidance) {
        this.prepGuidance = prepGuidance;
        return this;
    }

    /**
     * Get prepGuidance
     *
     * @return prepGuidance
     **/
    @Schema(description = "")
    public PrepGuidance getPrepGuidance() {
        return prepGuidance;
    }

    public void setPrepGuidance(PrepGuidance prepGuidance) {
        this.prepGuidance = prepGuidance;
    }

    public ASINPrepInstructions prepInstructionList(PrepInstructionList prepInstructionList) {
        this.prepInstructionList = prepInstructionList;
        return this;
    }

    /**
     * Get prepInstructionList
     *
     * @return prepInstructionList
     **/
    @Schema(description = "")
    public PrepInstructionList getPrepInstructionList() {
        return prepInstructionList;
    }

    public void setPrepInstructionList(PrepInstructionList prepInstructionList) {
        this.prepInstructionList = prepInstructionList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ASINPrepInstructions asINPrepInstructions = (ASINPrepInstructions) o;
        return Objects.equals(this.ASIN, asINPrepInstructions.ASIN) &&
                Objects.equals(this.barcodeInstruction, asINPrepInstructions.barcodeInstruction) &&
                Objects.equals(this.prepGuidance, asINPrepInstructions.prepGuidance) &&
                Objects.equals(this.prepInstructionList, asINPrepInstructions.prepInstructionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ASIN, barcodeInstruction, prepGuidance, prepInstructionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ASINPrepInstructions {\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
        sb.append("    barcodeInstruction: ").append(toIndentedString(barcodeInstruction)).append("\n");
        sb.append("    prepGuidance: ").append(toIndentedString(prepGuidance)).append("\n");
        sb.append("    prepInstructionList: ").append(toIndentedString(prepInstructionList)).append("\n");
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
