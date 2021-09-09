package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * BillOfLadingDownloadURL
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class BillOfLadingDownloadURL {
    @SerializedName("DownloadURL")
    private String downloadURL = null;

    public BillOfLadingDownloadURL downloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
        return this;
    }

    /**
     * URL to download the bill of lading for the package. Note: The URL will only be valid for 15 seconds
     *
     * @return downloadURL
     **/
    @Schema(description = "URL to download the bill of lading for the package. Note: The URL will only be valid for 15 seconds")
    public String getDownloadURL() {
        return downloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillOfLadingDownloadURL billOfLadingDownloadURL = (BillOfLadingDownloadURL) o;
        return Objects.equals(this.downloadURL, billOfLadingDownloadURL.downloadURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadURL);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillOfLadingDownloadURL {\n");
        sb.append("    downloadURL: ").append(toIndentedString(downloadURL)).append("\n");
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
