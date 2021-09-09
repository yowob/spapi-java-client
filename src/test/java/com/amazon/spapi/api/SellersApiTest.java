package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.sellers.GetMarketplaceParticipationsResponse;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for SellersApi
 */
@Ignore
public class SellersApiTest {
    private final SellersApi api = new SellersApi();

    /**
     * Returns a list of marketplaces that the seller submitting the request can sell in and information about the seller&#x27;s participation in those marketplaces.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | .016 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMarketplaceParticipationsTest() throws ApiException {
        GetMarketplaceParticipationsResponse response = api.getMarketplaceParticipations();
        // TODO: test validations
    }
}
