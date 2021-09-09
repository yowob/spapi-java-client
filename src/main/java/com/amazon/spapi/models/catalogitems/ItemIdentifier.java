package com.amazon.spapi.models.catalogitems;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Identifier associated with the item in the Amazon catalog, such as a UPC or EAN identifier.
 */
@Schema(description = "Identifier associated with the item in the Amazon catalog, such as a UPC or EAN identifier.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemIdentifier {
    @SerializedName("identifierType")
    private String identifierType = null;
    @SerializedName("identifier")
    private String identifier = null;

    public ItemIdentifier identifierType(String identifierType) {
        this.identifierType = identifierType;
        return this;
    }

    /**
     * Type of identifier, such as UPC, EAN, or ISBN.
     *
     * @return identifierType
     **/
    @Schema(required = true, description = "Type of identifier, such as UPC, EAN, or ISBN.")
    public String getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    public ItemIdentifier identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Identifier.
     *
     * @return identifier
     **/
    @Schema(required = true, description = "Identifier.")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemIdentifier itemIdentifier = (ItemIdentifier) o;
        return Objects.equals(this.identifierType, itemIdentifier.identifierType) &&
                Objects.equals(this.identifier, itemIdentifier.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifierType, identifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemIdentifier {\n");
        sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
