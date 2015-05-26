
package uk.co.hha.apps.mis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Forecast"/>
 *     &lt;enumeration value="Arrival"/>
 *     &lt;enumeration value="Shift"/>
 *     &lt;enumeration value="Berth"/>
 *     &lt;enumeration value="Anchorage"/>
 *     &lt;enumeration value="Departure"/>
 *     &lt;enumeration value="Transit"/>
 *     &lt;enumeration value="Binned"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionType")
@XmlEnum
public enum ActionType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Forecast")
    FORECAST("Forecast"),
    @XmlEnumValue("Arrival")
    ARRIVAL("Arrival"),
    @XmlEnumValue("Shift")
    SHIFT("Shift"),
    @XmlEnumValue("Berth")
    BERTH("Berth"),
    @XmlEnumValue("Anchorage")
    ANCHORAGE("Anchorage"),
    @XmlEnumValue("Departure")
    DEPARTURE("Departure"),
    @XmlEnumValue("Transit")
    TRANSIT("Transit"),
    @XmlEnumValue("Binned")
    BINNED("Binned");
    private final String value;

    ActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionType fromValue(String v) {
        for (ActionType c: ActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
