package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * A credit given to a solution provider.
 */
@Schema(description = "A credit given to a solution provider.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SolutionProviderCreditEvent {
    @SerializedName("ProviderTransactionType")
    private String providerTransactionType = null;
    @SerializedName("SellerOrderId")
    private String sellerOrderId = null;
    @SerializedName("MarketplaceId")
    private String marketplaceId = null;
    @SerializedName("MarketplaceCountryCode")
    private String marketplaceCountryCode = null;
    @SerializedName("SellerId")
    private String sellerId = null;
    @SerializedName("SellerStoreName")
    private String sellerStoreName = null;
    @SerializedName("ProviderId")
    private String providerId = null;
    @SerializedName("ProviderStoreName")
    private String providerStoreName = null;
    @SerializedName("TransactionAmount")
    private Currency transactionAmount = null;
    @SerializedName("TransactionCreationDate")
    private OffsetDateTime transactionCreationDate = null;

    public SolutionProviderCreditEvent providerTransactionType(String providerTransactionType) {
        this.providerTransactionType = providerTransactionType;
        return this;
    }

    /**
     * The transaction type.
     *
     * @return providerTransactionType
     **/
    @Schema(description = "The transaction type.")
    public String getProviderTransactionType() {
        return providerTransactionType;
    }

    public void setProviderTransactionType(String providerTransactionType) {
        this.providerTransactionType = providerTransactionType;
    }

    public SolutionProviderCreditEvent sellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
        return this;
    }

    /**
     * A seller-defined identifier for an order.
     *
     * @return sellerOrderId
     **/
    @Schema(description = "A seller-defined identifier for an order.")
    public String getSellerOrderId() {
        return sellerOrderId;
    }

    public void setSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
    }

    public SolutionProviderCreditEvent marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * The identifier of the marketplace where the order was placed.
     *
     * @return marketplaceId
     **/
    @Schema(description = "The identifier of the marketplace where the order was placed.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public SolutionProviderCreditEvent marketplaceCountryCode(String marketplaceCountryCode) {
        this.marketplaceCountryCode = marketplaceCountryCode;
        return this;
    }

    /**
     * The two-letter country code of the country associated with the marketplace where the order was placed.
     *
     * @return marketplaceCountryCode
     **/
    @Schema(description = "The two-letter country code of the country associated with the marketplace where the order was placed.")
    public String getMarketplaceCountryCode() {
        return marketplaceCountryCode;
    }

    public void setMarketplaceCountryCode(String marketplaceCountryCode) {
        this.marketplaceCountryCode = marketplaceCountryCode;
    }

    public SolutionProviderCreditEvent sellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * The Amazon-defined identifier of the seller.
     *
     * @return sellerId
     **/
    @Schema(description = "The Amazon-defined identifier of the seller.")
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public SolutionProviderCreditEvent sellerStoreName(String sellerStoreName) {
        this.sellerStoreName = sellerStoreName;
        return this;
    }

    /**
     * The store name where the payment event occurred.
     *
     * @return sellerStoreName
     **/
    @Schema(description = "The store name where the payment event occurred.")
    public String getSellerStoreName() {
        return sellerStoreName;
    }

    public void setSellerStoreName(String sellerStoreName) {
        this.sellerStoreName = sellerStoreName;
    }

    public SolutionProviderCreditEvent providerId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * The Amazon-defined identifier of the solution provider.
     *
     * @return providerId
     **/
    @Schema(description = "The Amazon-defined identifier of the solution provider.")
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public SolutionProviderCreditEvent providerStoreName(String providerStoreName) {
        this.providerStoreName = providerStoreName;
        return this;
    }

    /**
     * The store name where the payment event occurred.
     *
     * @return providerStoreName
     **/
    @Schema(description = "The store name where the payment event occurred.")
    public String getProviderStoreName() {
        return providerStoreName;
    }

    public void setProviderStoreName(String providerStoreName) {
        this.providerStoreName = providerStoreName;
    }

    public SolutionProviderCreditEvent transactionAmount(Currency transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }

    /**
     * Get transactionAmount
     *
     * @return transactionAmount
     **/
    @Schema(description = "")
    public Currency getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Currency transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public SolutionProviderCreditEvent transactionCreationDate(OffsetDateTime transactionCreationDate) {
        this.transactionCreationDate = transactionCreationDate;
        return this;
    }

    /**
     * Get transactionCreationDate
     *
     * @return transactionCreationDate
     **/
    @Schema(description = "")
    public OffsetDateTime getTransactionCreationDate() {
        return transactionCreationDate;
    }

    public void setTransactionCreationDate(OffsetDateTime transactionCreationDate) {
        this.transactionCreationDate = transactionCreationDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SolutionProviderCreditEvent solutionProviderCreditEvent = (SolutionProviderCreditEvent) o;
        return Objects.equals(this.providerTransactionType, solutionProviderCreditEvent.providerTransactionType) &&
                Objects.equals(this.sellerOrderId, solutionProviderCreditEvent.sellerOrderId) &&
                Objects.equals(this.marketplaceId, solutionProviderCreditEvent.marketplaceId) &&
                Objects.equals(this.marketplaceCountryCode, solutionProviderCreditEvent.marketplaceCountryCode) &&
                Objects.equals(this.sellerId, solutionProviderCreditEvent.sellerId) &&
                Objects.equals(this.sellerStoreName, solutionProviderCreditEvent.sellerStoreName) &&
                Objects.equals(this.providerId, solutionProviderCreditEvent.providerId) &&
                Objects.equals(this.providerStoreName, solutionProviderCreditEvent.providerStoreName) &&
                Objects.equals(this.transactionAmount, solutionProviderCreditEvent.transactionAmount) &&
                Objects.equals(this.transactionCreationDate, solutionProviderCreditEvent.transactionCreationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerTransactionType, sellerOrderId, marketplaceId, marketplaceCountryCode, sellerId, sellerStoreName, providerId, providerStoreName, transactionAmount, transactionCreationDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SolutionProviderCreditEvent {\n");
        sb.append("    providerTransactionType: ").append(toIndentedString(providerTransactionType)).append("\n");
        sb.append("    sellerOrderId: ").append(toIndentedString(sellerOrderId)).append("\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    marketplaceCountryCode: ").append(toIndentedString(marketplaceCountryCode)).append("\n");
        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
        sb.append("    sellerStoreName: ").append(toIndentedString(sellerStoreName)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    providerStoreName: ").append(toIndentedString(providerStoreName)).append("\n");
        sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
        sb.append("    transactionCreationDate: ").append(toIndentedString(transactionCreationDate)).append("\n");
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
