package com.amazon.spapi.models.listingsitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The request body schema for the patchListingsItem operation.
 */
@Schema(description = "The request body schema for the patchListingsItem operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ListingsItemPatchRequest {
    @SerializedName("productType")
    private String productType = null;
    @SerializedName("patches")
    private List<PatchOperation> patches = new ArrayList<PatchOperation>();

    public ListingsItemPatchRequest productType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * The Amazon product type of the listings item.
     *
     * @return productType
     **/
    @Schema(required = true, description = "The Amazon product type of the listings item.")
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public ListingsItemPatchRequest patches(List<PatchOperation> patches) {
        this.patches = patches;
        return this;
    }

    public ListingsItemPatchRequest addPatchesItem(PatchOperation patchesItem) {
        this.patches.add(patchesItem);
        return this;
    }

    /**
     * One or more JSON Patch operations to perform on the listings item.
     *
     * @return patches
     **/
    @Schema(required = true, description = "One or more JSON Patch operations to perform on the listings item.")
    public List<PatchOperation> getPatches() {
        return patches;
    }

    public void setPatches(List<PatchOperation> patches) {
        this.patches = patches;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListingsItemPatchRequest listingsItemPatchRequest = (ListingsItemPatchRequest) o;
        return Objects.equals(this.productType, listingsItemPatchRequest.productType) &&
                Objects.equals(this.patches, listingsItemPatchRequest.patches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productType, patches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListingsItemPatchRequest {\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    patches: ").append(toIndentedString(patches)).append("\n");
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
