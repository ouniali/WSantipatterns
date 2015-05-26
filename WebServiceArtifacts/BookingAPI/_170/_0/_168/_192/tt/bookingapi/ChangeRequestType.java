
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeRequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeRequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cancellation"/>
 *     &lt;enumeration value="Reissuance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeRequestType")
@XmlEnum
public enum ChangeRequestType {

    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),
    @XmlEnumValue("Reissuance")
    REISSUANCE("Reissuance");
    private final String value;

    ChangeRequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeRequestType fromValue(String v) {
        for (ChangeRequestType c: ChangeRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
