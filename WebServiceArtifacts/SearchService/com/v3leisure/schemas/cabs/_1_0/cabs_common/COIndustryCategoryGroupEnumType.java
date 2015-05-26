
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO_IndustryCategoryGroupEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CO_IndustryCategoryGroupEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accommodation"/>
 *     &lt;enumeration value="Activities"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CO_IndustryCategoryGroupEnumType")
@XmlEnum
public enum COIndustryCategoryGroupEnumType {

    @XmlEnumValue("Accommodation")
    ACCOMMODATION("Accommodation"),
    @XmlEnumValue("Activities")
    ACTIVITIES("Activities");
    private final String value;

    COIndustryCategoryGroupEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COIndustryCategoryGroupEnumType fromValue(String v) {
        for (COIndustryCategoryGroupEnumType c: COIndustryCategoryGroupEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
