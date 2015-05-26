
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRowLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRowLocation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Rear"/>
 *     &lt;enumeration value="Front"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeRowLocation")
@XmlEnum
public enum TypeRowLocation {

    @XmlEnumValue("Rear")
    REAR("Rear"),
    @XmlEnumValue("Front")
    FRONT("Front");
    private final String value;

    TypeRowLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRowLocation fromValue(String v) {
        for (TypeRowLocation c: TypeRowLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
