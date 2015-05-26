
package uk.co.hha.apps.mis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Scheduled"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Running"/>
 *     &lt;enumeration value="Closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StateType")
@XmlEnum
public enum StateType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    StateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StateType fromValue(String v) {
        for (StateType c: StateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
