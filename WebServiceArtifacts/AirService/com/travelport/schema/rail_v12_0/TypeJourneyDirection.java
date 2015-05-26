
package com.travelport.schema.rail_v12_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeJourneyDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeJourneyDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Outward"/>
 *     &lt;enumeration value="Return"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeJourneyDirection")
@XmlEnum
public enum TypeJourneyDirection {

    @XmlEnumValue("Outward")
    OUTWARD("Outward"),
    @XmlEnumValue("Return")
    RETURN("Return");
    private final String value;

    TypeJourneyDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeJourneyDirection fromValue(String v) {
        for (TypeJourneyDirection c: TypeJourneyDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
