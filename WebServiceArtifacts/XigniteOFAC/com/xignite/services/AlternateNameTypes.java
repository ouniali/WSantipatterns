
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternateNameTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlternateNameTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aka"/>
 *     &lt;enumeration value="fka"/>
 *     &lt;enumeration value="nka"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlternateNameTypes")
@XmlEnum
public enum AlternateNameTypes {

    @XmlEnumValue("aka")
    AKA("aka"),
    @XmlEnumValue("fka")
    FKA("fka"),
    @XmlEnumValue("nka")
    NKA("nka");
    private final String value;

    AlternateNameTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlternateNameTypes fromValue(String v) {
        for (AlternateNameTypes c: AlternateNameTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
