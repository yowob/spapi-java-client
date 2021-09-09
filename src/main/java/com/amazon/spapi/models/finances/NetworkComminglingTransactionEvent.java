package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * A network commingling transaction event.
 */
@Schema(description = "A network commingling transaction event.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class NetworkComminglingTransactionEvent {
    @SerializedName("TransactionType")
    private String transactionType = null;
    @SerializedName("PostedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("NetCoTransactionID")
    private String netCoTransactionID = null;
    @SerializedName("SwapReason")
    private String swapReason = null;
    @SerializedName("ASIN")
    private String ASIN = null;
    @SerializedName("MarketplaceId")
    private String marketplaceId = null;
    @SerializedName("TaxExclusiveAmount")
    private Currency taxExclusiveAmount = null;
    @SerializedName("TaxAmount")
    private Currency taxAmount = null;

    public NetworkComminglingTransactionEvent transactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * The type of network item swap.  Possible values:  * NetCo - A Fulfillment by Amazon inventory pooling transaction. Available only in the India marketplace.  * ComminglingVAT - A commingling VAT transaction. Available only in the UK, Spain, France, Germany, and Italy marketplaces.
     *
     * @return transactionType
     **/
    @Schema(description = "The type of network item swap.  Possible values:  * NetCo - A Fulfillment by Amazon inventory pooling transaction. Available only in the India marketplace.  * ComminglingVAT - A commingling VAT transaction. Available only in the UK, Spain, France, Germany, and Italy marketplaces.")
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public NetworkComminglingTransactionEvent postedDate(OffsetDateTime postedDate) {
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

    public NetworkComminglingTransactionEvent netCoTransactionID(String netCoTransactionID) {
        this.netCoTransactionID = netCoTransactionID;
        return this;
    }

    /**
     * The identifier for the network item swap.
     *
     * @return netCoTransactionID
     **/
    @Schema(description = "The identifier for the network item swap.")
    public String getNetCoTransactionID() {
        return netCoTransactionID;
    }

    public void setNetCoTransactionID(String netCoTransactionID) {
        this.netCoTransactionID = netCoTransactionID;
    }

    public NetworkComminglingTransactionEvent swapReason(String swapReason) {
        this.swapReason = swapReason;
        return this;
    }

    /**
     * The reason for the network item swap.
     *
     * @return swapReason
     **/
    @Schema(description = "The reason for the network item swap.")
    public String getSwapReason() {
        return swapReason;
    }

    public void setSwapReason(String swapReason) {
        this.swapReason = swapReason;
    }

    public NetworkComminglingTransactionEvent ASIN(String ASIN) {
        this.ASIN = ASIN;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the swapped item.
     *
     * @return ASIN
     **/
    @Schema(description = "The Amazon Standard Identification Number (ASIN) of the swapped item.")
    public String getASIN() {
        return ASIN;
    }

    public void setASIN(String ASIN) {
        this.ASIN = ASIN;
    }

    public NetworkComminglingTransactionEvent marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * The marketplace in which the event took place.
     *
     * @return marketplaceId
     **/
    @Schema(description = "The marketplace in which the event took place.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public NetworkComminglingTransactionEvent taxExclusiveAmount(Currency taxExclusiveAmount) {
        this.taxExclusiveAmount = taxExclusiveAmount;
        return this;
    }

    /**
     * Get taxExclusiveAmount
     *
     * @return taxExclusiveAmount
     **/
    @Schema(description = "")
    public Currency getTaxExclusiveAmount() {
        return taxExclusiveAmount;
    }

    public void setTaxExclusiveAmount(Currency taxExclusiveAmount) {
        this.taxExclusiveAmount = taxExclusiveAmount;
    }

    public NetworkComminglingTransactionEvent taxAmount(Currency taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Get taxAmount
     *
     * @return taxAmount
     **/
    @Schema(description = "")
    public Currency getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Currency taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NetworkComminglingTransactionEvent networkComminglingTransactionEvent = (NetworkComminglingTransactionEvent) o;
        return Objects.equals(this.transactionType, networkComminglingTransactionEvent.transactionType) &&
                Objects.equals(this.postedDate, networkComminglingTransactionEvent.postedDate) &&
                Objects.equals(this.netCoTransactionID, networkComminglingTransactionEvent.netCoTransactionID) &&
                Objects.equals(this.swapReason, networkComminglingTransactionEvent.swapReason) &&
                Objects.equals(this.ASIN, networkComminglingTransactionEvent.ASIN) &&
                Objects.equals(this.marketplaceId, networkComminglingTransactionEvent.marketplaceId) &&
                Objects.equals(this.taxExclusiveAmount, networkComminglingTransactionEvent.taxExclusiveAmount) &&
                Objects.equals(this.taxAmount, networkComminglingTransactionEvent.taxAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionType, postedDate, netCoTransactionID, swapReason, ASIN, marketplaceId, taxExclusiveAmount, taxAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkComminglingTransactionEvent {\n");
        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    netCoTransactionID: ").append(toIndentedString(netCoTransactionID)).append("\n");
        sb.append("    swapReason: ").append(toIndentedString(swapReason)).append("\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    taxExclusiveAmount: ").append(toIndentedString(taxExclusiveAmount)).append("\n");
        sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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
