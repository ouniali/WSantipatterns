
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnershipFormTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnershipFormTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Include"/>
 *     &lt;enumeration value="Exclude"/>
 *     &lt;enumeration value="Only"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwnershipFormTypes")
@XmlEnum
public enum OwnershipFormTypes {

    @XmlEnumValue("Include")
    INCLUDE("Include"),
    @XmlEnumValue("Exclude")
    EXCLUDE("Exclude"),
    @XmlEnumValue("Only")
    ONLY("Only");
    private final String value;

    OwnershipFormTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnershipFormTypes fromValue(String v) {
        for (OwnershipFormTypes c: OwnershipFormTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
