
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentFrequencyTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentFrequencyTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AtMaturity"/>
 *     &lt;enumeration value="SemiAnnually"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentFrequencyTypes")
@XmlEnum
public enum PaymentFrequencyTypes {

    @XmlEnumValue("AtMaturity")
    AT_MATURITY("AtMaturity"),
    @XmlEnumValue("SemiAnnually")
    SEMI_ANNUALLY("SemiAnnually");
    private final String value;

    PaymentFrequencyTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentFrequencyTypes fromValue(String v) {
        for (PaymentFrequencyTypes c: PaymentFrequencyTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
