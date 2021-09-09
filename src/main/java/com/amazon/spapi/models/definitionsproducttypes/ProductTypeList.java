package com.amazon.spapi.models.definitionsproducttypes;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A list of Amazon product types with definitions available.
 */
@Schema(description = "A list of Amazon product types with definitions available.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ProductTypeList {
    @SerializedName("productTypes")
    private List<ProductType> productTypes = new ArrayList<ProductType>();

    public ProductTypeList productTypes(List<ProductType> productTypes) {
        this.productTypes = productTypes;
        return this;
    }

    public ProductTypeList addProductTypesItem(ProductType productTypesItem) {
        this.productTypes.add(productTypesItem);
        return this;
    }

    /**
     * Get productTypes
     *
     * @return productTypes
     **/
    @Schema(required = true, description = "")
    public List<ProductType> getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(List<ProductType> productTypes) {
        this.productTypes = productTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductTypeList productTypeList = (ProductTypeList) o;
        return Objects.equals(this.productTypes, productTypeList.productTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductTypeList {\n");
        sb.append("    productTypes: ").append(toIndentedString(productTypes)).append("\n");
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
