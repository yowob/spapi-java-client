package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * SearchContentPublishRecordsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SearchContentPublishRecordsResponse extends AplusPaginatedResponse {
    @SerializedName("publishRecordList")
    private PublishRecordList publishRecordList = null;

    public SearchContentPublishRecordsResponse publishRecordList(PublishRecordList publishRecordList) {
        this.publishRecordList = publishRecordList;
        return this;
    }

    /**
     * Get publishRecordList
     *
     * @return publishRecordList
     **/
    @Schema(required = true, description = "")
    public PublishRecordList getPublishRecordList() {
        return publishRecordList;
    }

    public void setPublishRecordList(PublishRecordList publishRecordList) {
        this.publishRecordList = publishRecordList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchContentPublishRecordsResponse searchContentPublishRecordsResponse = (SearchContentPublishRecordsResponse) o;
        return Objects.equals(this.publishRecordList, searchContentPublishRecordsResponse.publishRecordList) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishRecordList, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchContentPublishRecordsResponse {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    publishRecordList: ").append(toIndentedString(publishRecordList)).append("\n");
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
