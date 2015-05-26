
package amendablepolicy.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eTypeCancellation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eTypeCancellation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANCEL_PER_BOOKING"/>
 *     &lt;enumeration value="CANCEL_PER_SERVICE"/>
 *     &lt;enumeration value="NOT_DEFINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eTypeCancellation")
@XmlEnum
public enum ETypeCancellation {

    CANCEL_PER_BOOKING,
    CANCEL_PER_SERVICE,
    NOT_DEFINED;

    public String value() {
        return name();
    }

    public static ETypeCancellation fromValue(String v) {
        return valueOf(v);
    }

}
