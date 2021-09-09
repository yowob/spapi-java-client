package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PostContentDocumentAsinRelationsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PostContentDocumentAsinRelationsRequest {
    @SerializedName("asinSet")
    private AsinSet asinSet = null;

    public PostContentDocumentAsinRelationsRequest asinSet(AsinSet asinSet) {
        this.asinSet = asinSet;
        return this;
    }

    /**
     * Get asinSet
     *
     * @return asinSet
     **/
    @Schema(required = true, description = "")
    public AsinSet getAsinSet() {
        return asinSet;
    }

    public void setAsinSet(AsinSet asinSet) {
        this.asinSet = asinSet;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostContentDocumentAsinRelationsRequest postContentDocumentAsinRelationsRequest = (PostContentDocumentAsinRelationsRequest) o;
        return Objects.equals(this.asinSet, postContentDocumentAsinRelationsRequest.asinSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asinSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostContentDocumentAsinRelationsRequest {\n");
        sb.append("    asinSet: ").append(toIndentedString(asinSet)).append("\n");
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
