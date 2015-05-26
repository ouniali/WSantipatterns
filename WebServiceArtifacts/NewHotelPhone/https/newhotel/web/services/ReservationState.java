
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Reserved"/>
 *     &lt;enumeration value="CheckIn"/>
 *     &lt;enumeration value="NoShow"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="CheckOut"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReservationState")
@XmlEnum
public enum ReservationState {

    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("CheckIn")
    CHECK_IN("CheckIn"),
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("CheckOut")
    CHECK_OUT("CheckOut");
    private final String value;

    ReservationState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservationState fromValue(String v) {
        for (ReservationState c: ReservationState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
