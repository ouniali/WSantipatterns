
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForwardTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForwardTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Overnight"/>
 *     &lt;enumeration value="TomorrowNext"/>
 *     &lt;enumeration value="SpotNext"/>
 *     &lt;enumeration value="OneWeek"/>
 *     &lt;enumeration value="TwoWeek"/>
 *     &lt;enumeration value="ThreeWeek"/>
 *     &lt;enumeration value="OneMonth"/>
 *     &lt;enumeration value="TwoMonth"/>
 *     &lt;enumeration value="ThreeMonth"/>
 *     &lt;enumeration value="FourMonth"/>
 *     &lt;enumeration value="FiveMonth"/>
 *     &lt;enumeration value="SixMonth"/>
 *     &lt;enumeration value="SevenMonth"/>
 *     &lt;enumeration value="EightMonth"/>
 *     &lt;enumeration value="NineMonth"/>
 *     &lt;enumeration value="TenMonth"/>
 *     &lt;enumeration value="ElevenMonth"/>
 *     &lt;enumeration value="OneYear"/>
 *     &lt;enumeration value="TwoYear"/>
 *     &lt;enumeration value="ThreeYear"/>
 *     &lt;enumeration value="FourYear"/>
 *     &lt;enumeration value="FiveYear"/>
 *     &lt;enumeration value="SixYear"/>
 *     &lt;enumeration value="SevenYear"/>
 *     &lt;enumeration value="TenYear"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForwardTypes")
@XmlEnum
public enum ForwardTypes {

    @XmlEnumValue("Overnight")
    OVERNIGHT("Overnight"),
    @XmlEnumValue("TomorrowNext")
    TOMORROW_NEXT("TomorrowNext"),
    @XmlEnumValue("SpotNext")
    SPOT_NEXT("SpotNext"),
    @XmlEnumValue("OneWeek")
    ONE_WEEK("OneWeek"),
    @XmlEnumValue("TwoWeek")
    TWO_WEEK("TwoWeek"),
    @XmlEnumValue("ThreeWeek")
    THREE_WEEK("ThreeWeek"),
    @XmlEnumValue("OneMonth")
    ONE_MONTH("OneMonth"),
    @XmlEnumValue("TwoMonth")
    TWO_MONTH("TwoMonth"),
    @XmlEnumValue("ThreeMonth")
    THREE_MONTH("ThreeMonth"),
    @XmlEnumValue("FourMonth")
    FOUR_MONTH("FourMonth"),
    @XmlEnumValue("FiveMonth")
    FIVE_MONTH("FiveMonth"),
    @XmlEnumValue("SixMonth")
    SIX_MONTH("SixMonth"),
    @XmlEnumValue("SevenMonth")
    SEVEN_MONTH("SevenMonth"),
    @XmlEnumValue("EightMonth")
    EIGHT_MONTH("EightMonth"),
    @XmlEnumValue("NineMonth")
    NINE_MONTH("NineMonth"),
    @XmlEnumValue("TenMonth")
    TEN_MONTH("TenMonth"),
    @XmlEnumValue("ElevenMonth")
    ELEVEN_MONTH("ElevenMonth"),
    @XmlEnumValue("OneYear")
    ONE_YEAR("OneYear"),
    @XmlEnumValue("TwoYear")
    TWO_YEAR("TwoYear"),
    @XmlEnumValue("ThreeYear")
    THREE_YEAR("ThreeYear"),
    @XmlEnumValue("FourYear")
    FOUR_YEAR("FourYear"),
    @XmlEnumValue("FiveYear")
    FIVE_YEAR("FiveYear"),
    @XmlEnumValue("SixYear")
    SIX_YEAR("SixYear"),
    @XmlEnumValue("SevenYear")
    SEVEN_YEAR("SevenYear"),
    @XmlEnumValue("TenYear")
    TEN_YEAR("TenYear");
    private final String value;

    ForwardTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForwardTypes fromValue(String v) {
        for (ForwardTypes c: ForwardTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
