
package https.ivrs_elections_il_gov.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefuseTransactionReasons.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefuseTransactionReasons">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InvalidLocalID"/>
 *     &lt;enumeration value="SystemError"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="NotSupported"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefuseTransactionReasons")
@XmlEnum
public enum RefuseTransactionReasons {

    @XmlEnumValue("InvalidLocalID")
    INVALID_LOCAL_ID("InvalidLocalID"),
    @XmlEnumValue("SystemError")
    SYSTEM_ERROR("SystemError"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported");
    private final String value;

    RefuseTransactionReasons(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefuseTransactionReasons fromValue(String v) {
        for (RefuseTransactionReasons c: RefuseTransactionReasons.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
