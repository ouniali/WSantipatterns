
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EPaymentsIntegrationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EPaymentsIntegrationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="AsAdvancedDeposit"/>
 *     &lt;enumeration value="AsInvoiceAdvancedDeposit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EPaymentsIntegrationType")
@XmlEnum
public enum EPaymentsIntegrationType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("AsAdvancedDeposit")
    AS_ADVANCED_DEPOSIT("AsAdvancedDeposit"),
    @XmlEnumValue("AsInvoiceAdvancedDeposit")
    AS_INVOICE_ADVANCED_DEPOSIT("AsInvoiceAdvancedDeposit");
    private final String value;

    EPaymentsIntegrationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPaymentsIntegrationType fromValue(String v) {
        for (EPaymentsIntegrationType c: EPaymentsIntegrationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
