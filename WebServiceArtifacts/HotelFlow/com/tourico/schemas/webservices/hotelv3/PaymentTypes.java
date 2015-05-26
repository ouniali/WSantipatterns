
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="Obligo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentTypes")
@XmlEnum
public enum PaymentTypes {

    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("Obligo")
    OBLIGO("Obligo");
    private final String value;

    PaymentTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTypes fromValue(String v) {
        for (PaymentTypes c: PaymentTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
