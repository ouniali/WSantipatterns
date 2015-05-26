
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OI_StatusEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OI_StatusEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="In"/>
 *     &lt;enumeration value="Out"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OI_StatusEnumType")
@XmlEnum
public enum OIStatusEnumType {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("In")
    IN("In"),
    @XmlEnumValue("Out")
    OUT("Out");
    private final String value;

    OIStatusEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OIStatusEnumType fromValue(String v) {
        for (OIStatusEnumType c: OIStatusEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
