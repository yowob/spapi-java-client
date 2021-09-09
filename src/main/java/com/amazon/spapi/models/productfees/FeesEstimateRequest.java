package com.amazon.spapi.models.productfees;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * FeesEstimateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FeesEstimateRequest {
    @SerializedName("MarketplaceId")
    private String marketplaceId = null;
    @SerializedName("IsAmazonFulfilled")
    private Boolean isAmazonFulfilled = null;
    @SerializedName("PriceToEstimateFees")
    private PriceToEstimateFees priceToEstimateFees = null;
    @SerializedName("Identifier")
    private String identifier = null;
    @SerializedName("OptionalFulfillmentProgram")
    private OptionalFulfillmentProgram optionalFulfillmentProgram = null;

    public FeesEstimateRequest marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * A marketplace identifier.
     *
     * @return marketplaceId
     **/
    @Schema(required = true, description = "A marketplace identifier.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public FeesEstimateRequest isAmazonFulfilled(Boolean isAmazonFulfilled) {
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

    public FeesEstimateRequest priceToEstimateFees(PriceToEstimateFees priceToEstimateFees) {
        this.priceToEstimateFees = priceToEstimateFees;
        return this;
    }

    /**
     * Get priceToEstimateFees
     *
     * @return priceToEstimateFees
     **/
    @Schema(required = true, description = "")
    public PriceToEstimateFees getPriceToEstimateFees() {
        return priceToEstimateFees;
    }

    public void setPriceToEstimateFees(PriceToEstimateFees priceToEstimateFees) {
        this.priceToEstimateFees = priceToEstimateFees;
    }

    public FeesEstimateRequest identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * A unique identifier provided by the caller to track this request.
     *
     * @return identifier
     **/
    @Schema(required = true, description = "A unique identifier provided by the caller to track this request.")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public FeesEstimateRequest optionalFulfillmentProgram(OptionalFulfillmentProgram optionalFulfillmentProgram) {
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
        FeesEstimateRequest feesEstimateRequest = (FeesEstimateRequest) o;
        return Objects.equals(this.marketplaceId, feesEstimateRequest.marketplaceId) &&
                Objects.equals(this.isAmazonFulfilled, feesEstimateRequest.isAmazonFulfilled) &&
                Objects.equals(this.priceToEstimateFees, feesEstimateRequest.priceToEstimateFees) &&
                Objects.equals(this.identifier, feesEstimateRequest.identifier) &&
                Objects.equals(this.optionalFulfillmentProgram, feesEstimateRequest.optionalFulfillmentProgram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, isAmazonFulfilled, priceToEstimateFees, identifier, optionalFulfillmentProgram);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeesEstimateRequest {\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    isAmazonFulfilled: ").append(toIndentedString(isAmazonFulfilled)).append("\n");
        sb.append("    priceToEstimateFees: ").append(toIndentedString(priceToEstimateFees)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
