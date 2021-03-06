package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.merchantfulfillment.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for MerchantFulfillmentApi
 */
@Ignore
public class MerchantFulfillmentApiTest {
    private final MerchantFulfillmentApi api = new MerchantFulfillmentApi();

    /**
     * Cancel the shipment indicated by the specified shipment identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
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
     * Cancel the shipment indicated by the specified shipment identifer.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelShipmentOldTest() throws ApiException {
        String shipmentId = null;
        CancelShipmentResponse response = api.cancelShipmentOld(shipmentId);
        // TODO: test validations
    }

    /**
     * Create a shipment with the information provided.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
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
     * Gets a list of additional seller inputs required for a ship method. This is generally used for international shipping.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAdditionalSellerInputsTest() throws ApiException {
        GetAdditionalSellerInputsRequest body = null;
        GetAdditionalSellerInputsResponse response = api.getAdditionalSellerInputs(body);
        // TODO: test validations
    }

    /**
     * Get a list of additional seller inputs required for a ship method. This is generally used for international shipping.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAdditionalSellerInputsOldTest() throws ApiException {
        GetAdditionalSellerInputsRequest body = null;
        GetAdditionalSellerInputsResponse response = api.getAdditionalSellerInputsOld(body);
        // TODO: test validations
    }

    /**
     * Returns a list of shipping service offers that satisfy the specified shipment request details.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEligibleShipmentServicesTest() throws ApiException {
        GetEligibleShipmentServicesRequest body = null;
        GetEligibleShipmentServicesResponse response = api.getEligibleShipmentServices(body);
        // TODO: test validations
    }

    /**
     * Returns a list of shipping service offers that satisfy the specified shipment request details.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEligibleShipmentServicesOldTest() throws ApiException {
        GetEligibleShipmentServicesRequest body = null;
        GetEligibleShipmentServicesResponse response = api.getEligibleShipmentServicesOld(body);
        // TODO: test validations
    }

    /**
     * Returns the shipment information for an existing shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getShipmentTest() throws ApiException {
        String shipmentId = null;
        GetShipmentResponse response = api.getShipment(shipmentId);
        // TODO: test validations
    }
}
