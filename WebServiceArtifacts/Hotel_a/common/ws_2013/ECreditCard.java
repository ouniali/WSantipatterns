
package common.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eCreditCard.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eCreditCard">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotDefined"/>
 *     &lt;enumeration value="Amex"/>
 *     &lt;enumeration value="Diners"/>
 *     &lt;enumeration value="Mastercard"/>
 *     &lt;enumeration value="Visa"/>
 *     &lt;enumeration value="Elo"/>
 *     &lt;enumeration value="Hipercard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eCreditCard")
@XmlEnum
public enum ECreditCard {

    @XmlEnumValue("NotDefined")
    NOT_DEFINED("NotDefined"),
    @XmlEnumValue("Amex")
    AMEX("Amex"),
    @XmlEnumValue("Diners")
    DINERS("Diners"),
    @XmlEnumValue("Mastercard")
    MASTERCARD("Mastercard"),
    @XmlEnumValue("Visa")
    VISA("Visa"),
    @XmlEnumValue("Elo")
    ELO("Elo"),
    @XmlEnumValue("Hipercard")
    HIPERCARD("Hipercard");
    private final String value;

    ECreditCard(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECreditCard fromValue(String v) {
        for (ECreditCard c: ECreditCard.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
