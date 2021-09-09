package com.amazon.spapi.models.sales;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Contains order metrics.
 */
@Schema(description = "Contains order metrics.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class OrderMetricsInterval {
    @SerializedName("interval")
    private String interval = null;
    @SerializedName("unitCount")
    private Integer unitCount = null;
    @SerializedName("orderItemCount")
    private Integer orderItemCount = null;
    @SerializedName("orderCount")
    private Integer orderCount = null;
    @SerializedName("averageUnitPrice")
    private Money averageUnitPrice = null;
    @SerializedName("totalSales")
    private Money totalSales = null;

    public OrderMetricsInterval interval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * The interval of time based on requested granularity (ex. Hour, Day, etc.) If this is the first or the last interval from the list, it might contain incomplete data if the requested interval doesn&#x27;t align with the requested granularity (ex. request interval 2018-09-01T02:00:00Z--2018-09-04T19:00:00Z and granularity day will result in Sept 1st UTC day and Sept 4th UTC days having partial data).
     *
     * @return interval
     **/
    @Schema(required = true, description = "The interval of time based on requested granularity (ex. Hour, Day, etc.) If this is the first or the last interval from the list, it might contain incomplete data if the requested interval doesn't align with the requested granularity (ex. request interval 2018-09-01T02:00:00Z--2018-09-04T19:00:00Z and granularity day will result in Sept 1st UTC day and Sept 4th UTC days having partial data).")
    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public OrderMetricsInterval unitCount(Integer unitCount) {
        this.unitCount = unitCount;
        return this;
    }

    /**
     * The number of units in orders based on the specified filters.
     *
     * @return unitCount
     **/
    @Schema(required = true, description = "The number of units in orders based on the specified filters.")
    public Integer getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(Integer unitCount) {
        this.unitCount = unitCount;
    }

    public OrderMetricsInterval orderItemCount(Integer orderItemCount) {
        this.orderItemCount = orderItemCount;
        return this;
    }

    /**
     * The number of order items based on the specified filters.
     *
     * @return orderItemCount
     **/
    @Schema(required = true, description = "The number of order items based on the specified filters.")
    public Integer getOrderItemCount() {
        return orderItemCount;
    }

    public void setOrderItemCount(Integer orderItemCount) {
        this.orderItemCount = orderItemCount;
    }

    public OrderMetricsInterval orderCount(Integer orderCount) {
        this.orderCount = orderCount;
        return this;
    }

    /**
     * The number of orders based on the specified filters.
     *
     * @return orderCount
     **/
    @Schema(required = true, description = "The number of orders based on the specified filters.")
    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public OrderMetricsInterval averageUnitPrice(Money averageUnitPrice) {
        this.averageUnitPrice = averageUnitPrice;
        return this;
    }

    /**
     * Get averageUnitPrice
     *
     * @return averageUnitPrice
     **/
    @Schema(required = true, description = "")
    public Money getAverageUnitPrice() {
        return averageUnitPrice;
    }

    public void setAverageUnitPrice(Money averageUnitPrice) {
        this.averageUnitPrice = averageUnitPrice;
    }

    public OrderMetricsInterval totalSales(Money totalSales) {
        this.totalSales = totalSales;
        return this;
    }

    /**
     * Get totalSales
     *
     * @return totalSales
     **/
    @Schema(required = true, description = "")
    public Money getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Money totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderMetricsInterval orderMetricsInterval = (OrderMetricsInterval) o;
        return Objects.equals(this.interval, orderMetricsInterval.interval) &&
                Objects.equals(this.unitCount, orderMetricsInterval.unitCount) &&
                Objects.equals(this.orderItemCount, orderMetricsInterval.orderItemCount) &&
                Objects.equals(this.orderCount, orderMetricsInterval.orderCount) &&
                Objects.equals(this.averageUnitPrice, orderMetricsInterval.averageUnitPrice) &&
                Objects.equals(this.totalSales, orderMetricsInterval.totalSales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interval, unitCount, orderItemCount, orderCount, averageUnitPrice, totalSales);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderMetricsInterval {\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    unitCount: ").append(toIndentedString(unitCount)).append("\n");
        sb.append("    orderItemCount: ").append(toIndentedString(orderItemCount)).append("\n");
        sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
        sb.append("    averageUnitPrice: ").append(toIndentedString(averageUnitPrice)).append("\n");
        sb.append("    totalSales: ").append(toIndentedString(totalSales)).append("\n");
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
