
package com.exactor.ns;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxDirectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxDirectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Forward"/>
 *     &lt;enumeration value="Reverse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxDirectionType")
@XmlEnum
public enum TaxDirectionType {

    @XmlEnumValue("Forward")
    FORWARD("Forward"),
    @XmlEnumValue("Reverse")
    REVERSE("Reverse");
    private final String value;

    TaxDirectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxDirectionType fromValue(String v) {
        for (TaxDirectionType c: TaxDirectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
