package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The A+ Content standard label and description block, comprised of a pair of text components.
 */
@Schema(description = "The A+ Content standard label and description block, comprised of a pair of text components.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardTextPairBlock {
    @SerializedName("label")
    private TextComponent label = null;
    @SerializedName("description")
    private TextComponent description = null;

    public StandardTextPairBlock label(TextComponent label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     *
     * @return label
     **/
    @Schema(description = "")
    public TextComponent getLabel() {
        return label;
    }

    public void setLabel(TextComponent label) {
        this.label = label;
    }

    public StandardTextPairBlock description(TextComponent description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @Schema(description = "")
    public TextComponent getDescription() {
        return description;
    }

    public void setDescription(TextComponent description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardTextPairBlock standardTextPairBlock = (StandardTextPairBlock) o;
        return Objects.equals(this.label, standardTextPairBlock.label) &&
                Objects.equals(this.description, standardTextPairBlock.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardTextPairBlock {\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
