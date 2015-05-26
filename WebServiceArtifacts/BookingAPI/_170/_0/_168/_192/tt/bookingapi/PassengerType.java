
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Adult"/>
 *     &lt;enumeration value="Child"/>
 *     &lt;enumeration value="Infant"/>
 *     &lt;enumeration value="Senior"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassengerType")
@XmlEnum
public enum PassengerType {

    @XmlEnumValue("Adult")
    ADULT("Adult"),
    @XmlEnumValue("Child")
    CHILD("Child"),
    @XmlEnumValue("Infant")
    INFANT("Infant"),
    @XmlEnumValue("Senior")
    SENIOR("Senior");
    private final String value;

    PassengerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerType fromValue(String v) {
        for (PassengerType c: PassengerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
