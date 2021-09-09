package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.authorization.GetAuthorizationCodeResponse;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for AuthorizationApi
 */
@Ignore
public class AuthorizationApiTest {
    private final AuthorizationApi api = new AuthorizationApi();

    /**
     * Returns the Login with Amazon (LWA) authorization code for an existing Amazon MWS authorization.
     * <p>
     * With the getAuthorizationCode operation, you can request a Login With Amazon (LWA) authorization code that will allow you to call a Selling Partner API on behalf of a seller who has already authorized you to call Amazon Marketplace Web Service (Amazon MWS). You specify a developer ID, an MWS auth token, and a seller ID. Taken together, these represent the Amazon MWS authorization that the seller previously granted you. The operation returns an LWA authorization code that can be exchanged for a refresh token and access token representing authorization to call the Selling Partner API on the seller&#x27;s behalf. By using this API, sellers who have already authorized you for Amazon MWS do not need to re-authorize you for the Selling Partner API.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAuthorizationCodeTest() throws ApiException {
        String sellingPartnerId = null;
        String developerId = null;
        String mwsAuthToken = null;
        GetAuthorizationCodeResponse response = api.getAuthorizationCode(sellingPartnerId, developerId, mwsAuthToken);
        // TODO: test validations
    }
}
