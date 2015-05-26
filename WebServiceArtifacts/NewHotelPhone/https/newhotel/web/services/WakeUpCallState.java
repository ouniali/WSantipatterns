
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WakeUpCallState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WakeUpCallState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Requested"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Executed"/>
 *     &lt;enumeration value="Scheduled"/>
 *     &lt;enumeration value="NoResponse"/>
 *     &lt;enumeration value="CancelRequested"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WakeUpCallState")
@XmlEnum
public enum WakeUpCallState {

    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Executed")
    EXECUTED("Executed"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("NoResponse")
    NO_RESPONSE("NoResponse"),
    @XmlEnumValue("CancelRequested")
    CANCEL_REQUESTED("CancelRequested");
    private final String value;

    WakeUpCallState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WakeUpCallState fromValue(String v) {
        for (WakeUpCallState c: WakeUpCallState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
