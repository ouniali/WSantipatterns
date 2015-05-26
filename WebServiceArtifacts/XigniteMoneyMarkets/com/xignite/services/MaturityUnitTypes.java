
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaturityUnitTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaturityUnitTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="Day"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaturityUnitTypes")
@XmlEnum
public enum MaturityUnitTypes {

    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("Day")
    DAY("Day");
    private final String value;

    MaturityUnitTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaturityUnitTypes fromValue(String v) {
        for (MaturityUnitTypes c: MaturityUnitTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
