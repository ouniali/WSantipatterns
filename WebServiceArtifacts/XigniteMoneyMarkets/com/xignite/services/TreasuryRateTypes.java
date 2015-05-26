
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TreasuryRateTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TreasuryRateTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OneMonth"/>
 *     &lt;enumeration value="ThreeMonth"/>
 *     &lt;enumeration value="SixMonth"/>
 *     &lt;enumeration value="OneYear"/>
 *     &lt;enumeration value="TwoYear"/>
 *     &lt;enumeration value="ThreeYear"/>
 *     &lt;enumeration value="FiveYear"/>
 *     &lt;enumeration value="SevenYear"/>
 *     &lt;enumeration value="TenYear"/>
 *     &lt;enumeration value="TwentyYear"/>
 *     &lt;enumeration value="ThirtyYear"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TreasuryRateTypes")
@XmlEnum
public enum TreasuryRateTypes {

    @XmlEnumValue("OneMonth")
    ONE_MONTH("OneMonth"),
    @XmlEnumValue("ThreeMonth")
    THREE_MONTH("ThreeMonth"),
    @XmlEnumValue("SixMonth")
    SIX_MONTH("SixMonth"),
    @XmlEnumValue("OneYear")
    ONE_YEAR("OneYear"),
    @XmlEnumValue("TwoYear")
    TWO_YEAR("TwoYear"),
    @XmlEnumValue("ThreeYear")
    THREE_YEAR("ThreeYear"),
    @XmlEnumValue("FiveYear")
    FIVE_YEAR("FiveYear"),
    @XmlEnumValue("SevenYear")
    SEVEN_YEAR("SevenYear"),
    @XmlEnumValue("TenYear")
    TEN_YEAR("TenYear"),
    @XmlEnumValue("TwentyYear")
    TWENTY_YEAR("TwentyYear"),
    @XmlEnumValue("ThirtyYear")
    THIRTY_YEAR("ThirtyYear");
    private final String value;

    TreasuryRateTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TreasuryRateTypes fromValue(String v) {
        for (TreasuryRateTypes c: TreasuryRateTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
