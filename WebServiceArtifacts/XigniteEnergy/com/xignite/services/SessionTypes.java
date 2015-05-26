
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SessionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Night"/>
 *     &lt;enumeration value="Combined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SessionTypes")
@XmlEnum
public enum SessionTypes {

    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Night")
    NIGHT("Night"),
    @XmlEnumValue("Combined")
    COMBINED("Combined");
    private final String value;

    SessionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SessionTypes fromValue(String v) {
        for (SessionTypes c: SessionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
