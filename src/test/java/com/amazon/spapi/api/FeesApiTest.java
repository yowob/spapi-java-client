package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.productfees.GetMyFeesEstimateRequest;
import com.amazon.spapi.models.productfees.GetMyFeesEstimateResponse;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for FeesApi
 */
@Ignore
public class FeesApiTest {
    private final FeesApi api = new FeesApi();

    /**
     * Returns the estimated fees for the item indicated by the specified Asin in the marketplace specified in the request body.  You can call getMyFeesEstimateForASIN for an item on behalf of a seller before the seller sets the item&#x27;s price. They can then take estimated fees into account. With each product fees request, you must include an original identifier. This identifier is included in the fees estimate so you can correlate a fees estimate with the original request.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMyFeesEstimateForASINTest() throws ApiException {
        GetMyFeesEstimateRequest body = null;
        String asin = null;
        GetMyFeesEstimateResponse response = api.getMyFeesEstimateForASIN(body, asin);
        // TODO: test validations
    }

    /**
     * Returns the estimated fees for the item indicated by the specified seller SKU in the marketplace specified in the request body.  You can call getMyFeesEstimateForSKU for an item on behalf of a seller before the seller sets the item&#x27;s price. They can then take estimated fees into account. With each fees estimate request, you must include an original identifier. This identifier is included in the fees estimate so you can correlate a fees estimate with the original request.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMyFeesEstimateForSKUTest() throws ApiException {
        GetMyFeesEstimateRequest body = null;
        String sellerSKU = null;
        GetMyFeesEstimateResponse response = api.getMyFeesEstimateForSKU(body, sellerSKU);
        // TODO: test validations
    }
}
