
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WakeUpCallTypeCall.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WakeUpCallTypeCall">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="PayTv"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WakeUpCallTypeCall")
@XmlEnum
public enum WakeUpCallTypeCall {

    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("PayTv")
    PAY_TV("PayTv"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    WakeUpCallTypeCall(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WakeUpCallTypeCall fromValue(String v) {
        for (WakeUpCallTypeCall c: WakeUpCallTypeCall.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
