
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAlliance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAlliance">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StarAlliance"/>
 *     &lt;enumeration value="OneWorld"/>
 *     &lt;enumeration value="KLMNorthwestAlliance"/>
 *     &lt;enumeration value="SkyTeam"/>
 *     &lt;enumeration value="OWCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeAlliance")
@XmlEnum
public enum TypeAlliance {

    @XmlEnumValue("StarAlliance")
    STAR_ALLIANCE("StarAlliance"),
    @XmlEnumValue("OneWorld")
    ONE_WORLD("OneWorld"),
    @XmlEnumValue("KLMNorthwestAlliance")
    KLM_NORTHWEST_ALLIANCE("KLMNorthwestAlliance"),
    @XmlEnumValue("SkyTeam")
    SKY_TEAM("SkyTeam"),
    @XmlEnumValue("OWCode")
    OW_CODE("OWCode");
    private final String value;

    TypeAlliance(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAlliance fromValue(String v) {
        for (TypeAlliance c: TypeAlliance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
