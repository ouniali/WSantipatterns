
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BookingSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WorldSpan"/>
 *     &lt;enumeration value="Abacus"/>
 *     &lt;enumeration value="SpiceJet"/>
 *     &lt;enumeration value="Amadeus"/>
 *     &lt;enumeration value="Galileo"/>
 *     &lt;enumeration value="Indigo"/>
 *     &lt;enumeration value="Paramount"/>
 *     &lt;enumeration value="AirDeccan"/>
 *     &lt;enumeration value="Mdlr"/>
 *     &lt;enumeration value="GoAir"/>
 *     &lt;enumeration value="ThirdParty"/>
 *     &lt;enumeration value="Sama"/>
 *     &lt;enumeration value="AirArabia"/>
 *     &lt;enumeration value="AirIndiaExpress"/>
 *     &lt;enumeration value="AirIndiaExpressDom"/>
 *     &lt;enumeration value="HermesAirLine"/>
 *     &lt;enumeration value="FlyDubai"/>
 *     &lt;enumeration value="AlJazeera"/>
 *     &lt;enumeration value="AirAsia"/>
 *     &lt;enumeration value="PrivateFares"/>
 *     &lt;enumeration value="Picasso"/>
 *     &lt;enumeration value="TravelFusion"/>
 *     &lt;enumeration value="VenturaAirConnect"/>
 *     &lt;enumeration value="IndigoCoupon"/>
 *     &lt;enumeration value="SpiceJetCoupon"/>
 *     &lt;enumeration value="GoAirCoupon"/>
 *     &lt;enumeration value="IndigoTBF"/>
 *     &lt;enumeration value="SpiceJetTBF"/>
 *     &lt;enumeration value="GoAirTBF"/>
 *     &lt;enumeration value="IndigoSPLCoupon"/>
 *     &lt;enumeration value="SpiceJetSPLCoupon"/>
 *     &lt;enumeration value="GoAirSPLCoupon"/>
 *     &lt;enumeration value="IndigoPrPrch"/>
 *     &lt;enumeration value="SpiceJetPrPrch"/>
 *     &lt;enumeration value="GoAirPrPrch"/>
 *     &lt;enumeration value="IndigoCrpFare"/>
 *     &lt;enumeration value="SpiceJetCrpFare"/>
 *     &lt;enumeration value="GoAirCrpFare"/>
 *     &lt;enumeration value="IndigoLTC"/>
 *     &lt;enumeration value="SpiceJetLTC"/>
 *     &lt;enumeration value="GoAirLTC"/>
 *     &lt;enumeration value="IndigoDstInv"/>
 *     &lt;enumeration value="SpiceJetDstInv"/>
 *     &lt;enumeration value="GoAirDstInv"/>
 *     &lt;enumeration value="TigerAirways"/>
 *     &lt;enumeration value="AirCosta"/>
 *     &lt;enumeration value="MalindoAir"/>
 *     &lt;enumeration value="BhutanAirlines"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BookingSource")
@XmlEnum
public enum BookingSource {

