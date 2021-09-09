package com.amazon.spapi.models.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The standard company logo image.
 */
@Schema(description = "The standard company logo image.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class StandardCompanyLogoModule {
    @SerializedName("companyLogo")
    private ImageComponent companyLogo = null;

    public StandardCompanyLogoModule companyLogo(ImageComponent companyLogo) {
        this.companyLogo = companyLogo;
        return this;
    }

    /**
     * Get companyLogo
     *
     * @return companyLogo
     **/
    @Schema(required = true, description = "")
    public ImageComponent getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(ImageComponent companyLogo) {
        this.companyLogo = companyLogo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardCompanyLogoModule standardCompanyLogoModule = (StandardCompanyLogoModule) o;
        return Objects.equals(this.companyLogo, standardCompanyLogoModule.companyLogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyLogo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardCompanyLogoModule {\n");
        sb.append("    companyLogo: ").append(toIndentedString(companyLogo)).append("\n");
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
