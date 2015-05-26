
package com.flightwise.planexml.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Landed"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Timeout"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Scheduled"/>
 *     &lt;enumeration value="Filed"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Decontrolled"/>
 *     &lt;enumeration value="Controlled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightStatusType")
@XmlEnum
public enum FlightStatusType {

    @XmlEnumValue("Landed")
    LANDED("Landed"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Timeout")
    TIMEOUT("Timeout"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("Filed")
    FILED("Filed"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Decontrolled")
    DECONTROLLED("Decontrolled"),
    @XmlEnumValue("Controlled")
    CONTROLLED("Controlled");
    private final String value;

    FlightStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightStatusType fromValue(String v) {
        for (FlightStatusType c: FlightStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
