
package org.datacontract.schemas._2004._07.brokerplatform_ws_travel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanCalatorieAllianz.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlanCalatorieAllianz">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PlanA"/>
 *     &lt;enumeration value="PlanB"/>
 *     &lt;enumeration value="PlanC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlanCalatorieAllianz", namespace = "http://schemas.datacontract.org/2004/07/BrokerPlatform.Ws.Travel.Dto")
@XmlEnum
public enum PlanCalatorieAllianz {

    @XmlEnumValue("PlanA")
    PLAN_A("PlanA"),
    @XmlEnumValue("PlanB")
    PLAN_B("PlanB"),
    @XmlEnumValue("PlanC")
    PLAN_C("PlanC");
    private final String value;

    PlanCalatorieAllianz(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlanCalatorieAllianz fromValue(String v) {
        for (PlanCalatorieAllianz c: PlanCalatorieAllianz.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
