
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JurisdictionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JurisdictionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="Composite"/>
 *     &lt;enumeration value="State"/>
 *     &lt;enumeration value="County"/>
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="Special"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JurisdictionType")
@XmlEnum
public enum JurisdictionType {

    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("Composite")
    COMPOSITE("Composite"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("County")
    COUNTY("County"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Special")
    SPECIAL("Special");
    private final String value;

    JurisdictionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JurisdictionType fromValue(String v) {
        for (JurisdictionType c: JurisdictionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
