package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The payload for the listFinancialEvents operation.
 */
@Schema(description = "The payload for the listFinancialEvents operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ListFinancialEventsPayload {
    @SerializedName("NextToken")
    private String nextToken = null;
    @SerializedName("FinancialEvents")
    private FinancialEvents financialEvents = null;

    public ListFinancialEventsPayload nextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * When present and not empty, pass this string token in the next request to return the next response page.
     *
     * @return nextToken
     **/
    @Schema(description = "When present and not empty, pass this string token in the next request to return the next response page.")
    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    public ListFinancialEventsPayload financialEvents(FinancialEvents financialEvents) {
        this.financialEvents = financialEvents;
        return this;
    }

    /**
     * Get financialEvents
     *
     * @return financialEvents
     **/
    @Schema(description = "")
    public FinancialEvents getFinancialEvents() {
        return financialEvents;
    }

    public void setFinancialEvents(FinancialEvents financialEvents) {
        this.financialEvents = financialEvents;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFinancialEventsPayload listFinancialEventsPayload = (ListFinancialEventsPayload) o;
        return Objects.equals(this.nextToken, listFinancialEventsPayload.nextToken) &&
                Objects.equals(this.financialEvents, listFinancialEventsPayload.financialEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextToken, financialEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFinancialEventsPayload {\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    financialEvents: ").append(toIndentedString(financialEvents)).append("\n");
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
