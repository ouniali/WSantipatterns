
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariationTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VariationTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="Up"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VariationTypes")
@XmlEnum
public enum VariationTypes {

    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("Up")
    UP("Up");
    private final String value;

    VariationTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VariationTypes fromValue(String v) {
        for (VariationTypes c: VariationTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
