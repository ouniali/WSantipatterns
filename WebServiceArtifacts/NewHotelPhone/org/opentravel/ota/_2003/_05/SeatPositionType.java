
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatPositionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeatPositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Together"/>
 *     &lt;enumeration value="Aisle"/>
 *     &lt;enumeration value="Center"/>
 *     &lt;enumeration value="Window"/>
 *     &lt;enumeration value="Specific"/>
 *     &lt;enumeration value="Exit"/>
 *     &lt;enumeration value="Table"/>
 *     &lt;enumeration value="AdjacentAisle"/>
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="Middle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeatPositionType")
@XmlEnum
public enum SeatPositionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Together")
    TOGETHER("Together"),
    @XmlEnumValue("Aisle")
    AISLE("Aisle"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("Window")
    WINDOW("Window"),
    @XmlEnumValue("Specific")
    SPECIFIC("Specific"),
    @XmlEnumValue("Exit")
    EXIT("Exit"),
    @XmlEnumValue("Table")
    TABLE("Table"),
    @XmlEnumValue("AdjacentAisle")
    ADJACENT_AISLE("AdjacentAisle"),
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle");
    private final String value;

    SeatPositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeatPositionType fromValue(String v) {
        for (SeatPositionType c: SeatPositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
