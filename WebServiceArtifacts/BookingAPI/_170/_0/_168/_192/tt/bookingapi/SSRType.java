
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SSRType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SSRType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Baggage"/>
 *     &lt;enumeration value="Meal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SSRType")
@XmlEnum
public enum SSRType {

    @XmlEnumValue("Baggage")
    BAGGAGE("Baggage"),
    @XmlEnumValue("Meal")
    MEAL("Meal");
    private final String value;

    SSRType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SSRType fromValue(String v) {
        for (SSRType c: SSRType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
