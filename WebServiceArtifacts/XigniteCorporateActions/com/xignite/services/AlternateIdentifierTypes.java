
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternateIdentifierTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlternateIdentifierTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Symbol"/>
 *     &lt;enumeration value="CUSIP"/>
 *     &lt;enumeration value="CIK"/>
 *     &lt;enumeration value="Valoren"/>
 *     &lt;enumeration value="SEDOL"/>
 *     &lt;enumeration value="DataSourceIdentifier"/>
 *     &lt;enumeration value="ISIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlternateIdentifierTypes")
@XmlEnum
public enum AlternateIdentifierTypes {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Symbol")
    SYMBOL("Symbol"),
    CUSIP("CUSIP"),
    CIK("CIK"),
    @XmlEnumValue("Valoren")
    VALOREN("Valoren"),
    SEDOL("SEDOL"),
    @XmlEnumValue("DataSourceIdentifier")
    DATA_SOURCE_IDENTIFIER("DataSourceIdentifier"),
    ISIN("ISIN");
    private final String value;

    AlternateIdentifierTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlternateIdentifierTypes fromValue(String v) {
        for (AlternateIdentifierTypes c: AlternateIdentifierTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
