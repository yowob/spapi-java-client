package com.amazon.spapi.models.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Contact information for the person in the seller&#x27;s organization who is responsible for a Less Than Truckload/Full Truckload (LTL/FTL) shipment.
 */
@Schema(description = "Contact information for the person in the seller's organization who is responsible for a Less Than Truckload/Full Truckload (LTL/FTL) shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Contact {
    @SerializedName("Name")
    private String name = null;
    @SerializedName("Phone")
    private String phone = null;
    @SerializedName("Email")
    private String email = null;
    @SerializedName("Fax")
    private String fax = null;

    public Contact name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the contact person.
     *
     * @return name
     **/
    @Schema(required = true, description = "The name of the contact person.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * The phone number of the contact person.
     *
     * @return phone
     **/
    @Schema(required = true, description = "The phone number of the contact person.")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The email address of the contact person.
     *
     * @return email
     **/
    @Schema(required = true, description = "The email address of the contact person.")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact fax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * The fax number of the contact person.
     *
     * @return fax
     **/
    @Schema(description = "The fax number of the contact person.")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        return Objects.equals(this.name, contact.name) &&
                Objects.equals(this.phone, contact.phone) &&
                Objects.equals(this.email, contact.email) &&
                Objects.equals(this.fax, contact.fax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email, fax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Contact {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
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
