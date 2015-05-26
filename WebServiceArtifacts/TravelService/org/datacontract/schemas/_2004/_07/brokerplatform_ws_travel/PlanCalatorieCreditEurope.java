
package org.datacontract.schemas._2004._07.brokerplatform_ws_travel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanCalatorieCreditEurope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlanCalatorieCreditEurope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TariLimitorfeIeftin"/>
 *     &lt;enumeration value="TariLimitrofeExtra"/>
 *     &lt;enumeration value="TariEuropaIeftin"/>
 *     &lt;enumeration value="TariEuropa"/>
 *     &lt;enumeration value="TariEuropaExtra"/>
 *     &lt;enumeration value="WW"/>
 *     &lt;enumeration value="Business"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlanCalatorieCreditEurope", namespace = "http://schemas.datacontract.org/2004/07/BrokerPlatform.Ws.Travel.Dto")
@XmlEnum
public enum PlanCalatorieCreditEurope {

    @XmlEnumValue("TariLimitorfeIeftin")
    TARI_LIMITORFE_IEFTIN("TariLimitorfeIeftin"),
    @XmlEnumValue("TariLimitrofeExtra")
    TARI_LIMITROFE_EXTRA("TariLimitrofeExtra"),
    @XmlEnumValue("TariEuropaIeftin")
    TARI_EUROPA_IEFTIN("TariEuropaIeftin"),
    @XmlEnumValue("TariEuropa")
    TARI_EUROPA("TariEuropa"),
    @XmlEnumValue("TariEuropaExtra")
    TARI_EUROPA_EXTRA("TariEuropaExtra"),
    WW("WW"),
    @XmlEnumValue("Business")
    BUSINESS("Business");
    private final String value;

    PlanCalatorieCreditEurope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlanCalatorieCreditEurope fromValue(String v) {
        for (PlanCalatorieCreditEurope c: PlanCalatorieCreditEurope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
