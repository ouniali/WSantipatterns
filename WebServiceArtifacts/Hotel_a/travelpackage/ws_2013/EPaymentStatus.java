
package travelpackage.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ePaymentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ePaymentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotPayed"/>
 *     &lt;enumeration value="Payed"/>
 *     &lt;enumeration value="PartiallyPayed"/>
 *     &lt;enumeration value="ConciliationPending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ePaymentStatus")
@XmlEnum
public enum EPaymentStatus {

    @XmlEnumValue("NotPayed")
    NOT_PAYED("NotPayed"),
    @XmlEnumValue("Payed")
    PAYED("Payed"),
    @XmlEnumValue("PartiallyPayed")
    PARTIALLY_PAYED("PartiallyPayed"),
    @XmlEnumValue("ConciliationPending")
    CONCILIATION_PENDING("ConciliationPending");
    private final String value;

    EPaymentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPaymentStatus fromValue(String v) {
        for (EPaymentStatus c: EPaymentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
