
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typePolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typePolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Air"/>
 *     &lt;enumeration value="Vehicle"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Rail"/>
 *     &lt;enumeration value="Ticketing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typePolicy")
@XmlEnum
public enum TypePolicy {

    @XmlEnumValue("Air")
    AIR("Air"),
    @XmlEnumValue("Vehicle")
    VEHICLE("Vehicle"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Rail")
    RAIL("Rail"),
    @XmlEnumValue("Ticketing")
    TICKETING("Ticketing");
    private final String value;

    TypePolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypePolicy fromValue(String v) {
        for (TypePolicy c: TypePolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
