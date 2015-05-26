
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwaptionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwaptionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
 *     &lt;enumeration value="EighteenMonth"/>
 *     &lt;enumeration value="TwoYear"/>
 *     &lt;enumeration value="ThreeYear"/>
 *     &lt;enumeration value="FourYear"/>
 *     &lt;enumeration value="FiveYear"/>
 *     &lt;enumeration value="SixYear"/>
 *     &lt;enumeration value="SevenYear"/>
 *     &lt;enumeration value="EightYear"/>
 *     &lt;enumeration value="NineYear"/>
 *     &lt;enumeration value="TenYear"/>
 *     &lt;enumeration value="TwelveYear"/>
 *     &lt;enumeration value="FifteenYear"/>
 *     &lt;enumeration value="TwentyYear"/>
 *     &lt;enumeration value="TwentyFiveYear"/>
 *     &lt;enumeration value="ThirtyYear"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SwaptionTypes")
@XmlEnum
public enum SwaptionTypes {

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
    @XmlEnumValue("EighteenMonth")
    EIGHTEEN_MONTH("EighteenMonth"),
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
    @XmlEnumValue("EightYear")
    EIGHT_YEAR("EightYear"),
    @XmlEnumValue("NineYear")
    NINE_YEAR("NineYear"),
    @XmlEnumValue("TenYear")
    TEN_YEAR("TenYear"),
    @XmlEnumValue("TwelveYear")
    TWELVE_YEAR("TwelveYear"),
    @XmlEnumValue("FifteenYear")
    FIFTEEN_YEAR("FifteenYear"),
    @XmlEnumValue("TwentyYear")
    TWENTY_YEAR("TwentyYear"),
    @XmlEnumValue("TwentyFiveYear")
    TWENTY_FIVE_YEAR("TwentyFiveYear"),
    @XmlEnumValue("ThirtyYear")
    THIRTY_YEAR("ThirtyYear");
    private final String value;

    SwaptionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwaptionTypes fromValue(String v) {
        for (SwaptionTypes c: SwaptionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
