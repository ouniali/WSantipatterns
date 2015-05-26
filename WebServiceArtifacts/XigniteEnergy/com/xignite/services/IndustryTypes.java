
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndustryTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllEnergy"/>
 *     &lt;enumeration value="OilAndGas"/>
 *     &lt;enumeration value="MiningAndMetals"/>
 *     &lt;enumeration value="Chemicals"/>
 *     &lt;enumeration value="Discovery"/>
 *     &lt;enumeration value="Utilities"/>
 *     &lt;enumeration value="EnvironmentalServices"/>
 *     &lt;enumeration value="Agriculture"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndustryTypes")
@XmlEnum
public enum IndustryTypes {

    @XmlEnumValue("AllEnergy")
    ALL_ENERGY("AllEnergy"),
    @XmlEnumValue("OilAndGas")
    OIL_AND_GAS("OilAndGas"),
    @XmlEnumValue("MiningAndMetals")
    MINING_AND_METALS("MiningAndMetals"),
    @XmlEnumValue("Chemicals")
    CHEMICALS("Chemicals"),
    @XmlEnumValue("Discovery")
    DISCOVERY("Discovery"),
    @XmlEnumValue("Utilities")
    UTILITIES("Utilities"),
    @XmlEnumValue("EnvironmentalServices")
    ENVIRONMENTAL_SERVICES("EnvironmentalServices"),
    @XmlEnumValue("Agriculture")
    AGRICULTURE("Agriculture");
    private final String value;

    IndustryTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndustryTypes fromValue(String v) {
        for (IndustryTypes c: IndustryTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
