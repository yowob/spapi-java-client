package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Specifies characteristics that apply to a seller input.
 */
@Schema(description = "Specifies characteristics that apply to a seller input.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SellerInputDefinition {
    @SerializedName("IsRequired")
    private Boolean isRequired = null;
    @SerializedName("DataType")
    private String dataType = null;
    @SerializedName("Constraints")
    private Constraints constraints = null;
    @SerializedName("InputDisplayText")
    private String inputDisplayText = null;
    @SerializedName("InputTarget")
    private InputTargetType inputTarget = null;
    @SerializedName("StoredValue")
    private AdditionalSellerInput storedValue = null;
    @SerializedName("RestrictedSetValues")
    private RestrictedSetValues restrictedSetValues = null;

    public SellerInputDefinition isRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * When true, the additional input field is required.
     *
     * @return isRequired
     **/
    @Schema(required = true, description = "When true, the additional input field is required.")
    public Boolean isIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public SellerInputDefinition dataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * The data type of the additional input field.
     *
     * @return dataType
     **/
    @Schema(required = true, description = "The data type of the additional input field.")
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public SellerInputDefinition constraints(Constraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get constraints
     *
     * @return constraints
     **/
    @Schema(required = true, description = "")
    public Constraints getConstraints() {
        return constraints;
    }

    public void setConstraints(Constraints constraints) {
        this.constraints = constraints;
    }

    public SellerInputDefinition inputDisplayText(String inputDisplayText) {
        this.inputDisplayText = inputDisplayText;
        return this;
    }

    /**
     * The display text for the additional input field.
     *
     * @return inputDisplayText
     **/
    @Schema(required = true, description = "The display text for the additional input field.")
    public String getInputDisplayText() {
        return inputDisplayText;
    }

    public void setInputDisplayText(String inputDisplayText) {
        this.inputDisplayText = inputDisplayText;
    }

    public SellerInputDefinition inputTarget(InputTargetType inputTarget) {
        this.inputTarget = inputTarget;
        return this;
    }

    /**
     * Get inputTarget
     *
     * @return inputTarget
     **/
    @Schema(description = "")
    public InputTargetType getInputTarget() {
        return inputTarget;
    }

    public void setInputTarget(InputTargetType inputTarget) {
        this.inputTarget = inputTarget;
    }

    public SellerInputDefinition storedValue(AdditionalSellerInput storedValue) {
        this.storedValue = storedValue;
        return this;
    }

    /**
     * Get storedValue
     *
     * @return storedValue
     **/
    @Schema(required = true, description = "")
    public AdditionalSellerInput getStoredValue() {
        return storedValue;
    }

    public void setStoredValue(AdditionalSellerInput storedValue) {
        this.storedValue = storedValue;
    }

    public SellerInputDefinition restrictedSetValues(RestrictedSetValues restrictedSetValues) {
        this.restrictedSetValues = restrictedSetValues;
        return this;
    }

    /**
     * Get restrictedSetValues
     *
     * @return restrictedSetValues
     **/
    @Schema(description = "")
    public RestrictedSetValues getRestrictedSetValues() {
        return restrictedSetValues;
    }

    public void setRestrictedSetValues(RestrictedSetValues restrictedSetValues) {
        this.restrictedSetValues = restrictedSetValues;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SellerInputDefinition sellerInputDefinition = (SellerInputDefinition) o;
        return Objects.equals(this.isRequired, sellerInputDefinition.isRequired) &&
                Objects.equals(this.dataType, sellerInputDefinition.dataType) &&
                Objects.equals(this.constraints, sellerInputDefinition.constraints) &&
                Objects.equals(this.inputDisplayText, sellerInputDefinition.inputDisplayText) &&
                Objects.equals(this.inputTarget, sellerInputDefinition.inputTarget) &&
                Objects.equals(this.storedValue, sellerInputDefinition.storedValue) &&
                Objects.equals(this.restrictedSetValues, sellerInputDefinition.restrictedSetValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRequired, dataType, constraints, inputDisplayText, inputTarget, storedValue, restrictedSetValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SellerInputDefinition {\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
        sb.append("    inputDisplayText: ").append(toIndentedString(inputDisplayText)).append("\n");
        sb.append("    inputTarget: ").append(toIndentedString(inputTarget)).append("\n");
        sb.append("    storedValue: ").append(toIndentedString(storedValue)).append("\n");
        sb.append("    restrictedSetValues: ").append(toIndentedString(restrictedSetValues)).append("\n");
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
