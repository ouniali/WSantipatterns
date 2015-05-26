
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxOverrideType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxOverrideType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="TaxAmount"/>
 *     &lt;enumeration value="Exemption"/>
 *     &lt;enumeration value="TaxDate"/>
 *     &lt;enumeration value="AccruedTaxAmount"/>
 *     &lt;enumeration value="DeriveTaxable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxOverrideType")
@XmlEnum
public enum TaxOverrideType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("TaxAmount")
    TAX_AMOUNT("TaxAmount"),
    @XmlEnumValue("Exemption")
    EXEMPTION("Exemption"),
    @XmlEnumValue("TaxDate")
    TAX_DATE("TaxDate"),
    @XmlEnumValue("AccruedTaxAmount")
    ACCRUED_TAX_AMOUNT("AccruedTaxAmount"),
    @XmlEnumValue("DeriveTaxable")
    DERIVE_TAXABLE("DeriveTaxable");
    private final String value;

    TaxOverrideType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxOverrideType fromValue(String v) {
        for (TaxOverrideType c: TaxOverrideType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
