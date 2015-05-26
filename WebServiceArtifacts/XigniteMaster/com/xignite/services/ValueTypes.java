
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Symbol"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="CUSIP"/>
 *     &lt;enumeration value="CIK"/>
 *     &lt;enumeration value="Class"/>
 *     &lt;enumeration value="Valoren"/>
 *     &lt;enumeration value="SEDOL"/>
 *     &lt;enumeration value="Sector"/>
 *     &lt;enumeration value="Industry"/>
 *     &lt;enumeration value="ISIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValueTypes")
@XmlEnum
public enum ValueTypes {

    @XmlEnumValue("Symbol")
    SYMBOL("Symbol"),
    @XmlEnumValue("Name")
    NAME("Name"),
    CUSIP("CUSIP"),
    CIK("CIK"),
    @XmlEnumValue("Class")
    CLASS("Class"),
    @XmlEnumValue("Valoren")
    VALOREN("Valoren"),
    SEDOL("SEDOL"),
    @XmlEnumValue("Sector")
    SECTOR("Sector"),
    @XmlEnumValue("Industry")
    INDUSTRY("Industry"),
    ISIN("ISIN");
    private final String value;

    ValueTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueTypes fromValue(String v) {
        for (ValueTypes c: ValueTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
