
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeRequestModeComment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeRequestModeComment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NormalCancellation"/>
 *     &lt;enumeration value="NoShow"/>
 *     &lt;enumeration value="FlightCancelled"/>
 *     &lt;enumeration value="PartialCancellation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeRequestModeComment")
@XmlEnum
public enum ChangeRequestModeComment {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("NormalCancellation")
    NORMAL_CANCELLATION("NormalCancellation"),
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),
    @XmlEnumValue("FlightCancelled")
    FLIGHT_CANCELLED("FlightCancelled"),
    @XmlEnumValue("PartialCancellation")
    PARTIAL_CANCELLATION("PartialCancellation");
    private final String value;

    ChangeRequestModeComment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeRequestModeComment fromValue(String v) {
        for (ChangeRequestModeComment c: ChangeRequestModeComment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
