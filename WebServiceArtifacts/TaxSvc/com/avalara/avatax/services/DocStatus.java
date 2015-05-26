
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Temporary"/>
 *     &lt;enumeration value="Saved"/>
 *     &lt;enumeration value="Posted"/>
 *     &lt;enumeration value="Committed"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Adjusted"/>
 *     &lt;enumeration value="Any"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocStatus")
@XmlEnum
public enum DocStatus {

    @XmlEnumValue("Temporary")
    TEMPORARY("Temporary"),
    @XmlEnumValue("Saved")
    SAVED("Saved"),
    @XmlEnumValue("Posted")
    POSTED("Posted"),
    @XmlEnumValue("Committed")
    COMMITTED("Committed"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Adjusted")
    ADJUSTED("Adjusted"),
    @XmlEnumValue("Any")
    ANY("Any");
    private final String value;

    DocStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocStatus fromValue(String v) {
        for (DocStatus c: DocStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
