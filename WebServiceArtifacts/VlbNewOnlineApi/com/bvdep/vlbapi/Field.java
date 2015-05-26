
package com.bvdep.vlbapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Field">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VLB_ID"/>
 *     &lt;enumeration value="ISSN"/>
 *     &lt;enumeration value="ISBN10"/>
 *     &lt;enumeration value="ISBN13"/>
 *     &lt;enumeration value="EAN13"/>
 *     &lt;enumeration value="DOI"/>
 *     &lt;enumeration value="Bestellnummer"/>
 *     &lt;enumeration value="Schulbuch_Bestellnummer"/>
 *     &lt;enumeration value="OSBNR"/>
 *     &lt;enumeration value="Verlagsbezeichnung"/>
 *     &lt;enumeration value="Autoren"/>
 *     &lt;enumeration value="Sonstige_Urheber"/>
 *     &lt;enumeration value="Titel_Gesamtwerk"/>
 *     &lt;enumeration value="Hierarchie_Bandnummer"/>
 *     &lt;enumeration value="Hierarchie_ID"/>
 *     &lt;enumeration value="Titel"/>
 *     &lt;enumeration value="Untertitel"/>
 *     &lt;enumeration value="Auflage_Erscheinungsjahr"/>
 *     &lt;enumeration value="Auflage"/>
 *     &lt;enumeration value="Erscheinungsdatum"/>
 *     &lt;enumeration value="Seitenzahl_Abbildungen_Format"/>
 *     &lt;enumeration value="Seiten"/>
 *     &lt;enumeration value="Illustrationen"/>
 *     &lt;enumeration value="Format"/>
 *     &lt;enumeration value="Beigaben"/>
 *     &lt;enumeration value="Gewicht"/>
 *     &lt;enumeration value="Einbandart"/>
 *     &lt;enumeration value="Produkttyp"/>
 *     &lt;enumeration value="Reiheninfo"/>
 *     &lt;enumeration value="Reihenbandnummer"/>
 *     &lt;enumeration value="Reihen_ID"/>
 *     &lt;enumeration value="VLB_Produktgruppe"/>
 *     &lt;enumeration value="Anzahl_Teile"/>
 *     &lt;enumeration value="Preis_EUR_D_CA"/>
 *     &lt;enumeration value="Preis_EUR_D"/>
 *     &lt;enumeration value="Preiszusatz_EUR_D"/>
 *     &lt;enumeration value="MwSt_EUR_D"/>
 *     &lt;enumeration value="MwSt_EUR_D_info"/>
 *     &lt;enumeration value="Preis_EUR_A_CA"/>
 *     &lt;enumeration value="Preis_EUR_A"/>
 *     &lt;enumeration value="Preiszusatz_EUR_A"/>
 *     &lt;enumeration value="MwSt_EUR_A"/>
 *     &lt;enumeration value="MwSt_EUR_A_info"/>
 *     &lt;enumeration value="Preis_CHF_CA"/>
 *     &lt;enumeration value="Preis_CHF"/>
 *     &lt;enumeration value="Preiszusatz_CHF"/>
 *     &lt;enumeration value="MwSt_CHF"/>
 *     &lt;enumeration value="MwSt_CHF_info"/>
 *     &lt;enumeration value="Preise_Zeitschriften_EUR_D"/>
 *     &lt;enumeration value="Sonstige_Information"/>
 *     &lt;enumeration value="Produktsprache"/>
 *     &lt;enumeration value="Schulbuch_Schluessel"/>
 *     &lt;enumeration value="Schlagwort"/>
 *     &lt;enumeration value="Warengruppen_Nummer"/>
 *     &lt;enumeration value="Warengruppen_Index"/>
 *     &lt;enumeration value="ZIS_Klassifikation"/>
 *     &lt;enumeration value="ZIS_Publikationssprache"/>
 *     &lt;enumeration value="ZIS_Erscheinungsweise"/>
 *     &lt;enumeration value="DDC_Sachgruppen"/>
 *     &lt;enumeration value="Zielgruppe"/>
 *     &lt;enumeration value="Text_Inhalt"/>
 *     &lt;enumeration value="Text_Autoren"/>
 *     &lt;enumeration value="Cover"/>
 *     &lt;enumeration value="Lieferhinweis_SOA"/>
 *     &lt;enumeration value="Barsortiment_Auslieferung"/>
 *     &lt;enumeration value="Umbreit_Nummer"/>
 *     &lt;enumeration value="CBZ_Nummer"/>
 *     &lt;enumeration value="Edis_Nummer"/>
 *     &lt;enumeration value="Datum_Zugang"/>
 *     &lt;enumeration value="Datum_Aenderung"/>
 *     &lt;enumeration value="Verlag_id"/>
 *     &lt;enumeration value="Source"/>
 *     &lt;enumeration value="Lieferbarkeit"/>
 *     &lt;enumeration value="Archivierungsdatum"/>
 *     &lt;enumeration value="LibrekaLink"/>
 *     &lt;enumeration value="Datum_Preisupdate"/>
 *     &lt;enumeration value="Referenzpreis"/>
 *     &lt;enumeration value="Produktform"/>
 *     &lt;enumeration value="Produktform_Text"/>
 *     &lt;enumeration value="Verkaufshinweis"/>
 *     &lt;enumeration value="EBook_Format"/>
 *     &lt;enumeration value="Datei_Groesse"/>
 *     &lt;enumeration value="Produkt_Content_Typ"/>
 *     &lt;enumeration value="BISAC_Klassifikation"/>
 *     &lt;enumeration value="BIC_Klassifikation"/>
 *     &lt;enumeration value="Preis_USD_netto_ohne_Steuern"/>
 *     &lt;enumeration value="Preis_GBP_netto_ohne_Steuern"/>
 *     &lt;enumeration value="Preis_AUD_netto_ohne_Steuern"/>
 *     &lt;enumeration value="Preis_CAD_netto_ohne_Steuern"/>
 *     &lt;enumeration value="Preis_USD_brutto_ohne_Steuern"/>
 *     &lt;enumeration value="Preis_GBP_brutto_ohne_Steuern"/>
 *     &lt;enumeration value="Preis_AUD_brutto_ohne_Steuern"/>
 *     &lt;enumeration value="Preis_CAD_brutto_ohne_Steuern"/>
 *     &lt;enumeration value="EBook_DRM"/>
 *     &lt;enumeration value="Laender_Verkaufsrecht_exklusiv"/>
 *     &lt;enumeration value="Laender_Verkaufsrecht_nicht_exklusiv"/>
 *     &lt;enumeration value="Kein_Laender_Verkaufsrecht"/>
 *     &lt;enumeration value="Territorium_Verkaufsrecht_exklusiv"/>
 *     &lt;enumeration value="Territorium_Verkaufsrecht_nicht_exklusiv"/>
 *     &lt;enumeration value="Kein_Territorium_Verkaufsrecht"/>
 *     &lt;enumeration value="Titel_kurz"/>
 *     &lt;enumeration value="Titel_Distributor"/>
 *     &lt;enumeration value="Distributions_link_1"/>
 *     &lt;enumeration value="Distributions_link_2"/>
 *     &lt;enumeration value="Distributions_link_3"/>
 *     &lt;enumeration value="Distributions_link_4"/>
 *     &lt;enumeration value="Erscheinungsland"/>
 *     &lt;enumeration value="Haendler_USD_brutto_ohne_Steuern"/>
 *     &lt;enumeration value="Haendler_GBP_brutto_ohne_Steuern"/>
 *     &lt;enumeration value="Haendler_AUD_brutto_ohne_Steuern"/>
 *     &lt;enumeration value="Haendler_CAD_brutto_ohne_Steuern"/>
 *     &lt;enumeration value="Publikationsort"/>
 *     &lt;enumeration value="EU_Spielzeug_Gefahrenwarnung_184_03"/>
 *     &lt;enumeration value="EU_Spielzeug_Gefahrenwarnung_184_04"/>
 *     &lt;enumeration value="EU_Spielzeug_Gefahrenwarnung_184_05"/>
 *     &lt;enumeration value="Zolltarifnummer"/>
 *     &lt;enumeration value="Ursprungsland"/>
 *     &lt;enumeration value="Produktform_detailliert"/>
 *     &lt;enumeration value="Erstverkaufstag"/>
 *     &lt;enumeration value="Frueh_Ankuendigungstermin"/>
 *     &lt;enumeration value="THEMA_SUB_TYPE"/>
 *     &lt;enumeration value="THEMA_SUB_VER"/>
 *     &lt;enumeration value="THEMA_SUB_CODE"/>
 *     &lt;enumeration value="THEMA_QUAL_TYPE"/>
 *     &lt;enumeration value="THEMA_QUAL_VER"/>
 *     &lt;enumeration value="THEMA_QUAL_CODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Field")
