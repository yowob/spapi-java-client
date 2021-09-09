package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The request schema for the createInboundShipmentPlan operation.
 */
@Schema(description = "The request schema for the createInboundShipmentPlan operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateInboundShipmentPlanRequest {
    @SerializedName("ShipFromAddress")
    private Address shipFromAddress = null;
    @SerializedName("LabelPrepPreference")
    private LabelPrepPreference labelPrepPreference = null;
    @SerializedName("ShipToCountryCode")
    private String shipToCountryCode = null;
    @SerializedName("ShipToCountrySubdivisionCode")
    private String shipToCountrySubdivisionCode = null;
    @SerializedName("InboundShipmentPlanRequestItems")
    private InboundShipmentPlanRequestItemList inboundShipmentPlanRequestItems = null;

    public CreateInboundShipmentPlanRequest shipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
        return this;
    }

    /**
     * Get shipFromAddress
     *
     * @return shipFromAddress
     **/
    @Schema(required = true, description = "")
    public Address getShipFromAddress() {
        return shipFromAddress;
    }

    public void setShipFromAddress(Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
    }

    public CreateInboundShipmentPlanRequest labelPrepPreference(LabelPrepPreference labelPrepPreference) {
        this.labelPrepPreference = labelPrepPreference;
        return this;
    }

    /**
     * Get labelPrepPreference
     *
     * @return labelPrepPreference
     **/
    @Schema(required = true, description = "")
    public LabelPrepPreference getLabelPrepPreference() {
        return labelPrepPreference;
    }

    public void setLabelPrepPreference(LabelPrepPreference labelPrepPreference) {
        this.labelPrepPreference = labelPrepPreference;
    }

    public CreateInboundShipmentPlanRequest shipToCountryCode(String shipToCountryCode) {
        this.shipToCountryCode = shipToCountryCode;
        return this;
    }

    /**
     * The two-character country code for the country where the inbound shipment is to be sent.  Note: Not required. Specifying both ShipToCountryCode and ShipToCountrySubdivisionCode returns an error.   Values:   ShipToCountryCode values for North America:  * CA – Canada  * MX - Mexico  * US - United States  ShipToCountryCode values for MCI sellers in Europe:  * DE – Germany  * ES – Spain  * FR – France  * GB – United Kingdom  * IT – Italy  Default: The country code for the seller&#x27;s home marketplace.
     *
     * @return shipToCountryCode
     **/
    @Schema(description = "The two-character country code for the country where the inbound shipment is to be sent.  Note: Not required. Specifying both ShipToCountryCode and ShipToCountrySubdivisionCode returns an error.   Values:   ShipToCountryCode values for North America:  * CA – Canada  * MX - Mexico  * US - United States  ShipToCountryCode values for MCI sellers in Europe:  * DE – Germany  * ES – Spain  * FR – France  * GB – United Kingdom  * IT – Italy  Default: The country code for the seller's home marketplace.")
    public String getShipToCountryCode() {
        return shipToCountryCode;
    }

    public void setShipToCountryCode(String shipToCountryCode) {
        this.shipToCountryCode = shipToCountryCode;
    }

    public CreateInboundShipmentPlanRequest shipToCountrySubdivisionCode(String shipToCountrySubdivisionCode) {
        this.shipToCountrySubdivisionCode = shipToCountrySubdivisionCode;
        return this;
    }

    /**
     * The two-character country code, followed by a dash and then up to three characters that represent the subdivision of the country where the inbound shipment is to be sent. For example, \&quot;IN-MH\&quot;. In full ISO 3166-2 format.  Note: Not required. Specifying both ShipToCountryCode and ShipToCountrySubdivisionCode returns an error.
     *
     * @return shipToCountrySubdivisionCode
     **/
    @Schema(description = "The two-character country code, followed by a dash and then up to three characters that represent the subdivision of the country where the inbound shipment is to be sent. For example, \"IN-MH\". In full ISO 3166-2 format.  Note: Not required. Specifying both ShipToCountryCode and ShipToCountrySubdivisionCode returns an error.")
    public String getShipToCountrySubdivisionCode() {
        return shipToCountrySubdivisionCode;
    }

    public void setShipToCountrySubdivisionCode(String shipToCountrySubdivisionCode) {
        this.shipToCountrySubdivisionCode = shipToCountrySubdivisionCode;
    }

    public CreateInboundShipmentPlanRequest inboundShipmentPlanRequestItems(InboundShipmentPlanRequestItemList inboundShipmentPlanRequestItems) {
        this.inboundShipmentPlanRequestItems = inboundShipmentPlanRequestItems;
        return this;
    }

    /**
     * Get inboundShipmentPlanRequestItems
     *
     * @return inboundShipmentPlanRequestItems
     **/
    @Schema(required = true, description = "")
    public InboundShipmentPlanRequestItemList getInboundShipmentPlanRequestItems() {
        return inboundShipmentPlanRequestItems;
    }

    public void setInboundShipmentPlanRequestItems(InboundShipmentPlanRequestItemList inboundShipmentPlanRequestItems) {
        this.inboundShipmentPlanRequestItems = inboundShipmentPlanRequestItems;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInboundShipmentPlanRequest createInboundShipmentPlanRequest = (CreateInboundShipmentPlanRequest) o;
        return Objects.equals(this.shipFromAddress, createInboundShipmentPlanRequest.shipFromAddress) &&
                Objects.equals(this.labelPrepPreference, createInboundShipmentPlanRequest.labelPrepPreference) &&
                Objects.equals(this.shipToCountryCode, createInboundShipmentPlanRequest.shipToCountryCode) &&
                Objects.equals(this.shipToCountrySubdivisionCode, createInboundShipmentPlanRequest.shipToCountrySubdivisionCode) &&
                Objects.equals(this.inboundShipmentPlanRequestItems, createInboundShipmentPlanRequest.inboundShipmentPlanRequestItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipFromAddress, labelPrepPreference, shipToCountryCode, shipToCountrySubdivisionCode, inboundShipmentPlanRequestItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInboundShipmentPlanRequest {\n");
        sb.append("    shipFromAddress: ").append(toIndentedString(shipFromAddress)).append("\n");
        sb.append("    labelPrepPreference: ").append(toIndentedString(labelPrepPreference)).append("\n");
        sb.append("    shipToCountryCode: ").append(toIndentedString(shipToCountryCode)).append("\n");
        sb.append("    shipToCountrySubdivisionCode: ").append(toIndentedString(shipToCountrySubdivisionCode)).append("\n");
        sb.append("    inboundShipmentPlanRequestItems: ").append(toIndentedString(inboundShipmentPlanRequestItems)).append("\n");
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
