package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.models.services.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for ServiceApi
 */
@Ignore
public class ServiceApiTest {
    private final ServiceApi api = new ServiceApi();

    /**
     * Adds an appointment to the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAppointmentForServiceJobByServiceJobIdTest() throws ApiException {
        AddAppointmentRequest body = null;
        String serviceJobId = null;
        SetAppointmentResponse response = api.addAppointmentForServiceJobByServiceJobId(body, serviceJobId);
        // TODO: test validations
    }

    /**
     * Cancels the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelServiceJobByServiceJobIdTest() throws ApiException {
        String serviceJobId = null;
        String cancellationReasonCode = null;
        CancelServiceJobByServiceJobIdResponse response = api.cancelServiceJobByServiceJobId(serviceJobId, cancellationReasonCode);
        // TODO: test validations
    }

    /**
     * Completes the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void completeServiceJobByServiceJobIdTest() throws ApiException {
        String serviceJobId = null;
        CompleteServiceJobByServiceJobIdResponse response = api.completeServiceJobByServiceJobId(serviceJobId);
        // TODO: test validations
    }

    /**
     * Gets service job details for the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 20 | 40 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceJobByServiceJobIdTest() throws ApiException {
        String serviceJobId = null;
        GetServiceJobByServiceJobIdResponse response = api.getServiceJobByServiceJobId(serviceJobId);
        // TODO: test validations
    }

    /**
     * Gets service job details for the specified filter query.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 40 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceJobsTest() throws ApiException {
        List<String> marketplaceIds = null;
        List<String> serviceOrderIds = null;
        List<String> serviceJobStatus = null;
        String pageToken = null;
        Integer pageSize = null;
        String sortField = null;
        String sortOrder = null;
        String createdAfter = null;
        String createdBefore = null;
        String lastUpdatedAfter = null;
        String lastUpdatedBefore = null;
        String scheduleStartDate = null;
        String scheduleEndDate = null;
        GetServiceJobsResponse response = api.getServiceJobs(marketplaceIds, serviceOrderIds, serviceJobStatus, pageToken, pageSize, sortField, sortOrder, createdAfter, createdBefore, lastUpdatedAfter, lastUpdatedBefore, scheduleStartDate, scheduleEndDate);
        // TODO: test validations
    }

    /**
     * Reschedules an appointment for the service job indicated by the service job identifier you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rescheduleAppointmentForServiceJobByServiceJobIdTest() throws ApiException {
        RescheduleAppointmentRequest body = null;
        String serviceJobId = null;
        String appointmentId = null;
        SetAppointmentResponse response = api.rescheduleAppointmentForServiceJobByServiceJobId(body, serviceJobId, appointmentId);
        // TODO: test validations
    }
}
