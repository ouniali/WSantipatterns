
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BerthAccommodationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BerthAccommodationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSignificant"/>
 *     &lt;enumeration value="Berth"/>
 *     &lt;enumeration value="Couchette"/>
 *     &lt;enumeration value="Sleeper"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BerthAccommodationType")
@XmlEnum
public enum BerthAccommodationType {

    @XmlEnumValue("NotSignificant")
    NOT_SIGNIFICANT("NotSignificant"),
    @XmlEnumValue("Berth")
    BERTH("Berth"),
    @XmlEnumValue("Couchette")
    COUCHETTE("Couchette"),
    @XmlEnumValue("Sleeper")
    SLEEPER("Sleeper");
    private final String value;

    BerthAccommodationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BerthAccommodationType fromValue(String v) {
        for (BerthAccommodationType c: BerthAccommodationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
