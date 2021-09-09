package com.amazon.spapi.models.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The payload for the listFinancialEventGroups operation.
 */
@Schema(description = "The payload for the listFinancialEventGroups operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ListFinancialEventGroupsPayload {
    @SerializedName("NextToken")
    private String nextToken = null;
    @SerializedName("FinancialEventGroupList")
    private FinancialEventGroupList financialEventGroupList = null;

    public ListFinancialEventGroupsPayload nextToken(String nextToken) {
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

    public ListFinancialEventGroupsPayload financialEventGroupList(FinancialEventGroupList financialEventGroupList) {
        this.financialEventGroupList = financialEventGroupList;
        return this;
    }

    /**
     * Get financialEventGroupList
     *
     * @return financialEventGroupList
     **/
    @Schema(description = "")
    public FinancialEventGroupList getFinancialEventGroupList() {
        return financialEventGroupList;
    }

    public void setFinancialEventGroupList(FinancialEventGroupList financialEventGroupList) {
        this.financialEventGroupList = financialEventGroupList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFinancialEventGroupsPayload listFinancialEventGroupsPayload = (ListFinancialEventGroupsPayload) o;
        return Objects.equals(this.nextToken, listFinancialEventGroupsPayload.nextToken) &&
                Objects.equals(this.financialEventGroupList, listFinancialEventGroupsPayload.financialEventGroupList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextToken, financialEventGroupList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFinancialEventGroupsPayload {\n");
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
        sb.append("    financialEventGroupList: ").append(toIndentedString(financialEventGroupList)).append("\n");
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
