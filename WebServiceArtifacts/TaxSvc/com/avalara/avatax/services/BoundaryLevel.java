
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoundaryLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BoundaryLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Address"/>
 *     &lt;enumeration value="Zip9"/>
 *     &lt;enumeration value="Zip5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BoundaryLevel")
@XmlEnum
public enum BoundaryLevel {

    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("Zip9")
    ZIP_9("Zip9"),
    @XmlEnumValue("Zip5")
    ZIP_5("Zip5");
    private final String value;

    BoundaryLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoundaryLevel fromValue(String v) {
        for (BoundaryLevel c: BoundaryLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
