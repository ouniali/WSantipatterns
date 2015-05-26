
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List_BankAccountType_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_BankAccountType_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Checking"/>
 *     &lt;enumeration value="Investment"/>
 *     &lt;enumeration value="Savings"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_BankAccountType_Base")
@XmlEnum
public enum ListBankAccountTypeBase {

    @XmlEnumValue("Checking")
    CHECKING("Checking"),
    @XmlEnumValue("Investment")
    INVESTMENT("Investment"),
    @XmlEnumValue("Savings")
    SAVINGS("Savings"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListBankAccountTypeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListBankAccountTypeBase fromValue(String v) {
        for (ListBankAccountTypeBase c: ListBankAccountTypeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
