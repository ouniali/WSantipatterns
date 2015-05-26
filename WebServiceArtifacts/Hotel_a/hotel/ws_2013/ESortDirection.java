
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eSortDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eSortDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASC"/>
 *     &lt;enumeration value="DESC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eSortDirection")
@XmlEnum
public enum ESortDirection {

    ASC,
    DESC;

    public String value() {
        return name();
    }

    public static ESortDirection fromValue(String v) {
        return valueOf(v);
    }

}
