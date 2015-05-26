
package trainpass.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ePassengerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ePassengerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHILD"/>
 *     &lt;enumeration value="YOUTH"/>
 *     &lt;enumeration value="ADULT"/>
 *     &lt;enumeration value="SENIOR"/>
 *     &lt;enumeration value="PASSHOLDER"/>
 *     &lt;enumeration value="FREECHILD"/>
 *     &lt;enumeration value="STUDENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ePassengerType")
@XmlEnum
public enum EPassengerType {

    CHILD,
    YOUTH,
    ADULT,
    SENIOR,
    PASSHOLDER,
    FREECHILD,
    STUDENT;

    public String value() {
        return name();
    }

    public static EPassengerType fromValue(String v) {
        return valueOf(v);
    }

}