    @XmlEnumValue("WorldSpan")
    WORLD_SPAN("WorldSpan"),
    @XmlEnumValue("Abacus")
    ABACUS("Abacus"),
    @XmlEnumValue("SpiceJet")
    SPICE_JET("SpiceJet"),
    @XmlEnumValue("Amadeus")
    AMADEUS("Amadeus"),
    @XmlEnumValue("Galileo")
    GALILEO("Galileo"),
    @XmlEnumValue("Indigo")
    INDIGO("Indigo"),
    @XmlEnumValue("Paramount")
    PARAMOUNT("Paramount"),
    @XmlEnumValue("AirDeccan")
    AIR_DECCAN("AirDeccan"),
    @XmlEnumValue("Mdlr")
    MDLR("Mdlr"),
    @XmlEnumValue("GoAir")
    GO_AIR("GoAir"),
    @XmlEnumValue("ThirdParty")
    THIRD_PARTY("ThirdParty"),
    @XmlEnumValue("Sama")
    SAMA("Sama"),
    @XmlEnumValue("AirArabia")
    AIR_ARABIA("AirArabia"),
    @XmlEnumValue("AirIndiaExpress")
    AIR_INDIA_EXPRESS("AirIndiaExpress"),
    @XmlEnumValue("AirIndiaExpressDom")
    AIR_INDIA_EXPRESS_DOM("AirIndiaExpressDom"),
    @XmlEnumValue("HermesAirLine")
    HERMES_AIR_LINE("HermesAirLine"),
    @XmlEnumValue("FlyDubai")
    FLY_DUBAI("FlyDubai"),
    @XmlEnumValue("AlJazeera")
    AL_JAZEERA("AlJazeera"),
    @XmlEnumValue("AirAsia")
    AIR_ASIA("AirAsia"),
    @XmlEnumValue("PrivateFares")
    PRIVATE_FARES("PrivateFares"),
    @XmlEnumValue("Picasso")
    PICASSO("Picasso"),
    @XmlEnumValue("TravelFusion")
    TRAVEL_FUSION("TravelFusion"),
    @XmlEnumValue("VenturaAirConnect")
    VENTURA_AIR_CONNECT("VenturaAirConnect"),
    @XmlEnumValue("IndigoCoupon")
    INDIGO_COUPON("IndigoCoupon"),
    @XmlEnumValue("SpiceJetCoupon")
    SPICE_JET_COUPON("SpiceJetCoupon"),
    @XmlEnumValue("GoAirCoupon")
    GO_AIR_COUPON("GoAirCoupon"),
    @XmlEnumValue("IndigoTBF")
    INDIGO_TBF("IndigoTBF"),
    @XmlEnumValue("SpiceJetTBF")
    SPICE_JET_TBF("SpiceJetTBF"),
    @XmlEnumValue("GoAirTBF")
    GO_AIR_TBF("GoAirTBF"),
    @XmlEnumValue("IndigoSPLCoupon")
    INDIGO_SPL_COUPON("IndigoSPLCoupon"),
    @XmlEnumValue("SpiceJetSPLCoupon")
    SPICE_JET_SPL_COUPON("SpiceJetSPLCoupon"),
    @XmlEnumValue("GoAirSPLCoupon")
    GO_AIR_SPL_COUPON("GoAirSPLCoupon"),
    @XmlEnumValue("IndigoPrPrch")
    INDIGO_PR_PRCH("IndigoPrPrch"),
    @XmlEnumValue("SpiceJetPrPrch")
    SPICE_JET_PR_PRCH("SpiceJetPrPrch"),
    @XmlEnumValue("GoAirPrPrch")
    GO_AIR_PR_PRCH("GoAirPrPrch"),
    @XmlEnumValue("IndigoCrpFare")
    INDIGO_CRP_FARE("IndigoCrpFare"),
    @XmlEnumValue("SpiceJetCrpFare")
    SPICE_JET_CRP_FARE("SpiceJetCrpFare"),
    @XmlEnumValue("GoAirCrpFare")
    GO_AIR_CRP_FARE("GoAirCrpFare"),
    @XmlEnumValue("IndigoLTC")
    INDIGO_LTC("IndigoLTC"),
    @XmlEnumValue("SpiceJetLTC")
    SPICE_JET_LTC("SpiceJetLTC"),
    @XmlEnumValue("GoAirLTC")
    GO_AIR_LTC("GoAirLTC"),
    @XmlEnumValue("IndigoDstInv")
    INDIGO_DST_INV("IndigoDstInv"),
    @XmlEnumValue("SpiceJetDstInv")
    SPICE_JET_DST_INV("SpiceJetDstInv"),
    @XmlEnumValue("GoAirDstInv")
    GO_AIR_DST_INV("GoAirDstInv"),
    @XmlEnumValue("TigerAirways")
    TIGER_AIRWAYS("TigerAirways"),
    @XmlEnumValue("AirCosta")
    AIR_COSTA("AirCosta"),
    @XmlEnumValue("MalindoAir")
    MALINDO_AIR("MalindoAir"),
    @XmlEnumValue("BhutanAirlines")
    BHUTAN_AIRLINES("BhutanAirlines");
    private final String value;

    BookingSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingSource fromValue(String v) {
        for (BookingSource c: BookingSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
