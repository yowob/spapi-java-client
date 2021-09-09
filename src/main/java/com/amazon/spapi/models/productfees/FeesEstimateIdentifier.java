package com.amazon.spapi.models.productfees;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * An item identifier, marketplace, time of request, and other details that identify an estimate.
 */
@Schema(description = "An item identifier, marketplace, time of request, and other details that identify an estimate.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FeesEstimateIdentifier {
    @SerializedName("MarketplaceId")
    private String marketplaceId = null;
    @SerializedName("SellerId")
    private String sellerId = null;
    @SerializedName("IdType")
    private String idType = null;
    @SerializedName("IdValue")
    private String idValue = null;
    @SerializedName("IsAmazonFulfilled")
    private Boolean isAmazonFulfilled = null;
    @SerializedName("PriceToEstimateFees")
    private PriceToEstimateFees priceToEstimateFees = null;
    @SerializedName("SellerInputIdentifier")
    private String sellerInputIdentifier = null;
    @SerializedName("OptionalFulfillmentProgram")
    private OptionalFulfillmentProgram optionalFulfillmentProgram = null;

    public FeesEstimateIdentifier marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * A marketplace identifier.
     *
     * @return marketplaceId
     **/
    @Schema(description = "A marketplace identifier.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public FeesEstimateIdentifier sellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * The seller identifier.
     *
     * @return sellerId
     **/
    @Schema(description = "The seller identifier.")
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public FeesEstimateIdentifier idType(String idType) {
        this.idType = idType;
        return this;
    }

    /**
     * The type of item identifier specified.
     *
     * @return idType
     **/
    @Schema(description = "The type of item identifier specified.")
    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public FeesEstimateIdentifier idValue(String idValue) {
        this.idValue = idValue;
        return this;
    }

    /**
     * The item identifier.
     *
     * @return idValue
     **/
    @Schema(description = "The item identifier.")
    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue;
    }

    public FeesEstimateIdentifier isAmazonFulfilled(Boolean isAmazonFulfilled) {
        this.isAmazonFulfilled = isAmazonFulfilled;
        return this;
    }

    /**
     * When true, the offer is fulfilled by Amazon.
     *
     * @return isAmazonFulfilled
     **/
    @Schema(description = "When true, the offer is fulfilled by Amazon.")
    public Boolean isIsAmazonFulfilled() {
        return isAmazonFulfilled;
    }

    public void setIsAmazonFulfilled(Boolean isAmazonFulfilled) {
        this.isAmazonFulfilled = isAmazonFulfilled;
    }

    public FeesEstimateIdentifier priceToEstimateFees(PriceToEstimateFees priceToEstimateFees) {
        this.priceToEstimateFees = priceToEstimateFees;
        return this;
    }

    /**
     * Get priceToEstimateFees
     *
     * @return priceToEstimateFees
     **/
    @Schema(description = "")
    public PriceToEstimateFees getPriceToEstimateFees() {
        return priceToEstimateFees;
    }

    public void setPriceToEstimateFees(PriceToEstimateFees priceToEstimateFees) {
        this.priceToEstimateFees = priceToEstimateFees;
    }

    public FeesEstimateIdentifier sellerInputIdentifier(String sellerInputIdentifier) {
        this.sellerInputIdentifier = sellerInputIdentifier;
        return this;
    }

    /**
     * A unique identifier provided by the caller to track this request.
     *
     * @return sellerInputIdentifier
     **/
    @Schema(description = "A unique identifier provided by the caller to track this request.")
    public String getSellerInputIdentifier() {
        return sellerInputIdentifier;
    }

    public void setSellerInputIdentifier(String sellerInputIdentifier) {
        this.sellerInputIdentifier = sellerInputIdentifier;
    }

    public FeesEstimateIdentifier optionalFulfillmentProgram(OptionalFulfillmentProgram optionalFulfillmentProgram) {
        this.optionalFulfillmentProgram = optionalFulfillmentProgram;
        return this;
    }

    /**
     * Get optionalFulfillmentProgram
     *
     * @return optionalFulfillmentProgram
     **/
    @Schema(description = "")
    public OptionalFulfillmentProgram getOptionalFulfillmentProgram() {
        return optionalFulfillmentProgram;
    }

    public void setOptionalFulfillmentProgram(OptionalFulfillmentProgram optionalFulfillmentProgram) {
        this.optionalFulfillmentProgram = optionalFulfillmentProgram;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeesEstimateIdentifier feesEstimateIdentifier = (FeesEstimateIdentifier) o;
        return Objects.equals(this.marketplaceId, feesEstimateIdentifier.marketplaceId) &&
                Objects.equals(this.sellerId, feesEstimateIdentifier.sellerId) &&
                Objects.equals(this.idType, feesEstimateIdentifier.idType) &&
                Objects.equals(this.idValue, feesEstimateIdentifier.idValue) &&
                Objects.equals(this.isAmazonFulfilled, feesEstimateIdentifier.isAmazonFulfilled) &&
                Objects.equals(this.priceToEstimateFees, feesEstimateIdentifier.priceToEstimateFees) &&
                Objects.equals(this.sellerInputIdentifier, feesEstimateIdentifier.sellerInputIdentifier) &&
                Objects.equals(this.optionalFulfillmentProgram, feesEstimateIdentifier.optionalFulfillmentProgram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, sellerId, idType, idValue, isAmazonFulfilled, priceToEstimateFees, sellerInputIdentifier, optionalFulfillmentProgram);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeesEstimateIdentifier {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
        sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
        sb.append("    idValue: ").append(toIndentedString(idValue)).append("\n");
        sb.append("    isAmazonFulfilled: ").append(toIndentedString(isAmazonFulfilled)).append("\n");
        sb.append("    priceToEstimateFees: ").append(toIndentedString(priceToEstimateFees)).append("\n");
        sb.append("    sellerInputIdentifier: ").append(toIndentedString(sellerInputIdentifier)).append("\n");
        sb.append("    optionalFulfillmentProgram: ").append(toIndentedString(optionalFulfillmentProgram)).append("\n");
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
