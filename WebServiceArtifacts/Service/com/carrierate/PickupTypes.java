
package com.carrierate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickupTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PickupTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Liftgate"/>
 *     &lt;enumeration value="Residential"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PickupTypes")
@XmlEnum
public enum PickupTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Liftgate")
    LIFTGATE("Liftgate"),
    @XmlEnumValue("Residential")
    RESIDENTIAL("Residential"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    PickupTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PickupTypes fromValue(String v) {
        for (PickupTypes c: PickupTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
