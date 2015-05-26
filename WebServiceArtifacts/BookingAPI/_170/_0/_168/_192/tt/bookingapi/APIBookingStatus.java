
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIBookingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="APIBookingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Ticketed"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="Pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APIBookingStatus")
@XmlEnum
public enum APIBookingStatus {

    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    APIBookingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APIBookingStatus fromValue(String v) {
        for (APIBookingStatus c: APIBookingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
