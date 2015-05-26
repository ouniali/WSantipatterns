
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SymbologyTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SymbologyTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Xignite"/>
 *     &lt;enumeration value="Yahoo"/>
 *     &lt;enumeration value="Fidelity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SymbologyTypes")
@XmlEnum
public enum SymbologyTypes {

    @XmlEnumValue("Xignite")
    XIGNITE("Xignite"),
    @XmlEnumValue("Yahoo")
    YAHOO("Yahoo"),
    @XmlEnumValue("Fidelity")
    FIDELITY("Fidelity");
    private final String value;

    SymbologyTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SymbologyTypes fromValue(String v) {
        for (SymbologyTypes c: SymbologyTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
