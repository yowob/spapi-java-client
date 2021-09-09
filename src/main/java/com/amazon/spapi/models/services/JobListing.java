package com.amazon.spapi.models.services;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The payload for the GetJobs operation.
 */
@Schema(description = "The payload for the GetJobs operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class JobListing {
    @SerializedName("totalResultSize")
    private Integer totalResultSize = null;
    @SerializedName("nextPageToken")
    private String nextPageToken = null;
    @SerializedName("previousPageToken")
    private String previousPageToken = null;
    @SerializedName("jobs")
    private List<ServiceJob> jobs = null;

    public JobListing totalResultSize(Integer totalResultSize) {
        this.totalResultSize = totalResultSize;
        return this;
    }

    /**
     * Total result size of the query result.
     *
     * @return totalResultSize
     **/
    @Schema(description = "Total result size of the query result.")
    public Integer getTotalResultSize() {
        return totalResultSize;
    }

    public void setTotalResultSize(Integer totalResultSize) {
        this.totalResultSize = totalResultSize;
    }

    public JobListing nextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * A generated string used to pass information to your next request.If nextPageToken is returned, pass the value of nextPageToken to the pageToken to get next results.
     *
     * @return nextPageToken
     **/
    @Schema(description = "A generated string used to pass information to your next request.If nextPageToken is returned, pass the value of nextPageToken to the pageToken to get next results.")
    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public JobListing previousPageToken(String previousPageToken) {
        this.previousPageToken = previousPageToken;
        return this;
    }

    /**
     * A generated string used to pass information to your next request.If previousPageToken is returned, pass the value of previousPageToken to the pageToken to get previous page results.
     *
     * @return previousPageToken
     **/
    @Schema(description = "A generated string used to pass information to your next request.If previousPageToken is returned, pass the value of previousPageToken to the pageToken to get previous page results.")
    public String getPreviousPageToken() {
        return previousPageToken;
    }

    public void setPreviousPageToken(String previousPageToken) {
        this.previousPageToken = previousPageToken;
    }

    public JobListing jobs(List<ServiceJob> jobs) {
        this.jobs = jobs;
        return this;
    }

    public JobListing addJobsItem(ServiceJob jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<ServiceJob>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    /**
     * List of job details for the given input.
     *
     * @return jobs
     **/
    @Schema(description = "List of job details for the given input.")
    public List<ServiceJob> getJobs() {
        return jobs;
    }

    public void setJobs(List<ServiceJob> jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobListing jobListing = (JobListing) o;
        return Objects.equals(this.totalResultSize, jobListing.totalResultSize) &&
                Objects.equals(this.nextPageToken, jobListing.nextPageToken) &&
                Objects.equals(this.previousPageToken, jobListing.previousPageToken) &&
                Objects.equals(this.jobs, jobListing.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalResultSize, nextPageToken, previousPageToken, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobListing {\n");
        sb.append("    totalResultSize: ").append(toIndentedString(totalResultSize)).append("\n");
        sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
        sb.append("    previousPageToken: ").append(toIndentedString(previousPageToken)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
