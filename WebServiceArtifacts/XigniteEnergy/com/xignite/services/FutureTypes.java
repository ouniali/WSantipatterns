
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FutureTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FutureTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Future"/>
 *     &lt;enumeration value="Swap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FutureTypes")
@XmlEnum
public enum FutureTypes {

    @XmlEnumValue("Future")
    FUTURE("Future"),
    @XmlEnumValue("Swap")
    SWAP("Swap");
    private final String value;

    FutureTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FutureTypes fromValue(String v) {
        for (FutureTypes c: FutureTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
