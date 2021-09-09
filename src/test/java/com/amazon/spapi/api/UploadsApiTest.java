package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.uploads.CreateUploadDestinationResponse;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for UploadsApi
 */
@Ignore
public class UploadsApiTest {
    private final UploadsApi api = new UploadsApi();

    /**
     * Creates an upload destination, returning the information required to upload a file to the destination and to programmatically access the file.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | .1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUploadDestinationForResourceTest() throws ApiException {
        List<String> marketplaceIds = null;
        String contentMD5 = null;
        String resource = null;
        String contentType = null;
        CreateUploadDestinationResponse response = api.createUploadDestinationForResource(marketplaceIds, contentMD5, resource, contentType);
        // TODO: test validations
    }
}
