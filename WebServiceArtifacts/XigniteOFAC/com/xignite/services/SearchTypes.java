
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Contains"/>
 *     &lt;enumeration value="ExactMatch"/>
 *     &lt;enumeration value="SoundsLike"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchTypes")
@XmlEnum
public enum SearchTypes {

    @XmlEnumValue("Contains")
    CONTAINS("Contains"),
    @XmlEnumValue("ExactMatch")
    EXACT_MATCH("ExactMatch"),
    @XmlEnumValue("SoundsLike")
    SOUNDS_LIKE("SoundsLike");
    private final String value;

    SearchTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchTypes fromValue(String v) {
        for (SearchTypes c: SearchTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
