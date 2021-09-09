package com.amazon.spapi.models.fbainbound;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The response object which contains the ASIN, marketplaceId if required, eligibility program, the eligibility status (boolean), and a list of ineligibility reason codes.
 */
@Schema(description = "The response object which contains the ASIN, marketplaceId if required, eligibility program, the eligibility status (boolean), and a list of ineligibility reason codes.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class ItemEligibilityPreview {
    @SerializedName("asin")
    private String asin = null;
    @SerializedName("marketplaceId")
    private String marketplaceId = null;
    @SerializedName("program")
    private ProgramEnum program = null;
    @SerializedName("isEligibleForProgram")
    private Boolean isEligibleForProgram = null;
    @SerializedName("ineligibilityReasonList")
    private List<IneligibilityReasonListEnum> ineligibilityReasonList = null;

    public ItemEligibilityPreview asin(String asin) {
        this.asin = asin;
        return this;
    }

    /**
     * The ASIN for which eligibility was determined.
     *
     * @return asin
     **/
    @Schema(required = true, description = "The ASIN for which eligibility was determined.")
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public ItemEligibilityPreview marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * The marketplace for which eligibility was determined.
     *
     * @return marketplaceId
     **/
    @Schema(description = "The marketplace for which eligibility was determined.")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public ItemEligibilityPreview program(ProgramEnum program) {
        this.program = program;
        return this;
    }

    /**
     * The program for which eligibility was determined.
     *
     * @return program
     **/
    @Schema(required = true, description = "The program for which eligibility was determined.")
    public ProgramEnum getProgram() {
        return program;
    }

    public void setProgram(ProgramEnum program) {
        this.program = program;
    }

    public ItemEligibilityPreview isEligibleForProgram(Boolean isEligibleForProgram) {
        this.isEligibleForProgram = isEligibleForProgram;
        return this;
    }

    /**
     * Indicates if the item is eligible for the program.
     *
     * @return isEligibleForProgram
     **/
    @Schema(required = true, description = "Indicates if the item is eligible for the program.")
    public Boolean isIsEligibleForProgram() {
        return isEligibleForProgram;
    }

    public void setIsEligibleForProgram(Boolean isEligibleForProgram) {
        this.isEligibleForProgram = isEligibleForProgram;
    }

    public ItemEligibilityPreview ineligibilityReasonList(List<IneligibilityReasonListEnum> ineligibilityReasonList) {
        this.ineligibilityReasonList = ineligibilityReasonList;
        return this;
    }

    public ItemEligibilityPreview addIneligibilityReasonListItem(IneligibilityReasonListEnum ineligibilityReasonListItem) {
        if (this.ineligibilityReasonList == null) {
            this.ineligibilityReasonList = new ArrayList<IneligibilityReasonListEnum>();
        }
        this.ineligibilityReasonList.add(ineligibilityReasonListItem);
        return this;
    }

    /**
     * Potential Ineligibility Reason Codes.
     *
     * @return ineligibilityReasonList
     **/
    @Schema(description = "Potential Ineligibility Reason Codes.")
    public List<IneligibilityReasonListEnum> getIneligibilityReasonList() {
        return ineligibilityReasonList;
    }

    public void setIneligibilityReasonList(List<IneligibilityReasonListEnum> ineligibilityReasonList) {
        this.ineligibilityReasonList = ineligibilityReasonList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemEligibilityPreview itemEligibilityPreview = (ItemEligibilityPreview) o;
        return Objects.equals(this.asin, itemEligibilityPreview.asin) &&
                Objects.equals(this.marketplaceId, itemEligibilityPreview.marketplaceId) &&
                Objects.equals(this.program, itemEligibilityPreview.program) &&
                Objects.equals(this.isEligibleForProgram, itemEligibilityPreview.isEligibleForProgram) &&
                Objects.equals(this.ineligibilityReasonList, itemEligibilityPreview.ineligibilityReasonList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asin, marketplaceId, program, isEligibleForProgram, ineligibilityReasonList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemEligibilityPreview {\n");
        sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    program: ").append(toIndentedString(program)).append("\n");
        sb.append("    isEligibleForProgram: ").append(toIndentedString(isEligibleForProgram)).append("\n");
        sb.append("    ineligibilityReasonList: ").append(toIndentedString(ineligibilityReasonList)).append("\n");
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

    /**
     * The program for which eligibility was determined.
     */
    @JsonAdapter(ProgramEnum.Adapter.class)
    public enum ProgramEnum {
        INBOUND("INBOUND"),
        COMMINGLING("COMMINGLING");
        private String value;

        ProgramEnum(String value) {
            this.value = value;
        }

        public static ProgramEnum fromValue(String text) {
            for (ProgramEnum b : ProgramEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<ProgramEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ProgramEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ProgramEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ProgramEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Potential Ineligibility Reason Codes.
     */
    @JsonAdapter(IneligibilityReasonListEnum.Adapter.class)
    public enum IneligibilityReasonListEnum {
        FBA_INB_0004("FBA_INB_0004"),
        FBA_INB_0006("FBA_INB_0006"),
        FBA_INB_0007("FBA_INB_0007"),
        FBA_INB_0008("FBA_INB_0008"),
        FBA_INB_0009("FBA_INB_0009"),
        FBA_INB_0010("FBA_INB_0010"),
        FBA_INB_0011("FBA_INB_0011"),
        FBA_INB_0012("FBA_INB_0012"),
        FBA_INB_0013("FBA_INB_0013"),
        FBA_INB_0014("FBA_INB_0014"),
        FBA_INB_0015("FBA_INB_0015"),
        FBA_INB_0016("FBA_INB_0016"),
        FBA_INB_0017("FBA_INB_0017"),
        FBA_INB_0018("FBA_INB_0018"),
        FBA_INB_0019("FBA_INB_0019"),
        FBA_INB_0034("FBA_INB_0034"),
        FBA_INB_0035("FBA_INB_0035"),
        FBA_INB_0036("FBA_INB_0036"),
        FBA_INB_0037("FBA_INB_0037"),
        FBA_INB_0038("FBA_INB_0038"),
        FBA_INB_0050("FBA_INB_0050"),
        FBA_INB_0051("FBA_INB_0051"),
        FBA_INB_0053("FBA_INB_0053"),
        FBA_INB_0055("FBA_INB_0055"),
        FBA_INB_0056("FBA_INB_0056"),
        FBA_INB_0059("FBA_INB_0059"),
        FBA_INB_0065("FBA_INB_0065"),
        FBA_INB_0066("FBA_INB_0066"),
        FBA_INB_0067("FBA_INB_0067"),
        FBA_INB_0068("FBA_INB_0068"),
        FBA_INB_0095("FBA_INB_0095"),
        FBA_INB_0097("FBA_INB_0097"),
        FBA_INB_0098("FBA_INB_0098"),
        FBA_INB_0099("FBA_INB_0099"),
        FBA_INB_0100("FBA_INB_0100"),
        FBA_INB_0103("FBA_INB_0103"),
        FBA_INB_0104("FBA_INB_0104"),
        UNKNOWN_INB_ERROR_CODE("UNKNOWN_INB_ERROR_CODE");
        private String value;

        IneligibilityReasonListEnum(String value) {
            this.value = value;
        }

        public static IneligibilityReasonListEnum fromValue(String text) {
            for (IneligibilityReasonListEnum b : IneligibilityReasonListEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<IneligibilityReasonListEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final IneligibilityReasonListEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public IneligibilityReasonListEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return IneligibilityReasonListEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
