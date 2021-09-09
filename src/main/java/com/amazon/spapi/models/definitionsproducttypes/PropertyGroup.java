package com.amazon.spapi.models.definitionsproducttypes;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A property group represents a logical grouping of schema properties that can be used for display or informational purposes.
 */
@Schema(description = "A property group represents a logical grouping of schema properties that can be used for display or informational purposes.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PropertyGroup {
    @SerializedName("title")
    private String title = null;
    @SerializedName("description")
    private String description = null;
    @SerializedName("propertyNames")
    private List<String> propertyNames = null;

    public PropertyGroup title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The display label of the property group.
     *
     * @return title
     **/
    @Schema(description = "The display label of the property group.")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PropertyGroup description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of the property group.
     *
     * @return description
     **/
    @Schema(description = "The description of the property group.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PropertyGroup propertyNames(List<String> propertyNames) {
        this.propertyNames = propertyNames;
        return this;
    }

    public PropertyGroup addPropertyNamesItem(String propertyNamesItem) {
        if (this.propertyNames == null) {
            this.propertyNames = new ArrayList<String>();
        }
        this.propertyNames.add(propertyNamesItem);
        return this;
    }

    /**
     * The names of the schema properties for the property group.
     *
     * @return propertyNames
     **/
    @Schema(description = "The names of the schema properties for the property group.")
    public List<String> getPropertyNames() {
        return propertyNames;
    }

    public void setPropertyNames(List<String> propertyNames) {
        this.propertyNames = propertyNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertyGroup propertyGroup = (PropertyGroup) o;
        return Objects.equals(this.title, propertyGroup.title) &&
                Objects.equals(this.description, propertyGroup.description) &&
                Objects.equals(this.propertyNames, propertyGroup.propertyNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, propertyNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyGroup {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    propertyNames: ").append(toIndentedString(propertyNames)).append("\n");
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
