
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeRequestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeRequestStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Processed"/>
 *     &lt;enumeration value="Rejected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeRequestStatus")
@XmlEnum
public enum ChangeRequestStatus {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    ChangeRequestStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeRequestStatus fromValue(String v) {
        for (ChangeRequestStatus c: ChangeRequestStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
