
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskFilterFields.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KioskFilterFields">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ReservationNumber"/>
 *     &lt;enumeration value="ReservationStatus"/>
 *     &lt;enumeration value="ReservationCheckIn"/>
 *     &lt;enumeration value="ReservationCheckOut"/>
 *     &lt;enumeration value="ReservationVoucher"/>
 *     &lt;enumeration value="GroupName"/>
 *     &lt;enumeration value="GuestName"/>
 *     &lt;enumeration value="GuestEmail"/>
 *     &lt;enumeration value="GuestPhone"/>
 *     &lt;enumeration value="ReservationArriveToday"/>
 *     &lt;enumeration value="ReservationDepartureToday"/>
 *     &lt;enumeration value="RoomNumber"/>
 *     &lt;enumeration value="ExternalChannelNumber"/>
 *     &lt;enumeration value="RoomKey"/>
 *     &lt;enumeration value="ConfirmationNumber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KioskFilterFields")
@XmlEnum
public enum KioskFilterFields {

    @XmlEnumValue("ReservationNumber")
    RESERVATION_NUMBER("ReservationNumber"),
    @XmlEnumValue("ReservationStatus")
    RESERVATION_STATUS("ReservationStatus"),
    @XmlEnumValue("ReservationCheckIn")
    RESERVATION_CHECK_IN("ReservationCheckIn"),
    @XmlEnumValue("ReservationCheckOut")
    RESERVATION_CHECK_OUT("ReservationCheckOut"),
    @XmlEnumValue("ReservationVoucher")
    RESERVATION_VOUCHER("ReservationVoucher"),
    @XmlEnumValue("GroupName")
    GROUP_NAME("GroupName"),
    @XmlEnumValue("GuestName")
    GUEST_NAME("GuestName"),
    @XmlEnumValue("GuestEmail")
    GUEST_EMAIL("GuestEmail"),
    @XmlEnumValue("GuestPhone")
    GUEST_PHONE("GuestPhone"),
    @XmlEnumValue("ReservationArriveToday")
    RESERVATION_ARRIVE_TODAY("ReservationArriveToday"),
    @XmlEnumValue("ReservationDepartureToday")
    RESERVATION_DEPARTURE_TODAY("ReservationDepartureToday"),
    @XmlEnumValue("RoomNumber")
    ROOM_NUMBER("RoomNumber"),
    @XmlEnumValue("ExternalChannelNumber")
    EXTERNAL_CHANNEL_NUMBER("ExternalChannelNumber"),
    @XmlEnumValue("RoomKey")
    ROOM_KEY("RoomKey"),
    @XmlEnumValue("ConfirmationNumber")
    CONFIRMATION_NUMBER("ConfirmationNumber");
    private final String value;

    KioskFilterFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KioskFilterFields fromValue(String v) {
        for (KioskFilterFields c: KioskFilterFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
