package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Competitive pricing information for the item.
 */
@Schema(description = "Competitive pricing information for the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CompetitivePricingType {
    @SerializedName("CompetitivePrices")
    private CompetitivePriceList competitivePrices = null;
    @SerializedName("NumberOfOfferListings")
    private NumberOfOfferListingsList numberOfOfferListings = null;
    @SerializedName("TradeInValue")
    private MoneyType tradeInValue = null;

    public CompetitivePricingType competitivePrices(CompetitivePriceList competitivePrices) {
        this.competitivePrices = competitivePrices;
        return this;
    }

    /**
     * Get competitivePrices
     *
     * @return competitivePrices
     **/
    @Schema(required = true, description = "")
    public CompetitivePriceList getCompetitivePrices() {
        return competitivePrices;
    }

    public void setCompetitivePrices(CompetitivePriceList competitivePrices) {
        this.competitivePrices = competitivePrices;
    }

    public CompetitivePricingType numberOfOfferListings(NumberOfOfferListingsList numberOfOfferListings) {
        this.numberOfOfferListings = numberOfOfferListings;
        return this;
    }

    /**
     * Get numberOfOfferListings
     *
     * @return numberOfOfferListings
     **/
    @Schema(required = true, description = "")
    public NumberOfOfferListingsList getNumberOfOfferListings() {
        return numberOfOfferListings;
    }

    public void setNumberOfOfferListings(NumberOfOfferListingsList numberOfOfferListings) {
        this.numberOfOfferListings = numberOfOfferListings;
    }

    public CompetitivePricingType tradeInValue(MoneyType tradeInValue) {
        this.tradeInValue = tradeInValue;
        return this;
    }

    /**
     * Get tradeInValue
     *
     * @return tradeInValue
     **/
    @Schema(description = "")
    public MoneyType getTradeInValue() {
        return tradeInValue;
    }

    public void setTradeInValue(MoneyType tradeInValue) {
        this.tradeInValue = tradeInValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompetitivePricingType competitivePricingType = (CompetitivePricingType) o;
        return Objects.equals(this.competitivePrices, competitivePricingType.competitivePrices) &&
                Objects.equals(this.numberOfOfferListings, competitivePricingType.numberOfOfferListings) &&
                Objects.equals(this.tradeInValue, competitivePricingType.tradeInValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(competitivePrices, numberOfOfferListings, tradeInValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompetitivePricingType {\n");
        sb.append("    competitivePrices: ").append(toIndentedString(competitivePrices)).append("\n");
        sb.append("    numberOfOfferListings: ").append(toIndentedString(numberOfOfferListings)).append("\n");
        sb.append("    tradeInValue: ").append(toIndentedString(tradeInValue)).append("\n");
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
