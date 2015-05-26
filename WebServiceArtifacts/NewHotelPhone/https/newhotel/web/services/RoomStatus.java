
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoomStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dirty"/>
 *     &lt;enumeration value="Cleaning"/>
 *     &lt;enumeration value="Verify"/>
 *     &lt;enumeration value="Clean"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoomStatus")
@XmlEnum
public enum RoomStatus {

    @XmlEnumValue("Dirty")
    DIRTY("Dirty"),
    @XmlEnumValue("Cleaning")
    CLEANING("Cleaning"),
    @XmlEnumValue("Verify")
    VERIFY("Verify"),
    @XmlEnumValue("Clean")
    CLEAN("Clean");
    private final String value;

    RoomStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoomStatus fromValue(String v) {
        for (RoomStatus c: RoomStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
