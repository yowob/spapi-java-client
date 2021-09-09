package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Reasons why a given ASIN is not recommended for shipment to Amazon&#x27;s fulfillment network.
 */
@Schema(description = "Reasons why a given ASIN is not recommended for shipment to Amazon's fulfillment network.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ASINInboundGuidance {
    @SerializedName("ASIN")
    private String ASIN = null;
    @SerializedName("InboundGuidance")
    private InboundGuidance inboundGuidance = null;
    @SerializedName("GuidanceReasonList")
    private GuidanceReasonList guidanceReasonList = null;

    public ASINInboundGuidance ASIN(String ASIN) {
        this.ASIN = ASIN;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item.
     *
     * @return ASIN
     **/
    @Schema(required = true, description = "The Amazon Standard Identification Number (ASIN) of the item.")
    public String getASIN() {
        return ASIN;
    }

    public void setASIN(String ASIN) {
        this.ASIN = ASIN;
    }

    public ASINInboundGuidance inboundGuidance(InboundGuidance inboundGuidance) {
        this.inboundGuidance = inboundGuidance;
        return this;
    }

    /**
     * Get inboundGuidance
     *
     * @return inboundGuidance
     **/
    @Schema(required = true, description = "")
    public InboundGuidance getInboundGuidance() {
        return inboundGuidance;
    }

    public void setInboundGuidance(InboundGuidance inboundGuidance) {
        this.inboundGuidance = inboundGuidance;
    }

    public ASINInboundGuidance guidanceReasonList(GuidanceReasonList guidanceReasonList) {
        this.guidanceReasonList = guidanceReasonList;
        return this;
    }

    /**
     * Get guidanceReasonList
     *
     * @return guidanceReasonList
     **/
    @Schema(description = "")
    public GuidanceReasonList getGuidanceReasonList() {
        return guidanceReasonList;
    }

    public void setGuidanceReasonList(GuidanceReasonList guidanceReasonList) {
        this.guidanceReasonList = guidanceReasonList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ASINInboundGuidance asINInboundGuidance = (ASINInboundGuidance) o;
        return Objects.equals(this.ASIN, asINInboundGuidance.ASIN) &&
                Objects.equals(this.inboundGuidance, asINInboundGuidance.inboundGuidance) &&
                Objects.equals(this.guidanceReasonList, asINInboundGuidance.guidanceReasonList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ASIN, inboundGuidance, guidanceReasonList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ASINInboundGuidance {\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
        sb.append("    inboundGuidance: ").append(toIndentedString(inboundGuidance)).append("\n");
        sb.append("    guidanceReasonList: ").append(toIndentedString(guidanceReasonList)).append("\n");
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
