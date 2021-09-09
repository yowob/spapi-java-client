package com.amazon.spapi.models.services;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Information about the buyer.
 */
@Schema(description = "Information about the buyer.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Buyer {
    @SerializedName("buyerId")
    private String buyerId = null;
    @SerializedName("name")
    private String name = null;
    @SerializedName("phone")
    private String phone = null;
    @SerializedName("isPrimeMember")
    private Boolean isPrimeMember = null;

    public Buyer buyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }

    /**
     * The identifier of the buyer.
     *
     * @return buyerId
     **/
    @Schema(description = "The identifier of the buyer.")
    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public Buyer name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the buyer.
     *
     * @return name
     **/
    @Schema(description = "The name of the buyer.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Buyer phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * The phone number of the buyer.
     *
     * @return phone
     **/
    @Schema(description = "The phone number of the buyer.")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Buyer isPrimeMember(Boolean isPrimeMember) {
        this.isPrimeMember = isPrimeMember;
        return this;
    }

    /**
     * When true, the service is for an Amazon Prime buyer.
     *
     * @return isPrimeMember
     **/
    @Schema(description = "When true, the service is for an Amazon Prime buyer.")
    public Boolean isIsPrimeMember() {
        return isPrimeMember;
    }

    public void setIsPrimeMember(Boolean isPrimeMember) {
        this.isPrimeMember = isPrimeMember;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Buyer buyer = (Buyer) o;
        return Objects.equals(this.buyerId, buyer.buyerId) &&
                Objects.equals(this.name, buyer.name) &&
                Objects.equals(this.phone, buyer.phone) &&
                Objects.equals(this.isPrimeMember, buyer.isPrimeMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buyerId, name, phone, isPrimeMember);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Buyer {\n");
        sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    isPrimeMember: ").append(toIndentedString(isPrimeMember)).append("\n");
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
