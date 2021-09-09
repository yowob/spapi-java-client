package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OfferType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class OfferType {
    @SerializedName("offerType")
    private OfferCustomerType offerType = null;
    @SerializedName("BuyingPrice")
    private PriceType buyingPrice = null;
    @SerializedName("RegularPrice")
    private MoneyType regularPrice = null;
    @SerializedName("businessPrice")
    private MoneyType businessPrice = null;
    @SerializedName("quantityDiscountPrices")
    private List<QuantityDiscountPriceType> quantityDiscountPrices = null;
    @SerializedName("FulfillmentChannel")
    private String fulfillmentChannel = null;
    @SerializedName("ItemCondition")
    private String itemCondition = null;
    @SerializedName("ItemSubCondition")
    private String itemSubCondition = null;
    @SerializedName("SellerSKU")
    private String sellerSKU = null;

    public OfferType offerType(OfferCustomerType offerType) {
        this.offerType = offerType;
        return this;
    }

    /**
     * Get offerType
     *
     * @return offerType
     **/
    @Schema(description = "")
    public OfferCustomerType getOfferType() {
        return offerType;
    }

    public void setOfferType(OfferCustomerType offerType) {
        this.offerType = offerType;
    }

    public OfferType buyingPrice(PriceType buyingPrice) {
        this.buyingPrice = buyingPrice;
        return this;
    }

    /**
     * Get buyingPrice
     *
     * @return buyingPrice
     **/
    @Schema(required = true, description = "")
    public PriceType getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(PriceType buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public OfferType regularPrice(MoneyType regularPrice) {
        this.regularPrice = regularPrice;
        return this;
    }

    /**
     * Get regularPrice
     *
     * @return regularPrice
     **/
    @Schema(required = true, description = "")
    public MoneyType getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(MoneyType regularPrice) {
        this.regularPrice = regularPrice;
    }

    public OfferType businessPrice(MoneyType businessPrice) {
        this.businessPrice = businessPrice;
        return this;
    }

    /**
     * Get businessPrice
     *
     * @return businessPrice
     **/
    @Schema(description = "")
    public MoneyType getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(MoneyType businessPrice) {
        this.businessPrice = businessPrice;
    }

    public OfferType quantityDiscountPrices(List<QuantityDiscountPriceType> quantityDiscountPrices) {
        this.quantityDiscountPrices = quantityDiscountPrices;
        return this;
    }

    public OfferType addQuantityDiscountPricesItem(QuantityDiscountPriceType quantityDiscountPricesItem) {
        if (this.quantityDiscountPrices == null) {
            this.quantityDiscountPrices = new ArrayList<QuantityDiscountPriceType>();
        }
        this.quantityDiscountPrices.add(quantityDiscountPricesItem);
        return this;
    }

    /**
     * Get quantityDiscountPrices
     *
     * @return quantityDiscountPrices
     **/
    @Schema(description = "")
    public List<QuantityDiscountPriceType> getQuantityDiscountPrices() {
        return quantityDiscountPrices;
    }

    public void setQuantityDiscountPrices(List<QuantityDiscountPriceType> quantityDiscountPrices) {
        this.quantityDiscountPrices = quantityDiscountPrices;
    }

    public OfferType fulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
        return this;
    }

    /**
     * The fulfillment channel for the offer listing. Possible values:  * Amazon - Fulfilled by Amazon. * Merchant - Fulfilled by the seller.
     *
     * @return fulfillmentChannel
     **/
    @Schema(required = true, description = "The fulfillment channel for the offer listing. Possible values:  * Amazon - Fulfilled by Amazon. * Merchant - Fulfilled by the seller.")
    public String getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    public void setFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
    }

    public OfferType itemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
        return this;
    }

    /**
     * The item condition for the offer listing. Possible values: New, Used, Collectible, Refurbished, or Club.
     *
     * @return itemCondition
     **/
    @Schema(required = true, description = "The item condition for the offer listing. Possible values: New, Used, Collectible, Refurbished, or Club.")
    public String getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }

    public OfferType itemSubCondition(String itemSubCondition) {
        this.itemSubCondition = itemSubCondition;
        return this;
    }

    /**
     * The item subcondition for the offer listing. Possible values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other.
     *
     * @return itemSubCondition
     **/
    @Schema(required = true, description = "The item subcondition for the offer listing. Possible values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other.")
    public String getItemSubCondition() {
        return itemSubCondition;
    }

    public void setItemSubCondition(String itemSubCondition) {
        this.itemSubCondition = itemSubCondition;
    }

    public OfferType sellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * The seller stock keeping unit (SKU) of the item.
     *
     * @return sellerSKU
     **/
    @Schema(required = true, description = "The seller stock keeping unit (SKU) of the item.")
    public String getSellerSKU() {
        return sellerSKU;
    }

    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OfferType offerType = (OfferType) o;
        return Objects.equals(this.offerType, offerType.offerType) &&
                Objects.equals(this.buyingPrice, offerType.buyingPrice) &&
                Objects.equals(this.regularPrice, offerType.regularPrice) &&
                Objects.equals(this.businessPrice, offerType.businessPrice) &&
                Objects.equals(this.quantityDiscountPrices, offerType.quantityDiscountPrices) &&
                Objects.equals(this.fulfillmentChannel, offerType.fulfillmentChannel) &&
                Objects.equals(this.itemCondition, offerType.itemCondition) &&
                Objects.equals(this.itemSubCondition, offerType.itemSubCondition) &&
                Objects.equals(this.sellerSKU, offerType.sellerSKU);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerType, buyingPrice, regularPrice, businessPrice, quantityDiscountPrices, fulfillmentChannel, itemCondition, itemSubCondition, sellerSKU);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferType {\n");
        sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
        sb.append("    buyingPrice: ").append(toIndentedString(buyingPrice)).append("\n");
        sb.append("    regularPrice: ").append(toIndentedString(regularPrice)).append("\n");
        sb.append("    businessPrice: ").append(toIndentedString(businessPrice)).append("\n");
        sb.append("    quantityDiscountPrices: ").append(toIndentedString(quantityDiscountPrices)).append("\n");
        sb.append("    fulfillmentChannel: ").append(toIndentedString(fulfillmentChannel)).append("\n");
        sb.append("    itemCondition: ").append(toIndentedString(itemCondition)).append("\n");
        sb.append("    itemSubCondition: ").append(toIndentedString(itemSubCondition)).append("\n");
        sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
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
