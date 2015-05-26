
package trainticket.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eReservationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eReservationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Partial_Ticket_Or_Reservation"/>
 *     &lt;enumeration value="Reservation_Only"/>
 *     &lt;enumeration value="Ticket_Only"/>
 *     &lt;enumeration value="Ticket_Plus_Reservation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eReservationType")
@XmlEnum
public enum EReservationType {

    @XmlEnumValue("Partial_Ticket_Or_Reservation")
    PARTIAL_TICKET_OR_RESERVATION("Partial_Ticket_Or_Reservation"),
    @XmlEnumValue("Reservation_Only")
    RESERVATION_ONLY("Reservation_Only"),
    @XmlEnumValue("Ticket_Only")
    TICKET_ONLY("Ticket_Only"),
    @XmlEnumValue("Ticket_Plus_Reservation")
    TICKET_PLUS_RESERVATION("Ticket_Plus_Reservation");
    private final String value;

    EReservationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EReservationType fromValue(String v) {
        for (EReservationType c: EReservationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
