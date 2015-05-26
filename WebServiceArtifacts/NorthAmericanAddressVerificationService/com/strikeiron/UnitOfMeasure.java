
package com.strikeiron;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MILES"/>
 *     &lt;enumeration value="NAUTICAL_MILES"/>
 *     &lt;enumeration value="METERS"/>
 *     &lt;enumeration value="KILOMETERS"/>
 *     &lt;enumeration value="YARDS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitOfMeasure")
@XmlEnum
public enum UnitOfMeasure {

    MILES,
    NAUTICAL_MILES,
    METERS,
    KILOMETERS,
    YARDS;

    public String value() {
        return name();
    }

    public static UnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
