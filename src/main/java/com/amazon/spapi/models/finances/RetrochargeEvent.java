package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * A retrocharge or retrocharge reversal.
 */
@Schema(description = "A retrocharge or retrocharge reversal.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class RetrochargeEvent {
    @SerializedName("RetrochargeEventType")
    private String retrochargeEventType = null;
    @SerializedName("AmazonOrderId")
    private String amazonOrderId = null;
    @SerializedName("PostedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("BaseTax")
    private Currency baseTax = null;
    @SerializedName("ShippingTax")
    private Currency shippingTax = null;
    @SerializedName("MarketplaceName")
    private String marketplaceName = null;
    @SerializedName("RetrochargeTaxWithheldList")
    private TaxWithheldComponentList retrochargeTaxWithheldList = null;

    public RetrochargeEvent retrochargeEventType(String retrochargeEventType) {
        this.retrochargeEventType = retrochargeEventType;
        return this;
    }

    /**
     * The type of event.  Possible values:  * Retrocharge  * RetrochargeReversal
     *
     * @return retrochargeEventType
     **/
    @Schema(description = "The type of event.  Possible values:  * Retrocharge  * RetrochargeReversal")
    public String getRetrochargeEventType() {
        return retrochargeEventType;
    }

    public void setRetrochargeEventType(String retrochargeEventType) {
        this.retrochargeEventType = retrochargeEventType;
    }

    public RetrochargeEvent amazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * An Amazon-defined identifier for an order.
     *
     * @return amazonOrderId
     **/
    @Schema(description = "An Amazon-defined identifier for an order.")
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    public RetrochargeEvent postedDate(OffsetDateTime postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get postedDate
     *
     * @return postedDate
     **/
    @Schema(description = "")
    public OffsetDateTime getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(OffsetDateTime postedDate) {
        this.postedDate = postedDate;
    }

    public RetrochargeEvent baseTax(Currency baseTax) {
        this.baseTax = baseTax;
        return this;
    }

    /**
     * Get baseTax
     *
     * @return baseTax
     **/
    @Schema(description = "")
    public Currency getBaseTax() {
        return baseTax;
    }

    public void setBaseTax(Currency baseTax) {
        this.baseTax = baseTax;
    }

    public RetrochargeEvent shippingTax(Currency shippingTax) {
        this.shippingTax = shippingTax;
        return this;
    }

    /**
     * Get shippingTax
     *
     * @return shippingTax
     **/
    @Schema(description = "")
    public Currency getShippingTax() {
        return shippingTax;
    }

    public void setShippingTax(Currency shippingTax) {
        this.shippingTax = shippingTax;
    }

    public RetrochargeEvent marketplaceName(String marketplaceName) {
        this.marketplaceName = marketplaceName;
        return this;
    }

    /**
     * The name of the marketplace where the retrocharge event occurred.
     *
     * @return marketplaceName
     **/
    @Schema(description = "The name of the marketplace where the retrocharge event occurred.")
    public String getMarketplaceName() {
        return marketplaceName;
    }

    public void setMarketplaceName(String marketplaceName) {
        this.marketplaceName = marketplaceName;
    }

    public RetrochargeEvent retrochargeTaxWithheldList(TaxWithheldComponentList retrochargeTaxWithheldList) {
        this.retrochargeTaxWithheldList = retrochargeTaxWithheldList;
        return this;
    }

    /**
     * Get retrochargeTaxWithheldList
     *
     * @return retrochargeTaxWithheldList
     **/
    @Schema(description = "")
    public TaxWithheldComponentList getRetrochargeTaxWithheldList() {
        return retrochargeTaxWithheldList;
    }

    public void setRetrochargeTaxWithheldList(TaxWithheldComponentList retrochargeTaxWithheldList) {
        this.retrochargeTaxWithheldList = retrochargeTaxWithheldList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetrochargeEvent retrochargeEvent = (RetrochargeEvent) o;
        return Objects.equals(this.retrochargeEventType, retrochargeEvent.retrochargeEventType) &&
                Objects.equals(this.amazonOrderId, retrochargeEvent.amazonOrderId) &&
                Objects.equals(this.postedDate, retrochargeEvent.postedDate) &&
                Objects.equals(this.baseTax, retrochargeEvent.baseTax) &&
                Objects.equals(this.shippingTax, retrochargeEvent.shippingTax) &&
                Objects.equals(this.marketplaceName, retrochargeEvent.marketplaceName) &&
                Objects.equals(this.retrochargeTaxWithheldList, retrochargeEvent.retrochargeTaxWithheldList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retrochargeEventType, amazonOrderId, postedDate, baseTax, shippingTax, marketplaceName, retrochargeTaxWithheldList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetrochargeEvent {\n");
        sb.append("    retrochargeEventType: ").append(toIndentedString(retrochargeEventType)).append("\n");
        sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    baseTax: ").append(toIndentedString(baseTax)).append("\n");
        sb.append("    shippingTax: ").append(toIndentedString(shippingTax)).append("\n");
        sb.append("    marketplaceName: ").append(toIndentedString(marketplaceName)).append("\n");
        sb.append("    retrochargeTaxWithheldList: ").append(toIndentedString(retrochargeTaxWithheldList)).append("\n");
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
