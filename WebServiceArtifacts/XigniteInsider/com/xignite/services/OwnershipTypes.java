
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnershipTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnershipTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="Indirect"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwnershipTypes")
@XmlEnum
public enum OwnershipTypes {

    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("Indirect")
    INDIRECT("Indirect"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    OwnershipTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnershipTypes fromValue(String v) {
        for (OwnershipTypes c: OwnershipTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
