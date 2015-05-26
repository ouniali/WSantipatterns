
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List_PaymentCardIssuer_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_PaymentCardIssuer_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AmericanExpress"/>
 *     &lt;enumeration value="BankOfAmerica"/>
 *     &lt;enumeration value="BritishAirways"/>
 *     &lt;enumeration value="CapitalOne"/>
 *     &lt;enumeration value="Chase"/>
 *     &lt;enumeration value="Citibank"/>
 *     &lt;enumeration value="ContinentalAirlines"/>
 *     &lt;enumeration value="DeltaAirlines"/>
 *     &lt;enumeration value="DiscoverCard"/>
 *     &lt;enumeration value="Disney"/>
 *     &lt;enumeration value="Eurocard"/>
 *     &lt;enumeration value="Hilton"/>
 *     &lt;enumeration value="Hyatt"/>
 *     &lt;enumeration value="Mariott"/>
 *     &lt;enumeration value="Mastercard"/>
 *     &lt;enumeration value="RitzCarlton"/>
 *     &lt;enumeration value="SouthwestAirlines"/>
 *     &lt;enumeration value="StarwoodHotels"/>
 *     &lt;enumeration value="UnitedAirlines"/>
 *     &lt;enumeration value="USAirways"/>
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_PaymentCardIssuer_Base")
@XmlEnum
public enum ListPaymentCardIssuerBase {

    @XmlEnumValue("AmericanExpress")
    AMERICAN_EXPRESS("AmericanExpress"),
    @XmlEnumValue("BankOfAmerica")
    BANK_OF_AMERICA("BankOfAmerica"),
    @XmlEnumValue("BritishAirways")
    BRITISH_AIRWAYS("BritishAirways"),
    @XmlEnumValue("CapitalOne")
    CAPITAL_ONE("CapitalOne"),
    @XmlEnumValue("Chase")
    CHASE("Chase"),
    @XmlEnumValue("Citibank")
    CITIBANK("Citibank"),
    @XmlEnumValue("ContinentalAirlines")
    CONTINENTAL_AIRLINES("ContinentalAirlines"),
    @XmlEnumValue("DeltaAirlines")
    DELTA_AIRLINES("DeltaAirlines"),
    @XmlEnumValue("DiscoverCard")
    DISCOVER_CARD("DiscoverCard"),
    @XmlEnumValue("Disney")
    DISNEY("Disney"),
    @XmlEnumValue("Eurocard")
    EUROCARD("Eurocard"),
    @XmlEnumValue("Hilton")
    HILTON("Hilton"),
    @XmlEnumValue("Hyatt")
    HYATT("Hyatt"),
    @XmlEnumValue("Mariott")
    MARIOTT("Mariott"),
    @XmlEnumValue("Mastercard")
    MASTERCARD("Mastercard"),
    @XmlEnumValue("RitzCarlton")
    RITZ_CARLTON("RitzCarlton"),
    @XmlEnumValue("SouthwestAirlines")
    SOUTHWEST_AIRLINES("SouthwestAirlines"),
    @XmlEnumValue("StarwoodHotels")
    STARWOOD_HOTELS("StarwoodHotels"),
    @XmlEnumValue("UnitedAirlines")
    UNITED_AIRLINES("UnitedAirlines"),
    @XmlEnumValue("USAirways")
    US_AIRWAYS("USAirways"),
    VISA("VISA"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListPaymentCardIssuerBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListPaymentCardIssuerBase fromValue(String v) {
        for (ListPaymentCardIssuerBase c: ListPaymentCardIssuerBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
