
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Top10Matches"/>
 *     &lt;enumeration value="Top20Matches"/>
 *     &lt;enumeration value="Top40Matches"/>
 *     &lt;enumeration value="Top80Matches"/>
 *     &lt;enumeration value="Top160Matches"/>
 *     &lt;enumeration value="Top240Matches"/>
 *     &lt;enumeration value="Top360Matches"/>
 *     &lt;enumeration value="AllMatches"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OutputTypes")
@XmlEnum
public enum OutputTypes {

    @XmlEnumValue("Top10Matches")
    TOP_10_MATCHES("Top10Matches"),
    @XmlEnumValue("Top20Matches")
    TOP_20_MATCHES("Top20Matches"),
    @XmlEnumValue("Top40Matches")
    TOP_40_MATCHES("Top40Matches"),
    @XmlEnumValue("Top80Matches")
    TOP_80_MATCHES("Top80Matches"),
    @XmlEnumValue("Top160Matches")
    TOP_160_MATCHES("Top160Matches"),
    @XmlEnumValue("Top240Matches")
    TOP_240_MATCHES("Top240Matches"),
    @XmlEnumValue("Top360Matches")
    TOP_360_MATCHES("Top360Matches"),
    @XmlEnumValue("AllMatches")
    ALL_MATCHES("AllMatches");
    private final String value;

    OutputTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputTypes fromValue(String v) {
        for (OutputTypes c: OutputTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
