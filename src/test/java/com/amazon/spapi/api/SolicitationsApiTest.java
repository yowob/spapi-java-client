package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.solicitations.CreateProductReviewAndSellerFeedbackSolicitationResponse;
import com.amazon.spapi.models.solicitations.GetSolicitationActionsForOrderResponse;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for SolicitationsApi
 */
@Ignore
public class SolicitationsApiTest {
    private final SolicitationsApi api = new SolicitationsApi();

    /**
     * Sends a solicitation to a buyer asking for seller feedback and a product review for the specified order. Send only one productReviewAndSellerFeedback or free form proactive message per order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProductReviewAndSellerFeedbackSolicitationTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateProductReviewAndSellerFeedbackSolicitationResponse response = api.createProductReviewAndSellerFeedbackSolicitation(amazonOrderId, marketplaceIds);
        // TODO: test validations
    }

    /**
     * Returns a list of solicitation types that are available for an order that you specify. A solicitation type is represented by an actions object, which contains a path and query parameter(s). You can use the path and parameter(s) to call an operation that sends a solicitation. Currently only the productReviewAndSellerFeedbackSolicitation solicitation type is available.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSolicitationActionsForOrderTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        GetSolicitationActionsForOrderResponse response = api.getSolicitationActionsForOrder(amazonOrderId, marketplaceIds);
        // TODO: test validations
    }
}
