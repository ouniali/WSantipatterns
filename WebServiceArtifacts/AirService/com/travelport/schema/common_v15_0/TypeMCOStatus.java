
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeMCOStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeMCOStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Used"/>
 *     &lt;enumeration value="Refunded"/>
 *     &lt;enumeration value="Voided"/>
 *     &lt;enumeration value="Expired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeMCOStatus")
@XmlEnum
public enum TypeMCOStatus {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Used")
    USED("Used"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),
    @XmlEnumValue("Voided")
    VOIDED("Voided"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired");
    private final String value;

    TypeMCOStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeMCOStatus fromValue(String v) {
        for (TypeMCOStatus c: TypeMCOStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
