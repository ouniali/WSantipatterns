
package com.exactor.ns;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxObligationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxObligationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Partial"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxObligationType")
@XmlEnum
public enum TaxObligationType {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    TaxObligationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxObligationType fromValue(String v) {
        for (TaxObligationType c: TaxObligationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
