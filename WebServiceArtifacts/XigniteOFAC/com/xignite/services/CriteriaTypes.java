
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriteriaTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriteriaTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="Program"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CriteriaTypes")
@XmlEnum
public enum CriteriaTypes {

    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Program")
    PROGRAM("Program");
    private final String value;

    CriteriaTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CriteriaTypes fromValue(String v) {
        for (CriteriaTypes c: CriteriaTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
