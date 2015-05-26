
package transfer.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eTransportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eTransportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Regular"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eTransportType")
@XmlEnum
public enum ETransportType {

    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Regular")
    REGULAR("Regular");
    private final String value;

    ETransportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ETransportType fromValue(String v) {
        for (ETransportType c: ETransportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
