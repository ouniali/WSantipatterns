
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVarianceIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeVarianceIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Early"/>
 *     &lt;enumeration value="Late"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeVarianceIndicator")
@XmlEnum
public enum TypeVarianceIndicator {

    @XmlEnumValue("Early")
    EARLY("Early"),
    @XmlEnumValue("Late")
    LATE("Late");
    private final String value;

    TypeVarianceIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeVarianceIndicator fromValue(String v) {
        for (TypeVarianceIndicator c: TypeVarianceIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
