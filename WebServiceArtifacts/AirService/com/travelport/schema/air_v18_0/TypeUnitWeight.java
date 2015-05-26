
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeUnitWeight.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeUnitWeight">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Kilograms"/>
 *     &lt;enumeration value="Pounds"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeUnitWeight")
@XmlEnum
public enum TypeUnitWeight {

    @XmlEnumValue("Kilograms")
    KILOGRAMS("Kilograms"),
    @XmlEnumValue("Pounds")
    POUNDS("Pounds");
    private final String value;

    TypeUnitWeight(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeUnitWeight fromValue(String v) {
        for (TypeUnitWeight c: TypeUnitWeight.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
