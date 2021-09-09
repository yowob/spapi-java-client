package com.amazon.spapi.models.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Amazon Prime information.
 */
@Schema(description = "Amazon Prime information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class PrimeInformationType {
    @SerializedName("IsPrime")
    private Boolean isPrime = null;
    @SerializedName("IsNationalPrime")
    private Boolean isNationalPrime = null;

    public PrimeInformationType isPrime(Boolean isPrime) {
        this.isPrime = isPrime;
        return this;
    }

    /**
     * Indicates whether the offer is an Amazon Prime offer.
     *
     * @return isPrime
     **/
    @Schema(required = true, description = "Indicates whether the offer is an Amazon Prime offer.")
    public Boolean isIsPrime() {
        return isPrime;
    }

    public void setIsPrime(Boolean isPrime) {
        this.isPrime = isPrime;
    }

    public PrimeInformationType isNationalPrime(Boolean isNationalPrime) {
        this.isNationalPrime = isNationalPrime;
        return this;
    }

    /**
     * Indicates whether the offer is an Amazon Prime offer throughout the entire marketplace where it is listed.
     *
     * @return isNationalPrime
     **/
    @Schema(required = true, description = "Indicates whether the offer is an Amazon Prime offer throughout the entire marketplace where it is listed.")
    public Boolean isIsNationalPrime() {
        return isNationalPrime;
    }

    public void setIsNationalPrime(Boolean isNationalPrime) {
        this.isNationalPrime = isNationalPrime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrimeInformationType primeInformationType = (PrimeInformationType) o;
        return Objects.equals(this.isPrime, primeInformationType.isPrime) &&
                Objects.equals(this.isNationalPrime, primeInformationType.isNationalPrime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPrime, isNationalPrime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrimeInformationType {\n");
        sb.append("    isPrime: ").append(toIndentedString(isPrime)).append("\n");
        sb.append("    isNationalPrime: ").append(toIndentedString(isNationalPrime)).append("\n");
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
