package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.definitionsproducttypes.ProductTypeDefinition;
import com.amazon.spapi.models.definitionsproducttypes.ProductTypeList;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for DefinitionsApi
 */
@Ignore
public class DefinitionsApiTest {
    private final DefinitionsApi api = new DefinitionsApi();

    /**
     * Retrieve an Amazon product type definition.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDefinitionsProductTypeTest() throws ApiException {
        String productType = null;
        List<String> marketplaceIds = null;
        String sellerId = null;
        String productTypeVersion = null;
        String requirements = null;
        String requirementsEnforced = null;
        String locale = null;
        ProductTypeDefinition response = api.getDefinitionsProductType(productType, marketplaceIds, sellerId, productTypeVersion, requirements, requirementsEnforced, locale);
        // TODO: test validations
    }

    /**
     * Search for and return a list of Amazon product types that have definitions available.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchDefinitionsProductTypesTest() throws ApiException {
        List<String> marketplaceIds = null;
        List<String> keywords = null;
        ProductTypeList response = api.searchDefinitionsProductTypes(marketplaceIds, keywords);
        // TODO: test validations
    }
}
