
package com.exactor.ns_impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NexusFound"/>
 *     &lt;enumeration value="NexusNotFound"/>
 *     &lt;enumeration value="ExemptionApplied"/>
 *     &lt;enumeration value="NoSalesTax"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxStatusType")
@XmlEnum
public enum TaxStatusType {

    @XmlEnumValue("NexusFound")
    NEXUS_FOUND("NexusFound"),
    @XmlEnumValue("NexusNotFound")
    NEXUS_NOT_FOUND("NexusNotFound"),
    @XmlEnumValue("ExemptionApplied")
    EXEMPTION_APPLIED("ExemptionApplied"),
    @XmlEnumValue("NoSalesTax")
    NO_SALES_TAX("NoSalesTax");
    private final String value;

    TaxStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxStatusType fromValue(String v) {
        for (TaxStatusType c: TaxStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
