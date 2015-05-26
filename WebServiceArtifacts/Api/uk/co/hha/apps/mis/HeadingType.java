
package uk.co.hha.apps.mis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeadingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HeadingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HeadingIn"/>
 *     &lt;enumeration value="HeadingOut"/>
 *     &lt;enumeration value="Starboard"/>
 *     &lt;enumeration value="Port"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeadingType")
@XmlEnum
public enum HeadingType {

    @XmlEnumValue("HeadingIn")
    HEADING_IN("HeadingIn"),
    @XmlEnumValue("HeadingOut")
    HEADING_OUT("HeadingOut"),
    @XmlEnumValue("Starboard")
    STARBOARD("Starboard"),
    @XmlEnumValue("Port")
    PORT("Port"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    HeadingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeadingType fromValue(String v) {
        for (HeadingType c: HeadingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
