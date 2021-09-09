package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.sales.GetOrderMetricsResponse;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for SalesApi
 */
@Ignore
public class SalesApiTest {
    private final SalesApi api = new SalesApi();

    /**
     * Returns aggregated order metrics for given interval, broken down by granularity, for given buyer type.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | .5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderMetricsTest() throws ApiException {
        List<String> marketplaceIds = null;
        String interval = null;
        String granularity = null;
        String granularityTimeZone = null;
        String buyerType = null;
        String fulfillmentNetwork = null;
        String firstDayOfWeek = null;
        String asin = null;
        String sku = null;
        GetOrderMetricsResponse response = api.getOrderMetrics(marketplaceIds, interval, granularity, granularityTimeZone, buyerType, fulfillmentNetwork, firstDayOfWeek, asin, sku);
        // TODO: test validations
    }
}
