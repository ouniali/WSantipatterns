
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndexComponentWeightTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndexComponentWeightTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="MarketCapitalizationWeighted"/>
 *     &lt;enumeration value="EqualWeighted"/>
 *     &lt;enumeration value="PriceWeighted"/>
 *     &lt;enumeration value="MarketCapitalizationWeightedWithLimits"/>
 *     &lt;enumeration value="OtherWeighting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndexComponentWeightTypes")
@XmlEnum
public enum IndexComponentWeightTypes {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("MarketCapitalizationWeighted")
    MARKET_CAPITALIZATION_WEIGHTED("MarketCapitalizationWeighted"),
    @XmlEnumValue("EqualWeighted")
    EQUAL_WEIGHTED("EqualWeighted"),
    @XmlEnumValue("PriceWeighted")
    PRICE_WEIGHTED("PriceWeighted"),
    @XmlEnumValue("MarketCapitalizationWeightedWithLimits")
    MARKET_CAPITALIZATION_WEIGHTED_WITH_LIMITS("MarketCapitalizationWeightedWithLimits"),
    @XmlEnumValue("OtherWeighting")
    OTHER_WEIGHTING("OtherWeighting");
    private final String value;

    IndexComponentWeightTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndexComponentWeightTypes fromValue(String v) {
        for (IndexComponentWeightTypes c: IndexComponentWeightTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
