package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.orders.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for OrdersV0Api
 */
@Ignore
public class OrdersV0ApiTest {
    private final OrdersV0Api api = new OrdersV0Api();

    /**
     * Returns the order indicated by the specified order ID.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 0.0055 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderTest() throws ApiException {
        String orderId = null;
        GetOrderResponse response = api.getOrder(orderId);
        // TODO: test validations
    }

    /**
     * Returns the shipping address for the specified order.  **Important.** We recommend using the getOrders operation to get shipping address information for an order, as the getOrderAddress operation is scheduled for deprecation on January 12, 2022. For more information, see the [Tokens API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/tokens-api-use-case-guide/tokens-API-use-case-guide-2021-03-01.md).  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 0.0055 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderAddressTest() throws ApiException {
        String orderId = null;
        GetOrderAddressResponse response = api.getOrderAddress(orderId);
        // TODO: test validations
    }

    /**
     * Returns buyer information for the specified order.  **Important.** We recommend using the getOrders operation to get buyer information for an order, as the getOrderBuyerInfo operation is scheduled for deprecation on January 12, 2022. For more information, see the [Tokens API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/tokens-api-use-case-guide/tokens-API-use-case-guide-2021-03-01.md).  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 0.0055 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderBuyerInfoTest() throws ApiException {
        String orderId = null;
        GetOrderBuyerInfoResponse response = api.getOrderBuyerInfo(orderId);
        // TODO: test validations
    }

    /**
     * Returns detailed order item information for the order indicated by the specified order ID. If NextToken is provided, it&#x27;s used to retrieve the next page of order items.  Note: When an order is in the Pending state (the order has been placed but payment has not been authorized), the getOrderItems operation does not return information about pricing, taxes, shipping charges, gift status or promotions for the order items in the order. After an order leaves the Pending state (this occurs when payment has been authorized) and enters the Unshipped, Partially Shipped, or Shipped state, the getOrderItems operation returns information about pricing, taxes, shipping charges, gift status and promotions for the order items in the order.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 0.0055 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderItemsTest() throws ApiException {
        String orderId = null;
        String nextToken = null;
        GetOrderItemsResponse response = api.getOrderItems(orderId, nextToken);
        // TODO: test validations
    }

    /**
     * Returns buyer information for the order items in the specified order.  **Important.** We recommend using the getOrderItems operation to get buyer information for the order items in an order, as the getOrderItemsBuyerInfo operation is scheduled for deprecation on January 12, 2022. For more information, see the [Tokens API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/tokens-api-use-case-guide/tokens-API-use-case-guide-2021-03-01.md).  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 0.0055 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderItemsBuyerInfoTest() throws ApiException {
        String orderId = null;
        String nextToken = null;
        GetOrderItemsBuyerInfoResponse response = api.getOrderItemsBuyerInfo(orderId, nextToken);
        // TODO: test validations
    }

    /**
     * Returns orders created or updated during the time frame indicated by the specified parameters. You can also apply a range of filtering criteria to narrow the list of orders returned. If NextToken is present, that will be used to retrieve the orders instead of other criteria.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 0.0055 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrdersTest() throws ApiException {
        List<String> marketplaceIds = null;
        String createdAfter = null;
        String createdBefore = null;
        String lastUpdatedAfter = null;
        String lastUpdatedBefore = null;
        List<String> orderStatuses = null;
        List<String> fulfillmentChannels = null;
        List<String> paymentMethods = null;
        String buyerEmail = null;
        String sellerOrderId = null;
        Integer maxResultsPerPage = null;
        List<String> easyShipShipmentStatuses = null;
        String nextToken = null;
        List<String> amazonOrderIds = null;
        String actualFulfillmentSupplySourceId = null;
        Boolean isISPU = null;
        String storeChainStoreId = null;
        GetOrdersResponse response = api.getOrders(marketplaceIds, createdAfter, createdBefore, lastUpdatedAfter, lastUpdatedBefore, orderStatuses, fulfillmentChannels, paymentMethods, buyerEmail, sellerOrderId, maxResultsPerPage, easyShipShipmentStatuses, nextToken, amazonOrderIds, actualFulfillmentSupplySourceId, isISPU, storeChainStoreId);
        // TODO: test validations
    }
}
