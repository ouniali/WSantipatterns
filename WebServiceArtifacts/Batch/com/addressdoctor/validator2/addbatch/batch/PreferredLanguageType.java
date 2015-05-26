
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferredLanguageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreferredLanguageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PFL_DATABASE"/>
 *     &lt;enumeration value="PFL_LATIN_SCRIPT"/>
 *     &lt;enumeration value="PFL_PREFERRED_BY_POSTAL_ADMIN"/>
 *     &lt;enumeration value="PFL_PRIMARY"/>
 *     &lt;enumeration value="PFL_SECONDARY"/>
 *     &lt;enumeration value="PFL_LANG_EN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreferredLanguageType")
@XmlEnum
public enum PreferredLanguageType {

    PFL_DATABASE,
    PFL_LATIN_SCRIPT,
    PFL_PREFERRED_BY_POSTAL_ADMIN,
    PFL_PRIMARY,
    PFL_SECONDARY,
    PFL_LANG_EN;

    public String value() {
        return name();
    }

    public static PreferredLanguageType fromValue(String v) {
        return valueOf(v);
    }

}
