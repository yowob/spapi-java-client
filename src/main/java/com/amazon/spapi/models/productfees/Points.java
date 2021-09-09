package com.amazon.spapi.models.productfees;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Points
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Points {
    @SerializedName("PointsNumber")
    private Integer pointsNumber = null;
    @SerializedName("PointsMonetaryValue")
    private MoneyType pointsMonetaryValue = null;

    public Points pointsNumber(Integer pointsNumber) {
        this.pointsNumber = pointsNumber;
        return this;
    }

    /**
     * Get pointsNumber
     *
     * @return pointsNumber
     **/
    @Schema(description = "")
    public Integer getPointsNumber() {
        return pointsNumber;
    }

    public void setPointsNumber(Integer pointsNumber) {
        this.pointsNumber = pointsNumber;
    }

    public Points pointsMonetaryValue(MoneyType pointsMonetaryValue) {
        this.pointsMonetaryValue = pointsMonetaryValue;
        return this;
    }

    /**
     * Get pointsMonetaryValue
     *
     * @return pointsMonetaryValue
     **/
    @Schema(description = "")
    public MoneyType getPointsMonetaryValue() {
        return pointsMonetaryValue;
    }

    public void setPointsMonetaryValue(MoneyType pointsMonetaryValue) {
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
        Points points = (Points) o;
        return Objects.equals(this.pointsNumber, points.pointsNumber) &&
                Objects.equals(this.pointsMonetaryValue, points.pointsMonetaryValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointsNumber, pointsMonetaryValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Points {\n");
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
