
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailabilityStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailabilityStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Close"/>
 *     &lt;enumeration value="ClosedOnArrival"/>
 *     &lt;enumeration value="ClosedOnArrivalOnRequest"/>
 *     &lt;enumeration value="OnRequest"/>
 *     &lt;enumeration value="RemoveCloseOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AvailabilityStatusType")
@XmlEnum
public enum AvailabilityStatusType {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Close")
    CLOSE("Close"),
    @XmlEnumValue("ClosedOnArrival")
    CLOSED_ON_ARRIVAL("ClosedOnArrival"),
    @XmlEnumValue("ClosedOnArrivalOnRequest")
    CLOSED_ON_ARRIVAL_ON_REQUEST("ClosedOnArrivalOnRequest"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest"),
    @XmlEnumValue("RemoveCloseOnly")
    REMOVE_CLOSE_ONLY("RemoveCloseOnly");
    private final String value;

    AvailabilityStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailabilityStatusType fromValue(String v) {
        for (AvailabilityStatusType c: AvailabilityStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
