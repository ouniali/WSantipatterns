
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIBORTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LIBORTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OneMonth"/>
 *     &lt;enumeration value="TwoMonths"/>
 *     &lt;enumeration value="ThreeMonths"/>
 *     &lt;enumeration value="FourMonths"/>
 *     &lt;enumeration value="FiveMonths"/>
 *     &lt;enumeration value="SixMonths"/>
 *     &lt;enumeration value="SevenMonths"/>
 *     &lt;enumeration value="EightMonths"/>
 *     &lt;enumeration value="NineMonths"/>
 *     &lt;enumeration value="TenMonths"/>
 *     &lt;enumeration value="ElevenMonths"/>
 *     &lt;enumeration value="OneYear"/>
 *     &lt;enumeration value="OneWeek"/>
 *     &lt;enumeration value="TwoWeeks"/>
 *     &lt;enumeration value="Overnite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LIBORTypes")
@XmlEnum
public enum LIBORTypes {

    @XmlEnumValue("OneMonth")
    ONE_MONTH("OneMonth"),
    @XmlEnumValue("TwoMonths")
    TWO_MONTHS("TwoMonths"),
    @XmlEnumValue("ThreeMonths")
    THREE_MONTHS("ThreeMonths"),
    @XmlEnumValue("FourMonths")
    FOUR_MONTHS("FourMonths"),
    @XmlEnumValue("FiveMonths")
    FIVE_MONTHS("FiveMonths"),
    @XmlEnumValue("SixMonths")
    SIX_MONTHS("SixMonths"),
    @XmlEnumValue("SevenMonths")
    SEVEN_MONTHS("SevenMonths"),
    @XmlEnumValue("EightMonths")
    EIGHT_MONTHS("EightMonths"),
    @XmlEnumValue("NineMonths")
    NINE_MONTHS("NineMonths"),
    @XmlEnumValue("TenMonths")
    TEN_MONTHS("TenMonths"),
    @XmlEnumValue("ElevenMonths")
    ELEVEN_MONTHS("ElevenMonths"),
    @XmlEnumValue("OneYear")
    ONE_YEAR("OneYear"),
    @XmlEnumValue("OneWeek")
    ONE_WEEK("OneWeek"),
    @XmlEnumValue("TwoWeeks")
    TWO_WEEKS("TwoWeeks"),
    @XmlEnumValue("Overnite")
    OVERNITE("Overnite");
    private final String value;

    LIBORTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LIBORTypes fromValue(String v) {
        for (LIBORTypes c: LIBORTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
