package com.amazon.spapi.models.fulfillmentoutbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Delivery and item information for a shipment in a fulfillment order.
 */
@Schema(description = "Delivery and item information for a shipment in a fulfillment order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class FulfillmentShipment {
    @SerializedName("amazonShipmentId")
    private String amazonShipmentId = null;
    @SerializedName("fulfillmentCenterId")
    private String fulfillmentCenterId = null;
    @SerializedName("fulfillmentShipmentStatus")
    private FulfillmentShipmentStatusEnum fulfillmentShipmentStatus = null;
    @SerializedName("shippingDate")
    private OffsetDateTime shippingDate = null;
    @SerializedName("estimatedArrivalDate")
    private OffsetDateTime estimatedArrivalDate = null;
    @SerializedName("shippingNotes")
    private List<String> shippingNotes = null;
    @SerializedName("fulfillmentShipmentItem")
    private FulfillmentShipmentItemList fulfillmentShipmentItem = null;
    @SerializedName("fulfillmentShipmentPackage")
    private FulfillmentShipmentPackageList fulfillmentShipmentPackage = null;

    public FulfillmentShipment amazonShipmentId(String amazonShipmentId) {
        this.amazonShipmentId = amazonShipmentId;
        return this;
    }

    /**
     * A shipment identifier assigned by Amazon.
     *
     * @return amazonShipmentId
     **/
    @Schema(required = true, description = "A shipment identifier assigned by Amazon.")
    public String getAmazonShipmentId() {
        return amazonShipmentId;
    }

    public void setAmazonShipmentId(String amazonShipmentId) {
        this.amazonShipmentId = amazonShipmentId;
    }

    public FulfillmentShipment fulfillmentCenterId(String fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
        return this;
    }

    /**
     * An identifier for the fulfillment center that the shipment will be sent from.
     *
     * @return fulfillmentCenterId
     **/
    @Schema(required = true, description = "An identifier for the fulfillment center that the shipment will be sent from.")
    public String getFulfillmentCenterId() {
        return fulfillmentCenterId;
    }

    public void setFulfillmentCenterId(String fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
    }

    public FulfillmentShipment fulfillmentShipmentStatus(FulfillmentShipmentStatusEnum fulfillmentShipmentStatus) {
        this.fulfillmentShipmentStatus = fulfillmentShipmentStatus;
        return this;
    }

    /**
     * The current status of the shipment.
     *
     * @return fulfillmentShipmentStatus
     **/
    @Schema(required = true, description = "The current status of the shipment.")
    public FulfillmentShipmentStatusEnum getFulfillmentShipmentStatus() {
        return fulfillmentShipmentStatus;
    }

    public void setFulfillmentShipmentStatus(FulfillmentShipmentStatusEnum fulfillmentShipmentStatus) {
        this.fulfillmentShipmentStatus = fulfillmentShipmentStatus;
    }

    public FulfillmentShipment shippingDate(OffsetDateTime shippingDate) {
        this.shippingDate = shippingDate;
        return this;
    }

    /**
     * Get shippingDate
     *
     * @return shippingDate
     **/
    @Schema(description = "")
    public OffsetDateTime getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(OffsetDateTime shippingDate) {
        this.shippingDate = shippingDate;
    }

    public FulfillmentShipment estimatedArrivalDate(OffsetDateTime estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
        return this;
    }

    /**
     * Get estimatedArrivalDate
     *
     * @return estimatedArrivalDate
     **/
    @Schema(description = "")
    public OffsetDateTime getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    public void setEstimatedArrivalDate(OffsetDateTime estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    public FulfillmentShipment shippingNotes(List<String> shippingNotes) {
        this.shippingNotes = shippingNotes;
        return this;
    }

    public FulfillmentShipment addShippingNotesItem(String shippingNotesItem) {
        if (this.shippingNotes == null) {
            this.shippingNotes = new ArrayList<String>();
        }
        this.shippingNotes.add(shippingNotesItem);
        return this;
    }

    /**
     * Provides additional insight into shipment timeline. Primairly used to communicate that actual delivery dates aren&#x27;t available.
     *
     * @return shippingNotes
     **/
    @Schema(description = "Provides additional insight into shipment timeline. Primairly used to communicate that actual delivery dates aren't available.")
    public List<String> getShippingNotes() {
        return shippingNotes;
    }

    public void setShippingNotes(List<String> shippingNotes) {
        this.shippingNotes = shippingNotes;
    }

    public FulfillmentShipment fulfillmentShipmentItem(FulfillmentShipmentItemList fulfillmentShipmentItem) {
        this.fulfillmentShipmentItem = fulfillmentShipmentItem;
        return this;
    }

    /**
     * Get fulfillmentShipmentItem
     *
     * @return fulfillmentShipmentItem
     **/
    @Schema(required = true, description = "")
    public FulfillmentShipmentItemList getFulfillmentShipmentItem() {
        return fulfillmentShipmentItem;
    }

    public void setFulfillmentShipmentItem(FulfillmentShipmentItemList fulfillmentShipmentItem) {
        this.fulfillmentShipmentItem = fulfillmentShipmentItem;
    }

    public FulfillmentShipment fulfillmentShipmentPackage(FulfillmentShipmentPackageList fulfillmentShipmentPackage) {
        this.fulfillmentShipmentPackage = fulfillmentShipmentPackage;
        return this;
    }

    /**
     * Get fulfillmentShipmentPackage
     *
     * @return fulfillmentShipmentPackage
     **/
    @Schema(description = "")
    public FulfillmentShipmentPackageList getFulfillmentShipmentPackage() {
        return fulfillmentShipmentPackage;
    }

    public void setFulfillmentShipmentPackage(FulfillmentShipmentPackageList fulfillmentShipmentPackage) {
        this.fulfillmentShipmentPackage = fulfillmentShipmentPackage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FulfillmentShipment fulfillmentShipment = (FulfillmentShipment) o;
        return Objects.equals(this.amazonShipmentId, fulfillmentShipment.amazonShipmentId) &&
                Objects.equals(this.fulfillmentCenterId, fulfillmentShipment.fulfillmentCenterId) &&
                Objects.equals(this.fulfillmentShipmentStatus, fulfillmentShipment.fulfillmentShipmentStatus) &&
                Objects.equals(this.shippingDate, fulfillmentShipment.shippingDate) &&
                Objects.equals(this.estimatedArrivalDate, fulfillmentShipment.estimatedArrivalDate) &&
                Objects.equals(this.shippingNotes, fulfillmentShipment.shippingNotes) &&
                Objects.equals(this.fulfillmentShipmentItem, fulfillmentShipment.fulfillmentShipmentItem) &&
                Objects.equals(this.fulfillmentShipmentPackage, fulfillmentShipment.fulfillmentShipmentPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amazonShipmentId, fulfillmentCenterId, fulfillmentShipmentStatus, shippingDate, estimatedArrivalDate, shippingNotes, fulfillmentShipmentItem, fulfillmentShipmentPackage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FulfillmentShipment {\n");
        sb.append("    amazonShipmentId: ").append(toIndentedString(amazonShipmentId)).append("\n");
        sb.append("    fulfillmentCenterId: ").append(toIndentedString(fulfillmentCenterId)).append("\n");
        sb.append("    fulfillmentShipmentStatus: ").append(toIndentedString(fulfillmentShipmentStatus)).append("\n");
        sb.append("    shippingDate: ").append(toIndentedString(shippingDate)).append("\n");
        sb.append("    estimatedArrivalDate: ").append(toIndentedString(estimatedArrivalDate)).append("\n");
        sb.append("    shippingNotes: ").append(toIndentedString(shippingNotes)).append("\n");
        sb.append("    fulfillmentShipmentItem: ").append(toIndentedString(fulfillmentShipmentItem)).append("\n");
        sb.append("    fulfillmentShipmentPackage: ").append(toIndentedString(fulfillmentShipmentPackage)).append("\n");
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

    /**
     * The current status of the shipment.
     */
    @JsonAdapter(FulfillmentShipmentStatusEnum.Adapter.class)
    public enum FulfillmentShipmentStatusEnum {
        PENDING("PENDING"),
        SHIPPED("SHIPPED"),
        CANCELLED_BY_FULFILLER("CANCELLED_BY_FULFILLER"),
        CANCELLED_BY_SELLER("CANCELLED_BY_SELLER");
        private String value;

        FulfillmentShipmentStatusEnum(String value) {
            this.value = value;
        }

        public static FulfillmentShipmentStatusEnum fromValue(String text) {
            for (FulfillmentShipmentStatusEnum b : FulfillmentShipmentStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<FulfillmentShipmentStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FulfillmentShipmentStatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FulfillmentShipmentStatusEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return FulfillmentShipmentStatusEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
