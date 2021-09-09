package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Additional information required to purchase shipping.
 */
@Schema(description = "Additional information required to purchase shipping.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AdditionalSellerInput {
    @SerializedName("DataType")
    private String dataType = null;
    @SerializedName("ValueAsString")
    private String valueAsString = null;
    @SerializedName("ValueAsBoolean")
    private Boolean valueAsBoolean = null;
    @SerializedName("ValueAsInteger")
    private Integer valueAsInteger = null;
    @SerializedName("ValueAsTimestamp")
    private OffsetDateTime valueAsTimestamp = null;
    @SerializedName("ValueAsAddress")
    private Address valueAsAddress = null;
    @SerializedName("ValueAsWeight")
    private Weight valueAsWeight = null;
    @SerializedName("ValueAsDimension")
    private Length valueAsDimension = null;
    @SerializedName("ValueAsCurrency")
    private CurrencyAmount valueAsCurrency = null;

    public AdditionalSellerInput dataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * The data type of the additional information.
     *
     * @return dataType
     **/
    @Schema(description = "The data type of the additional information.")
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public AdditionalSellerInput valueAsString(String valueAsString) {
        this.valueAsString = valueAsString;
        return this;
    }

    /**
     * The value when the data type is string.
     *
     * @return valueAsString
     **/
    @Schema(description = "The value when the data type is string.")
    public String getValueAsString() {
        return valueAsString;
    }

    public void setValueAsString(String valueAsString) {
        this.valueAsString = valueAsString;
    }

    public AdditionalSellerInput valueAsBoolean(Boolean valueAsBoolean) {
        this.valueAsBoolean = valueAsBoolean;
        return this;
    }

    /**
     * The value when the data type is boolean.
     *
     * @return valueAsBoolean
     **/
    @Schema(description = "The value when the data type is boolean.")
    public Boolean isValueAsBoolean() {
        return valueAsBoolean;
    }

    public void setValueAsBoolean(Boolean valueAsBoolean) {
        this.valueAsBoolean = valueAsBoolean;
    }

    public AdditionalSellerInput valueAsInteger(Integer valueAsInteger) {
        this.valueAsInteger = valueAsInteger;
        return this;
    }

    /**
     * The value when the data type is integer.
     *
     * @return valueAsInteger
     **/
    @Schema(description = "The value when the data type is integer.")
    public Integer getValueAsInteger() {
        return valueAsInteger;
    }

    public void setValueAsInteger(Integer valueAsInteger) {
        this.valueAsInteger = valueAsInteger;
    }

    public AdditionalSellerInput valueAsTimestamp(OffsetDateTime valueAsTimestamp) {
        this.valueAsTimestamp = valueAsTimestamp;
        return this;
    }

    /**
     * Get valueAsTimestamp
     *
     * @return valueAsTimestamp
     **/
    @Schema(description = "")
    public OffsetDateTime getValueAsTimestamp() {
        return valueAsTimestamp;
    }

    public void setValueAsTimestamp(OffsetDateTime valueAsTimestamp) {
        this.valueAsTimestamp = valueAsTimestamp;
    }

    public AdditionalSellerInput valueAsAddress(Address valueAsAddress) {
        this.valueAsAddress = valueAsAddress;
        return this;
    }

    /**
     * Get valueAsAddress
     *
     * @return valueAsAddress
     **/
    @Schema(description = "")
    public Address getValueAsAddress() {
        return valueAsAddress;
    }

    public void setValueAsAddress(Address valueAsAddress) {
        this.valueAsAddress = valueAsAddress;
    }

    public AdditionalSellerInput valueAsWeight(Weight valueAsWeight) {
        this.valueAsWeight = valueAsWeight;
        return this;
    }

    /**
     * Get valueAsWeight
     *
     * @return valueAsWeight
     **/
    @Schema(description = "")
    public Weight getValueAsWeight() {
        return valueAsWeight;
    }

    public void setValueAsWeight(Weight valueAsWeight) {
        this.valueAsWeight = valueAsWeight;
    }

    public AdditionalSellerInput valueAsDimension(Length valueAsDimension) {
        this.valueAsDimension = valueAsDimension;
        return this;
    }

    /**
     * Get valueAsDimension
     *
     * @return valueAsDimension
     **/
    @Schema(description = "")
    public Length getValueAsDimension() {
        return valueAsDimension;
    }

    public void setValueAsDimension(Length valueAsDimension) {
        this.valueAsDimension = valueAsDimension;
    }

    public AdditionalSellerInput valueAsCurrency(CurrencyAmount valueAsCurrency) {
        this.valueAsCurrency = valueAsCurrency;
        return this;
    }

    /**
     * Get valueAsCurrency
     *
     * @return valueAsCurrency
     **/
    @Schema(description = "")
    public CurrencyAmount getValueAsCurrency() {
        return valueAsCurrency;
    }

    public void setValueAsCurrency(CurrencyAmount valueAsCurrency) {
        this.valueAsCurrency = valueAsCurrency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdditionalSellerInput additionalSellerInput = (AdditionalSellerInput) o;
        return Objects.equals(this.dataType, additionalSellerInput.dataType) &&
                Objects.equals(this.valueAsString, additionalSellerInput.valueAsString) &&
                Objects.equals(this.valueAsBoolean, additionalSellerInput.valueAsBoolean) &&
                Objects.equals(this.valueAsInteger, additionalSellerInput.valueAsInteger) &&
                Objects.equals(this.valueAsTimestamp, additionalSellerInput.valueAsTimestamp) &&
                Objects.equals(this.valueAsAddress, additionalSellerInput.valueAsAddress) &&
                Objects.equals(this.valueAsWeight, additionalSellerInput.valueAsWeight) &&
                Objects.equals(this.valueAsDimension, additionalSellerInput.valueAsDimension) &&
                Objects.equals(this.valueAsCurrency, additionalSellerInput.valueAsCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataType, valueAsString, valueAsBoolean, valueAsInteger, valueAsTimestamp, valueAsAddress, valueAsWeight, valueAsDimension, valueAsCurrency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalSellerInput {\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    valueAsString: ").append(toIndentedString(valueAsString)).append("\n");
        sb.append("    valueAsBoolean: ").append(toIndentedString(valueAsBoolean)).append("\n");
        sb.append("    valueAsInteger: ").append(toIndentedString(valueAsInteger)).append("\n");
        sb.append("    valueAsTimestamp: ").append(toIndentedString(valueAsTimestamp)).append("\n");
        sb.append("    valueAsAddress: ").append(toIndentedString(valueAsAddress)).append("\n");
        sb.append("    valueAsWeight: ").append(toIndentedString(valueAsWeight)).append("\n");
        sb.append("    valueAsDimension: ").append(toIndentedString(valueAsDimension)).append("\n");
        sb.append("    valueAsCurrency: ").append(toIndentedString(valueAsCurrency)).append("\n");
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
