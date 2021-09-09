package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ListContentDocumentAsinRelationsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ListContentDocumentAsinRelationsResponse extends AplusPaginatedResponse {
    @SerializedName("asinMetadataSet")
    private AsinMetadataSet asinMetadataSet = null;

    public ListContentDocumentAsinRelationsResponse asinMetadataSet(AsinMetadataSet asinMetadataSet) {
        this.asinMetadataSet = asinMetadataSet;
        return this;
    }

    /**
     * Get asinMetadataSet
     *
     * @return asinMetadataSet
     **/
    @Schema(required = true, description = "")
    public AsinMetadataSet getAsinMetadataSet() {
        return asinMetadataSet;
    }

    public void setAsinMetadataSet(AsinMetadataSet asinMetadataSet) {
        this.asinMetadataSet = asinMetadataSet;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListContentDocumentAsinRelationsResponse listContentDocumentAsinRelationsResponse = (ListContentDocumentAsinRelationsResponse) o;
        return Objects.equals(this.asinMetadataSet, listContentDocumentAsinRelationsResponse.asinMetadataSet) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asinMetadataSet, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListContentDocumentAsinRelationsResponse {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    asinMetadataSet: ").append(toIndentedString(asinMetadataSet)).append("\n");
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
