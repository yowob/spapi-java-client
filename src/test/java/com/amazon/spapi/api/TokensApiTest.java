package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.tokens.CreateRestrictedDataTokenRequest;
import com.amazon.spapi.models.tokens.CreateRestrictedDataTokenResponse;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for TokensApi
 */
@Ignore
public class TokensApiTest {
    private final TokensApi api = new TokensApi();

    /**
     * Returns a Restricted Data Token (RDT) for one or more restricted resources that you specify. A restricted resource is the HTTP method and path from a restricted operation that returns Personally Identifiable Information (PII), plus a dataElements value that indicates the type of PII requested. See the Tokens API Use Case Guide for a list of restricted operations. Use the RDT returned here as the access token in subsequent calls to the corresponding restricted operations.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRestrictedDataTokenTest() throws ApiException {
        CreateRestrictedDataTokenRequest body = null;
        CreateRestrictedDataTokenResponse response = api.createRestrictedDataToken(body);
        // TODO: test validations
    }
}
