
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EChannelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Expedia"/>
 *     &lt;enumeration value="Booking"/>
 *     &lt;enumeration value="SynXis"/>
 *     &lt;enumeration value="BookAssist"/>
 *     &lt;enumeration value="WebBooking"/>
 *     &lt;enumeration value="EGDS"/>
 *     &lt;enumeration value="GuestCentric"/>
 *     &lt;enumeration value="Pegasus"/>
 *     &lt;enumeration value="Cubilis"/>
 *     &lt;enumeration value="TravelClick"/>
 *     &lt;enumeration value="SiteMinder"/>
 *     &lt;enumeration value="AvailPro"/>
 *     &lt;enumeration value="TripAdvisor"/>
 *     &lt;enumeration value="CloudOne"/>
 *     &lt;enumeration value="RateGain"/>
 *     &lt;enumeration value="NeoBookings"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EChannelType")
@XmlEnum
public enum EChannelType {

    @XmlEnumValue("Expedia")
    EXPEDIA("Expedia"),
    @XmlEnumValue("Booking")
    BOOKING("Booking"),
    @XmlEnumValue("SynXis")
    SYN_XIS("SynXis"),
    @XmlEnumValue("BookAssist")
    BOOK_ASSIST("BookAssist"),
    @XmlEnumValue("WebBooking")
    WEB_BOOKING("WebBooking"),
    EGDS("EGDS"),
    @XmlEnumValue("GuestCentric")
    GUEST_CENTRIC("GuestCentric"),
    @XmlEnumValue("Pegasus")
    PEGASUS("Pegasus"),
    @XmlEnumValue("Cubilis")
    CUBILIS("Cubilis"),
    @XmlEnumValue("TravelClick")
    TRAVEL_CLICK("TravelClick"),
    @XmlEnumValue("SiteMinder")
    SITE_MINDER("SiteMinder"),
    @XmlEnumValue("AvailPro")
    AVAIL_PRO("AvailPro"),
    @XmlEnumValue("TripAdvisor")
    TRIP_ADVISOR("TripAdvisor"),
    @XmlEnumValue("CloudOne")
    CLOUD_ONE("CloudOne"),
    @XmlEnumValue("RateGain")
    RATE_GAIN("RateGain"),
    @XmlEnumValue("NeoBookings")
    NEO_BOOKINGS("NeoBookings");
    private final String value;

    EChannelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EChannelType fromValue(String v) {
        for (EChannelType c: EChannelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
