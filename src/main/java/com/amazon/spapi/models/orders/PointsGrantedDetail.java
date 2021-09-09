package com.amazon.spapi.models.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The number of Amazon Points offered with the purchase of an item, and their monetary value.
 */
@Schema(description = "The number of Amazon Points offered with the purchase of an item, and their monetary value.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PointsGrantedDetail {
    @SerializedName("PointsNumber")
    private Integer pointsNumber = null;
    @SerializedName("PointsMonetaryValue")
    private Money pointsMonetaryValue = null;

    public PointsGrantedDetail pointsNumber(Integer pointsNumber) {
        this.pointsNumber = pointsNumber;
        return this;
    }

    /**
     * The number of Amazon Points granted with the purchase of an item.
     *
     * @return pointsNumber
     **/
    @Schema(description = "The number of Amazon Points granted with the purchase of an item.")
    public Integer getPointsNumber() {
        return pointsNumber;
    }

    public void setPointsNumber(Integer pointsNumber) {
        this.pointsNumber = pointsNumber;
    }

    public PointsGrantedDetail pointsMonetaryValue(Money pointsMonetaryValue) {
        this.pointsMonetaryValue = pointsMonetaryValue;
        return this;
    }

    /**
     * Get pointsMonetaryValue
     *
     * @return pointsMonetaryValue
     **/
    @Schema(description = "")
    public Money getPointsMonetaryValue() {
        return pointsMonetaryValue;
    }

    public void setPointsMonetaryValue(Money pointsMonetaryValue) {
        this.pointsMonetaryValue = pointsMonetaryValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PointsGrantedDetail pointsGrantedDetail = (PointsGrantedDetail) o;
        return Objects.equals(this.pointsNumber, pointsGrantedDetail.pointsNumber) &&
                Objects.equals(this.pointsMonetaryValue, pointsGrantedDetail.pointsMonetaryValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointsNumber, pointsMonetaryValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PointsGrantedDetail {\n");
        sb.append("    pointsNumber: ").append(toIndentedString(pointsNumber)).append("\n");
        sb.append("    pointsMonetaryValue: ").append(toIndentedString(pointsMonetaryValue)).append("\n");
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
