package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * An item.
 */
@Schema(description = "An item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Product {
    @SerializedName("Identifiers")
    private IdentifierType identifiers = null;
    @SerializedName("AttributeSets")
    private AttributeSetList attributeSets = null;
    @SerializedName("Relationships")
    private RelationshipList relationships = null;
    @SerializedName("CompetitivePricing")
    private CompetitivePricingType competitivePricing = null;
    @SerializedName("SalesRankings")
    private SalesRankList salesRankings = null;
    @SerializedName("Offers")
    private OffersList offers = null;

    public Product identifiers(IdentifierType identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    /**
     * Get identifiers
     *
     * @return identifiers
     **/
    @Schema(required = true, description = "")
    public IdentifierType getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(IdentifierType identifiers) {
        this.identifiers = identifiers;
    }

    public Product attributeSets(AttributeSetList attributeSets) {
        this.attributeSets = attributeSets;
        return this;
    }

    /**
     * Get attributeSets
     *
     * @return attributeSets
     **/
    @Schema(description = "")
    public AttributeSetList getAttributeSets() {
        return attributeSets;
    }

    public void setAttributeSets(AttributeSetList attributeSets) {
        this.attributeSets = attributeSets;
    }

    public Product relationships(RelationshipList relationships) {
        this.relationships = relationships;
        return this;
    }

    /**
     * Get relationships
     *
     * @return relationships
     **/
    @Schema(description = "")
    public RelationshipList getRelationships() {
        return relationships;
    }

    public void setRelationships(RelationshipList relationships) {
        this.relationships = relationships;
    }

    public Product competitivePricing(CompetitivePricingType competitivePricing) {
        this.competitivePricing = competitivePricing;
        return this;
    }

    /**
     * Get competitivePricing
     *
     * @return competitivePricing
     **/
    @Schema(description = "")
    public CompetitivePricingType getCompetitivePricing() {
        return competitivePricing;
    }

    public void setCompetitivePricing(CompetitivePricingType competitivePricing) {
        this.competitivePricing = competitivePricing;
    }

    public Product salesRankings(SalesRankList salesRankings) {
        this.salesRankings = salesRankings;
        return this;
    }

    /**
     * Get salesRankings
     *
     * @return salesRankings
     **/
    @Schema(description = "")
    public SalesRankList getSalesRankings() {
        return salesRankings;
    }

    public void setSalesRankings(SalesRankList salesRankings) {
        this.salesRankings = salesRankings;
    }

    public Product offers(OffersList offers) {
        this.offers = offers;
        return this;
    }

    /**
     * Get offers
     *
     * @return offers
     **/
    @Schema(description = "")
    public OffersList getOffers() {
        return offers;
    }

    public void setOffers(OffersList offers) {
        this.offers = offers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(this.identifiers, product.identifiers) &&
                Objects.equals(this.attributeSets, product.attributeSets) &&
                Objects.equals(this.relationships, product.relationships) &&
                Objects.equals(this.competitivePricing, product.competitivePricing) &&
                Objects.equals(this.salesRankings, product.salesRankings) &&
                Objects.equals(this.offers, product.offers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiers, attributeSets, relationships, competitivePricing, salesRankings, offers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Product {\n");
        sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
        sb.append("    attributeSets: ").append(toIndentedString(attributeSets)).append("\n");
        sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
        sb.append("    competitivePricing: ").append(toIndentedString(competitivePricing)).append("\n");
        sb.append("    salesRankings: ").append(toIndentedString(salesRankings)).append("\n");
        sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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
