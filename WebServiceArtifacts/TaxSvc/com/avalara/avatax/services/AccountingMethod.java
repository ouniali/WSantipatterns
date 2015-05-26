
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accrual"/>
 *     &lt;enumeration value="Cash"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountingMethod")
@XmlEnum
public enum AccountingMethod {

    @XmlEnumValue("Accrual")
    ACCRUAL("Accrual"),
    @XmlEnumValue("Cash")
    CASH("Cash");
    private final String value;

    AccountingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountingMethod fromValue(String v) {
        for (AccountingMethod c: AccountingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
