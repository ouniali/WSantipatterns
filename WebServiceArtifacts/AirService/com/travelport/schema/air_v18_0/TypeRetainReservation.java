
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRetainReservation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRetainReservation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Schedule"/>
 *     &lt;enumeration value="Price"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeRetainReservation")
@XmlEnum
public enum TypeRetainReservation {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Schedule")
    SCHEDULE("Schedule"),
    @XmlEnumValue("Price")
    PRICE("Price"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TypeRetainReservation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRetainReservation fromValue(String v) {
        for (TypeRetainReservation c: TypeRetainReservation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
