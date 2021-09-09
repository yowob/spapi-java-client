package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The top left corner of the cropped image, specified in the original image&#x27;s coordinate space.
 */
@Schema(description = "The top left corner of the cropped image, specified in the original image's coordinate space.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ImageOffsets {
    @SerializedName("x")
    private IntegerWithUnits x = null;
    @SerializedName("y")
    private IntegerWithUnits y = null;

    public ImageOffsets x(IntegerWithUnits x) {
        this.x = x;
        return this;
    }

    /**
     * Get x
     *
     * @return x
     **/
    @Schema(required = true, description = "")
    public IntegerWithUnits getX() {
        return x;
    }

    public void setX(IntegerWithUnits x) {
        this.x = x;
    }

    public ImageOffsets y(IntegerWithUnits y) {
        this.y = y;
        return this;
    }

    /**
     * Get y
     *
     * @return y
     **/
    @Schema(required = true, description = "")
    public IntegerWithUnits getY() {
        return y;
    }

    public void setY(IntegerWithUnits y) {
        this.y = y;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageOffsets imageOffsets = (ImageOffsets) o;
        return Objects.equals(this.x, imageOffsets.x) &&
                Objects.equals(this.y, imageOffsets.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageOffsets {\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
