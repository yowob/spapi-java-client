package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A service fee on the seller&#x27;s account.
 */
@Schema(description = "A service fee on the seller's account.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ServiceFeeEvent {
    @SerializedName("AmazonOrderId")
    private String amazonOrderId = null;
    @SerializedName("FeeReason")
    private String feeReason = null;
    @SerializedName("FeeList")
    private FeeComponentList feeList = null;
    @SerializedName("SellerSKU")
    private String sellerSKU = null;
    @SerializedName("FnSKU")
    private String fnSKU = null;
    @SerializedName("FeeDescription")
    private String feeDescription = null;
    @SerializedName("ASIN")
    private String ASIN = null;

    public ServiceFeeEvent amazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * An Amazon-defined identifier for an order.
     *
     * @return amazonOrderId
     **/
    @Schema(description = "An Amazon-defined identifier for an order.")
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    public ServiceFeeEvent feeReason(String feeReason) {
        this.feeReason = feeReason;
        return this;
    }

    /**
     * A short description of the service fee reason.
     *
     * @return feeReason
     **/
    @Schema(description = "A short description of the service fee reason.")
    public String getFeeReason() {
        return feeReason;
    }

    public void setFeeReason(String feeReason) {
        this.feeReason = feeReason;
    }

    public ServiceFeeEvent feeList(FeeComponentList feeList) {
        this.feeList = feeList;
        return this;
    }

    /**
     * Get feeList
     *
     * @return feeList
     **/
    @Schema(description = "")
    public FeeComponentList getFeeList() {
        return feeList;
    }

    public void setFeeList(FeeComponentList feeList) {
        this.feeList = feeList;
    }

    public ServiceFeeEvent sellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * The seller SKU of the item. The seller SKU is qualified by the seller&#x27;s seller ID, which is included with every call to the Selling Partner API.
     *
     * @return sellerSKU
     **/
    @Schema(description = "The seller SKU of the item. The seller SKU is qualified by the seller's seller ID, which is included with every call to the Selling Partner API.")
    public String getSellerSKU() {
        return sellerSKU;
    }

    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    public ServiceFeeEvent fnSKU(String fnSKU) {
        this.fnSKU = fnSKU;
        return this;
    }

    /**
     * A unique identifier assigned by Amazon to products stored in and fulfilled from an Amazon fulfillment center.
     *
     * @return fnSKU
     **/
    @Schema(description = "A unique identifier assigned by Amazon to products stored in and fulfilled from an Amazon fulfillment center.")
    public String getFnSKU() {
        return fnSKU;
    }

    public void setFnSKU(String fnSKU) {
        this.fnSKU = fnSKU;
    }

    public ServiceFeeEvent feeDescription(String feeDescription) {
        this.feeDescription = feeDescription;
        return this;
    }

    /**
     * A short description of the service fee event.
     *
     * @return feeDescription
     **/
    @Schema(description = "A short description of the service fee event.")
    public String getFeeDescription() {
        return feeDescription;
    }

    public void setFeeDescription(String feeDescription) {
        this.feeDescription = feeDescription;
    }

    public ServiceFeeEvent ASIN(String ASIN) {
        this.ASIN = ASIN;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item.
     *
     * @return ASIN
     **/
    @Schema(description = "The Amazon Standard Identification Number (ASIN) of the item.")
    public String getASIN() {
        return ASIN;
    }

    public void setASIN(String ASIN) {
        this.ASIN = ASIN;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceFeeEvent serviceFeeEvent = (ServiceFeeEvent) o;
        return Objects.equals(this.amazonOrderId, serviceFeeEvent.amazonOrderId) &&
                Objects.equals(this.feeReason, serviceFeeEvent.feeReason) &&
                Objects.equals(this.feeList, serviceFeeEvent.feeList) &&
                Objects.equals(this.sellerSKU, serviceFeeEvent.sellerSKU) &&
                Objects.equals(this.fnSKU, serviceFeeEvent.fnSKU) &&
                Objects.equals(this.feeDescription, serviceFeeEvent.feeDescription) &&
                Objects.equals(this.ASIN, serviceFeeEvent.ASIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amazonOrderId, feeReason, feeList, sellerSKU, fnSKU, feeDescription, ASIN);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceFeeEvent {\n");
        sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
        sb.append("    feeReason: ").append(toIndentedString(feeReason)).append("\n");
        sb.append("    feeList: ").append(toIndentedString(feeList)).append("\n");
        sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
        sb.append("    fnSKU: ").append(toIndentedString(fnSKU)).append("\n");
        sb.append("    feeDescription: ").append(toIndentedString(feeDescription)).append("\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
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
