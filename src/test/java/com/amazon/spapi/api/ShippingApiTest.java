package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.shipping.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ShippingApi
 */
@Ignore
public class ShippingApiTest {
    private final ShippingApi api = new ShippingApi();

    /**
     * Cancel a shipment by the given shipmentId.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelShipmentTest() throws ApiException {
        String shipmentId = null;
        CancelShipmentResponse response = api.cancelShipment(shipmentId);
        // TODO: test validations
    }

    /**
     * Create a new shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createShipmentTest() throws ApiException {
        CreateShipmentRequest body = null;
        CreateShipmentResponse response = api.createShipment(body);
        // TODO: test validations
    }

    /**
     * Verify if the current account is valid.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountTest() throws ApiException {
        GetAccountResponse response = api.getAccount();
        // TODO: test validations
    }

    /**
     * Get service rates.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRatesTest() throws ApiException {
        GetRatesRequest body = null;
        GetRatesResponse response = api.getRates(body);
        // TODO: test validations
    }

    /**
     * Return the entire shipment object for the shipmentId.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getShipmentTest() throws ApiException {
        String shipmentId = null;
        GetShipmentResponse response = api.getShipment(shipmentId);
        // TODO: test validations
    }

    /**
     * Return the tracking information of a shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTrackingInformationTest() throws ApiException {
        String trackingId = null;
        GetTrackingInformationResponse response = api.getTrackingInformation(trackingId);
        // TODO: test validations
    }

    /**
     * Purchase shipping labels based on a given rate.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void purchaseLabelsTest() throws ApiException {
        PurchaseLabelsRequest body = null;
        String shipmentId = null;
        PurchaseLabelsResponse response = api.purchaseLabels(body, shipmentId);
        // TODO: test validations
    }

    /**
     * Purchase shipping labels.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void purchaseShipmentTest() throws ApiException {
        PurchaseShipmentRequest body = null;
        PurchaseShipmentResponse response = api.purchaseShipment(body);
        // TODO: test validations
    }

    /**
     * Retrieve shipping label based on the shipment id and tracking id.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveShippingLabelTest() throws ApiException {
        RetrieveShippingLabelRequest body = null;
        String shipmentId = null;
        String trackingId = null;
        RetrieveShippingLabelResponse response = api.retrieveShippingLabel(body, shipmentId, trackingId);
        // TODO: test validations
    }
}
