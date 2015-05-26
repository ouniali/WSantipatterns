
package ro.bvb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityIdentification.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityIdentification">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Symbol"/>
 *     &lt;enumeration value="ISIN"/>
 *     &lt;enumeration value="FiscalCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecurityIdentification")
@XmlEnum
public enum SecurityIdentification {

    @XmlEnumValue("Symbol")
    SYMBOL("Symbol"),
    ISIN("ISIN"),
    @XmlEnumValue("FiscalCode")
    FISCAL_CODE("FiscalCode");
    private final String value;

    SecurityIdentification(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityIdentification fromValue(String v) {
        for (SecurityIdentification c: SecurityIdentification.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
