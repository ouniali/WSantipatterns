
package transfer.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eLocation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Airport"/>
 *     &lt;enumeration value="Accomodation"/>
 *     &lt;enumeration value="Port"/>
 *     &lt;enumeration value="Station"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eLocation")
@XmlEnum
public enum ELocation {

    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("Accomodation")
    ACCOMODATION("Accomodation"),
    @XmlEnumValue("Port")
    PORT("Port"),
    @XmlEnumValue("Station")
    STATION("Station"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ELocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ELocation fromValue(String v) {
        for (ELocation c: ELocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
