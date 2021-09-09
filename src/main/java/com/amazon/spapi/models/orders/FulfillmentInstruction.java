package com.amazon.spapi.models.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Contains the instructions about the fulfillment like where should it be fulfilled from.
 */
@Schema(description = "Contains the instructions about the fulfillment like where should it be fulfilled from.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FulfillmentInstruction {
    @SerializedName("FulfillmentSupplySourceId")
    private String fulfillmentSupplySourceId = null;

    public FulfillmentInstruction fulfillmentSupplySourceId(String fulfillmentSupplySourceId) {
        this.fulfillmentSupplySourceId = fulfillmentSupplySourceId;
        return this;
    }

    /**
     * Denotes the recommended sourceId where the order should be fulfilled from.
     *
     * @return fulfillmentSupplySourceId
     **/
    @Schema(description = "Denotes the recommended sourceId where the order should be fulfilled from.")
    public String getFulfillmentSupplySourceId() {
        return fulfillmentSupplySourceId;
    }

    public void setFulfillmentSupplySourceId(String fulfillmentSupplySourceId) {
        this.fulfillmentSupplySourceId = fulfillmentSupplySourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FulfillmentInstruction fulfillmentInstruction = (FulfillmentInstruction) o;
        return Objects.equals(this.fulfillmentSupplySourceId, fulfillmentInstruction.fulfillmentSupplySourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fulfillmentSupplySourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FulfillmentInstruction {\n");
        sb.append("    fulfillmentSupplySourceId: ").append(toIndentedString(fulfillmentSupplySourceId)).append("\n");
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
