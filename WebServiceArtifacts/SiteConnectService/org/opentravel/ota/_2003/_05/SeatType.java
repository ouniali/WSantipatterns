
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Window"/>
 *     &lt;enumeration value="Aisle"/>
 *     &lt;enumeration value="Table"/>
 *     &lt;enumeration value="Middle"/>
 *     &lt;enumeration value="Individual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeatType")
@XmlEnum
public enum SeatType {

    @XmlEnumValue("Window")
    WINDOW("Window"),
    @XmlEnumValue("Aisle")
    AISLE("Aisle"),
    @XmlEnumValue("Table")
    TABLE("Table"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle"),
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual");
    private final String value;

    SeatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeatType fromValue(String v) {
        for (SeatType c: SeatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
