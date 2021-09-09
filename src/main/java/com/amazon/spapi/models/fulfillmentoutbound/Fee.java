package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * Fee type and cost.
 */
@Schema(description = "Fee type and cost.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Fee {
    @SerializedName("name")
    private NameEnum name = null;
    @SerializedName("amount")
    private Money amount = null;

    public Fee name(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * The type of fee.
     *
     * @return name
     **/
    @Schema(required = true, description = "The type of fee.")
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public Fee amount(Money amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @Schema(required = true, description = "")
    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fee fee = (Fee) o;
        return Objects.equals(this.name, fee.name) &&
                Objects.equals(this.amount, fee.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Fee {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
     * The type of fee.
     */
    @JsonAdapter(NameEnum.Adapter.class)
    public enum NameEnum {
        FBAPERUNITFULFILLMENTFEE("FBAPerUnitFulfillmentFee"),
        FBAPERORDERFULFILLMENTFEE("FBAPerOrderFulfillmentFee"),
        FBATRANSPORTATIONFEE("FBATransportationFee"),
        FBAFULFILLMENTCODFEE("FBAFulfillmentCODFee");
        private String value;

        NameEnum(String value) {
            this.value = value;
        }

        public static NameEnum fromValue(String text) {
            for (NameEnum b : NameEnum.values()) {
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

        public static class Adapter extends TypeAdapter<NameEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public NameEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return NameEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
