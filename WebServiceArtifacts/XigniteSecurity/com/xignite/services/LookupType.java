
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LookupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LookupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Stock"/>
 *     &lt;enumeration value="Fund"/>
 *     &lt;enumeration value="Index"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LookupType")
@XmlEnum
public enum LookupType {

    @XmlEnumValue("Stock")
    STOCK("Stock"),
    @XmlEnumValue("Fund")
    FUND("Fund"),
    @XmlEnumValue("Index")
    INDEX("Index");
    private final String value;

    LookupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LookupType fromValue(String v) {
        for (LookupType c: LookupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
