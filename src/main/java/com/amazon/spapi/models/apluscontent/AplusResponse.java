package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The base response data for all A+ Content operations when a request is successful or partially successful. Individual operations may extend this with additional data.
 */
@Schema(description = "The base response data for all A+ Content operations when a request is successful or partially successful. Individual operations may extend this with additional data.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class AplusResponse {
    @SerializedName("warnings")
    private MessageSet warnings = null;

    public AplusResponse warnings(MessageSet warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Get warnings
     *
     * @return warnings
     **/
    @Schema(description = "")
    public MessageSet getWarnings() {
        return warnings;
    }

    public void setWarnings(MessageSet warnings) {
        this.warnings = warnings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AplusResponse aplusResponse = (AplusResponse) o;
        return Objects.equals(this.warnings, aplusResponse.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warnings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AplusResponse {\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
