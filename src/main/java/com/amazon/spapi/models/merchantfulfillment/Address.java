package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The postal address information.
 */
@Schema(description = "The postal address information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class Address {
    @SerializedName("Name")
    private String name = null;
    @SerializedName("AddressLine1")
    private String addressLine1 = null;
    @SerializedName("AddressLine2")
    private String addressLine2 = null;
    @SerializedName("AddressLine3")
    private String addressLine3 = null;
    @SerializedName("DistrictOrCounty")
    private String districtOrCounty = null;
    @SerializedName("Email")
    private String email = null;
    @SerializedName("City")
    private String city = null;
    @SerializedName("StateOrProvinceCode")
    private String stateOrProvinceCode = null;
    @SerializedName("PostalCode")
    private String postalCode = null;
    @SerializedName("CountryCode")
    private String countryCode = null;
    @SerializedName("Phone")
    private String phone = null;

    public Address name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @Schema(required = true, description = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address addressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Get addressLine1
     *
     * @return addressLine1
     **/
    @Schema(required = true, description = "")
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Address addressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Get addressLine2
     *
     * @return addressLine2
     **/
    @Schema(description = "")
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Address addressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
        return this;
    }

    /**
     * Get addressLine3
     *
     * @return addressLine3
     **/
    @Schema(description = "")
    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public Address districtOrCounty(String districtOrCounty) {
        this.districtOrCounty = districtOrCounty;
        return this;
    }

    /**
     * Get districtOrCounty
     *
     * @return districtOrCounty
     **/
    @Schema(description = "")
    public String getDistrictOrCounty() {
        return districtOrCounty;
    }

    public void setDistrictOrCounty(String districtOrCounty) {
        this.districtOrCounty = districtOrCounty;
    }

    public Address email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/
    @Schema(required = true, description = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     *
     * @return city
     **/
    @Schema(required = true, description = "")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address stateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
        return this;
    }

    /**
     * Get stateOrProvinceCode
     *
     * @return stateOrProvinceCode
     **/
    @Schema(description = "")
    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    public void setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }

    public Address postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get postalCode
     *
     * @return postalCode
     **/
    @Schema(required = true, description = "")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get countryCode
     *
     * @return countryCode
     **/
    @Schema(required = true, description = "")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Address phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get phone
     *
     * @return phone
     **/
    @Schema(required = true, description = "")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(this.name, address.name) &&
                Objects.equals(this.addressLine1, address.addressLine1) &&
                Objects.equals(this.addressLine2, address.addressLine2) &&
                Objects.equals(this.addressLine3, address.addressLine3) &&
                Objects.equals(this.districtOrCounty, address.districtOrCounty) &&
                Objects.equals(this.email, address.email) &&
                Objects.equals(this.city, address.city) &&
                Objects.equals(this.stateOrProvinceCode, address.stateOrProvinceCode) &&
                Objects.equals(this.postalCode, address.postalCode) &&
                Objects.equals(this.countryCode, address.countryCode) &&
                Objects.equals(this.phone, address.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addressLine1, addressLine2, addressLine3, districtOrCounty, email, city, stateOrProvinceCode, postalCode, countryCode, phone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
        sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
        sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
        sb.append("    districtOrCounty: ").append(toIndentedString(districtOrCounty)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    stateOrProvinceCode: ").append(toIndentedString(stateOrProvinceCode)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
