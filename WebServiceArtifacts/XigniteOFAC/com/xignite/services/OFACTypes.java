
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OFACTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OFACTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Organization"/>
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="Vessel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OFACTypes")
@XmlEnum
public enum OFACTypes {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Organization")
    ORGANIZATION("Organization"),
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("Vessel")
    VESSEL("Vessel");
    private final String value;

    OFACTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OFACTypes fromValue(String v) {
        for (OFACTypes c: OFACTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
