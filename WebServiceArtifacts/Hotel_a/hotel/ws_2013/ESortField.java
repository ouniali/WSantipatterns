
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eSortField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eSortField">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Price"/>
 *     &lt;enumeration value="Name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eSortField")
@XmlEnum
public enum ESortField {

    @XmlEnumValue("Price")
    PRICE("Price"),
    @XmlEnumValue("Name")
    NAME("Name");
    private final String value;

    ESortField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ESortField fromValue(String v) {
        for (ESortField c: ESortField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
