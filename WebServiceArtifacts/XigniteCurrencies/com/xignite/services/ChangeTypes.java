
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OneMonth"/>
 *     &lt;enumeration value="ThreeMonth"/>
 *     &lt;enumeration value="SixMonth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeTypes")
@XmlEnum
public enum ChangeTypes {

    @XmlEnumValue("OneMonth")
    ONE_MONTH("OneMonth"),
    @XmlEnumValue("ThreeMonth")
    THREE_MONTH("ThreeMonth"),
    @XmlEnumValue("SixMonth")
    SIX_MONTH("SixMonth");
    private final String value;

    ChangeTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeTypes fromValue(String v) {
        for (ChangeTypes c: ChangeTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
