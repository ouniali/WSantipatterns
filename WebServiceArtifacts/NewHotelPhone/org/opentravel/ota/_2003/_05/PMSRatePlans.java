
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PMSRatePlans.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PMSRatePlans">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RoomOnly"/>
 *     &lt;enumeration value="BedBreakfast"/>
 *     &lt;enumeration value="HalfBoard"/>
 *     &lt;enumeration value="FullBoard"/>
 *     &lt;enumeration value="AllInclusive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PMSRatePlans")
@XmlEnum
public enum PMSRatePlans {

    @XmlEnumValue("RoomOnly")
    ROOM_ONLY("RoomOnly"),
    @XmlEnumValue("BedBreakfast")
    BED_BREAKFAST("BedBreakfast"),
    @XmlEnumValue("HalfBoard")
    HALF_BOARD("HalfBoard"),
    @XmlEnumValue("FullBoard")
    FULL_BOARD("FullBoard"),
    @XmlEnumValue("AllInclusive")
    ALL_INCLUSIVE("AllInclusive");
    private final String value;

    PMSRatePlans(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PMSRatePlans fromValue(String v) {
        for (PMSRatePlans c: PMSRatePlans.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
