package com.amazon.spapi.models.fbasmallandlight;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * Fee details for a specific fee.
 */
@Schema(description = "Fee details for a specific fee.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FeeLineItem {
    @SerializedName("feeType")
    private FeeTypeEnum feeType = null;
    @SerializedName("feeCharge")
    private MoneyType feeCharge = null;

    public FeeLineItem feeType(FeeTypeEnum feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * The type of fee charged to the seller.
     *
     * @return feeType
     **/
    @Schema(required = true, description = "The type of fee charged to the seller.")
    public FeeTypeEnum getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeTypeEnum feeType) {
        this.feeType = feeType;
    }

    public FeeLineItem feeCharge(MoneyType feeCharge) {
        this.feeCharge = feeCharge;
        return this;
    }

    /**
     * Get feeCharge
     *
     * @return feeCharge
     **/
    @Schema(required = true, description = "")
    public MoneyType getFeeCharge() {
        return feeCharge;
    }

    public void setFeeCharge(MoneyType feeCharge) {
        this.feeCharge = feeCharge;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeeLineItem feeLineItem = (FeeLineItem) o;
        return Objects.equals(this.feeType, feeLineItem.feeType) &&
                Objects.equals(this.feeCharge, feeLineItem.feeCharge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, feeCharge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeeLineItem {\n");
        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    feeCharge: ").append(toIndentedString(feeCharge)).append("\n");
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

    /**
     * The type of fee charged to the seller.
     */
    @JsonAdapter(FeeTypeEnum.Adapter.class)
    public enum FeeTypeEnum {
        FBAWEIGHTBASEDFEE("FBAWeightBasedFee"),
        FBAPERORDERFULFILLMENTFEE("FBAPerOrderFulfillmentFee"),
        FBAPERUNITFULFILLMENTFEE("FBAPerUnitFulfillmentFee"),
        COMMISSION("Commission");
        private String value;

        FeeTypeEnum(String value) {
            this.value = value;
        }

        public static FeeTypeEnum fromValue(String text) {
            for (FeeTypeEnum b : FeeTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<FeeTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FeeTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FeeTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return FeeTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
