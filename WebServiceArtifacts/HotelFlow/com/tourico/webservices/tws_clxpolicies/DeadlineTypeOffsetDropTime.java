
package com.tourico.webservices.tws_clxpolicies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeadlineTypeOffsetDropTime.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeadlineTypeOffsetDropTime">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BeforeArrival"/>
 *     &lt;enumeration value="AfterBooking"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeadlineTypeOffsetDropTime")
@XmlEnum
public enum DeadlineTypeOffsetDropTime {

    @XmlEnumValue("BeforeArrival")
    BEFORE_ARRIVAL("BeforeArrival"),
    @XmlEnumValue("AfterBooking")
    AFTER_BOOKING("AfterBooking");
    private final String value;

    DeadlineTypeOffsetDropTime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeadlineTypeOffsetDropTime fromValue(String v) {
        for (DeadlineTypeOffsetDropTime c: DeadlineTypeOffsetDropTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
