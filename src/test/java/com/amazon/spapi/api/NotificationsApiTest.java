package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.notifications.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for NotificationsApi
 */
@Ignore
public class NotificationsApiTest {
    private final NotificationsApi api = new NotificationsApi();

    /**
     * Creates a destination resource to receive notifications. The createDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDestinationTest() throws ApiException {
        CreateDestinationRequest body = null;
        CreateDestinationResponse response = api.createDestination(body);
        // TODO: test validations
    }

    /**
     * Creates a subscription for the specified notification type to be delivered to the specified destination. Before you can subscribe, you must first create the destination by calling the createDestination operation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSubscriptionTest() throws ApiException {
        CreateSubscriptionRequest body = null;
        String notificationType = null;
        CreateSubscriptionResponse response = api.createSubscription(body, notificationType);
        // TODO: test validations
    }

    /**
     * Deletes the destination that you specify. The deleteDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDestinationTest() throws ApiException {
        String destinationId = null;
        DeleteDestinationResponse response = api.deleteDestination(destinationId);
        // TODO: test validations
    }

    /**
     * Deletes the subscription indicated by the subscription identifier and notification type that you specify. The subscription identifier can be for any subscription associated with your application. After you successfully call this operation, notifications will stop being sent for the associated subscription. The deleteSubscriptionById API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSubscriptionByIdTest() throws ApiException {
        String subscriptionId = null;
        String notificationType = null;
        DeleteSubscriptionByIdResponse response = api.deleteSubscriptionById(subscriptionId, notificationType);
        // TODO: test validations
    }

    /**
     * Returns information about the destination that you specify. The getDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDestinationTest() throws ApiException {
        String destinationId = null;
        GetDestinationResponse response = api.getDestination(destinationId);
        // TODO: test validations
    }

    /**
     * Returns information about all destinations. The getDestinations API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDestinationsTest() throws ApiException {
        GetDestinationsResponse response = api.getDestinations();
        // TODO: test validations
    }

    /**
     * Returns information about subscriptions of the specified notification type. You can use this API to get subscription information when you do not have a subscription identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSubscriptionTest() throws ApiException {
        String notificationType = null;
        GetSubscriptionResponse response = api.getSubscription(notificationType);
        // TODO: test validations
    }

    /**
     * Returns information about a subscription for the specified notification type. The getSubscriptionById API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSubscriptionByIdTest() throws ApiException {
        String subscriptionId = null;
        String notificationType = null;
        GetSubscriptionByIdResponse response = api.getSubscriptionById(subscriptionId, notificationType);
        // TODO: test validations
    }
}
