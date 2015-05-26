
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Stock"/>
 *     &lt;enumeration value="Derivative"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecurityTypes")
@XmlEnum
public enum SecurityTypes {

    @XmlEnumValue("Stock")
    STOCK("Stock"),
    @XmlEnumValue("Derivative")
    DERIVATIVE("Derivative"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    SecurityTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityTypes fromValue(String v) {
        for (SecurityTypes c: SecurityTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
