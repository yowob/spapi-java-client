package com.amazon.spapi.models.catalogitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Sales rank of an Amazon catalog item.
 */
@Schema(description = "Sales rank of an Amazon catalog item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemSalesRank {
    @SerializedName("title")
    private String title = null;
    @SerializedName("link")
    private String link = null;
    @SerializedName("rank")
    private Integer rank = null;

    public ItemSalesRank title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Title, or name, of the sales rank.
     *
     * @return title
     **/
    @Schema(required = true, description = "Title, or name, of the sales rank.")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ItemSalesRank link(String link) {
        this.link = link;
        return this;
    }

    /**
     * Corresponding Amazon retail website link, or URL, for the sales rank.
     *
     * @return link
     **/
    @Schema(description = "Corresponding Amazon retail website link, or URL, for the sales rank.")
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ItemSalesRank rank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * Sales rank value.
     *
     * @return rank
     **/
    @Schema(required = true, description = "Sales rank value.")
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemSalesRank itemSalesRank = (ItemSalesRank) o;
        return Objects.equals(this.title, itemSalesRank.title) &&
                Objects.equals(this.link, itemSalesRank.link) &&
                Objects.equals(this.rank, itemSalesRank.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, link, rank);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemSalesRank {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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
