package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.listingsitems.ListingsItemPatchRequest;
import com.amazon.spapi.models.listingsitems.ListingsItemPutRequest;
import com.amazon.spapi.models.listingsitems.ListingsItemSubmissionResponse;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for ListingsApi
 */
@Ignore
public class ListingsApiTest {
    private final ListingsApi api = new ListingsApi();

    /**
     * Delete a listings item for a selling partner.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteListingsItemTest() throws ApiException {
        String sellerId = null;
        String sku = null;
        List<String> marketplaceIds = null;
        String issueLocale = null;
        ListingsItemSubmissionResponse response = api.deleteListingsItem(sellerId, sku, marketplaceIds, issueLocale);
        // TODO: test validations
    }

    /**
     * Partially update (patch) a listings item for a selling partner. Only top-level listings item attributes can be patched. Patching nested attributes is not supported.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchListingsItemTest() throws ApiException {
        ListingsItemPatchRequest body = null;
        List<String> marketplaceIds = null;
        String sellerId = null;
        String sku = null;
        String issueLocale = null;
        ListingsItemSubmissionResponse response = api.patchListingsItem(body, sellerId, sku, marketplaceIds, issueLocale);
        // TODO: test validations
    }

    /**
     * Creates a new or fully-updates an existing listings item for a selling partner.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putListingsItemTest() throws ApiException {
        ListingsItemPutRequest body = null;
        List<String> marketplaceIds = null;
        String sellerId = null;
        String sku = null;
        String issueLocale = null;
        ListingsItemSubmissionResponse response = api.putListingsItem(body, sellerId, sku, marketplaceIds, issueLocale);
        // TODO: test validations
    }
}
