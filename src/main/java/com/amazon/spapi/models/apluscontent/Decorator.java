package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A decorator applied to a content string value in order to create rich text.
 */
@Schema(description = "A decorator applied to a content string value in order to create rich text.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Decorator {
    @SerializedName("type")
    private DecoratorType type = null;
    @SerializedName("offset")
    private Integer offset = null;
    @SerializedName("length")
    private Integer length = null;
    @SerializedName("depth")
    private Integer depth = null;

    public Decorator type(DecoratorType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @Schema(description = "")
    public DecoratorType getType() {
        return type;
    }

    public void setType(DecoratorType type) {
        this.type = type;
    }

    public Decorator offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * The starting character of this decorator within the content string. Use zero for the first character.
     * minimum: 0
     * maximum: 10000
     *
     * @return offset
     **/
    @Schema(description = "The starting character of this decorator within the content string. Use zero for the first character.")
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Decorator length(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * The number of content characters to alter with this decorator. Decorators such as line breaks can have zero length and fit between characters.
     * minimum: 0
     * maximum: 10000
     *
     * @return length
     **/
    @Schema(description = "The number of content characters to alter with this decorator. Decorators such as line breaks can have zero length and fit between characters.")
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Decorator depth(Integer depth) {
        this.depth = depth;
        return this;
    }

    /**
     * The relative intensity or variation of this decorator. Decorators such as bullet-points, for example, can have multiple indentation depths.
     * minimum: 0
     * maximum: 100
     *
     * @return depth
     **/
    @Schema(description = "The relative intensity or variation of this decorator. Decorators such as bullet-points, for example, can have multiple indentation depths.")
    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Decorator decorator = (Decorator) o;
        return Objects.equals(this.type, decorator.type) &&
                Objects.equals(this.offset, decorator.offset) &&
                Objects.equals(this.length, decorator.length) &&
                Objects.equals(this.depth, decorator.depth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, offset, length, depth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Decorator {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
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
