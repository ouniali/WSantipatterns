
package trainticket.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eForwardAndReturnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eForwardAndReturnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Forward_And_Return"/>
 *     &lt;enumeration value="Forward_Only"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eForwardAndReturnType")
@XmlEnum
public enum EForwardAndReturnType {

    @XmlEnumValue("Forward_And_Return")
    FORWARD_AND_RETURN("Forward_And_Return"),
    @XmlEnumValue("Forward_Only")
    FORWARD_ONLY("Forward_Only");
    private final String value;

    EForwardAndReturnType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EForwardAndReturnType fromValue(String v) {
        for (EForwardAndReturnType c: EForwardAndReturnType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
