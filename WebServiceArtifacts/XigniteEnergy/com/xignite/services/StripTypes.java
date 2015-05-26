
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StripTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StripTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ThreeMonth"/>
 *     &lt;enumeration value="SixMonth"/>
 *     &lt;enumeration value="OneYear"/>
 *     &lt;enumeration value="EighteenMonth"/>
 *     &lt;enumeration value="TwoYear"/>
 *     &lt;enumeration value="ThreeYear"/>
 *     &lt;enumeration value="FourYear"/>
 *     &lt;enumeration value="FiveYear"/>
 *     &lt;enumeration value="TenYear"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StripTypes")
@XmlEnum
public enum StripTypes {

    @XmlEnumValue("ThreeMonth")
    THREE_MONTH("ThreeMonth"),
    @XmlEnumValue("SixMonth")
    SIX_MONTH("SixMonth"),
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
    @XmlEnumValue("TenYear")
    TEN_YEAR("TenYear");
    private final String value;

    StripTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StripTypes fromValue(String v) {
        for (StripTypes c: StripTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
