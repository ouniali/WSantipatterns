
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BookingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hold"/>
 *     &lt;enumeration value="Ready"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Ticketed"/>
 *     &lt;enumeration value="Void"/>
 *     &lt;enumeration value="Dispatched"/>
 *     &lt;enumeration value="Delivered"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="AmendmentInProgress"/>
 *     &lt;enumeration value="AmendmentDone"/>
 *     &lt;enumeration value="Released"/>
 *     &lt;enumeration value="OutsidePurchase"/>
 *     &lt;enumeration value="Booked"/>
 *     &lt;enumeration value="OnRequestFare"/>
 *     &lt;enumeration value="NotConfirmed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BookingStatus")
@XmlEnum
public enum BookingStatus {

    @XmlEnumValue("Hold")
    HOLD("Hold"),
    @XmlEnumValue("Ready")
    READY("Ready"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),
    @XmlEnumValue("Void")
    VOID("Void"),
    @XmlEnumValue("Dispatched")
    DISPATCHED("Dispatched"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("AmendmentInProgress")
    AMENDMENT_IN_PROGRESS("AmendmentInProgress"),
    @XmlEnumValue("AmendmentDone")
    AMENDMENT_DONE("AmendmentDone"),
    @XmlEnumValue("Released")
    RELEASED("Released"),
    @XmlEnumValue("OutsidePurchase")
    OUTSIDE_PURCHASE("OutsidePurchase"),
    @XmlEnumValue("Booked")
    BOOKED("Booked"),
    @XmlEnumValue("OnRequestFare")
    ON_REQUEST_FARE("OnRequestFare"),
    @XmlEnumValue("NotConfirmed")
    NOT_CONFIRMED("NotConfirmed");
    private final String value;

    BookingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingStatus fromValue(String v) {
        for (BookingStatus c: BookingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
