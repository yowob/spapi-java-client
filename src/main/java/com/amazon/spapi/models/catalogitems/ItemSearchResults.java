package com.amazon.spapi.models.catalogitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Items in the Amazon catalog and search related metadata.
 */
@Schema(description = "Items in the Amazon catalog and search related metadata.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemSearchResults {
    @SerializedName("numberOfResults")
    private Integer numberOfResults = null;
    @SerializedName("pagination")
    private Pagination pagination = null;
    @SerializedName("refinements")
    private Refinements refinements = null;
    @SerializedName("items")
    private List<Item> items = new ArrayList<Item>();

    public ItemSearchResults numberOfResults(Integer numberOfResults) {
        this.numberOfResults = numberOfResults;
        return this;
    }

    /**
     * The estimated total number of products matched by the search query (only results up to the page count limit will be returned per request regardless of the number found).  Note: The maximum number of items (ASINs) that can be returned and paged through is 1000.
     *
     * @return numberOfResults
     **/
    @Schema(required = true, description = "The estimated total number of products matched by the search query (only results up to the page count limit will be returned per request regardless of the number found).  Note: The maximum number of items (ASINs) that can be returned and paged through is 1000.")
    public Integer getNumberOfResults() {
        return numberOfResults;
    }

    public void setNumberOfResults(Integer numberOfResults) {
        this.numberOfResults = numberOfResults;
    }

    public ItemSearchResults pagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Get pagination
     *
     * @return pagination
     **/
    @Schema(required = true, description = "")
    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public ItemSearchResults refinements(Refinements refinements) {
        this.refinements = refinements;
        return this;
    }

    /**
     * Get refinements
     *
     * @return refinements
     **/
    @Schema(required = true, description = "")
    public Refinements getRefinements() {
        return refinements;
    }

    public void setRefinements(Refinements refinements) {
        this.refinements = refinements;
    }

    public ItemSearchResults items(List<Item> items) {
        this.items = items;
        return this;
    }

    public ItemSearchResults addItemsItem(Item itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * A list of items from the Amazon catalog.
     *
     * @return items
     **/
    @Schema(required = true, description = "A list of items from the Amazon catalog.")
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemSearchResults itemSearchResults = (ItemSearchResults) o;
        return Objects.equals(this.numberOfResults, itemSearchResults.numberOfResults) &&
                Objects.equals(this.pagination, itemSearchResults.pagination) &&
                Objects.equals(this.refinements, itemSearchResults.refinements) &&
                Objects.equals(this.items, itemSearchResults.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfResults, pagination, refinements, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemSearchResults {\n");
        sb.append("    numberOfResults: ").append(toIndentedString(numberOfResults)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
        sb.append("    refinements: ").append(toIndentedString(refinements)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
