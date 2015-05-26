
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeInvoiceRecordCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeInvoiceRecordCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="Void"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="Manual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeInvoiceRecordCategory")
@XmlEnum
public enum TypeInvoiceRecordCategory {

    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Void")
    VOID("Void"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Manual")
    MANUAL("Manual");
    private final String value;

    TypeInvoiceRecordCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeInvoiceRecordCategory fromValue(String v) {
        for (TypeInvoiceRecordCategory c: TypeInvoiceRecordCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
