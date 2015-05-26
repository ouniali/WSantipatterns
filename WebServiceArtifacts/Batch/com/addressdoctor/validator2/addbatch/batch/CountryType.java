
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ISO_2"/>
 *     &lt;enumeration value="ISO_3"/>
 *     &lt;enumeration value="ISO_NUMBER"/>
 *     &lt;enumeration value="ABBREVIATION"/>
 *     &lt;enumeration value="NAME_CN"/>
 *     &lt;enumeration value="NAME_DA"/>
 *     &lt;enumeration value="NAME_DE"/>
 *     &lt;enumeration value="NAME_EN"/>
 *     &lt;enumeration value="NAME_ES"/>
 *     &lt;enumeration value="NAME_FI"/>
 *     &lt;enumeration value="NAME_FR"/>
 *     &lt;enumeration value="NAME_GR"/>
 *     &lt;enumeration value="NAME_HU"/>
 *     &lt;enumeration value="NAME_IT"/>
 *     &lt;enumeration value="NAME_JP"/>
 *     &lt;enumeration value="NAME_KR"/>
 *     &lt;enumeration value="NAME_NL"/>
 *     &lt;enumeration value="NAME_PL"/>
 *     &lt;enumeration value="NAME_PT"/>
 *     &lt;enumeration value="NAME_RU"/>
 *     &lt;enumeration value="NAME_SA"/>
 *     &lt;enumeration value="NAME_SE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryType")
@XmlEnum
public enum CountryType {

    ISO_2,
    ISO_3,
    ISO_NUMBER,
    ABBREVIATION,
    NAME_CN,
    NAME_DA,
    NAME_DE,
    NAME_EN,
    NAME_ES,
    NAME_FI,
    NAME_FR,
    NAME_GR,
    NAME_HU,
    NAME_IT,
    NAME_JP,
    NAME_KR,
    NAME_NL,
    NAME_PL,
    NAME_PT,
    NAME_RU,
    NAME_SA,
    NAME_SE;

    public String value() {
        return name();
    }

    public static CountryType fromValue(String v) {
        return valueOf(v);
    }

}
