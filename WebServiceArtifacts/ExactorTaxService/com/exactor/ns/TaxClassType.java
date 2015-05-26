
package com.exactor.ns;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sales"/>
 *     &lt;enumeration value="Use"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxClassType")
@XmlEnum
public enum TaxClassType {

    @XmlEnumValue("Sales")
    SALES("Sales"),
    @XmlEnumValue("Use")
    USE("Use");
    private final String value;

    TaxClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxClassType fromValue(String v) {
        for (TaxClassType c: TaxClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
