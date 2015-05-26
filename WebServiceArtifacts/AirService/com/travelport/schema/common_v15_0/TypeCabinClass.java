
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCabinClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCabinClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Economy"/>
 *     &lt;enumeration value="PremiumEconomy"/>
 *     &lt;enumeration value="PremiumFirst"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeCabinClass")
@XmlEnum
public enum TypeCabinClass {

    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy"),
    @XmlEnumValue("PremiumEconomy")
    PREMIUM_ECONOMY("PremiumEconomy"),
    @XmlEnumValue("PremiumFirst")
    PREMIUM_FIRST("PremiumFirst");
    private final String value;

    TypeCabinClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCabinClass fromValue(String v) {
        for (TypeCabinClass c: TypeCabinClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
