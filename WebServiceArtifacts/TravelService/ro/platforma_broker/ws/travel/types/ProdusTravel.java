
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdusTravel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProdusTravel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TravelAstra"/>
 *     &lt;enumeration value="TravelCarpatica"/>
 *     &lt;enumeration value="TravelCarpaticaTH"/>
 *     &lt;enumeration value="TravelGroupama"/>
 *     &lt;enumeration value="TravelEuroins"/>
 *     &lt;enumeration value="TravelOmniasig"/>
 *     &lt;enumeration value="TravelUniqa"/>
 *     &lt;enumeration value="TravelQbe"/>
 *     &lt;enumeration value="TravelAllianz"/>
 *     &lt;enumeration value="TravelATEInsurance"/>
 *     &lt;enumeration value="TravelMondialAssistance"/>
 *     &lt;enumeration value="TravelCreditEurope"/>
 *     &lt;enumeration value="TravelMondialAssistance_WINTER_SPORTS"/>
 *     &lt;enumeration value="TravelMondialAssistance_CLASIC"/>
 *     &lt;enumeration value="TravelMondialAssistance_PREMIUM"/>
 *     &lt;enumeration value="TravelMondialAssistance_STORNO"/>
 *     &lt;enumeration value="TravelMondialAssistance_TRAVEL"/>
 *     &lt;enumeration value="TravelMondialAssistance_AUTO_ASISTENTA"/>
 *     &lt;enumeration value="TravelPlatinum"/>
 *     &lt;enumeration value="CreditEuropeTravelQwe"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProdusTravel")
@XmlEnum
public enum ProdusTravel {

    @XmlEnumValue("TravelAstra")
    TRAVEL_ASTRA("TravelAstra"),
    @XmlEnumValue("TravelCarpatica")
    TRAVEL_CARPATICA("TravelCarpatica"),
    @XmlEnumValue("TravelCarpaticaTH")
    TRAVEL_CARPATICA_TH("TravelCarpaticaTH"),
    @XmlEnumValue("TravelGroupama")
    TRAVEL_GROUPAMA("TravelGroupama"),
    @XmlEnumValue("TravelEuroins")
    TRAVEL_EUROINS("TravelEuroins"),
    @XmlEnumValue("TravelOmniasig")
    TRAVEL_OMNIASIG("TravelOmniasig"),
    @XmlEnumValue("TravelUniqa")
    TRAVEL_UNIQA("TravelUniqa"),
    @XmlEnumValue("TravelQbe")
    TRAVEL_QBE("TravelQbe"),
    @XmlEnumValue("TravelAllianz")
    TRAVEL_ALLIANZ("TravelAllianz"),
    @XmlEnumValue("TravelATEInsurance")
    TRAVEL_ATE_INSURANCE("TravelATEInsurance"),
    @XmlEnumValue("TravelMondialAssistance")
    TRAVEL_MONDIAL_ASSISTANCE("TravelMondialAssistance"),
    @XmlEnumValue("TravelCreditEurope")
    TRAVEL_CREDIT_EUROPE("TravelCreditEurope"),
    @XmlEnumValue("TravelMondialAssistance_WINTER_SPORTS")
    TRAVEL_MONDIAL_ASSISTANCE_WINTER_SPORTS("TravelMondialAssistance_WINTER_SPORTS"),
    @XmlEnumValue("TravelMondialAssistance_CLASIC")
    TRAVEL_MONDIAL_ASSISTANCE_CLASIC("TravelMondialAssistance_CLASIC"),
    @XmlEnumValue("TravelMondialAssistance_PREMIUM")
    TRAVEL_MONDIAL_ASSISTANCE_PREMIUM("TravelMondialAssistance_PREMIUM"),
    @XmlEnumValue("TravelMondialAssistance_STORNO")
    TRAVEL_MONDIAL_ASSISTANCE_STORNO("TravelMondialAssistance_STORNO"),
    @XmlEnumValue("TravelMondialAssistance_TRAVEL")
    TRAVEL_MONDIAL_ASSISTANCE_TRAVEL("TravelMondialAssistance_TRAVEL"),
    @XmlEnumValue("TravelMondialAssistance_AUTO_ASISTENTA")
    TRAVEL_MONDIAL_ASSISTANCE_AUTO_ASISTENTA("TravelMondialAssistance_AUTO_ASISTENTA"),
    @XmlEnumValue("TravelPlatinum")
    TRAVEL_PLATINUM("TravelPlatinum"),
    @XmlEnumValue("CreditEuropeTravelQwe")
    CREDIT_EUROPE_TRAVEL_QWE("CreditEuropeTravelQwe");
    private final String value;

    ProdusTravel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProdusTravel fromValue(String v) {
        for (ProdusTravel c: ProdusTravel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
