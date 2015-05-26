
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DetailLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Document"/>
 *     &lt;enumeration value="Summary"/>
 *     &lt;enumeration value="Line"/>
 *     &lt;enumeration value="Tax"/>
 *     &lt;enumeration value="Diagnostic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DetailLevel")
@XmlEnum
public enum DetailLevel {

    @XmlEnumValue("Document")
    DOCUMENT("Document"),
    @XmlEnumValue("Summary")
    SUMMARY("Summary"),
    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("Tax")
    TAX("Tax"),
    @XmlEnumValue("Diagnostic")
    DIAGNOSTIC("Diagnostic");
    private final String value;

    DetailLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetailLevel fromValue(String v) {
        for (DetailLevel c: DetailLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
