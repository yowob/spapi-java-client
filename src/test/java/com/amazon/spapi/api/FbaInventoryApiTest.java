package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.fbainventory.GetInventorySummariesResponse;
import org.junit.Ignore;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;

import java.util.List;

/**
 * API tests for FbaInventoryApi
 */
@Ignore
public class FbaInventoryApiTest {
    private final FbaInventoryApi api = new FbaInventoryApi();

    /**
     * Returns a list of inventory summaries. The summaries returned depend on the presence or absence of the startDateTime and sellerSkus parameters:  - All inventory summaries with available details are returned when the startDateTime and sellerSkus parameters are omitted. - When startDateTime is provided, the operation returns inventory summaries that have had changes after the date and time specified. The sellerSkus parameter is ignored. - When the sellerSkus parameter is provided, the operation returns inventory summaries for only the specified sellerSkus.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInventorySummariesTest() throws ApiException {
        String granularityType = null;
        String granularityId = null;
        List<String> marketplaceIds = null;
        Boolean details = null;
        OffsetDateTime startDateTime = null;
        List<String> sellerSkus = null;
        String nextToken = null;
        GetInventorySummariesResponse response = api.getInventorySummaries(granularityType, granularityId, marketplaceIds, details, startDateTime, sellerSkus, nextToken);
        // TODO: test validations
    }
}
