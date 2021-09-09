package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * A fee event related to Amazon Imaging services.
 */
@Schema(description = "A fee event related to Amazon Imaging services.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ImagingServicesFeeEvent {
    @SerializedName("ImagingRequestBillingItemID")
    private String imagingRequestBillingItemID = null;
    @SerializedName("ASIN")
    private String ASIN = null;
    @SerializedName("PostedDate")
    private OffsetDateTime postedDate = null;
    @SerializedName("FeeList")
    private FeeComponentList feeList = null;

    public ImagingServicesFeeEvent imagingRequestBillingItemID(String imagingRequestBillingItemID) {
        this.imagingRequestBillingItemID = imagingRequestBillingItemID;
        return this;
    }

    /**
     * The identifier for the imaging services request.
     *
     * @return imagingRequestBillingItemID
     **/
    @Schema(description = "The identifier for the imaging services request.")
    public String getImagingRequestBillingItemID() {
        return imagingRequestBillingItemID;
    }

    public void setImagingRequestBillingItemID(String imagingRequestBillingItemID) {
        this.imagingRequestBillingItemID = imagingRequestBillingItemID;
    }

    public ImagingServicesFeeEvent ASIN(String ASIN) {
        this.ASIN = ASIN;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item for which the imaging service was requested.
     *
     * @return ASIN
     **/
    @Schema(description = "The Amazon Standard Identification Number (ASIN) of the item for which the imaging service was requested.")
    public String getASIN() {
        return ASIN;
    }

    public void setASIN(String ASIN) {
        this.ASIN = ASIN;
    }

    public ImagingServicesFeeEvent postedDate(OffsetDateTime postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * Get postedDate
     *
     * @return postedDate
     **/
    @Schema(description = "")
    public OffsetDateTime getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(OffsetDateTime postedDate) {
        this.postedDate = postedDate;
    }

    public ImagingServicesFeeEvent feeList(FeeComponentList feeList) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImagingServicesFeeEvent imagingServicesFeeEvent = (ImagingServicesFeeEvent) o;
        return Objects.equals(this.imagingRequestBillingItemID, imagingServicesFeeEvent.imagingRequestBillingItemID) &&
                Objects.equals(this.ASIN, imagingServicesFeeEvent.ASIN) &&
                Objects.equals(this.postedDate, imagingServicesFeeEvent.postedDate) &&
                Objects.equals(this.feeList, imagingServicesFeeEvent.feeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imagingRequestBillingItemID, ASIN, postedDate, feeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImagingServicesFeeEvent {\n");
        sb.append("    imagingRequestBillingItemID: ").append(toIndentedString(imagingRequestBillingItemID)).append("\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    feeList: ").append(toIndentedString(feeList)).append("\n");
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
