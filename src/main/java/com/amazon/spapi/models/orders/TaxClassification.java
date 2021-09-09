package com.amazon.spapi.models.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The tax classification for the order.
 */
@Schema(description = "The tax classification for the order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class TaxClassification {
    @SerializedName("Name")
    private String name = null;
    @SerializedName("Value")
    private String value = null;

    public TaxClassification name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The type of tax.
     *
     * @return name
     **/
    @Schema(description = "The type of tax.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaxClassification value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The buyer&#x27;s tax identifier.
     *
     * @return value
     **/
    @Schema(description = "The buyer's tax identifier.")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaxClassification taxClassification = (TaxClassification) o;
        return Objects.equals(this.name, taxClassification.name) &&
                Objects.equals(this.value, taxClassification.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaxClassification {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
