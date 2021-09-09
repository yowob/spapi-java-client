package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.catalogitems.Item;
import com.amazon.spapi.models.catalogitems.ItemSearchResults;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for CatalogApi
 */
@Ignore
public class CatalogApiTest {
    private final CatalogApi api = new CatalogApi();

    /**
     * Retrieves details for an item in the Amazon catalog.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 5 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCatalogItemTest() throws ApiException {
        String asin = null;
        List<String> marketplaceIds = null;
        List<String> includedData = null;
        String locale = null;
        Item response = api.getCatalogItem(asin, marketplaceIds, includedData, locale);
        // TODO: test validations
    }

    /**
     * Search for and return a list of Amazon catalog items and associated information.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1 | 5 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCatalogItemsTest() throws ApiException {
        List<String> keywords = null;
        List<String> marketplaceIds = null;
        List<String> includedData = null;
        List<String> brandNames = null;
        List<String> classificationIds = null;
        Integer pageSize = null;
        String pageToken = null;
        String keywordsLocale = null;
        String locale = null;
        ItemSearchResults response = api.searchCatalogItems(keywords, marketplaceIds, includedData, brandNames, classificationIds, pageSize, pageToken, keywordsLocale, locale);
        // TODO: test validations
    }
}
