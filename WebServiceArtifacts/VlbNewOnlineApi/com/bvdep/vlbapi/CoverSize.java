
package com.bvdep.vlbapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CoverSize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Small"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="Large"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoverSize")
@XmlEnum
public enum CoverSize {

    @XmlEnumValue("Small")
    SMALL("Small"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("Large")
    LARGE("Large");
    private final String value;

    CoverSize(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoverSize fromValue(String v) {
        for (CoverSize c: CoverSize.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
