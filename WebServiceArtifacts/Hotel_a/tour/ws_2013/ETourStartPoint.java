
package tour.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eTourStartPoint.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eTourStartPoint">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SPECIFIC"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ANYONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eTourStartPoint")
@XmlEnum
public enum ETourStartPoint {

    SPECIFIC,
    NONE,
    ANYONE;

    public String value() {
        return name();
    }

    public static ETourStartPoint fromValue(String v) {
        return valueOf(v);
    }

}
