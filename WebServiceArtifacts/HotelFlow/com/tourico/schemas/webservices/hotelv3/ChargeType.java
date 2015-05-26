
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Included"/>
 *     &lt;enumeration value="Addition"/>
 *     &lt;enumeration value="AtProperty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargeType")
@XmlEnum
public enum ChargeType {

    @XmlEnumValue("Included")
    INCLUDED("Included"),
    @XmlEnumValue("Addition")
    ADDITION("Addition"),
    @XmlEnumValue("AtProperty")
    AT_PROPERTY("AtProperty");
    private final String value;

    ChargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeType fromValue(String v) {
        for (ChargeType c: ChargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
