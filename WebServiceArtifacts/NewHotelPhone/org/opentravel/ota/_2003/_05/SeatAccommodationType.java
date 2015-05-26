
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatAccommodationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeatAccommodationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSignificant"/>
 *     &lt;enumeration value="Seat"/>
 *     &lt;enumeration value="Sleeperette"/>
 *     &lt;enumeration value="NoSeat"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeatAccommodationType")
@XmlEnum
public enum SeatAccommodationType {

    @XmlEnumValue("NotSignificant")
    NOT_SIGNIFICANT("NotSignificant"),
    @XmlEnumValue("Seat")
    SEAT("Seat"),
    @XmlEnumValue("Sleeperette")
    SLEEPERETTE("Sleeperette"),
    @XmlEnumValue("NoSeat")
    NO_SEAT("NoSeat");
    private final String value;

    SeatAccommodationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeatAccommodationType fromValue(String v) {
        for (SeatAccommodationType c: SeatAccommodationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
