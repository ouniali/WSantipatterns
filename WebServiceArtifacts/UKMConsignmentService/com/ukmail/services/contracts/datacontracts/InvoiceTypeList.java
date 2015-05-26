
package com.ukmail.services.contracts.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceTypeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ProForma"/>
 *     &lt;enumeration value="Commercial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoiceTypeList")
@XmlEnum
public enum InvoiceTypeList {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ProForma")
    PRO_FORMA("ProForma"),
    @XmlEnumValue("Commercial")
    COMMERCIAL("Commercial");
    private final String value;

    InvoiceTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceTypeList fromValue(String v) {
        for (InvoiceTypeList c: InvoiceTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
