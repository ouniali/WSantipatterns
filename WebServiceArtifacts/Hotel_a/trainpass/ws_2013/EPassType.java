
package trainpass.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ePassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ePassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Saver"/>
 *     &lt;enumeration value="Party"/>
 *     &lt;enumeration value="Todos"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ePassType")
@XmlEnum
public enum EPassType {

    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Saver")
    SAVER("Saver"),
    @XmlEnumValue("Party")
    PARTY("Party"),
    @XmlEnumValue("Todos")
    TODOS("Todos");
    private final String value;

    EPassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPassType fromValue(String v) {
        for (EPassType c: EPassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
