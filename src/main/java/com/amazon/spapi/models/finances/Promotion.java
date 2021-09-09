package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A promotion applied to an item.
 */
@Schema(description = "A promotion applied to an item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Promotion {
    @SerializedName("PromotionType")
    private String promotionType = null;
    @SerializedName("PromotionId")
    private String promotionId = null;
    @SerializedName("PromotionAmount")
    private Currency promotionAmount = null;

    public Promotion promotionType(String promotionType) {
        this.promotionType = promotionType;
        return this;
    }

    /**
     * The type of promotion.
     *
     * @return promotionType
     **/
    @Schema(description = "The type of promotion.")
    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public Promotion promotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }

    /**
     * The seller-specified identifier for the promotion.
     *
     * @return promotionId
     **/
    @Schema(description = "The seller-specified identifier for the promotion.")
    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public Promotion promotionAmount(Currency promotionAmount) {
        this.promotionAmount = promotionAmount;
        return this;
    }

    /**
     * Get promotionAmount
     *
     * @return promotionAmount
     **/
    @Schema(description = "")
    public Currency getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(Currency promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Promotion promotion = (Promotion) o;
        return Objects.equals(this.promotionType, promotion.promotionType) &&
                Objects.equals(this.promotionId, promotion.promotionId) &&
                Objects.equals(this.promotionAmount, promotion.promotionAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promotionType, promotionId, promotionAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Promotion {\n");
        sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
        sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
        sb.append("    promotionAmount: ").append(toIndentedString(promotionAmount)).append("\n");
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
