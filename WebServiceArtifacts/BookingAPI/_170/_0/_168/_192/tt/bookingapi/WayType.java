
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Segment"/>
 *     &lt;enumeration value="FullJourney"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WayType")
@XmlEnum
public enum WayType {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Segment")
    SEGMENT("Segment"),
    @XmlEnumValue("FullJourney")
    FULL_JOURNEY("FullJourney");
    private final String value;

    WayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WayType fromValue(String v) {
        for (WayType c: WayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
