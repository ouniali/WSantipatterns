
package trainticket.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eReservationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eReservationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="AwatingPayment"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="PendingCancellation"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="TechnicalProblem"/>
 *     &lt;enumeration value="OnRequest"/>
 *     &lt;enumeration value="Rejected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eReservationStatus")
@XmlEnum
public enum EReservationStatus {

    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("AwatingPayment")
    AWATING_PAYMENT("AwatingPayment"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("PendingCancellation")
    PENDING_CANCELLATION("PendingCancellation"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("TechnicalProblem")
    TECHNICAL_PROBLEM("TechnicalProblem"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    EReservationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EReservationStatus fromValue(String v) {
        for (EReservationStatus c: EReservationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
