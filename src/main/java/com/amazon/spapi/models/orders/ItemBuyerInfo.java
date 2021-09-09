package com.amazon.spapi.models.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A single item&#x27;s buyer information.
 */
@Schema(description = "A single item's buyer information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemBuyerInfo {
    @SerializedName("BuyerCustomizedInfo")
    private BuyerCustomizedInfoDetail buyerCustomizedInfo = null;
    @SerializedName("GiftWrapPrice")
    private Money giftWrapPrice = null;
    @SerializedName("GiftWrapTax")
    private Money giftWrapTax = null;
    @SerializedName("GiftMessageText")
    private String giftMessageText = null;
    @SerializedName("GiftWrapLevel")
    private String giftWrapLevel = null;

    public ItemBuyerInfo buyerCustomizedInfo(BuyerCustomizedInfoDetail buyerCustomizedInfo) {
        this.buyerCustomizedInfo = buyerCustomizedInfo;
        return this;
    }

    /**
     * Get buyerCustomizedInfo
     *
     * @return buyerCustomizedInfo
     **/
    @Schema(description = "")
    public BuyerCustomizedInfoDetail getBuyerCustomizedInfo() {
        return buyerCustomizedInfo;
    }

    public void setBuyerCustomizedInfo(BuyerCustomizedInfoDetail buyerCustomizedInfo) {
        this.buyerCustomizedInfo = buyerCustomizedInfo;
    }

    public ItemBuyerInfo giftWrapPrice(Money giftWrapPrice) {
        this.giftWrapPrice = giftWrapPrice;
        return this;
    }

    /**
     * Get giftWrapPrice
     *
     * @return giftWrapPrice
     **/
    @Schema(description = "")
    public Money getGiftWrapPrice() {
        return giftWrapPrice;
    }

    public void setGiftWrapPrice(Money giftWrapPrice) {
        this.giftWrapPrice = giftWrapPrice;
    }

    public ItemBuyerInfo giftWrapTax(Money giftWrapTax) {
        this.giftWrapTax = giftWrapTax;
        return this;
    }

    /**
     * Get giftWrapTax
     *
     * @return giftWrapTax
     **/
    @Schema(description = "")
    public Money getGiftWrapTax() {
        return giftWrapTax;
    }

    public void setGiftWrapTax(Money giftWrapTax) {
        this.giftWrapTax = giftWrapTax;
    }

    public ItemBuyerInfo giftMessageText(String giftMessageText) {
        this.giftMessageText = giftMessageText;
        return this;
    }

    /**
     * A gift message provided by the buyer.
     *
     * @return giftMessageText
     **/
    @Schema(description = "A gift message provided by the buyer.")
    public String getGiftMessageText() {
        return giftMessageText;
    }

    public void setGiftMessageText(String giftMessageText) {
        this.giftMessageText = giftMessageText;
    }

    public ItemBuyerInfo giftWrapLevel(String giftWrapLevel) {
        this.giftWrapLevel = giftWrapLevel;
        return this;
    }

    /**
     * The gift wrap level specified by the buyer.
     *
     * @return giftWrapLevel
     **/
    @Schema(description = "The gift wrap level specified by the buyer.")
    public String getGiftWrapLevel() {
        return giftWrapLevel;
    }

    public void setGiftWrapLevel(String giftWrapLevel) {
        this.giftWrapLevel = giftWrapLevel;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemBuyerInfo itemBuyerInfo = (ItemBuyerInfo) o;
        return Objects.equals(this.buyerCustomizedInfo, itemBuyerInfo.buyerCustomizedInfo) &&
                Objects.equals(this.giftWrapPrice, itemBuyerInfo.giftWrapPrice) &&
                Objects.equals(this.giftWrapTax, itemBuyerInfo.giftWrapTax) &&
                Objects.equals(this.giftMessageText, itemBuyerInfo.giftMessageText) &&
                Objects.equals(this.giftWrapLevel, itemBuyerInfo.giftWrapLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buyerCustomizedInfo, giftWrapPrice, giftWrapTax, giftMessageText, giftWrapLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemBuyerInfo {\n");
        sb.append("    buyerCustomizedInfo: ").append(toIndentedString(buyerCustomizedInfo)).append("\n");
        sb.append("    giftWrapPrice: ").append(toIndentedString(giftWrapPrice)).append("\n");
        sb.append("    giftWrapTax: ").append(toIndentedString(giftWrapTax)).append("\n");
        sb.append("    giftMessageText: ").append(toIndentedString(giftMessageText)).append("\n");
        sb.append("    giftWrapLevel: ").append(toIndentedString(giftWrapLevel)).append("\n");
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
