package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * CreateFulfillmentReturnResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class CreateFulfillmentReturnResult {
    @SerializedName("returnItems")
    private ReturnItemList returnItems = null;
    @SerializedName("invalidReturnItems")
    private InvalidReturnItemList invalidReturnItems = null;
    @SerializedName("returnAuthorizations")
    private ReturnAuthorizationList returnAuthorizations = null;

    public CreateFulfillmentReturnResult returnItems(ReturnItemList returnItems) {
        this.returnItems = returnItems;
        return this;
    }

    /**
     * Get returnItems
     *
     * @return returnItems
     **/
    @Schema(description = "")
    public ReturnItemList getReturnItems() {
        return returnItems;
    }

    public void setReturnItems(ReturnItemList returnItems) {
        this.returnItems = returnItems;
    }

    public CreateFulfillmentReturnResult invalidReturnItems(InvalidReturnItemList invalidReturnItems) {
        this.invalidReturnItems = invalidReturnItems;
        return this;
    }

    /**
     * Get invalidReturnItems
     *
     * @return invalidReturnItems
     **/
    @Schema(description = "")
    public InvalidReturnItemList getInvalidReturnItems() {
        return invalidReturnItems;
    }

    public void setInvalidReturnItems(InvalidReturnItemList invalidReturnItems) {
        this.invalidReturnItems = invalidReturnItems;
    }

    public CreateFulfillmentReturnResult returnAuthorizations(ReturnAuthorizationList returnAuthorizations) {
        this.returnAuthorizations = returnAuthorizations;
        return this;
    }

    /**
     * Get returnAuthorizations
     *
     * @return returnAuthorizations
     **/
    @Schema(description = "")
    public ReturnAuthorizationList getReturnAuthorizations() {
        return returnAuthorizations;
    }

    public void setReturnAuthorizations(ReturnAuthorizationList returnAuthorizations) {
        this.returnAuthorizations = returnAuthorizations;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFulfillmentReturnResult createFulfillmentReturnResult = (CreateFulfillmentReturnResult) o;
        return Objects.equals(this.returnItems, createFulfillmentReturnResult.returnItems) &&
                Objects.equals(this.invalidReturnItems, createFulfillmentReturnResult.invalidReturnItems) &&
                Objects.equals(this.returnAuthorizations, createFulfillmentReturnResult.returnAuthorizations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnItems, invalidReturnItems, returnAuthorizations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFulfillmentReturnResult {\n");
        sb.append("    returnItems: ").append(toIndentedString(returnItems)).append("\n");
        sb.append("    invalidReturnItems: ").append(toIndentedString(invalidReturnItems)).append("\n");
        sb.append("    returnAuthorizations: ").append(toIndentedString(returnAuthorizations)).append("\n");
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
