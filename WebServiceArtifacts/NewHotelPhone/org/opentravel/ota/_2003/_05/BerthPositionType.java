
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BerthPositionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BerthPositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Upper"/>
 *     &lt;enumeration value="Middle"/>
 *     &lt;enumeration value="Lower"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BerthPositionType")
@XmlEnum
public enum BerthPositionType {

    @XmlEnumValue("Upper")
    UPPER("Upper"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle"),
    @XmlEnumValue("Lower")
    LOWER("Lower");
    private final String value;

    BerthPositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BerthPositionType fromValue(String v) {
        for (BerthPositionType c: BerthPositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
