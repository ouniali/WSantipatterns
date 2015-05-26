
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhonePrice.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhonePrice">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Room"/>
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="Extras"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhonePrice")
@XmlEnum
public enum PhonePrice {

    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("Extras")
    EXTRAS("Extras");
    private final String value;

    PhonePrice(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhonePrice fromValue(String v) {
        for (PhonePrice c: PhonePrice.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
