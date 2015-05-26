
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eAccomodationSearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eAccomodationSearchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Home"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eAccomodationSearchType")
@XmlEnum
public enum EAccomodationSearchType {

    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Home")
    HOME("Home");
    private final String value;

    EAccomodationSearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EAccomodationSearchType fromValue(String v) {
        for (EAccomodationSearchType c: EAccomodationSearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
