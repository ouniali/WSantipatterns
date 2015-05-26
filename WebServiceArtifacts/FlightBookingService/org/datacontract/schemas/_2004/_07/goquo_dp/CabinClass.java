
package org.datacontract.schemas._2004._07.goquo_dp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CabinClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Economy"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="PremiumEconomy"/>
 *     &lt;enumeration value="Promo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CabinClass")
@XmlEnum
public enum CabinClass {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("PremiumEconomy")
    PREMIUM_ECONOMY("PremiumEconomy"),
    @XmlEnumValue("Promo")
    PROMO("Promo");
    private final String value;

    CabinClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CabinClass fromValue(String v) {
        for (CabinClass c: CabinClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
