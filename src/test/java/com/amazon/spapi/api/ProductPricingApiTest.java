package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.productpricing.GetOffersResponse;
import com.amazon.spapi.models.productpricing.GetPricingResponse;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for ProductPricingApi
 */
@Ignore
public class ProductPricingApiTest {
    private final ProductPricingApi api = new ProductPricingApi();

    /**
     * Returns competitive pricing information for a seller&#x27;s offer listings based on seller SKU or ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCompetitivePricingTest() throws ApiException {
        String marketplaceId = null;
        String itemType = null;
        List<String> asins = null;
        List<String> skus = null;
        String customerType = null;
        GetPricingResponse response = api.getCompetitivePricing(marketplaceId, itemType, asins, skus, customerType);
        // TODO: test validations
    }

    /**
     * Returns the lowest priced offers for a single item based on ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getItemOffersTest() throws ApiException {
        String marketplaceId = null;
        String itemCondition = null;
        String asin = null;
        String customerType = null;
        GetOffersResponse response = api.getItemOffers(marketplaceId, itemCondition, asin, customerType);
        // TODO: test validations
    }

    /**
     * Returns the lowest priced offers for a single SKU listing.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListingOffersTest() throws ApiException {
        String marketplaceId = null;
        String itemCondition = null;
        String sellerSKU = null;
        String customerType = null;
        GetOffersResponse response = api.getListingOffers(marketplaceId, itemCondition, sellerSKU, customerType);
        // TODO: test validations
    }

    /**
     * Returns pricing information for a seller&#x27;s offer listings based on seller SKU or ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 20 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPricingTest() throws ApiException {
        String marketplaceId = null;
        String itemType = null;
        List<String> asins = null;
        List<String> skus = null;
        String itemCondition = null;
        String offerType = null;
        GetPricingResponse response = api.getPricing(marketplaceId, itemType, asins, skus, itemCondition, offerType);
        // TODO: test validations
    }
}
