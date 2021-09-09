package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.finances.ListFinancialEventGroupsResponse;
import com.amazon.spapi.models.finances.ListFinancialEventsResponse;
import org.junit.Ignore;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {
    private final DefaultApi api = new DefaultApi();

    /**
     * Returns financial event groups for a given date range.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFinancialEventGroupsTest() throws ApiException {
        Integer maxResultsPerPage = null;
        OffsetDateTime financialEventGroupStartedBefore = null;
        OffsetDateTime financialEventGroupStartedAfter = null;
        String nextToken = null;
        ListFinancialEventGroupsResponse response = api.listFinancialEventGroups(maxResultsPerPage, financialEventGroupStartedBefore, financialEventGroupStartedAfter, nextToken);
        // TODO: test validations
    }

    /**
     * Returns financial events for the specified data range.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFinancialEventsTest() throws ApiException {
        Integer maxResultsPerPage = null;
        OffsetDateTime postedAfter = null;
        OffsetDateTime postedBefore = null;
        String nextToken = null;
        ListFinancialEventsResponse response = api.listFinancialEvents(maxResultsPerPage, postedAfter, postedBefore, nextToken);
        // TODO: test validations
    }

    /**
     * Returns all financial events for the specified financial event group.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFinancialEventsByGroupIdTest() throws ApiException {
        String eventGroupId = null;
        Integer maxResultsPerPage = null;
        String nextToken = null;
        ListFinancialEventsResponse response = api.listFinancialEventsByGroupId(eventGroupId, maxResultsPerPage, nextToken);
        // TODO: test validations
    }

    /**
     * Returns all financial events for the specified order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFinancialEventsByOrderIdTest() throws ApiException {
        String orderId = null;
        Integer maxResultsPerPage = null;
        String nextToken = null;
        ListFinancialEventsResponse response = api.listFinancialEventsByOrderId(orderId, maxResultsPerPage, nextToken);
        // TODO: test validations
    }
}
