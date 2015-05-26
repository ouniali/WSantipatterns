
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sales"/>
 *     &lt;enumeration value="Use"/>
 *     &lt;enumeration value="ConsumerUse"/>
 *     &lt;enumeration value="Output"/>
 *     &lt;enumeration value="Input"/>
 *     &lt;enumeration value="Nonrecoverable"/>
 *     &lt;enumeration value="Fee"/>
 *     &lt;enumeration value="Rental"/>
 *     &lt;enumeration value="Excise"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxType")
@XmlEnum
public enum TaxType {

    @XmlEnumValue("Sales")
    SALES("Sales"),
    @XmlEnumValue("Use")
    USE("Use"),
    @XmlEnumValue("ConsumerUse")
    CONSUMER_USE("ConsumerUse"),
    @XmlEnumValue("Output")
    OUTPUT("Output"),
    @XmlEnumValue("Input")
    INPUT("Input"),
    @XmlEnumValue("Nonrecoverable")
    NONRECOVERABLE("Nonrecoverable"),
    @XmlEnumValue("Fee")
    FEE("Fee"),
    @XmlEnumValue("Rental")
    RENTAL("Rental"),
    @XmlEnumValue("Excise")
    EXCISE("Excise");
    private final String value;

    TaxType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxType fromValue(String v) {
        for (TaxType c: TaxType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
