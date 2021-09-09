package com.amazon.spapi.models.merchantfulfillment;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * An enumeration of predefined parcel tokens. If you specify a PredefinedPackageDimensions token, you are not obligated to use a branded package from a carrier. For example, if you specify the FedEx_Box_10kg token, you do not have to use that particular package from FedEx. You are only obligated to use a box that matches the dimensions specified by the token.  Note: Please note that carriers can have restrictions on the type of package allowed for certain ship methods. Check the carrier website for all details. Example: Flat rate pricing is available when materials are sent by USPS in a USPS-produced Flat Rate Envelope or Box.
 */
@JsonAdapter(PredefinedPackageDimensions.Adapter.class)
public enum PredefinedPackageDimensions {
    FEDEX_BOX_10KG("FedEx_Box_10kg"),
    FEDEX_BOX_25KG("FedEx_Box_25kg"),
    FEDEX_BOX_EXTRA_LARGE_1("FedEx_Box_Extra_Large_1"),
    FEDEX_BOX_EXTRA_LARGE_2("FedEx_Box_Extra_Large_2"),
    FEDEX_BOX_LARGE_1("FedEx_Box_Large_1"),
    FEDEX_BOX_LARGE_2("FedEx_Box_Large_2"),
    FEDEX_BOX_MEDIUM_1("FedEx_Box_Medium_1"),
    FEDEX_BOX_MEDIUM_2("FedEx_Box_Medium_2"),
    FEDEX_BOX_SMALL_1("FedEx_Box_Small_1"),
    FEDEX_BOX_SMALL_2("FedEx_Box_Small_2"),
    FEDEX_ENVELOPE("FedEx_Envelope"),
    FEDEX_PADDED_PAK("FedEx_Padded_Pak"),
    FEDEX_PAK_1("FedEx_Pak_1"),
    FEDEX_PAK_2("FedEx_Pak_2"),
    FEDEX_TUBE("FedEx_Tube"),
    FEDEX_XL_PAK("FedEx_XL_Pak"),
    UPS_BOX_10KG("UPS_Box_10kg"),
    UPS_BOX_25KG("UPS_Box_25kg"),
    UPS_EXPRESS_BOX("UPS_Express_Box"),
    UPS_EXPRESS_BOX_LARGE("UPS_Express_Box_Large"),
    UPS_EXPRESS_BOX_MEDIUM("UPS_Express_Box_Medium"),
    UPS_EXPRESS_BOX_SMALL("UPS_Express_Box_Small"),
    UPS_EXPRESS_ENVELOPE("UPS_Express_Envelope"),
    UPS_EXPRESS_HARD_PAK("UPS_Express_Hard_Pak"),
    UPS_EXPRESS_LEGAL_ENVELOPE("UPS_Express_Legal_Envelope"),
    UPS_EXPRESS_PAK("UPS_Express_Pak"),
    UPS_EXPRESS_TUBE("UPS_Express_Tube"),
    UPS_LABORATORY_PAK("UPS_Laboratory_Pak"),
    UPS_PAD_PAK("UPS_Pad_Pak"),
    UPS_PALLET("UPS_Pallet"),
    USPS_CARD("USPS_Card"),
    USPS_FLAT("USPS_Flat"),
    USPS_FLATRATECARDBOARDENVELOPE("USPS_FlatRateCardboardEnvelope"),
    USPS_FLATRATEENVELOPE("USPS_FlatRateEnvelope"),
    USPS_FLATRATEGIFTCARDENVELOPE("USPS_FlatRateGiftCardEnvelope"),
    USPS_FLATRATELEGALENVELOPE("USPS_FlatRateLegalEnvelope"),
    USPS_FLATRATEPADDEDENVELOPE("USPS_FlatRatePaddedEnvelope"),
    USPS_FLATRATEWINDOWENVELOPE("USPS_FlatRateWindowEnvelope"),
    USPS_LARGEFLATRATEBOARDGAMEBOX("USPS_LargeFlatRateBoardGameBox"),
    USPS_LARGEFLATRATEBOX("USPS_LargeFlatRateBox"),
    USPS_LETTER("USPS_Letter"),
    USPS_MEDIUMFLATRATEBOX1("USPS_MediumFlatRateBox1"),
    USPS_MEDIUMFLATRATEBOX2("USPS_MediumFlatRateBox2"),
    USPS_REGIONALRATEBOXA1("USPS_RegionalRateBoxA1"),
    USPS_REGIONALRATEBOXA2("USPS_RegionalRateBoxA2"),
    USPS_REGIONALRATEBOXB1("USPS_RegionalRateBoxB1"),
    USPS_REGIONALRATEBOXB2("USPS_RegionalRateBoxB2"),
    USPS_REGIONALRATEBOXC("USPS_RegionalRateBoxC"),
    USPS_SMALLFLATRATEBOX("USPS_SmallFlatRateBox"),
    USPS_SMALLFLATRATEENVELOPE("USPS_SmallFlatRateEnvelope");
    private String value;

    PredefinedPackageDimensions(String value) {
        this.value = value;
    }

    public static PredefinedPackageDimensions fromValue(String text) {
        for (PredefinedPackageDimensions b : PredefinedPackageDimensions.values()) {
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

    public static class Adapter extends TypeAdapter<PredefinedPackageDimensions> {
        @Override
        public void write(final JsonWriter jsonWriter, final PredefinedPackageDimensions enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PredefinedPackageDimensions read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return PredefinedPackageDimensions.fromValue(String.valueOf(value));
        }
    }
}
