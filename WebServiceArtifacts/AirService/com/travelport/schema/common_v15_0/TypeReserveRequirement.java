
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeReserveRequirement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeReserveRequirement">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="20"/>
 *     &lt;enumeration value="Deposit"/>
 *     &lt;enumeration value="Guarantee"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeReserveRequirement")
@XmlEnum
public enum TypeReserveRequirement {

    @XmlEnumValue("Deposit")
    DEPOSIT("Deposit"),
    @XmlEnumValue("Guarantee")
    GUARANTEE("Guarantee"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeReserveRequirement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeReserveRequirement fromValue(String v) {
        for (TypeReserveRequirement c: TypeReserveRequirement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
