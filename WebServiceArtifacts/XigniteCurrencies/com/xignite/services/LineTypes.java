
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Header"/>
 *     &lt;enumeration value="Line"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineTypes")
@XmlEnum
public enum LineTypes {

    @XmlEnumValue("Header")
    HEADER("Header"),
    @XmlEnumValue("Line")
    LINE("Line");
    private final String value;

    LineTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineTypes fromValue(String v) {
        for (LineTypes c: LineTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
