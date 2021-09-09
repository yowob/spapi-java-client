package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.shipmentinvoicing.GetInvoiceStatusResponse;
import com.amazon.spapi.models.shipmentinvoicing.GetShipmentDetailsResponse;
import com.amazon.spapi.models.shipmentinvoicing.SubmitInvoiceRequest;
import com.amazon.spapi.models.shipmentinvoicing.SubmitInvoiceResponse;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ShipmentInvoiceApi
 */
@Ignore
public class ShipmentInvoiceApiTest {
    private final ShipmentInvoiceApi api = new ShipmentInvoiceApi();

    /**
     * Returns the invoice status for the shipment you specify.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1.133 | 25 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInvoiceStatusTest() throws ApiException {
        String shipmentId = null;
        GetInvoiceStatusResponse response = api.getInvoiceStatus(shipmentId);
        // TODO: test validations
    }

    /**
     * Returns the shipment details required to issue an invoice for the specified shipment.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1.133 | 25 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getShipmentDetailsTest() throws ApiException {
        String shipmentId = null;
        GetShipmentDetailsResponse response = api.getShipmentDetails(shipmentId);
        // TODO: test validations
    }

    /**
     * Submits a shipment invoice document for a given shipment.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1.133 | 25 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitInvoiceTest() throws ApiException {
        SubmitInvoiceRequest body = null;
        String shipmentId = null;
        SubmitInvoiceResponse response = api.submitInvoice(body, shipmentId);
        // TODO: test validations
    }
}
