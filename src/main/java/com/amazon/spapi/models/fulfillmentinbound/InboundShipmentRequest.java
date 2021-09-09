package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The request schema for an inbound shipment.
 */
@Schema(description = "The request schema for an inbound shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class InboundShipmentRequest {
    @SerializedName("InboundShipmentHeader")
    private InboundShipmentHeader inboundShipmentHeader = null;
    @SerializedName("InboundShipmentItems")
    private InboundShipmentItemList inboundShipmentItems = null;
    @SerializedName("MarketplaceId")
    private String marketplaceId = null;

    public InboundShipmentRequest inboundShipmentHeader(InboundShipmentHeader inboundShipmentHeader) {
        this.inboundShipmentHeader = inboundShipmentHeader;
        return this;
    }

    /**
     * Get inboundShipmentHeader
     *
     * @return inboundShipmentHeader
     **/
    @Schema(required = true, description = "")
    public InboundShipmentHeader getInboundShipmentHeader() {
        return inboundShipmentHeader;
    }

    public void setInboundShipmentHeader(InboundShipmentHeader inboundShipmentHeader) {
        this.inboundShipmentHeader = inboundShipmentHeader;
    }

    public InboundShipmentRequest inboundShipmentItems(InboundShipmentItemList inboundShipmentItems) {
        this.inboundShipmentItems = inboundShipmentItems;
        return this;
    }

    /**
     * Get inboundShipmentItems
     *
     * @return inboundShipmentItems
     **/
    @Schema(required = true, description = "")
    public InboundShipmentItemList getInboundShipmentItems() {
        return inboundShipmentItems;
    }

    public void setInboundShipmentItems(InboundShipmentItemList inboundShipmentItems) {
        this.inboundShipmentItems = inboundShipmentItems;
    }

    public InboundShipmentRequest marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * A marketplace identifier. Specifies the marketplace where the product would be stored.
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "A marketplace identifier. Specifies the marketplace where the product would be stored.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InboundShipmentRequest inboundShipmentRequest = (InboundShipmentRequest) o;
        return Objects.equals(this.inboundShipmentHeader, inboundShipmentRequest.inboundShipmentHeader) &&
                Objects.equals(this.inboundShipmentItems, inboundShipmentRequest.inboundShipmentItems) &&
                Objects.equals(this.marketplaceId, inboundShipmentRequest.marketplaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inboundShipmentHeader, inboundShipmentItems, marketplaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InboundShipmentRequest {\n");
        sb.append("    inboundShipmentHeader: ").append(toIndentedString(inboundShipmentHeader)).append("\n");
        sb.append("    inboundShipmentItems: ").append(toIndentedString(inboundShipmentItems)).append("\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
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
