
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Call"/>
 *     &lt;enumeration value="Put"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptionTypes")
@XmlEnum
public enum OptionTypes {

    @XmlEnumValue("Call")
    CALL("Call"),
    @XmlEnumValue("Put")
    PUT("Put");
    private final String value;

    OptionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptionTypes fromValue(String v) {
        for (OptionTypes c: OptionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
