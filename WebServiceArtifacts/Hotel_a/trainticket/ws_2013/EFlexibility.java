
package trainticket.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eFlexibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eFlexibility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fully_Flexible"/>
 *     &lt;enumeration value="Non_Flexible"/>
 *     &lt;enumeration value="Semi_Flexible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eFlexibility")
@XmlEnum
public enum EFlexibility {

    @XmlEnumValue("Fully_Flexible")
    FULLY_FLEXIBLE("Fully_Flexible"),
    @XmlEnumValue("Non_Flexible")
    NON_FLEXIBLE("Non_Flexible"),
    @XmlEnumValue("Semi_Flexible")
    SEMI_FLEXIBLE("Semi_Flexible");
    private final String value;

    EFlexibility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EFlexibility fromValue(String v) {
        for (EFlexibility c: EFlexibility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
