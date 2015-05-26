
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="CreditLimit"/>
 *     &lt;enumeration value="Deposited"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentModeType")
@XmlEnum
public enum PaymentModeType {

    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("CreditLimit")
    CREDIT_LIMIT("CreditLimit"),
    @XmlEnumValue("Deposited")
    DEPOSITED("Deposited");
    private final String value;

    PaymentModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentModeType fromValue(String v) {
        for (PaymentModeType c: PaymentModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
