package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.fbainbound.GetItemEligibilityPreviewResponse;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for FbaInboundApi
 */
@Ignore
public class FbaInboundApiTest {
    private final FbaInboundApi api = new FbaInboundApi();

    /**
     * This operation gets an eligibility preview for an item that you specify. You can specify the type of eligibility preview that you want (INBOUND or COMMINGLING). For INBOUND previews, you can specify the marketplace in which you want to determine the item&#x27;s eligibility.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getItemEligibilityPreviewTest() throws ApiException {
        String asin = null;
        String program = null;
        List<String> marketplaceIds = null;
//        GetItemEligibilityPreviewResponse response = api.getItemEligibilityPreview(asin, program, marketplaceIds);
        // TODO: test validations
    }
}
