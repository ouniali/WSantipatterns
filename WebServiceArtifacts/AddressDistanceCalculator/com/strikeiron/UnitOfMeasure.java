
package com.strikeiron;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Miles"/>
 *     &lt;enumeration value="NauticalMiles"/>
 *     &lt;enumeration value="Meters"/>
 *     &lt;enumeration value="Kilometers"/>
 *     &lt;enumeration value="Yards"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitOfMeasure")
@XmlEnum
public enum UnitOfMeasure {

    @XmlEnumValue("Miles")
    MILES("Miles"),
    @XmlEnumValue("NauticalMiles")
    NAUTICAL_MILES("NauticalMiles"),
    @XmlEnumValue("Meters")
    METERS("Meters"),
    @XmlEnumValue("Kilometers")
    KILOMETERS("Kilometers"),
    @XmlEnumValue("Yards")
    YARDS("Yards");
    private final String value;

    UnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitOfMeasure fromValue(String v) {
        for (UnitOfMeasure c: UnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