@XmlEnum
public enum Field {

    VLB_ID("VLB_ID"),
    ISSN("ISSN"),
    @XmlEnumValue("ISBN10")
    ISBN_10("ISBN10"),
    @XmlEnumValue("ISBN13")
    ISBN_13("ISBN13"),
    @XmlEnumValue("EAN13")
    EAN_13("EAN13"),
    DOI("DOI"),
    @XmlEnumValue("Bestellnummer")
    BESTELLNUMMER("Bestellnummer"),
    @XmlEnumValue("Schulbuch_Bestellnummer")
    SCHULBUCH_BESTELLNUMMER("Schulbuch_Bestellnummer"),
    OSBNR("OSBNR"),
    @XmlEnumValue("Verlagsbezeichnung")
    VERLAGSBEZEICHNUNG("Verlagsbezeichnung"),
    @XmlEnumValue("Autoren")
    AUTOREN("Autoren"),
    @XmlEnumValue("Sonstige_Urheber")
    SONSTIGE_URHEBER("Sonstige_Urheber"),
    @XmlEnumValue("Titel_Gesamtwerk")
    TITEL_GESAMTWERK("Titel_Gesamtwerk"),
    @XmlEnumValue("Hierarchie_Bandnummer")
    HIERARCHIE_BANDNUMMER("Hierarchie_Bandnummer"),
    @XmlEnumValue("Hierarchie_ID")
    HIERARCHIE_ID("Hierarchie_ID"),
    @XmlEnumValue("Titel")
    TITEL("Titel"),
    @XmlEnumValue("Untertitel")
    UNTERTITEL("Untertitel"),
    @XmlEnumValue("Auflage_Erscheinungsjahr")
    AUFLAGE_ERSCHEINUNGSJAHR("Auflage_Erscheinungsjahr"),
    @XmlEnumValue("Auflage")
    AUFLAGE("Auflage"),
    @XmlEnumValue("Erscheinungsdatum")
    ERSCHEINUNGSDATUM("Erscheinungsdatum"),
    @XmlEnumValue("Seitenzahl_Abbildungen_Format")
    SEITENZAHL_ABBILDUNGEN_FORMAT("Seitenzahl_Abbildungen_Format"),
    @XmlEnumValue("Seiten")
    SEITEN("Seiten"),
    @XmlEnumValue("Illustrationen")
    ILLUSTRATIONEN("Illustrationen"),
    @XmlEnumValue("Format")
    FORMAT("Format"),
    @XmlEnumValue("Beigaben")
    BEIGABEN("Beigaben"),
    @XmlEnumValue("Gewicht")
    GEWICHT("Gewicht"),
    @XmlEnumValue("Einbandart")
    EINBANDART("Einbandart"),
    @XmlEnumValue("Produkttyp")
    PRODUKTTYP("Produkttyp"),
    @XmlEnumValue("Reiheninfo")
    REIHENINFO("Reiheninfo"),
    @XmlEnumValue("Reihenbandnummer")
    REIHENBANDNUMMER("Reihenbandnummer"),
    @XmlEnumValue("Reihen_ID")
    REIHEN_ID("Reihen_ID"),
    @XmlEnumValue("VLB_Produktgruppe")
    VLB_PRODUKTGRUPPE("VLB_Produktgruppe"),
    @XmlEnumValue("Anzahl_Teile")
    ANZAHL_TEILE("Anzahl_Teile"),
    @XmlEnumValue("Preis_EUR_D_CA")
    PREIS_EUR_D_CA("Preis_EUR_D_CA"),
    @XmlEnumValue("Preis_EUR_D")
    PREIS_EUR_D("Preis_EUR_D"),
    @XmlEnumValue("Preiszusatz_EUR_D")
    PREISZUSATZ_EUR_D("Preiszusatz_EUR_D"),
    @XmlEnumValue("MwSt_EUR_D")
    MW_ST_EUR_D("MwSt_EUR_D"),
    @XmlEnumValue("MwSt_EUR_D_info")
    MW_ST_EUR_D_INFO("MwSt_EUR_D_info"),
    @XmlEnumValue("Preis_EUR_A_CA")
    PREIS_EUR_A_CA("Preis_EUR_A_CA"),
    @XmlEnumValue("Preis_EUR_A")
    PREIS_EUR_A("Preis_EUR_A"),
    @XmlEnumValue("Preiszusatz_EUR_A")
    PREISZUSATZ_EUR_A("Preiszusatz_EUR_A"),
    @XmlEnumValue("MwSt_EUR_A")
    MW_ST_EUR_A("MwSt_EUR_A"),
    @XmlEnumValue("MwSt_EUR_A_info")
    MW_ST_EUR_A_INFO("MwSt_EUR_A_info"),
    @XmlEnumValue("Preis_CHF_CA")
    PREIS_CHF_CA("Preis_CHF_CA"),
    @XmlEnumValue("Preis_CHF")
    PREIS_CHF("Preis_CHF"),
    @XmlEnumValue("Preiszusatz_CHF")
    PREISZUSATZ_CHF("Preiszusatz_CHF"),
    @XmlEnumValue("MwSt_CHF")
    MW_ST_CHF("MwSt_CHF"),
    @XmlEnumValue("MwSt_CHF_info")
    MW_ST_CHF_INFO("MwSt_CHF_info"),
    @XmlEnumValue("Preise_Zeitschriften_EUR_D")
    PREISE_ZEITSCHRIFTEN_EUR_D("Preise_Zeitschriften_EUR_D"),
    @XmlEnumValue("Sonstige_Information")
    SONSTIGE_INFORMATION("Sonstige_Information"),
    @XmlEnumValue("Produktsprache")
    PRODUKTSPRACHE("Produktsprache"),
    @XmlEnumValue("Schulbuch_Schluessel")
    SCHULBUCH_SCHLUESSEL("Schulbuch_Schluessel"),
    @XmlEnumValue("Schlagwort")
    SCHLAGWORT("Schlagwort"),
    @XmlEnumValue("Warengruppen_Nummer")
    WARENGRUPPEN_NUMMER("Warengruppen_Nummer"),
    @XmlEnumValue("Warengruppen_Index")
    WARENGRUPPEN_INDEX("Warengruppen_Index"),
    @XmlEnumValue("ZIS_Klassifikation")
    ZIS_KLASSIFIKATION("ZIS_Klassifikation"),
    @XmlEnumValue("ZIS_Publikationssprache")
    ZIS_PUBLIKATIONSSPRACHE("ZIS_Publikationssprache"),
    @XmlEnumValue("ZIS_Erscheinungsweise")
    ZIS_ERSCHEINUNGSWEISE("ZIS_Erscheinungsweise"),
    @XmlEnumValue("DDC_Sachgruppen")
    DDC_SACHGRUPPEN("DDC_Sachgruppen"),
    @XmlEnumValue("Zielgruppe")
    ZIELGRUPPE("Zielgruppe"),
    @XmlEnumValue("Text_Inhalt")
    TEXT_INHALT("Text_Inhalt"),
    @XmlEnumValue("Text_Autoren")
    TEXT_AUTOREN("Text_Autoren"),
    @XmlEnumValue("Cover")
    COVER("Cover"),
    @XmlEnumValue("Lieferhinweis_SOA")
    LIEFERHINWEIS_SOA("Lieferhinweis_SOA"),
    @XmlEnumValue("Barsortiment_Auslieferung")
    BARSORTIMENT_AUSLIEFERUNG("Barsortiment_Auslieferung"),
    @XmlEnumValue("Umbreit_Nummer")
    UMBREIT_NUMMER("Umbreit_Nummer"),
    @XmlEnumValue("CBZ_Nummer")
    CBZ_NUMMER("CBZ_Nummer"),
    @XmlEnumValue("Edis_Nummer")
    EDIS_NUMMER("Edis_Nummer"),
    @XmlEnumValue("Datum_Zugang")
    DATUM_ZUGANG("Datum_Zugang"),
    @XmlEnumValue("Datum_Aenderung")
    DATUM_AENDERUNG("Datum_Aenderung"),
    @XmlEnumValue("Verlag_id")
    VERLAG_ID("Verlag_id"),
    @XmlEnumValue("Source")
    SOURCE("Source"),
    @XmlEnumValue("Lieferbarkeit")
    LIEFERBARKEIT("Lieferbarkeit"),
    @XmlEnumValue("Archivierungsdatum")
    ARCHIVIERUNGSDATUM("Archivierungsdatum"),
    @XmlEnumValue("LibrekaLink")
    LIBREKA_LINK("LibrekaLink"),
    @XmlEnumValue("Datum_Preisupdate")
    DATUM_PREISUPDATE("Datum_Preisupdate"),
    @XmlEnumValue("Referenzpreis")
    REFERENZPREIS("Referenzpreis"),
    @XmlEnumValue("Produktform")
    PRODUKTFORM("Produktform"),
    @XmlEnumValue("Produktform_Text")
    PRODUKTFORM_TEXT("Produktform_Text"),
    @XmlEnumValue("Verkaufshinweis")
    VERKAUFSHINWEIS("Verkaufshinweis"),
    @XmlEnumValue("EBook_Format")
    E_BOOK_FORMAT("EBook_Format"),
    @XmlEnumValue("Datei_Groesse")
    DATEI_GROESSE("Datei_Groesse"),
    @XmlEnumValue("Produkt_Content_Typ")
    PRODUKT_CONTENT_TYP("Produkt_Content_Typ"),
    @XmlEnumValue("BISAC_Klassifikation")
    BISAC_KLASSIFIKATION("BISAC_Klassifikation"),
    @XmlEnumValue("BIC_Klassifikation")
    BIC_KLASSIFIKATION("BIC_Klassifikation"),
    @XmlEnumValue("Preis_USD_netto_ohne_Steuern")
    PREIS_USD_NETTO_OHNE_STEUERN("Preis_USD_netto_ohne_Steuern"),
    @XmlEnumValue("Preis_GBP_netto_ohne_Steuern")
    PREIS_GBP_NETTO_OHNE_STEUERN("Preis_GBP_netto_ohne_Steuern"),
    @XmlEnumValue("Preis_AUD_netto_ohne_Steuern")
    PREIS_AUD_NETTO_OHNE_STEUERN("Preis_AUD_netto_ohne_Steuern"),
    @XmlEnumValue("Preis_CAD_netto_ohne_Steuern")
    PREIS_CAD_NETTO_OHNE_STEUERN("Preis_CAD_netto_ohne_Steuern"),
    @XmlEnumValue("Preis_USD_brutto_ohne_Steuern")
    PREIS_USD_BRUTTO_OHNE_STEUERN("Preis_USD_brutto_ohne_Steuern"),
    @XmlEnumValue("Preis_GBP_brutto_ohne_Steuern")
    PREIS_GBP_BRUTTO_OHNE_STEUERN("Preis_GBP_brutto_ohne_Steuern"),
    @XmlEnumValue("Preis_AUD_brutto_ohne_Steuern")
    PREIS_AUD_BRUTTO_OHNE_STEUERN("Preis_AUD_brutto_ohne_Steuern"),
    @XmlEnumValue("Preis_CAD_brutto_ohne_Steuern")
    PREIS_CAD_BRUTTO_OHNE_STEUERN("Preis_CAD_brutto_ohne_Steuern"),
    @XmlEnumValue("EBook_DRM")
    E_BOOK_DRM("EBook_DRM"),
    @XmlEnumValue("Laender_Verkaufsrecht_exklusiv")
    LAENDER_VERKAUFSRECHT_EXKLUSIV("Laender_Verkaufsrecht_exklusiv"),
    @XmlEnumValue("Laender_Verkaufsrecht_nicht_exklusiv")
    LAENDER_VERKAUFSRECHT_NICHT_EXKLUSIV("Laender_Verkaufsrecht_nicht_exklusiv"),
    @XmlEnumValue("Kein_Laender_Verkaufsrecht")
    KEIN_LAENDER_VERKAUFSRECHT("Kein_Laender_Verkaufsrecht"),
    @XmlEnumValue("Territorium_Verkaufsrecht_exklusiv")
    TERRITORIUM_VERKAUFSRECHT_EXKLUSIV("Territorium_Verkaufsrecht_exklusiv"),
    @XmlEnumValue("Territorium_Verkaufsrecht_nicht_exklusiv")
    TERRITORIUM_VERKAUFSRECHT_NICHT_EXKLUSIV("Territorium_Verkaufsrecht_nicht_exklusiv"),
    @XmlEnumValue("Kein_Territorium_Verkaufsrecht")
    KEIN_TERRITORIUM_VERKAUFSRECHT("Kein_Territorium_Verkaufsrecht"),
    @XmlEnumValue("Titel_kurz")
    TITEL_KURZ("Titel_kurz"),
    @XmlEnumValue("Titel_Distributor")
    TITEL_DISTRIBUTOR("Titel_Distributor"),
    @XmlEnumValue("Distributions_link_1")
    DISTRIBUTIONS_LINK_1("Distributions_link_1"),
    @XmlEnumValue("Distributions_link_2")
    DISTRIBUTIONS_LINK_2("Distributions_link_2"),
    @XmlEnumValue("Distributions_link_3")
    DISTRIBUTIONS_LINK_3("Distributions_link_3"),
    @XmlEnumValue("Distributions_link_4")
    DISTRIBUTIONS_LINK_4("Distributions_link_4"),
    @XmlEnumValue("Erscheinungsland")
    ERSCHEINUNGSLAND("Erscheinungsland"),
    @XmlEnumValue("Haendler_USD_brutto_ohne_Steuern")
    HAENDLER_USD_BRUTTO_OHNE_STEUERN("Haendler_USD_brutto_ohne_Steuern"),
    @XmlEnumValue("Haendler_GBP_brutto_ohne_Steuern")
    HAENDLER_GBP_BRUTTO_OHNE_STEUERN("Haendler_GBP_brutto_ohne_Steuern"),
    @XmlEnumValue("Haendler_AUD_brutto_ohne_Steuern")
    HAENDLER_AUD_BRUTTO_OHNE_STEUERN("Haendler_AUD_brutto_ohne_Steuern"),
    @XmlEnumValue("Haendler_CAD_brutto_ohne_Steuern")
    HAENDLER_CAD_BRUTTO_OHNE_STEUERN("Haendler_CAD_brutto_ohne_Steuern"),
    @XmlEnumValue("Publikationsort")
    PUBLIKATIONSORT("Publikationsort"),
    @XmlEnumValue("EU_Spielzeug_Gefahrenwarnung_184_03")
    EU_SPIELZEUG_GEFAHRENWARNUNG_184_03("EU_Spielzeug_Gefahrenwarnung_184_03"),
    @XmlEnumValue("EU_Spielzeug_Gefahrenwarnung_184_04")
    EU_SPIELZEUG_GEFAHRENWARNUNG_184_04("EU_Spielzeug_Gefahrenwarnung_184_04"),
    @XmlEnumValue("EU_Spielzeug_Gefahrenwarnung_184_05")
    EU_SPIELZEUG_GEFAHRENWARNUNG_184_05("EU_Spielzeug_Gefahrenwarnung_184_05"),
    @XmlEnumValue("Zolltarifnummer")
    ZOLLTARIFNUMMER("Zolltarifnummer"),
    @XmlEnumValue("Ursprungsland")
    URSPRUNGSLAND("Ursprungsland"),
    @XmlEnumValue("Produktform_detailliert")
    PRODUKTFORM_DETAILLIERT("Produktform_detailliert"),
    @XmlEnumValue("Erstverkaufstag")
    ERSTVERKAUFSTAG("Erstverkaufstag"),
    @XmlEnumValue("Frueh_Ankuendigungstermin")
    FRUEH_ANKUENDIGUNGSTERMIN("Frueh_Ankuendigungstermin"),
    THEMA_SUB_TYPE("THEMA_SUB_TYPE"),
    THEMA_SUB_VER("THEMA_SUB_VER"),
    THEMA_SUB_CODE("THEMA_SUB_CODE"),
    THEMA_QUAL_TYPE("THEMA_QUAL_TYPE"),
    THEMA_QUAL_VER("THEMA_QUAL_VER"),
    THEMA_QUAL_CODE("THEMA_QUAL_CODE");
    private final String value;

    Field(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Field fromValue(String v) {
        for (Field c: Field.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
