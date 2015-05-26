
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuoteTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RealTime"/>
 *     &lt;enumeration value="Delayed15Minutes"/>
 *     &lt;enumeration value="Delayed20Minutes"/>
 *     &lt;enumeration value="NotAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuoteTypes")
@XmlEnum
public enum QuoteTypes {

    @XmlEnumValue("RealTime")
    REAL_TIME("RealTime"),
    @XmlEnumValue("Delayed15Minutes")
    DELAYED_15_MINUTES("Delayed15Minutes"),
    @XmlEnumValue("Delayed20Minutes")
    DELAYED_20_MINUTES("Delayed20Minutes"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable");
    private final String value;

    QuoteTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuoteTypes fromValue(String v) {
        for (QuoteTypes c: QuoteTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
