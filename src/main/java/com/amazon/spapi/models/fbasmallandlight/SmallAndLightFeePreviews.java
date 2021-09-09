package com.amazon.spapi.models.fbasmallandlight;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmallAndLightFeePreviews
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class SmallAndLightFeePreviews {
    @SerializedName("data")
    private List<FeePreview> data = null;

    public SmallAndLightFeePreviews data(List<FeePreview> data) {
        this.data = data;
        return this;
    }

    public SmallAndLightFeePreviews addDataItem(FeePreview dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<FeePreview>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * A list of fee estimates for the requested items. The order of the fee estimates will follow the same order as the items in the request, with duplicates removed.
     *
     * @return data
     **/
    @Schema(description = "A list of fee estimates for the requested items. The order of the fee estimates will follow the same order as the items in the request, with duplicates removed.")
    public List<FeePreview> getData() {
        return data;
    }

    public void setData(List<FeePreview> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmallAndLightFeePreviews smallAndLightFeePreviews = (SmallAndLightFeePreviews) o;
        return Objects.equals(this.data, smallAndLightFeePreviews.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmallAndLightFeePreviews {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
