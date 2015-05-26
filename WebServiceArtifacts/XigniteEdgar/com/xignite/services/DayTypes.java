
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Today"/>
 *     &lt;enumeration value="TMinus1"/>
 *     &lt;enumeration value="TMinus2"/>
 *     &lt;enumeration value="TMinus3"/>
 *     &lt;enumeration value="TMinus4"/>
 *     &lt;enumeration value="TMinus5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayTypes")
@XmlEnum
public enum DayTypes {

    @XmlEnumValue("Today")
    TODAY("Today"),
    @XmlEnumValue("TMinus1")
    T_MINUS_1("TMinus1"),
    @XmlEnumValue("TMinus2")
    T_MINUS_2("TMinus2"),
    @XmlEnumValue("TMinus3")
    T_MINUS_3("TMinus3"),
    @XmlEnumValue("TMinus4")
    T_MINUS_4("TMinus4"),
    @XmlEnumValue("TMinus5")
    T_MINUS_5("TMinus5");
    private final String value;

    DayTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayTypes fromValue(String v) {
        for (DayTypes c: DayTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
