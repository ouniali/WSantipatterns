
package https.ivrs_elections_il_gov.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoterTransactionQueueTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoterTransactionQueueTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANCEL"/>
 *     &lt;enumeration value="REINSTATE"/>
 *     &lt;enumeration value="NotSupported"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VoterTransactionQueueTypes")
@XmlEnum
public enum VoterTransactionQueueTypes {

    CANCEL("CANCEL"),
    REINSTATE("REINSTATE"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported");
    private final String value;

    VoterTransactionQueueTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoterTransactionQueueTypes fromValue(String v) {
        for (VoterTransactionQueueTypes c: VoterTransactionQueueTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
